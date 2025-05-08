package ai.swagger.client.model;

public class AiPreResultRequest {
    private String text;
    private String language;
    private AiEnhanceRequest.Persona persona;

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public AiEnhanceRequest.Persona getPersona() { return persona; }
    public void setPersona(AiEnhanceRequest.Persona persona) { this.persona = persona; }
}

