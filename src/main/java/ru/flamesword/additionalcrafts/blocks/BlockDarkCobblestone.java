package ru.flamesword.additionalcrafts.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.flamesword.additionalcrafts.AdditionalCraftsBase;

public class BlockDarkCobblestone extends Block {

    public BlockDarkCobblestone() {
        super(Material.rock);
        this.setBlockName("darkcobblestoneblock");
        this.setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
        this.setHardness(3F);
        this.setResistance(5F);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 0);
        this.setBlockTextureName("additionalcrafts:DarkCobblestone");
    }
}

