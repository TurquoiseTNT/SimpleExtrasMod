
package tk.turquoisetnt.tntextras.item;

import tk.turquoisetnt.tntextras.init.TntextrasModTabs;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class RubberItem extends Item {
	public RubberItem() {
		super(new Item.Properties().tab(TntextrasModTabs.TAB_SIMPLE_EXTRAS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
