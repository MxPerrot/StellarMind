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
import mindustry.content.*

public class JobertPlanets{
    public static Planet testing;

    public void load() {
        
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
            orbitTime = Mathf.pow((2.0f + 14.0f + 0.66f), 1.5f) * 80;
            //Mesh
            meshLoader = () -> new HexMesh(this, 5);

            alwaysUnlocked = true;
        }};
    }
}
