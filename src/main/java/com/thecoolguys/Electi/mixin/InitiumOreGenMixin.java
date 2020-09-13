package com.thecoolguys.Electi.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.thecoolguys.Electi.world.InitiumOreGen;

import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

@Mixin(DefaultBiomeFeatures.class)
public class InitiumOreGenMixin {
	
	@Inject(method = "addDefaultOres(Lnet/minecraft/world/biome/GenerationSettings$Builder;)V", at = @At("TAIL"))
	  private static void addDefaultOres(GenerationSettings.Builder builder, CallbackInfo ci) {
	    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, InitiumOreGen.ORE_INITIUM_OVERWORLD);
	  }
	
}
	