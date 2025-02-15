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
import org.openapitools.client.model.Adres;
import org.openapitools.client.model.AdresMogelijkOnjuist;
import org.openapitools.client.model.AdresUitgebreidAllOf;

/**
 * AdresUitgebreid
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-21T08:58:29.540417Z[Etc/UTC]")
public class AdresUitgebreid {
  public static final String SERIALIZED_NAME_STRAAT = "straat";
  @SerializedName(SERIALIZED_NAME_STRAAT)
  private String straat;

  public static final String SERIALIZED_NAME_HUISNUMMER = "huisnummer";
  @SerializedName(SERIALIZED_NAME_HUISNUMMER)
  private Integer huisnummer;

  public static final String SERIALIZED_NAME_HUISLETTER = "huisletter";
  @SerializedName(SERIALIZED_NAME_HUISLETTER)
  private String huisletter;

  public static final String SERIALIZED_NAME_HUISNUMMERTOEVOEGING = "huisnummertoevoeging";
  @SerializedName(SERIALIZED_NAME_HUISNUMMERTOEVOEGING)
  private String huisnummertoevoeging;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public static final String SERIALIZED_NAME_WOONPLAATS = "woonplaats";
  @SerializedName(SERIALIZED_NAME_WOONPLAATS)
  private String woonplaats;

  public static final String SERIALIZED_NAME_ADRESREGEL1 = "adresregel1";
  @SerializedName(SERIALIZED_NAME_ADRESREGEL1)
  private String adresregel1;

  public static final String SERIALIZED_NAME_ADRESREGEL2 = "adresregel2";
  @SerializedName(SERIALIZED_NAME_ADRESREGEL2)
  private String adresregel2;

  public static final String SERIALIZED_NAME_KORTE_NAAM = "korteNaam";
  @SerializedName(SERIALIZED_NAME_KORTE_NAAM)
  private String korteNaam;

  public static final String SERIALIZED_NAME_NUMMERAANDUIDING_IDENTIFICATIE = "nummeraanduidingIdentificatie";
  @SerializedName(SERIALIZED_NAME_NUMMERAANDUIDING_IDENTIFICATIE)
  private String nummeraanduidingIdentificatie;

  public static final String SERIALIZED_NAME_OPENBARE_RUIMTE_IDENTIFICATIE = "openbareRuimteIdentificatie";
  @SerializedName(SERIALIZED_NAME_OPENBARE_RUIMTE_IDENTIFICATIE)
  private String openbareRuimteIdentificatie;

  public static final String SERIALIZED_NAME_WOONPLAATS_IDENTIFICATIE = "woonplaatsIdentificatie";
  @SerializedName(SERIALIZED_NAME_WOONPLAATS_IDENTIFICATIE)
  private String woonplaatsIdentificatie;

  public static final String SERIALIZED_NAME_ADRESSEERBAAR_OBJECT_IDENTIFICATIE = "adresseerbaarObjectIdentificatie";
  @SerializedName(SERIALIZED_NAME_ADRESSEERBAAR_OBJECT_IDENTIFICATIE)
  private String adresseerbaarObjectIdentificatie;

  public static final String SERIALIZED_NAME_PAND_IDENTIFICATIES = "pandIdentificaties";
  @SerializedName(SERIALIZED_NAME_PAND_IDENTIFICATIES)
  private List<String> pandIdentificaties = null;

  public static final String SERIALIZED_NAME_IS_NEVENADRES = "isNevenadres";
  @SerializedName(SERIALIZED_NAME_IS_NEVENADRES)
  private Boolean isNevenadres;

  public static final String SERIALIZED_NAME_GECONSTATEERD = "geconstateerd";
  @SerializedName(SERIALIZED_NAME_GECONSTATEERD)
  private Boolean geconstateerd;

  public static final String SERIALIZED_NAME_MOGELIJK_ONJUIST = "mogelijkOnjuist";
  @SerializedName(SERIALIZED_NAME_MOGELIJK_ONJUIST)
  private AdresMogelijkOnjuist mogelijkOnjuist;


  public AdresUitgebreid straat(String straat) {
    
    this.straat = straat;
    return this;
  }

   /**
   * Een naam die door de gemeente aan een openbare ruimte is gegeven.
   * @return straat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Laan van de landinrichtingscommissie Duiven-Westervoort", value = "Een naam die door de gemeente aan een openbare ruimte is gegeven.")

  public String getStraat() {
    return straat;
  }


  public void setStraat(String straat) {
    this.straat = straat;
  }


  public AdresUitgebreid huisnummer(Integer huisnummer) {
    
    this.huisnummer = huisnummer;
    return this;
  }

   /**
   * Een nummer dat door de gemeente aan een adresseerbaar object is gegeven.
   * @return huisnummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Een nummer dat door de gemeente aan een adresseerbaar object is gegeven.")

  public Integer getHuisnummer() {
    return huisnummer;
  }


  public void setHuisnummer(Integer huisnummer) {
    this.huisnummer = huisnummer;
  }


  public AdresUitgebreid huisletter(String huisletter) {
    
    this.huisletter = huisletter;
    return this;
  }

   /**
   * Een toevoeging aan een huisnummer in de vorm van een letter die door de gemeente aan een adresseerbaar object is gegeven.
   * @return huisletter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A", value = "Een toevoeging aan een huisnummer in de vorm van een letter die door de gemeente aan een adresseerbaar object is gegeven.")

  public String getHuisletter() {
    return huisletter;
  }


  public void setHuisletter(String huisletter) {
    this.huisletter = huisletter;
  }


  public AdresUitgebreid huisnummertoevoeging(String huisnummertoevoeging) {
    
    this.huisnummertoevoeging = huisnummertoevoeging;
    return this;
  }

   /**
   * Een toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter die door de gemeente aan een adresseerbaar object is gegeven.
   * @return huisnummertoevoeging
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bis", value = "Een toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter die door de gemeente aan een adresseerbaar object is gegeven.")

  public String getHuisnummertoevoeging() {
    return huisnummertoevoeging;
  }


  public void setHuisnummertoevoeging(String huisnummertoevoeging) {
    this.huisnummertoevoeging = huisnummertoevoeging;
  }


  public AdresUitgebreid postcode(String postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * De door PostNL vastgestelde code die bij een bepaalde combinatie van een straatnaam en een huisnummer hoort.
   * @return postcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6922KZ", value = "De door PostNL vastgestelde code die bij een bepaalde combinatie van een straatnaam en een huisnummer hoort.")

  public String getPostcode() {
    return postcode;
  }


  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public AdresUitgebreid woonplaats(String woonplaats) {
    
    this.woonplaats = woonplaats;
    return this;
  }

   /**
   * Een woonplaats is een gedeelte van het grondgebied van de gemeente met een naam.
   * @return woonplaats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Duiven", value = "Een woonplaats is een gedeelte van het grondgebied van de gemeente met een naam.")

  public String getWoonplaats() {
    return woonplaats;
  }


  public void setWoonplaats(String woonplaats) {
    this.woonplaats = woonplaats;
  }


  public AdresUitgebreid adresregel1(String adresregel1) {
    
    this.adresregel1 = adresregel1;
    return this;
  }

   /**
   * De eerste regel van het adres zoals deze gebruikt kan worden in postadressering.
   * @return adresregel1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Ln vd l D-Westervoort 1", value = "De eerste regel van het adres zoals deze gebruikt kan worden in postadressering.")

  public String getAdresregel1() {
    return adresregel1;
  }


  public void setAdresregel1(String adresregel1) {
    this.adresregel1 = adresregel1;
  }


  public AdresUitgebreid adresregel2(String adresregel2) {
    
    this.adresregel2 = adresregel2;
    return this;
  }

   /**
   * De tweede regel van het adres zoals deze gebruikt kan worden in postadressering.
   * @return adresregel2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6922 KZ  DUIVEN", value = "De tweede regel van het adres zoals deze gebruikt kan worden in postadressering.")

  public String getAdresregel2() {
    return adresregel2;
  }


  public void setAdresregel2(String adresregel2) {
    this.adresregel2 = adresregel2;
  }


  public AdresUitgebreid korteNaam(String korteNaam) {
    
    this.korteNaam = korteNaam;
    return this;
  }

   /**
   * De officiële openbareruimtenaam of een verkorte versie. Beiden hebben maximaal 24 tekens.
   * @return korteNaam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Ln vd l D-Westervoort", value = "De officiële openbareruimtenaam of een verkorte versie. Beiden hebben maximaal 24 tekens.")

  public String getKorteNaam() {
    return korteNaam;
  }


  public void setKorteNaam(String korteNaam) {
    this.korteNaam = korteNaam;
  }


  public AdresUitgebreid nummeraanduidingIdentificatie(String nummeraanduidingIdentificatie) {
    
    this.nummeraanduidingIdentificatie = nummeraanduidingIdentificatie;
    return this;
  }

   /**
   * Fungeert ook als identificatie van het adres.
   * @return nummeraanduidingIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0226200000038923", value = "Fungeert ook als identificatie van het adres.")

  public String getNummeraanduidingIdentificatie() {
    return nummeraanduidingIdentificatie;
  }


  public void setNummeraanduidingIdentificatie(String nummeraanduidingIdentificatie) {
    this.nummeraanduidingIdentificatie = nummeraanduidingIdentificatie;
  }


  public AdresUitgebreid openbareRuimteIdentificatie(String openbareRuimteIdentificatie) {
    
    this.openbareRuimteIdentificatie = openbareRuimteIdentificatie;
    return this;
  }

   /**
   * Get openbareRuimteIdentificatie
   * @return openbareRuimteIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0226300000136166", value = "")

  public String getOpenbareRuimteIdentificatie() {
    return openbareRuimteIdentificatie;
  }


  public void setOpenbareRuimteIdentificatie(String openbareRuimteIdentificatie) {
    this.openbareRuimteIdentificatie = openbareRuimteIdentificatie;
  }


  public AdresUitgebreid woonplaatsIdentificatie(String woonplaatsIdentificatie) {
    
    this.woonplaatsIdentificatie = woonplaatsIdentificatie;
    return this;
  }

   /**
   * Get woonplaatsIdentificatie
   * @return woonplaatsIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2096", value = "")

  public String getWoonplaatsIdentificatie() {
    return woonplaatsIdentificatie;
  }


  public void setWoonplaatsIdentificatie(String woonplaatsIdentificatie) {
    this.woonplaatsIdentificatie = woonplaatsIdentificatie;
  }


  public AdresUitgebreid adresseerbaarObjectIdentificatie(String adresseerbaarObjectIdentificatie) {
    
    this.adresseerbaarObjectIdentificatie = adresseerbaarObjectIdentificatie;
    return this;
  }

   /**
   * Get adresseerbaarObjectIdentificatie
   * @return adresseerbaarObjectIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0226010000038820", value = "")

  public String getAdresseerbaarObjectIdentificatie() {
    return adresseerbaarObjectIdentificatie;
  }


  public void setAdresseerbaarObjectIdentificatie(String adresseerbaarObjectIdentificatie) {
    this.adresseerbaarObjectIdentificatie = adresseerbaarObjectIdentificatie;
  }


  public AdresUitgebreid pandIdentificaties(List<String> pandIdentificaties) {
    
    this.pandIdentificaties = pandIdentificaties;
    return this;
  }

  public AdresUitgebreid addPandIdentificatiesItem(String pandIdentificatiesItem) {
    if (this.pandIdentificaties == null) {
      this.pandIdentificaties = new ArrayList<>();
    }
    this.pandIdentificaties.add(pandIdentificatiesItem);
    return this;
  }

   /**
   * Identificatie(s) van het pand of de panden waar het verblijfsobject deel van is.
   * @return pandIdentificaties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"0226100000008856\"]", value = "Identificatie(s) van het pand of de panden waar het verblijfsobject deel van is.")

  public List<String> getPandIdentificaties() {
    return pandIdentificaties;
  }


  public void setPandIdentificaties(List<String> pandIdentificaties) {
    this.pandIdentificaties = pandIdentificaties;
  }


  public AdresUitgebreid isNevenadres(Boolean isNevenadres) {
    
    this.isNevenadres = isNevenadres;
    return this;
  }

   /**
   * Indicatie dat dit adres een nevenadres is van een adresseerbaar object. Het adres is een hoofdadres als deze indicatie niet wordt meegeleverd.
   * @return isNevenadres
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicatie dat dit adres een nevenadres is van een adresseerbaar object. Het adres is een hoofdadres als deze indicatie niet wordt meegeleverd.")

  public Boolean getIsNevenadres() {
    return isNevenadres;
  }


  public void setIsNevenadres(Boolean isNevenadres) {
    this.isNevenadres = isNevenadres;
  }


  public AdresUitgebreid geconstateerd(Boolean geconstateerd) {
    
    this.geconstateerd = geconstateerd;
    return this;
  }

   /**
   * Indicatie dat dit adres in de registratie is opgenomen door een feitelijke constatering, zonder dat er sprake was van een brondocument/vergunning. Het adres is mogelijk illegaal.
   * @return geconstateerd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicatie dat dit adres in de registratie is opgenomen door een feitelijke constatering, zonder dat er sprake was van een brondocument/vergunning. Het adres is mogelijk illegaal.")

  public Boolean getGeconstateerd() {
    return geconstateerd;
  }


  public void setGeconstateerd(Boolean geconstateerd) {
    this.geconstateerd = geconstateerd;
  }


  public AdresUitgebreid mogelijkOnjuist(AdresMogelijkOnjuist mogelijkOnjuist) {
    
    this.mogelijkOnjuist = mogelijkOnjuist;
    return this;
  }

   /**
   * Get mogelijkOnjuist
   * @return mogelijkOnjuist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdresMogelijkOnjuist getMogelijkOnjuist() {
    return mogelijkOnjuist;
  }


  public void setMogelijkOnjuist(AdresMogelijkOnjuist mogelijkOnjuist) {
    this.mogelijkOnjuist = mogelijkOnjuist;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdresUitgebreid adresUitgebreid = (AdresUitgebreid) o;
    return Objects.equals(this.straat, adresUitgebreid.straat) &&
        Objects.equals(this.huisnummer, adresUitgebreid.huisnummer) &&
        Objects.equals(this.huisletter, adresUitgebreid.huisletter) &&
        Objects.equals(this.huisnummertoevoeging, adresUitgebreid.huisnummertoevoeging) &&
        Objects.equals(this.postcode, adresUitgebreid.postcode) &&
        Objects.equals(this.woonplaats, adresUitgebreid.woonplaats) &&
        Objects.equals(this.adresregel1, adresUitgebreid.adresregel1) &&
        Objects.equals(this.adresregel2, adresUitgebreid.adresregel2) &&
        Objects.equals(this.korteNaam, adresUitgebreid.korteNaam) &&
        Objects.equals(this.nummeraanduidingIdentificatie, adresUitgebreid.nummeraanduidingIdentificatie) &&
        Objects.equals(this.openbareRuimteIdentificatie, adresUitgebreid.openbareRuimteIdentificatie) &&
        Objects.equals(this.woonplaatsIdentificatie, adresUitgebreid.woonplaatsIdentificatie) &&
        Objects.equals(this.adresseerbaarObjectIdentificatie, adresUitgebreid.adresseerbaarObjectIdentificatie) &&
        Objects.equals(this.pandIdentificaties, adresUitgebreid.pandIdentificaties) &&
        Objects.equals(this.isNevenadres, adresUitgebreid.isNevenadres) &&
        Objects.equals(this.geconstateerd, adresUitgebreid.geconstateerd) &&
        Objects.equals(this.mogelijkOnjuist, adresUitgebreid.mogelijkOnjuist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(straat, huisnummer, huisletter, huisnummertoevoeging, postcode, woonplaats, adresregel1, adresregel2, korteNaam, nummeraanduidingIdentificatie, openbareRuimteIdentificatie, woonplaatsIdentificatie, adresseerbaarObjectIdentificatie, pandIdentificaties, isNevenadres, geconstateerd, mogelijkOnjuist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdresUitgebreid {\n");
    sb.append("    straat: ").append(toIndentedString(straat)).append("\n");
    sb.append("    huisnummer: ").append(toIndentedString(huisnummer)).append("\n");
    sb.append("    huisletter: ").append(toIndentedString(huisletter)).append("\n");
    sb.append("    huisnummertoevoeging: ").append(toIndentedString(huisnummertoevoeging)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    woonplaats: ").append(toIndentedString(woonplaats)).append("\n");
    sb.append("    adresregel1: ").append(toIndentedString(adresregel1)).append("\n");
    sb.append("    adresregel2: ").append(toIndentedString(adresregel2)).append("\n");
    sb.append("    korteNaam: ").append(toIndentedString(korteNaam)).append("\n");
    sb.append("    nummeraanduidingIdentificatie: ").append(toIndentedString(nummeraanduidingIdentificatie)).append("\n");
    sb.append("    openbareRuimteIdentificatie: ").append(toIndentedString(openbareRuimteIdentificatie)).append("\n");
    sb.append("    woonplaatsIdentificatie: ").append(toIndentedString(woonplaatsIdentificatie)).append("\n");
    sb.append("    adresseerbaarObjectIdentificatie: ").append(toIndentedString(adresseerbaarObjectIdentificatie)).append("\n");
    sb.append("    pandIdentificaties: ").append(toIndentedString(pandIdentificaties)).append("\n");
    sb.append("    isNevenadres: ").append(toIndentedString(isNevenadres)).append("\n");
    sb.append("    geconstateerd: ").append(toIndentedString(geconstateerd)).append("\n");
    sb.append("    mogelijkOnjuist: ").append(toIndentedString(mogelijkOnjuist)).append("\n");
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

