package com.practice.Director;
/*
 * ����������HeroEffectionBuilder(Ӣ��Ч����������)
 */
public abstract class HeroEffectionBuilder {
	protected Effection effection = new Effection();
	
	public abstract void buildBackEffection();
	public abstract void buildSkillEffection();
	
	public Effection getEffection() {
		return effection;
	}
	
	
}
