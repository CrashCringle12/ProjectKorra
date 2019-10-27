package com.projectkorra.projectkorra.configuration.configs.abilities.fire;

import com.projectkorra.projectkorra.configuration.configs.abilities.AbilityConfig;

public class BlazeConfig extends AbilityConfig {

	public final long Cooldown = 1200;
	public final int Arc = 14;
	public final double Range = 15;
	public final double Speed = 15;
	
	public final RingConfig RingConfig = new RingConfig();
	
	public static class RingConfig {
		
		public final long Cooldown = 3000;
		public final int Range = 12;
		public final double Angle = 10;
		
		public final int AvatarState_Range = 30;
		
	}
	
	public BlazeConfig() {
		super(true, "Blaze is a basic firebending technique that can be extremely deadly if used right. It's useful to stop people from chasing you or to create space between you and other players.", "Left click to send an arc of fire in the direction you're facing that will burn entities in its path. Additionally, you can tap sneak to send a blaze all around you.");
	}

	@Override
	public String getName() {
		return "Blaze";
	}

	@Override
	public String[] getParents() {
		return new String[] { "Abilities", "Fire" };
	}

}