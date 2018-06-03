package ru.flamesword.additionalcrafts.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.flamesword.additionalcrafts.AdditionalCraftsBase;

public class BlockBlueBrickBlock extends Block {

	public BlockBlueBrickBlock() {
		super(Material.rock);
		this.setBlockName("bluebrickblock");
		this.setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
		this.setHardness(3F);
		this.setResistance(5F);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 0);
		this.setBlockTextureName("additionalcrafts:BrickBlue");
	}
}
