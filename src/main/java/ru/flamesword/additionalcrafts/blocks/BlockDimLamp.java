package ru.flamesword.additionalcrafts.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockDimLamp extends Block {

    public BlockDimLamp()
        {
            super(Material.wood);
            this.setCreativeTab(CreativeTabs.tabDecorations);
            this.setBlockTextureName("additionalcrafts:DimLamp");
            this.setBlockName("dimlampblock");
            this.setHardness(1F);
            this.setLightOpacity(0);
            this.setLightLevel(0.5F);
            this.setResistance(1F);
            this.setStepSound(soundTypeWood);
        }

}
