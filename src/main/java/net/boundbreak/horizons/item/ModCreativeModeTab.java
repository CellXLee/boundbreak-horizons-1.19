package net.boundbreak.horizons.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
        public static final CreativeModeTab HORIZONS_TAB = new CreativeModeTab("horizonstab") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(ModItems.BOUNDBREAK_ICON.get());
            }
        };
    }
