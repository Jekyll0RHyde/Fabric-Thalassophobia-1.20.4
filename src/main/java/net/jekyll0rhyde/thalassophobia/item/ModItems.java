package net.jekyll0rhyde.thalassophobia.item;

import net.jekyll0rhyde.thalassophobia.Thalassophobia;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Thalassophobia.MOD_ID, name), item);
    }
    public static void registerModItems() {

        Thalassophobia.LOGGER.info("Registering Mod Items for" + Thalassophobia.MOD_ID);

    }
}
