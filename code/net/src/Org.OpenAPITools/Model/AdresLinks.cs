/*
 * Huidige bevragingen API
 *
 * Deze API levert actuele gegevens over adressen, adresseerbare objecten en panden. Actueel betekent in deze API `zonder eindstatus`. De bron voor deze API is de basisregistratie adressen en gebouwen (BAG).
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: bag@kadaster.nl
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// AdresLinks
    /// </summary>
    [DataContract]
    public partial class AdresLinks :  IEquatable<AdresLinks>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AdresLinks" /> class.
        /// </summary>
        /// <param name="self">self.</param>
        /// <param name="openbareRuimte">openbareRuimte.</param>
        /// <param name="nummeraanduiding">nummeraanduiding.</param>
        /// <param name="woonplaats">woonplaats.</param>
        /// <param name="adresseerbaarObject">adresseerbaarObject.</param>
        /// <param name="panden">Het/de aan het adres gerelateerde pand(en)..</param>
        public AdresLinks(HalLink self = default(HalLink), HalLink openbareRuimte = default(HalLink), HalLink nummeraanduiding = default(HalLink), HalLink woonplaats = default(HalLink), HalLink adresseerbaarObject = default(HalLink), List<HalLink> panden = default(List<HalLink>))
        {
            this.Self = self;
            this.OpenbareRuimte = openbareRuimte;
            this.Nummeraanduiding = nummeraanduiding;
            this.Woonplaats = woonplaats;
            this.AdresseerbaarObject = adresseerbaarObject;
            this.Panden = panden;
        }

        /// <summary>
        /// Gets or Sets Self
        /// </summary>
        [DataMember(Name="self", EmitDefaultValue=false)]
        public HalLink Self { get; set; }

        /// <summary>
        /// Gets or Sets OpenbareRuimte
        /// </summary>
        [DataMember(Name="openbareRuimte", EmitDefaultValue=false)]
        public HalLink OpenbareRuimte { get; set; }

        /// <summary>
        /// Gets or Sets Nummeraanduiding
        /// </summary>
        [DataMember(Name="nummeraanduiding", EmitDefaultValue=false)]
        public HalLink Nummeraanduiding { get; set; }

        /// <summary>
        /// Gets or Sets Woonplaats
        /// </summary>
        [DataMember(Name="woonplaats", EmitDefaultValue=false)]
        public HalLink Woonplaats { get; set; }

        /// <summary>
        /// Gets or Sets AdresseerbaarObject
        /// </summary>
        [DataMember(Name="adresseerbaarObject", EmitDefaultValue=false)]
        public HalLink AdresseerbaarObject { get; set; }

        /// <summary>
        /// Het/de aan het adres gerelateerde pand(en).
        /// </summary>
        /// <value>Het/de aan het adres gerelateerde pand(en).</value>
        [DataMember(Name="panden", EmitDefaultValue=false)]
        public List<HalLink> Panden { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AdresLinks {\n");
            sb.Append("  Self: ").Append(Self).Append("\n");
            sb.Append("  OpenbareRuimte: ").Append(OpenbareRuimte).Append("\n");
            sb.Append("  Nummeraanduiding: ").Append(Nummeraanduiding).Append("\n");
            sb.Append("  Woonplaats: ").Append(Woonplaats).Append("\n");
            sb.Append("  AdresseerbaarObject: ").Append(AdresseerbaarObject).Append("\n");
            sb.Append("  Panden: ").Append(Panden).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as AdresLinks);
        }

        /// <summary>
        /// Returns true if AdresLinks instances are equal
        /// </summary>
        /// <param name="input">Instance of AdresLinks to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AdresLinks input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Self == input.Self ||
                    (this.Self != null &&
                    this.Self.Equals(input.Self))
                ) && 
                (
                    this.OpenbareRuimte == input.OpenbareRuimte ||
                    (this.OpenbareRuimte != null &&
                    this.OpenbareRuimte.Equals(input.OpenbareRuimte))
                ) && 
                (
                    this.Nummeraanduiding == input.Nummeraanduiding ||
                    (this.Nummeraanduiding != null &&
                    this.Nummeraanduiding.Equals(input.Nummeraanduiding))
                ) && 
                (
                    this.Woonplaats == input.Woonplaats ||
                    (this.Woonplaats != null &&
                    this.Woonplaats.Equals(input.Woonplaats))
                ) && 
                (
                    this.AdresseerbaarObject == input.AdresseerbaarObject ||
                    (this.AdresseerbaarObject != null &&
                    this.AdresseerbaarObject.Equals(input.AdresseerbaarObject))
                ) && 
                (
                    this.Panden == input.Panden ||
                    this.Panden != null &&
                    input.Panden != null &&
                    this.Panden.SequenceEqual(input.Panden)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Self != null)
                    hashCode = hashCode * 59 + this.Self.GetHashCode();
                if (this.OpenbareRuimte != null)
                    hashCode = hashCode * 59 + this.OpenbareRuimte.GetHashCode();
                if (this.Nummeraanduiding != null)
                    hashCode = hashCode * 59 + this.Nummeraanduiding.GetHashCode();
                if (this.Woonplaats != null)
                    hashCode = hashCode * 59 + this.Woonplaats.GetHashCode();
                if (this.AdresseerbaarObject != null)
                    hashCode = hashCode * 59 + this.AdresseerbaarObject.GetHashCode();
                if (this.Panden != null)
                    hashCode = hashCode * 59 + this.Panden.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
