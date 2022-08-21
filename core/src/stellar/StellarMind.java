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
        new StellarPlanets.load();
        new StellarBlocks.load();
    }
}
