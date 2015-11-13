package ru.flamesword.additionalcrafts.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlockBoxOfCoal extends Block {

	public BlockBoxOfCoal() {
		super(Material.wood);
		this.setBlockName("boxofcoalblock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(1F);
		this.setResistance(2.5F);
		this.setStepSound(soundTypeWood);
		this.setHarvestLevel("axe", 0);
		this.setBlockTextureName("additionalcrafts:BoxOfCoalBlock");
	}
}