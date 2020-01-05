package com.practice.Director;
/*
 * 具体创建者类LiBaiEffectionBuilderB
 */
public class LiBaiEffectionBuilderB extends HeroEffectionBuilder {
	public void buildBackEffection() {
		effection.setBackEffection("李白皮肤特效\"凤求凰\""+"回城特效");
	}

	public void buildSkillEffection() {
		effection.setSkillEffection("李白皮肤特效\"凤求凰\""+"二技能神来之笔效果");
	}
}
