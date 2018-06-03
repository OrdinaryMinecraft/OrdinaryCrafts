package ru.flamesword.additionalcrafts.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import ru.flamesword.additionalcrafts.AdditionalCraftsBase;

public class ItemEmeraldSword extends ItemSword {

	public ItemEmeraldSword() {
        super(AdditionalCraftsBase.EMERALDTOOL);
        this.setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
        this.setTextureName("additionalcrafts:EmeraldSword");
	}

}
