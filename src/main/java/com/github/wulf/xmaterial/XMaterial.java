package com.github.wulf.xmaterial;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public enum XMaterial {
	
	STONE("STONE", 0),
	PIG_SPAWN_EGG("MONSTER_EGG", 0, 66),
	ACACIA_BOAT("BOAT_ACACIA", 0),
	ACACIA_BUTTON("WOOD_BUTTON", 0),
	ACACIA_DOOR("ACACIA_DOOR", 0),
	ACACIA_FENCE("ACACIA_FENCE", 0),
	ACACIA_FENCE_GATE("ACACIA_FENCE_GATE", 0),
	ACACIA_LEAVES("LEAVES_2", 0),
	ACACIA_LOG("LOG_2", 0),
	ACACIA_PLANKS("WOOD", 4),
	ACACIA_PRESSURE_PLATE("WOOD_PLATE", 0),
	ACACIA_SAPLING("SAPLING", 4),
	ACACIA_SLAB("WOOD_STEP", 4),
	ACACIA_STAIRS("ACACIA_STAIRS", 4),
	ACACIA_TRAPDOOR("TRAP_DOOR", 0),
	ACACIA_WOOD("LOG_2", 0),
	ACTIVATOR_RAIL("ACTIVATOR_RAIL", 0),
	AIR("AIR", 0),
	ALLIUM("STONE", 0),
	ANDESITE("STONE", 5),
	ANVIL("ANVIL", 0),
	APPLE("APPLE", 0),
	ARMOR_STAND("ARMOR_STAND", 0),
	ARROW("ARROW", 0),
	ATTACHED_MELON_STEM("MELON_STEM", 7),
	ATTACHED_PUMPKIN_STEM("PUMPKIN_STEM", 7),
	AZURE_BLUET("RED_ROSE", 3),
	BAKED_POTATO("BAKED_POTATO", 0),
	BARRIER("BARRIER", 0),
	BAT_SPAWN_EGG("MONSTER_EGG", 0, 61),
	BEACON("BEACON", 0),
	BEDROCK("BEDROCK", 0),
	BEEF("RAW_BEEF", 0),
	BEETROOT("BEETROOT", 0),
	BEETROOTS("BEETROOT", 0),
	BEETROOT_SEEDS("BEETROOT_SEEDS", 0),
	BEETROOT_SOUP("BEETROOT_SOUP", 0),
	BIRCH_BOAT("BOAT_BIRCH", 0),
	BIRCH_BUTTON("WOOD_BUTTON", 0),
	BIRCH_DOOR("BIRCH_DOOR", 0),
	BIRCH_FENCE("BIRCH_FENCE", 0),
	BIRCH_FENCE_GATE("BIRCH_FENCE_GATE", 0),
	BIRCH_LEAVES("LEAVES", 2),
	BIRCH_LOG("LOG", 2),
	BIRCH_PLANKS("WOOD", 2),
	BIRCH_PRESSURE_PLATE("WOOD_PLATE", 0),
	BIRCH_SAPLING("SAPLING", 2),
	BIRCH_SLAB("WOOD_STEP", 2),
	BIRCH_STAIRS("BIRCH_WOOD_STAIRS", 0),
	BIRCH_TRAPDOOR("TRAP_DOOR", 0),
	BIRCH_WOOD("LOG", 2),
	BLACK_BANNER("BANNER", 0),
	BLACK_BED("BED", 15),
	BLACK_CARPET("CARPET", 15),
	BLACK_CONCRETE("CONCRETE", 15),
	BLACK_CONCRETE_POWDER("CONCRETE_POWDER", 15),
	BLACK_GLAZED_TERRACOTTA("BLACK_GLAZED_TERRACOTTA", 0),
	BLACK_SHULKER_BOX("BLACK_SHULKER_BOX", 0),
	BLACK_STAINED_GLASS("STAINED_GLASS", 15),
	BLACK_STAINED_GLASS_PANE("STAINED_GLASS_PANE", 15),
	BLACK_TERRACOTTA("STAINED_CLAY", 15),
	BLACK_WALL_BANNER("WALL_BANNER", 0),
	BLACK_WOOL("WOOL", 15),
	BLAZE_POWDER("BLAZE_POWDER", 0),
	BLAZE_ROD("BLAZE_ROD", 0),
	BLAZE_SPAWN_EGG("MONSTER_EGG", 0, 57),
	BLUE_BANNER("BANNER", 11),
	BLUE_BED("BED", 4),
	BLUE_CARPET("CARPET", 11),
	BLUE_CONCRETE("CONCRETE", 11),
	BLUE_CONCRETE_POWDER("CONCRETE_POWDER", 11),
	BLUE_GLAZED_TERRACOTTA("BLUE_GLAZED_TERRACOTTA", 0),
	BLUE_ICE("PACKED_ICE", 0),
	BLUE_ORCHID("RED_ROSE", 1),
	BLUE_SHULKER_BOX("BLUE_SHULKER_BOX", 0),
	BLUE_STAINED_GLASS("STAINED_GLASS", 11),
	BLUE_STAINED_GLASS_PANE("STAINED_GLASS_PANE", 11),
	BLUE_TERRACOTTA("STAINED_CLAY", 11),
	BLUE_WALL_BANNER("WALL_BANNER", 11),
	BLUE_WOOL("WOOL", 11),
	BONE("BONE", 0),
	BONE_BLOCK("BONE_BLOCK", 0),
	BONE_MEAL("INK_SACK", 15),
	BOOK("BOOK", 0),
	BOOKSHELF("BOOKSHELF", 0),
	BOW("BOW", 0),
	BOWL("BOWL", 0),
	BRAIN_CORAL("STONE", 0),
	BRAIN_CORAL_BLOCK("STONE", 0),
	BRAIN_CORAL_FAN("STONE", 0),
	BREAD("BREAD", 0),
	BREWING_STAND("BREWING_STAND", 0),
	BRICK("CLAY_BRICK", 0),
	BRICKS("BRICK", 0),
	BRICK_SLAB("STONE_SLAB2", 4),
	BRICK_STAIRS("BRICK_STAIRS", 0),
	BROWN_BANNER("BANNER", 3),
	BROWN_BED("BED", 12),
	BROWN_CARPET("CARPET", 12),
	BROWN_CONCRETE("CONCRETE", 12),
	BROWN_CONCRETE_POWDER("CONCRETE_POWDER", 12),
	BROWN_GLAZED_TERRACOTTA("BROWN_GLAZED_TERRACOTTA", 0),
	BROWN_MUSHROOM("BROWN_MUSHROOM", 0),
	BROWN_MUSHROOM_BLOCK("BROWN_MUSHROOM", 0), //UNSURE
	BROWN_SHULKER_BOX("BROWN_SHULKER_BOX", 0),
	BROWN_STAINED_GLASS("STAINED_GLASS", 12),
	BROWN_STAINED_GLASS_PANE("STAINED_GLASS_PANE", 12),
	BROWN_TERRACOTTA("STAINED_CLAY", 12),
	BROWN_WALL_BANNER("WALL_BANNER", 3),
	BROWN_WOOL("WOOL", 12),
	BUBBLE_COLUMN("STONE", 0),
	BUBBLE_CORAL("STONE", 0),
	BUBBLE_CORAL_BLOCK("STONE", 0),
	BUBBLE_CORAL_FAN("STONE", 0),
	BUCKET("BUCKET", 0),
	CACTUS("CACTUS", 0),
	CACTUS_GREEN("INK_SACK", 2),
	CAKE("CAKE", 0),
	CARROT("CARROT", 0),
	CARROTS("CARROT", 0),
	CARROT_ON_A_STICK("CARROT_STICK", 0),
	CARVED_PUMPKIN("PUMPKIN", 0),
	CAULDRON("CAULDRON", 0),
	CAVE_AIR("AIR", 0),
	CAVE_SPIDER_SPAWN_EGG("MONSTER_EGG", 0, 55),
	CHAINMAIL_BOOTS("CHAINMAIL_BOOTS", 0),
	CHAINMAIL_CHESTPLATE("CHAINMAIL_CHESTPLATE", 0),
	CHAINMAIL_HELMET("CHAINMAIL_HELMET", 0),
	CHAINMAIL_LEGGINGS("CHAINMAIL_LEGGINGS", 0),
	CHAIN_COMMAND_BLOCK("COMMAND_CHAIN", 0),
	CHARCOAL("COAL", 1),
	CHEST("CHEST", 0),
	CHEST_MINECART("STORAGE_MINECART", 0),
	CHICKEN("RAW_CHICKEN", 0),
	CHICKEN_SPAWN_EGG("MONSTER_EGG", 0, 69),
	CHIPPED_ANVIL("ANVIL", 1),
	CHISELED_QUARTZ_BLOCK("QUARTZ_BLOCK", 1),
	CHISELED_RED_SANDSTONE("RED_SANDSTONE", 1),
	CHISELED_SANDSTONE("SANDSTONE", 1),
	CHISELED_STONE_BRICKS("SMOOTH_BRICK", 3),
	CHORUS_FLOWER("CHORUS_FLOWER", 0),
	CHORUS_FRUIT("CHORUS_FRUIT", 0),
	CHORUS_PLANT("CHORUS_PLANT", 0),
	CLAY("CLAY", 0),
	CLAY_BALL("CLAY_BALL", 0),
	CLOCK("WATCH", 0),
	COAL("COAL", 0),
	COAL_BLOCK("COAL_BLOCK", 0),
	COAL_ORE("COAL_ORE", 0),
	COARSE_DIRT("DIRT", 1),
	COBBLESTONE("COBBLESTONE", 0),
	COBBLESTONE_SLAB("STONE_SLAB2", 3),
	COBBLESTONE_STAIRS("COBBLESTONE_STAIRS", 0),
	COBBLESTONE_WALL("COBBLE_WALL", 0),
	COBWEB("WEB", 0),
	COCOA("COCOA", 0),
	COCOA_BEANS("INK_SACK", 3),
	COD("RAW_FISH", 0),
	COD_BUCKET("BUCKET", 0),
	COD_SPAWN_EGG("MONSTER_EGG", 0, 87),
	COMMAND_BLOCK("COMMAND", 0),
	COMMAND_BLOCK_MINECART("COMMAND_MINECART", 0),
	COMPARATOR("REDSTONE_COMPARATOR", 0),
	COMPASS("COMPASS", 0),
	CONDUIT("STONE", 0),
	COOKED_BEEF("COOKED_BEEF", 0),
	COOKED_CHICKEN("COOKED_CHICKEN", 0),
	COOKED_COD("COOKED_FISH", 0),
	COOKED_MUTTON("COOKED_MUTTON", 0),
	COOKED_PORKCHOP("GRILLED_PORK", 0),
	COOKED_RABBIT("COOKED_RABBIT", 0),
	COOKED_SALMON("COOKED_FISH", 1),
	COOKIE("COOKIE", 0),
	COW_SPAWN_EGG("MONSTER_EGG", 0, 68),
	CRACKED_STONE_BRICKS("SMOOTH_BRICK", 2),
	CRAFTING_TABLE("WORKBENCH", 0),
	CREEPER_HEAD("SKULL", 4),
	CREEPER_SPAWN_EGG("MONSTER_EGG", 0, 46),
	CREEPER_WALL_HEAD("SKULL", 4),
	CUT_RED_SANDSTONE("STONE", 0),
	CUT_SANDSTONE("STONE", 0),
	CYAN_BANNER("BANNER", 6),
	CYAN_BED("BED", 9),
	CYAN_CARPET("CARPET", 9),
	CYAN_CONCRETE("CONCRETE", 9),
	CYAN_CONCRETE_POWDER("CONCRETE_POWDER", 9),
	CYAN_DYE("INK_SACK", 6),
	CYAN_GLAZED_TERRACOTTA("CYAN_GLAZED_TERRACOTTA", 0),
	CYAN_SHULKER_BOX("CYAN_SHULKER_BOX", 0),
	CYAN_STAINED_GLASS("STAINED_GLASS", 9),
	CYAN_STAINED_GLASS_PANE("STAINED_GLASS_PANE", 9),
	CYAN_TERRACOTTA("STAINED_CLAY", 9),
	CYAN_WALL_BANNER("WALL_BANNER", 0),
	CYAN_WOOL("WOOL", 9),
	DAMAGED_ANVIL("ANVIL", 2),
	DANDELION("YELLOW_FLOWER", 0),
	DANDELION_YELLOW("INK_SACK", 11),
	DARK_OAK_BOAT("BOAT_DARK_OAK", 0),
	DARK_OAK_BUTTON("WOOD_BUTTON", 0),
	DARK_OAK_DOOR("DARK_OAK_DOOR", 0),
	DARK_OAK_FENCE("DARK_OAK_FENCE", 0),
	DARK_OAK_FENCE_GATE("DARK_OAK_FENCE_GATE", 0),
	DARK_OAK_LEAVES("LEAVES_2", 1),
	DARK_OAK_LOG("LOG_2", 1),
	DARK_OAK_PLANKS("WOOD", 5),
	DARK_OAK_PRESSURE_PLATE("WOOD_PLATE", 0),
	DARK_OAK_SAPLING("SAPLING", 5),
	DARK_OAK_SLAB("WOOD_STEP", 5),
	DARK_OAK_STAIRS("DARK_OAK_STAIRS", 0),
	DARK_OAK_TRAPDOOR("TRAP_DOOR", 0),
	DARK_OAK_WOOD("LOG_2", 1),
	DARK_PRISMARINE("PRISMARINE", 2),
	DARK_PRISMARINE_SLAB("STONE", 0),
	DARK_PRISMARINE_STAIRS("STONE", 0),
	DAYLIGHT_DETECTOR("DAYLIGHT_DETECTOR", 0),
	DEAD_BRAIN_CORAL_BLOCK("STONE", 0),
	DEAD_BUBBLE_CORAL_BLOCK("STONE", 0),
	DEAD_BUSH("DEAD_BUSH", 0),
	DEAD_FIRE_CORAL_BLOCK("STONE", 0),
	DEAD_HORN_CORAL_BLOCK("STONE", 0),
	DEAD_TUBE_CORAL_BLOCK("STONE", 0),
	DEBUG_STICK("STICK", 0),
	DETECTOR_RAIL("DETECTOR_RAIL", 0),
	DIAMOND("DIAMOND", 0),
	DIAMOND_AXE("DIAMOND_AXE", 0),
	DIAMOND_BLOCK("DIAMOND_BLOCK", 0),
	DIAMOND_BOOTS("DIAMOND_BOOTS", 0),
	DIAMOND_CHESTPLATE("DIAMOND_CHESTPLATE", 0),
	DIAMOND_HELMET("DIAMOND_HELMET", 0),
	DIAMOND_HOE("DIAMOND_HOE", 0),
	DIAMOND_HORSE_ARMOR("DIAMOND_BARDING", 0),
	DIAMOND_LEGGINGS("DIAMOND_LEGGINGS", 0),
	DIAMOND_ORE("DIAMOND_ORE", 0),
	DIAMOND_PICKAXE("DIAMOND_PICKAXE", 0),
	DIAMOND_SHOVEL("DIAMOND_SPADE", 0),
	DIAMOND_SWORD("DIAMOND_SWORD", 0),
	DIORITE("STONE", 3),
	DIRT("DIRT", 0),
	DISPENSER("DISPENSER", 0),
	DOLPHIN_SPAWN_EGG("MONSTER_EGG", 0, 92),
	DONKEY_SPAWN_EGG("MONSTER_EGG", 0, 31),
	DRAGON_BREATH("DRAGONS_BREATH", 0),
	DRAGON_EGG("DRAGON_EGG", 0),
	DRAGON_HEAD("SKULL", 5),
	DRAGON_WALL_HEAD("SKULL", 5),
	DRIED_KELP("STONE", 0),
	DRIED_KELP_BLOCK("STONE", 0),
	DROPPER("DROPPER", 0),
	DROWNED_SPAWN_EGG("MONSTER_EGG", 0, 91),
	EGG("EGG", 0),
	ELDER_GUARDIAN_SPAWN_EGG("MONSTER_EGG", 0, 4),
	ELYTRA("ELYTRA", 0),
	EMERALD("EMERALD", 0),
	EMERALD_BLOCK("EMERALD_BLOCK", 0),
	EMERALD_ORE("EMERALD_ORE", 0),
	ENCHANTED_BOOK("ENCHANTED_BOOK", 0),
	ENCHANTED_GOLDEN_APPLE("GOLDEN_APPLE", 1),
	ENCHANTING_TABLE("ENCHANTMENT_TABLE", 0),
	ENDERMAN_SPAWN_EGG("MONSTER_EGG", 0, 54),
	ENDERMITE_SPAWN_EGG("MONSTER_EGG", 0, 63),
	ENDER_CHEST("ENDER_CHEST", 0),
	ENDER_EYE("EYE_OF_ENDER", 0),
	ENDER_PEARL("ENDER_PEARL", 0),
	END_CRYSTAL("END_CRYSTAL", 0),
	END_GATEWAY("END_GATEWAY", 0),
	END_PORTAL("ENDER_PORTAL", 0),
	END_PORTAL_FRAME("ENDER_PORTAL_FRAME", 0),
	END_ROD("END_ROD", 0),
	END_STONE("ENDER_STONE", 0),
	END_STONE_BRICKS("END_BRICKS", 0),
	EVOKER_SPAWN_EGG("MONSTER_EGG", 0, 34),
	EXPERIENCE_BOTTLE("EXP_BOTTLE", 0),
	FARMLAND("SOIL", 0),
	FEATHER("FEATHER", 0),
	FERMENTED_SPIDER_EYE("FERMENTED_SPIDER_EYE", 0),
	FERN("LONG_GRASS", 2),
	FILLED_MAP("MAP", 0),
	FIRE("FIRE", 0),
	FIREWORK_ROCKET("FIREWORK", 0),
	FIREWORK_STAR("FIREWORK_CHARGE", 0),
	FIRE_CHARGE("FIREBALL", 0),
	FIRE_CORAL("STONE", 0),
	FIRE_CORAL_BLOCK("STONE", 0),
	FIRE_CORAL_FAN("STONE", 0),
	FISHING_ROD("FISHING_ROD", 0),
	FLINT("FLINT", 0),
	FLINT_AND_STEEL("FLINT_AND_STEEL", 0),
	FLOWER_POT("FLOWER_POT", 0),
	FROSTED_ICE("FROSTED_ICE", 0),
	FURNACE("FURNACE", 0),
	FURNACE_MINECART("POWERED_MINECART", 0),
	GHAST_SPAWN_EGG("MONSTER_EGG", 0, 52),
	GHAST_TEAR("GHAST_TEAR", 0),
	GLASS("GLASS", 0),
	GLASS_BOTTLE("GLASS_BOTTLE", 0),
	GLASS_PANE("THIN_GLASS", 0),
	GLISTERING_MELON_SLICE("SPECKLED_MELON", 0),
	GLOWSTONE("GLOWSTONE", 0),
	GLOWSTONE_DUST("GLOWSTONE_DUST", 0),
	GOLDEN_APPLE("GOLDEN_APPLE", 0),
	GOLDEN_AXE("GOLD_AXE", 0),
	GOLDEN_BOOTS("GOLD_BOOTS", 0),
	GOLDEN_CARROT("GOLDEN_CARROT", 0),
	GOLDEN_CHESTPLATE("GOLD_CHESTPLATE", 0),
	GOLDEN_HELMET("GOLD_HELMET", 0),
	GOLDEN_HOE("GOLD_HOE", 0),
	GOLDEN_HORSE_ARMOR("GOLD_BARDING", 0),
	GOLDEN_LEGGINGS("GOLD_LEGGINGS", 0),
	GOLDEN_PICKAXE("GOLD_PICKAXE", 0),
	GOLDEN_SHOVEL("GOLD_SPADE", 0),
	GOLDEN_SWORD("GOLD_SWORD", 0),
	GOLD_BLOCK("GOLD_BLOCK", 0),
	GOLD_INGOT("GOLD_INGOT", 0),
	GOLD_NUGGET("GOLD_NUGGET", 0),
	GOLD_ORE("GOLD_ORE", 0),
	GRANITE("STONE", 1),
	GRASS("LONG_GRASS", 1),
	GRASS_BLOCK("GRASS", 0),
	GRASS_PATH("GRASS_PATH", 0),
	GRAVEL("GRAVEL", 0),
	GRAY_BANNER("BANNER", 8),
	GRAY_BED("BED", 7),
	GRAY_CARPET("CARPET", 7),
	GRAY_CONCRETE("CONCRETE", 7),
	GRAY_CONCRETE_POWDER("CONCRETE_POWDER", 7),
	GRAY_DYE("INK_SACK", 8),
	GRAY_GLAZED_TERRACOTTA("GRAY_GLAZED_TERRACOTTA", 0),
	GRAY_SHULKER_BOX("GRAY_SHULKER_BOX", 0),
	GRAY_STAINED_GLASS("STAINED_GLASS", 8),
	GRAY_STAINED_GLASS_PANE("STAINED_GLASS_PANE", 8),
	GRAY_TERRACOTTA("STAINED_CLAY", 8),
	GRAY_WALL_BANNER("WALL_BANNER", 0),
	GRAY_WOOL("WOOL", 8),
	GREEN_BANNER("BANNER", 2),
	GREEN_BED("BED", 13),
	GREEN_CARPET("CARPET", 13),
	GREEN_CONCRETE("CONCRETE", 13),
	GREEN_CONCRETE_POWDER("CONCRETE_POWDER", 13),
	GREEN_GLAZED_TERRACOTTA("GREEN_GLAZED_TERRACOTTA", 0),
	GREEN_SHULKER_BOX("GREEN_SHULKER_BOX", 0),
	GREEN_STAINED_GLASS("STAINED_GLASS", 13),
	GREEN_STAINED_GLASS_PANE("STAINED_GLASS_PANE", 13),
	GREEN_TERRACOTTA("STAINED_CLAY", 13),
	GREEN_WALL_BANNER("WALL_BANNER", 0),
	GREEN_WOOL("WOOL", 13),
	GUARDIAN_SPAWN_EGG("MONSTER_EGG", 0, 64),
	GUNPOWDER("SULPHUR", 0),
	HAY_BLOCK("HAY_BLOCK", 0),
	HEART_OF_THE_SEA("STONE", 0),
	HEAVY_WEIGHTED_PRESSURE_PLATE("IRON_PLATE", 0),
	HOPPER("HOPPER", 0),
	HOPPER_MINECART("HOPPER_MINECART", 0),
	HORN_CORAL("STONE", 0),
	HORN_CORAL_BLOCK("STONE", 0),
	HORN_CORAL_FAN("STONE", 0),
	HORSE_SPAWN_EGG("MONSTER_EGG", 0, 76),
	HUSK_SPAWN_EGG("MONSTER_EGG", 0, 23),
	ICE("ICE", 0),
	INFESTED_CHISELED_STONE_BRICKS("MONSTER_EGGS", 5),
	INFESTED_COBBLESTONE("MONSTER_EGGS", 1),
	INFESTED_CRACKED_STONE_BRICKS("MONSTER_EGGS", 4),
	INFESTED_MOSSY_STONE_BRICKS("MONSTER_EGGS", 3),
	INFESTED_STONE("MONSTER_EGGS", 0),
	INFESTED_STONE_BRICKS("MONSTER_EGGS", 2),
	INK_SAC("INK_SACK", 0),
	IRON_AXE("IRON_AXE", 0),
	IRON_BARS("IRON_FENCE", 0),
	IRON_BLOCK("IRON_BLOCK", 0),
	IRON_BOOTS("IRON_BOOTS", 0),
	IRON_CHESTPLATE("IRON_CHESTPLATE", 0),
	IRON_DOOR("IRON_DOOR", 0),
	IRON_HELMET("IRON_HELMET", 0),
	IRON_HOE("IRON_HOE", 0),
	IRON_HORSE_ARMOR("IRON_BARDING", 0),
	IRON_INGOT("IRON_INGOT", 0),
	IRON_LEGGINGS("IRON_LEGGINGS", 0),
	IRON_NUGGET("IRON_NUGGET", 0),
	IRON_ORE("IRON_ORE", 0),
	IRON_PICKAXE("IRON_PICKAXE", 0),
	IRON_SHOVEL("IRON_SPADE", 0),
	IRON_SWORD("IRON_SWORD", 0),
	IRON_TRAPDOOR("IRON_TRAPDOOR", 0),
	ITEM_FRAME("ITEM_FRAME", 0),
	JACK_O_LANTERN("JACK_O_LANTERN", 0),
	JUKEBOX("JUKEBOX", 0),
	JUNGLE_BOAT("BOAT_JUNGLE", 0),
	JUNGLE_BUTTON("WOOD_BUTTON", 0),
	JUNGLE_DOOR("JUNGLE_DOOR", 0),
	JUNGLE_FENCE("JUNGLE_FENCE", 0),
	JUNGLE_FENCE_GATE("JUNGLE_FENCE_GATE", 0),
	JUNGLE_LEAVES("LEAVES", 3),
	JUNGLE_LOG("LOG", 3),
	JUNGLE_PLANKS("WOOD", 3),
	JUNGLE_PRESSURE_PLATE("WOOD_PLATE", 0),
	JUNGLE_SAPLING("SAPLING", 3),
	JUNGLE_SLAB("WOOD_STEP", 3),
	JUNGLE_STAIRS("JUNGLE_WOOD_STAIRS", 0),
	JUNGLE_TRAPDOOR("TRAP_DOOR", 0),
	JUNGLE_WOOD("LOG", 3),
	KELP("STONE", 0),
	KELP_PLANT("STONE", 0),
	KNOWLEDGE_BOOK("KNOWLEDGE_BOOK", 0),
	LADDER("LADDER", 0),
	LAPIS_BLOCK("LAPIS_BLOCK", 0),
	LAPIS_LAZULI("INK_SACK", 4),
	LAPIS_ORE("LAPIS_ORE", 0),
	LARGE_FERN("DOUBLE_PLANT", 3),
	LAVA("LAVA", 0),
	LAVA_BUCKET("LAVA_BUCKET", 0),
	LEAD("LEASH", 0),
	LEATHER("LEATHER", 0),
	LEATHER_BOOTS("LEATHER_BOOTS", 0),
	LEATHER_CHESTPLATE("LEATHER_CHESTPLATE", 0),
	LEATHER_HELMET("LEATHER_HELMET", 0),
	LEATHER_LEGGINGS("LEATHER_LEGGINGS", 0),
	LEVER("LEVER", 0),
	LIGHT_BLUE_BANNER("BANNER", 12),
	LIGHT_BLUE_BED("BED", 3),
	LIGHT_BLUE_CARPET("CARPET", 3),
	LIGHT_BLUE_CONCRETE("CONCRETE", 3),
	LIGHT_BLUE_CONCRETE_POWDER("CONCRETE_POWDER", 3),
	LIGHT_BLUE_DYE("INK_SACK", 12),
	LIGHT_BLUE_GLAZED_TERRACOTTA("LIGHT_BLUE_GLAZED_TERRACOTTA", 0),
	LIGHT_BLUE_SHULKER_BOX("LIGHT_BLUE_SHULKER_BOX", 0),
	LIGHT_BLUE_STAINED_GLASS("STAINED_GLASS", 3),
	LIGHT_BLUE_STAINED_GLASS_PANE("STAINED_GLASS_PANE", 3),
	LIGHT_BLUE_TERRACOTTA("STAINED_CLAY", 3),
	LIGHT_BLUE_WALL_BANNER("BANNER", 0),
	LIGHT_BLUE_WOOL("WOOL", 3),
	LIGHT_GRAY_BANNER("BANNER", 7),
	LIGHT_GRAY_BED("BED", 8),
	LIGHT_GRAY_CARPET("CARPET", 8),
	LIGHT_GRAY_CONCRETE("CONCRETE", 8),
	LIGHT_GRAY_CONCRETE_POWDER("CONCRETE_POWDER", 8),
	LIGHT_GRAY_DYE("INK_SACK", 7),
	LIGHT_GRAY_GLAZED_TERRACOTTA("SILVER_GLAZED_TERRACOTTA", 0),
	LIGHT_GRAY_SHULKER_BOX("SILVER_SHULKER_BOX", 0),
	LIGHT_GRAY_STAINED_GLASS("STAINED_GLASS", 8),
	LIGHT_GRAY_STAINED_GLASS_PANE("STAINED_GLASS_PANE", 8),
	LIGHT_GRAY_TERRACOTTA("STAINED_CLAY", 8),
	LIGHT_GRAY_WALL_BANNER("WALL_BANNER", 0),
	LIGHT_GRAY_WOOL("WOOL", 8),
	LIGHT_WEIGHTED_PRESSURE_PLATE("GOLD_PLATE", 0),
	LILAC("DOUBLE_PLANT", 1),
	LILY_PAD("WATER_LILY", 0),
	LIME_BANNER("BANNER", 10),
	LIME_BED("BED", 5),
	LIME_CARPET("CARPET", 5),
	LIME_CONCRETE("CONCRETE", 5),
	LIME_CONCRETE_POWDER("CONCRETE_POWDER", 5),
	LIME_DYE("INK_SACK", 10),
	LIME_GLAZED_TERRACOTTA("LIME_GLAZED_TERRACOTTA", 0),
	LIME_SHULKER_BOX("LIME_SHULKER_BOX", 0),
	LIME_STAINED_GLASS("STAINED_GLASS", 5),
	LIME_STAINED_GLASS_PANE("STAINED_GLASS_PANE", 5),
	LIME_TERRACOTTA("STAINED_CLAY", 5),
	LIME_WALL_BANNER("WALL_BANNER", 0),
	LIME_WOOL("WOOL", 5),
	LINGERING_POTION("LINGERING_POTION", 0),
	LLAMA_SPAWN_EGG("MONSTER_EGG", 0, 79),
	LONG_GRASS("LONG_GRASS", 0),
	MAGENTA_BANNER("BANNER", 13),
	MAGENTA_BED("BED", 2),
	MAGENTA_CARPET("CARPET", 2),
	MAGENTA_CONCRETE("CONCRETE", 2),
	MAGENTA_CONCRETE_POWDER("CONCRETE_POWDER", 2),
	MAGENTA_DYE("INK_SACK", 13),
	MAGENTA_GLAZED_TERRACOTTA("MAGENTA_GLAZED_TERRACOTTA", 0),
	MAGENTA_SHULKER_BOX("MAGENTA_SHULKER_BOX", 0),
	MAGENTA_STAINED_GLASS("STAINED_GLASS", 2),
	MAGENTA_STAINED_GLASS_PANE("STAINED_GLASS_PANE", 2),
	MAGENTA_TERRACOTTA("STAINED_CLAY", 2),
	MAGENTA_WALL_BANNER("WALL_BANNER", 0),
	MAGENTA_WOOL("WOOL", 2),
	MAGMA_BLOCK("MAGMA", 0),
	MAGMA_CREAM("MAGMA_CREAM", 0),
	MAGMA_CUBE_SPAWN_EGG("MONSTER_EGG", 0, 58),
	MAP("MAP", 0),
	MELON("MELON", 0),
	MELON_SEEDS("MELON_SEEDS", 0),
	MELON_SLICE("MELON", 0),
	MELON_STEM("MELON_STEM", 0),
	MILK_BUCKET("MILK_BUCKET", 0),
	MINECART("MINECART", 0),
	MOOSHROOM_SPAWN_EGG("MONSTER_EGG", 0, 72),
	MOSSY_COBBLESTONE("MOSSY_COBBLESTONE", 0),
	MOSSY_COBBLESTONE_WALL("COBBLE_WALL", 1),
	MOSSY_STONE_BRICKS("SMOOTH_BRICK", 1),
	MOVING_PISTON("PISTON_MOVING_PIECE", 0),
	MULE_SPAWN_EGG("MONSTER_EGG", 0, 32),
	MUSHROOM_STEM("BROWN_MUSHROOM", 0),
	MUSHROOM_STEW("BROWN_MUSHROOM", 0),
	MUSIC_DISC_11("GOLD_RECORD", 0),
	MUSIC_DISC_13("GREEN_RECORD", 0),
	MUSIC_DISC_BLOCKS("RECORD_3", 0),
	MUSIC_DISC_CAT("RECORD_4", 0),
	MUSIC_DISC_CHIRP("RECORD_5", 0),
	MUSIC_DISC_FAR("RECORD_6", 0),
	MUSIC_DISC_MALL("RECORD_7", 0),
	MUSIC_DISC_MELLOHI("RECORD_8", 0),
	MUSIC_DISC_STAL("RECORD_9", 0),
	MUSIC_DISC_STRAD("RECORD_10", 0),
	MUSIC_DISC_WAIT("RECORD_11", 0),
	MUSIC_DISC_WARD("RECORD_12", 0),
	MUTTON("MUTTON", 0),
	MYCELIUM("MYCEL", 0),
	NAME_TAG("NAME_TAG", 0),
	NAUTILUS_SHELL("STONE", 0),
	NETHERRACK("NETHERRACK", 0),
	NETHER_BRICK("NETHER_BRICK", 0),
	NETHER_BRICKS("NETHER_BRICK", 0),
	NETHER_BRICK_FENCE("NETHER_FENCE", 0),
	NETHER_BRICK_SLAB("STONE_SLAB2", 6),
	NETHER_BRICK_STAIRS("NETHER_BRICK_STAIRS", 0),
	NETHER_PORTAL("PORTAL", 0),
	NETHER_QUARTZ_ORE("QUARTZ_ORE", 0),
	NETHER_STAR("NETHER_STAR", 0),
	NETHER_WART("NETHER_STALK", 0),
	NETHER_WART_BLOCK("NETHER_WART_BLOCK", 0),
	NOTE_BLOCK("NOTE_BLOCK", 0),
	OAK_BOAT("BOAT", 0),
	OAK_BUTTON("WOOD_BUTTON", 0),
	OAK_DOOR("WOOD_DOOR", 0),
	OAK_FENCE("FENCE", 0),
	OAK_FENCE_GATE("FENCE_GATE", 0),
	OAK_LEAVES("LEAVES", 0),
	OAK_LOG("LOG", 0),
	OAK_PLANKS("WOOD", 0),
	OAK_PRESSURE_PLATE("WOOD_PLATE", 0),
	OAK_SAPLING("SAPLING", 0),
	OAK_SLAB("WOOD_STEP", 0),
	OAK_STAIRS("WOOD_STAIRS", 0),
	OAK_TRAPDOOR("TRAP_DOOR", 0),
	OAK_WOOD("LOG", 0),
	OBSERVER("OBSERVER", 0),
	OBSIDIAN("OBSIDIAN", 0),
	OCELOT_SPAWN_EGG("MONSTER_EGG", 0, 74),
	ORANGE_BANNER("BANNER", 14),
	ORANGE_BED("BED", 1),
	ORANGE_CARPET("CARPET", 1),
	ORANGE_CONCRETE("CONCRETE", 1),
	ORANGE_CONCRETE_POWDER("CONCRETE_POWDER", 1),
	ORANGE_DYE("INK_SACK", 14),
	ORANGE_GLAZED_TERRACOTTA("ORANGE_GLAZED_TERRACOTTA", 0),
	ORANGE_SHULKER_BOX("ORANGE_SHULKER_BOX", 0),
	ORANGE_STAINED_GLASS("STAINED_GLASS", 1),
	ORANGE_STAINED_GLASS_PANE("STAINED_GLASS_PANE", 1),
	ORANGE_TERRACOTTA("STAINED_CLAY", 1),
	ORANGE_TULIP("RED_ROSE", 5),
	ORANGE_WALL_BANNER("WALL_BANNER", 0),
	ORANGE_WOOL("WOOL", 1),
	OXEYE_DAISY("RED_ROSE", 8),
	PACKED_ICE("PACKED_ICE", 0),
	PAINTING("PAINTING", 0),
	PAPER("PAPER", 0),
	PARROT_SPAWN_EGG("MONSTER_EGG", 0, 81),
	PEONY("DOUBLE_PLANT", 5),
	PETRIFIED_OAK_SLAB("STONE", 0),
	PHANTOM_MEMBRANE("STONE", 0),
	PHANTOM_SPAWN_EGG("MONSTER_EGG", 0, 85),
	PINK_BANNER("BANNER", 9),
	PINK_BED("BED", 6),
	PINK_CARPET("CARPET", 6),
	PINK_CONCRETE("CONCRETE", 6),
	PINK_CONCRETE_POWDER("CONCRETE_POWDER", 6),
	PINK_DYE("INK_SACK", 9),
	PINK_GLAZED_TERRACOTTA("PINK_GLAZED_TERRACOTTA", 0),
	PINK_SHULKER_BOX("PINK_SHULKER_BOX", 0),
	PINK_STAINED_GLASS("STAINED_GLASS", 6),
	PINK_STAINED_GLASS_PANE("STAINED_GLASS_PANE", 6),
	PINK_TERRACOTTA("STAINED_CLAY", 6),
	PINK_TULIP("RED_ROSE", 7),
	PINK_WALL_BANNER("WALL_BANNER", 0),
	PINK_WOOL("WOOL", 6),
	PISTON("PISTON_BASE", 0),
	PISTON_HEAD("PISTON_EXTENSION", 0),
	PLAYER_HEAD("SKULL", 3),
	PLAYER_WALL_HEAD("SKULL", 3),
	PODZOL("DIRT", 2),
	POISONOUS_POTATO("POISONOUS_POTATO", 0),
	POLAR_BEAR_SPAWN_EGG("MONSTER_EGG", 0, 78),
	POLISHED_ANDESITE("STONE", 6),
	POLISHED_DIORITE("STONE", 4),
	POLISHED_GRANITE("STONE", 2),
	POPPED_CHORUS_FRUIT("CHORUS_FRUIT_POPPED", 0),
	POPPY("RED_ROSE", 0),
	PORKCHOP("PORK", 0),
	POTATO("POTATO", 0),
	POTATOES("POTATO", 0),
	POTION("POTION", 0),
	POTTED_ACACIA_SAPLING("FLOWER_POT", 0),
	POTTED_ALLIUM("FLOWER_POT", 0),
	POTTED_AZURE_BLUET("FLOWER_POT", 0),
	POTTED_BIRCH_SAPLING("FLOWER_POT", 0),
	POTTED_BLUE_ORCHID("FLOWER_POT", 0),
	POTTED_BROWN_MUSHROOM("FLOWER_POT", 0),
	POTTED_CACTUS("FLOWER_POT", 0),
	POTTED_DANDELION("FLOWER_POT", 0),
	POTTED_DARK_OAK_SAPLING("FLOWER_POT", 0),
	POTTED_DEAD_BUSH("FLOWER_POT", 0),
	POTTED_FERN("FLOWER_POT", 0),
	POTTED_JUNGLE_SAPLING("FLOWER_POT", 0),
	POTTED_OAK_SAPLING("FLOWER_POT", 0),
	POTTED_ORANGE_TULIP("FLOWER_POT", 0),
	POTTED_OXEYE_DAISY("FLOWER_POT", 0),
	POTTED_PINK_TULIP("FLOWER_POT", 0),
	POTTED_POPPY("FLOWER_POT", 0),
	POTTED_RED_MUSHROOM("FLOWER_POT", 0),
	POTTED_RED_TULIP("FLOWER_POT", 0),
	POTTED_SPRUCE_SAPLING("FLOWER_POT", 0),
	POTTED_WHITE_TULIP("FLOWER_POT", 0),
	POWERED_RAIL("POWERED_RAIL", 0),
	PRISMARINE("PRISMARINE", 0),
	PRISMARINE_BRICKS("PRISMARINE", 1),
	PRISMARINE_BRICK_SLAB("STONE", 0),
	PRISMARINE_BRICK_STAIRS("STONE", 0),
	PRISMARINE_CRYSTALS("PRISMARINE_CRYSTALS", 0),
	PRISMARINE_SHARD("PRISMARINE_SHARD", 0),
	PRISMARINE_SLAB("STONE", 0),
	PRISMARINE_STAIRS("STONE", 0),
	PUFFERFISH("RAW_FISH", 3),
	PUFFERFISH_BUCKET("STONE", 0),
	PUFFERFISH_SPAWN_EGG("MONSTER_EGG", 0, 89),
	PUMPKIN("PUMPKIN", 0),
	PUMPKIN_PIE("PUMPKIN_PIE", 0),
	PUMPKIN_SEEDS("PUMPKIN_SEEDS", 0),
	PUMPKIN_STEM("PUMPKIN_STEM", 0),
	PURPLE_BANNER("BANNER", 5),
	PURPLE_BED("BED", 10),
	PURPLE_CARPET("CARPET", 10),
	PURPLE_CONCRETE("CONCRETE", 10),
	PURPLE_CONCRETE_POWDER("CONCRETE_POWDER", 10),
	PURPLE_DYE("INK_SACK", 5),
	PURPLE_GLAZED_TERRACOTTA("PURPLE_GLAZED_TERRACOTTA", 0),
	PURPLE_SHULKER_BOX("PURPLE_SHULKER_BOX", 0),
	PURPLE_STAINED_GLASS("STAINED_GLASS", 10),
	PURPLE_STAINED_GLASS_PANE("STAINED_GLASS_PANE", 10),
	PURPLE_TERRACOTTA("STAINED_CLAY", 10),
	PURPLE_WALL_BANNER("WALL_BANNER", 0),
	PURPLE_WOOL("WOOL", 10),
	PURPUR_BLOCK("PURPUR_BLOCK", 0),
	PURPUR_PILLAR("PURPUR_PILLAR", 0),
	PURPUR_SLAB("PURPUR_SLAB", 0),
	PURPUR_STAIRS("PURPUR_STAIRS", 0),
	QUARTZ("QUARTZ", 0),
	QUARTZ_BLOCK("QUARTZ_BLOCK", 0),
	QUARTZ_PILLAR("QUARTZ_BLOCK", 2),
	QUARTZ_SLAB("STONE_SLAB2", 7),
	QUARTZ_STAIRS("QUARTZ_STAIRS", 0),
	RABBIT("RABBIT", 0),
	RABBIT_FOOT("RABBIT_FOOT", 0),
	RABBIT_HIDE("RABBIT_HIDE", 0),
	RABBIT_SPAWN_EGG("MONSTER_EGG", 0, 77),
	RABBIT_STEW("RABBIT_STEW", 0),
	RAIL("RAILS", 0),
	REDSTONE("REDSTONE", 0),
	REDSTONE_BLOCK("REDSTONE_BLOCK", 0),
	REDSTONE_LAMP("REDSTONE_LAMP_OFF", 0),
	REDSTONE_ORE("REDSTONE_ORE", 0),
	REDSTONE_TORCH("REDSTONE_TORCH_ON", 0),
	REDSTONE_WALL_TORCH("REDSTONE_TORCH_ON", 1),
	REDSTONE_WIRE("REDSTONE_WIRE", 0),
	RED_BANNER("BANNER", 1),
	RED_BED("BED", 14),
	RED_CARPET("CARPET", 14),
	RED_CONCRETE("CONCRETE", 14),
	RED_CONCRETE_POWDER("CONCRETE_POWDER", 14),
	RED_GLAZED_TERRACOTTA("RED_GLAZED_TERRACOTTA", 0),
	RED_MUSHROOM("RED_MUSHROOM", 0),
	RED_MUSHROOM_BLOCK("RED_MUSHROOM", 0),
	RED_NETHER_BRICKS("RED_NETHER_BRICK", 0),
	RED_SAND("SAND", 1),
	RED_SANDSTONE("RED_SANDSTONE", 0),
	RED_SANDSTONE_SLAB("STONE", 0),
	RED_SANDSTONE_STAIRS("RED_SANDSTONE_STAIRS", 0),
	RED_SHULKER_BOX("RED_SHULKER_BOX", 0),
	RED_STAINED_GLASS("STAINED_GLASS", 14),
	RED_STAINED_GLASS_PANE("STAINED_GLASS_PANE", 14),
	RED_TERRACOTTA("STAINED_CLAY", 14),
	RED_TULIP("RED_ROSE", 4),
	RED_WALL_BANNER("WALL_BANNER", 0),
	RED_WOOL("WOOL", 14),
	REPEATER("DIODE", 0),
	REPEATING_COMMAND_BLOCK("COMMAND_REPEATING", 0),
	ROSE_BUSH("DOUBLE_PLANT", 4),
	ROSE_RED("INK_SACK", 1),
	ROTTEN_FLESH("ROTTEN_FLESH", 0),
	SADDLE("SADDLE", 0),
	SALMON("RAW_FISH", 1),
	SALMON_BUCKET("BUCKET", 0),
	SALMON_SPAWN_EGG("MONSTER_EGG", 0, 88),
	SAND("SAND", 0),
	SANDSTONE("SANDSTONE", 0),
	SANDSTONE_SLAB("STONE_SLAB2", 1),
	SANDSTONE_STAIRS("SANDSTONE_STAIRS", 0),
	SCUTE("STONE", 0),
	SEAGRASS("STONE", 0),
	SEA_LANTERN("SEA_LANTERN", 0),
	SEA_PICKLE("STONE", 0),
	SHEARS("SHEARS", 0),
	SHEEP_SPAWN_EGG("MONSTER_EGG", 0, 67),
	SHIELD("SHIELD", 0),
	SHULKER_BOX("PURPLE_SHULKER_BOX", 0),
	SHULKER_SHELL("SHULKER_SHELL", 0),
	SHULKER_SPAWN_EGG("MONSTER_EGG", 0, 65),
	SIGN("SIGN", 0),
	SILVERFISH_SPAWN_EGG("MONSTER_EGG", 0, 56),
	SKELETON_HORSE_SPAWN_EGG("MONSTER_EGG", 0, 28),
	SKELETON_SKULL("SKULL", 0),
	SKELETON_SPAWN_EGG("MONSTER_EGG", 0, 47),
	SKELETON_WALL_SKULL("SKULL", 0),
	SLIME_BALL("SLIME_BALL", 0),
	SLIME_BLOCK("SLIME_BLOCK", 0),
	SLIME_SPAWN_EGG("MONSTER_EGG", 0, 51),
	SMOOTH_QUARTZ("STONE", 0),
	SMOOTH_RED_SANDSTONE("RED_SANDSTONE", 2),
	SMOOTH_SANDSTONE("SANDSTONE", 2),
	SMOOTH_STONE("STEP", 0),
	SNOW("SNOW", 0),
	SNOWBALL("SNOW_BALL", 0),
	SNOW_BLOCK("SNOW_BLOCK", 0),
	SOUL_SAND("SOUL_SAND", 0),
	SPAWNER("MOB_SPAWNER", 0),
	SPECTRAL_ARROW("SPECTRAL_ARROW", 0),
	SPIDER_EYE("SPIDER_EYE", 0),
	SPIDER_SPAWN_EGG("MONSTER_EGG", 0, 48),
	SPLASH_POTION("SPLASH_POTION", 0),
	SPONGE("SPONGE", 0),
	SPRUCE_BOAT("BOAT_SPRUCE", 0),
	SPRUCE_BUTTON("WOOD_BUTTON", 0),
	SPRUCE_DOOR("SPRUCE_DOOR", 0),
	SPRUCE_FENCE("SPRUCE_FENCE", 0),
	SPRUCE_FENCE_GATE("SPRUCE_FENCE_GATE", 0),
	SPRUCE_LEAVES("LEAVES", 1),
	SPRUCE_LOG("LOG", 1),
	SPRUCE_PLANKS("WOOD", 1),
	SPRUCE_PRESSURE_PLATE("WOOD_PLATE", 0),
	SPRUCE_SAPLING("SAPLING", 1),
	SPRUCE_SLAB("WOOD_STEP", 1),
	SPRUCE_STAIRS("SPRUCE_WOOD_STAIRS", 0),
	SPRUCE_TRAPDOOR("TRAP_DOOR", 0),
	SPRUCE_WOOD("LOG", 1),
	SQUID_SPAWN_EGG("MONSTER_EGG", 0, 70),
	STATIONARY_WATER("STATIONARY_WATER",0),
	STATIONARY_LAVA("STATIONARY_LAVA",0),
	STICK("STICK", 0),
	STICKY_PISTON("PISTON_STICKY_BASE", 0),
	STONE_AXE("STONE_AXE", 0),
	STONE_BRICKS("SMOOTH_BRICK", 0),
	STONE_BRICK_SLAB("STONE_SLAB2", 5),
	STONE_BRICK_STAIRS("SMOOTH_STAIRS", 0),
	STONE_BUTTON("STONE_BUTTON", 0),
	STONE_HOE("STONE_HOE", 0),
	STONE_PICKAXE("STONE_PICKAXE", 0),
	STONE_PRESSURE_PLATE("STONE_PLATE", 0),
	STONE_SHOVEL("STONE_SPADE", 0),
	STONE_SLAB("STONE_SLAB2", 0),
	STONE_SWORD("STONE_SWORD", 0),
	STRAY_SPAWN_EGG("MONSTER_EGG", 0, 6),
	STRING("STRING", 0),
	STRIPPED_ACACIA_LOG("STONE", 0),
	STRIPPED_ACACIA_WOOD("STONE", 0),
	STRIPPED_BIRCH_LOG("STONE", 0),
	STRIPPED_BIRCH_WOOD("STONE", 0),
	STRIPPED_DARK_OAK_LOG("STONE", 0),
	STRIPPED_DARK_OAK_WOOD("STONE", 0),
	STRIPPED_JUNGLE_LOG("STONE", 0),
	STRIPPED_JUNGLE_WOOD("STONE", 0),
	STRIPPED_OAK_LOG("STONE", 0),
	STRIPPED_OAK_WOOD("STONE", 0),
	STRIPPED_SPRUCE_LOG("STONE", 0),
	STRIPPED_SPRUCE_WOOD("STONE", 0),
	STRUCTURE_BLOCK("STRUCTURE_BLOCK", 0),
	STRUCTURE_VOID("STRUCTURE_VOID", 0),
	SUGAR("SUGAR", 0),
	SUGAR_CANE("SUGAR_CANE", 0),
	SUNFLOWER("DOUBLE_PLANT", 0),
	TALL_GRASS("DOUBLE_PLANT", 2),
	TALL_SEAGRASS("STONE", 0),
	TERRACOTTA("HARD_CLAY", 0),
	TIPPED_ARROW("TIPPED_ARROW", 0),
	TNT("TNT", 0),
	TNT_MINECART("EXPLOSIVE_MINECART", 0),
	TORCH("TORCH", 0),
	TOTEM_OF_UNDYING("TOTEM", 0),
	TRAPPED_CHEST("TRAPPED_CHEST", 0),
	TRIDENT("STONE", 0),
	TRIPWIRE("TRIPWIRE", 0),
	TRIPWIRE_HOOK("TRIPWIRE_HOOK", 0),
	TROPICAL_FISH("RAW_FISH", 0),
	TROPICAL_FISH_BUCKET("BUCKET", 0),
	TROPICAL_FISH_SPAWN_EGG("MONSTER_EGG", 0, 90),
	TUBE_CORAL("STONE", 0),
	TUBE_CORAL_BLOCK("STONE", 0),
	TUBE_CORAL_FAN("STONE", 0),
	TURTLE_EGG("MONSTER_EGG", 0),
	TURTLE_HELMET("STONE", 0),
	TURTLE_SPAWN_EGG("MONSTER_EGG", 0, 84),
	VEX_SPAWN_EGG("MONSTER_EGG", 0, 35),
	VILLAGER_SPAWN_EGG("MONSTER_EGG", 0, 82),
	VINDICATOR_SPAWN_EGG("MONSTER_EGG", 0, 36),
	VINE("VINE", 0),
	VOID_AIR("AIR", 0),
	WALL_SIGN("WALL_SIGN", 0),
	WALL_TORCH("TORCH", 1),
	WATER("WATER", 0),
	WATER_BUCKET("WATER_BUCKET", 0),
	WET_SPONGE("SPONGE", 1),
	WHEAT("WHEAT", 0),
	WHEAT_SEEDS("SEEDS", 0),
	WHITE_BANNER("BANNER", 15),
	WHITE_BED("BED", 0),
	WHITE_CARPET("CARPET", 0),
	WHITE_CONCRETE("CONCRETE", 0),
	WHITE_CONCRETE_POWDER("CONCRETE_POWDER", 0),
	WHITE_GLAZED_TERRACOTTA("WHITE_GLAZED_TERRACOTTA", 0),
	WHITE_SHULKER_BOX("WHITE_SHULKER_BOX", 0),
	WHITE_STAINED_GLASS("STAINED_GLASS", 0),
	WHITE_STAINED_GLASS_PANE("STAINED_GLASS_PANE", 0),
	WHITE_TERRACOTTA("TERRACOTTA", 0),
	WHITE_TULIP("RED_ROSE", 6),
	WHITE_WALL_BANNER("WALL_BANNER", 0),
	WHITE_WOOL("WOOL", 0),
	WITCH_SPAWN_EGG("MONSTER_EGG", 0, 62),
	WITHER_SKELETON_SKULL("SKULL", 1),
	WITHER_SKELETON_SPAWN_EGG("MONSTER_EGG", 0, 5),
	WITHER_SKELETON_WALL_SKULL("SKULL", 1),
	WOLF_SPAWN_EGG("MONSTER_EGG", 0, 71),
	WOODEN_AXE("WOOD_AXE", 0),
	WOODEN_HOE("WOOD_HOE", 0),
	WOODEN_PICKAXE("WOOD_PICKAXE", 0),
	WOODEN_SHOVEL("WOOD_SPADE", 0),
	WOODEN_SWORD("WOOD_SWORD", 0),
	WRITABLE_BOOK("BOOK_AND_QUILL", 0),
	WRITTEN_BOOK("WRITTEN_BOOK", 0),
	YELLOW_BANNER("BANNER", 11),
	YELLOW_BED("BED", 4),
	YELLOW_CARPET("CARPET", 4),
	YELLOW_CONCRETE("CONCRETE", 4),
	YELLOW_CONCRETE_POWDER("CONCRETE_POWDER", 4),
	YELLOW_GLAZED_TERRACOTTA("YELLOW_GLAZED_TERRACOTTA", 0),
	YELLOW_SHULKER_BOX("YELLOW_SHULKER_BOX", 0),
	YELLOW_STAINED_GLASS("STAINED_GLASS", 4),
	YELLOW_STAINED_GLASS_PANE("STAINED_GLASS_PANE", 4),
	YELLOW_TERRACOTTA("STAINED_CLAY", 4),
	YELLOW_WALL_BANNER("WALL_BANNER", 0),
	YELLOW_WOOL("WOOL", 4),
	ZOMBIE_HEAD("SKULL", 2),
	ZOMBIE_HORSE_SPAWN_EGG("MONSTER_EGG", 0, 29),
	ZOMBIE_PIGMAN_SPAWN_EGG("MONSTER_EGG", 0, 53),
	ZOMBIE_SPAWN_EGG("MONSTER_EGG", 0, 50),
	ZOMBIE_VILLAGER_SPAWN_EGG("MONSTER_EGG", 0, 27),
	ZOMBIE_WALL_HEAD("SKULL", 2),
	;
	String m;
	int data;
	int s_data;
	
	XMaterial(String m, int data ){
		this.m = m;
		this.data = data;
	}
	
	XMaterial(String m, int data,int s_data){
		this.m = m;
		this.data = data;
		this.s_data = s_data;
	}
	
	/*
	 * key 所需查找物品的命名key,格式xxx:xxx或xxx。
	 */
	public static XMaterial XfromString(String key){
		XMaterial xmat = null;
		int ty = 0;
		if(key.contains(":")) {
			String[] split = key.split(":");
			key = split[0];
			try {
				ty = Integer.parseInt(split[1]);
			}catch(NumberFormatException nfe) {
				ty = 0;
			}
		}
		try{
			xmat = XMaterial.valueOf(key);
			return xmat;
		}catch(IllegalArgumentException e){
			xmat = requestXMaterial(key,(byte) 0);
			if(!isDamageable(xmat))
			{
				xmat = requestXMaterial(key,(byte) ty);
			}		
			return xmat;
		}	
			
/*		XMaterial xmat = null;
		try{
			xmat = XMaterial.valueOf(key);
			return xmat;
		}catch(IllegalArgumentException e){
			String[] split = key.split(":");
			if(split.length == 1){
				xmat = requestXMaterial(key,(byte) 0);
			}else{
				xmat = requestXMaterial(split[0],(byte) Integer.parseInt(split[1]));
			}
			return xmat;
		}	*/
	}
	
	/*
	 * key 所需查找物品的命名key,格式xxx:xxx或xxx。
	 */
	public static Material fromString(String key){
		try {
			return (XMaterial.XfromString(key)).parseMaterial();
		}catch(NullPointerException e){
			return Material.STONE;
		}
	}
		
	/*
	 * name所查找物品的名字
	 * 
	 * date所查找物品的下标 少武器奶就
	 * 
	 * XMaterial 返回对应物品XMaterial
	 * 
	 */
	private static HashMap<String, XMaterial> cachedSearch = new HashMap<>();
	public static XMaterial requestXMaterial(String name, byte data){
		if(cachedSearch.containsKey(name.toUpperCase()+","+data)){
			return cachedSearch.get(name.toUpperCase()+","+data);
		}
		for(XMaterial mat:XMaterial.values()){
			if(name.toUpperCase().equals(mat.m) && (((byte)mat.data) == data || ((byte)mat.s_data) == data)){
				cachedSearch.put(mat.m+","+data,mat);
				return mat;
			}
		}
		return null;
	}
	
	public String getOldName()
	{
		return this.m;
	}
	
	/*
	 * 
	 * 将XMaterial转换为Material
	 * 
	 */
	
	public Material parseMaterial(){
        Material mat = Material.matchMaterial(this.toString());
        if(mat != null){
            return mat;
        }
        return Material.matchMaterial(m);
    }
	
	public IMaterial parseIMaterial(){
		try{
			return IMaterial.valueOf(this.m);
		}catch(IllegalArgumentException e)
		{
			return null;
		}
	}
	/*
	 * 
	 * *将Material转换为XMaterial
	 * 
	 */
	public static XMaterial fromMaterial(Material mat){
		try{
			return XMaterial.valueOf(mat.toString());
		}catch(IllegalArgumentException e){
			for(XMaterial xmat:XMaterial.values()){
				if(xmat.m.equals(mat.toString())){
					return xmat;
				}
			}
		}
		return null;
	}
	
	
	/*
	 * 
	 * * 将Material转化为对应物品
	 *   
	 * ItemStack 返回对应物品实例
	 * 
	 */
	
	public ItemStack parseItem(){
		Material mat = parseMaterial();
		if(isNewVersion()){
			return new ItemStack(mat);
		}
		return new ItemStack(mat,1,(byte) data);
	}
	
	
	/*
	 * *检测该XMaterial是否是有耐久属性
	 */
	
	public static boolean isDamageable(XMaterial type){
		String mat =type.toString();
		if(mat.contains("_"))
		{
			String pa[]=mat.split("_",2);
			mat = pa[1].trim();
		}		
		switch(mat){
		case "HELMET":
			return true;
		case "CHESTPLATE":
			return true;
		case "LEGGINGS":
			return true;
		case "BOOTS":
			return true;
		case "SWORD":
			return true;
		case "AXE":
			return true;
		case "PICKAXE":
			return true;
		case "SHOVEL":
			return true;
		case "HOE":
			return true;
		case "ELYTRA":
			return true;
//		case "TURTLE_HELMET":
//			return true;
		case "TRIDENT":
			return true;
//		case "HORSE_ARMOR":
//			return true;
		case "SHEARS":
			return true;
		default:
			return false;
		}
	}
	
	public static boolean isDamageable(Material type){
		return XMaterial.isDamageable(XMaterial.fromMaterial(type));
	}
	
	/*
	 * 
	 * *判断该物品实例是否是该XMaterial类型
	 * 
	 */
	public boolean isSameMaterial(ItemStack comp){
		if(isNewVersion()){
			return comp.getType() == this.parseMaterial();
		}
		if(comp.getType() == this.parseMaterial() &&
				((int) comp.getData().getData() == (int) this.data ||(int) comp.getData().getData() == (int) this.s_data )){
			return true;
		}
		XMaterial xmat = fromMaterial(comp.getType());
		if(isDamageable(xmat)){
			if(this.parseMaterial() == comp.getType()){
				return true;
			}
		}
		return false;
	}
	
	/*
	 * 
	 * *判断是否为旧版本(1.12及其以下物品id)
	 * 
	 */
	
	static int newV = -1;
	public static boolean isNewVersion(){
		if(newV == 0) return false;
		if(newV == 1) return true;
        Material mat = Material.matchMaterial("RED_WOOL");
        if(mat != null){
        	newV = 1;
            return true;
        }
        newV = 0;
        return false;
	}
}