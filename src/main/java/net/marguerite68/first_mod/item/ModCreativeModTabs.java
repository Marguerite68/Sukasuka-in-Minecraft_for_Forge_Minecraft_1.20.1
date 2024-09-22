package net.marguerite68.first_mod.item;

import net.marguerite68.first_mod.FIRST_MOD;
import net.marguerite68.first_mod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab>  CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FIRST_MOD.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SUKASUKA_IN_MINECRAFT = CREATIVE_MODE_TABS.register("sukasuka_in_minecraft",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KUTORI.get()))
                    .title(Component.translatable("creativetab.sukasuka_in_minecraft"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SUKASUKA1_1.get());
                        pOutput.accept(ModItems.SUKASUKA1_2.get());
                        pOutput.accept(ModItems.SUKASUKA1_3.get());
                        pOutput.accept(ModItems.SUKASUKA1_4.get());
                        pOutput.accept(ModItems.SUKASUKA1_5.get());
                        pOutput.accept(ModItems.SUKASUKA2_1.get());
                        pOutput.accept(ModItems.SUKASUKA2_2.get());
                        pOutput.accept(ModItems.SUKASUKA2_3.get());
                        pOutput.accept(ModItems.SUKASUKA2_4.get());
                        pOutput.accept(ModItems.SUKASUKA2_5.get());
                        pOutput.accept(ModItems.SUKASUKA2_6.get());
                        pOutput.accept(ModItems.SUKASUKA2_7.get());
                        pOutput.accept(ModItems.SUKASUKA2_8.get());
                        pOutput.accept(ModItems.SUKASUKA2_9.get());
                        pOutput.accept(ModItems.SUKASUKA2_10.get());
                        pOutput.accept(ModItems.SUKASUKA2_11.get());
                        pOutput.accept(ModItems.SUKASUKA_EX1.get());
                        pOutput.accept(ModItems.SUKASUKA_EX2.get());

                        pOutput.accept(ModBlocks.TEST_BLOCK.get());

                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
