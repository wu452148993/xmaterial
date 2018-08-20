package com.github.wulf.xmaterial;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public enum IEnchantment {
	PROTECTION_ENVIRONMENTAL("protection",0),
	PROTECTION_FIRE("fire_protection",1),
	PROTECTION_FALL("feather_falling",2),
	PROTECTION_EXPLOSIONS("blast_protection",3),
	PROTECTION_PROJECTILE("projectile_protection",4),
	OXYGEN("respiration",5),
	WATER_WORKER("aqua_affinity",6),
	THORNS("thorns",7),
	DEPTH_STRIDER("depth_strider",8),
	FROST_WALKER("frost_walker",9),
	BINDING_CURSE("binding_curse",10),
	DAMAGE_ALL("sharpness",16),
	DAMAGE_UNDEAD("smite",17),
	DAMAGE_ARTHROPODS("bane_of_arthropods",18),
	KNOCKBACK("knockback",19),
	FIRE_ASPECT("fire_aspect",20),
	LOOT_BONUS_MOBS("looting",21),
	SWEEPING_EDGE("sweeping",22),
	DIG_SPEED("efficiency",32),
	SILK_TOUCH("silk_touch",33),
	DURABILITY("unbreaking",34),
	LOOT_BONUS_BLOCKS("fortune",35),
	ARROW_DAMAGE("power",48),
	ARROW_KNOCKBACK("punch",49),
	ARROW_FIRE("flame",50),
	ARROW_INFINITE("infinity",51),
	LUCK("luck_of_the_sea",61),
	LURE("lure",62),
	MENDING("mending",70),
	VANISHING_CURSE("vanishing_curse",71),
	;
	
	String key;
	int id;
	
	IEnchantment (String key, int id ){
		this.key = key;
		this.id = id;
	}
	
	private static HashMap<Integer, IEnchantment> cachedEnchantSearch = new HashMap<>();
	public static IEnchantment requestfromID(int id){
		if(cachedEnchantSearch.containsKey(id)){
			return cachedEnchantSearch.get(id);
		}
		for(IEnchantment enc:IEnchantment.values()){
			if(id == enc.id){
				cachedEnchantSearch.put(id,enc);
				return enc;
			}
		}
		return null;
	}
	
	public Enchantment parseEnchantment(){
		return Enchantment.getByName(this.toString());      
	}
	
	public static Enchantment fromID(int id) {
		return IEnchantment.requestfromID(id).parseEnchantment();
	}
}
