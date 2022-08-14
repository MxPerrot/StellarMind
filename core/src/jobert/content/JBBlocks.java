package jobert.content.Blocks;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.world.Block.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;
import static mindustry.type.LiquidStack.*;
import static mindustry.world.meta.BuildVisibility.*;

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
        

    public static void load() {

        // Production
        largeCryofluidMixer = new GenericCrafter("large-cryofluid-mixer"){{
            requirements(Category.crafting, with(
                Items.lead, 12,
                Items.titanium, 130,
                Items.silicon, 85,
                Items.metaglass, 45
            ));
            size = 3;
            health = 340;
            destructible = true;
            breakable = true;
            placeablePlayer = true;

            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 20;
            liquidCapacity= 36;

            craftTime = 60;
            consumePower(2.33333333f);
            consumesLiquid(new LiquidStack(water, 0.3f));
            consumesItem(new ItemStack(Items.titanium, 3));
            outputLiquid = new LiquidStack(Liquids.cryofluid, 0.366666667f);
            buildVisibility = sandboxOnly;
        }};
    }
}
