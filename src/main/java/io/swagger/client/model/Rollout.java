/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.WeightedVariation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Rollout
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-02T17:48:52.608-05:00")
public class Rollout {
  @SerializedName("variations")
  private List<WeightedVariation> variations = null;

  public Rollout variations(List<WeightedVariation> variations) {
    this.variations = variations;
    return this;
  }

  public Rollout addVariationsItem(WeightedVariation variationsItem) {
    if (this.variations == null) {
      this.variations = new ArrayList<WeightedVariation>();
    }
    this.variations.add(variationsItem);
    return this;
  }

   /**
   * Get variations
   * @return variations
  **/
  @ApiModelProperty(value = "")
  public List<WeightedVariation> getVariations() {
    return variations;
  }

  public void setVariations(List<WeightedVariation> variations) {
    this.variations = variations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rollout rollout = (Rollout) o;
    return Objects.equals(this.variations, rollout.variations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rollout {\n");
    
    sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
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
