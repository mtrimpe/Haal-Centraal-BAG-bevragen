# language: nl

Functionaliteit: Als gebruiker wil ik met een geometrie (punt, bounding box, polygoon) kunnen zoeken naar resources, 
                 zodat ik gericht vervolgstappen kan definiëren m.b.t. de gevonden resources.

    De resources waarvan de geometrie tenminste één punt gemeenschappelijk hebben met de opgegeven geometrie worden geretourneerd.

    Referenties:
    - Haal Centraal Common - foutafhandeling.feature
    
    Het geometrisch zoeken met een punt geometrie kan met de parameter: locatie.

    Het geometrisch zoeken met een bounding box geometrie kan met de parameter: bbox.
    Het is ook mogelijk om een bounding box op te geven waarbij de coördinaten van de linker onderhoek en de rechter bovenhoek exact gelijk zijn.
    De werking is dan gelijk aan het zoeken met een locatie.
    
    Het geometrisch zoeken met een polygoon geometrie kan met de parameter: polygoon.


    Ondersteund worden:
    - het zoeken van panden op een locatie
    - het zoeken van adresseerbare objecten binnen een bounding box
    - het zoeken van panden binnen een bounding box
    - het zoeken van adressen binnen een vrije contour (polygoon, multipolygoon)
      Omdat adres een samengesteld object is en geen geometrie bevat, worden adressen bepaald op basis van het adresseerbare object dat aan een adres is gekoppeld.
      Daarbij worden hoofd- en nevenadressen van adresseerbare objecten geleverd, waarbij de adresseerbare object geometrie volgens de intersect spatial operator matcht met de opgegeven contour.

    Deze feature beschrijft geen scenario's waarbij objecten een geometrie van het type multi polygoon bevatten.
    Het enige object type waar dit voor geldt is een woonplaats, echter wordt het zoeken van woonplaatsen met locatie, bbox of polygoon niet ondersteund.

    Het zoeken met een multipolygoon wordt bij adressen ondersteund.
    Deze scenario's zijn niet apart beschreven, omdat het zoeken met een multipolygoon overeenkomt met het meerdere malen zoeken met een polygoon waarbij het resultaat wordt ontdaan van evt. dubbelingen.

    In de hierna volgende voorbeelden is een vereenvoudigde representatie gebruikt voor coördinaten.
    
    Voor een visualisatie van de scenario's zoals hieronder beschreven zie:
    - locatie voorbeelden: /images//locatie-voorbeelden.png
      De zwarte punten zijn de locaties waarmee wordt gezocht. 
      De overige figuren zijn de geometrieën van objecten.

    - bounding box voorbeelden: /images/bbox-voorbeelden.png
      De zwarte onderbroken lijnen geven de bbox aan waarmee wordt gezocht.
      De zwarte punt is de bounding box waarbij het punt linksonder en rechtsboven gelijk zijn en waarmee wordt gezocht. 
      De overige figuren zijn de geometrieën van objecten.

    - polygoon voorbeelden: /images/locatie-voorbeelden.png
      De zwarte onderbroken lijnen geven de bbox aan waarmee wordt gezocht. 
      De overige figuren zijn de geometrieën van objecten.

  Achtergrond:

    Gegeven de volgende verzameling van resources

    | identificatie | geometrie                                 | geometrie type |
    |---------------|-------------------------------------------|----------------|
    | 0001          | [[0,0],[10,0],[10,10],[0,10],[0,0]]       | polygoon       |
    | 0002          | [[12,0],[22,0],[22,10],[12,10],[12,0]]    | polygoon       |
    | 0003          | [[12,12],[22,12],[22,22],[12,22],[12,12]] | polygoon       |
    | 0004          | [[0,8],[10,8],[10,18],[0,18],[0,8]]       | polygoon       |
    | 0005          | [7,20]                                    | punt           |
    | 0006          | [17,17]                                   | punt           |
    | 0007          | [10,23]                                   | punt           |
    | 0008          | [13,21]                                   | punt           |
    
    
  Scenario: GET met locatie, locatie ligt binnen object geometrie
  
    Als er met de locatie=[5,5] wordt gezocht:
    En de geometrie van de resource intersects met de opgegeven geometrie (locatie)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie                     | geometrie type |
    |---------------|-------------------------------|----------------| 
    | 0001          | [[0,0],[10,0],[10,10],[0,10]] | polygoon       |

    Bijvoorbeeld:
      /panden?locatie=5,5

  Scenario: GET met locatie, locatie ligt op de rand van de object geometrie
  
    Als er met de locatie=[10,5] wordt gezocht:
    En de geometrie van de resource intersects met de opgegeven geometrie (locatie)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie                     | geometrie type |
    |---------------|-------------------------------|----------------| 
    | 0001          | [[0,0],[10,0],[10,10],[0,10]] | polygoon       |

    Bijvoorbeeld:
      /panden?locatie=10,5

  Scenario: GET met locatie, locatie gelijk aan object geometrie punt
  
    Als er met de locatie=[7,20] wordt gezocht:
    En de geometrie van de resource intersects met de opgegeven geometrie (locatie)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie | geometrie type |
    |---------------|-----------|----------------| 
    | 0005          | [7,20]    | punt           |

    Bijvoorbeeld:
      /panden?locatie=7,20

  Scenario: GET met locatie, Content-Crs (optioneel) en Accept-Crs (optioneel) meerdere resources met geometrie type polygoon
  
    Als er met de volgende parameters wordt gezocht:
    | locatie | Content-Crs | Accept-Crs |
    |---------|-------------|------------|
    | [5,9]   | -           | -          |
    | [5,9]   | EPSG:28992  | -          |
    | [5,9]   | -           | EPSG:28992 |
    | [5,9]   | EPSG:28992  | EPSG:28992 |
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects met de opgegeven geometrie (locatie)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie                           | geometrie type |
    |---------------|-------------------------------------|----------------| 
    | 0001          | [[0,0],[10,0],[10,10],[0,10],[0,0]] | polygoon       |
    | 0004          | [[0,8],[10,8],[10,18],[0,18],[0,8]] | polygoon       |

    Bijvoorbeeld:
      /panden?locatie=5,9

  Scenario: GET met locatie, Content-Crs (optioneel) en Accept-Crs (optioneel) meerdere resources met verschillende geometrie types
  
    Als er met de volgende parameters wordt gezocht:
    | locatie | Content-Crs | Accept-Crs |
    |---------|-------------|------------|
    | [17,17] | -           | -          |
    | [17,17] | EPSG:28992  | -          |
    | [17,17] | -           | EPSG:28992 |
    | [17,17] | EPSG:28992  | EPSG:28992 |
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects met de opgegeven geometrie (locatie)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie                                 | geometrie type |
    |---------------|-------------------------------------------|----------------| 
    | 0003          | [[12,12],[22,12],[22,22],[12,22],[12,12]] | polygoon       |
    | 0006          | [17,17]                                   | punt           |

    Bijvoorbeeld:
      /panden?locatie=17,17

  Scenario: GET met locatie, Content-Crs (optioneel) en Accept-Crs (optioneel) geen resources
  
    Als er met de volgende parameters wordt gezocht:
    | locatie | Content-Crs | Accept-Crs |
    |---------|-------------|------------|
    | [11,11] | -           | -          |
    | [11,11] | EPSG:28992  | -          |
    | [11,11] | -           | EPSG:28992 |
    | [11,11] | EPSG:28992  | EPSG:28992 |
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects niet met de opgegeven geometrie (locatie)
    Dan bevat het resultaat geen resources

    Bijvoorbeeld:
      /panden?locatie=11,11


  Scenario: GET met bounding box, Content-Crs (optioneel) en Accept-Crs (optioneel) één resource met geometrie type polygoon, bounding box binnen polygoon
  
    Als er met de volgende parameters wordt gezocht:
    | bbox           | Content-Crs | Accept-Crs |
    |----------------|-------------|------------|
    | [14,2],[18,6]  | -           | -          |
    | [14,2],[18,6]  | EPSG:28992  | -          |
    | [14,2],[18,6]  | -           | EPSG:28992 |
    | [14,2],[18,6]  | EPSG:28992  | EPSG:28992 |
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects met de opgegeven geometrie (bounding box)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie                              | geometrie type |
    |---------------|----------------------------------------|----------------| 
    | 0002          | [[12,0],[22,0],[22,10],[12,10],[12,0]] | polygoon       |

    Bijvoorbeeld:
      /panden?bbox=14,2,18,6

  Scenario: GET met bounding box, Content-Crs (optioneel) en Accept-Crs (optioneel) één resource met geometrie type polygoon, bounding box overlapt deels polygoon
  
    Als er met de volgende parameters wordt gezocht:
    | bbox           | Content-Crs | Accept-Crs |
    |----------------|-------------|------------|
    | [20,2],[24,6]  | -           | -          |
    | [20,2],[24,6]  | EPSG:28992  | -          |
    | [20,2],[24,6]  | -           | EPSG:28992 |
    | [20,2],[24,6]  | EPSG:28992  | EPSG:28992 |
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects met de opgegeven geometrie (bounding box)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie                              | geometrie type |
    |---------------|----------------------------------------|----------------| 
    | 0002          | [[12,0],[22,0],[22,10],[12,10],[12,0]] | polygoon       |

    Bijvoorbeeld:
      /panden?bbox=20,2,24,6

  Scenario: GET met bounding box, Content-Crs (optioneel) en Accept-Crs (optioneel) één resource met geometrie type polygoon, lijn bounding box overlapt (deels) met lijn polygoon
  
    Als er met de volgende parameters wordt gezocht:
    | bbox           | Content-Crs | Accept-Crs |
    |----------------|-------------|------------|
    | [20,7],[24,11] | -           | -          |
    | [20,7],[24,11] | EPSG:28992  | -          |
    | [20,7],[24,11] | -           | EPSG:28992 |
    | [20,7],[24,11] | EPSG:28992  | EPSG:28992 |
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects met de opgegeven geometrie (bounding box)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie                              | geometrie type |
    |---------------|----------------------------------------|----------------| 
    | 0002          | [[12,0],[22,0],[22,10],[12,10],[12,0]] | polygoon       |

    Bijvoorbeeld:
      /panden?bbox=20,7,24,11

