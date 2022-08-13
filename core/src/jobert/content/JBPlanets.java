package jobert.content;

import arc.func.*;
import arc.graphics.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.game.*;
import mindustry.graphics.*;
import mindustry.graphics.g3d.*;
import mindustry.graphics.g3d.PlanetGrid.*;
import mindustry.maps.planet.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.meta.*;
import mindustry.content.*;
import jobert.*;

public class JBPlanets {
    public static Planet
    testing;

    public static void load() {
        
        testing = new Planet("testing", Planets.sun, 1f, 3) {{
            localizedName = "Testing Planet";
            description = "A testing planet.";
            startSector = 1;
            // Atmosphère
            hasAtmosphere = true;
            atmosphereColor = Color.valueOf("8c3149");
            atmosphereRadIn = 0.01f;
            atmosphereRadOut = 0.4f;
            // Orbite
            orbitRadius = 2f;
            //Mesh
            meshLoader = () -> new HexMesh(this, 5);

            alwaysUnlocked = true;
        }};
    }
}
