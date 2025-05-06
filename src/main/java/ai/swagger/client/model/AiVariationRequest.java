package ai.swagger.client.model;

public class AiVariationRequest {
    private String text;
    private int count;
    private String rules;
    private AiEnhanceRequest.Persona persona;
    private Integer numberOfCharacters;

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    public int getCount() { return count; }
    public void setCount(int count) { this.count = count; }

    public String getRules() { return rules; }
    public void setRules(String rules) { this.rules = rules; }

    public AiEnhanceRequest.Persona getPersona() { return persona; }
    public void setPersona(AiEnhanceRequest.Persona persona) { this.persona = persona; }

    public Integer getNumberOfCharacters() { return numberOfCharacters; }
    public void setNumberOfCharacters(Integer numberOfCharacters) { this.numberOfCharacters = numberOfCharacters; }
}