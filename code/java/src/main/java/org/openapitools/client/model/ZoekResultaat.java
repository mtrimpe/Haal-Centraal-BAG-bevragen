/*
 * Huidige bevragingen API
 * Deze API levert actuele gegevens over adressen, adresseerbare objecten en panden. Actueel betekent in deze API `zonder eindstatus`. De bron voor deze API is de basisregistratie adressen en gebouwen (BAG).
 *
 * The version of the OpenAPI document: 1.2.0
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
 * Resultaat van een zoekoperatie dat je kunt gebruiken om een adres te vinden met /adressen.
 */
@ApiModel(description = "Resultaat van een zoekoperatie dat je kunt gebruiken om een adres te vinden met /adressen.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-12T15:32:11.044684Z[Etc/UTC]")
public class ZoekResultaat {
  public static final String SERIALIZED_NAME_OMSCHRIJVING = "omschrijving";
  @SerializedName(SERIALIZED_NAME_OMSCHRIJVING)
  private String omschrijving;

  public static final String SERIALIZED_NAME_IDENTIFICATIE = "identificatie";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATIE)
  private String identificatie;


  public ZoekResultaat omschrijving(String omschrijving) {
    
    this.omschrijving = omschrijving;
    return this;
  }

   /**
   * Omschrijving van het zoekresultaat
   * @return omschrijving
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Omschrijving van het zoekresultaat")

  public String getOmschrijving() {
    return omschrijving;
  }


  public void setOmschrijving(String omschrijving) {
    this.omschrijving = omschrijving;
  }


  public ZoekResultaat identificatie(String identificatie) {
    
    this.identificatie = identificatie;
    return this;
  }

   /**
   * Identificatie van het zoekresultaat
   * @return identificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identificatie van het zoekresultaat")

  public String getIdentificatie() {
    return identificatie;
  }


  public void setIdentificatie(String identificatie) {
    this.identificatie = identificatie;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZoekResultaat zoekResultaat = (ZoekResultaat) o;
    return Objects.equals(this.omschrijving, zoekResultaat.omschrijving) &&
        Objects.equals(this.identificatie, zoekResultaat.identificatie);
  }

  @Override
  public int hashCode() {
    return Objects.hash(omschrijving, identificatie);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZoekResultaat {\n");
    sb.append("    omschrijving: ").append(toIndentedString(omschrijving)).append("\n");
    sb.append("    identificatie: ").append(toIndentedString(identificatie)).append("\n");
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

