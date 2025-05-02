package ai.swagger.client.model;

public class AiEvaluateRequest {
    private String message;
    private AiEnhanceRequest.Persona persona;

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public AiEnhanceRequest.Persona getPersona() { return persona; }
    public void setPersona(AiEnhanceRequest.Persona persona) { this.persona = persona; }
}