package stellar.content;

import arc.*;
import arc.Core;
import arc.util.*;
import arc.math.*;
import arc.struct.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.ctype.*;
import mindustry.content.*;
import mindustry.graphics.*;
import mindustry.entities.part.*;
import mindustry.entities.bullet.*;
import mindustry.entities.pattern.*;
import mindustry.world.*;
import mindustry.world.Block;
import mindustry.world.meta.*;
import mindustry.world.draw.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.units.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.power.PowerGenerator;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.defense.turrets.*;

import static mindustry.type.ItemStack.*;

public class StellarBlocks {
    public static Block

        //Arkans
        coreTest,


        //TODO Delete or rework
        //Other
        largeCryofluidMixer;

        //Sandbox


    public void load() {

        //Arkans
        coreTest = new CoreBlock("core-test") {{
	    requirements(Category.effect, with(
		    Items.copper, 1
	    ));
	    size = 4;
	    health = 3800;
	    itemCapacity = 3000;
	    alwaysUnlocked = isFirstTier = true;
	    hasPower = true;
            powerProduction = 5f;

	    //unitType =;
	}};


        // Other TODO Delete or rework
        largeCryofluidMixer = new GenericCrafter("large-cryofluid-mixer"){{
            requirements(Category.crafting, BuildVisibility.sandboxOnly, with(
                Items.lead, 140,
                Items.titanium, 130,
                Items.silicon, 90,
                Items.metaglass, 30
            ));
            size = 3;
            health = 340;

            hasPower = hasItems = hasLiquids = true;
            itemCapacity = 20;
            liquidCapacity = 38f;
            craftTime = 15;

            consumePower(1.5f);
            consumeItem(Items.titanium, 1);
            consumeLiquid(Liquids.water, 1f);
            outputLiquid = new LiquidStack(Liquids.cryofluid, 1f);

            drawer = new DrawMulti(new DrawRegion ("-bottom"), new DrawLiquidTile(Liquids.water), new DrawLiquidTile(Liquids.cryofluid), new DrawDefault());
        }};
    }
}
