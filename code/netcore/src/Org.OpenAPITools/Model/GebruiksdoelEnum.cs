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
    /// Defines GebruiksdoelEnum
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum GebruiksdoelEnum
    {
        /// <summary>
        /// Enum Woonfunctie for value: woonfunctie
        /// </summary>
        [EnumMember(Value = "woonfunctie")]
        Woonfunctie = 1,

        /// <summary>
        /// Enum Bijeenkomstfunctie for value: bijeenkomstfunctie
        /// </summary>
        [EnumMember(Value = "bijeenkomstfunctie")]
        Bijeenkomstfunctie = 2,

        /// <summary>
        /// Enum Celfunctie for value: celfunctie
        /// </summary>
        [EnumMember(Value = "celfunctie")]
        Celfunctie = 3,

        /// <summary>
        /// Enum Gezondheidszorgfunctie for value: gezondheidszorgfunctie
        /// </summary>
        [EnumMember(Value = "gezondheidszorgfunctie")]
        Gezondheidszorgfunctie = 4,

        /// <summary>
        /// Enum Industriefunctie for value: industriefunctie
        /// </summary>
        [EnumMember(Value = "industriefunctie")]
        Industriefunctie = 5,

        /// <summary>
        /// Enum Kantoorfunctie for value: kantoorfunctie
        /// </summary>
        [EnumMember(Value = "kantoorfunctie")]
        Kantoorfunctie = 6,

        /// <summary>
        /// Enum Logiesfunctie for value: logiesfunctie
        /// </summary>
        [EnumMember(Value = "logiesfunctie")]
        Logiesfunctie = 7,

        /// <summary>
        /// Enum Onderwijsfunctie for value: onderwijsfunctie
        /// </summary>
        [EnumMember(Value = "onderwijsfunctie")]
        Onderwijsfunctie = 8,

        /// <summary>
        /// Enum Sportfunctie for value: sportfunctie
        /// </summary>
        [EnumMember(Value = "sportfunctie")]
        Sportfunctie = 9,

        /// <summary>
        /// Enum Winkelfunctie for value: winkelfunctie
        /// </summary>
        [EnumMember(Value = "winkelfunctie")]
        Winkelfunctie = 10,

        /// <summary>
        /// Enum OverigeGebruiksfunctie for value: overige gebruiksfunctie
        /// </summary>
        [EnumMember(Value = "overige gebruiksfunctie")]
        OverigeGebruiksfunctie = 11

    }

}
