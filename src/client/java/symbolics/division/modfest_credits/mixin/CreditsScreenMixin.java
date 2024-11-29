package symbolics.division.modfest_credits.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import net.minecraft.client.gui.screen.CreditsScreen;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.MusicSound;
import org.spongepowered.asm.mixin.Mixin;
import symbolics.division.modfest_credits.Modfest_credits;

@Mixin(CreditsScreen.class)
public class CreditsScreenMixin {

    @WrapMethod(method = "getMusic")
    private MusicSound wrapGetMusic(Operation<MusicSound> orig) {
        return new MusicSound(new RegistryEntry.Direct<>(Modfest_credits.CREDITS_MUSIC), 20, 600, true);
    }

}
