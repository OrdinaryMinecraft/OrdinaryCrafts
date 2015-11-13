package ru.flamesword.additionalcrafts.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import ru.flamesword.additionalcrafts.AdditionalCraftsBase;

public class ItemEmeraldHoe extends ItemHoe {

	public ItemEmeraldHoe() {
        super(AdditionalCraftsBase.EMERALDTOOL);
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setTextureName("additionalcrafts:EmeraldHoe");
	}
}

