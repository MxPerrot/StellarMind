package stellar;

import mindustry.mod.*;
import stellar.content.*;

public class StellarMind extends Mod{

    public StellarMind (){

    }
    @Override
    public void loadContent(){
        SPlanets.load();
        SBlocks.load();
    }
}
