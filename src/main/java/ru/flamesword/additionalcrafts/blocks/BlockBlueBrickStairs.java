package ru.flamesword.additionalcrafts.blocks;

import ru.flamesword.additionalcrafts.AdditionalCraftsBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBlueBrickStairs extends BlockStairs {

	public BlockBlueBrickStairs() {
		super(AdditionalCraftsBase.bluebrickblock, 1);
		this.setBlockName("bluebrickstairs");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(3F);
		this.setLightOpacity(0);
		this.setResistance(5F);
		this.setHarvestLevel("pickaxe", 0);
		this.setBlockTextureName("additionalcrafts:BrickBlue");
	}
}

