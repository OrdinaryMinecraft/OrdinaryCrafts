package ru.flamesword.additionalcrafts.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import ru.flamesword.additionalcrafts.AdditionalCraftsBase;

public class ItemEmeraldSpade extends ItemSpade{

	public ItemEmeraldSpade() {
        super(AdditionalCraftsBase.EMERALDTOOL);
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setTextureName("additionalcrafts:EmeraldSpade");
	}

}
