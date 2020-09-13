package com.thecoolguys.Electi.registry;

import com.thecoolguys.Electi.Main;
import com.thecoolguys.Electi.blocks.InitiumOre;
import com.thecoolguys.Electi.items.InitiumShard;
import com.thecoolguys.Electi.items.RapidityRelic;
import com.thecoolguys.Electi.items.PowerRelic;
import com.thecoolguys.Electi.items.MobilityRelic;
import com.thecoolguys.Electi.items.ResistanceRelic;
import com.thecoolguys.Electi.world.InitiumOreGen;
import com.thecoolguys.Electi.items.AgilityRelic;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;

public class ModItems {
	
	public static final ItemGroup ELECTI_GROUP = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "electi_group"), () -> new ItemStack(ModItems.INITIUM_SHARD));

	public static final Item RELIC_RAPIDITY = new RapidityRelic(new Item.Settings().group(ModItems.ELECTI_GROUP).maxCount(1));	//haste relic
	public static final Item RELIC_POWER = new PowerRelic(new Item.Settings().group(ModItems.ELECTI_GROUP).maxCount(1));	//power relic
	public static final Item RELIC_MOBILITY = new MobilityRelic(new Item.Settings().group(ModItems.ELECTI_GROUP).maxCount(1));	//speed relic
	public static final Item RELIC_PROTECTION = new ResistanceRelic(new Item.Settings().group(ModItems.ELECTI_GROUP).maxCount(1));	//resistance relic
	public static final Item RELIC_AGILITY = new AgilityRelic(new Item.Settings().group(ModItems.ELECTI_GROUP).maxCount(1));	//jumpboost relic
	public static final Item INITIUM_SHARD = new InitiumShard(new Item.Settings().group(ModItems.ELECTI_GROUP));	//electi group
	
	public static final Block INITIUM_ORE = new InitiumOre();

	public static void registerItems( ) {

	 	Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "relic_rapidity"), RELIC_RAPIDITY);	//haste relic
		Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "relic_power"), RELIC_POWER);	//power relic
		Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "relic_mobility"), RELIC_MOBILITY);	//speed relic
		Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "relic_protection"), RELIC_PROTECTION);	//resistance relic
		Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "relic_agility"), RELIC_AGILITY);	//jumpboost relic
		Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "initium_shard"), INITIUM_SHARD); //initium shard

		Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "initium_ore"), INITIUM_ORE); //initium ore
		Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "initium_ore"), new BlockItem(INITIUM_ORE, new Item.Settings().group(ModItems.ELECTI_GROUP)));
		
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("electi", "ore_initium_overworld"), InitiumOreGen.ORE_INITIUM_OVERWORLD); //initium ore generation
		
	}
	
}
