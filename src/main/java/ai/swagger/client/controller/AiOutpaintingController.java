package ai.swagger.client.controller;

import ai.swagger.client.services.AiOutpaintingService;

public class AiOutpaintingController {
    private final AiOutpaintingService service;

    public AiOutpaintingController(AiOutpaintingService service) {
        this.service = service;
    }

//    public void handleOutpaintAllFormats(String imageUrl) {
//        String result = service.outpaintAllFormats(imageUrl);
//        System.out.println("Outpaint All Formats Result:\n" + result);
//    }
//
//    public void handleOutpaintSingleFormat(String imageUrl, String type) {
//        String result = service.outpaintSingleFormat(imageUrl, type);
//        System.out.println("Outpaint Single Format Result:\n" + result);
//    }
//
//    public void handleCreatePrediction(String imageUrl, String type) {
//        String result = service.createPrediction(imageUrl, type);
//        System.out.println("Prediction Created:\n" + result);
//    }
}
