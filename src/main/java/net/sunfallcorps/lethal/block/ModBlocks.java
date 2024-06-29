package net.sunfallcorps.lethal.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sunfallcorps.lethal.LethalCompany;

public class ModBlocks {
    public static final Block COMPANY_SOIL_BLOCK = registerblock("company_soil_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));


    private static Block registerblock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(LethalCompany.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(LethalCompany.MOD_ID),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        LethalCompany.LOGGER.info("Registering ModBlocks for " + LethalCompany.MOD_ID);
    }
}
