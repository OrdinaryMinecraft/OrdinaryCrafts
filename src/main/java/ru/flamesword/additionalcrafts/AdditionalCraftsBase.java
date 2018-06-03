package ru.flamesword.additionalcrafts;

import ru.flamesword.additionalcrafts.blocks.*;
import ru.flamesword.additionalcrafts.items.EmeraldArmor;
import ru.flamesword.additionalcrafts.items.ItemEmeraldAxe;
import ru.flamesword.additionalcrafts.items.ItemEmeraldHoe;
import ru.flamesword.additionalcrafts.items.ItemEmeraldPickaxe;
import ru.flamesword.additionalcrafts.items.ItemEmeraldSpade;
import ru.flamesword.additionalcrafts.items.ItemEmeraldSword;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod (modid = "additionalcrafts", name = "Ordinary Additional Crafts", version = "1.2")

public class AdditionalCraftsBase {
	
	public static Item emeraldpickaxe;
	public static Item emeraldhoe;
	public static Item emeraldaxe;
	public static Item emeraldspade;
	public static Item emeraldsword;
	public static Item emeraldhelmet;
	public static Item emeraldplate;
	public static Item emeraldpants;
	public static Item emeraldboots;

	public static Item jewelgold1;
	public static Item jewelgold2;
	public static Item jewelgold3;
	public static Item jewelgold4;
	public static Item jewelgold5;
	public static Item jewelgold6;
	public static Item jewelsilver1;
	public static Item jewelsilver2;
	public static Item jewelsilver3;
	public static Item jewelsilver4;
	public static Item jewelsilver5;
	public static Item jewelsilver6;
	
	public static Block bluebrickblock;
	public static Block bluebrickstairs;
	public static Block smokeblock;
	public static Block boxblock;
	public static Block boxofcoalblock;
	public static Block cageblock;
	public static Block invisibleblock;
	public static Block candleblock;
	public static Block invisibleblocklight;
	public static Block skyblock;
	public static Block dimlampblock;

	public static CreativeTabs tabOrdinaryCrafts = new TabOrdinaryCrafts("ordinarycrafts");

