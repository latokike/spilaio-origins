package com.github.latokike.registry;

import com.github.latokike.SpilaioOrigins;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ModTags {
	public static final Tag<Item> GOLDEN_ARMOR = TagRegistry.item(new Identifier(SpilaioOrigins.MODID, "golden_armor"));
	public static final Tag<Item> GOLDEN_TOOLS = TagRegistry.item(new Identifier(SpilaioOrigins.MODID, "golden_tools"));
	public static final Tag<Item> NETHERITE_GOLD_TOOLS = TagRegistry.item(new Identifier(SpilaioOrigins.MODID, "netherite_gold_tools"));
	public static final Tag<Item> ARMOR = TagRegistry.item(new Identifier(SpilaioOrigins.MODID, "armor"));
	public static final Tag<Item> IRON_TOOLS = TagRegistry.item(new Identifier(SpilaioOrigins.MODID, "iron_tools"));
	public static final Tag<Block> EDIBLE = TagRegistry.block(new Identifier(SpilaioOrigins.MODID, "edible"));
}
