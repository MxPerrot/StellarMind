package jobert.content.Blocks;

import arc.math.geom.Vec3;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.ctype.ContentType;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.production.*;
import mindustry.world.draw.*;
import jobert.content.Blocks.ModBlocks.*;

class JBProduction implements ContentList {
    @Override
    public void load() {
        largeCryofluidMixer = new GenericCrafter("large-cryofluid-mixer") {{
            size = 3;
            //category = Category.crafting;
            destructible = true;
            health = 340;
            requirements(Category.crafting, ItemStack.with(Items.lead, 120, Items.titanium, 130, Items.silicon, 85, Items.metaglass, 45));

            // Production
            hasItems = true;
            hasLiquids = true;
            itemCapacity = 20;
            craftTime = 60;
            
            consumes.power(2.33333333);
            consumes.liquid(Liquids.water, 0.3f);
            consumes.item(ItemStack.with(Items.titanium, 3));
            outputLiquid = new LiquidStack(cryofluid, 0.333333333f);
            
            // Texture
            
        }};
    }
}
