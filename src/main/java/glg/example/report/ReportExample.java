package glg.example.report;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.api.MessageclientcontrollerApi;
import io.swagger.client.api.ReportcontrollerApi;
import io.swagger.client.model.*;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ReportExample {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    // Reports grouped by various time dimensions (day, week, month, year)
    public void reportsByType(String token) throws ApiException {
        // Initialize the API client
        ReportcontrollerApi apiInstance = new ReportcontrollerApi();
        ApiClient apiClient = apiInstance.getApiClient();
        apiClient.setAccessToken(token);

        // Define a 2-day window: from 1 day before now to 1 day after now
        LocalDateTime now = LocalDateTime.now();
        String startDate = now.minusDays(1).format(formatter);
        String endDate = now.plusDays(1).format(formatter);

        try {
            // DAY_OF_WEEK report
            ReportingRecordDayOfWeekStats dayOfWeek = apiInstance
                    .getReportUsingGETWithHttpInfo(endDate, startDate, "DAY_OF_WEEK")
                    .getData();
            System.out.println("Report by DAY of week: " + dayOfWeek);

            // ALIGNED_WEEK_OF_YEAR report
            ReportingRecordDayOfWeekStats weekOfYear = apiInstance
                    .getReportUsingGETWithHttpInfo(endDate, startDate, "ALIGNED_WEEK_OF_YEAR")
                    .getData();
            System.out.println("Report by Week of year: " + weekOfYear);

            // MONTH_OF_YEAR report
            ReportingRecordDayOfWeekStats monthOfYear = apiInstance
                    .getReportUsingGETWithHttpInfo(endDate, startDate, "MONTH_OF_YEAR")
                    .getData();
            System.out.println("Report by Month of year: " + monthOfYear);

            // YEAR report
            ReportingRecordDayOfWeekStats year = apiInstance
                    .getReportUsingGETWithHttpInfo(endDate, startDate, "YEAR")
                    .getData();
            System.out.println("Report by Year: " + year);

        } catch (ApiException e) {
            System.err.println("Exception when calling ReportcontrollerApi#getReportUsingGETWithHttpInfo for grouped time reports");
            System.err.println("Error: " + e.getResponseBody());
            throw e;
        }
    }

    // Retrieves top 10 messages by experiment ID
    public List<ReportInfo> topNMessageByExperimentId(String token, Long experimentId) throws ApiException {
        ReportcontrollerApi apiInstance = new ReportcontrollerApi();
        ApiClient apiClient = apiInstance.getApiClient();
        apiClient.setAccessToken(token);

        try {
            List<ReportInfo> topMessages = apiInstance.getTopMessagesByExperimentIdUsingGET(experimentId, 10);
            topMessages.forEach(el -> System.out.println("Top Message: " + el));
            return topMessages;

        } catch (ApiException e) {
            System.err.println("Exception when calling ReportcontrollerApi#getTopMessagesByExperimentIdUsingGET");
            System.err.println("Error: " + e.getResponseBody());
            throw e;
        }
    }

    // Retrieves all messages by experiment ID
    public List<ReportInfo> getAllMessageByExperimentId(String token, Long experimentId) throws ApiException {
        ReportcontrollerApi apiInstance = new ReportcontrollerApi();
        ApiClient apiClient = apiInstance.getApiClient();
        apiClient.setAccessToken(token);

        try {
            List<ReportInfo> messages = apiInstance.getReportMessagesByExperimentIdUsingGET(experimentId);
            messages.forEach(el -> System.out.println("Message: " + el));
            return messages;

        } catch (ApiException e) {
            System.err.println("Exception when calling ReportcontrollerApi#getReportMessagesByExperimentIdUsingGET");
            System.err.println("Error: " + e.getResponseBody());
            throw e;
        }
    }

    // Retrieves top N segments for given period
    public List<GlobalMessageRecordTag> topSegments(String token) throws ApiException {
        ReportcontrollerApi apiInstance = new ReportcontrollerApi();
        ApiClient apiClient = apiInstance.getApiClient();
        apiClient.setAccessToken(token);

        try {
            // Create a ReportRequest object for segment analysis
            ReportRequest request = new ReportRequest();
            String startDate = LocalDateTime.now().minusDays(1).format(formatter);
            String endDate = LocalDateTime.now().plusDays(1).format(formatter);

            request.setStartDate(startDate);
            request.setEndDate(endDate);
            request.setType(ReportRequest.TypeEnum.SEGMENT);
            request.setLimit(10);

            // Call the top segments API
            List<GlobalMessageRecordTag> topSegments = apiInstance.getTopNSegmentUsingPOST(request);
            topSegments.forEach(
                    el -> System.out.println("Segment:" + el)
            );
            return topSegments;

        } catch (ApiException e) {
            System.err.println("Exception when calling ReportcontrollerApi#getTopNSegmentUsingPOST");
            System.err.println("Error: " + e.getResponseBody());
            throw e;
        }
    }


}

