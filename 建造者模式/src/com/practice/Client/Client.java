package com.practice.Client;

import com.practice.Builder.GameManager;
import com.practice.Director.Effection;
import com.practice.Director.HeroEffectionBuilder;
import com.practice.Director.LiBaiEffectionBuilderA;
import com.practice.Director.LiBaiEffectionBuilderB;

public class Client {
	public static void main(String [] args) {
		HeroEffectionBuilder heb = null;
		
		Boolean isPayMoney = XMLUtilEffection.getIsPayMoney();

		if(isPayMoney) {
			heb = new LiBaiEffectionBuilderB();
		}else {
			heb = new LiBaiEffectionBuilderA(); 
		}
		
		GameManager gm = new GameManager();
		gm.setHeroEffectionBuilder(heb);
		Effection effection = gm.construct();
		
		System.out.println("”¢–€Ãÿ–ß£∫");
		System.out.println(effection.getBackEffection());
		System.out.println(effection.getSkillEffection());
	}
}
