/*
 * The EBI Search: RESTful Web services
 * This is an API documentation for [EBI Search](https://www.ebi.ac.uk/ebisearch) RESTful Web services.
 *
 * The version of the OpenAPI document: all
 * Contact: www-prod@ebi.ac.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package eu.dissco.digitisers.clients.ebi.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WSDiagnostics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-01T16:03:02.863Z[GMT]")
public class WSDiagnostics {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_EXPECTED_TOKENS = "expectedTokens";
  @SerializedName(SERIALIZED_NAME_EXPECTED_TOKENS)
  private List<String> expectedTokens = null;


  public WSDiagnostics message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public WSDiagnostics expectedTokens(List<String> expectedTokens) {
    
    this.expectedTokens = expectedTokens;
    return this;
  }

  public WSDiagnostics addExpectedTokensItem(String expectedTokensItem) {
    if (this.expectedTokens == null) {
      this.expectedTokens = new ArrayList<String>();
    }
    this.expectedTokens.add(expectedTokensItem);
    return this;
  }

   /**
   * Get expectedTokens
   * @return expectedTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getExpectedTokens() {
    return expectedTokens;
  }


  public void setExpectedTokens(List<String> expectedTokens) {
    this.expectedTokens = expectedTokens;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WSDiagnostics wsDiagnostics = (WSDiagnostics) o;
    return Objects.equals(this.message, wsDiagnostics.message) &&
        Objects.equals(this.expectedTokens, wsDiagnostics.expectedTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, expectedTokens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WSDiagnostics {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    expectedTokens: ").append(toIndentedString(expectedTokens)).append("\n");
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

