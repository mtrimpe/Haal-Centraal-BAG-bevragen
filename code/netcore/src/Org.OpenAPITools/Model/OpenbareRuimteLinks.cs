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
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// OpenbareRuimteLinks
    /// </summary>
    [DataContract(Name = "OpenbareRuimteLinks")]
    public partial class OpenbareRuimteLinks : IEquatable<OpenbareRuimteLinks>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OpenbareRuimteLinks" /> class.
        /// </summary>
        /// <param name="self">self.</param>
        /// <param name="woonplaats">woonplaats.</param>
        public OpenbareRuimteLinks(HalLink self = default(HalLink), HalLink woonplaats = default(HalLink))
        {
            this.Self = self;
            this.Woonplaats = woonplaats;
        }

        /// <summary>
        /// Gets or Sets Self
        /// </summary>
        [DataMember(Name = "self", EmitDefaultValue = false)]
        public HalLink Self { get; set; }

        /// <summary>
        /// Gets or Sets Woonplaats
        /// </summary>
        [DataMember(Name = "woonplaats", EmitDefaultValue = false)]
        public HalLink Woonplaats { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OpenbareRuimteLinks {\n");
            sb.Append("  Self: ").Append(Self).Append("\n");
            sb.Append("  Woonplaats: ").Append(Woonplaats).Append("\n");
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
            return this.Equals(input as OpenbareRuimteLinks);
        }

        /// <summary>
        /// Returns true if OpenbareRuimteLinks instances are equal
        /// </summary>
        /// <param name="input">Instance of OpenbareRuimteLinks to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OpenbareRuimteLinks input)
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
                    this.Woonplaats == input.Woonplaats ||
                    (this.Woonplaats != null &&
                    this.Woonplaats.Equals(input.Woonplaats))
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
                if (this.Woonplaats != null)
                    hashCode = hashCode * 59 + this.Woonplaats.GetHashCode();
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
