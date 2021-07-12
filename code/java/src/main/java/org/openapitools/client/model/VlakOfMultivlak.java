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
import org.openapitools.client.model.MultipolygonGeoJSON;
import org.openapitools.client.model.PolygonGeoJSON;

/**
 * Een samengesteld geometriegegevenstype waarbij wordt afgedwongen dat voor de geometrie een keuze gemaakt moet worden tussen een vlak (GM_Surface) of een multivlak (GM_MultiSurface).
 */
@ApiModel(description = "Een samengesteld geometriegegevenstype waarbij wordt afgedwongen dat voor de geometrie een keuze gemaakt moet worden tussen een vlak (GM_Surface) of een multivlak (GM_MultiSurface).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-12T15:32:11.044684Z[Etc/UTC]")
public class VlakOfMultivlak {
  public static final String SERIALIZED_NAME_VLAK = "vlak";
  @SerializedName(SERIALIZED_NAME_VLAK)
  private PolygonGeoJSON vlak;

  public static final String SERIALIZED_NAME_MULTIVLAK = "multivlak";
  @SerializedName(SERIALIZED_NAME_MULTIVLAK)
  private MultipolygonGeoJSON multivlak;


  public VlakOfMultivlak vlak(PolygonGeoJSON vlak) {
    
    this.vlak = vlak;
    return this;
  }

   /**
   * Get vlak
   * @return vlak
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PolygonGeoJSON getVlak() {
    return vlak;
  }


  public void setVlak(PolygonGeoJSON vlak) {
    this.vlak = vlak;
  }


  public VlakOfMultivlak multivlak(MultipolygonGeoJSON multivlak) {
    
    this.multivlak = multivlak;
    return this;
  }

   /**
   * Get multivlak
   * @return multivlak
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MultipolygonGeoJSON getMultivlak() {
    return multivlak;
  }


  public void setMultivlak(MultipolygonGeoJSON multivlak) {
    this.multivlak = multivlak;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VlakOfMultivlak vlakOfMultivlak = (VlakOfMultivlak) o;
    return Objects.equals(this.vlak, vlakOfMultivlak.vlak) &&
        Objects.equals(this.multivlak, vlakOfMultivlak.multivlak);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vlak, multivlak);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VlakOfMultivlak {\n");
    sb.append("    vlak: ").append(toIndentedString(vlak)).append("\n");
    sb.append("    multivlak: ").append(toIndentedString(multivlak)).append("\n");
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

