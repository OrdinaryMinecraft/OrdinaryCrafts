package ru.flamesword.additionalcrafts.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;
import ru.flamesword.additionalcrafts.AdditionalCraftsBase;

import static net.minecraftforge.common.util.ForgeDirection.UP;

public class BlockDarkDirt extends Block {

    public BlockDarkDirt() {
        super(Material.ground);
        this.setBlockName("darkdirtblock");
        this.setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
        this.setHardness(1F);
        this.setResistance(1F);
        this.setStepSound(soundTypeGravel);
        this.setHarvestLevel("shovel", 0);
        this.setBlockTextureName("additionalcrafts:DarkDirt");
    }

    @Override
    public boolean canSustainPlant(IBlockAccess world, int x, int y, int z, ForgeDirection direction, IPlantable plantable) {
        EnumPlantType plantType = plantable.getPlantType(world, x, y + 1, z);
        switch (plantType)
        {
            case Cave:   return isSideSolid(world, x, y, z, UP);
            case Plains: return true;
            case Water:  return world.getBlock(x, y, z).getMaterial() == Material.water;
            case Beach:
                boolean isBeach = true;
                boolean hasWater = (world.getBlock(x - 1, y, z    ).getMaterial() == Material.water ||
                        world.getBlock(x + 1, y, z    ).getMaterial() == Material.water ||
                        world.getBlock(x,     y, z - 1).getMaterial() == Material.water ||
                        world.getBlock(x,     y, z + 1).getMaterial() == Material.water);
                return isBeach && hasWater;
        }

        return false;
    }
}
