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
import org.openapitools.client.model.NummeraanduidingHalBasis;
import org.openapitools.client.model.OpenbareRuimteHalBasis;
import org.openapitools.client.model.WoonplaatsHalBasis;

/**
 * AdresEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-13T10:42:05.060374Z[Etc/UTC]")
public class AdresEmbedded {
  public static final String SERIALIZED_NAME_OPENBARE_RUIMTE = "openbareRuimte";
  @SerializedName(SERIALIZED_NAME_OPENBARE_RUIMTE)
  private OpenbareRuimteHalBasis openbareRuimte;

  public static final String SERIALIZED_NAME_NUMMERAANDUIDING = "nummeraanduiding";
  @SerializedName(SERIALIZED_NAME_NUMMERAANDUIDING)
  private NummeraanduidingHalBasis nummeraanduiding;

  public static final String SERIALIZED_NAME_WOONPLAATS = "woonplaats";
  @SerializedName(SERIALIZED_NAME_WOONPLAATS)
  private WoonplaatsHalBasis woonplaats;


  public AdresEmbedded openbareRuimte(OpenbareRuimteHalBasis openbareRuimte) {
    
    this.openbareRuimte = openbareRuimte;
    return this;
  }

   /**
   * Get openbareRuimte
   * @return openbareRuimte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OpenbareRuimteHalBasis getOpenbareRuimte() {
    return openbareRuimte;
  }


  public void setOpenbareRuimte(OpenbareRuimteHalBasis openbareRuimte) {
    this.openbareRuimte = openbareRuimte;
  }


  public AdresEmbedded nummeraanduiding(NummeraanduidingHalBasis nummeraanduiding) {
    
    this.nummeraanduiding = nummeraanduiding;
    return this;
  }

   /**
   * Get nummeraanduiding
   * @return nummeraanduiding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NummeraanduidingHalBasis getNummeraanduiding() {
    return nummeraanduiding;
  }


  public void setNummeraanduiding(NummeraanduidingHalBasis nummeraanduiding) {
    this.nummeraanduiding = nummeraanduiding;
  }


  public AdresEmbedded woonplaats(WoonplaatsHalBasis woonplaats) {
    
    this.woonplaats = woonplaats;
    return this;
  }

   /**
   * Get woonplaats
   * @return woonplaats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WoonplaatsHalBasis getWoonplaats() {
    return woonplaats;
  }


  public void setWoonplaats(WoonplaatsHalBasis woonplaats) {
    this.woonplaats = woonplaats;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdresEmbedded adresEmbedded = (AdresEmbedded) o;
    return Objects.equals(this.openbareRuimte, adresEmbedded.openbareRuimte) &&
        Objects.equals(this.nummeraanduiding, adresEmbedded.nummeraanduiding) &&
        Objects.equals(this.woonplaats, adresEmbedded.woonplaats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openbareRuimte, nummeraanduiding, woonplaats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdresEmbedded {\n");
    sb.append("    openbareRuimte: ").append(toIndentedString(openbareRuimte)).append("\n");
    sb.append("    nummeraanduiding: ").append(toIndentedString(nummeraanduiding)).append("\n");
    sb.append("    woonplaats: ").append(toIndentedString(woonplaats)).append("\n");
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

