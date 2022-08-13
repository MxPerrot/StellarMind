package jobert.content;

import mindustry.type.Planet;
import mindustry.content.Planets;
import mindustry.graphics.g3d.*;
import arc.graphics.Color;
import mindustry.maps.planet.*;
import mindustry.maps.generators.*;
import mindustry.world.*;
import jobert.*;

public class JBPlanets {
    
    public static Planet
    testing,
    moon;
    
    public static void load() {
        
        moon = new Planet("moon", JBPlanets.testing, 1f, 1) {{
            localizedName = "Test moon";
            description = "A testing moon.";
            landCloudColor = atmosphereColor.cpy().a(0.5f);
            generator = new ErekirPlanetGenerator();
            // Atmosphère
            hasAtmosphere = false;
            // Mesh
            meshLoader = () -> new HexMesh(this, 2);
            // Orbite 
            orbitRadius = 8.0f;

            alwaysUnlocked = true;
            
            //launchCandidates = Seq<testing>;
        }};
        

        testing = new Planet("Arkans", Planets.sun, 1f, 3) {{
            localizedName = "Arkans";
            description = "A testing planet.";
            landCloudColor = atmosphereColor.cpy().a(0.5f);
            generator = new ErekirPlanetGenerator();
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
                              );
            // Orbite 
            orbitRadius = 26.5f;

            alwaysUnlocked = true;
        }};
    }
}
