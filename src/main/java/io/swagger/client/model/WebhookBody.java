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
import java.io.IOException;

/**
 * WebhookBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-02T17:24:56.662-05:00")
public class WebhookBody {
  @SerializedName("url")
  private String url = null;

  @SerializedName("secret")
  private String secret = null;

  @SerializedName("sign")
  private Boolean sign = null;

  @SerializedName("on")
  private Boolean on = null;

  public WebhookBody url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "https://example.com/example", required = true, value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public WebhookBody secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @ApiModelProperty(example = "<password>", value = "")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public WebhookBody sign(Boolean sign) {
    this.sign = sign;
    return this;
  }

   /**
   * Get sign
   * @return sign
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getSign() {
    return sign;
  }

  public void setSign(Boolean sign) {
    this.sign = sign;
  }

  public WebhookBody on(Boolean on) {
    this.on = on;
    return this;
  }

   /**
   * Get on
   * @return on
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getOn() {
    return on;
  }

  public void setOn(Boolean on) {
    this.on = on;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookBody webhookBody = (WebhookBody) o;
    return Objects.equals(this.url, webhookBody.url) &&
        Objects.equals(this.secret, webhookBody.secret) &&
        Objects.equals(this.sign, webhookBody.sign) &&
        Objects.equals(this.on, webhookBody.on);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, secret, sign, on);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookBody {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    sign: ").append(toIndentedString(sign)).append("\n");
    sb.append("    on: ").append(toIndentedString(on)).append("\n");
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

