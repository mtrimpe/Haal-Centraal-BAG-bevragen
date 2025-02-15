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
import java.util.ArrayList;
import java.util.List;

/**
 * Wanneer true is de waarde mogelijk onjuist en wordt juistheid op dit moment onderzocht. Zie toelichting.
 */
@ApiModel(description = "Wanneer true is de waarde mogelijk onjuist en wordt juistheid op dit moment onderzocht. Zie toelichting.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-21T08:58:29.540417Z[Etc/UTC]")
public class OpenbareRuimteMogelijkOnjuist {
  public static final String SERIALIZED_NAME_NAAM = "naam";
  @SerializedName(SERIALIZED_NAME_NAAM)
  private Boolean naam;

  public static final String SERIALIZED_NAME_KORTE_NAAM = "korteNaam";
  @SerializedName(SERIALIZED_NAME_KORTE_NAAM)
  private Boolean korteNaam;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Boolean type;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Boolean status;

  public static final String SERIALIZED_NAME_WOONPLAATS_IDENTIFICATIE = "woonplaatsIdentificatie";
  @SerializedName(SERIALIZED_NAME_WOONPLAATS_IDENTIFICATIE)
  private Boolean woonplaatsIdentificatie;

  public static final String SERIALIZED_NAME_TOELICHTING = "toelichting";
  @SerializedName(SERIALIZED_NAME_TOELICHTING)
  private List<String> toelichting = null;


  public OpenbareRuimteMogelijkOnjuist naam(Boolean naam) {
    
    this.naam = naam;
    return this;
  }

   /**
   * Get naam
   * @return naam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNaam() {
    return naam;
  }


  public void setNaam(Boolean naam) {
    this.naam = naam;
  }


  public OpenbareRuimteMogelijkOnjuist korteNaam(Boolean korteNaam) {
    
    this.korteNaam = korteNaam;
    return this;
  }

   /**
   * Get korteNaam
   * @return korteNaam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getKorteNaam() {
    return korteNaam;
  }


  public void setKorteNaam(Boolean korteNaam) {
    this.korteNaam = korteNaam;
  }


  public OpenbareRuimteMogelijkOnjuist type(Boolean type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getType() {
    return type;
  }


  public void setType(Boolean type) {
    this.type = type;
  }


  public OpenbareRuimteMogelijkOnjuist status(Boolean status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getStatus() {
    return status;
  }


  public void setStatus(Boolean status) {
    this.status = status;
  }


  public OpenbareRuimteMogelijkOnjuist woonplaatsIdentificatie(Boolean woonplaatsIdentificatie) {
    
    this.woonplaatsIdentificatie = woonplaatsIdentificatie;
    return this;
  }

   /**
   * Get woonplaatsIdentificatie
   * @return woonplaatsIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWoonplaatsIdentificatie() {
    return woonplaatsIdentificatie;
  }


  public void setWoonplaatsIdentificatie(Boolean woonplaatsIdentificatie) {
    this.woonplaatsIdentificatie = woonplaatsIdentificatie;
  }


  public OpenbareRuimteMogelijkOnjuist toelichting(List<String> toelichting) {
    
    this.toelichting = toelichting;
    return this;
  }

  public OpenbareRuimteMogelijkOnjuist addToelichtingItem(String toelichtingItem) {
    if (this.toelichting == null) {
      this.toelichting = new ArrayList<>();
    }
    this.toelichting.add(toelichtingItem);
    return this;
  }

   /**
   * Get toelichting
   * @return toelichting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getToelichting() {
    return toelichting;
  }


  public void setToelichting(List<String> toelichting) {
    this.toelichting = toelichting;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenbareRuimteMogelijkOnjuist openbareRuimteMogelijkOnjuist = (OpenbareRuimteMogelijkOnjuist) o;
    return Objects.equals(this.naam, openbareRuimteMogelijkOnjuist.naam) &&
        Objects.equals(this.korteNaam, openbareRuimteMogelijkOnjuist.korteNaam) &&
        Objects.equals(this.type, openbareRuimteMogelijkOnjuist.type) &&
        Objects.equals(this.status, openbareRuimteMogelijkOnjuist.status) &&
        Objects.equals(this.woonplaatsIdentificatie, openbareRuimteMogelijkOnjuist.woonplaatsIdentificatie) &&
        Objects.equals(this.toelichting, openbareRuimteMogelijkOnjuist.toelichting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(naam, korteNaam, type, status, woonplaatsIdentificatie, toelichting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenbareRuimteMogelijkOnjuist {\n");
    sb.append("    naam: ").append(toIndentedString(naam)).append("\n");
    sb.append("    korteNaam: ").append(toIndentedString(korteNaam)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    woonplaatsIdentificatie: ").append(toIndentedString(woonplaatsIdentificatie)).append("\n");
    sb.append("    toelichting: ").append(toIndentedString(toelichting)).append("\n");
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

