package stellar;

import mindustry.mod.*;
import stellar.content.*;

public class StellarMod extends Mod{

    public StellarMod (){

    }
    @Override
    public void loadContent(){
        SPlanets.load();
        SBlocks.load();
    }
}
