package com.practice.Builder;

import com.practice.Director.Effection;
import com.practice.Director.HeroEffectionBuilder;

/*
 * ÷∏ª”’ﬂ¿‡GameManager
 */
public class GameManager {
	private HeroEffectionBuilder heb;

	public void setHeroEffectionBuilder(HeroEffectionBuilder _heb) {
		this.heb = _heb;
	}

	public Effection construct() {
		heb.buildBackEffection();
		heb.buildSkillEffection();
		return heb.getEffection();
	}
}
