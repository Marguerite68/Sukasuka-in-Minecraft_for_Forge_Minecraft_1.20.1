package net.marguerite68.first_mod.item;

import net.marguerite68.first_mod.FIRST_MOD;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, FIRST_MOD.MOD_ID);

    public static final RegistryObject<Item> KUTORI = ITEMS.register("kutori",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ERUKU = ITEMS.register("eruku",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ITHEA = ITEMS.register("ithea",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NEPHREN = ITEMS.register("nephren",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUKASUKA1_1 = ITEMS.register("sukasuka1_1",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUKASUKA1_2 = ITEMS.register("sukasuka1_2",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUKASUKA1_3 = ITEMS.register("sukasuka1_3",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUKASUKA1_4 = ITEMS.register("sukasuka1_4",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUKASUKA1_5 = ITEMS.register("sukasuka1_5",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUKASUKA2_1 = ITEMS.register("sukasuka2_1",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUKASUKA2_2 = ITEMS.register("sukasuka2_2",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUKASUKA2_3 = ITEMS.register("sukasuka2_3",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUKASUKA2_4 = ITEMS.register("sukasuka2_4",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUKASUKA2_5 = ITEMS.register("sukasuka2_5",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUKASUKA2_6 = ITEMS.register("sukasuka2_6",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUKASUKA2_7 = ITEMS.register("sukasuka2_7",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUKASUKA2_8 = ITEMS.register("sukasuka2_8",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUKASUKA2_9 = ITEMS.register("sukasuka2_9",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUKASUKA2_10 = ITEMS.register("sukasuka2_10",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUKASUKA2_11 = ITEMS.register("sukasuka2_11",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUKASUKA_EX1 = ITEMS.register("sukasuka_ex1",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUKASUKA_EX2 = ITEMS.register("sukasuka_ex2",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
