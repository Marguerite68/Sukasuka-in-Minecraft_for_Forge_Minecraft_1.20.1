package net.marguerite68.first_mod.item;

import net.marguerite68.first_mod.FIRST_MOD;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> TestItem =
        DeferredRegister.create(ForgeRegistries.ITEMS, FIRST_MOD.MOD_ID);

    public static final RegistryObject<Item> KUTORI = TestItem.register("Kutori",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        TestItem.register(eventBus);
    }

}
