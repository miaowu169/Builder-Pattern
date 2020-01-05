package com.practice.Director;
/*
 * 抽象建造者类HeroEffectionBuilder(英雄效果建造者类)
 */
public abstract class HeroEffectionBuilder {
	protected Effection effection = new Effection();
	
	public abstract void buildBackEffection();
	public abstract void buildSkillEffection();
	
	public Effection getEffection() {
		return effection;
	}
	
	
}
