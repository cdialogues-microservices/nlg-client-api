
# Message

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateSubmitted** | **String** |  |  [optional]
**dateUpdated** | **String** |  |  [optional]
**messageId** | **Long** |  |  [optional]
**messageParts** | [**List&lt;MessagePart&gt;**](MessagePart.md) |  |  [optional]
**parentId** | **Long** |  |  [optional]
**richContents** | [**List&lt;RichContent&gt;**](RichContent.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional]
**text** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
DRAFT | &quot;DRAFT&quot;
READY | &quot;READY&quot;
USED | &quot;USED&quot;
IDLE | &quot;IDLE&quot;
COMPLETED | &quot;COMPLETED&quot;
GENETIC_ALGORITHM_GENERATED | &quot;GENETIC_ALGORITHM_GENERATED&quot;
DELETED | &quot;DELETED&quot;



