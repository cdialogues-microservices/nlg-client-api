/**
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Message
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-16T11:21:22.833+06:00")
public class Message   {
  @SerializedName("dateSubmitted")
  private String dateSubmitted = null;

  @SerializedName("dateUpdated")
  private String dateUpdated = null;

  @SerializedName("messageId")
  private Long messageId = null;

  @SerializedName("messageParts")
  private List<MessagePart> messageParts = new ArrayList<MessagePart>();

  @SerializedName("parentId")
  private Long parentId = null;

  @SerializedName("richContents")
  private List<RichContent> richContents = new ArrayList<RichContent>();

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("DRAFT")
    DRAFT("DRAFT"),
    
    @SerializedName("READY")
    READY("READY"),
    
    @SerializedName("USED")
    USED("USED"),
    
    @SerializedName("IDLE")
    IDLE("IDLE"),
    
    @SerializedName("COMPLETED")
    COMPLETED("COMPLETED"),
    
    @SerializedName("GENETIC_ALGORITHM_GENERATED")
    GENETIC_ALGORITHM_GENERATED("GENETIC_ALGORITHM_GENERATED"),
    
    @SerializedName("DELETED")
    DELETED("DELETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("tags")
  private List<Tag> tags = new ArrayList<Tag>();

  @SerializedName("text")
  private String text = null;

  public Message dateSubmitted(String dateSubmitted) {
    this.dateSubmitted = dateSubmitted;
    return this;
  }

   /**
   * Get dateSubmitted
   * @return dateSubmitted
  **/
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "")
  public String getDateSubmitted() {
    return dateSubmitted;
  }

  public void setDateSubmitted(String dateSubmitted) {
    this.dateSubmitted = dateSubmitted;
  }

  public Message dateUpdated(String dateUpdated) {
    this.dateUpdated = dateUpdated;
    return this;
  }

   /**
   * Get dateUpdated
   * @return dateUpdated
  **/
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "")
  public String getDateUpdated() {
    return dateUpdated;
  }

  public void setDateUpdated(String dateUpdated) {
    this.dateUpdated = dateUpdated;
  }

  public Message messageId(Long messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getMessageId() {
    return messageId;
  }

  public void setMessageId(Long messageId) {
    this.messageId = messageId;
  }

  public Message messageParts(List<MessagePart> messageParts) {
    this.messageParts = messageParts;
    return this;
  }

  public Message addMessagePartsItem(MessagePart messagePartsItem) {
    this.messageParts.add(messagePartsItem);
    return this;
  }

   /**
   * Get messageParts
   * @return messageParts
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<MessagePart> getMessageParts() {
    return messageParts;
  }

  public void setMessageParts(List<MessagePart> messageParts) {
    this.messageParts = messageParts;
  }

  public Message parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public Message richContents(List<RichContent> richContents) {
    this.richContents = richContents;
    return this;
  }

  public Message addRichContentsItem(RichContent richContentsItem) {
    this.richContents.add(richContentsItem);
    return this;
  }

   /**
   * Get richContents
   * @return richContents
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<RichContent> getRichContents() {
    return richContents;
  }

  public void setRichContents(List<RichContent> richContents) {
    this.richContents = richContents;
  }

  public Message status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Message tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public Message addTagsItem(Tag tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public Message text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.dateSubmitted, message.dateSubmitted) &&
        Objects.equals(this.dateUpdated, message.dateUpdated) &&
        Objects.equals(this.messageId, message.messageId) &&
        Objects.equals(this.messageParts, message.messageParts) &&
        Objects.equals(this.parentId, message.parentId) &&
        Objects.equals(this.richContents, message.richContents) &&
        Objects.equals(this.status, message.status) &&
        Objects.equals(this.tags, message.tags) &&
        Objects.equals(this.text, message.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateSubmitted, dateUpdated, messageId, messageParts, parentId, richContents, status, tags, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    dateSubmitted: ").append(toIndentedString(dateSubmitted)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    messageParts: ").append(toIndentedString(messageParts)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    richContents: ").append(toIndentedString(richContents)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

