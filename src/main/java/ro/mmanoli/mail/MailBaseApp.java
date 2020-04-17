package ro.mmanoli.mail;

import javax.ws.rs.InternalServerErrorException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MailBaseApp {

    private static final String CONFIG_FILE = "/mail/config.properties";

    private final Properties properties = new Properties();


    public MailBaseApp() {
        super();
        this.loadProperties();
    }


    public String getProperty(String name, String defaultValue) {
        return this.properties.getProperty(name, defaultValue);
    }

    /**
     * Loads properties from config.properties.
     */
    private void loadProperties() {
        try (InputStream inputStream = this.getClass().getResourceAsStream(CONFIG_FILE)) {

            this.properties.load(inputStream);

        } catch (IOException e) {
            throw new InternalServerErrorException("Unable to locate configuration file \"" + CONFIG_FILE + "\". Make sure it is in your classpath.");
        }
    }

    public String getFromAddress() {
        String fromAddress = this.properties.getProperty("MAIL_FROM");

        if (fromAddress == null || fromAddress.isEmpty()) {
            throw new IllegalStateException("This sample requires you to fill in `MAIL_FROM` in config.properties.");
        }

        return fromAddress;
    }

}
