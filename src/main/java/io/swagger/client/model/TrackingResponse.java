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
 * TrackingResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-11T10:24:25.694+06:00")
public class TrackingResponse   {
  @SerializedName("modifiedMessage")
  private String modifiedMessage = null;

  @SerializedName("shortUrls")
  private List<ShortUrlEntity> shortUrls = new ArrayList<ShortUrlEntity>();

  public TrackingResponse modifiedMessage(String modifiedMessage) {
    this.modifiedMessage = modifiedMessage;
    return this;
  }

   /**
   * Get modifiedMessage
   * @return modifiedMessage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getModifiedMessage() {
    return modifiedMessage;
  }

  public void setModifiedMessage(String modifiedMessage) {
    this.modifiedMessage = modifiedMessage;
  }

  public TrackingResponse shortUrls(List<ShortUrlEntity> shortUrls) {
    this.shortUrls = shortUrls;
    return this;
  }

  public TrackingResponse addShortUrlsItem(ShortUrlEntity shortUrlsItem) {
    this.shortUrls.add(shortUrlsItem);
    return this;
  }

   /**
   * Get shortUrls
   * @return shortUrls
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ShortUrlEntity> getShortUrls() {
    return shortUrls;
  }

  public void setShortUrls(List<ShortUrlEntity> shortUrls) {
    this.shortUrls = shortUrls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingResponse trackingResponse = (TrackingResponse) o;
    return Objects.equals(this.modifiedMessage, trackingResponse.modifiedMessage) &&
        Objects.equals(this.shortUrls, trackingResponse.shortUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifiedMessage, shortUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingResponse {\n");
    
    sb.append("    modifiedMessage: ").append(toIndentedString(modifiedMessage)).append("\n");
    sb.append("    shortUrls: ").append(toIndentedString(shortUrls)).append("\n");
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

