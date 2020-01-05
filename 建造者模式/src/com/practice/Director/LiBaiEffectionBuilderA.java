package com.practice.Director;
/*
 * 具体创建者类LiBaiEffectionBuilderA
 */
public class LiBaiEffectionBuilderA extends HeroEffectionBuilder {
	public void buildBackEffection() {
		effection.setBackEffection("李白系统默认回城特效：熊猫回城");
	}

	public void buildSkillEffection() {
		effection.setSkillEffection("李白默认二技能神来之笔效果");
	}
}
