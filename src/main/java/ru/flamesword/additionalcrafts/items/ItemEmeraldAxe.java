package ru.flamesword.additionalcrafts.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import ru.flamesword.additionalcrafts.AdditionalCraftsBase;

public class ItemEmeraldAxe extends ItemAxe {

	public ItemEmeraldAxe() {
        super(AdditionalCraftsBase.EMERALDTOOL);
        this.setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
        this.setTextureName("additionalcrafts:EmeraldAxe");
	}

}
