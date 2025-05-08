package ai.swagger.client.model;

    public class AiTranslateRequest {
        private String text;
        private String personaLanguage;

        public String getText() { return text; }
        public void setText(String text) { this.text = text; }

        public String getPersonaLanguage() { return personaLanguage; }
        public void setPersonaLanguage(String personaLanguage) { this.personaLanguage = personaLanguage; }
    }
