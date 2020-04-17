package ro.mmanoli.mail;

import javax.ejb.Stateless;

@Stateless
public class MailSender extends MailBaseApp {

    public void sendEmail(byte[] pdf, String recipient) {
        // Loads an email to send from the file system
        String fromAddress = getFromAddress();

        sendEmail(fromAddress, recipient, pdf);
    }

    private void sendEmail(String from, String recipient, byte[] pdf) {
//        Properties props = new Properties();
//        props.put("mail.smtp.auth", true);
//        props.put("mail.smtp.starttls.enable", true);
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");
//
//        Session session = Session.getInstance(props,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(username, password);
//                    }
//                });
//
//        try {
//
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress("from.mail.id@gmail.com"));
//            message.setRecipients(Message.RecipientType.TO,
//                    InternetAddress.parse("to.mail.id@gmail.com"));
//            message.setSubject("Testing Subject");
//            message.setText("PFA");
//
//            MimeBodyPart messageBodyPart = new MimeBodyPart();
//
//            Multipart multipart = new MimeMultipart();
//
//            messageBodyPart = new MimeBodyPart();
//            String file = "path of file to be attached";
//            String fileName = "attachmentName";
//            DataSource source = new FileDataSource(file);
//            messageBodyPart.setHeader("Content-Transfer-Encoding", "base64");
//            messageBodyPart.setDataHandler(new DataHandler(source));
//            messageBodyPart.setFileName(fileName);
//            multipart.addBodyPart(messageBodyPart);
//
//            message.setContent(multipart);
//
//            System.out.println("Sending");
//
//            Transport.send(message);
//
//            System.out.println("Done");
//
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }


//        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
//
//        contentAttributes.setSubject(String.format("Declaratie %s", date));
//        contentAttributes.setText(String.format("Declaratie de iesit din casa din data de %s", date));
//
//        // Add a text attachment
//        AttachmentAttributes attachment = new AttachmentAttributes();
//        attachment.setName(String.format("declaratie-%s.pdf", date));
//        attachment.setType("application/pdf; charset=UTF-8;");
//        // This is Base64 of the file contents
//        String encoded = Base64.getEncoder().encodeToString(pdf);
//        attachment.setData(encoded);

    }

}
