package com.solaydey.radixpack.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import com.solaydey.radixpack.RadixPack;

public class ModItems {
    public static final Item SPELLBOOK = registerItem("spellbook",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RadixPack.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RadixPack.LOGGER.info("Register items for " + RadixPack.MOD_ID);
    }
}