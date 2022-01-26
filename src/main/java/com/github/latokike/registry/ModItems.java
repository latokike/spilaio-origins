package com.github.latokike.registry;

import com.github.latokike.SpilaioOrigins;
import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class MOItems {
    public static final Item POISON_BREATH_ITEM = new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC));
    public static final Item SPORE = new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC));

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier(SpilaioOrigins.MODID, "poison_breath_item"), POISON_BREATH_ITEM);
        Registry.register(Registry.ITEM, new Identifier(SpilaioOrigins.MODID, "spore_item"), SPORE_ITEM);
    }
}