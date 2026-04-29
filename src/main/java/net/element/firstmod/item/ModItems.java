package net.element.firstmod.item;

import net.element.firstmod.Firstmod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    //Items
    public static final Item USELESS_ITEM = registerItem("useless_item", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Firstmod.MOD_ID, "useless_item")))));
    public static final Item LEBRON_JAMES = registerItem("lebron_james", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Firstmod.MOD_ID, "lebron_james")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Firstmod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Firstmod.LOGGER.info("Registering Mod Items for {}", Firstmod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(USELESS_ITEM);
           entries.add(LEBRON_JAMES);
        });
    }
}
