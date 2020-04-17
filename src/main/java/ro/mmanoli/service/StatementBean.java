package ro.mmanoli.service;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import ro.mmanoli.model.Statement;

import javax.ejb.Stateless;
import javax.ws.rs.InternalServerErrorException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;

@Stateless
public class StatementBean {
    public String generateHTML(Statement statement) {
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile("template/template.mustache");
        try {
            StringWriter writer = new StringWriter();
            mustache.execute(writer, statement).flush();
            return writer.toString();
        } catch (IOException e) {
            throw new InternalServerErrorException(e);
        }
    }

    public byte[] generatePDFFromHTML(String html) {
        try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
            PdfRendererBuilder builder = new PdfRendererBuilder();
            builder.useFastMode();
            builder.withHtmlContent(html, getClass().getResource("/template").toString());
            builder.toStream(os);
            builder.run();
            return os.toByteArray();
        } catch (Exception e) {
            throw new InternalServerErrorException(e);
        }

    }
}
