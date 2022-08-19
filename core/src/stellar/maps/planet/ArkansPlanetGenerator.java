package stellar.maps.planet;

import static mindustry.Vars.*;

import arc.graphics.*;
import arc.math.*;
import arc.math.Mathf;
import arc.math.geom.*;
import arc.util.*;
import arc.util.noise.*;
import mindustry.ai.*;
import mindustry.content.*;
import mindustry.game.*;
import mindustry.maps.generators.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.Block;
import mindustry.world.blocks.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.meta.*;

import stellar.content.*;
import stellar.content.SBlocks;


public class ArkansPlanetGenerator extends PlanetGenerator {
    public float heightScl = 0.9f, octaves = 8, persistence = 0.7f, heightPow = 3f, heightMult = 1.6f;

    Block[] terrain = {SBlocks.floorArkans};

    {
        baseSeed = 3;
    }

    @Override
    public float getHeight(Vec3 position){
        return Mathf.pow(rawHeight(position), heightPow) * heightMult;
    }

    @Override
    public Color getColor(Vec3 position){
        Block block = getBlock(position);

        if(block == SBlocks.floorArkans) block = SBlocks.floorArkans;

        return Tmp.c1.set(block.mapColor).a (1f - block.albedo);
    }


}
