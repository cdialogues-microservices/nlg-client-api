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
import io.swagger.client.model.TargetGroupDto;
import java.util.ArrayList;
import java.util.List;


/**
 * TargetGroupPageDto
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-29T19:02:02.404+06:00")
public class TargetGroupPageDto   {
  @SerializedName("elementsPerPage")
  private Integer elementsPerPage = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("targetGroups")
  private List<TargetGroupDto> targetGroups = new ArrayList<TargetGroupDto>();

  @SerializedName("totalElements")
  private Long totalElements = null;

  @SerializedName("totalPages")
  private Integer totalPages = null;

  public TargetGroupPageDto elementsPerPage(Integer elementsPerPage) {
    this.elementsPerPage = elementsPerPage;
    return this;
  }

   /**
   * Get elementsPerPage
   * @return elementsPerPage
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getElementsPerPage() {
    return elementsPerPage;
  }

  public void setElementsPerPage(Integer elementsPerPage) {
    this.elementsPerPage = elementsPerPage;
  }

  public TargetGroupPageDto page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public TargetGroupPageDto targetGroups(List<TargetGroupDto> targetGroups) {
    this.targetGroups = targetGroups;
    return this;
  }

  public TargetGroupPageDto addTargetGroupsItem(TargetGroupDto targetGroupsItem) {
    this.targetGroups.add(targetGroupsItem);
    return this;
  }

   /**
   * Get targetGroups
   * @return targetGroups
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<TargetGroupDto> getTargetGroups() {
    return targetGroups;
  }

  public void setTargetGroups(List<TargetGroupDto> targetGroups) {
    this.targetGroups = targetGroups;
  }

  public TargetGroupPageDto totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

   /**
   * Get totalElements
   * @return totalElements
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public TargetGroupPageDto totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetGroupPageDto targetGroupPageDto = (TargetGroupPageDto) o;
    return Objects.equals(this.elementsPerPage, targetGroupPageDto.elementsPerPage) &&
        Objects.equals(this.page, targetGroupPageDto.page) &&
        Objects.equals(this.targetGroups, targetGroupPageDto.targetGroups) &&
        Objects.equals(this.totalElements, targetGroupPageDto.totalElements) &&
        Objects.equals(this.totalPages, targetGroupPageDto.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementsPerPage, page, targetGroups, totalElements, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetGroupPageDto {\n");
    
    sb.append("    elementsPerPage: ").append(toIndentedString(elementsPerPage)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    targetGroups: ").append(toIndentedString(targetGroups)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

