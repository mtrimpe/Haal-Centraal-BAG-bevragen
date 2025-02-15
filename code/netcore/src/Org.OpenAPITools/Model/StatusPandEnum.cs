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
    /// Defines StatusPandEnum
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum StatusPandEnum
    {
        /// <summary>
        /// Enum BouwvergunningVerleend for value: Bouwvergunning verleend
        /// </summary>
        [EnumMember(Value = "Bouwvergunning verleend")]
        BouwvergunningVerleend = 1,

        /// <summary>
        /// Enum BouwGestart for value: Bouw gestart
        /// </summary>
        [EnumMember(Value = "Bouw gestart")]
        BouwGestart = 2,

        /// <summary>
        /// Enum PandInGebruiknietIngemeten for value: Pand in gebruik (niet ingemeten)
        /// </summary>
        [EnumMember(Value = "Pand in gebruik (niet ingemeten)")]
        PandInGebruiknietIngemeten = 3,

        /// <summary>
        /// Enum PandInGebruik for value: Pand in gebruik
        /// </summary>
        [EnumMember(Value = "Pand in gebruik")]
        PandInGebruik = 4,

        /// <summary>
        /// Enum VerbouwingPand for value: Verbouwing pand
        /// </summary>
        [EnumMember(Value = "Verbouwing pand")]
        VerbouwingPand = 5,

        /// <summary>
        /// Enum SloopvergunningVerleend for value: Sloopvergunning verleend
        /// </summary>
        [EnumMember(Value = "Sloopvergunning verleend")]
        SloopvergunningVerleend = 6,

        /// <summary>
        /// Enum PandBuitenGebruik for value: Pand buiten gebruik
        /// </summary>
        [EnumMember(Value = "Pand buiten gebruik")]
        PandBuitenGebruik = 7

    }

}
