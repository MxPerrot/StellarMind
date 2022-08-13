package jobert.content;

import mindustry.type.Planet;
import mindustry.content.Planets;
import mindustry.graphics.g3d.*;
import arc.graphics.Color;
import arc.math.*;
import arc.math.geom.*;
import mindustry.maps.planet.*;
import mindustry.world.*;
import jobert.*;

public class JBPlanets {
    public static Planet
    testing;

    public static void load() {
        
        testing = new Planet("testing", Planets.sun, 1f, 3) {{
            localizedName = "Testing Planet";
            description = "A testing planet.";
            // Atmosphère
            hasAtmosphere = true;
            atmosphereColor = Color.valueOf("8c3149");
            atmosphereRadIn = 0.01f;
            atmosphereRadOut = 0.4f;
            // Orbite
            orbitRadius = 2f;
            //Mesh
            meshLoader = () -> new HexMesh(this, 6);

            alwaysUnlocked = true;
        }};
    }
}
