package ai.swagger.client.model;

import java.util.List;

public class AiFilterRequest {
    private String text;
    private List<String> wordsToFilter;

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    public List<String> getWordsToFilter() { return wordsToFilter; }
    public void setWordsToFilter(List<String> wordsToFilter) { this.wordsToFilter = wordsToFilter; }

}
