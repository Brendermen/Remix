package net.brendermen.remix.util;

import net.brendermen.remix.block.ModBlocks;
import net.brendermen.remix.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
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

        event.getEntries().remove(Items.RED_CARPET.getDefaultInstance());
        event.getEntries().remove(Items.ORANGE_CARPET.getDefaultInstance());
        event.getEntries().remove(Items.YELLOW_CARPET.getDefaultInstance());
        event.getEntries().remove(Items.LIME_CARPET.getDefaultInstance());
        event.getEntries().remove(Items.GREEN_CARPET.getDefaultInstance());
        event.getEntries().remove(Items.CYAN_CARPET.getDefaultInstance());
        event.getEntries().remove(Items.LIGHT_BLUE_CARPET.getDefaultInstance());
        event.getEntries().remove(Items.BLUE_CARPET.getDefaultInstance());
        event.getEntries().remove(Items.PURPLE_CARPET.getDefaultInstance());
        event.getEntries().remove(Items.MAGENTA_CARPET.getDefaultInstance());
        event.getEntries().remove(Items.PINK_CARPET.getDefaultInstance());
        event.getEntries().remove(Items.WHITE_CARPET.getDefaultInstance());
        event.getEntries().remove(Items.LIGHT_GRAY_CARPET.getDefaultInstance());
        event.getEntries().remove(Items.GRAY_CARPET.getDefaultInstance());
        event.getEntries().remove(Items.BLACK_CARPET.getDefaultInstance());
        event.getEntries().remove(Items.BROWN_CARPET.getDefaultInstance());

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

        event.accept(ModBlocks.FUCHSIA_TERRACOTTA);
        event.accept(ModBlocks.SCARLET_TERRACOTTA);
        event.accept(ModBlocks.AMBER_TERRACOTTA);
        event.accept(ModBlocks.LEMON_TERRACOTTA);
        event.accept(ModBlocks.FOREST_TERRACOTTA);
        event.accept(ModBlocks.TEAL_TERRACOTTA);
        event.accept(ModBlocks.CERULEAN_TERRACOTTA);
        event.accept(ModBlocks.AZURE_TERRACOTTA);
        event.accept(ModBlocks.INDIGO_TERRACOTTA);
        event.accept(ModBlocks.VIOLET_TERRACOTTA);
        event.accept(ModBlocks.VELVET_TERRACOTTA);
        event.accept(ModBlocks.TAN_TERRACOTTA);
        event.accept(ModBlocks.CREAM_TERRACOTTA);

        event.accept(ModBlocks.TERRACOTTA_STAIRS);
        event.accept(ModBlocks.FUCHSIA_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.RED_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.SCARLET_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.AMBER_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.LEMON_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.LIME_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.FOREST_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.GREEN_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.TEAL_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.CYAN_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.CERULEAN_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.AZURE_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.BLUE_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.INDIGO_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.VIOLET_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.VELVET_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.PINK_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.WHITE_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.GRAY_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.BLACK_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.BROWN_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.TAN_TERRACOTTA_STAIRS);
        event.accept(ModBlocks.CREAM_TERRACOTTA_STAIRS);

        event.accept(ModBlocks.TERRACOTTA_SLAB);
        event.accept(ModBlocks.FUCHSIA_TERRACOTTA_SLAB);
        event.accept(ModBlocks.RED_TERRACOTTA_SLAB);
        event.accept(ModBlocks.SCARLET_TERRACOTTA_SLAB);
        event.accept(ModBlocks.ORANGE_TERRACOTTA_SLAB);
        event.accept(ModBlocks.AMBER_TERRACOTTA_SLAB);
        event.accept(ModBlocks.YELLOW_TERRACOTTA_SLAB);
        event.accept(ModBlocks.LEMON_TERRACOTTA_SLAB);
        event.accept(ModBlocks.LIME_TERRACOTTA_SLAB);
        event.accept(ModBlocks.FOREST_TERRACOTTA_SLAB);
        event.accept(ModBlocks.GREEN_TERRACOTTA_SLAB);
        event.accept(ModBlocks.TEAL_TERRACOTTA_SLAB);
        event.accept(ModBlocks.CYAN_TERRACOTTA_SLAB);
        event.accept(ModBlocks.CERULEAN_TERRACOTTA_SLAB);
        event.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        event.accept(ModBlocks.AZURE_TERRACOTTA_SLAB);
        event.accept(ModBlocks.BLUE_TERRACOTTA_SLAB);
        event.accept(ModBlocks.INDIGO_TERRACOTTA_SLAB);
        event.accept(ModBlocks.PURPLE_TERRACOTTA_SLAB);
        event.accept(ModBlocks.VIOLET_TERRACOTTA_SLAB);
        event.accept(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
        event.accept(ModBlocks.VELVET_TERRACOTTA_SLAB);
        event.accept(ModBlocks.PINK_TERRACOTTA_SLAB);
        event.accept(ModBlocks.WHITE_TERRACOTTA_SLAB);
        event.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        event.accept(ModBlocks.GRAY_TERRACOTTA_SLAB);
        event.accept(ModBlocks.BLACK_TERRACOTTA_SLAB);
        event.accept(ModBlocks.BROWN_TERRACOTTA_SLAB);
        event.accept(ModBlocks.TAN_TERRACOTTA_SLAB);
        event.accept(ModBlocks.CREAM_TERRACOTTA_SLAB);

        event.accept(ModBlocks.TERRACOTTA_BRICKS);
        event.accept(ModBlocks.FUCHSIA_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.RED_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.SCARLET_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.ORANGE_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.AMBER_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.YELLOW_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.LEMON_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.LIME_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.FOREST_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.GREEN_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.TEAL_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.CYAN_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.CERULEAN_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.AZURE_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.BLUE_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.INDIGO_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.PURPLE_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.VIOLET_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.MAGENTA_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.VELVET_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.PINK_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.WHITE_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.GRAY_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.BLACK_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.BROWN_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.TAN_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.CREAM_TERRACOTTA_BRICKS);

        event.accept(ModBlocks.TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.FUCHSIA_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.RED_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.SCARLET_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.AMBER_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.LEMON_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.LIME_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.FOREST_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.GREEN_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.TEAL_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.CYAN_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.CERULEAN_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.AZURE_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.BLUE_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.INDIGO_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.VIOLET_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.VELVET_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.PINK_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.WHITE_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.GRAY_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.BLACK_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.BROWN_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.TAN_TERRACOTTA_BRICK_STAIRS);
        event.accept(ModBlocks.CREAM_TERRACOTTA_BRICK_STAIRS);

        event.accept(ModBlocks.TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.FUCHSIA_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.RED_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.SCARLET_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.ORANGE_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.AMBER_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.YELLOW_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.LEMON_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.LIME_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.FOREST_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.GREEN_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.TEAL_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.CYAN_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.CERULEAN_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.AZURE_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.BLUE_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.INDIGO_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.PURPLE_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.VIOLET_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.VELVET_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.PINK_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.WHITE_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.GRAY_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.BLACK_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.BROWN_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.TAN_TERRACOTTA_BRICK_SLAB);
        event.accept(ModBlocks.CREAM_TERRACOTTA_BRICK_SLAB);

        event.accept(ModBlocks.FUCHSIA_CONCRETE);
        event.accept(ModBlocks.SCARLET_CONCRETE);
        event.accept(ModBlocks.AMBER_CONCRETE);
        event.accept(ModBlocks.LEMON_CONCRETE);
        event.accept(ModBlocks.FOREST_CONCRETE);
        event.accept(ModBlocks.TEAL_CONCRETE);
        event.accept(ModBlocks.CERULEAN_CONCRETE);
        event.accept(ModBlocks.AZURE_CONCRETE);
        event.accept(ModBlocks.INDIGO_CONCRETE);
        event.accept(ModBlocks.VIOLET_CONCRETE);
        event.accept(ModBlocks.VELVET_CONCRETE);
        event.accept(ModBlocks.TAN_CONCRETE);
        event.accept(ModBlocks.CREAM_CONCRETE);

        event.accept(ModBlocks.POLISHED_FUCHSIA_CONCRETE);
        event.accept(ModBlocks.POLISHED_RED_CONCRETE);
        event.accept(ModBlocks.POLISHED_SCARLET_CONCRETE);
        event.accept(ModBlocks.POLISHED_ORANGE_CONCRETE);
        event.accept(ModBlocks.POLISHED_AMBER_CONCRETE);
        event.accept(ModBlocks.POLISHED_YELLOW_CONCRETE);
        event.accept(ModBlocks.POLISHED_LEMON_CONCRETE);
        event.accept(ModBlocks.POLISHED_LIME_CONCRETE);
        event.accept(ModBlocks.POLISHED_FOREST_CONCRETE);
        event.accept(ModBlocks.POLISHED_GREEN_CONCRETE);
        event.accept(ModBlocks.POLISHED_TEAL_CONCRETE);
        event.accept(ModBlocks.POLISHED_CYAN_CONCRETE);
        event.accept(ModBlocks.POLISHED_CERULEAN_CONCRETE);
        event.accept(ModBlocks.POLISHED_LIGHT_BLUE_CONCRETE);
        event.accept(ModBlocks.POLISHED_AZURE_CONCRETE);
        event.accept(ModBlocks.POLISHED_BLUE_CONCRETE);
        event.accept(ModBlocks.POLISHED_INDIGO_CONCRETE);
        event.accept(ModBlocks.POLISHED_PURPLE_CONCRETE);
        event.accept(ModBlocks.POLISHED_VIOLET_CONCRETE);
        event.accept(ModBlocks.POLISHED_MAGENTA_CONCRETE);
        event.accept(ModBlocks.POLISHED_VELVET_CONCRETE);
        event.accept(ModBlocks.POLISHED_PINK_CONCRETE);
        event.accept(ModBlocks.POLISHED_WHITE_CONCRETE);
        event.accept(ModBlocks.POLISHED_LIGHT_GRAY_CONCRETE);
        event.accept(ModBlocks.POLISHED_GRAY_CONCRETE);
        event.accept(ModBlocks.POLISHED_BLACK_CONCRETE);
        event.accept(ModBlocks.POLISHED_BROWN_CONCRETE);
        event.accept(ModBlocks.POLISHED_TAN_CONCRETE);
        event.accept(ModBlocks.POLISHED_CREAM_CONCRETE);

        event.accept(ModBlocks.WHITE_CONCRETE_BRICKS);
        event.accept(ModBlocks.WHITE_CONCRETE_TILES);

        event.accept(ModBlocks.FUCHSIA_CONCRETE_POWDER);
        event.accept(ModBlocks.SCARLET_CONCRETE_POWDER);
        event.accept(ModBlocks.AMBER_CONCRETE_POWDER);
        event.accept(ModBlocks.LEMON_CONCRETE_POWDER);
        event.accept(ModBlocks.FOREST_CONCRETE_POWDER);
        event.accept(ModBlocks.TEAL_CONCRETE_POWDER);
        event.accept(ModBlocks.CERULEAN_CONCRETE_POWDER);
        event.accept(ModBlocks.AZURE_CONCRETE_POWDER);
        event.accept(ModBlocks.INDIGO_CONCRETE_POWDER);
        event.accept(ModBlocks.VIOLET_CONCRETE_POWDER);
        event.accept(ModBlocks.VELVET_CONCRETE_POWDER);
        event.accept(ModBlocks.TAN_CONCRETE_POWDER);
        event.accept(ModBlocks.CREAM_CONCRETE_POWDER);

        event.accept(ModBlocks.FUCHSIA_STAINED_GLASS);
        event.accept(ModBlocks.SCARLET_STAINED_GLASS);
        event.accept(ModBlocks.AMBER_STAINED_GLASS);
        event.accept(ModBlocks.LEMON_STAINED_GLASS);
        event.accept(ModBlocks.FOREST_STAINED_GLASS);
        event.accept(ModBlocks.TEAL_STAINED_GLASS);
        event.accept(ModBlocks.CERULEAN_STAINED_GLASS);
        event.accept(ModBlocks.AZURE_STAINED_GLASS);
        event.accept(ModBlocks.INDIGO_STAINED_GLASS);
        event.accept(ModBlocks.VIOLET_STAINED_GLASS);
        event.accept(ModBlocks.VELVET_STAINED_GLASS);
        event.accept(ModBlocks.TAN_STAINED_GLASS);
        event.accept(ModBlocks.CREAM_STAINED_GLASS);

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
        event.accept(ModItems.FUCHSIA_DYE);
        event.accept(ModItems.SCARLET_DYE);
        event.accept(ModItems.AMBER_DYE);
        event.accept(ModItems.LEMON_DYE);
        event.accept(ModItems.FOREST_DYE);
        event.accept(ModItems.TEAL_DYE);
        event.accept(ModItems.CERULEAN_DYE);
        event.accept(ModItems.AZURE_DYE);
        event.accept(ModItems.INDIGO_DYE);
        event.accept(ModItems.VIOLET_DYE);
        event.accept(ModItems.VELVET_DYE);
        event.accept(ModItems.TAN_DYE);
        event.accept(ModItems.VIOLET_DYE);
        event.accept(ModItems.CREAM_DYE);
    }

    private static void SPAWN_EGGS(CreativeModeTabEvent.BuildContents event) {

    }
}
