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
	public static boolean skyblock;
	
	
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
			skyblock = config.get("Enable crafts", "sky block", true).getBoolean(true);
			
		} catch(Exception e) {
			System.out.println("A severe error has occured when attempting to load the config file for this mod!");
		} finally {
			if(config.hasChanged()) {
				config.save();
			}
		}
	}

}

