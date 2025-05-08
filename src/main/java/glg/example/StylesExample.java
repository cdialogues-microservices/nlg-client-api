package glg.example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.StylesconfigcontrollerApi;
import io.swagger.client.model.*;

import java.util.List;

public class StylesExample {
    public static StylesConfigDto createStyles(String token) {
        StylesconfigcontrollerApi apiInstance = new StylesconfigcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken(token);
        try {
            StylesConfigDto response = getStyles(token);
            StylesConfigDto stylesConfigDto = (StylesConfigDto) apiInstance.createUsingPOST1(response == null ? getStylesConfig() : response);
            System.out.println("Result created: " + stylesConfigDto);
            return stylesConfigDto;
        } catch (ApiException e) {
            System.err.println("Exception when calling StylesconfigcontrollerApi#createUsingPOST1");
            System.err.println("Error: " + e.getResponseBody());
            return null;
        }
    }

    public static StylesConfigDto getStyles(String token) {
        StylesconfigcontrollerApi apiInstance = new StylesconfigcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken(token);

        try {
            StylesConfigDto stylesConfigDto = apiInstance.getUsingGET();
            System.out.println("Result get: " + stylesConfigDto);
            return stylesConfigDto;
        } catch (ApiException e) {
            System.err.println("Exception when calling StylesconfigcontrollerApi#getStyles");
            System.err.println("Error: " + e.getResponseBody());
            return null;
        }
    }

    public static List<RichContent> formatStyles(String token, List<RichContent> richContents) {
        StylesconfigcontrollerApi apiInstance = new StylesconfigcontrollerApi();

        ApiClient apiClient = apiInstance.getApiClient();

        apiClient.setAccessToken(token);

        try {
            StylesTextDto response = apiInstance.formatUsingPOST(new StylesTextDto().richContents(richContents));

            System.out.println("Result format: " + response);
            return response.getRichContents();
        } catch (ApiException e) {
            System.err.println("Exception when calling StylesconfigcontrollerApi#formatStyles");
            System.err.println("Error: " + e.getResponseBody());
            return null;
        }
    }

    private static StylesConfigDto getStylesConfig() {
        PunctuationMarkConfigDto punctuationMarkConfigDto = new PunctuationMarkConfigDto()
                .marks(List.of(","));

        HyphenStylesConfigDto hyphenStylesConfigDto = new HyphenStylesConfigDto()
                .dashStyle(HyphenStylesConfigDto.DashStyleEnum.EM_DASH)
                .useCurlyApostrophes(true)
                .spaceBeforeEllipsis(true)
                .spaceAfterEllipsis(true)
                .capitalizeAfterEllipsis(true)
                .capitalizeAfterDash(true)
                .capitalizeAfterColon(true);

        StyleFormatConfigDto styleFormatConfigDto = new StyleFormatConfigDto()
                .frequency(0.5)
                .useBoldAsterisks(true)
                .useDoubleBrackets(true)
                .useSingleBrackets(true)
                .useAngleBrackets(true);

        CaseDistinctionConfigDto caseDistinctionConfigDto = new CaseDistinctionConfigDto()
                .frequency(0.5)
                .capitalizeFullVariants(true)
                .customCapitalWords(List.of("test"));

        FilteredOutConfigDto filteredOutConfigDto = new FilteredOutConfigDto()
                .items(List.of("test"));

        EmoticonConfigDto emoticonConfigDto = new EmoticonConfigDto()
                .frequency(0.5)
                .useAtBeginning(true)
                .useAtEnd(true)
                .useAtBothEnds(true);

        return new StylesConfigDto()
                .punctuationMarkConfig(punctuationMarkConfigDto)
                .hyphenStylesConfig(hyphenStylesConfigDto)
                .styleFormatConfig(styleFormatConfigDto)
                .caseDistinctionConfig(caseDistinctionConfigDto)
                .filteredOutConfig(filteredOutConfigDto)
                .emoticonConfig(emoticonConfigDto);
    }
}
