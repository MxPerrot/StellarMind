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
        StellarPlanets.load();
        StellarBlocks.load();
    }
}
