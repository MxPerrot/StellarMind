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
            landCloudColor = atmosphereColor.cpy().a(0.5f);
            // Atmosphère
            hasAtmosphere = true;
            atmosphereColor = Color.valueOf("363f9a");
            atmosphereRadIn = 0.01f;
            atmosphereRadOut = 0.4f;
            // Mesh
            meshLoader = () -> new HexMesh(this, 6);
            cloudMeshLoader = () -> new MultiMesh(
                      new HexSkyMesh(this, 11, 0.15f, 0.13f, 5, new Color().set(Color.valueOf("363f9a")).mul(0.9f).a(0.75f), 2, 0.45f, 0.9f, 0.38f),
                      new HexSkyMesh(this, 1, 0.6f, 0.16f, 5, Color.white.cpy().lerp(Color.valueOf("363f9a"), 0.55f).a(0.75f), 2, 0.45f, 1f, 0.41f)
            // Orbite 
            orbitRadius = 2f;

            alwaysUnlocked = true;
        }};
    }
}
