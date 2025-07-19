package kumar.tradingpigs;

import turniplabs.halplibe.util.TomlConfigHandler;
import turniplabs.halplibe.util.toml.Toml;


public class TradingPigsConfig {
	private static final Toml TOML = new Toml("TradingPigs TOML Config");
	public static final TomlConfigHandler CFG;

	static {
		TOML.addCategory("IDs")
			.addEntry("startingItemID", "Default: 19000", 19000);

		CFG = new TomlConfigHandler(TradingPigs.MOD_ID, TOML);
	}
}
