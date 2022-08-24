package stellar;

import mindustry.mod.*;
import stellar.*;
import stellar.content.*;
import stellar.maps.planet.*;

public class StellarMind extends Mod{

    public StellarMind (){

    }
    @Override
    public void loadContent(){
        new StellarBlocks().load();
        new StellarPlanets().load();
        new StellarEnvironment().load();
        new StellarItems().load();
    }
}
