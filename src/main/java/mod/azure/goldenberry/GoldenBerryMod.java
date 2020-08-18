package mod.azure.goldenberry;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GoldenBerryMod implements ModInitializer {
	public static final String MODID = "goldenberry";

	public static final Item GOLDENBERRY = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder().alwaysEdible().saturationModifier(1.2F).hunger(6).build()));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier(MODID, "golden_berries"), GOLDENBERRY);
	}
}