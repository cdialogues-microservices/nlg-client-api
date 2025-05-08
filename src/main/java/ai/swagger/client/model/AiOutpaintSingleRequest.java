package ai.swagger.client.model;


public class AiOutpaintSingleRequest {
    private String imageUrl;
    private String type;  // e.g., landscape, square, portrait, vertical

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}