// On définit le package dans lequel se trouve notre classe principale
package com.example.examplemod;

// On importe les classes nécessaires du modloader Forge
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// On indique que cette classe est notre mod principal en utilisant l'annotation @Mod
@Mod("examplemod")
public class ExampleMod {

    // Constructeur de notre mod
    public ExampleMod() {
        // On enregistre notre mod avec Forge, cela permettra au modloader de le charger et de l'initialiser
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // On initialise notre mod
        MinecraftForge.EVENT_BUS.register(this);
    }

    // Méthode d'initialisation du mod
    private void setup(final FMLCommonSetupEvent event) {
        // Code d'initialisation ici
    }

    // Méthode d'enregistrement des messages inter-mods
    private void enqueueIMC(final InterModEnqueueEvent event) {
        // Enregistrement des messages ici
    }

    // Méthode de traitement des messages inter-mods
    private void processIMC(final InterModProcessEvent event) {
        // Traitement des messages ici
    }

    // Méthode d'initialisation du mod côté client
    private void doClientStuff(final FMLClientSetupEvent event) {
        // Code d'initialisation côté client ici
    }

    // Méthode d'initialisation du mod côté serveur
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // Code d'initialisation côté serveur ici
    }

    // Définition de notre bloc custom en utilisant l'annotation @ObjectHolder pour référencer son ID
    @ObjectHolder("examplemod:example_block")
    public static final Block EXAMPLE_BLOCK = null;

    // Définition de notre item custom en utilisant l'annotation @ObjectHolder pour référencer son ID
    @ObjectHolder("examplemod:example_item")
    public static final Item EXAMPLE_ITEM = null;

    // Méthode d'enregistrement des blocs et items custom
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        // Enregistrement des blocs ici
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        // Enregistrement des items ici
    }

    // Définition de notre entité custom
    public static final EntityType<ExampleEntity> EXAMPLE_ENTITY = EntityType.Builder.<ExampleEntity>create(ExampleEntity::new, EntityClassification.CREATURE).build(new ResourceLocation("examplemod", "example_entity").
