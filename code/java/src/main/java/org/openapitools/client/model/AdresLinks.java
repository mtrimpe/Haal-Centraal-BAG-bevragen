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
import org.openapitools.client.model.HalLink;

/**
 * AdresLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-21T08:58:29.540417Z[Etc/UTC]")
public class AdresLinks {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private HalLink self;

  public static final String SERIALIZED_NAME_OPENBARE_RUIMTE = "openbareRuimte";
  @SerializedName(SERIALIZED_NAME_OPENBARE_RUIMTE)
  private HalLink openbareRuimte;

  public static final String SERIALIZED_NAME_NUMMERAANDUIDING = "nummeraanduiding";
  @SerializedName(SERIALIZED_NAME_NUMMERAANDUIDING)
  private HalLink nummeraanduiding;

  public static final String SERIALIZED_NAME_WOONPLAATS = "woonplaats";
  @SerializedName(SERIALIZED_NAME_WOONPLAATS)
  private HalLink woonplaats;

  public static final String SERIALIZED_NAME_ADRESSEERBAAR_OBJECT = "adresseerbaarObject";
  @SerializedName(SERIALIZED_NAME_ADRESSEERBAAR_OBJECT)
  private HalLink adresseerbaarObject;

  public static final String SERIALIZED_NAME_PANDEN = "panden";
  @SerializedName(SERIALIZED_NAME_PANDEN)
  private List<HalLink> panden = null;


  public AdresLinks self(HalLink self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalLink getSelf() {
    return self;
  }


  public void setSelf(HalLink self) {
    this.self = self;
  }


  public AdresLinks openbareRuimte(HalLink openbareRuimte) {
    
    this.openbareRuimte = openbareRuimte;
    return this;
  }

   /**
   * Get openbareRuimte
   * @return openbareRuimte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalLink getOpenbareRuimte() {
    return openbareRuimte;
  }


  public void setOpenbareRuimte(HalLink openbareRuimte) {
    this.openbareRuimte = openbareRuimte;
  }


  public AdresLinks nummeraanduiding(HalLink nummeraanduiding) {
    
    this.nummeraanduiding = nummeraanduiding;
    return this;
  }

   /**
   * Get nummeraanduiding
   * @return nummeraanduiding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalLink getNummeraanduiding() {
    return nummeraanduiding;
  }


  public void setNummeraanduiding(HalLink nummeraanduiding) {
    this.nummeraanduiding = nummeraanduiding;
  }


  public AdresLinks woonplaats(HalLink woonplaats) {
    
    this.woonplaats = woonplaats;
    return this;
  }

   /**
   * Get woonplaats
   * @return woonplaats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalLink getWoonplaats() {
    return woonplaats;
  }


  public void setWoonplaats(HalLink woonplaats) {
    this.woonplaats = woonplaats;
  }


  public AdresLinks adresseerbaarObject(HalLink adresseerbaarObject) {
    
    this.adresseerbaarObject = adresseerbaarObject;
    return this;
  }

   /**
   * Get adresseerbaarObject
   * @return adresseerbaarObject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalLink getAdresseerbaarObject() {
    return adresseerbaarObject;
  }


  public void setAdresseerbaarObject(HalLink adresseerbaarObject) {
    this.adresseerbaarObject = adresseerbaarObject;
  }


  public AdresLinks panden(List<HalLink> panden) {
    
    this.panden = panden;
    return this;
  }

  public AdresLinks addPandenItem(HalLink pandenItem) {
    if (this.panden == null) {
      this.panden = new ArrayList<>();
    }
    this.panden.add(pandenItem);
    return this;
  }

   /**
   * Het/de aan het adres gerelateerde pand(en).
   * @return panden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Het/de aan het adres gerelateerde pand(en).")

  public List<HalLink> getPanden() {
    return panden;
  }


  public void setPanden(List<HalLink> panden) {
    this.panden = panden;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdresLinks adresLinks = (AdresLinks) o;
    return Objects.equals(this.self, adresLinks.self) &&
        Objects.equals(this.openbareRuimte, adresLinks.openbareRuimte) &&
        Objects.equals(this.nummeraanduiding, adresLinks.nummeraanduiding) &&
        Objects.equals(this.woonplaats, adresLinks.woonplaats) &&
        Objects.equals(this.adresseerbaarObject, adresLinks.adresseerbaarObject) &&
        Objects.equals(this.panden, adresLinks.panden);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, openbareRuimte, nummeraanduiding, woonplaats, adresseerbaarObject, panden);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdresLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    openbareRuimte: ").append(toIndentedString(openbareRuimte)).append("\n");
    sb.append("    nummeraanduiding: ").append(toIndentedString(nummeraanduiding)).append("\n");
    sb.append("    woonplaats: ").append(toIndentedString(woonplaats)).append("\n");
    sb.append("    adresseerbaarObject: ").append(toIndentedString(adresseerbaarObject)).append("\n");
    sb.append("    panden: ").append(toIndentedString(panden)).append("\n");
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

