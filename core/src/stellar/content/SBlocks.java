package stellar.content;

import arc.Core;
import arc.graphics.Color;
import arc.graphics.g2d.Draw;
import arc.graphics.g2d.Fill;
import arc.graphics.g2d.Lines;
import arc.math.Angles;
import arc.math.Interp;
import arc.math.Mathf;
import arc.util.Time;
import mindustry.content.*;
import mindustry.entities.Effect;
import mindustry.entities.UnitSorts;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.ContinuousLaserBulletType;
import mindustry.entities.part.DrawPart;
import mindustry.entities.part.FlarePart;
import mindustry.entities.part.RegionPart;
import mindustry.entities.pattern.ShootBarrel;
import mindustry.entities.pattern.ShootMulti;
import mindustry.entities.pattern.ShootPattern;
import mindustry.entities.pattern.ShootSpread;
import mindustry.gen.Building;
import mindustry.gen.Bullet;
import mindustry.gen.Sounds;
import mindustry.graphics.CacheLayer;
import mindustry.graphics.Drawf;
import mindustry.graphics.Layer;
import mindustry.graphics.Pal;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mindustry.world.Block.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import mindustry.world.meta.Attribute;
import mindustry.world.meta.BuildVisibility;

import static arc.graphics.g2d.Lines.lineAngle;
import static mindustry.Vars.tilesize;
import static mindustry.type.ItemStack.with;

public class SBlocks {
    public static Block
        //Environment

        //Floors
        //Ores


        //Defense
        //Distribution
        //Liquid        
        //Power
        //Transportation
        //Production
        largeCryofluidMixer;
       
        //Sandbox
        

    public static void load() {

        // Production
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
