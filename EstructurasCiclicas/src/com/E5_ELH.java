package com;

public class E5_ELH {

	public static void main(String[] args) {
		
		int horas, min, seg;
		
		for(horas=0;horas<24;horas++) {
			for(min=0;min<60;min++) {
				for(seg=0;seg<60;seg++) {
					System.out.println(horas+":"+min+":"+seg);
				}
			}
		}
	}
	
}
