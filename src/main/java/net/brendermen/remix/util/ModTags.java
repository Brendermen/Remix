package net.brendermen.remix.util;

import net.brendermen.remix.Remix;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Tags {
        public static final TagKey<Item> POTTABLE = ItemTags.create(new ResourceLocation(Remix.MOD_ID, "pottable"));
    }
}
