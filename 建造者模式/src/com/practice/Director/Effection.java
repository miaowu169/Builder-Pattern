package com.practice.Director;
/*
 * 产品类Effection(英雄效果类）
 * @param backEffection 英雄回城效果
 * @param skillEffection 英雄技能效果
 */
public class Effection {
	//回城和技能都是组成整个游戏效果的部件
	private String backEffection;
	private String skillEffection;
	
	public String getBackEffection() {
		return backEffection;
	}
	public void setBackEffection(String backEffection) {
		this.backEffection = backEffection;
	}
	public String getSkillEffection() {
		return skillEffection;
	}
	public void setSkillEffection(String skillEffection) {
		this.skillEffection = skillEffection;
	}
}
