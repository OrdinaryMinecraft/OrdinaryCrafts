package ru.flamesword.additionalcrafts;

import net.minecraftforge.common.config.Configuration;

public class ConfigHelper {

	public ConfigHelper() {
		
	}
	
	public static boolean emeraldtools;
	public static boolean emeraldarmor;
	public static boolean bluebricks;
	public static boolean grass;
	public static boolean mycelium;
	public static boolean web;
	public static boolean smokeblock;
	public static boolean boxblocks;
	public static boolean invisibleblock;
	public static boolean candleblock;
	public static boolean ordinarycrafts;
	
	public static int dioriteID;
	public static int dioritesmoothID;
	public static int andesiteID;
	public static int andesitesmoothID;
	public static int graniteID;
	public static int granitesmoothID;
	public static int basaltID;
	public static int basaltsmoothID;
	public static int dioriteDATA;
	public static int dioritesmoothDATA;
	public static int andesiteDATA;
	public static int andesitesmoothDATA;
	public static int graniteDATA;
	public static int granitesmoothDATA;
	public static int basaltDATA;
	public static int basaltsmoothDATA;
	
	
	public static void setupConfig(Configuration config) {
		try {
			config.load();
			emeraldtools = config.get("Enable crafts", "emeraldtools", true).getBoolean(true);
			emeraldarmor = config.get("Enable crafts", "emeraldarmor", true).getBoolean(true);
			bluebricks = config.get("Enable crafts", "bluebricks", true).getBoolean(true);
			grass = config.get("Enable crafts", "grass", true).getBoolean(true);
			mycelium = config.get("Enable crafts", "mycelium", true).getBoolean(true);
			web = config.get("Enable crafts", "web", true).getBoolean(true);
			smokeblock = config.get("Enable crafts", "smoke block", true).getBoolean(true);
			boxblocks = config.get("Enable crafts", "boxes", true).getBoolean(true);
			invisibleblock = config.get("Enable crafts", "invisible block", true).getBoolean(true);
			candleblock = config.get("Enable crafts", "candle block", true).getBoolean(true);
			ordinarycrafts = config.get("Enable crafts", "ordinarycrafts", true).getBoolean(true);
			
			dioriteID = config.get("IDs", "dioriteID", 639).getInt(639);
			dioriteDATA = config.get("IDs", "dioriteDATA", 3).getInt(3);
			dioritesmoothID = config.get("IDs", "dioritesmoothID", 715).getInt(715);
			dioritesmoothDATA = config.get("IDs", "dioritesmoothDATA", 0).getInt(0);
			andesiteID = config.get("IDs", "andesiteID", 639).getInt(639);
			andesiteDATA = config.get("IDs", "andesiteDATA", 5).getInt(5);
			andesitesmoothID = config.get("IDs", "andesitesmoothID", 717).getInt(717);
			andesitesmoothDATA = config.get("IDs", "andesitesmoothDATA", 0).getInt(0);
			graniteID = config.get("IDs", "graniteID", 639).getInt(639);
			graniteDATA = config.get("IDs", "graniteDATA", 1).getInt(1);
			granitesmoothID = config.get("IDs", "granitesmoothID", 719).getInt(719);
			granitesmoothDATA = config.get("IDs", "granitesmoothDATA", 0).getInt(0);
			basaltID = config.get("IDs", "basaltID", 596).getInt(596);
			basaltDATA = config.get("IDs", "basaltDATA", 0).getInt(0);
			basaltsmoothID = config.get("IDs", "basaltsmoothID", 774).getInt(774);
			basaltsmoothDATA = config.get("IDs", "basaltsmoothDATA", 0).getInt(0);
			
		} catch(Exception e) {
			System.out.println("A severe error has occured when attempting to load the config file for this mod!");
		} finally {
			if(config.hasChanged()) {
				config.save();
			}
		}
	}

}

