package net.brendermen.remix.block;

import net.brendermen.remix.Remix;
import net.brendermen.remix.block.custom.ModFlowerPotBlock;
import net.brendermen.remix.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import java.util.function.Supplier;



public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Remix.MOD_ID);

    public static final RegistryObject<Block> OAK_BOARDS = registerBlock("oak_boards",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> BIRCH_BOARDS = registerBlock("birch_boards",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));

    public static final RegistryObject<Block> SPRUCE_BOARDS = registerBlock("spruce_boards",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));

    public static final RegistryObject<Block> DARK_OAK_BOARDS = registerBlock("dark_oak_boards",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));

    public static final RegistryObject<Block> ACACIA_BOARDS = registerBlock("acacia_boards",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));

    public static final RegistryObject<Block> JUNGLE_BOARDS = registerBlock("jungle_boards",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));

    public static final RegistryObject<Block> MANGROVE_BOARDS = registerBlock("mangrove_boards",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));

    public static final RegistryObject<Block> CRIMSON_BOARDS = registerBlock("crimson_boards",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> WARPED_BOARDS = registerBlock("warped_boards",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));

    public static final RegistryObject<Block> POLISHED_DIRT = registerBlock("polished_dirt",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));

    public static final RegistryObject<Block> DIRT_BRICKS = registerBlock("dirt_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));

    public static final RegistryObject<Block> DIRT_TILES = registerBlock("dirt_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));

    public static final RegistryObject<Block> TERRACOTTA_BRICKS = registerBlock("terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<RotatedPillarBlock> CHISELED_DIRT = registerBlock("chiseled_dirt",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));

    public static final RegistryObject<RotatedPillarBlock> DIRT_PILLAR = registerBlock("dirt_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));

    public static final RegistryObject<Block> POLISHED_PACKED_MUD = registerBlock("polished_packed_mud",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)));

    public static final RegistryObject<Block> PACKED_MUD_TILES = registerBlock("packed_mud_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)));

    public static final RegistryObject<RotatedPillarBlock> CHISELED_PACKED_MUD = registerBlock("chiseled_packed_mud",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)));

    public static final RegistryObject<RotatedPillarBlock> PACKED_MUD_PILLAR = registerBlock("packed_mud_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)));

    public static final RegistryObject<Block> POLISHED_MUD = registerBlock("polished_mud",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD)));

    public static final RegistryObject<Block> MUD_BRICKS = registerBlock("mud_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD)));

    public static final RegistryObject<Block> MUD_TILES = registerBlock("mud_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD)));

    public static final RegistryObject<RotatedPillarBlock> CHISELED_MUD = registerBlock("chiseled_mud",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MUD)));

    public static final RegistryObject<RotatedPillarBlock> MUD_PILLAR = registerBlock("mud_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MUD)));

    public static final RegistryObject<Block> POLISHED_CLAY = registerBlock("polished_clay",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.CLAY)));

    public static final RegistryObject<Block> CLAY_BRICKS = registerBlock("clay_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CLAY)));

    public static final RegistryObject<Block> CLAY_TILES = registerBlock("clay_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CLAY)));

    public static final RegistryObject<RotatedPillarBlock> CHISELED_CLAY = registerBlock("chiseled_clay",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CLAY)));

    public static final RegistryObject<RotatedPillarBlock> CLAY_PILLAR = registerBlock("clay_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CLAY)));

    public static final RegistryObject<Block> COBBLED_SANDSTONE = registerBlock("cobbled_sandstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

    public static final RegistryObject<Block> SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

    public static final RegistryObject<Block> SANDSTONE_TILES = registerBlock("sandstone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

    public static final RegistryObject<Block> SANDSTONE_PILLAR = registerBlock("sandstone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

    public static final RegistryObject<Block> COBBLED_RED_SANDSTONE = registerBlock("cobbled_red_sandstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));

    public static final RegistryObject<Block> RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));

    public static final RegistryObject<Block> RED_SANDSTONE_TILES = registerBlock("red_sandstone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));

    public static final RegistryObject<Block> RED_SANDSTONE_PILLAR = registerBlock("red_sandstone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));

    public static final RegistryObject<Block> POLISHED_STONE = registerBlock("polished_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> STONE_TILES = registerBlock("stone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<RotatedPillarBlock> STONE_PILLAR = registerBlock("stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> MOSSY_STONE = registerBlock("mossy_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> MOSSY_POLISHED_STONE = registerBlock("mossy_polished_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> MOSSY_STONE_TILES = registerBlock("mossy_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> MOSSY_CHISELED_STONE = registerBlock("mossy_chiseled_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<RotatedPillarBlock> MOSSY_STONE_PILLAR = registerBlock("mossy_stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> CRACKED_STONE = registerBlock("cracked_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> CRACKED_POLISHED_STONE = registerBlock("cracked_polished_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> CRACKED_CHISELED_STONE = registerBlock("cracked_chiseled_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<RotatedPillarBlock> CRACKED_STONE_PILLAR = registerBlock("cracked_stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> GRANITE_BRICKS = registerBlock("granite_bricks",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)));

    public static final RegistryObject<Block> GRANITE_TILES = registerBlock("granite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)));

    public static final RegistryObject<Block> CHISELED_GRANITE = registerBlock("chiseled_granite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)));

    public static final RegistryObject<Block> GRANITE_PILLAR = registerBlock("granite_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));

    public static final RegistryObject<Block> ANDESITE_BRICKS = registerBlock("andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));

    public static final RegistryObject<Block> ANDESITE_TILES = registerBlock("andesite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));

    public static final RegistryObject<Block> CHISELED_ANDESITE = registerBlock("chiseled_andesite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));

    public static final RegistryObject<Block> ANDESITE_PILLAR = registerBlock("andesite_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));

    public static final RegistryObject<Block> DIORITE_BRICKS = registerBlock("diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE)));

    public static final RegistryObject<Block> DIORITE_TILES = registerBlock("diorite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE)));

    public static final RegistryObject<Block> CHISELED_DIORITE = registerBlock("chiseled_diorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE)));

    public static final RegistryObject<Block> DIORITE_PILLAR = registerBlock("diorite_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));

    public static final RegistryObject<Block> POLISHED_CALCITE = registerBlock("polished_calcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> POLISHED_TUFF = registerBlock("polished_tuff",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF)));

    public static final RegistryObject<Block> POLISHED_PRISMARINE = registerBlock("polished_prismarine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));

    public static final RegistryObject<Block> POLISHED_NETHERRACK = registerBlock("polished_netherrack",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)));

    public static final RegistryObject<Block> POLISHED_END_STONE = registerBlock("polished_end_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)));

    public static final RegistryObject<Block> AMBER_WOOL = registerBlock("amber_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> AMBER_CARPET = registerBlock("amber_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> AMBER_TERRACOTTA = registerBlock("amber_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> AMBER_TERRACOTTA_STAIRS = registerBlock("amber_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.AMBER_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> AMBER_TERRACOTTA_SLAB = registerBlock("amber_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> AMBER_TERRACOTTA_BRICKS = registerBlock("amber_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> AMBER_TERRACOTTA_BRICK_STAIRS = registerBlock("amber_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.AMBER_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> AMBER_CONCRETE = registerBlock("amber_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> AMBER_CONCRETE_POWDER = registerBlock("amber_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> AMBER_STAINED_GLASS = registerBlock("amber_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> CERULEAN_WOOL = registerBlock("cerulean_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> CERULEAN_CARPET = registerBlock("cerulean_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> CERULEAN_TERRACOTTA = registerBlock("cerulean_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> CERULEAN_TERRACOTTA_STAIRS = registerBlock("cerulean_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.CERULEAN_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> CERULEAN_TERRACOTTA_BRICKS = registerBlock("cerulean_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> CERULEAN_TERRACOTTA_BRICK_STAIRS = registerBlock("cerulean_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CERULEAN_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> CERULEAN_CONCRETE = registerBlock("cerulean_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> CERULEAN_CONCRETE_POWDER = registerBlock("cerulean_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> CERULEAN_STAINED_GLASS = registerBlock("cerulean_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> CREAM_WOOL = registerBlock("cream_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> CREAM_CARPET = registerBlock("cream_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> CREAM_TERRACOTTA = registerBlock("cream_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> CREAM_TERRACOTTA_STAIRS = registerBlock("cream_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.CREAM_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> CREAM_TERRACOTTA_BRICKS = registerBlock("cream_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> CREAM_TERRACOTTA_BRICK_STAIRS = registerBlock("cream_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CREAM_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> CREAM_CONCRETE = registerBlock("cream_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> CREAM_CONCRETE_POWDER = registerBlock("cream_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> CREAM_STAINED_GLASS = registerBlock("cream_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> FOREST_WOOL = registerBlock("forest_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> FOREST_CARPET = registerBlock("forest_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> FOREST_TERRACOTTA = registerBlock("forest_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> FOREST_TERRACOTTA_STAIRS = registerBlock("forest_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.FOREST_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> FOREST_TERRACOTTA_BRICKS = registerBlock("forest_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> FOREST_TERRACOTTA_BRICK_STAIRS = registerBlock("forest_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.FOREST_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> FOREST_CONCRETE = registerBlock("forest_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> FOREST_CONCRETE_POWDER = registerBlock("forest_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> FOREST_STAINED_GLASS = registerBlock("forest_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> FUCHSIA_WOOL = registerBlock("fuchsia_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> FUCHSIA_CARPET = registerBlock("fuchsia_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> FUCHSIA_TERRACOTTA = registerBlock("fuchsia_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> FUCHSIA_TERRACOTTA_STAIRS = registerBlock("fuchsia_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.FUCHSIA_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> FUCHSIA_TERRACOTTA_BRICKS = registerBlock("fuchsia_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> FUCHSIA_TERRACOTTA_BRICK_STAIRS = registerBlock("fuchsia_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.FUCHSIA_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> FUCHSIA_CONCRETE = registerBlock("fuchsia_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> FUCHSIA_CONCRETE_POWDER = registerBlock("fuchsia_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> FUCHSIA_STAINED_GLASS = registerBlock("fuchsia_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> VELVET_WOOL = registerBlock("velvet_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> VELVET_CARPET = registerBlock("velvet_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> VELVET_TERRACOTTA = registerBlock("velvet_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> VELVET_TERRACOTTA_STAIRS = registerBlock("velvet_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.VELVET_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> VELVET_TERRACOTTA_BRICKS = registerBlock("velvet_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> VELVET_TERRACOTTA_BRICK_STAIRS = registerBlock("velvet_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.VELVET_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> VELVET_CONCRETE = registerBlock("velvet_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> VELVET_CONCRETE_POWDER = registerBlock("velvet_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> VELVET_STAINED_GLASS = registerBlock("velvet_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> INDIGO_WOOL = registerBlock("indigo_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> INDIGO_CARPET = registerBlock("indigo_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> INDIGO_TERRACOTTA = registerBlock("indigo_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> INDIGO_TERRACOTTA_STAIRS = registerBlock("indigo_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.INDIGO_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> INDIGO_TERRACOTTA_BRICKS = registerBlock("indigo_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> INDIGO_TERRACOTTA_BRICK_STAIRS = registerBlock("indigo_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.INDIGO_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> INDIGO_CONCRETE = registerBlock("indigo_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> INDIGO_CONCRETE_POWDER = registerBlock("indigo_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> INDIGO_STAINED_GLASS = registerBlock("indigo_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> LEMON_WOOL = registerBlock("lemon_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> LEMON_CARPET = registerBlock("lemon_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> LEMON_TERRACOTTA = registerBlock("lemon_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LEMON_TERRACOTTA_STAIRS = registerBlock("lemon_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.LEMON_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> LEMON_TERRACOTTA_BRICKS = registerBlock("lemon_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> LEMON_TERRACOTTA_BRICK_STAIRS = registerBlock("lemon_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LEMON_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> LEMON_CONCRETE = registerBlock("lemon_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> LEMON_CONCRETE_POWDER = registerBlock("lemon_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> LEMON_STAINED_GLASS = registerBlock("lemon_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> SCARLET_WOOL = registerBlock("scarlet_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> SCARLET_CARPET = registerBlock("scarlet_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> SCARLET_TERRACOTTA = registerBlock("scarlet_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> SCARLET_TERRACOTTA_STAIRS = registerBlock("scarlet_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.SCARLET_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> SCARLET_TERRACOTTA_BRICKS = registerBlock("scarlet_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> SCARLET_TERRACOTTA_BRICK_STAIRS = registerBlock("scarlet_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SCARLET_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> SCARLET_CONCRETE = registerBlock("scarlet_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> SCARLET_CONCRETE_POWDER = registerBlock("scarlet_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> SCARLET_STAINED_GLASS = registerBlock("scarlet_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> AZURE_WOOL = registerBlock("azure_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> AZURE_CARPET = registerBlock("azure_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> AZURE_TERRACOTTA = registerBlock("azure_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> AZURE_TERRACOTTA_STAIRS = registerBlock("azure_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.AZURE_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> AZURE_TERRACOTTA_BRICKS = registerBlock("azure_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> AZURE_TERRACOTTA_BRICK_STAIRS = registerBlock("azure_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.AZURE_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> AZURE_CONCRETE = registerBlock("azure_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> AZURE_CONCRETE_POWDER = registerBlock("azure_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> AZURE_STAINED_GLASS = registerBlock("azure_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> TAN_WOOL = registerBlock("tan_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> TAN_CARPET = registerBlock("tan_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> TAN_TERRACOTTA = registerBlock("tan_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> TAN_TERRACOTTA_STAIRS = registerBlock("tan_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.TAN_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> TAN_TERRACOTTA_BRICKS = registerBlock("tan_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> TAN_TERRACOTTA_BRICK_STAIRS = registerBlock("tan_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.TAN_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> TAN_CONCRETE = registerBlock("tan_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> TAN_CONCRETE_POWDER = registerBlock("tan_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> TAN_STAINED_GLASS = registerBlock("tan_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> TEAL_WOOL = registerBlock("teal_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> TEAL_CARPET = registerBlock("teal_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> TEAL_TERRACOTTA = registerBlock("teal_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> TEAL_TERRACOTTA_STAIRS = registerBlock("teal_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.TEAL_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> TEAL_TERRACOTTA_BRICKS = registerBlock("teal_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> TEAL_TERRACOTTA_BRICK_STAIRS = registerBlock("teal_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.TEAL_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> TEAL_CONCRETE = registerBlock("teal_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> TEAL_CONCRETE_POWDER = registerBlock("teal_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> TEAL_STAINED_GLASS = registerBlock("teal_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> VIOLET_WOOL = registerBlock("violet_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> VIOLET_CARPET = registerBlock("violet_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> VIOLET_TERRACOTTA = registerBlock("violet_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> VIOLET_TERRACOTTA_STAIRS = registerBlock("violet_terracotta_stairs",
            () -> new StairBlock(() -> ModBlocks.VIOLET_TERRACOTTA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> VIOLET_TERRACOTTA_BRICKS = registerBlock("violet_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)));

    public static final RegistryObject<Block> VIOLET_TERRACOTTA_BRICK_STAIRS = registerBlock("violet_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.VIOLET_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> VIOLET_CONCRETE = registerBlock("violet_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> VIOLET_CONCRETE_POWDER = registerBlock("violet_concrete_powder",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER)));

    public static final RegistryObject<Block> VIOLET_STAINED_GLASS = registerBlock("violet_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            () -> new StairBlock(Blocks.RED_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> RED_TERRACOTTA_BRICKS = registerBlock("red_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> RED_TERRACOTTA_BRICK_STAIRS = registerBlock("red_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            () -> new StairBlock(Blocks.ORANGE_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICKS = registerBlock("orange_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICK_STAIRS = registerBlock("orange_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.ORANGE_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            () -> new StairBlock(Blocks.YELLOW_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICKS = registerBlock("yellow_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICK_STAIRS = registerBlock("yellow_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.YELLOW_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            () -> new StairBlock(Blocks.LIME_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> LIME_TERRACOTTA_BRICKS = registerBlock("lime_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> LIME_TERRACOTTA_BRICK_STAIRS = registerBlock("lime_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIME_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            () -> new StairBlock(Blocks.GREEN_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICKS = registerBlock("green_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICK_STAIRS = registerBlock("green_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GREEN_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            () -> new StairBlock(Blocks.CYAN_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICKS = registerBlock("cyan_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICK_STAIRS = registerBlock("cyan_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CYAN_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            () -> new StairBlock(Blocks.LIGHT_BLUE_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock("light_blue_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("light_blue_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            () -> new StairBlock(Blocks.BLUE_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICKS = registerBlock("blue_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICK_STAIRS = registerBlock("blue_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            () -> new StairBlock(Blocks.PURPLE_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICKS = registerBlock("purple_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICK_STAIRS = registerBlock("purple_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.PURPLE_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            () -> new StairBlock(Blocks.MAGENTA_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICKS = registerBlock("magenta_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICK_STAIRS = registerBlock("magenta_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MAGENTA_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            () -> new StairBlock(Blocks.PINK_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> PINK_TERRACOTTA_BRICKS = registerBlock("pink_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> PINK_TERRACOTTA_BRICK_STAIRS = registerBlock("pink_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICKS = registerBlock("white_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICK_STAIRS = registerBlock("white_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            () -> new StairBlock(Blocks.LIGHT_GRAY_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock("light_gray_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("light_gray_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block>GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            () -> new StairBlock(Blocks.GRAY_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICKS = registerBlock("gray_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICK_STAIRS = registerBlock("gray_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GRAY_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            () -> new StairBlock(Blocks.BLACK_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICKS = registerBlock("black_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICK_STAIRS = registerBlock("black_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLACK_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            () -> new StairBlock(Blocks.BROWN_TERRACOTTA::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICKS = registerBlock("brown_terracotta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICK_STAIRS = registerBlock("brown_terracotta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BROWN_TERRACOTTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> POLISHED_WHITE_CONCRETE = registerBlock("polished_white_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> WHITE_CONCRETE_BRICKS = registerBlock("white_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> WHITE_CONCRETE_TILES = registerBlock("white_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));


    public static final RegistryObject<Block> BLACKSTONE_FLOWER_POT = registerBlock("blackstone_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "blackstone"));
    public static final RegistryObject<Block> DIORITE_FLOWER_POT = registerBlock("diorite_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "diorite"));
    public static final RegistryObject<Block> BASALT_FLOWER_POT = registerBlock("basalt_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "basalt"));
    public static final RegistryObject<Block> RED_FLOWER_POT = registerBlock("red_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "red"));
    public static final RegistryObject<Block> ORANGE_FLOWER_POT = registerBlock("orange_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "orange"));
    public static final RegistryObject<Block> YELLOW_FLOWER_POT = registerBlock("yellow_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "yellow"));
    public static final RegistryObject<Block> LIME_FLOWER_POT = registerBlock("lime_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "lime"));
    public static final RegistryObject<Block> GREEN_FLOWER_POT = registerBlock("green_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "green"));
    public static final RegistryObject<Block> CYAN_FLOWER_POT = registerBlock("cyan_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "cyan"));
    public static final RegistryObject<Block> LIGHT_BLUE_FLOWER_POT = registerBlock("light_blue_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "light_blue"));
    public static final RegistryObject<Block> BLUE_FLOWER_POT = registerBlock("blue_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "blue"));
    public static final RegistryObject<Block> PURPLE_FLOWER_POT = registerBlock("purple_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "purple"));
    public static final RegistryObject<Block> MAGENTA_FLOWER_POT = registerBlock("magenta_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "magenta"));
    public static final RegistryObject<Block> PINK_FLOWER_POT = registerBlock("pink_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "pink"));
    public static final RegistryObject<Block> WHITE_FLOWER_POT = registerBlock("white_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "white"));
    public static final RegistryObject<Block> LIGHT_GRAY_FLOWER_POT = registerBlock("light_gray_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "light_gray"));
    public static final RegistryObject<Block> GRAY_FLOWER_POT = registerBlock("gray_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "gray"));
    public static final RegistryObject<Block> BLACK_FLOWER_POT = registerBlock("black_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "black"));
    public static final RegistryObject<Block> BROWN_FLOWER_POT = registerBlock("brown_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "brown"));
    public static final RegistryObject<Block> RED_GLAZED_FLOWER_POT = registerBlock("red_glazed_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "red_glazed"));
    public static final RegistryObject<Block> ORANGE_GLAZED_FLOWER_POT = registerBlock("orange_glazed_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "orange_glazed"));
    public static final RegistryObject<Block> YELLOW_GLAZED_FLOWER_POT = registerBlock("yellow_glazed_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "yellow_glazed"));
    public static final RegistryObject<Block> LIME_GLAZED_FLOWER_POT = registerBlock("lime_glazed_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "lime_glazed"));
    public static final RegistryObject<Block> GREEN_GLAZED_FLOWER_POT = registerBlock("green_glazed_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "green_glazed"));
    public static final RegistryObject<Block> CYAN_GLAZED_FLOWER_POT = registerBlock("cyan_glazed_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "cyan_glazed"));
    public static final RegistryObject<Block> LIGHT_BLUE_GLAZED_FLOWER_POT = registerBlock("light_blue_glazed_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "light_blue_glazed"));
    public static final RegistryObject<Block> BLUE_GLAZED_FLOWER_POT = registerBlock("blue_glazed_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "blue_glazed"));
    public static final RegistryObject<Block> PURPLE_GLAZED_FLOWER_POT = registerBlock("purple_glazed_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "purple_glazed"));
    public static final RegistryObject<Block> MAGENTA_GLAZED_FLOWER_POT = registerBlock("magenta_glazed_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "magenta_glazed"));
    public static final RegistryObject<Block> PINK_GLAZED_FLOWER_POT = registerBlock("pink_glazed_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "pink_glazed"));
    public static final RegistryObject<Block> WHITE_GLAZED_FLOWER_POT = registerBlock("white_glazed_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "white_glazed"));
    public static final RegistryObject<Block> LIGHT_GRAY_GLAZED_FLOWER_POT = registerBlock("light_gray_glazed_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "light_gray_glazed"));
    public static final RegistryObject<Block> GRAY_GLAZED_FLOWER_POT = registerBlock("gray_glazed_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "gray_glazed"));
    public static final RegistryObject<Block> BLACK_GLAZED_FLOWER_POT = registerBlock("black_glazed_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "black_glazed"));
    public static final RegistryObject<Block> BROWN_GLAZED_FLOWER_POT = registerBlock("brown_glazed_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "brown_glazed"));
    public static final RegistryObject<Block> COPPER_FLOWER_POT = registerBlock("copper_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "copper"));
    public static final RegistryObject<Block> IRON_FLOWER_POT = registerBlock("iron_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "iron"));
    public static final RegistryObject<Block> GOLD_FLOWER_POT = registerBlock("gold_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "gold"));
    public static final RegistryObject<Block> NETHER_BRICK_FLOWER_POT = registerBlock("nether_brick_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "nether_brick"));
    public static final RegistryObject<Block> RED_NETHER_FLOWER_POT = registerBlock("red_nether_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "red_nether"));
    public static final RegistryObject<Block> BURNT_NETHER_FLOWER_POT = registerBlock("burnt_nether_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "burnt_nether"));
    public static final RegistryObject<Block> WARPED_NETHER_FLOWER_POT = registerBlock("warped_nether_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "warped_nether"));
    public static final RegistryObject<Block> GRANITE_FLOWER_POT = registerBlock("granite_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "granite"));
    public static final RegistryObject<Block> DEEPSLATE_FLOWER_POT = registerBlock("deepslate_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "deepslate"));
    public static final RegistryObject<Block> ANDESITE_FLOWER_POT = registerBlock("andesite_flower_pot",
            () -> new ModFlowerPotBlock(null, null, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT), "andesite"));

    public static final RegistryObject<Block> WARPED_NETHER_BRICKS = registerBlock("warped_nether_bricks",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)));

    public static final RegistryObject<Block> ELDER_PRISMARINE = registerBlock("elder_prismarine",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));

    public static final RegistryObject<Block> POLISHED_ELDER_PRISMARINE = registerBlock("polished_elder_prismarine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));

    public static final RegistryObject<Block> ELDER_PRISMARINE_BRICKS = registerBlock("elder_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)));

    public static final RegistryObject<Block> BURNT_NETHER_BRICKS = registerBlock("burnt_nether_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)));

    public static final RegistryObject<Block> POLISHED_AMETHYST_BLOCK = registerBlock("polished_amethyst_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));

    public static final RegistryObject<Block> POINTED_STONE = registerBlock("pointed_stone",
        () -> new PointedDripstoneBlock(BlockBehaviour.Properties.copy(Blocks.POINTED_DRIPSTONE)));

    public static final RegistryObject<Block> TALL_ALLIUM = registerBlock("tall_allium",
        () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
