package net.bskogen.ajtt.datagen;

import net.bskogen.ajtt.A_Journey_Through_Time;
import net.bskogen.ajtt.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, A_Journey_Through_Time.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BRONZE_BLOCK);
        blockWithItem(ModBlocks.SOUND_BLOCK);

        stairsBlock(((StairBlock) ModBlocks.BRONZE_STAIRS.get()), blockTexture(ModBlocks.BRONZE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.BRONZE_SLAB.get()), blockTexture(ModBlocks.BRONZE_BLOCK.get()), blockTexture(ModBlocks.BRONZE_BLOCK.get()));

        buttonBlock(((ButtonBlock) ModBlocks.BRONZE_BUTTON.get()), blockTexture(ModBlocks.BRONZE_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.BRONZE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.BRONZE_BLOCK.get()));

        fenceBlock(((FenceBlock) ModBlocks.BRONZE_FENCE.get()), blockTexture(ModBlocks.BRONZE_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.BRONZE_FENCE_GATE.get()), blockTexture(ModBlocks.BRONZE_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.BRONZE_WALL.get()), blockTexture(ModBlocks.BRONZE_BLOCK.get()));


        doorBlockWithRenderType(((DoorBlock) ModBlocks.SAPPHIRE_DOOR.get()), modLoc("block/sapphire_door_bottom"), modLoc("block/sapphire_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.SAPPHIRE_TRAPDOOR.get()), modLoc("block/sapphire_trapdoor"), true, "cutout");
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
