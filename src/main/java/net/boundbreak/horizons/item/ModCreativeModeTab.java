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
            public ItemStack makeIcon() { return new ItemStack(ModItems.PLAYING_CARD_1337_1.get()); }
        };

            public static final CreativeModeTab HORIZONS_PLAYING_CARDS_OBFUSCATED = new CreativeModeTab("horizons_playing_cards_obfuscated") {
                @Override
                public ItemStack makeIcon() {
            return new ItemStack(ModItems.PLAYING_CARD_1337_0.get());
        }
            };
        public static final CreativeModeTab HORIZONS_WORLD_LORE = new CreativeModeTab("horizons_world_lore") {
            @Override
            public ItemStack makeIcon() {
            return new ItemStack(ModItems.ARCHIVAL_BOOK_GOLD.get());
        }
        };
        public static final CreativeModeTab HORIZONS_PLAYER_LORE = new CreativeModeTab("horizons_player_lore") {
            @Override
            public ItemStack makeIcon() {
            return new ItemStack(ModItems.GHOST_CHANNEL_PIN.get());
        }
        };
        public static final CreativeModeTab HORIZONS_ARTIFACTS = new CreativeModeTab("horizons_artifacts") {
            @Override
            public ItemStack makeIcon() {
            return new ItemStack(ModItems.ANCIENT_MAP.get());
        }
        };
        public static final CreativeModeTab HORIZONS_BORROWED_ASSETS = new CreativeModeTab("horizons_borrowed_assets") {
            @Override
            public ItemStack makeIcon() {
            return new ItemStack(ModItems.PERDU_ICON.get());
        }
        };
    }
