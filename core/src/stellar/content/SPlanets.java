package stellar.content;

import mindustry.type.Planet;
import mindustry.content.Planets;
import mindustry.graphics.g3d.*;
import arc.graphics.Color;
import mindustry.maps.planet.*;
import mindustry.maps.generators.*;
import mindustry.world.*;
import stellar.*;
//import stellar.maps.generators.ArkansPlanetGenerator;

public class SPlanets {
    
    public static Planet
    elios,
    arkans,
    stella;
    
    public static void load() {
        
        elios = new Planet("elios", Planets.sun, 3.8f, 4) {{
            orbitRadius = 250f;
            drawOrbit = false;

            bloom = true;
            accessible= false;
            meshLoader = () -> new SunMesh(
                this, 4,
                5, 0.3, 1.7, 1.2, 1,
                1.1f,
                Color.valueOf("ed0c0c"),
                Color.valueOf("3c72c2c"),
                Color.valueOf("c72020"),
                Color.valueOf("c72020"),
                Color.valueOf("9c1e1e"),
                Color.valueOf("850707")
            );
            lightColor = Color.valueOf("c72020");
        }};

        arkans = new Planet("arkans", elios, 1f, 2) {{
            generator = new ErekirPlanetGenerator();
            // Atmosphère
            hasAtmosphere = true;
            atmosphereColor = Color.valueOf("363f9a");
            atmosphereRadIn = 0.02f;
            atmosphereRadOut = 0.3f;
            // Mesh
            landCloudColor = atmosphereColor.cpy().a(0.5f);
            meshLoader = () -> new HexMesh(this, 5);
            cloudMeshLoader = () -> new MultiMesh(
                      new HexSkyMesh(this, 11, 0.15f, 0.13f, 5, new Color().set(Color.valueOf("363f9a")).mul(0.9f).a(0.75f), 2, 0.45f, 0.9f, 0.38f),
                      new HexSkyMesh(this, 1, 0.6f, 0.16f, 5, Color.white.cpy().lerp(Color.valueOf("363f9a"), 0.55f).a(0.75f), 2, 0.45f, 1f, 0.41f)
                              );
            // Orbite 
            orbitRadius = 21f;
            alwaysUnlocked = true;
        }};

        stella = new Planet("stella", arkans, 0.5f, 1) {{
            generator = new ErekirPlanetGenerator();
            // Atmosphère
            hasAtmosphere = true;
            // Mesh
            meshLoader = () -> new HexMesh(this, 4);
            // Orbite 
            orbitRadius = 6.5f;
            accessible = false;
            
        }};
    }
}