	public static ToolMaterial EMERALDTOOL = EnumHelper.addToolMaterial("EMERALD", 3, 1024, 10.0F, 4.0F, 15);
	public static ArmorMaterial EMERALDARM = EnumHelper.addArmorMaterial("EMERALD", 30, new int[] {3, 8, 6, 3}, 15);
	
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event)
	{
		ConfigHelper.setupConfig(new Configuration(event.getSuggestedConfigurationFile()));

		Blocks.fence.setCreativeTab(CreativeTabs.tabDecorations);
		GameRegistry.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.fence), 1),
				new Object[]{ "AAA", "AAA",
						('A'), Items.stick});

		if (ConfigHelper.emeraldtools) {
			emeraldpickaxe = new ItemEmeraldPickaxe().setUnlocalizedName("emeraldpickaxe");
			GameRegistry.registerItem(emeraldpickaxe, "emeraldpickaxe");
			emeraldhoe = new ItemEmeraldHoe().setUnlocalizedName("emeraldhoe");
			GameRegistry.registerItem(emeraldhoe, "emeraldhoe");
			emeraldaxe = new ItemEmeraldAxe().setUnlocalizedName("emeraldaxe");
			GameRegistry.registerItem(emeraldaxe, "emeraldaxe");
			emeraldspade = new ItemEmeraldSpade().setUnlocalizedName("emeraldspade");
			GameRegistry.registerItem(emeraldspade, "emeraldspade");
			emeraldsword = new ItemEmeraldSword().setUnlocalizedName("emeraldsword");
			GameRegistry.registerItem(emeraldsword, "emeraldsword");
			
			GameRegistry.addRecipe(new ItemStack(AdditionalCraftsBase.emeraldpickaxe, 1), 
	                new Object[]{ "AAA", " B ", " B ",
	        	('A'), Items.emerald, ('B'), Items.stick});
	        GameRegistry.addRecipe(new ItemStack(AdditionalCraftsBase.emeraldhoe, 1), 
	                new Object[]{ "AA ", " B ", " B ",
	        	('A'), Items.emerald, ('B'), Items.stick});
	        GameRegistry.addRecipe(new ItemStack(AdditionalCraftsBase.emeraldhoe, 1), 
	                new Object[]{ " AA", " B ", " B ",
	        	('A'), Items.emerald, ('B'), Items.stick});
	        GameRegistry.addRecipe(new ItemStack(AdditionalCraftsBase.emeraldaxe, 1), 
	                new Object[]{ "AA ", "AB ", " B ",
	        	('A'), Items.emerald, ('B'), Items.stick});
	        GameRegistry.addRecipe(new ItemStack(AdditionalCraftsBase.emeraldaxe, 1), 
	        		new Object[]{ " AA", " BA", " B ",
	        	('A'), Items.emerald, ('B'), Items.stick});
	        GameRegistry.addRecipe(new ItemStack(AdditionalCraftsBase.emeraldspade, 1), 
	                new Object[]{ " A ", " B ", " B ",
	        	('A'), Items.emerald, ('B'), Items.stick});
	        GameRegistry.addRecipe(new ItemStack(AdditionalCraftsBase.emeraldsword, 1), 
	                new Object[]{ " A ", " A ", " B ",
	        	('A'), Items.emerald, ('B'), Items.stick});
		}
		
		if (ConfigHelper.emeraldarmor) {
			emeraldhelmet = new EmeraldArmor(0, 0).setUnlocalizedName("emeraldhelmet").setTextureName("additionalcrafts:EmeraldHelmet");
			emeraldplate = new EmeraldArmor(0, 1).setUnlocalizedName("emeraldplate").setTextureName("additionalcrafts:EmeraldChestplate");
			emeraldpants = new EmeraldArmor(0, 2).setUnlocalizedName("emeraldpants").setTextureName("additionalcrafts:EmeraldLeggings");
			emeraldboots = new EmeraldArmor(0, 3).setUnlocalizedName("emeraldboots").setTextureName("additionalcrafts:EmeraldBoots");
			GameRegistry.registerItem(emeraldhelmet, "emeraldhelmet");
			GameRegistry.registerItem(emeraldplate, "emeraldplate");
			GameRegistry.registerItem(emeraldpants, "emeraldpants");
			GameRegistry.registerItem(emeraldboots, "emeraldboots");
			
			GameRegistry.addRecipe(new ItemStack(AdditionalCraftsBase.emeraldplate, 1), 
	                new Object[]{ "A A", "AAA", "AAA",
	                ('A'), Items.emerald});
			GameRegistry.addRecipe(new ItemStack(AdditionalCraftsBase.emeraldpants, 1), 
	                new Object[]{ "AAA", "A A", "A A",
	                ('A'), Items.emerald});
			GameRegistry.addRecipe(new ItemStack(AdditionalCraftsBase.emeraldhelmet, 1), 
	                new Object[]{ "AAA", "A A",
	                ('A'), Items.emerald});
			GameRegistry.addRecipe(new ItemStack(AdditionalCraftsBase.emeraldboots, 1), 
	                new Object[]{ "A A", "A A",
	                ('A'), Items.emerald});
		}
		
		if (ConfigHelper.bluebricks) {
			bluebrickblock = new BlockBlueBrickBlock();
			GameRegistry.registerBlock(bluebrickblock, "bluebrickblock");
			bluebrickstairs = new BlockBlueBrickStairs();
			GameRegistry.registerBlock(bluebrickstairs, "bluebrickstairs");
			
			GameRegistry.addShapelessRecipe(new ItemStack(AdditionalCraftsBase.bluebrickblock, 1), new Object[] {new ItemStack(Item.getItemById(Item.getIdFromItem(Items.dye)), 1, 4), Item.getItemFromBlock(Blocks.brick_block)});
			GameRegistry.addShapelessRecipe(new ItemStack(AdditionalCraftsBase.bluebrickstairs, 1), new Object[] {new ItemStack(Item.getItemById(Item.getIdFromItem(Items.dye)), 1, 4), Item.getItemFromBlock(Blocks.brick_stairs)});
			GameRegistry.addRecipe(new ItemStack(AdditionalCraftsBase.bluebrickstairs, 4), 
	                new Object[]{ "A  ", "AA ", "AAA",
	                ('A'), Item.getItemFromBlock(AdditionalCraftsBase.bluebrickblock)});
		}
		
		if (ConfigHelper.grass) {
			GameRegistry.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.grass), 3), 
	                new Object[]{ "BBB", "AAA",
	                ('A'), new ItemStack(Item.getItemFromBlock(Blocks.dirt), 1, 0), ('B'), Items.wheat_seeds});
		}
		
		if (ConfigHelper.mycelium) {
			GameRegistry.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.mycelium), 3), 
	                new Object[]{ "BBB", "AAA",
	                ('A'), new ItemStack(Item.getItemFromBlock(Blocks.dirt), 1, 0), ('B'), Item.getItemById(39)});
		}
		
		if (ConfigHelper.web) {
			GameRegistry.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.web), 1), 
	                new Object[]{ "AAA", "AAA", "AAA",
	                ('A'), Items.string});
		}		
		
		if (ConfigHelper.smokeblock) {
			smokeblock = new BlockSmoke();
			GameRegistry.registerBlock(smokeblock, "smokeblock");
			
			GameRegistry.addRecipe(new ItemStack(smokeblock, 1), 
	                new Object[]{ "A", "B",
	                ('A'), Items.blaze_powder, ('B'), Items.water_bucket});
		}
		
		if (ConfigHelper.boxblocks) {
			boxblock = new BlockBox();
			GameRegistry.registerBlock(boxblock, "boxblock");
			boxofcoalblock = new BlockBoxOfCoal();
			GameRegistry.registerBlock(boxofcoalblock, "boxofcoalblock");
			cageblock = new BlockCage();
			GameRegistry.registerBlock(cageblock, "cageblock");
			
			GameRegistry.addRecipe(new ItemStack(boxblock, 1), 
	                new Object[]{ "ABA", "BAB", "ABA",
	                ('A'), Items.stick, ('B'), new ItemStack(Item.getItemFromBlock(Blocks.planks), 1, 0)});
			GameRegistry.addRecipe(new ItemStack(boxofcoalblock, 1), 
	                new Object[]{ "A", "B",
	                ('A'), new ItemStack(Item.getItemFromBlock(Blocks.coal_block), 1, 0), ('B'), new ItemStack(Item.getItemFromBlock(boxblock), 1, 0)});
			GameRegistry.addRecipe(new ItemStack(cageblock, 2), 
	                new Object[]{ "AA", "AA",
	                ('A'), new ItemStack(Item.getItemFromBlock(Blocks.iron_bars), 1, 0)});
		}
		
		if (ConfigHelper.invisibleblock) {
			invisibleblock = new BlockInvisible();
			GameRegistry.registerBlock(invisibleblock, "invisibleblock");
			
			GameRegistry.addRecipe(new ItemStack(invisibleblock, 8), 
	                new Object[]{ "AAA", "ABA", "AAA",
	                ('A'), new ItemStack(Item.getItemFromBlock(Blocks.glass), 1, 0), ('B'), Items.golden_carrot});

			invisibleblocklight = new BlockInvisibleLight();
			GameRegistry.registerBlock(invisibleblocklight, "invisibleblocklight");
		}
		
		if (ConfigHelper.candleblock) {
			candleblock = new BlockCandle();
			GameRegistry.registerBlock(candleblock, "candleblock");

			GameRegistry.addRecipe(new ItemStack(candleblock, 1), 
	                new Object[]{ "A", "B",
	                ('A'), Items.string, ('B'), Items.magma_cream});
		}

		if (ConfigHelper.skyblock) {
			skyblock = new BlockSky();
			GameRegistry.registerBlock(skyblock, "skyblock");
		}

		dimlampblock = new BlockDimLamp();
		GameRegistry.registerBlock(dimlampblock, "dimlampblock");

		jewelgold1 = new Item().setUnlocalizedName("jewelgold1").setTextureName("additionalcrafts:JewelGold1").setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
		GameRegistry.registerItem(jewelgold1, "jewelgold1");

		jewelgold2 = new Item().setUnlocalizedName("jewelgold2").setTextureName("additionalcrafts:JewelGold2").setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
		GameRegistry.registerItem(jewelgold2, "jewelgold2");

		jewelgold3 = new Item().setUnlocalizedName("jewelgold3").setTextureName("additionalcrafts:JewelGold3").setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
		GameRegistry.registerItem(jewelgold3, "jewelgold3");

		jewelgold4 = new Item().setUnlocalizedName("jewelgold4").setTextureName("additionalcrafts:JewelGold4").setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
		GameRegistry.registerItem(jewelgold4, "jewelgold4");

		jewelgold5 = new Item().setUnlocalizedName("jewelgold5").setTextureName("additionalcrafts:JewelGold5").setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
		GameRegistry.registerItem(jewelgold5, "jewelgold5");

		jewelgold6 = new Item().setUnlocalizedName("jewelgold6").setTextureName("additionalcrafts:JewelGold6").setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
		GameRegistry.registerItem(jewelgold6, "jewelgold6");

		jewelsilver1 = new Item().setUnlocalizedName("jewelsilver1").setTextureName("additionalcrafts:JewelSilver1").setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
		GameRegistry.registerItem(jewelsilver1, "jewelsilver1");

		jewelsilver2 = new Item().setUnlocalizedName("jewelsilver2").setTextureName("additionalcrafts:JewelSilver2").setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
		GameRegistry.registerItem(jewelsilver2, "jewelsilver2");

		jewelsilver3 = new Item().setUnlocalizedName("jewelsilver3").setTextureName("additionalcrafts:JewelSilver3").setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
		GameRegistry.registerItem(jewelsilver3, "jewelsilver3");

		jewelsilver4 = new Item().setUnlocalizedName("jewelsilver4").setTextureName("additionalcrafts:JewelSilver4").setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
		GameRegistry.registerItem(jewelsilver4, "jewelsilver4");

		jewelsilver5 = new Item().setUnlocalizedName("jewelsilver5").setTextureName("additionalcrafts:JewelSilver5").setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
		GameRegistry.registerItem(jewelsilver5, "jewelsilver5");

		jewelsilver6 = new Item().setUnlocalizedName("jewelsilver6").setTextureName("additionalcrafts:JewelSilver6").setCreativeTab(AdditionalCraftsBase.tabOrdinaryCrafts);
		GameRegistry.registerItem(jewelsilver6, "jewelsilver6");
	}
	
}
