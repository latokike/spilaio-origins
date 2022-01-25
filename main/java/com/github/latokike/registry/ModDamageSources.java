package com.github.latokike.registry;

import io.github.apace100.calio.mixin.DamageSourceAccessor;
import net.minecraft.entity.damage.DamageSource;

public class ModDamageSources {

    public static final DamageSource BOIL_IN_WATER = ((DamageSourceAccessor)((DamageSourceAccessor)DamageSourceAccessor.createDamageSource("boil_in_water")).callSetBypassesArmor()).callSetUnblockable();
}
