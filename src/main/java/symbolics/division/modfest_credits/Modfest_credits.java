package symbolics.division.modfest_credits;

import net.fabricmc.api.ModInitializer;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Modfest_credits implements ModInitializer {
	public static final String MOD_ID = "modfest_credits";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	public static Identifier CREDITS_MUSIC_ID = Identifier.of(MOD_ID, "credits_music");
	public static SoundEvent CREDITS_MUSIC = SoundEvent.of(CREDITS_MUSIC_ID);

	@Override
	public void onInitialize() {
		Registry.register(Registries.SOUND_EVENT, CREDITS_MUSIC_ID, CREDITS_MUSIC);
	}
}