package jobert.content.Blocks;

import mindustry.content.Items;
import mindustry.ctype.ContentList;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.meta.BuildVisibility;

import static mindustry.type.ItemStack.with;

public class JBBlocks implements ContentList {
    public static Block

        //Environment
        
        //Transportation
        
        //Power
        
        //Production
        largeCryofluidMixer,
        
        //Units
        
        //Turrets
        
        //Walls
        
        private ContentList[] blocksContent = {
                new JBProduction(),
        };

        public void load() {
            for (ContentList contentList : blocksContent) {
                contentList.load();
        }
}
