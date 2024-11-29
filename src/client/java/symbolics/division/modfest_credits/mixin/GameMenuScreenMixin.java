package symbolics.division.modfest_credits.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.CreditsScreen;
import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.option.CreditsAndAttributionScreen;
import net.minecraft.client.gui.screen.option.OptionsScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.GridWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Supplier;

@Mixin(TitleScreen.class)
public abstract class GameMenuScreenMixin extends Screen {
    protected GameMenuScreenMixin(Text title) {
        super(title);
    }


    @Inject(
            method = "init",
            at = @At("HEAD")
    )
    private void initWidgets(CallbackInfo ci) {
        int l = this.height / 4 + 48;
        this.addDrawableChild(ButtonWidget.builder(Text.translatable("credits_and_attribution.button.credits"), (button) -> {
            this.client.setScreen(
                    new CreditsScreen(false, () -> {
                        MinecraftClient.getInstance().setScreen((TitleScreen)(Object)this);
                    })
            );
        }).dimensions(this.width / 2 - 100, l + 72 + 12 + 20 + 12, 98 * 2, 20).build());
    }
}
