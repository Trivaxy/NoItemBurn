package com.trivaxy.noitemburn.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ItemEntity.class)
public abstract class NoItemBurnMixin extends Entity {
	public NoItemBurnMixin(EntityType<?> entityType_1, World world_1) {
		super(entityType_1, world_1);
	}

	public void setOnFireFromLava() {
	}

	public void setOnFireFor(int int_1) {
	}

	public void burn(int int_1) {
	}
}
