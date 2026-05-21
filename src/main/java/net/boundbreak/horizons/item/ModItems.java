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
    public static final RegistryObject<Item> BIRD_SKULL = ITEMS.register("bird_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> BLUE_JAY_FEATHER = ITEMS.register("blue_jay_feather",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> BROKEN_GLASSES = ITEMS.register("broken_glasses",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> COIN = ITEMS.register("coin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> CORVID_SKULL = ITEMS.register("corvid_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> COW_SKULL = ITEMS.register("cow_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> CRYSTAL_GEODE = ITEMS.register("crystal_geode",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> CRYSTAL_CLUSTER = ITEMS.register("crystal_cluster",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> CRYSTAL = ITEMS.register("crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> GEM = ITEMS.register("gem",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));

    //MEDICAL TAB
    public static final RegistryObject<Item> HEART = ITEMS.register("heart",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_MEDICAL)));
    public static final RegistryObject<Item> BRAIN = ITEMS.register("brain",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_MEDICAL)));
    public static final RegistryObject<Item> BANDAGES = ITEMS.register("bandages",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_MEDICAL)));
    public static final RegistryObject<Item> BLOOD_SPLATTER_1 = ITEMS.register("blood_splatter_1",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_MEDICAL)));
    public static final RegistryObject<Item> BLOOD_SPLATTER_2 = ITEMS.register("blood_splatter_2",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_MEDICAL)));
    public static final RegistryObject<Item> BLOOD_SPLATTER_3 = ITEMS.register("blood_splatter_3",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_MEDICAL)));
    public static final RegistryObject<Item> BLOOD_SPLATTER_4 = ITEMS.register("blood_splatter_4",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_MEDICAL)));
    public static final RegistryObject<Item> FEMUR_BONE = ITEMS.register("femur_bone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_MEDICAL)));
    public static final RegistryObject<Item> FINGER_BONE = ITEMS.register("finger_bone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_MEDICAL)));
    public static final RegistryObject<Item> HUMAN_C6_VERTEBRAE = ITEMS.register("human_c6_vertebrae",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_MEDICAL)));
    public static final RegistryObject<Item> HUMERUS_BONE = ITEMS.register("humerus_bone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_MEDICAL)));
    public static final RegistryObject<Item> RADIUS_BONE = ITEMS.register("radius_bone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_MEDICAL)));
    public static final RegistryObject<Item> RIB_BONE = ITEMS.register("rib_bone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_MEDICAL)));
    public static final RegistryObject<Item> RIBCAGE_BONE = ITEMS.register("ribcage_bone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_MEDICAL)));
    public static final RegistryObject<Item> SYRINGE = ITEMS.register("syringe",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_MEDICAL)));
    public static final RegistryObject<Item> SYRINGE_EMPTY = ITEMS.register("syringe_empty",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_MEDICAL)));

    //CHESS PIECES
    public static final RegistryObject<Item> CHESS_PIECE_BLACK_BISHOP = ITEMS.register("chess_piece_black_bishop",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> CHESS_PIECE_BLACK_KING = ITEMS.register("chess_piece_black_king",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> CHESS_PIECE_BLACK_KNIGHT = ITEMS.register("chess_piece_black_knight",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> CHESS_PIECE_BLACK_PAWN = ITEMS.register("chess_piece_black_pawn",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> CHESS_PIECE_BLACK_QUEEN = ITEMS.register("chess_piece_black_queen",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> CHESS_PIECE_BLACK_ROOK = ITEMS.register("chess_piece_black_rook",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> CHESS_PICE_WHITE_BISHOP = ITEMS.register("chess_piece_white_bishop",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> CHESS_PIECE_WHITE_KING = ITEMS.register("chess_piece_white_king",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> CHESS_PIECE_WHITE_KNIGHT = ITEMS.register("chess_piece_white_knight",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> CHESS_PIECE_WHITE_PAWN = ITEMS.register("chess_piece_white_pawn",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> CHESS_PIECE_WHITE_QUEEN = ITEMS.register("chess_piece_white_queen",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));
    public static final RegistryObject<Item> CHESS_PIECE_WHITE_ROOK = ITEMS.register("chess_piece_white_rook",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_TAB)));

    //PLAYING CARDS (FACE UP, SPADES)
    public static final RegistryObject<Item> PLAYING_CARD_111 = ITEMS.register("playing_card_111",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_121 = ITEMS.register("playing_card_121",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_131 = ITEMS.register("playing_card_131",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_141 = ITEMS.register("playing_card_141",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_151 = ITEMS.register("playing_card_151",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_161 = ITEMS.register("playing_card_161",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_171 = ITEMS.register("playing_card_171",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_181 = ITEMS.register("playing_card_181",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_191 = ITEMS.register("playing_card_191",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_1101 = ITEMS.register("playing_card_1101",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_1111 = ITEMS.register("playing_card_1111",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_1121 = ITEMS.register("playing_card_1121",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_1131 = ITEMS.register("playing_card_1131",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));

    //PLAYING CARDS (FACE UP, HEARTS)
    public static final RegistryObject<Item> PLAYING_CARD_211 = ITEMS.register("playing_card_211",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_221 = ITEMS.register("playing_card_221",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_231 = ITEMS.register("playing_card_231",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_241 = ITEMS.register("playing_card_241",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_251 = ITEMS.register("playing_card_251",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_261 = ITEMS.register("playing_card_261",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_271 = ITEMS.register("playing_card_271",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_281 = ITEMS.register("playing_card_281",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_291 = ITEMS.register("playing_card_291",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_2101 = ITEMS.register("playing_card_2101",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_2111 = ITEMS.register("playing_card_2111",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_2121 = ITEMS.register("playing_card_2121",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_2131 = ITEMS.register("playing_card_2131",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));

    //PLAYING CARDS (FACE UP, CLUBS)
    public static final RegistryObject<Item> PLAYING_CARD_311 = ITEMS.register("playing_card_311",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_321 = ITEMS.register("playing_card_321",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_331 = ITEMS.register("playing_card_331",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_341 = ITEMS.register("playing_card_341",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_351 = ITEMS.register("playing_card_351",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_361 = ITEMS.register("playing_card_361",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_371 = ITEMS.register("playing_card_371",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_381 = ITEMS.register("playing_card_381",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_391 = ITEMS.register("playing_card_391",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_3101 = ITEMS.register("playing_card_3101",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_3111 = ITEMS.register("playing_card_3111",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_3121 = ITEMS.register("playing_card_3121",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_3131 = ITEMS.register("playing_card_3131",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));

    //PLAYING CARDS (FACE UP, DIAMONDS)
    public static final RegistryObject<Item> PLAYING_CARD_411 = ITEMS.register("playing_card_411",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_421 = ITEMS.register("playing_card_421",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_431 = ITEMS.register("playing_card_431",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_441 = ITEMS.register("playing_card_441",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_451 = ITEMS.register("playing_card_451",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_461 = ITEMS.register("playing_card_461",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_471 = ITEMS.register("playing_card_471",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_481 = ITEMS.register("playing_card_481",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_491 = ITEMS.register("playing_card_491",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_4101 = ITEMS.register("playing_card_4101",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_4111 = ITEMS.register("playing_card_4111",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_4121 = ITEMS.register("playing_card_4121",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_4131 = ITEMS.register("playing_card_4131",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));

    //PLAYING CARDS (FACE DOWN, SPADES)
    public static final RegistryObject<Item> PLAYING_CARD_110 = ITEMS.register("playing_card_110",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_120 = ITEMS.register("playing_card_120",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_130 = ITEMS.register("playing_card_130",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_140 = ITEMS.register("playing_card_140",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_150 = ITEMS.register("playing_card_150",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_160 = ITEMS.register("playing_card_160",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_170 = ITEMS.register("playing_card_170",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_180 = ITEMS.register("playing_card_180",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_190 = ITEMS.register("playing_card_190",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_1100 = ITEMS.register("playing_card_1100",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_1110 = ITEMS.register("playing_card_1110",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_1120 = ITEMS.register("playing_card_1120",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_1130 = ITEMS.register("playing_card_1130",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));

    //PLAYING CARDS (FACE DOWN, HEARTS)
    public static final RegistryObject<Item> PLAYING_CARD_210 = ITEMS.register("playing_card_210",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_220 = ITEMS.register("playing_card_220",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_230 = ITEMS.register("playing_card_230",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_240 = ITEMS.register("playing_card_240",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_250 = ITEMS.register("playing_card_250",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_260 = ITEMS.register("playing_card_260",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_270 = ITEMS.register("playing_card_270",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_280 = ITEMS.register("playing_card_280",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_290 = ITEMS.register("playing_card_290",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_2100 = ITEMS.register("playing_card_2100",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_2110 = ITEMS.register("playing_card_2110",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_2120 = ITEMS.register("playing_card_2120",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_2130 = ITEMS.register("playing_card_2130",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));

    //PLAYING CARDS (FACE DOWN, CLUBS)
    public static final RegistryObject<Item> PLAYING_CARD_310 = ITEMS.register("playing_card_310",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_320 = ITEMS.register("playing_card_320",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_330 = ITEMS.register("playing_card_330",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_340 = ITEMS.register("playing_card_340",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_350 = ITEMS.register("playing_card_350",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_360 = ITEMS.register("playing_card_360",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_370 = ITEMS.register("playing_card_370",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_380 = ITEMS.register("playing_card_380",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_390 = ITEMS.register("playing_card_390",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_3100 = ITEMS.register("playing_card_3100",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_3110 = ITEMS.register("playing_card_3110",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_3120 = ITEMS.register("playing_card_3120",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_3130 = ITEMS.register("playing_card_3130",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));

    //PLAYING CARDS (FACE DOWN, DIAMONDS)
    public static final RegistryObject<Item> PLAYING_CARD_410 = ITEMS.register("playing_card_410",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_420 = ITEMS.register("playing_card_420",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_430 = ITEMS.register("playing_card_430",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_440 = ITEMS.register("playing_card_440",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_450 = ITEMS.register("playing_card_450",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_460 = ITEMS.register("playing_card_460",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_470 = ITEMS.register("playing_card_470",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_480 = ITEMS.register("playing_card_480",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_490 = ITEMS.register("playing_card_490",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_4100 = ITEMS.register("playing_card_4100",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_4110 = ITEMS.register("playing_card_4110",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_4120 = ITEMS.register("playing_card_4120",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_4130 = ITEMS.register("playing_card_4130",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));

    //JOKER CARDS (NON-SPECIALTY FACE UP)
    public static final RegistryObject<Item> PLAYING_CARD_1337_1 = ITEMS.register("playing_card_1337_1",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));
    public static final RegistryObject<Item> PLAYING_CARD_80085_1 = ITEMS.register("playing_card_80085_1",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS)));

    //JOKER CARDS (NON-SPECIALTY FACE DOWN)
    public static final RegistryObject<Item> PLAYING_CARD_1337_0 = ITEMS.register("playing_card_1337_0",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));
    public static final RegistryObject<Item> PLAYING_CARD_80085_0 = ITEMS.register("playing_card_80085_0",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORIZONS_PLAYING_CARDS_OBFUSCATED)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
