package com.thecoolguys.Electi.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.Util;
import net.minecraft.world.World;

public class InitiumShard extends Item {

	public InitiumShard(Settings settings) {
		super(settings);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		user.sendSystemMessage(new LiteralText("§6You have gained acess to the relics!"), Util.NIL_UUID);
		return super.use(world, user, hand);
	}
}
