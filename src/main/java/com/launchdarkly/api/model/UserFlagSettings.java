/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.3
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.launchdarkly.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.launchdarkly.api.model.Links;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UserFlagSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-20T15:51:46.991-07:00")
public class UserFlagSettings {
  @SerializedName("_links")
  private Links links = null;

  @SerializedName("items")
  private Object items = null;

  public UserFlagSettings links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public UserFlagSettings items(Object items) {
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(example = "{\"sort.order\":{\"_links\":{\"self\":{\"href\":\"/api/v2/users/lacuna/production/Abbie_Braun/flags/sort.order\",\"type\":\"application/json\"},\"_value\":true,\"setting\":null}},\"alternate.page\":{\"_links\":{\"self\":{\"href\":\"/api/v2/users/lacuna/production/Abbie_Braun/flags/alternate.page\",\"type\":\"application/json\"}},\"_value\":\"false,\",\"setting\":null}}", value = "")
  public Object getItems() {
    return items;
  }

  public void setItems(Object items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFlagSettings userFlagSettings = (UserFlagSettings) o;
    return Objects.equals(this.links, userFlagSettings.links) &&
        Objects.equals(this.items, userFlagSettings.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFlagSettings {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

