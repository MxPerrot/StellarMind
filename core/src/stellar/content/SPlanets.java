package stellar.content;

import arc.math.*;
import arc.graphics.Color;
import mindustry.graphics.g3d.*;
import mindustry.type.Planet;
import mindustry.content.Planets;
import mindustry.maps.planet.*;
import mindustry.maps.generators.*;
import mindustry.world.*;
import stellar.*;
import stellar.maps.planet.ArkansPlanetGenerator;

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
                this, 6,
		      5, 0.3, 1.7, 1.2, 1,
                      1.1f,
                    Color.valueOf("f70a0a"),
                    Color.valueOf("f21f1f"),
                    Color.valueOf("f53838"),
                    Color.valueOf("fa5555"),
                    Color.valueOf("f26b6b"),
                    Color.valueOf("f79979")
            );
        }};


        arkans = new Planet("arkans", elios, 1f, 2) {{
            generator = new ArkansPlanetGenerator();
            // Atmosphere
            hasaAmosphere = true;
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
            // Orbit 
            orbitRadius = 21f;
            alwaysUnlocked = true;
            // Rules 
            ruleSetter = r -> {
	         r.fog = true;
	    };
        }};

        stella = new Planet("stella", arkans, 0.5f, 1) {{
            generator = new AsteroidGenerator();
            // Atmosphere
            hasAtmosphere = true;
            atmosphereColor = Color.valueOf("32cf7b");
            // Mesh
            meshLoader = () -> new HexMesh(this, 4);
            // Orbit 
            orbitRadius = 6.5f;
            orbitTime = Mathf.pow(orbitRadius, 1.5f) * 100;
            accessible = false;
            
        }};
    }
}
