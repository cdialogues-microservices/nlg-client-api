package ai.swagger.client.examples;

import ai.swagger.client.ConfigLoader;
import ai.swagger.client.controller.AiController;
import ai.swagger.client.services.AiService;
import io.swagger.client.ApiClient;

import java.util.List;

public class TestRunner {

    public static void main(String[] args) {
        ApiClient client = new ApiClient();
        client.setBasePath(ConfigLoader.get("api.base-url"));

        AiService textService = new AiService(client);
        AiController controller = new AiController(textService);
        System.out.println("=== Testing Enhance Text ===");
        controller.handleEnhanceText(
                "This is a test text.",
                "clarity",
                "positive",
                "John Doe", "30", "Male", "USA", "English", "general",
                List.of("confusing terms", "long sentences")
        );

        System.out.println("\n=== Testing Translate With Tone ===");
        controller.handleTranslateWithTone("Hello, how are you?", "French");

        System.out.println("\n=== Testing Generate Variations ===");
        controller.handleGenerateVariations(
                "Create ad variations.",
                3,
                "casual",
                "Jane Smith", "25", "Female", "Canada", "English", "youth",
                List.of("price sensitivity"), 100
        );

        System.out.println("\n=== Testing Evaluate Text ===");
        controller.handleEvaluateText(
                "Amazing product for all!",
                "Jane Smith", "25", "Female", "Canada", "English", "youth",
                List.of("price sensitivity")
        );

        System.out.println("\n=== Testing Filter Out Text ===");
        controller.handleFilterOutText(
                "This is a bad and ugly sentence.",
                List.of("bad", "ugly")
        );

        System.out.println("\n=== Testing Check Syntax ===");
        controller.handleCheckSyntax("She go to school every day.");

        System.out.println("\n=== Testing Evaluate Variations ===");
        controller.handleEvaluateVariations("Test slogan variations.");

        System.out.println("\n=== Testing Check Pre-Result ===");
        controller.handleCheckPreResult(
                "Great new product!",
                "English",
                "John Doe", "30", "Male", "USA", "English", "general",
                List.of("price", "availability")
        );

        System.out.println("\n=== Testing Enhance Prompt ===");
        controller.handleEnhancePrompt("Boost user engagement with this feature.");
    }
}
