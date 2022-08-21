package stellar.content;

import arc.graphics.*;
import mindustry.world.*;
import mindustry.content.*;
import mindustry.world.meta.*;
import mindustry.world.blocks.environment.*;

public class StellarEnvironment {
    public static Block
        floorArkans;

    public void load() {

        //Arkans
        floorArkans = new Floor("floor-arkans") {{
            mapColor = Color.valueOf("ad190e");
        }};
    }
}
