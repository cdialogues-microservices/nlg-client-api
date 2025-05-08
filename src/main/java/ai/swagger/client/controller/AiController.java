package ai.swagger.client.controller;


import ai.swagger.client.services.AiService;
import ai.swagger.client.model.*;
import io.swagger.client.ApiException;
import java.util.List;

public class AiController {
    private final AiService service;

    public AiController(AiService service) {
        this.service = service;
    }

    public void handleEnhanceText(
            String text,
            String criteria,
            String emotionType,
            String personaName,
            String personaAge,
            String personaGender,
            String personaCountry,
            String personaLanguage,
            String personaGroup,
            List<String> painPoints
    ) {
        AiEnhanceRequest.Persona persona = new AiEnhanceRequest.Persona();
        persona.setName(personaName);
        persona.setAge(personaAge);
        persona.setGender(personaGender);
        persona.setCountry(personaCountry);
        persona.setLanguage(personaLanguage);
        persona.setRepresentedGroup(personaGroup);
        persona.setPainPoints(painPoints);

        AiEnhanceRequest request = new AiEnhanceRequest();
        request.setText(text);
        request.setCriteria(criteria);
        request.setEmotionType(emotionType);
        request.setPersona(persona);

        try {
            String result = service.enhanceText(request);
            System.out.println("Enhanced Text: " + result);
        } catch (ApiException e) {
            System.err.println("EnhanceText error: " + e.getMessage());
        }
    }

    public void handleTranslateWithTone(String text, String personaLanguage) {
        AiTranslateRequest request = new AiTranslateRequest();
        request.setText(text);
        request.setPersonaLanguage(personaLanguage);

        try {
            String result = service.translateWithTone(request);
            System.out.println("Translated Text: " + result);
        } catch (ApiException e) {
            System.err.println("TranslateWithTone error: " + e.getMessage());
        }
    }


    public void handleGenerateVariations(
            String text,
            int count,
            String rules,
            String personaName,
            String personaAge,
            String personaGender,
            String personaCountry,
            String personaLanguage,
            String personaGroup,
            List<String> painPoints,
            Integer numberOfCharacters
    ) {
        AiEnhanceRequest.Persona persona = new AiEnhanceRequest.Persona();
        persona.setName(personaName);
        persona.setAge(personaAge);
        persona.setGender(personaGender);
        persona.setCountry(personaCountry);
        persona.setLanguage(personaLanguage);
        persona.setRepresentedGroup(personaGroup);
        persona.setPainPoints(painPoints);

        AiVariationRequest request = new AiVariationRequest();
        request.setText(text);
        request.setCount(count);
        request.setRules(rules);
        request.setPersona(persona);
        request.setNumberOfCharacters(numberOfCharacters);

        try {
            List<String> variations = service.generateVariations(request);
            System.out.println("Generated Variations: " + variations);
        } catch (ApiException e) {
            System.err.println("GenerateVariations error: " + e.getMessage());
        }
    }


    public void handleEvaluateText(
            String message,
            String personaName,
            String personaAge,
            String personaGender,
            String personaCountry,
            String personaLanguage,
            String personaGroup,
            List<String> painPoints
    ) {
        AiEnhanceRequest.Persona persona = new AiEnhanceRequest.Persona();
        persona.setName(personaName);
        persona.setAge(personaAge);
        persona.setGender(personaGender);
        persona.setCountry(personaCountry);
        persona.setLanguage(personaLanguage);
        persona.setRepresentedGroup(personaGroup);
        persona.setPainPoints(painPoints);

        AiEvaluateRequest request = new AiEvaluateRequest();
        request.setMessage(message);
        request.setPersona(persona);

        try {
            int score = service.evaluateText(request);
            System.out.println("Evaluation Score: " + score);
        } catch (ApiException e) {
            System.err.println("EvaluateText error: " + e.getMessage());
        }
    }

    public void handleFilterOutText(String text, List<String> wordsToFilter) {
        AiFilterRequest request = new AiFilterRequest();
        request.setText(text);
        request.setWordsToFilter(wordsToFilter);

        try {
            String cleanedText = service.filterOutText(request);
            System.out.println("Filtered/Cleaned Text: " + cleanedText);
        } catch (ApiException e) {
            System.err.println("FilterOutText error: " + e.getMessage());
        }
    }

    public void handleCheckSyntax(String text) {
        AiSyntaxRequest request = new AiSyntaxRequest();
        request.setText(text);
        try {
            String corrected = service.checkSyntax(request);
            System.out.println("Corrected Text: " + corrected);
        } catch (ApiException e) {
            System.err.println("CheckSyntax error: " + e.getMessage());
        }
    }

    public void handleEvaluateVariations(String prompt) {
        AiEvaluateVariationsRequest request = new AiEvaluateVariationsRequest();
        request.setPrompt(prompt);
        try {
            String evaluation = service.evaluateVariations(request);
            System.out.println("Evaluation Results: " + evaluation);
        } catch (ApiException e) {
            System.err.println("EvaluateVariations error: " + e.getMessage());
        }
    }

    public void handleCheckPreResult(
            String text,
            String language,
            String personaName,
            String personaAge,
            String personaGender,
            String personaCountry,
            String personaLanguage,
            String personaGroup,
            List<String> painPoints
    ) {
        AiEnhanceRequest.Persona persona = new AiEnhanceRequest.Persona();
        persona.setName(personaName);
        persona.setAge(personaAge);
        persona.setGender(personaGender);
        persona.setCountry(personaCountry);
        persona.setLanguage(personaLanguage);
        persona.setRepresentedGroup(personaGroup);
        persona.setPainPoints(painPoints);

        AiPreResultRequest request = new AiPreResultRequest();
        request.setText(text);
        request.setLanguage(language);
        request.setPersona(persona);

        try {
            String feedback = service.checkPreResult(request);
            System.out.println("Pre-Result Feedback: " + feedback);
        } catch (ApiException e) {
            System.err.println("CheckPreResult error: " + e.getMessage());
        }
    }

    public void handleEnhancePrompt(String prompt) {
        AiEnhancePromptRequest request = new AiEnhancePromptRequest();
        request.setPrompt(prompt);
        try {
            String result = service.enhancePrompt(request);
            System.out.println("Enhanced Prompt: " + result);
        } catch (ApiException e) {
            System.err.println("EnhancePrompt error: " + e.getMessage());
        }
    }

}
