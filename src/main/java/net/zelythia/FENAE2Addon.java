package net.zelythia;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import wraith.fabricaeexnihilo.api.FENApiModule;
import wraith.fabricaeexnihilo.api.FENRegistries;

public class FENAE2Addon implements FENApiModule {
    @Override
    public void onInit(FENRegistries registries) {
        registries.registerCrushedBlock("crushed_sky_stone", AbstractBlock.Settings.copy(Blocks.GRAVEL));
    }

    @Override
    public boolean shouldLoad() {
        return FabricLoader.getInstance().isModLoaded("ae2");
    }
}