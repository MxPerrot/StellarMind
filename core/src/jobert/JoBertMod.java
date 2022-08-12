package jobert;

import arc.*;
import arc.audio.*;
import arc.func.*;
import arc.math.*;
import arc.struct.*;
import arc.util.*;
import arc.graphics.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.mod.Mods.*;
import mindustry.type.*;
import mindustry.input.*;

import static arc.Core.*;
import static mindustry.Vars.*;
// Import fichier mod
import jobert.content.*;

public class JoBertMod extends Mod{
    public JoBertMod (){
        Events.on(ClientLoadEvent.class, e -> {
            Log.info("JBMod Loaded.");
        });
    }
    @Override
    public void loadContent(){
    }
}
