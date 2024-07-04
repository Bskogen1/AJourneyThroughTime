package net.bskogen.ajtt.item;

import net.bskogen.ajtt.A_Journey_Through_Time;
import net.bskogen.ajtt.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, A_Journey_Through_Time.MOD_ID);

    public static final RegistryObject<CreativeModeTab> A_JOURNEY_THROUGH_TIME = CREATIVE_MODE_TABS.register("a_journey_through_time",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRONZE.get()))
                    .title(Component.translatable("creativetab.a_journey_through_time"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BRONZE.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModItems.STRAWBERRY.get());
                        pOutput.accept(ModItems.PINE_CONE.get());

                        pOutput.accept(ModBlocks.BRONZE_BLOCK.get());
                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());

                        pOutput.accept(ModBlocks.BRONZE_STAIRS.get());
                        pOutput.accept(ModBlocks.BRONZE_SLAB.get());
                        pOutput.accept(ModBlocks.BRONZE_BUTTON.get());
                        pOutput.accept(ModBlocks.BRONZE_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.BRONZE_FENCE.get());
                        pOutput.accept(ModBlocks.BRONZE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.BRONZE_WALL.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_DOOR.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_TRAPDOOR.get());
                    })

                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
