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
import org.joda.time.DateTime;


/**
 * ShortUrlEntity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-29T19:02:02.404+06:00")
public class ShortUrlEntity   {
  @SerializedName("code")
  private String code = null;

  @SerializedName("createdDate")
  private DateTime createdDate = null;

  @SerializedName("experimentId")
  private Long experimentId = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("messageId")
  private Long messageId = null;

  @SerializedName("shortUrl")
  private String shortUrl = null;

  @SerializedName("shortUrlForEmail")
  private String shortUrlForEmail = null;

  @SerializedName("targetUrl")
  private String targetUrl = null;

  @SerializedName("teamOwnership")
  private String teamOwnership = null;

  @SerializedName("used")
  private Boolean used = null;

  @SerializedName("userId")
  private String userId = null;

  public ShortUrlEntity code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ShortUrlEntity createdDate(DateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(DateTime createdDate) {
    this.createdDate = createdDate;
  }

  public ShortUrlEntity experimentId(Long experimentId) {
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

  public ShortUrlEntity id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ShortUrlEntity messageId(Long messageId) {
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

  public ShortUrlEntity shortUrl(String shortUrl) {
    this.shortUrl = shortUrl;
    return this;
  }

   /**
   * Get shortUrl
   * @return shortUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getShortUrl() {
    return shortUrl;
  }

  public void setShortUrl(String shortUrl) {
    this.shortUrl = shortUrl;
  }

  public ShortUrlEntity shortUrlForEmail(String shortUrlForEmail) {
    this.shortUrlForEmail = shortUrlForEmail;
    return this;
  }

   /**
   * Get shortUrlForEmail
   * @return shortUrlForEmail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getShortUrlForEmail() {
    return shortUrlForEmail;
  }

  public void setShortUrlForEmail(String shortUrlForEmail) {
    this.shortUrlForEmail = shortUrlForEmail;
  }

  public ShortUrlEntity targetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
    return this;
  }

   /**
   * Get targetUrl
   * @return targetUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTargetUrl() {
    return targetUrl;
  }

  public void setTargetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
  }

  public ShortUrlEntity teamOwnership(String teamOwnership) {
    this.teamOwnership = teamOwnership;
    return this;
  }

   /**
   * Get teamOwnership
   * @return teamOwnership
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTeamOwnership() {
    return teamOwnership;
  }

  public void setTeamOwnership(String teamOwnership) {
    this.teamOwnership = teamOwnership;
  }

  public ShortUrlEntity used(Boolean used) {
    this.used = used;
    return this;
  }

   /**
   * Get used
   * @return used
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getUsed() {
    return used;
  }

  public void setUsed(Boolean used) {
    this.used = used;
  }

  public ShortUrlEntity userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShortUrlEntity shortUrlEntity = (ShortUrlEntity) o;
    return Objects.equals(this.code, shortUrlEntity.code) &&
        Objects.equals(this.createdDate, shortUrlEntity.createdDate) &&
        Objects.equals(this.experimentId, shortUrlEntity.experimentId) &&
        Objects.equals(this.id, shortUrlEntity.id) &&
        Objects.equals(this.messageId, shortUrlEntity.messageId) &&
        Objects.equals(this.shortUrl, shortUrlEntity.shortUrl) &&
        Objects.equals(this.shortUrlForEmail, shortUrlEntity.shortUrlForEmail) &&
        Objects.equals(this.targetUrl, shortUrlEntity.targetUrl) &&
        Objects.equals(this.teamOwnership, shortUrlEntity.teamOwnership) &&
        Objects.equals(this.used, shortUrlEntity.used) &&
        Objects.equals(this.userId, shortUrlEntity.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, createdDate, experimentId, id, messageId, shortUrl, shortUrlForEmail, targetUrl, teamOwnership, used, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortUrlEntity {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    experimentId: ").append(toIndentedString(experimentId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    shortUrl: ").append(toIndentedString(shortUrl)).append("\n");
    sb.append("    shortUrlForEmail: ").append(toIndentedString(shortUrlForEmail)).append("\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
    sb.append("    teamOwnership: ").append(toIndentedString(teamOwnership)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

