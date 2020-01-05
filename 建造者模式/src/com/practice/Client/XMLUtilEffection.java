package com.practice.Client;

import java.io.File;

import javax.xml.parsers.*;
import org.w3c.dom.*;


public class XMLUtilEffection {
	//�÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ������
	public static Boolean getIsPayMoney() {
		try {
			//�����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src\\com\\practice\\Client\\config.xml"));
			
			//��ȡ�����������ı��ڵ�
			NodeList nl = doc.getElementsByTagName("isPayMoney");
			Node classNode = nl.item(0).getFirstChild();
			String Ispay = classNode.getNodeValue();
			boolean IspayMoney = Boolean.parseBoolean(Ispay);
			return IspayMoney;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
