package net.brendermen.remix.item;

import net.brendermen.remix.Remix;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Remix.MOD_ID);



    public static final RegistryObject<Item> AMBER_DYE = ITEMS.register("amber_dye",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CERULEAN_DYE = ITEMS.register("cerulean_dye",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CREAM_DYE = ITEMS.register("cream_dye",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FOREST_DYE = ITEMS.register("forest_dye",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FUCHSIA_DYE = ITEMS.register("fuchsia_dye",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VELVET_DYE = ITEMS.register("velvet_dye",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INDIGO_DYE = ITEMS.register("indigo_dye",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LEMON_DYE = ITEMS.register("lemon_dye",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SCARLET_DYE = ITEMS.register("scarlet_dye",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AZURE_DYE = ITEMS.register("azure_dye",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TAN_DYE = ITEMS.register("tan_dye",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TEAL_DYE = ITEMS.register("teal_dye",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VIOLET_DYE = ITEMS.register("violet_dye",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
