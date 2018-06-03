package ru.flamesword.additionalcrafts.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import ru.flamesword.additionalcrafts.AdditionalCraftsBase;

public class ItemEmeraldPickaxe extends ItemPickaxe {

	public ItemEmeraldPickaxe() {
        super(AdditionalCraftsBase.EMERALDTOOL);
        this.setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
        this.setTextureName("additionalcrafts:EmeraldPickaxe");
	}

}
