package com.thecoolguys.Electi.items;

import com.thecoolguys.Electi.registry.ModItems;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class PowerRelic extends Item {
    public PowerRelic(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (hand == Hand.MAIN_HAND) {
            int removedCount = user.inventory.remove(itemStack -> itemStack.getItem() == ModItems.INITIUM_SHARD, 1, user.playerScreenHandler.method_29281());
            if (removedCount > 0) {
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20 * 60, 1));
                user.playSound(SoundEvents.ENTITY_PLAYER_LEVELUP, 1.0f, 1.5f);
            }
        }
        return super.use(world, user, hand);
    }
}
