package ru.flamesword.additionalcrafts.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import ru.flamesword.additionalcrafts.AdditionalCraftsBase;

import java.util.Random;

public class BlockDarkStone extends Block {

    public BlockDarkStone() {
        super(Material.rock);
        this.setBlockName("darkstoneblock");
        this.setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
        this.setHardness(3F);
        this.setResistance(5F);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 0);
        this.setBlockTextureName("additionalcrafts:DarkStone");
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(AdditionalCraftsBase.darkcobblestoneblock);
    }
}
