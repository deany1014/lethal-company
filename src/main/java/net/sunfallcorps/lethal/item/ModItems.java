package net.sunfallcorps.lethal.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sunfallcorps.lethal.LethalCompany;

public class ModItems {
    public static final Item LETHAL = registerItem("lethal", new Item(new FabricItemSettings())); //Copy paste this for new items

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(LETHAL);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LethalCompany.MOD_ID, name), item);
    }

    public static void registerModItems()  {
        LethalCompany.LOGGER.info("Registering Mod Items for " + LethalCompany.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
