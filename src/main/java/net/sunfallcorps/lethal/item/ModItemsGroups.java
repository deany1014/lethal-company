package net.sunfallcorps.lethal.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sunfallcorps.lethal.LethalCompany;
import net.sunfallcorps.lethal.block.ModBlocks;

public class ModItemsGroups {
    public static final ItemGroup LETHAL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LethalCompany.MOD_ID,"lethal"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.lethal"))
                    .icon(() -> new ItemStack(ModItems.LETHAL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.LETHAL); // Note: This order matters
                        entries.add(ModBlocks.COMPANY_SOIL_BLOCK);

                    }).build());

    public static void  registerItemGroups() {
        LethalCompany.LOGGER.info("Registering Item Groups for " +LethalCompany.MOD_ID);
    }
}
