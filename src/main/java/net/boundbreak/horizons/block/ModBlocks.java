package net.boundbreak.horizons.block;

import net.boundbreak.horizons.Horizons;
import net.boundbreak.horizons.item.ModCreativeModeTab;
import net.boundbreak.horizons.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Horizons.MOD_ID);

    //BORROWED ASSETS (BetterEnd)
    public static final RegistryObject<Block> TERMINITE_BLOCK = registerBlock("terminite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(0.8F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), ModCreativeModeTab.HORIZONS_BORROWED_ASSETS);
    public static final RegistryObject<Block> VIRID_JADESTONE = registerBlock("virid_jadestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(0.8F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), ModCreativeModeTab.HORIZONS_BORROWED_ASSETS);
    public static final RegistryObject<Block> VIRID_JADESTONE_PILLAR = registerBlock("virid_jadestone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(0.8F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), ModCreativeModeTab.HORIZONS_BORROWED_ASSETS);
    public static final RegistryObject<Block> VIRID_JADESTONE_POLISHED = registerBlock("virid_jadestone_polished",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(0.8F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), ModCreativeModeTab.HORIZONS_BORROWED_ASSETS);
    public static final RegistryObject<Block> VIRID_JADESTONE_TILES = registerBlock("virid_jadestone_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(0.8F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), ModCreativeModeTab.HORIZONS_BORROWED_ASSETS);
    public static final RegistryObject<Block> VIRID_JADESTONE_BRICKS = registerBlock("virid_jadestone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(0.8F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), ModCreativeModeTab.HORIZONS_BORROWED_ASSETS);
    public static final RegistryObject<Block> AZURE_JADESTONE = registerBlock("azure_jadestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(0.8F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), ModCreativeModeTab.HORIZONS_BORROWED_ASSETS);
    public static final RegistryObject<Block> AZURE_JADESTONE_PILLAR = registerBlock("azure_jadestone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(0.8F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), ModCreativeModeTab.HORIZONS_BORROWED_ASSETS);
    public static final RegistryObject<Block> AZURE_JADESTONE_POLISHED = registerBlock("azure_jadestone_polished",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(0.8F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), ModCreativeModeTab.HORIZONS_BORROWED_ASSETS);
    public static final RegistryObject<Block> AZURE_JADESTONE_TILES = registerBlock("azure_jadestone_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(0.8F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), ModCreativeModeTab.HORIZONS_BORROWED_ASSETS);
    public static final RegistryObject<Block> AZURE_JADESTONE_BRICKS = registerBlock("azure_jadestone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(0.8F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), ModCreativeModeTab.HORIZONS_BORROWED_ASSETS);
    public static final RegistryObject<Block> SMARAGDANT_CRYSTAL = registerBlock("smaragdant_crystal",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(0.8F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), ModCreativeModeTab.HORIZONS_BORROWED_ASSETS);
    public static final RegistryObject<Block> ENDER_BLOCK = registerBlock("ender_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(0.8F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)), ModCreativeModeTab.HORIZONS_BORROWED_ASSETS);
    public static final RegistryObject<Block> DRAGON_BONE_BLOCK = registerBlock("dragon_bone_block",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.8F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)), ModCreativeModeTab.HORIZONS_BORROWED_ASSETS);


    //BORROWED ASSETS (Biomes O' Plenty)
    public static final RegistryObject<Block> SMOOTH_BLACK_SANDSTONE = registerBlock("smooth_black_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.8F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModeTab.HORIZONS_BORROWED_ASSETS);

    //BORROWED ASSETS (Macaw's Biomes O' Plenty)
    //INSERT ANY BORROWED Macaw's Biomes O' Plenty ITEMS HERE


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
