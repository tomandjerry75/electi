package com.thecoolguys.Electi.world;

import com.thecoolguys.Electi.registry.ModItems;

import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class InitiumOreGen {
	
	public static ConfiguredFeature<?, ?> ORE_INITIUM_OVERWORLD = Feature.ORE
		    .configure(new OreFeatureConfig(
		      OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
		      ModItems.INITIUM_ORE.getDefaultState(),
		      9)) // vein size
		    .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
		      0, // bottom offset
		      0, // min y level
		      40))) // max y level
		    .spreadHorizontally()
		    .repeat(20); // number of veins per chunk
	
}
