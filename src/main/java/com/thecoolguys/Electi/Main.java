package com.thecoolguys.Electi;

import com.thecoolguys.Electi.registry.ModItems;

import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {
	
	public static final String MOD_ID = "electi";

	@Override
	public void onInitialize() {
		
		ModItems.registerItems();
		
	}

}
