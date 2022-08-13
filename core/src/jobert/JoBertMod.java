package jobert;

import mindustry.mod.*;
import jobert.content.*;
import jobert.maps.generators.*;

public class JoBertMod extends Mod{

    public JoBertMod (){

    }
    @Override
    public void loadContent(){
        JBPlanets.load();
    }
}
