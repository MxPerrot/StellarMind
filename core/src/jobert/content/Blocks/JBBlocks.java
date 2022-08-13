package jobert.content.Blocks;

import mindustry.content.Items;
import mindustry.ctype.ContentType;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.meta.BuildVisibility;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;
import static jobert.content.Blocks.*;

public class JBBlocks {
    public static Block

        //Environment
        
        //Transportation
        
        //Power
        
        //Production
        largeCryofluidMixer;
        
        //Units
        
        //Turrets
        
        //Walls
        
        private ContentType[] blocksContent = {
                new JBProduction(),
        };

    public static void load() {
        JBProduction.load();

        };
    }
}
