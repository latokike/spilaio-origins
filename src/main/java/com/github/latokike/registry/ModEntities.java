package com.github.latokike.registry;

import com.github.latokike.MythOrigins;
import com.github.latokike.entities.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MOEntities {
    public static final EntityType<PoisonBreathEntity> POISON_BREATH;
    public static final EntityType<SporeEntity> SPORE;

    public static final EntityType<HarpyFeatherArrowEntity> ARROW_HARPY_FEATHER;

    static {
        POISON_BREATH = FabricEntityTypeBuilder.<PoisonBreathEntity>create(SpawnGroup.MISC, PoisonBreathEntity::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f)).trackable(64, 10).build();
        SPORE = FabricEntityTypeBuilder.<Flame1Entity>create(SpawnGroup.MISC, Flame1Entity::new).fireImmune().dimensions(EntityDimensions.changing(0.1F, 0.1F)).build();
    }

    public static void init() {
        Registry.register(Registry.ENTITY_TYPE, new Identifier(MythOrigins.MODID, "poison_breath"), POISON_BREATH);
        Registry.register(Registry.ENTITY_TYPE, new Identifier(MythOrigins.MODID, "spore"), SPORE);
    }
}