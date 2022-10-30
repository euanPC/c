
package e.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import e.item.ItemResearch;

import e.ElementsCocMod;

@ElementsCocMod.ModElement.Tag
public class OreDictRd extends ElementsCocMod.ModElement {
	public OreDictRd(ElementsCocMod instance) {
		super(instance, 7);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("rd", new ItemStack(ItemResearch.block, (int) (1)));
	}
}
