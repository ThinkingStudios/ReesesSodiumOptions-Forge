package me.flashyreese.mods.reeses_sodium_options;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.network.NetworkConstants;

@Mod(ReesesSodiumOptions.MODID)
public class ReesesSodiumOptions {
    public static final String MODID = "reeses_sodium_options";

    public ReesesSodiumOptions() {
        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> this::onInitClient);
    }

    private void onInitClient() {
        ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class, () -> new IExtensionPoint.DisplayTest(() -> NetworkConstants.IGNORESERVERONLY, (a, b) -> true));
    }
}
