package net.brendermen.remix;

import com.mojang.logging.LogUtils;
import net.brendermen.remix.block.ModBlocks;
import net.brendermen.remix.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Remix.MOD_ID)
public class Remix {
    public static final String MOD_ID = "remix";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Remix() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(modEventBus);

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
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
            event.accept(ModBlocks.SANDSTONE_FLOWER_POT);

            event.accept(ModBlocks.COBBLED_RED_SANDSTONE);
            event.accept(ModBlocks.RED_SANDSTONE_BRICKS);
            event.accept(ModBlocks.RED_SANDSTONE_TILES);
            event.accept(ModBlocks.RED_SANDSTONE_PILLAR);
            event.accept(ModBlocks.RED_SANDSTONE_FLOWER_POT);

            event.accept(ModBlocks.POLISHED_STONE);
            event.accept(ModBlocks.STONE_TILES);
            event.accept(ModBlocks.STONE_PILLAR);

            event.accept(ModBlocks.MOSSY_STONE);
            event.accept(ModBlocks.MOSSY_POLISHED_STONE);
            event.accept(ModBlocks.MOSSY_STONE_TILES);
            event.accept(ModBlocks.MOSSY_CHISELED_STONE);
            event.accept(ModBlocks.MOSSY_STONE_PILLAR);

            event.accept(ModBlocks.CRACKED_STONE);
            event.accept(ModBlocks.CRACKED_POLISHED_STONE);
            event.accept(ModBlocks.CRACKED_STONE_TILES);
            event.accept(ModBlocks.CRACKED_CHISELED_STONE);
            event.accept(ModBlocks.CRACKED_STONE_PILLAR);

            event.accept(ModBlocks.GRANITE_BRICKS);
            event.accept(ModBlocks.GRANITE_TILES);
            event.accept(ModBlocks.CHISELED_GRANITE);
            event.accept(ModBlocks.GRANITE_PILLAR);

            event.accept(ModBlocks.ANDESITE_BRICKS);
            event.accept(ModBlocks.ANDESITE_TILES);
            event.accept(ModBlocks.CHISELED_ANDESITE);
            event.accept(ModBlocks.ANDESITE_PILLAR);

            event.accept(ModBlocks.DIORITE_BRICKS);
            event.accept(ModBlocks.DIORITE_TILES);
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

        if (event.getTab() == CreativeModeTabs.COLORED_BLOCKS) {
            event.accept(ModBlocks.FUCHSIA_WOOL);
            event.accept(ModBlocks.SCARLET_WOOL);
            event.accept(ModBlocks.AMBER_WOOL);
            event.accept(ModBlocks.LEMON_WOOL);
            event.accept(ModBlocks.FOREST_WOOL);
            event.accept(ModBlocks.TEAL_WOOL);
            event.accept(ModBlocks.CERULEAN_WOOL);
            event.accept(ModBlocks.AZURE_WOOL);
            event.accept(ModBlocks.INDIGO_WOOL);
            event.accept(ModBlocks.VIOLET_WOOL);
            event.accept(ModBlocks.VELVET_WOOL);
            event.accept(ModBlocks.TAN_WOOL);
            event.accept(ModBlocks.CREAM_WOOL);

            event.accept(ModBlocks.FUCHSIA_CARPET);
            event.accept(ModBlocks.SCARLET_CARPET);
            event.accept(ModBlocks.AMBER_CARPET);
            event.accept(ModBlocks.LEMON_CARPET);
            event.accept(ModBlocks.FOREST_CARPET);
            event.accept(ModBlocks.TEAL_CARPET);
            event.accept(ModBlocks.CERULEAN_CARPET);
            event.accept(ModBlocks.AZURE_CARPET);
            event.accept(ModBlocks.INDIGO_CARPET);
            event.accept(ModBlocks.VIOLET_CARPET);
            event.accept(ModBlocks.VELVET_CARPET);
            event.accept(ModBlocks.TAN_CARPET);
            event.accept(ModBlocks.CREAM_CARPET);

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

            event.accept(ModBlocks.FUCHSIA_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.SCARLET_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.AMBER_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.LEMON_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.FOREST_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.TEAL_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.CERULEAN_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.AZURE_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.INDIGO_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.VIOLET_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.VELVET_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.TAN_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.CREAM_TERRACOTTA_STAIRS);

            event.accept(ModBlocks.TERRACOTTA_BRICKS);
            event.accept(ModBlocks.FUCHSIA_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.SCARLET_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.AMBER_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.LEMON_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.FOREST_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.TEAL_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.CERULEAN_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.AZURE_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.INDIGO_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.VIOLET_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.VELVET_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.TAN_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.CREAM_TERRACOTTA_BRICKS);

            event.accept(ModBlocks.FUCHSIA_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.SCARLET_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.AMBER_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.LEMON_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.FOREST_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.TEAL_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.CERULEAN_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.AZURE_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.INDIGO_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.VIOLET_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.VELVET_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.TAN_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.CREAM_TERRACOTTA_BRICK_STAIRS);

            event.accept(ModBlocks.RED_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.LIME_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.GREEN_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.CYAN_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.BLUE_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.PINK_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.WHITE_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.GRAY_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.BLACK_TERRACOTTA_STAIRS);
            event.accept(ModBlocks.BROWN_TERRACOTTA_STAIRS);

            event.accept(ModBlocks.RED_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.ORANGE_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.YELLOW_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.LIME_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.GREEN_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.CYAN_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.BLUE_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.PURPLE_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.MAGENTA_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.PINK_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.WHITE_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.GRAY_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.BLACK_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.BROWN_TERRACOTTA_BRICKS);

            event.accept(ModBlocks.RED_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.LIME_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.GREEN_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.CYAN_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.BLUE_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.PINK_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.WHITE_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.GRAY_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.BLACK_TERRACOTTA_BRICK_STAIRS);
            event.accept(ModBlocks.BROWN_TERRACOTTA_BRICK_STAIRS);

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

            event.accept(ModBlocks.POLISHED_WHITE_CONCRETE);
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

            event.accept(ModBlocks.FUCHSIA_FLOWER_POT);
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
            event.accept(ModBlocks.BROWN_GLAZED_FLOWER_POT);
        }

        if (event.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {

        }

        if (event.getTab() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
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
            event.accept(ModBlocks.RED_NETHER_FLOWER_POT);
            event.accept(ModBlocks.WARPED_NETHER_FLOWER_POT);
            event.accept(ModBlocks.BURNT_NETHER_FLOWER_POT);
        }

        if (event.getTab() == CreativeModeTabs.REDSTONE_BLOCKS) {

        }

        if (event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

        }

        if (event.getTab() == CreativeModeTabs.COMBAT) {

        }

        if (event.getTab() == CreativeModeTabs.FOOD_AND_DRINKS) {

        }

        if (event.getTab() == CreativeModeTabs.INGREDIENTS) {
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

        if (event.getTab() == CreativeModeTabs.SPAWN_EGGS) {

        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
