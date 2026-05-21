package net.boundbreak.horizons.item;

import net.boundbreak.horizons.Horizons;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Horizons.MOD_ID);

    public static final RegistryObject<Item> ARCHIVAL_BOOK_GOLD = ITEMS.register("archival_book_gold",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> ARCHIVAL_BOOK_SILVER = ITEMS.register("archival_book_silver",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> BOUNDBREAK_ICON = ITEMS.register("boundbreak_icon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> BUTTERFLY_CHARM = ITEMS.register("butterfly_charm",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> DOWN_ICON = ITEMS.register("down_icon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> UP_ICON = ITEMS.register("up_icon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> EASTER_EGG = ITEMS.register("easter_egg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> GHOST_CHANNEL_PENDANT = ITEMS.register("ghost_channel_pendant",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> GHOST_CHANNEL_PIN = ITEMS.register("ghost_channel_pin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> GHOST_CHANNEL_XD = ITEMS.register("ghost_channel_xd",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> PERDU_ICON = ITEMS.register("perdu_icon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> ROBOT_ICON = ITEMS.register("robot_icon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> SPIRIT_BLOOD = ITEMS.register("spirit_blood",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> TRAINING_SWORD = ITEMS.register("training_sword",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
