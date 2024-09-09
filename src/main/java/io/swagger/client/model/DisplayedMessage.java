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

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.RichContent;
import java.util.ArrayList;
import java.util.List;


/**
 * DisplayedMessage
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-06T13:02:56.051+06:00")
public class DisplayedMessage   {
  @SerializedName("experimentId")
  private Long experimentId = null;

  @SerializedName("messageId")
  private Long messageId = null;

  @SerializedName("richContents")
  private List<RichContent> richContents = new ArrayList<RichContent>();

  @SerializedName("text")
  private String text = null;

  public DisplayedMessage experimentId(Long experimentId) {
    this.experimentId = experimentId;
    return this;
  }

   /**
   * Get experimentId
   * @return experimentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getExperimentId() {
    return experimentId;
  }

  public void setExperimentId(Long experimentId) {
    this.experimentId = experimentId;
  }

  public DisplayedMessage messageId(Long messageId) {
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

  public DisplayedMessage richContents(List<RichContent> richContents) {
    this.richContents = richContents;
    return this;
  }

  public DisplayedMessage addRichContentsItem(RichContent richContentsItem) {
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

  public DisplayedMessage text(String text) {
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayedMessage displayedMessage = (DisplayedMessage) o;
    return Objects.equals(this.experimentId, displayedMessage.experimentId) &&
        Objects.equals(this.messageId, displayedMessage.messageId) &&
        Objects.equals(this.richContents, displayedMessage.richContents) &&
        Objects.equals(this.text, displayedMessage.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId, messageId, richContents, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayedMessage {\n");
    
    sb.append("    experimentId: ").append(toIndentedString(experimentId)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    richContents: ").append(toIndentedString(richContents)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
