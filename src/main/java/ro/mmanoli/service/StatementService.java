package ro.mmanoli.service;

import ro.mmanoli.mail.MailSender;
import ro.mmanoli.model.Statement;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/statement")
@RequestScoped
public class StatementService {

    @EJB
    private StatementBean statementBean;

    @EJB
    private MailSender sender;

    @GET
    @Path("/")
    @Produces({MediaType.TEXT_PLAIN})
    public Response index() {
        return Response.status(200).header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD").entity("").build();
    }

    @POST
    @Path("/")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces("application/pdf")
    public Response addStatement(Statement statement) {

        System.out.println(String.format("*** Calling  addStatement with %s", statement));
        String html = statementBean.generateHTML(statement);

        byte[] pdf = statementBean.generatePDFFromHTML(html);
        // sender.sendEmail(pdf, statement.getRecipientEmail());
        Response.ResponseBuilder builder = Response.ok(pdf);
        builder.header("Content-Disposition", "attachment; filename=\"statement.pdf\"");
        return builder.build();
    }
}