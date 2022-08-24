package stellar.content;

import arc.struct.*;
import arc.graphics.*;
import mindustry.type.*;

import static mindustry.content.Items.*;

public class StellarResources {
    public static Item
        aurase;

    //public static Liquid

    public static Seq<Item> arkansItems = new Seq<>();
	//public static Seq<Liquid> arkansLiquids = new Seq<>();
	
	public void load() {
	    aurase = new Item("aurase", Color.valueOf("007fff")) {{cost = 1.5f;}};

	    arkansItems.addAll(aurase, sand, silicon, graphite);
	}
}