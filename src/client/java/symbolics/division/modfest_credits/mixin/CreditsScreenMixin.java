package symbolics.division.modfest_credits.mixin;

import net.minecraft.client.gui.screen.CreditsScreen;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(CreditsScreen.class)
public class CreditsScreenMixin {
    private Identifier CREDITS_TEXT_LOCATION;

//    @WrapOperation(
//            method = "init",
//            at = @At(value = "FIELD", target = "Lnet/minecraft/client/gui/screen/CreditsScreen;CREDITS_TEXT_LOCATION:Lnet/minecraft/util/Identifier;")
//    )
//    public Identifier injectCredits(Operation<Identifier> original) {
//        return Identifier.of("mf121", "texts/credits.json");
//    }

}
