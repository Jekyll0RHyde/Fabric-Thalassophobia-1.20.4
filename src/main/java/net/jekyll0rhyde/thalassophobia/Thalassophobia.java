package net.jekyll0rhyde.thalassophobia;

import net.fabricmc.api.ModInitializer;

import net.jekyll0rhyde.thalassophobia.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thalassophobia implements ModInitializer {
	public static final String MOD_ID = "thalassophobia";
    public static final Logger LOGGER = LoggerFactory.getLogger("thalassophobia");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}