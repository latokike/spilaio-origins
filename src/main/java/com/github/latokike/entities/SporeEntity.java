package latokike.mythorigins.common.entities;

import latokike.mythorigins.client.SpilaioOriginsClient;
import latokike.mythorigins.networking.packet.EntitySpawnPacket;
import latokike.mythorigins.common.registry.ModEntities;
import latokike.mythorigins.common.registry.ModItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.Packet;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.List;

public class SporeEntity extends ThrownItemEntity {

    public SporeEntity(EntityType<? extends SporeEntity> entityType, World world) {
        super(entityType, world);
    }

    public SporeEntity(World world, LivingEntity owner) {
        super(ModEntities.SPORE, owner, world);
    }

    @Environment(EnvType.CLIENT)
    public SporeEntity(World world, double x, double y, double z) {
        super(ModEntities.SPORE, x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return MOItems.FLAME_1_ITEM;
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        entityHitResult.getEntity().damage(DamageSource.thrownProjectile(this, this.getOwner()), 1.0F);
        entityHitResult.getEntity().addEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 1));
        this.getEntity().addEffect(new StatusEffectInstance(StatusEffects.SLOW_FALL, 999999, 0));
    }

    public void tick() {
        Entity entity = this.getOwner();
        if (entity instanceof PlayerEntity && !entity.isAlive()) {
            this.remove(RemovalReason.DISCARDED);
        } else {
            super.tick();
        }
    }

    @Override
    @Environment(EnvType.CLIENT)
    public Packet<?> createSpawnPacket() {
        return EntitySpawnPacket.create(this, MythOriginsClient.PacketID);
    }
}