Rule: het zoeken met een bouinding box levert objecten waarbij er tenminste één gemeenschappelijk punt is tussen de bounding box en de object geometrie

  Scenario: de hoek van bounding box raakt de rand van object geometrie (er is precies één gemeenschappelijk punt tussen de bounding box en de object geometrie)

  Scenario: er is een gedeeltijke overlap tussen de bounding box en de object geometrie



  Scenario: GET met bounding box, Content-Crs (optioneel) en Accept-Crs (optioneel) één resource met geometrie type polygoon, bounding box raakt polygoon
  
    Als er met de volgende parameters wordt gezocht:
    | bbox            | Content-Crs | Accept-Crs |
    |-----------------|-------------|------------|
    | [22,22],[26,26] | -           | -          |
    | [22,22],[26,26] | EPSG:28992  | -          |
    | [22,22],[26,26] | -           | EPSG:28992 |
    | [22,22],[26,26] | EPSG:28992  | EPSG:28992 |
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects met de opgegeven geometrie (bounding box)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie                                 | geometrie type |
    |---------------|-------------------------------------------|----------------| 
    | 0003          | [[12,12],[22,12],[22,22],[12,22],[12,12]] | polygoon       |

    Bijvoorbeeld:
      /panden?bbox=22,22,26,26

  Scenario: GET met bounding box, Content-Crs (optioneel) en Accept-Crs (optioneel) één resource met geometrie type punt, punt ligt op de rand van de bounding box
  
    Als er met de volgende parameters wordt gezocht:
    | bbox           | Content-Crs | Accept-Crs |
    |----------------|-------------|------------|
    | [6,19],[10,23] | -           | -          |
    | [6,19],[10,23] | EPSG:28992  | -          |
    | [6,19],[10,23] | -           | EPSG:28992 |
    | [6,19],[10,23] | EPSG:28992  | EPSG:28992 |
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects met de opgegeven geometrie (bounding box)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie | geometrie type |
    |---------------|-----------|----------------| 
    | 0007          | [10,23]   | punt           |

    Bijvoorbeeld:
      /panden?bbox=6,19,10,23

  Scenario: GET met bounding box, Content-Crs (optioneel) en Accept-Crs (optioneel) één resource met geometrie type punt, punt ligt binnen de bounding box
  
    Als er met de volgende parameters wordt gezocht:
    | bbox           | Content-Crs | Accept-Crs |
    |----------------|-------------|------------|
    | [7,20],[11,24] | -           | -          |
    | [7,20],[11,24] | EPSG:28992  | -          |
    | [7,20],[11,24] | -           | EPSG:28992 |
    | [7,20],[11,24] | EPSG:28992  | EPSG:28992 |
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects met de opgegeven geometrie (bounding box)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie | geometrie type |
    |---------------|-----------|----------------| 
    | 0007          | [10,23]   | punt           |

    Bijvoorbeeld:
      /panden?bbox=7,20,11,24

  Scenario: GET met bounding box, Content-Crs (optioneel) en Accept-Crs (optioneel) meerdere resources met geometrie type polygoon
  
    Als er met de volgende parameters wordt gezocht:
    | bbox          | Content-Crs | Accept-Crs |
    |---------------|-------------|------------|
    | [9,9],[13,13] | -           | -          |
    | [9,9],[13,13] | EPSG:28992  | -          |
    | [9,9],[13,13] | -           | EPSG:28992 |
    | [9,9],[13,13] | EPSG:28992  | EPSG:28992 |
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects met de opgegeven geometrie (bounding box)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie                                | geometrie type |
    |---------------|------------------------------------------|----------------|
    | 0001          | [[0,0],[10,0],[10,10],[0,10],[0,0]]      | polygoon       |
    | 0002          | [12,0],[22,0],[22,10],[12,10],[12,0]]    | polygoon       |
    | 0003          | [12,12],[22,12],[22,22],[12,22],[12,12]] | polygoon       |
    | 0004          | [[0,8],[10,8],[10,18],[0,18],[0,8]]      | polygoon       |

    Bijvoorbeeld:
      /panden?bbox=9,9,13,13

  Scenario: GET met bounding box, Content-Crs (optioneel) en Accept-Crs (optioneel) meerdere resources met verschillende geometrie types
  
    Als er met de volgende parameters wordt gezocht:
    | bbox            | Content-Crs | Accept-Crs |
    |-----------------|-------------|------------|
    | [12,20],[16,24] | -           | -          |
    | [12,20],[16,24] | EPSG:28992  | -          |
    | [12,20],[16,24] | -           | EPSG:28992 |
    | [12,20],[16,24] | EPSG:28992  | EPSG:28992 |
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects met de opgegeven geometrie (bounding box)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie                                | geometrie type |
    |---------------|------------------------------------------|----------------|
    | 0003          | [12,12],[22,12],[22,22],[12,22],[12,12]] | polygoon       |
    | 0008          | [13,21]                                  | punt           |

    Bijvoorbeeld:
      /panden?bbox=12,20,16,24

  Scenario: GET met bounding box, Content-Crs (optioneel) en Accept-Crs (optioneel) gelijke coördinaten, één resource met geomtrie type polygoon
  
    Als er met de volgende parameters wordt gezocht:
    | bbox        | Content-Crs | Accept-Crs |
    |-------------|-------------|------------|
    | [5,5],[5,5] | -           | -          |
    | [5,5],[5,5] | EPSG:28992  | -          |
    | [5,5],[5,5] | -           | EPSG:28992 |
    | [5,5],[5,5] | EPSG:28992  | EPSG:28992 |
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects met de opgegeven geometrie (bounding box)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie                           | geometrie type |
    |---------------|-------------------------------------|----------------| 
    | 0001          | [[0,0],[10,0],[10,10],[0,10],[0,0]] | polygoon       |
    En is het resultaat hetzelfde wanneer er bij het endpoint /panden?locatie=<coördinaat> dezelfde coördinaat wordt opgegeven

    Bijvoorbeeld:
      /panden?bbox=5,5,5,5

  Scenario: GET met bounding box, Content-Crs (optioneel) en Accept-Crs (optioneel) geen resources
  
    Als er met de volgende parameters wordt gezocht:
    | bbox          | Content-Crs | Accept-Crs |
    |---------------|-------------|------------|
    | [1,20],[5,24] | -           | -          |
    | [1,20],[5,24] | EPSG:28992  | -          |
    | [1,20],[5,24] | -           | EPSG:28992 |
    | [1,20],[5,24] | EPSG:28992  | EPSG:28992 |
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects niet met de opgegeven geometrie (bounding box)
    Dan bevat het resultaat geen resources

    Bijvoorbeeld:
      /panden?bbox=1,20,5,24


  Scenario: POST met polygoon, Content-Crs (optioneel) en Accept-Crs (optioneel) één resource met geometrie type polygoon, zoek polygoon valt binnen gezochte polygoon
  
    Als er met de volgende parameters wordt gezocht:
    | polygoon                                       | Content-Crs | Accept-Crs |
    |------------------------------------------------|-------------|------------|
    | [[13,3],[21,1],[21,6],[17,8],[17,5],[13,3]]    | -           | -          |
    | [[13,3],[21,1],[21,6],[17,8],[17,5],[13,3]]    | EPSG:28992  | -          |
    | [[13,3],[21,1],[21,6],[17,8],[17,5],[13,3]]    | -           | EPSG:28992 |
    | [[13,3],[21,1],[21,6],[17,8],[17,5],[13,3]]    | EPSG:28992  | EPSG:28992 |
    En de polygoon is in WKT formaat
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects met de opgegeven geometrie (polygoon)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie                              | geometrie type |
    |---------------|----------------------------------------|----------------| 
    | 0002          | [[12,0],[22,0],[22,10],[12,10],[12,0]] | polygoon       |

    Bijvoorbeeld:
      /adressen
      Request body:
      {
        "geometrie": {
          "intersects": "POLYGON ((13 3,21 1,21 6,17 8,17 5,13 3))"
        }
      }

  Scenario: POST met polygoon, Content-Crs (optioneel) en Accept-Crs (optioneel) één resource met geometrie type polygoon, zoek polygoon raakt gezochte polygoon
  
    Als er met de volgende parameters wordt gezocht:
    | polygoon                                       | Content-Crs | Accept-Crs |
    |------------------------------------------------|-------------|------------|
    | [[22,2],[30,0],[30,5],[26,7],[26,4],[22,2]]    | -           | -          |
    | [[22,2],[30,0],[30,5],[26,7],[26,4],[22,2]]    | EPSG:28992  | -          |
    | [[22,2],[30,0],[30,5],[26,7],[26,4],[22,2]]    | -           | EPSG:28992 |
    | [[22,2],[30,0],[30,5],[26,7],[26,4],[22,2]]    | EPSG:28992  | EPSG:28992 |
    En de polygoon is in WKT formaat
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects met de opgegeven geometrie (polygoon)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie                              | geometrie type |
    |---------------|----------------------------------------|----------------| 
    | 0002          | [[12,0],[22,0],[22,10],[12,10],[12,0]] | polygoon       |

    Bijvoorbeeld:
      /adressen
      Request body:
      {
        "geometrie": {
          "intersects": "POLYGON ((22 2,30 0,30 5,26 7,26 4,22 2))"
        }
      }

  Scenario: POST met polygoon, Content-Crs (optioneel) en Accept-Crs (optioneel) één resource met geometrie type polygoon, polygonen overlappen deels
  
    Als er met de volgende parameters wordt gezocht:
    | polygoon                                       | Content-Crs | Accept-Crs |
    |------------------------------------------------|-------------|------------|
    | [[20,9],[28,7],[28,12],[24,14],[24,11],[20,9]] | -           | -          |
    | [[20,9],[28,7],[28,12],[24,14],[24,11],[20,9]] | EPSG:28992  | -          |
    | [[20,9],[28,7],[28,12],[24,14],[24,11],[20,9]] | -           | EPSG:28992 |
    | [[20,9],[28,7],[28,12],[24,14],[24,11],[20,9]] | EPSG:28992  | EPSG:28992 |
    En de polygoon is in WKT formaat
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects met de opgegeven geometrie (polygoon)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie                              | geometrie type |
    |---------------|----------------------------------------|----------------| 
    | 0002          | [[12,0],[22,0],[22,10],[12,10],[12,0]] | polygoon       |

    Bijvoorbeeld:
      /adressen
      Request body:
      {
        "geometrie": {
          "intersects": "POLYGON ((20 9,28 7,28 12,24 14,24 11,20 9))"
        }
      }

  Scenario: POST met polygoon, Content-Crs (optioneel) en Accept-Crs (optioneel) één resource met geometrie type punt, punt raakt polygoon
  
    Als er met de volgende parameters wordt gezocht:
    | polygoon                                       | Content-Crs | Accept-Crs |
    |------------------------------------------------|-------------|------------|
    | [[2,21],[10,19],[10,24],[6,26],[6,23],[2,21]]  | -           | -          |
    | [[2,21],[10,19],[10,24],[6,26],[6,23],[2,21]]  | EPSG:28992  | -          |
    | [[2,21],[10,19],[10,24],[6,26],[6,23],[2,21]]  | -           | EPSG:28992 |
    | [[2,21],[10,19],[10,24],[6,26],[6,23],[2,21]]  | EPSG:28992  | EPSG:28992 |
    En de polygoon is in WKT formaat
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects met de opgegeven geometrie (polygoon)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie | geometrie type |
    |---------------|-----------|----------------| 
    | 0007          | [10,23]   | punt           |

    Bijvoorbeeld:
      /adressen
      Request body:
      {
        "geometrie": {
          "intersects": "POLYGON ((2 21,10 19,10 24,6 26,6 23,2 21))"
        }
      }

  Scenario: POST met polygoon, Content-Crs (optioneel) en Accept-Crs (optioneel) één resource met geometrie type punt, punt binnen polygoon
  
    Als er met de volgende parameters wordt gezocht:
    | polygoon                                       | Content-Crs | Accept-Crs |
    |------------------------------------------------|-------------|------------|
    | [[3,21],[11,19],[11,24],[7,26],[7,23],[3,21]]  | -           | -          |
    | [[3,21],[11,19],[11,24],[7,26],[7,23],[3,21]]  | EPSG:28992  | -          |
    | [[3,21],[11,19],[11,24],[7,26],[7,23],[3,21]]  | -           | EPSG:28992 |
    | [[3,21],[11,19],[11,24],[7,26],[7,23],[3,21]]  | EPSG:28992  | EPSG:28992 |
    En de polygoon is in WKT formaat
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects met de opgegeven geometrie (polygoon)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie | geometrie type |
    |---------------|-----------|----------------| 
    | 0007          | [10,23]   | punt           |

    Bijvoorbeeld:
      /adressen
      Request body:
      {
        "geometrie": {
          "intersects": "POLYGON ((3 21,11 19,11 24,7 26,7 23,3 21))"
        }
      }

  Scenario: POST met polygoon, Content-Crs (optioneel) en Accept-Crs (optioneel) meerdere resources met geometrie type polygoon
  
    Als er met de volgende parameters wordt gezocht:
    | polygoon                                     | Content-Crs | Accept-Crs |
    |----------------------------------------------|-------------|------------|
    | [[7,9],[15,7],[15,12],[11,13],[11,11],[7,9]] | -           | -          |
    | [[7,9],[15,7],[15,12],[11,13],[11,11],[7,9]] | EPSG:28992  | -          |
    | [[7,9],[15,7],[15,12],[11,13],[11,11],[7,9]] | -           | EPSG:28992 |
    | [[7,9],[15,7],[15,12],[11,13],[11,11],[7,9]] | EPSG:28992  | EPSG:28992 |
    En de polygoon is in WKT formaat
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects met de opgegeven geometrie (polygoon)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie                                 | geometrie type |
    |---------------|-------------------------------------------|----------------|
    | 0001          | [[0,0],[10,0],[10,10],[0,10],[0,0]]       | polygoon       |
    | 0002          | [[12,0],[22,0],[22,10],[12,10],[12,0]]    | polygoon       |
    | 0003          | [[12,12],[22,12],[22,22],[12,22],[12,12]] | polygoon       |
    | 0004          | [[0,8],[10,8],[10,18],[0,18],[0,8]]       | polygoon       |

    Bijvoorbeeld:
      /adressen
      Request body:
      {
        "geometrie": {
          "intersects": "POLYGON ((7 9,15 7,15 12,11 13,11 11,7 9))"
        }
      }

  Scenario: POST met polygoon, Content-Crs (optioneel) en Accept-Crs (optioneel) meerdere resources met verschillende geometrie types
  
    Als er met de volgende parameters wordt gezocht:
    | polygoon                                          | Content-Crs | Accept-Crs |
    |---------------------------------------------------|-------------|------------|
    | [[12,21],[20,19],[20,24],[16,26],[16,23],[12,21]] | -           | -          |
    | [[12,21],[20,19],[20,24],[16,26],[16,23],[12,21]] | EPSG:28992  | -          |
    | [[12,21],[20,19],[20,24],[16,26],[16,23],[12,21]] | -           | EPSG:28992 |
    | [[12,21],[20,19],[20,24],[16,26],[16,23],[12,21]] | EPSG:28992  | EPSG:28992 |
    En de polygoon is in WKT formaat
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects met de opgegeven geometrie (polygoon)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie                                 | geometrie type |
    |---------------|-------------------------------------------|----------------|
    | 0003          | [[12,12],[22,12],[22,22],[12,22],[12,12]] | polygoon       |
    | 0008          | [13,21]                                   | punt           |

    Bijvoorbeeld:
      /adressen
      Request body:
      {
        "geometrie": {
          "intersects": "POLYGON ((12 21,20 19,20 24,16 26,16 23,12 21))"
        }
      }

  Scenario: POST met polygoon, Content-Crs (optioneel) en Accept-Crs (optioneel) geen resources
  
    Als er met de volgende parameters wordt gezocht:
    | polygoon                                    | Content-Crs | Accept-Crs |
    |---------------------------------------------|-------------|------------|
    | [[1,21],[9,19],[9,24],[5,26],[5,23],[1,21]] | -           | -          |
    | [[1,21],[9,19],[9,24],[5,26],[5,23],[1,21]] | EPSG:28992  | -          |
    | [[1,21],[9,19],[9,24],[5,26],[5,23],[1,21]] | -           | EPSG:28992 |
    | [[1,21],[9,19],[9,24],[5,26],[5,23],[1,21]] | EPSG:28992  | EPSG:28992 |
    En de provider ondersteunt het CRS in Content-Crs
    En de provicer ondersteunt het CRS in Accept-Crs
    En de geometrie van de resource intersects niet met de opgegeven geometrie (polygoon)
    Dan bevat het resultaat geen resources

    Bijvoorbeeld:
      /adressen
      Request body:
      {
        "geometrie": {
          "intersects": "POLYGON ((1 21,9 19,9 24,5 26,5 23,1 21))"
        }
      }

  Abstract scenario: POST met polygoon, Content-Crs (optioneel) en Accept-Crs (optioneel) header combinatiesmeerdere resources met geometrie type polygoon
  
    Als er een POST wordt gedaan op /adressen met de request body '<geometrie>'
    En de Content-Crs header waarde '<Content-Crs>'
    En de Accept-Crs header waarde '<Accept-Crs>'
    En de geometrie van de resource intersects met de opgegeven geometrie (polygoon)
    Dan bevat het resultaat de volgende resources:
    | identificatie | geometrie                                 | geometrie type |
    |---------------|-------------------------------------------|----------------|
    | 0001          | [[0,0],[10,0],[10,10],[0,10],[0,0]]       | polygoon       |
    | 0002          | [[12,0],[22,0],[22,10],[12,10],[12,0]]    | polygoon       |
    | 0003          | [[12,12],[22,12],[22,22],[12,22],[12,12]] | polygoon       |
    | 0004          | [[0,8],[10,8],[10,18],[0,18],[0,8]]       | polygoon       |

    Voorbeelden
    | request body                                                                         | Content-Crs | Accept-Crs |
    |--------------------------------------------------------------------------------------|-------------|------------|
    | { "geometrie": { "intersects": "POLYGON ((7 9, 15 7, 15 12, 11 13, 11 11, 7 9))" } } | -           | -          |
    | { "geometrie": { "intersects": "POLYGON ((7 9, 15 7, 15 12, 11 13, 11 11, 7 9))" } } | EPSG:28992  | -          |
    | { "geometrie": { "intersects": "POLYGON ((7 9, 15 7, 15 12, 11 13, 11 11, 7 9))" } } | -           | EPSG:28992 |
    | { "geometrie": { "intersects": "POLYGON ((7 9, 15 7, 15 12, 11 13, 11 11, 7 9))" } } | EPSG:28992  | EPSG:28992 |






Nauwkeurigheid > dan aantal decimalen

Nauwkeurigheid < dan aantal decimalen


