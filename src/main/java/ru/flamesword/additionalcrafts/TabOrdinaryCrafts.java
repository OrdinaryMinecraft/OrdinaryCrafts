package ru.flamesword.additionalcrafts;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabOrdinaryCrafts extends CreativeTabs {

    public TabOrdinaryCrafts(String string) {
        super(string);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
        return Item.getItemFromBlock(AdditionalCraftsBase.boxblock);
    }

}
