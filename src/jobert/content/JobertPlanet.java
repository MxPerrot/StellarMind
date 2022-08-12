package jobert.content

import arc.graphics.Color;
import arc.math.Mathf;;
import mindustry.content.Planets;
import mindustry.ctype.ContentList;
import mindustry.graphics.g3d.HexMesh;
import mindustry.graphics.g3d.SunMesh;
import mindustry.type.Planet;
//import jobert.maps.generators.PLANET;
//import jobert.maps.generators.PLANET;

public class JobertPlanet implements ContentList {
    public static Planet testing;

    public void load() {
        testing = new Planet("testing", Planets.sun, 1f, 3) {{
        localizedName = "Testing Planet";
        generator = new ErekirPlanetGenerator;
        startSector = 1;
        hasAtmosphere = true;
        atmosphereColor = Color.valueOf("8c3149");
        atmosphereRadIn = 0.01f;
        atmosphereRadOut = 0.4f;
        meshLoader = () -> new HexMesh(this, 5);
        orbitRadius = 4f;
        alwaysUnlocked = true;
        }};
    }
}
