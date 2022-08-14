package jobert;

import mindustry.mod.*;
import jobert.content.*;

public class JoBertMod extends Mod{

    public JoBertMod (){

    }
    @Override
    public void loadContent(){
        JBPlanets.load();
        JBBlocks.load();
    }
}
