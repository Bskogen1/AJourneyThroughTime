package net.bskogen.ajtt.datagen.loot;

import net.bskogen.ajtt.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class  ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.BRONZE_BLOCK.get());
        this.dropSelf(ModBlocks.SOUND_BLOCK.get());


        this.dropSelf(ModBlocks.BRONZE_STAIRS.get());
        this.dropSelf(ModBlocks.BRONZE_BUTTON.get());
        this.dropSelf(ModBlocks.BRONZE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SAPPHIRE_TRAPDOOR.get());
        this.dropSelf(ModBlocks.BRONZE_FENCE.get());
        this.dropSelf(ModBlocks.BRONZE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BRONZE_WALL.get());

        this.add(ModBlocks.BRONZE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BRONZE_SLAB.get()));
        this.add(ModBlocks.SAPPHIRE_DOOR.get(),
                block -> createDoorTable(ModBlocks.SAPPHIRE_DOOR.get()));

    }



    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
