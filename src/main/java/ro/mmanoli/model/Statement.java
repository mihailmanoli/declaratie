package ro.mmanoli.model;

import javax.validation.constraints.Email;

public class Statement {
    private String fullName;
    private String birthDate;
    private String address;
    private String location;
    private String signatureDate;
    private String signature;
    private Configuration configuration;
    @Email
    private String recipientEmail;

    public Statement() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSignatureDate() {
        return signatureDate;
    }

    public void setSignatureDate(String signatureDate) {
        this.signatureDate = signatureDate;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    public static class Configuration {
        private boolean work;
        private boolean shopping;
        private boolean med;
        private boolean help;
        private boolean running;
        private boolean agricole;
        private boolean blood;
        private boolean voluntariat;
        private boolean market;
        private boolean goods;

        public Configuration() {
        }

        public boolean isWork() {
            return work;
        }

        public void setWork(boolean work) {
            this.work = work;
        }

        public boolean isShopping() {
            return shopping;
        }

        public void setShopping(boolean shopping) {
            this.shopping = shopping;
        }

        public boolean isMed() {
            return med;
        }

        public void setMed(boolean med) {
            this.med = med;
        }

        public boolean isHelp() {
            return help;
        }

        public void setHelp(boolean help) {
            this.help = help;
        }

        public boolean isRunning() {
            return running;
        }

        public void setRunning(boolean running) {
            this.running = running;
        }

        public boolean isAgricole() {
            return agricole;
        }

        public void setAgricole(boolean agricole) {
            this.agricole = agricole;
        }

        public boolean isBlood() {
            return blood;
        }

        public void setBlood(boolean blood) {
            this.blood = blood;
        }

        public boolean isVoluntariat() {
            return voluntariat;
        }

        public void setVoluntariat(boolean voluntariat) {
            this.voluntariat = voluntariat;
        }

        public boolean isMarket() {
            return market;
        }

        public void setMarket(boolean market) {
            this.market = market;
        }

        public boolean isGoods() {
            return goods;
        }

        public void setGoods(boolean goods) {
            this.goods = goods;
        }
    }
}
