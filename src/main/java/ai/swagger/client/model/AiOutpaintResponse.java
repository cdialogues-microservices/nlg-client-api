package ai.swagger.client.model;

import java.util.Map;

public class AiOutpaintResponse {
    private String message;
    private Map<String, OutputItem> outputs;  // For /outpaint-all
    private OutputItem output;               // For /outpaint-single

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public Map<String, OutputItem> getOutputs() { return outputs; }
    public void setOutputs(Map<String, OutputItem> outputs) { this.outputs = outputs; }

    public OutputItem getOutput() { return output; }
    public void setOutput(OutputItem output) { this.output = output; }

    public static class OutputItem {
        private String format;
        private int width;
        private int height;
        private String base64;

        public String getFormat() { return format; }
        public void setFormat(String format) { this.format = format; }

        public int getWidth() { return width; }
        public void setWidth(int width) { this.width = width; }

        public int getHeight() { return height; }
        public void setHeight(int height) { this.height = height; }

        public String getBase64() { return base64; }
        public void setBase64(String base64) { this.base64 = base64; }
    }
}