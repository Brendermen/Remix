package net.brendermen.remix.mod;

import com.google.common.collect.Maps;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.registries.ForgeRegistries;
import javax.annotation.Nullable;
import java.util.Collections;
import java.util.Map;
import java.util.function.Supplier;



public class ModFlowerPotBlock extends Block {
    public static final Map<String, ModFlowerPotBlock> POT_FROM_COLOR = Maps.newHashMap();
    protected static final VoxelShape SHAPE = Block.box(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
    private final Block flower;
    private String potColor = "";
    private final Map<ResourceLocation, Supplier<? extends Block>> fullPots;
    private final Supplier<ModFlowerPotBlock> emptyPot;
    private final Supplier<? extends Block> flowerDelegate;

    public ModFlowerPotBlock(@Nullable Supplier<ModFlowerPotBlock> emptyPot, Supplier<? extends Block> plant, BlockBehaviour.Properties properties, String color) {
        super(properties);
        this.potColor = color;
        if (plant != null) {
            this.flower = (Block) plant.get();
            this.flowerDelegate = plant;
        } else {
            this.flower = Blocks.AIR;
            this.flowerDelegate = () -> Blocks.AIR;
        }

        if (emptyPot == null) {
            this.fullPots = Maps.newHashMap();
            this.emptyPot = null;
            POT_FROM_COLOR.put(color, this);
        } else {
            this.fullPots = Collections.emptyMap();
            this.emptyPot = emptyPot;
        }

        if (this.flower != Blocks.AIR) {
            ((ModFlowerPotBlock) emptyPot.get()).addPlant(this.name(this.flower), () -> this);
        }
    }

    private ResourceLocation name(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    public VoxelShape getShape(BlockState state, BlockGetter get, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack itemstack = player.getItemInHand(hand);
        Item item = itemstack.getItem();
        BlockState blockstate = (item instanceof BlockItem ? (Block) ((Supplier) this.getEmptyPot().fullPots.getOrDefault(ForgeRegistries.BLOCKS.getKey(((BlockItem) item).getBlock()), ForgeRegistries.BLOCKS.getDelegateOrThrow(Blocks.AIR))).get() : Blocks.AIR).defaultBlockState();
        boolean flag = blockstate.is(Blocks.AIR);
        boolean flag1 = this.flower == Blocks.AIR;

        if (flag != flag1) {
            if (flag1) {
                level.setBlock(pos, blockstate, 3);
                player.awardStat(Stats.POT_FLOWER);

                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
            } else {
                ItemStack itemstack1 = new ItemStack(this.flower);

                if (itemstack.isEmpty()) {
                    player.setItemInHand(hand, itemstack1);
                } else if (!player.addItem(itemstack1)) {
                    player.drop(itemstack1, false);
                }

                level.setBlock(pos, this.getEmptyPot().defaultBlockState(), 3);
            }

            level.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);
            return InteractionResult.sidedSuccess(level.isClientSide);
        } else {
            return InteractionResult.CONSUME;
        }
    }

    public ItemStack getCloneItemStack(BlockGetter p_53531_, BlockPos p_53532_, BlockState p_53533_) {
        return this.isEmpty() ? super.getCloneItemStack(p_53531_, p_53532_, p_53533_) : new ItemStack(this.flower);
    }

    private boolean isEmpty() {
        return this.flower == Blocks.AIR;
    }

    public BlockState updateShape(BlockState p_53547_, Direction p_53548_, BlockState p_53549_, LevelAccessor p_53550_, BlockPos p_53551_, BlockPos p_53552_) {
        return p_53548_ == Direction.DOWN && !p_53547_.canSurvive(p_53550_, p_53551_) ? Blocks.AIR.defaultBlockState() : super.updateShape(p_53547_, p_53548_, p_53549_, p_53550_, p_53551_, p_53552_);
    }

    public Block getContent() {
        return (Block) this.flowerDelegate.get();
    }

    public String getPotColor() {
        return this.potColor;
    }

    public boolean isPathfindable(BlockState p_53535_, BlockGetter p_53536_, BlockPos p_53537_, PathComputationType p_53538_) {
        return false;
    }

    public ModFlowerPotBlock getEmptyPot() {
        return this.emptyPot == null ? this : (ModFlowerPotBlock) this.emptyPot.get();
    }

    public void addPlant(ResourceLocation flower, Supplier<? extends Block> fullPot) {
        if (this.getEmptyPot() != this) {
            throw new IllegalArgumentException("Cannot add plant to non-empty pot: " + this);
        } else {
            this.fullPots.put(flower, fullPot);
        }
    }
}