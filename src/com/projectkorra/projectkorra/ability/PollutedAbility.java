package com.projectkorra.projectkorra.ability;

import org.bukkit.entity.Player;

import com.projectkorra.projectkorra.Element;

public abstract class PollutedAbility extends FireAbility implements SubAbility {

	public PollutedAbility(final Player player) {
		super(player);
	}

	@Override
	public Class<? extends Ability> getParentAbility() {
		return AirAbility.class;
	}

	@Override
	public Element getElement() {
		return Element.POLLUTED;
	}

	public static double getDamageFactor() {
		return getConfig().getDouble("Properties.Air.Polluted.DamageFactor");
	}

	public static double getCooldownFactor() {
		return getConfig().getDouble("Properties.Air.Polluted.CooldownFactor");
	}

	public static double getPushFactor() {
		return getConfig().getDouble("Properties.Air.Polluted.PushFactor");
	}

}
