package ru.flamesword.additionalcrafts.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.flamesword.additionalcrafts.AdditionalCraftsBase;

public class BlockCage extends Block {

	public BlockCage() {
		super(Material.iron);
		this.setBlockName("cageblock");
		this.setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
		this.setHardness(3F);
		this.setResistance(5F);
		this.setStepSound(soundTypeMetal);
		this.setHarvestLevel("pickaxe", 0);
		this.setBlockTextureName("additionalcrafts:CageBlock");
	}
	
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 0;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
}