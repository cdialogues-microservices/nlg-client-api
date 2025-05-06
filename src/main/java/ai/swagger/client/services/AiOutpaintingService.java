package ai.swagger.client.services;

import ai.swagger.client.api.AifeaturesclientcontrollerApi;
import ai.swagger.client.model.AiOutpaintRequest;
import ai.swagger.client.model.AiOutpaintSingleRequest;
import ai.swagger.client.model.AiPredictionRequest;
import io.swagger.client.ApiException;

public class AiOutpaintingService {

    private final AifeaturesclientcontrollerApi api;

    public AiOutpaintingService(AifeaturesclientcontrollerApi api) {
        this.api = api;
    }

//    public String outpaintAllFormats(String imageUrl) {
//        try {
//            AiOutpaintRequest request = new AiOutpaintRequest();
//            request.setImageUrl(imageUrl);
//            return api.outpaintAllFormatsUsingPOST(request).getResultJson();
//        } catch (ApiException e) {
//            e.printStackTrace();
//            return "Error: " + e.getMessage();
//        }
//    }
//
//    public String outpaintSingleFormat(String imageUrl, String type) {
//        try {
//            AiOutpaintSingleRequest request = new AiOutpaintSingleRequest();
//            request.setImageUrl(imageUrl);
//            request.setType(type);
//            return api.outpaintSingleFormatUsingPOST(request).getResultJson();
//        } catch (ApiException e) {
//            e.printStackTrace();
//            return "Error: " + e.getMessage();
//        }
//    }
//
//    public String createPrediction(String imageUrl, String type) {
//        try {
//            AiPredictionRequest request = new AiPredictionRequest();
//            request.setImageUrl(imageUrl);
//            request.setType(type);
//            return api.createOutpaintPredictionUsingPOST(request).getPredictionUrl();
//        } catch (ApiException e) {
//            e.printStackTrace();
//            return "Error: " + e.getMessage();
//        }
//    }
}
