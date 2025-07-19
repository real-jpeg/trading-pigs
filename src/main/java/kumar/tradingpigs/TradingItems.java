package kumar.tradingpigs;

import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.ItemBuilder;

import static kumar.tradingpigs.TradingPigs.MOD_ID;
import static kumar.tradingpigs.TradingPigs.LOGGER;

public class TradingItems {
	private static int startingID = TradingPigsConfig.CFG.getInt("IDs.startingItemID");
	private static int nextID() {return startingID++;}

	public static Item ItemGoldCoin;

	public static void InitItems() {

		ItemGoldCoin = new ItemBuilder(MOD_ID)
			.build(new Item("item.goldcoin", MOD_ID +":item/gold_coin", nextID()));

		LOGGER.info("Items initialized.");
	}

}
