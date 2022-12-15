package com;

public class arrays2dimen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  MAQUINA DISPENSADORA
	
		int y=0,x=0;
		String c;
		String codigo[][]= {{"A1 Cocacola, A2 Pepsi, A3 Mirinda"},{"B1 Rufles, B2 Doritos, B3 Chetos"},{"C1 Gansito, C2 Chocorroles, C3 Galletas"}};
		float precios[][]= new float[3][3];
		for(int j=0;j<codigo.length;j++ ) {
			
			for(int i=0; i<codigo[j].length; i++) {
				
				System.out.print(codigo[j][i]+"");
			}
			System.out.println();
		}
		
		System.out.println("Ingrese el codigo del producto que desea adquirir");
		c = sc.nextLine();
		
	switch (c) {
	case "A1":
		y=0;
		x=0;
		verificar=1;
		break;
	case "A2":
		y=0;
		x=1;
		verificar=1;
		break;
	case "A3":
		y=0;
		x=2;
		verificar=1;
		break;
	case "B1":
		y=1;
		x=0;
		verificar=1;
		break;
	case "B2":
		y=1;
		x=1;
		verificar=1;
		break;
	case "B3":
		y=1;
		x=2;
		verificar=1;
		break;
	case "C1":
		y=2;
		x=0;
		verificar=1;
		break;
	case "C1":
		y=2;
		x=1;
		verificar=1;
		break;
	case "A":
		y=2;
		x=2;
		verificar=1;
		break;
	default
		verificar = 0;

		}
		if(verificar==1 ) {
		System.out.println("El producto seleccionado es:"+codigo[y][x]+ "con un precio de:"+precios[y][x]);
		}else {
			System.out.println("Codigo incorrecto");
			
		}
		}
		
		}
	}
}


