package ai.swagger.client.model;

import java.util.List;
public class AiEnhanceRequest {
    public String text;
    public String criteria;
    public String emotionType;
    public Persona persona;

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    public String getCriteria() { return criteria; }
    public void setCriteria(String criteria) { this.criteria = criteria; }

    public String getEmotionType() { return emotionType; }
    public void setEmotionType(String emotionType) { this.emotionType = emotionType; }

    public Persona getPersona() { return persona; }
    public void setPersona(Persona persona) { this.persona = persona; }

    public static class Persona {
        private String name;
        private String age;
        private String gender;
        private String country;
        private String language;
        private String representedGroup;
        private List<String> painPoints;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getAge() { return age; }
        public void setAge(String age) { this.age = age; }

        public String getGender() { return gender; }
        public void setGender(String gender) { this.gender = gender; }

        public String getCountry() { return country; }
        public void setCountry(String country) { this.country = country; }

        public String getLanguage() { return language; }
        public void setLanguage(String language) { this.language = language; }

        public String getRepresentedGroup() { return representedGroup; }
        public void setRepresentedGroup(String representedGroup) { this.representedGroup = representedGroup; }

        public List<String> getPainPoints() { return painPoints; }
        public void setPainPoints(List<String> painPoints) { this.painPoints = painPoints; }
    }
}
