package ru.flamesword.additionalcrafts.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ru.flamesword.additionalcrafts.AdditionalCraftsBase;

public class EmeraldArmor extends ItemArmor {
	
	  private String texturePath = "additionalcrafts:textures/models/armor/";
      
      public EmeraldArmor(int id, int armorType) {
              super(AdditionalCraftsBase.EMERALDARM, id, armorType);
              this.setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
              this.setMaxStackSize(1);
              this.setTextureName();
      }

      public void setTextureName ()
      {
              if(armorType == 0||armorType == 1||armorType == 3){
                      this.texturePath += "Emeraldlayer" + 1 + ".png";
              }
              else {
                      this.texturePath += "Emeraldlayer" + 2 + ".png";
              }
      }
      
      @Override
      public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
              return this.texturePath;
      }
}
