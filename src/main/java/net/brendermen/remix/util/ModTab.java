package net.brendermen.remix.util;

import net.brendermen.remix.block.ModBlocks;
import net.brendermen.remix.item.ModItems;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModTab {

    @SubscribeEvent
    public static void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
            Building_Blocks(event);
        } else if (event.getTab() == CreativeModeTabs.COLORED_BLOCKS) {
            Colored_Blocks(event);
        } else if (event.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
            Natural_Blocks(event);
        } else if (event.getTab() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            Functional_Block(event);
        } else if (event.getTab() == CreativeModeTabs.REDSTONE_BLOCKS) {
            REDSTONE_BLOCKS(event);
        } else if (event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            TOOLS_AND_UTILITIES(event);
        } else if (event.getTab() == CreativeModeTabs.COMBAT) {
            COMBAT(event);
        } else if (event.getTab() == CreativeModeTabs.FOOD_AND_DRINKS) {
            FOOD_AND_DRINKS(event);
        } else if (event.getTab() == CreativeModeTabs.INGREDIENTS) {
            INGREDIENTS(event);
        } else if (event.getTab() == CreativeModeTabs.SPAWN_EGGS) {
            SPAWN_EGGS(event);
        }
    }

    private static void Building_Blocks(CreativeModeTabEvent.BuildContents event) {
        event.accept(ModBlocks.OAK_BOARDS);
        event.accept(ModBlocks.BIRCH_BOARDS);
        event.accept(ModBlocks.SPRUCE_BOARDS);
        event.accept(ModBlocks.DARK_OAK_BOARDS);
        event.accept(ModBlocks.ACACIA_BOARDS);
        event.accept(ModBlocks.JUNGLE_BOARDS);
        event.accept(ModBlocks.MANGROVE_BOARDS);
        event.accept(ModBlocks.CRIMSON_BOARDS);
        event.accept(ModBlocks.WARPED_BOARDS);

        event.accept(ModBlocks.POLISHED_DIRT);
        event.accept(ModBlocks.DIRT_BRICKS);
        event.accept(ModBlocks.DIRT_TILES);
        event.accept(ModBlocks.CHISELED_DIRT);
        event.accept(ModBlocks.DIRT_PILLAR);

        event.accept(ModBlocks.POLISHED_PACKED_MUD);
        event.accept(ModBlocks.PACKED_MUD_TILES);
        event.accept(ModBlocks.CHISELED_PACKED_MUD);
        event.accept(ModBlocks.PACKED_MUD_PILLAR);

        event.accept(ModBlocks.POLISHED_MUD);
        event.accept(ModBlocks.MUD_BRICKS);
        event.accept(ModBlocks.MUD_TILES);
        event.accept(ModBlocks.CHISELED_MUD);
        event.accept(ModBlocks.MUD_PILLAR);

        event.accept(ModBlocks.POLISHED_CLAY);
        event.accept(ModBlocks.CLAY_BRICKS);
        event.accept(ModBlocks.CLAY_TILES);
        event.accept(ModBlocks.CHISELED_CLAY);
        event.accept(ModBlocks.CLAY_PILLAR);

        event.accept(ModBlocks.COBBLED_SANDSTONE);
        event.accept(ModBlocks.SANDSTONE_BRICKS);
        event.accept(ModBlocks.SANDSTONE_TILES);
        event.accept(ModBlocks.SANDSTONE_PILLAR);

        event.accept(ModBlocks.COBBLED_RED_SANDSTONE);
        event.accept(ModBlocks.RED_SANDSTONE_BRICKS);
        event.accept(ModBlocks.RED_SANDSTONE_TILES);
        event.accept(ModBlocks.RED_SANDSTONE_PILLAR);

        event.accept(ModBlocks.POLISHED_STONE);
        event.accept(ModBlocks.POLISHED_STONE_STAIRS);
        event.accept(ModBlocks.POLISHED_STONE_SLAB);
        event.accept(ModBlocks.STONE_TILES);
        event.accept(ModBlocks.STONE_TILE_STAIRS);
        event.accept(ModBlocks.STONE_TILE_SLAB);
        event.accept(ModBlocks.STONE_PILLAR);

        event.accept(ModBlocks.MOSSY_STONE);
        event.accept(ModBlocks.MOSSY_STONE_STAIRS);
        event.accept(ModBlocks.MOSSY_STONE_SLAB);
        event.accept(ModBlocks.MOSSY_POLISHED_STONE);
        event.accept(ModBlocks.MOSSY_POLISHED_STONE_STAIRS);
        event.accept(ModBlocks.MOSSY_POLISHED_STONE_SLAB);
        event.accept(ModBlocks.MOSSY_STONE_TILES);
        event.accept(ModBlocks.MOSSY_STONE_TILE_STAIRS);
        event.accept(ModBlocks.MOSSY_STONE_TILE_SLAB);
        event.accept(ModBlocks.MOSSY_CHISELED_STONE);
        event.accept(ModBlocks.MOSSY_STONE_PILLAR);

        event.accept(ModBlocks.CRACKED_STONE);
        event.accept(ModBlocks.CRACKED_STONE_STAIRS);
        event.accept(ModBlocks.CRACKED_STONE_SLAB);
        event.accept(ModBlocks.CRACKED_STONE_BRICK_STAIRS);
        event.accept(ModBlocks.CRACKED_STONE_BRICK_SLAB);
        event.accept(ModBlocks.CRACKED_POLISHED_STONE);
        event.accept(ModBlocks.CRACKED_POLISHED_STONE_STAIRS);
        event.accept(ModBlocks.CRACKED_POLISHED_STONE_SLAB);
        event.accept(ModBlocks.CRACKED_STONE_TILES);
        event.accept(ModBlocks.CRACKED_STONE_TILE_STAIRS);
        event.accept(ModBlocks.CRACKED_STONE_TILE_SLAB);
        event.accept(ModBlocks.CRACKED_CHISELED_STONE);
        event.accept(ModBlocks.CRACKED_STONE_PILLAR);

        event.accept(ModBlocks.GRANITE_BRICKS);
        event.accept(ModBlocks.GRANITE_BRICK_STAIRS);
        event.accept(ModBlocks.GRANITE_BRICK_SLAB);
        event.accept(ModBlocks.GRANITE_TILES);
        event.accept(ModBlocks.GRANITE_TILE_STAIRS);
        event.accept(ModBlocks.GRANITE_TILE_SLAB);
        event.accept(ModBlocks.CHISELED_GRANITE);
        event.accept(ModBlocks.GRANITE_PILLAR);

        event.accept(ModBlocks.ANDESITE_BRICKS);
        event.accept(ModBlocks.ANDESITE_BRICK_STAIRS);
        event.accept(ModBlocks.ANDESITE_BRICK_SLAB);
        event.accept(ModBlocks.ANDESITE_TILES);
        event.accept(ModBlocks.ANDESITE_TILE_STAIRS);
        event.accept(ModBlocks.ANDESITE_TILE_SLAB);
        event.accept(ModBlocks.CHISELED_ANDESITE);
        event.accept(ModBlocks.ANDESITE_PILLAR);

        event.accept(ModBlocks.DIORITE_BRICKS);
        event.accept(ModBlocks.DIORITE_BRICK_STAIRS);
        event.accept(ModBlocks.DIORITE_BRICK_SLAB);
        event.accept(ModBlocks.DIORITE_TILES);
        event.accept(ModBlocks.DIORITE_TILE_STAIRS);
        event.accept(ModBlocks.DIORITE_TILE_SLAB);
        event.accept(ModBlocks.CHISELED_DIORITE);
        event.accept(ModBlocks.DIORITE_PILLAR);

        event.accept(ModBlocks.POLISHED_CALCITE);

        event.accept(ModBlocks.POLISHED_TUFF);

        event.accept(ModBlocks.POINTED_STONE);

        event.accept(ModBlocks.POLISHED_PRISMARINE);

        event.accept(ModBlocks.ELDER_PRISMARINE);
        event.accept(ModBlocks.ELDER_PRISMARINE_BRICKS);
        event.accept(ModBlocks.POLISHED_ELDER_PRISMARINE);

        event.accept(ModBlocks.POLISHED_NETHERRACK);

        event.accept(ModBlocks.BURNT_NETHER_BRICKS);

        event.accept(ModBlocks.WARPED_NETHER_BRICKS);

        event.accept(ModBlocks.POLISHED_END_STONE);

        event.accept(ModBlocks.POLISHED_AMETHYST_BLOCK);
    }

    private static void Colored_Blocks(CreativeModeTabEvent.BuildContents event) {
        event.getEntries().putBefore(Items.RED_WOOL.getDefaultInstance(),
                ModBlocks.FUCHSIA_WOOL.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.ORANGE_WOOL.getDefaultInstance(),
                ModBlocks.SCARLET_WOOL.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.YELLOW_WOOL.getDefaultInstance(),
                ModBlocks.AMBER_WOOL.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.LIME_WOOL.getDefaultInstance(),
                ModBlocks.LEMON_WOOL.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.GREEN_WOOL.getDefaultInstance(),
                ModBlocks.FOREST_WOOL.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.CYAN_WOOL.getDefaultInstance(),
                ModBlocks.TEAL_WOOL.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.LIGHT_BLUE_WOOL.getDefaultInstance(),
                ModBlocks.CERULEAN_WOOL.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.BLUE_WOOL.getDefaultInstance(),
                ModBlocks.AZURE_WOOL.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.PURPLE_WOOL.getDefaultInstance(),
                ModBlocks.INDIGO_WOOL.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.MAGENTA_WOOL.getDefaultInstance(),
                ModBlocks.VIOLET_WOOL.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.PINK_WOOL.getDefaultInstance(),
                ModBlocks.VELVET_WOOL.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.BROWN_WOOL.getDefaultInstance(),
                ModBlocks.TAN_WOOL.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TAN_WOOL.get().asItem().getDefaultInstance(),
                ModBlocks.CREAM_WOOL.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.getEntries().putAfter(ModBlocks.FUCHSIA_WOOL.get().asItem().getDefaultInstance(),
                ModBlocks.FUCHSIA_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.RED_WOOL.getDefaultInstance(),
                ModBlocks.RED_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.SCARLET_WOOL.get().asItem().getDefaultInstance(),
                ModBlocks.SCARLET_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.ORANGE_WOOL.getDefaultInstance(),
                ModBlocks.ORANGE_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.AMBER_WOOL.get().asItem().getDefaultInstance(),
                ModBlocks.AMBER_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.YELLOW_WOOL.getDefaultInstance(),
                ModBlocks.YELLOW_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LEMON_WOOL.get().asItem().getDefaultInstance(),
                ModBlocks.LEMON_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.LIME_WOOL.getDefaultInstance(),
                ModBlocks.LIME_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.FOREST_WOOL.get().asItem().getDefaultInstance(),
                ModBlocks.FOREST_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.GREEN_WOOL.getDefaultInstance(),
                ModBlocks.GREEN_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TEAL_WOOL.get().asItem().getDefaultInstance(),
                ModBlocks.TEAL_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.CYAN_WOOL.getDefaultInstance(),
                ModBlocks.CYAN_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CERULEAN_WOOL.get().asItem().getDefaultInstance(),
                ModBlocks.CERULEAN_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.LIGHT_BLUE_WOOL.getDefaultInstance(),
                ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.AZURE_WOOL.get().asItem().getDefaultInstance(),
                ModBlocks.AZURE_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.BLUE_WOOL.getDefaultInstance(),
                ModBlocks.BLUE_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.INDIGO_WOOL.get().asItem().getDefaultInstance(),
                ModBlocks.INDIGO_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.PURPLE_WOOL.getDefaultInstance(),
                ModBlocks.PURPLE_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.VIOLET_WOOL.get().asItem().getDefaultInstance(),
                ModBlocks.VIOLET_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.MAGENTA_WOOL.getDefaultInstance(),
                ModBlocks.MAGENTA_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.VELVET_WOOL.get().asItem().getDefaultInstance(),
                ModBlocks.VELVET_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.PINK_WOOL.getDefaultInstance(),
                ModBlocks.PINK_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.WHITE_WOOL.getDefaultInstance(),
                ModBlocks.WHITE_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.LIGHT_GRAY_WOOL.getDefaultInstance(),
                ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.GRAY_WOOL.getDefaultInstance(),
                ModBlocks.GRAY_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.BLACK_WOOL.getDefaultInstance(),
                ModBlocks.BLACK_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.BROWN_WOOL.getDefaultInstance(),
                ModBlocks.BROWN_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TAN_WOOL.get().asItem().getDefaultInstance(),
                ModBlocks.TAN_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CREAM_WOOL.get().asItem().getDefaultInstance(),
                ModBlocks.CREAM_WOOL_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.getEntries().putAfter(ModBlocks.FUCHSIA_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.FUCHSIA_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.RED_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.RED_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.SCARLET_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.SCARLET_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.ORANGE_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.ORANGE_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.AMBER_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.AMBER_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.YELLOW_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.YELLOW_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LEMON_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.LEMON_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LIME_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.LIME_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.FOREST_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.FOREST_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.GREEN_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.GREEN_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TEAL_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.TEAL_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CYAN_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.CYAN_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CERULEAN_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.CERULEAN_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.LIGHT_BLUE_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.AZURE_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.AZURE_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.BLUE_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.BLUE_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.INDIGO_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.INDIGO_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.PURPLE_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.PURPLE_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.VIOLET_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.VIOLET_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.MAGENTA_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.MAGENTA_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.VELVET_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.VELVET_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.PINK_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.PINK_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.WHITE_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.WHITE_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.LIGHT_GRAY_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.GRAY_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.GRAY_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.BLACK_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.BLACK_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.BROWN_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.BROWN_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TAN_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.TAN_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CREAM_WOOL_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.CREAM_WOOL_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.getEntries().putAfter(ModBlocks.FUCHSIA_WOOL_SLAB.get().asItem().getDefaultInstance(),
                ModBlocks.FUCHSIA_CARPET.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.RED_WOOL_SLAB.get().asItem().getDefaultInstance(),
                Items.RED_CARPET.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.SCARLET_WOOL_SLAB.get().asItem().getDefaultInstance(),
                ModBlocks.SCARLET_CARPET.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.ORANGE_WOOL_SLAB.get().asItem().getDefaultInstance(),
                Items.ORANGE_CARPET.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.AMBER_WOOL_SLAB.get().asItem().getDefaultInstance(),
                ModBlocks.AMBER_CARPET.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.YELLOW_WOOL_SLAB.get().asItem().getDefaultInstance(),
                Items.YELLOW_CARPET.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LEMON_WOOL_SLAB.get().asItem().getDefaultInstance(),
                ModBlocks.LEMON_CARPET.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LIME_WOOL_SLAB.get().asItem().getDefaultInstance(),
                Items.LIME_CARPET.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.FOREST_WOOL_SLAB.get().asItem().getDefaultInstance(),
                ModBlocks.FOREST_CARPET.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.GREEN_WOOL_SLAB.get().asItem().getDefaultInstance(),
                Items.GREEN_CARPET.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TEAL_WOOL_SLAB.get().asItem().getDefaultInstance(),
                ModBlocks.TEAL_CARPET.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CYAN_WOOL_SLAB.get().asItem().getDefaultInstance(),
                Items.CYAN_CARPET.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CERULEAN_WOOL_SLAB.get().asItem().getDefaultInstance(),
                ModBlocks.CERULEAN_CARPET.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LIGHT_BLUE_WOOL_SLAB.get().asItem().getDefaultInstance(),
                Items.LIGHT_BLUE_CARPET.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.AZURE_WOOL_SLAB.get().asItem().getDefaultInstance(),
                ModBlocks.AZURE_CARPET.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.BLUE_WOOL_SLAB.get().asItem().getDefaultInstance(),
                Items.BLUE_CARPET.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.INDIGO_WOOL_SLAB.get().asItem().getDefaultInstance(),
                ModBlocks.INDIGO_CARPET.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.PURPLE_WOOL_SLAB.get().asItem().getDefaultInstance(),
                Items.PURPLE_CARPET.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.VIOLET_WOOL_SLAB.get().asItem().getDefaultInstance(),
                ModBlocks.VIOLET_CARPET.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.MAGENTA_WOOL_SLAB.get().asItem().getDefaultInstance(),
                Items.MAGENTA_CARPET.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.VELVET_WOOL_SLAB.get().asItem().getDefaultInstance(),
                ModBlocks.VELVET_CARPET.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.PINK_WOOL_SLAB.get().asItem().getDefaultInstance(),
                Items.PINK_CARPET.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.WHITE_WOOL_SLAB.get().asItem().getDefaultInstance(),
                Items.WHITE_CARPET.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LIGHT_GRAY_WOOL_SLAB.get().asItem().getDefaultInstance(),
                Items.LIGHT_GRAY_CARPET.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.GRAY_WOOL_SLAB.get().asItem().getDefaultInstance(),
                Items.GRAY_CARPET.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.BLACK_WOOL_SLAB.get().asItem().getDefaultInstance(),
                Items.BLACK_CARPET.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.BROWN_WOOL_SLAB.get().asItem().getDefaultInstance(),
                Items.BROWN_CARPET.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TAN_WOOL_SLAB.get().asItem().getDefaultInstance(),
                ModBlocks.TAN_CARPET.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CREAM_WOOL_SLAB.get().asItem().getDefaultInstance(),
                ModBlocks.CREAM_CARPET.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.getEntries().putBefore(Items.RED_TERRACOTTA.getDefaultInstance(),
                ModBlocks.FUCHSIA_TERRACOTTA.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.ORANGE_TERRACOTTA.getDefaultInstance(),
                ModBlocks.SCARLET_TERRACOTTA.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.YELLOW_TERRACOTTA.getDefaultInstance(),
                ModBlocks.AMBER_TERRACOTTA.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.LIME_TERRACOTTA.getDefaultInstance(),
                ModBlocks.LEMON_TERRACOTTA.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.GREEN_TERRACOTTA.getDefaultInstance(),
                ModBlocks.FOREST_TERRACOTTA.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.CYAN_TERRACOTTA.getDefaultInstance(),
                ModBlocks.TEAL_TERRACOTTA.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.LIGHT_BLUE_TERRACOTTA.getDefaultInstance(),
                ModBlocks.CERULEAN_TERRACOTTA.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.BLUE_TERRACOTTA.getDefaultInstance(),
                ModBlocks.AZURE_TERRACOTTA.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.PURPLE_TERRACOTTA.getDefaultInstance(),
                ModBlocks.INDIGO_TERRACOTTA.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.MAGENTA_TERRACOTTA.getDefaultInstance(),
                ModBlocks.VIOLET_TERRACOTTA.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.PINK_TERRACOTTA.getDefaultInstance(),
                ModBlocks.VELVET_TERRACOTTA.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.BROWN_TERRACOTTA.getDefaultInstance(),
                ModBlocks.TAN_TERRACOTTA.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TAN_TERRACOTTA.get().asItem().getDefaultInstance(),
                ModBlocks.CREAM_TERRACOTTA.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.getEntries().putAfter(Items.TERRACOTTA.getDefaultInstance(),
                ModBlocks.TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.FUCHSIA_TERRACOTTA.get().asItem().getDefaultInstance(),
                ModBlocks.FUCHSIA_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.RED_TERRACOTTA.getDefaultInstance(),
                ModBlocks.RED_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.SCARLET_TERRACOTTA.get().asItem().getDefaultInstance(),
                ModBlocks.SCARLET_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.ORANGE_TERRACOTTA.getDefaultInstance(),
                ModBlocks.ORANGE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.AMBER_TERRACOTTA.get().asItem().getDefaultInstance(),
                ModBlocks.AMBER_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.YELLOW_TERRACOTTA.getDefaultInstance(),
                ModBlocks.YELLOW_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LEMON_TERRACOTTA.get().asItem().getDefaultInstance(),
                ModBlocks.LEMON_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.LIME_TERRACOTTA.getDefaultInstance(),
                ModBlocks.LIME_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.FOREST_TERRACOTTA.get().asItem().getDefaultInstance(),
                ModBlocks.FOREST_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.GREEN_TERRACOTTA.getDefaultInstance(),
                ModBlocks.GREEN_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TEAL_TERRACOTTA.get().asItem().getDefaultInstance(),
                ModBlocks.TEAL_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.CYAN_TERRACOTTA.getDefaultInstance(),
                ModBlocks.CYAN_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CERULEAN_TERRACOTTA.get().asItem().getDefaultInstance(),
                ModBlocks.CERULEAN_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.LIGHT_BLUE_TERRACOTTA.getDefaultInstance(),
                ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.AZURE_TERRACOTTA.get().asItem().getDefaultInstance(),
                ModBlocks.AZURE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.BLUE_TERRACOTTA.getDefaultInstance(),
                ModBlocks.BLUE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.INDIGO_TERRACOTTA.get().asItem().getDefaultInstance(),
                ModBlocks.INDIGO_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.PURPLE_TERRACOTTA.getDefaultInstance(),
                ModBlocks.PURPLE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.VIOLET_TERRACOTTA.get().asItem().getDefaultInstance(),
                ModBlocks.VIOLET_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.MAGENTA_TERRACOTTA.getDefaultInstance(),
                ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.VELVET_TERRACOTTA.get().asItem().getDefaultInstance(),
                ModBlocks.VELVET_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.PINK_TERRACOTTA.getDefaultInstance(),
                ModBlocks.PINK_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.WHITE_TERRACOTTA.getDefaultInstance(),
                ModBlocks.WHITE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.LIGHT_GRAY_TERRACOTTA.getDefaultInstance(),
                ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.GRAY_TERRACOTTA.getDefaultInstance(),
                ModBlocks.GRAY_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.BLACK_TERRACOTTA.getDefaultInstance(),
                ModBlocks.BLACK_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.BROWN_TERRACOTTA.getDefaultInstance(),
                ModBlocks.BROWN_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TAN_TERRACOTTA.get().asItem().getDefaultInstance(),
                ModBlocks.TAN_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CREAM_TERRACOTTA.get().asItem().getDefaultInstance(),
                ModBlocks.CREAM_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.getEntries().putAfter(ModBlocks.TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.FUCHSIA_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.FUCHSIA_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.RED_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.RED_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.SCARLET_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.SCARLET_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.ORANGE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.ORANGE_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.AMBER_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.AMBER_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.YELLOW_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.YELLOW_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LEMON_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.LEMON_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LIME_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.LIME_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.FOREST_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.FOREST_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.GREEN_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.GREEN_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TEAL_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.TEAL_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CYAN_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.CYAN_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CERULEAN_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.CERULEAN_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.AZURE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.AZURE_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.BLUE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.BLUE_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.INDIGO_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.INDIGO_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.PURPLE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.PURPLE_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.VIOLET_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.VIOLET_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.MAGENTA_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.VELVET_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.VELVET_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.PINK_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.PINK_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.WHITE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.WHITE_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.GRAY_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.GRAY_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.BLACK_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.BLACK_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.BROWN_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.BROWN_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TAN_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.TAN_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CREAM_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.CREAM_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.getEntries().putAfter(ModBlocks.PINK_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(),
                ModBlocks.TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.WHITE_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.WHITE_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.GRAY_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.GRAY_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.BLACK_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.BLACK_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.BROWN_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.BROWN_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.TAN_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TAN_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.CREAM_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CREAM_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.FUCHSIA_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.FUCHSIA_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.RED_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.RED_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.SCARLET_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.SCARLET_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.ORANGE_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.ORANGE_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.AMBER_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.AMBER_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.YELLOW_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.YELLOW_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.LEMON_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LEMON_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.LIME_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LIME_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.FOREST_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.FOREST_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.GREEN_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.GREEN_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.TEAL_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TEAL_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.CYAN_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CYAN_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.CERULEAN_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CERULEAN_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.AZURE_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.AZURE_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.BLUE_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.BLUE_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.INDIGO_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.INDIGO_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.PURPLE_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.PURPLE_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.VIOLET_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.VIOLET_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.MAGENTA_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.MAGENTA_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.VELVET_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.VELVET_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.PINK_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.getEntries().putAfter(ModBlocks.TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.FUCHSIA_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.FUCHSIA_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.RED_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.RED_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.SCARLET_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.SCARLET_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.ORANGE_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.AMBER_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.AMBER_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.YELLOW_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LEMON_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.LEMON_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LIME_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.LIME_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.FOREST_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.FOREST_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.GREEN_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.GREEN_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TEAL_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.TEAL_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CYAN_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.CYAN_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CERULEAN_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.CERULEAN_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.AZURE_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.AZURE_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.BLUE_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.BLUE_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.INDIGO_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.INDIGO_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.PURPLE_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.VIOLET_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.VIOLET_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.MAGENTA_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.VELVET_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.VELVET_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.PINK_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.PINK_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.WHITE_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.WHITE_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.GRAY_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.GRAY_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.BLACK_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.BLACK_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.BROWN_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.BROWN_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TAN_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.TAN_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CREAM_TERRACOTTA_BRICKS.get().asItem().getDefaultInstance(),
                ModBlocks.CREAM_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.getEntries().putAfter(ModBlocks.TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.FUCHSIA_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.FUCHSIA_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.RED_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.RED_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.SCARLET_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.SCARLET_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.ORANGE_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.AMBER_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.AMBER_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.YELLOW_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LEMON_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.LEMON_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LIME_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.LIME_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.FOREST_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.FOREST_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.GREEN_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.GREEN_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TEAL_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.TEAL_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CYAN_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.CYAN_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CERULEAN_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.CERULEAN_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.AZURE_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.AZURE_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.BLUE_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.BLUE_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.INDIGO_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.INDIGO_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.PURPLE_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.VIOLET_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.VIOLET_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.VELVET_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.VELVET_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.PINK_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.PINK_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.WHITE_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.WHITE_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.GRAY_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.GRAY_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.BLACK_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.BLACK_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.BROWN_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.BROWN_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TAN_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.TAN_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CREAM_TERRACOTTA_BRICK_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.CREAM_TERRACOTTA_BRICK_SLAB.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.getEntries().putBefore(Items.RED_CONCRETE.getDefaultInstance(),
                ModBlocks.FUCHSIA_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.ORANGE_CONCRETE.getDefaultInstance(),
                ModBlocks.SCARLET_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.YELLOW_CONCRETE.getDefaultInstance(),
                ModBlocks.AMBER_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.LIME_CONCRETE.getDefaultInstance(),
                ModBlocks.LEMON_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.GREEN_CONCRETE.getDefaultInstance(),
                ModBlocks.FOREST_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.CYAN_CONCRETE.getDefaultInstance(),
                ModBlocks.TEAL_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.LIGHT_BLUE_CONCRETE.getDefaultInstance(),
                ModBlocks.CERULEAN_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.BLUE_CONCRETE.getDefaultInstance(),
                ModBlocks.AZURE_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.PURPLE_CONCRETE.getDefaultInstance(),
                ModBlocks.INDIGO_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.MAGENTA_CONCRETE.getDefaultInstance(),
                ModBlocks.VIOLET_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.PINK_CONCRETE.getDefaultInstance(),
                ModBlocks.VELVET_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.BROWN_CONCRETE.getDefaultInstance(),
                ModBlocks.TAN_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TAN_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.CREAM_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.getEntries().putAfter(ModBlocks.FUCHSIA_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.FUCHSIA_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.RED_CONCRETE.getDefaultInstance(),
                ModBlocks.RED_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.SCARLET_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.SCARLET_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.ORANGE_CONCRETE.getDefaultInstance(),
                ModBlocks.ORANGE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.AMBER_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.AMBER_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.YELLOW_CONCRETE.getDefaultInstance(),
                ModBlocks.YELLOW_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.LEMON_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.LEMON_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.LIME_CONCRETE.getDefaultInstance(),
                ModBlocks.LIME_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.FOREST_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.FOREST_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.GREEN_CONCRETE.getDefaultInstance(),
                ModBlocks.GREEN_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TEAL_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.TEAL_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.CYAN_CONCRETE.getDefaultInstance(),
                ModBlocks.CYAN_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CERULEAN_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.CERULEAN_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.LIGHT_BLUE_CONCRETE.getDefaultInstance(),
                ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.AZURE_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.AZURE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.BLUE_CONCRETE.getDefaultInstance(),
                ModBlocks.BLUE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.INDIGO_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.INDIGO_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.PURPLE_CONCRETE.getDefaultInstance(),
                ModBlocks.PURPLE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.VIOLET_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.VIOLET_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.MAGENTA_CONCRETE.getDefaultInstance(),
                ModBlocks.MAGENTA_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.VELVET_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.VELVET_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.PINK_CONCRETE.getDefaultInstance(),
                ModBlocks.PINK_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.WHITE_CONCRETE.getDefaultInstance(),
                ModBlocks.WHITE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.LIGHT_GRAY_CONCRETE.getDefaultInstance(),
                ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.GRAY_CONCRETE.getDefaultInstance(),
                ModBlocks.GRAY_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.BLACK_CONCRETE.getDefaultInstance(),
                ModBlocks.BLACK_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.BROWN_CONCRETE.getDefaultInstance(),
                ModBlocks.BROWN_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TAN_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.TAN_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.CREAM_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.CREAM_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.getEntries().putAfter(ModBlocks.PINK_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_WHITE_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_WHITE_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_LIGHT_GRAY_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_LIGHT_GRAY_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_GRAY_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_GRAY_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_BLACK_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_BLACK_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_BROWN_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_BROWN_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_TAN_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_TAN_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_CREAM_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_CREAM_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_FUCHSIA_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_FUCHSIA_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_RED_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_RED_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_SCARLET_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_SCARLET_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_ORANGE_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_ORANGE_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_AMBER_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_AMBER_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_YELLOW_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_YELLOW_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_LEMON_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_LEMON_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_LIME_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_LIME_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_FOREST_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_FOREST_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_GREEN_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_GREEN_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_TEAL_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_TEAL_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_CYAN_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_CYAN_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_CERULEAN_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_CERULEAN_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_LIGHT_BLUE_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_LIGHT_BLUE_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_AZURE_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_AZURE_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_BLUE_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_BLUE_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_INDIGO_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_INDIGO_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_PURPLE_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_PURPLE_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_VIOLET_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_VIOLET_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_MAGENTA_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_MAGENTA_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_VELVET_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.POLISHED_VELVET_CONCRETE.get().asItem().getDefaultInstance(),
                ModBlocks.POLISHED_PINK_CONCRETE.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.accept(ModBlocks.WHITE_CONCRETE_BRICKS);
        event.accept(ModBlocks.WHITE_CONCRETE_TILES);

        event.getEntries().putBefore(Items.RED_CONCRETE_POWDER.getDefaultInstance(),
                ModBlocks.FUCHSIA_CONCRETE_POWDER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.ORANGE_CONCRETE_POWDER.getDefaultInstance(),
                ModBlocks.SCARLET_CONCRETE_POWDER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.YELLOW_CONCRETE_POWDER.getDefaultInstance(),
                ModBlocks.AMBER_CONCRETE_POWDER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.LIME_CONCRETE_POWDER.getDefaultInstance(),
                ModBlocks.LEMON_CONCRETE_POWDER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.GREEN_CONCRETE_POWDER.getDefaultInstance(),
                ModBlocks.FOREST_CONCRETE_POWDER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.CYAN_CONCRETE_POWDER.getDefaultInstance(),
                ModBlocks.TEAL_CONCRETE_POWDER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.LIGHT_BLUE_CONCRETE_POWDER.getDefaultInstance(),
                ModBlocks.CERULEAN_CONCRETE_POWDER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.BLUE_CONCRETE_POWDER.getDefaultInstance(),
                ModBlocks.AZURE_CONCRETE_POWDER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.PURPLE_CONCRETE_POWDER.getDefaultInstance(),
                ModBlocks.INDIGO_CONCRETE_POWDER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.MAGENTA_CONCRETE_POWDER.getDefaultInstance(),
                ModBlocks.VIOLET_CONCRETE_POWDER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.PINK_CONCRETE_POWDER.getDefaultInstance(),
                ModBlocks.VELVET_CONCRETE_POWDER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.BROWN_CONCRETE_POWDER.getDefaultInstance(),
                ModBlocks.TAN_CONCRETE_POWDER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TAN_CONCRETE_POWDER.get().asItem().getDefaultInstance(),
                ModBlocks.CREAM_CONCRETE_POWDER.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.getEntries().putBefore(Items.RED_STAINED_GLASS.getDefaultInstance(),
                ModBlocks.FUCHSIA_STAINED_GLASS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.ORANGE_STAINED_GLASS.getDefaultInstance(),
                ModBlocks.SCARLET_STAINED_GLASS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.YELLOW_STAINED_GLASS.getDefaultInstance(),
                ModBlocks.AMBER_STAINED_GLASS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.LIME_STAINED_GLASS.getDefaultInstance(),
                ModBlocks.LEMON_STAINED_GLASS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.GREEN_STAINED_GLASS.getDefaultInstance(),
                ModBlocks.FOREST_STAINED_GLASS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.CYAN_STAINED_GLASS.getDefaultInstance(),
                ModBlocks.TEAL_STAINED_GLASS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.LIGHT_BLUE_STAINED_GLASS.getDefaultInstance(),
                ModBlocks.CERULEAN_STAINED_GLASS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.BLUE_STAINED_GLASS.getDefaultInstance(),
                ModBlocks.AZURE_STAINED_GLASS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.PURPLE_STAINED_GLASS.getDefaultInstance(),
                ModBlocks.INDIGO_STAINED_GLASS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.MAGENTA_STAINED_GLASS.getDefaultInstance(),
                ModBlocks.VIOLET_STAINED_GLASS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.PINK_STAINED_GLASS.getDefaultInstance(),
                ModBlocks.VELVET_STAINED_GLASS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(Items.BROWN_STAINED_GLASS.getDefaultInstance(),
                ModBlocks.TAN_STAINED_GLASS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModBlocks.TAN_STAINED_GLASS.get().asItem().getDefaultInstance(),
                ModBlocks.CREAM_STAINED_GLASS.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        /*event.accept(ModBlocks.FUCHSIA_FLOWER_POT);
        event.accept(ModBlocks.SCARLET_FLOWER_POT);
        event.accept(ModBlocks.AMBER_FLOWER_POT);
        event.accept(ModBlocks.LEMON_FLOWER_POT);
        event.accept(ModBlocks.FOREST_FLOWER_POT);
        event.accept(ModBlocks.TEAL_FLOWER_POT);
        event.accept(ModBlocks.CERULEAN_FLOWER_POT);
        event.accept(ModBlocks.AZURE_FLOWER_POT);
        event.accept(ModBlocks.INDIGO_FLOWER_POT);
        event.accept(ModBlocks.VIOLET_FLOWER_POT);
        event.accept(ModBlocks.VELVET_FLOWER_POT);
        event.accept(ModBlocks.TAN_FLOWER_POT);
        event.accept(ModBlocks.CREAM_FLOWER_POT);

        event.accept(ModBlocks.RED_FLOWER_POT);
        event.accept(ModBlocks.ORANGE_FLOWER_POT);
        event.accept(ModBlocks.YELLOW_FLOWER_POT);
        event.accept(ModBlocks.LIME_FLOWER_POT);
        event.accept(ModBlocks.GREEN_FLOWER_POT);
        event.accept(ModBlocks.CYAN_FLOWER_POT);
        event.accept(ModBlocks.LIGHT_BLUE_FLOWER_POT);
        event.accept(ModBlocks.BLUE_FLOWER_POT);
        event.accept(ModBlocks.PURPLE_FLOWER_POT);
        event.accept(ModBlocks.MAGENTA_FLOWER_POT);
        event.accept(ModBlocks.PINK_FLOWER_POT);
        event.accept(ModBlocks.WHITE_FLOWER_POT);
        event.accept(ModBlocks.LIGHT_GRAY_FLOWER_POT);
        event.accept(ModBlocks.GRAY_FLOWER_POT);
        event.accept(ModBlocks.BLACK_FLOWER_POT);
        event.accept(ModBlocks.BROWN_FLOWER_POT);

        event.accept(ModBlocks.RED_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.ORANGE_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.YELLOW_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.LIME_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.GREEN_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.CYAN_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.LIGHT_BLUE_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.BLUE_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.PURPLE_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.MAGENTA_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.PINK_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.WHITE_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.LIGHT_GRAY_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.GRAY_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.BLACK_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.BROWN_GLAZED_FLOWER_POT);*/
    }

    private static void Natural_Blocks(CreativeModeTabEvent.BuildContents event) {

    }

    private static void Functional_Block(CreativeModeTabEvent.BuildContents event) {
        event.accept(ModBlocks.SPRUCE_CRAFTING_TABLE);

        /*event.accept(ModBlocks.RED_FLOWER_POT);
        event.accept(ModBlocks.ORANGE_FLOWER_POT);
        event.accept(ModBlocks.YELLOW_FLOWER_POT);
        event.accept(ModBlocks.LIME_FLOWER_POT);
        event.accept(ModBlocks.GREEN_FLOWER_POT);
        event.accept(ModBlocks.CYAN_FLOWER_POT);
        event.accept(ModBlocks.LIGHT_BLUE_FLOWER_POT);
        event.accept(ModBlocks.BLUE_FLOWER_POT);
        event.accept(ModBlocks.PURPLE_FLOWER_POT);
        event.accept(ModBlocks.MAGENTA_FLOWER_POT);
        event.accept(ModBlocks.PINK_FLOWER_POT);
        event.accept(ModBlocks.WHITE_FLOWER_POT);
        event.accept(ModBlocks.LIGHT_GRAY_FLOWER_POT);
        event.accept(ModBlocks.GRAY_FLOWER_POT);
        event.accept(ModBlocks.BLACK_FLOWER_POT);
        event.accept(ModBlocks.BROWN_FLOWER_POT);

        event.accept(ModBlocks.RED_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.ORANGE_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.YELLOW_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.LIME_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.GREEN_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.CYAN_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.LIGHT_BLUE_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.BLUE_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.PURPLE_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.MAGENTA_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.PINK_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.WHITE_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.LIGHT_GRAY_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.GRAY_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.BLACK_GLAZED_FLOWER_POT);
        event.accept(ModBlocks.BROWN_GLAZED_FLOWER_POT);

        event.accept(ModBlocks.ANDESITE_FLOWER_POT);
        event.accept(ModBlocks.BASALT_FLOWER_POT);
        event.accept(ModBlocks.BLACKSTONE_FLOWER_POT);
        event.accept(ModBlocks.COPPER_FLOWER_POT);
        event.accept(ModBlocks.DEEPSLATE_FLOWER_POT);
        event.accept(ModBlocks.DIORITE_FLOWER_POT);
        event.accept(ModBlocks.GOLD_FLOWER_POT);
        event.accept(ModBlocks.GRANITE_FLOWER_POT);
        event.accept(ModBlocks.IRON_FLOWER_POT);
        event.accept(ModBlocks.NETHER_BRICK_FLOWER_POT);
        event.accept(ModBlocks.RED_NETHER_BRICK_FLOWER_POT);
        event.accept(ModBlocks.WARPED_NETHER_BRICK_FLOWER_POT);
        event.accept(ModBlocks.BURNT_NETHER_BRICK_FLOWER_POT);*/
    }

    private static void REDSTONE_BLOCKS(CreativeModeTabEvent.BuildContents event) {

    }

    private static void TOOLS_AND_UTILITIES(CreativeModeTabEvent.BuildContents event) {

    }

    private static void COMBAT(CreativeModeTabEvent.BuildContents event) {

    }

    private static void FOOD_AND_DRINKS(CreativeModeTabEvent.BuildContents event) {

    }

    private static void INGREDIENTS(CreativeModeTabEvent.BuildContents event) {
        event.getEntries().putBefore(Items.RED_DYE.getDefaultInstance(),
                ModItems.FUCHSIA_DYE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.ORANGE_DYE.getDefaultInstance(),
                ModItems.SCARLET_DYE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.YELLOW_DYE.getDefaultInstance(),
                ModItems.AMBER_DYE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.LIME_DYE.getDefaultInstance(),
                ModItems.LEMON_DYE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.GREEN_DYE.getDefaultInstance(),
                ModItems.FOREST_DYE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.CYAN_DYE.getDefaultInstance(),
                ModItems.TEAL_DYE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.LIGHT_BLUE_DYE.getDefaultInstance(),
                ModItems.CERULEAN_DYE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.BLUE_DYE.getDefaultInstance(),
                ModItems.AZURE_DYE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.PURPLE_DYE.getDefaultInstance(),
                ModItems.INDIGO_DYE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.MAGENTA_DYE.getDefaultInstance(),
                ModItems.VIOLET_DYE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(Items.PINK_DYE.getDefaultInstance(),
                ModItems.VELVET_DYE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putBefore(ModItems.FUCHSIA_DYE.get().getDefaultInstance(),
                ModItems.TAN_DYE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.getEntries().putAfter(ModItems.TAN_DYE.get().getDefaultInstance(),
                ModItems.CREAM_DYE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.getEntries().putBefore(Items.FLINT.getDefaultInstance(),
                ModBlocks.ROCK.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    private static void SPAWN_EGGS(CreativeModeTabEvent.BuildContents event) {

    }
}
