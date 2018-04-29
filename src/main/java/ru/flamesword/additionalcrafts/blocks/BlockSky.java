package ru.flamesword.additionalcrafts.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import ru.flamesword.additionalcrafts.AdditionalCraftsBase;

import java.util.Random;

public class BlockSky extends Block {

    private Item iconSky;

    public BlockSky() {
        super(Material.glass);
        this.setBlockName("skyblock");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(0.1F);
        this.setResistance(1F);
        this.setStepSound(soundTypeGlass);
        this.setBlockTextureName("additionalcrafts:InvisibleBlock");
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return null;
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
        return true;
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        return null;
    }
}