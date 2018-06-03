package ru.flamesword.additionalcrafts.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.flamesword.additionalcrafts.AdditionalCraftsBase;

public class BlockBox extends Block {

	public BlockBox() {
		super(Material.wood);
		this.setBlockName("boxblock");
		this.setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
		this.setHardness(1F);
		this.setResistance(2.5F);
		this.setStepSound(soundTypeWood);
		this.setHarvestLevel("axe", 0);
		this.setBlockTextureName("additionalcrafts:BoxBlock");
	}
}