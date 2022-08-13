package jobert.content;

import mindustry.type.Planet;
import mindustry.content.Planets;
import mindustry.graphics.g3d.*;
import arc.graphics.Color;
import mindustry.maps.planet.*;
import mindustry.maps.generators.*;
import mindustry.world.*;
import jobert.*;
//import jobert.maps.generators.ArkansPlanetGenerator;
//import jobert.maps.generators.StellaPlanetGenerator;

public class JBPlanets {
    
    public static Planet
    elios,
    arkans,
    stella;
    
    public static void load() {
        
        elios = new Planet("elios", Planets.sun, 3.8f, 4) {{
            localizedName= "Elios";
            description = "A star.";
            hasAtmosphere= true;
            meshLoader = () -> new SunMesh(
                this, 4, 5, 0.3f, 1.0f, 1.2f, 1, 1.3f,
                Color.valueOf("0fd0d4"),
                Color.valueOf("11f1f5"),
                Color.valueOf("09adb0"),
                Color.valueOf("0983b0"),
                Color.valueOf("0ba6de"),
                Color.valueOf("24b7ed")
            );
            lightColor = Color.valueOf("0983b0");
            orbitRadius = 250f;
            drawOrbit = false;
            bloom = true;
        }};

        arkans = new Planet("arkans", elios, 2f, 8) {{
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
            orbitRadius = 21f;
            alwaysUnlocked = true;
        }};

        stella = new Planet("stella", arkans, 0.6f, 1) {{
            localizedName = "Stella";
            description = "A testing moon.";
            generator = new ErekirPlanetGenerator();
            // Atmosphère
            hasAtmosphere = true;
            atmosphereRadIn = 0.01f;
            atmosphereRadOut = 0.4f;
            // Mesh
            meshLoader = () -> new HexMesh(this, 5);
            // Orbite 
            orbitRadius = 6.5f;
            alwaysUnlocked = true;
            
            //launchCandidates = Seq<testing>;
        }};
    }
}
