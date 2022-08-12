package jobert.src;

import mindustry.ctype.*;


public class Loader implements ContentList{
    private final ContentList[] contents = {
        new JBPlanets();
        //new NFICHIER();
    };

    public void load(){
        for(ContentList list : contents){
            list.load();
        }
    }
}
