package ru.flamesword.additionalcrafts.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import ru.flamesword.additionalcrafts.AdditionalCraftsBase;

public class ItemEmeraldSpade extends ItemSpade{

	public ItemEmeraldSpade() {
        super(AdditionalCraftsBase.EMERALDTOOL);
        this.setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
        this.setTextureName("additionalcrafts:EmeraldSpade");
	}

}
