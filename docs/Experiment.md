
# Experiment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channel** | **String** |  |  [optional]
**customAttributes** | **Object** |  |  [optional]
**endDate** | **String** |  |  [optional]
**endDateUi** | **String** |  |  [optional]
**experimentId** | **Long** |  |  [optional]
**experimentName** | **String** |  |  [optional]
**messages** | [**List&lt;ExperimentMessage&gt;**](ExperimentMessage.md) |  |  [optional]
**segmentId** | **Long** |  |  [optional]
**segmentName** | **String** |  |  [optional]
**startDate** | **String** |  |  [optional]
**startDateUi** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**strategy** | [**StrategyEnum**](#StrategyEnum) |  |  [optional]
**targetUsers** | **Integer** |  |  [optional]
**timezoneUi** | **String** |  |  [optional]
**totalRequests** | **Long** |  |  [optional]
**userExpectedTargetGroupSize** | **Long** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
DRAFT | &quot;DRAFT&quot;
READY | &quot;READY&quot;
STARTED | &quot;STARTED&quot;
CANCELLED | &quot;CANCELLED&quot;
COMPLETED | &quot;COMPLETED&quot;


<a name="StrategyEnum"></a>
## Enum: StrategyEnum
Name | Value
---- | -----
SINGLE_ITERATION_RANDOM_MSG | &quot;SINGLE_ITERATION_RANDOM_MSG&quot;
GENETIC_ALGORITHM_V0 | &quot;GENETIC_ALGORITHM_V0&quot;
BEST_MESSAGES_ROUNDS_GA | &quot;BEST_MESSAGES_ROUNDS_GA&quot;



