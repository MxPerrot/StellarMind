package jobert.content.Blocks;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.struct.*;
import arc.util.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.ui.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.units.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

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

        // Production
        largeCryofluidMixer = new GenericCrafter("large-cryofluid-mixer") {{
            requirements(Category.crafting, with (
                Items.lead, 120,
                Items.titanium, 130,
                Items.silicon, 85,
                Items.metaglass, 45
            ));
            size = 3;
            health = 340;
            destructible = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 20;

            craftTime = 60;
            consumes.power(2.33333333);
            consumes.liquid(Liquids.water, 0.3f);
            consumes.item(ItemStack.with(Items.titanium, 3));
            outputLiquid = new LiquidStack(cryofluid, 0.333333333f);            
        }};
    }
}
