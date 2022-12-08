package mod.azure.goldenberry;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GoldenBerryMod implements ModInitializer {
	public static final String MODID = "goldenberry";

	public static final Item GOLDENBERRY = new Item(new Item.Settings()
			.food(new FoodComponent.Builder().alwaysEdible().saturationModifier(1.2F).hunger(6).build()));

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, new Identifier(MODID, "golden_berries"), GOLDENBERRY);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> entries.add(GOLDENBERRY));
	}
}