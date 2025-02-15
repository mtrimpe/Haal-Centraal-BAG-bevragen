/*
 * Huidige bevragingen API
 * Deze API levert actuele gegevens over adressen, adresseerbare objecten en panden. Actueel betekent in deze API `zonder eindstatus`. De bron voor deze API is de basisregistratie adressen en gebouwen (BAG).
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: bag@kadaster.nl
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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

/**
 * NummeraanduidingIdentificatiesArray
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-21T08:58:29.540417Z[Etc/UTC]")
public class NummeraanduidingIdentificatiesArray {
  public static final String SERIALIZED_NAME_NUMMERAANDUIDING_IDENTIFICATIE = "nummeraanduidingIdentificatie";
  @SerializedName(SERIALIZED_NAME_NUMMERAANDUIDING_IDENTIFICATIE)
  private String nummeraanduidingIdentificatie;

  public static final String SERIALIZED_NAME_IS_NEVENADRES = "isNevenadres";
  @SerializedName(SERIALIZED_NAME_IS_NEVENADRES)
  private Boolean isNevenadres;


  public NummeraanduidingIdentificatiesArray nummeraanduidingIdentificatie(String nummeraanduidingIdentificatie) {
    
    this.nummeraanduidingIdentificatie = nummeraanduidingIdentificatie;
    return this;
  }

   /**
   * Get nummeraanduidingIdentificatie
   * @return nummeraanduidingIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0226200000038923", value = "")

  public String getNummeraanduidingIdentificatie() {
    return nummeraanduidingIdentificatie;
  }


  public void setNummeraanduidingIdentificatie(String nummeraanduidingIdentificatie) {
    this.nummeraanduidingIdentificatie = nummeraanduidingIdentificatie;
  }


  public NummeraanduidingIdentificatiesArray isNevenadres(Boolean isNevenadres) {
    
    this.isNevenadres = isNevenadres;
    return this;
  }

   /**
   * Get isNevenadres
   * @return isNevenadres
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsNevenadres() {
    return isNevenadres;
  }


  public void setIsNevenadres(Boolean isNevenadres) {
    this.isNevenadres = isNevenadres;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NummeraanduidingIdentificatiesArray nummeraanduidingIdentificatiesArray = (NummeraanduidingIdentificatiesArray) o;
    return Objects.equals(this.nummeraanduidingIdentificatie, nummeraanduidingIdentificatiesArray.nummeraanduidingIdentificatie) &&
        Objects.equals(this.isNevenadres, nummeraanduidingIdentificatiesArray.isNevenadres);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nummeraanduidingIdentificatie, isNevenadres);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NummeraanduidingIdentificatiesArray {\n");
    sb.append("    nummeraanduidingIdentificatie: ").append(toIndentedString(nummeraanduidingIdentificatie)).append("\n");
    sb.append("    isNevenadres: ").append(toIndentedString(isNevenadres)).append("\n");
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

