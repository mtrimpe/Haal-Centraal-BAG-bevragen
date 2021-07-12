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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.HalLink;

/**
 * PandLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-12T15:32:11.044684Z[Etc/UTC]")
public class PandLinks {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private HalLink self;

  public static final String SERIALIZED_NAME_ADRESSEN = "adressen";
  @SerializedName(SERIALIZED_NAME_ADRESSEN)
  private List<HalLink> adressen = null;

  public static final String SERIALIZED_NAME_ADRESSEERBARE_OBJECTEN = "adresseerbareObjecten";
  @SerializedName(SERIALIZED_NAME_ADRESSEERBARE_OBJECTEN)
  private List<HalLink> adresseerbareObjecten = null;


  public PandLinks self(HalLink self) {
    
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


  public PandLinks adressen(List<HalLink> adressen) {
    
    this.adressen = adressen;
    return this;
  }

  public PandLinks addAdressenItem(HalLink adressenItem) {
    if (this.adressen == null) {
      this.adressen = new ArrayList<>();
    }
    this.adressen.add(adressenItem);
    return this;
  }

   /**
   * Get adressen
   * @return adressen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HalLink> getAdressen() {
    return adressen;
  }


  public void setAdressen(List<HalLink> adressen) {
    this.adressen = adressen;
  }


  public PandLinks adresseerbareObjecten(List<HalLink> adresseerbareObjecten) {
    
    this.adresseerbareObjecten = adresseerbareObjecten;
    return this;
  }

  public PandLinks addAdresseerbareObjectenItem(HalLink adresseerbareObjectenItem) {
    if (this.adresseerbareObjecten == null) {
      this.adresseerbareObjecten = new ArrayList<>();
    }
    this.adresseerbareObjecten.add(adresseerbareObjectenItem);
    return this;
  }

   /**
   * Get adresseerbareObjecten
   * @return adresseerbareObjecten
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HalLink> getAdresseerbareObjecten() {
    return adresseerbareObjecten;
  }


  public void setAdresseerbareObjecten(List<HalLink> adresseerbareObjecten) {
    this.adresseerbareObjecten = adresseerbareObjecten;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PandLinks pandLinks = (PandLinks) o;
    return Objects.equals(this.self, pandLinks.self) &&
        Objects.equals(this.adressen, pandLinks.adressen) &&
        Objects.equals(this.adresseerbareObjecten, pandLinks.adresseerbareObjecten);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, adressen, adresseerbareObjecten);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PandLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    adressen: ").append(toIndentedString(adressen)).append("\n");
    sb.append("    adresseerbareObjecten: ").append(toIndentedString(adresseerbareObjecten)).append("\n");
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

