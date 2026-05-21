package net.boundbreak.horizons.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
        public static final CreativeModeTab HORIZONS_TAB = new CreativeModeTab("horizons_tab") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(ModItems.BOUNDBREAK_ICON.get());
            }
        };

        public static final CreativeModeTab HORIZONS_MEDICAL = new CreativeModeTab("horizons_medical") {
            @Override
            public ItemStack makeIcon() {
            return new ItemStack(ModItems.HEART.get());
        }
        };

        public static final CreativeModeTab HORIZONS_PLAYING_CARDS = new CreativeModeTab("horizons_playing_cards") {
            @Override
            public ItemStack makeIcon() { return new ItemStack(ModItems.PLAYING_CARD_1337_1.get());
        }
        };

        public static final CreativeModeTab HORIZONS_PLAYING_CARDS_OBFUSCATED = new CreativeModeTab("horizons_playing_cards_obfuscated") {
            @Override
            public ItemStack makeIcon() {
            return new ItemStack(ModItems.PLAYING_CARD_1337_0.get());
        }
        };
    }
