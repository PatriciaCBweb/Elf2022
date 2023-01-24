/*Los elfos que ayudarán a Papá Noel a repartir regalos estas navidades 
  disponen de un saco de provisiones, para alimentarse mientras desempeñan 
  su función.
  Cada elfo guarda en el saco alimentos con un determinado componente de 
  calorías.
  Se desea saber que elfo se ha aprovisionado de mayor número de calorías.
  Para ellos desarrolla un programa que lea la información alamcenada en 
  el array 'datos' de la plantilla de programa que se te facilita.
  La organización de la información es como sigue: Los datos de las bolsas 
  se encuentran agrupados y separados por el valor -1.
  Deberás sumar las calorías de cada saco y matener actualizado el máximo 
  valor que encuentres, para imprimirlo al final.*/

//mensaje de prueba

public class MainApp {

	public static final int[] datos= {
			
			1000,
			2000,
			3000,
			-1,
			4000,
			-1,
			5000,
			6000,
			-1,
			7000,
			8000,
			9000,
			-1,
			10000
			
			/*3864,
			5112,
			3233,
			3008,
			5052,
			3291,
			4002,
			5402,
			2907,
			2398,
			3014,
			3923,
			1475,
			1997,
			2519,
			-1,
			9130,
			9712,
			12437,
			3457,
			11610,
			4598,
			-1,
			1698,
			1551,
			6798,
			7440,
			3574,
			12107,
			3697,
			-1,
			9019,
			12113,
			6266,
			11838,
			7562,
			6444,
			-1,
			10364,
			1437,
			10513,
			2988,
			10836,
			13749,
			-1,
			3011,
			9552,
			11575,
			12646,
			9861,
			6347,
			-1,
			15883,
			15888,
			6725,
			7353,
			4998,
			-1,
			3165,
			7637,
			6348,
			3250,
			13535,
			12802,
			-1,
			6683,
			13364,
			15858,
			5489,
			5315,
			-1,
			12294,
			13732,
			9734,
			6165,
			-1,
			6023,
			2374,
			5773,
			5578,
			6419,
			4301,
			6861,
			4560,
			6021,
			2960,
			1349,
			-1,
			1847,
			2687,
			4164,
			3599,
			4361,
			7463,
			3010,
			4351,
			6738,
			7941,
			3855,
			-1*/

	};
	
	public MainApp() {
		// TODO Auto-generated constructor stub
	}
	
	public static int calcula_maximo(int[] misDatos) {
		int result = 0;
		// TODO programar aqui
		int suma = 0;
		for(int i=0;i<datos.length;i++) {
			if(datos[i]!=-1) {
				suma+=datos[i];
				if(suma>result) {
					result = suma;
				}
			}else {
				suma = 0;
			}
		}
		return result;
	}//calcula_maximo

	public static void top_3(int[] misDatos) {
			int suma = 0;
			int result1 = 0;
			int result2 = 0;
			int result3 = 0;
			//int result = 0;
			for(int i=0;i<datos.length;i++) {
				if(datos[i]>-1) {
					suma+=datos[i];	
					/*if(suma>result) {
						result = suma;
					}*/
				}
				if(datos[i]==-1 || datos[datos.length-1]==datos[i]) {
					if(suma>result1) {
						//si result es mayor que result1 va a 1º
						//1º que había pasa a 2º
						//2º que había pasa a 3º
						result3 = result2;
						result2 = result1;
						result1 = suma;
					}else if(suma>result2 && suma<result1){
						//si mayor que result2 y menor que result1 va a 2º
						//y 2º va a 3º
						result3 = result2;
						result2 = suma;
					}else if(suma>result3 && suma<result2) {
						//si no, va directamente a 3º
						result3 = suma;
					}
					suma = 0;
				}
				
			}//for
			System.out.println(result1+","+result2+","+result3);
			//return result;
		}//top_3

	public static void juego() {
		//char [] jugadasJ1 = {'A','B','C'};
		//char [] jugadasJ2 = {'Y','X','Z'};
		int puntuacionJ1 = 0;
		int puntuacionJ2 = 0;
		final char A='A';
		final char B='B';
		final char C='C';
		final char X='X';
		final char Y='Y';
		final char Z='Z';
		char [][] jugadas = {
			{A, X},
			{A, X},
			{A, Z},
			{B, X},
			{A, X},
			{B, Z},
			{A, X},
			{A, X},
			{A, X},
			{A, X},
			{C, Z},
			{C, Y},
			{A, X},
			{A, X},
			{A, Z},
			{C, Y},
			{A, Z},
			{B, Y},
			{C, Z},
			{A, X},
			{B, Y},
			{C, X},
			{C, Z},
			{C, Y},
			{A, Y},
			{B, X},
			{B, X},
			{A, X},
			{B, X},
			{A, X},
			{C, X},
			{B, Z},
			{C, Y},
			{A, X},
			{A, X},
			{C, Z},
			{A, Z},
			{A, X},
			{B, X},
			{B, X},
			{A, X},
			{B, X},
			{B, Y},
			{A, X},
			{A, X},
			{A, Z},
			{A, Y},
			{C, Y},
			{A, Z},
			{C, Z},
			{C, Y},
			{A, Z},
			{A, X},
			{B, Z},
			{A, X},
			{C, Y},
			{B, Z},
			{C, Y},
			{A, X},
			{A, Y},
			{C, Y},
			{A, Z}
		};
		char [] jugadasJ1 = new char [jugadas.length];
		char [] jugadasJ2 = new char [jugadas.length];
		for(int i=0;i<jugadasJ1.length;i++) {
			for (int j=0;j<jugadas.length;j++) {
				jugadasJ1[i] = jugadas[i][0];
				jugadasJ2[i] = jugadas[i][1];
			}
		}
		
		//System.out.print(jugadasJ1[0]);
		
		for(int i=0;i<jugadasJ1.length;i++){
			//JUGADOR 1
			if(jugadasJ1[i]=='A') {
				//piedra
				puntuacionJ1 += 1;
			}else if(jugadasJ1[i]=='B') {
				//papel
				puntuacionJ1 += 2;
			}else {
				//tijera
				puntuacionJ1 += 3;
			}
			//JUGADOR 2
			if(jugadasJ2[i]=='X') {
				//piedra
				puntuacionJ2 += 1;
			}else if(jugadasJ2[i]=='Y') {
				//papel
				puntuacionJ2 += 2;
			}else {
				//tijera
				puntuacionJ2 += 3;
			}
			//COMPARACIÓN TIRADAS
			if(jugadasJ1[i]=='B' && jugadasJ2[i]=='X' || jugadasJ1[i]=='C' && jugadasJ2[i]=='Y' || jugadasJ1[i]=='A' && jugadasJ2[i]=='Z') {//papel-piedra
				puntuacionJ1 += 6;
				puntuacionJ2 += 0;
			}/*else if(jugadasJ1[i]=='A' && jugadasJ2[i]=='Y') {//piedra-papel
				puntuacionJ1 += 0;
				puntuacionJ2 += 6;
			}else if(jugadasJ1[i]=='C' && jugadasJ2[i]=='Y') {//tijera-papel
				puntuacionJ1 += 6;
				puntuacionJ2 += 0;
			}else if(jugadasJ1[i]=='A' && jugadasJ2[i]=='Z') {//papel-tijera
				puntuacionJ1 += 0;
				puntuacionJ2 += 6;
			}else if(jugadasJ1[i]=='A' && jugadasJ2[i]=='Z') {//piedra-tijera
				puntuacionJ1 += 6;
				puntuacionJ2 += 0;
			}else if(jugadasJ1[i]=='C' && jugadasJ2[i]=='X') {//tijera-piedra
				puntuacionJ1 += 0;
				puntuacionJ2 += 6;
			}*/
			else if(jugadasJ1[i]=='A' && jugadasJ2[i]=='X' || jugadasJ1[i]=='B' && jugadasJ2[i]=='Y' || jugadasJ1[i]=='C' && jugadasJ2[i]=='Z') {
				puntuacionJ1 += 3;
				puntuacionJ2 += 3;
			}else{
				puntuacionJ1 += 0;
				puntuacionJ2 += 6;
			}
		}//fin tiradas
		//System.out.println(puntuacionJ1);
		//System.out.println(puntuacionJ2);
		if(puntuacionJ1>puntuacionJ2) {
			System.out.println("Gana Jugador 1 con: "+puntuacionJ1+" puntos");
		}else if(puntuacionJ1<puntuacionJ2) {
			System.out.println("Gana Jugador 2 con: "+puntuacionJ2+" puntos");
		}else {
			System.out.println("Empate con: "+puntuacionJ2+" puntos");
		}
	}
	
	public static void juego2() {
		char [][] jugadas = {{'A','Y'},{'B','X'},{'C','Z'}};
		int jugadores = 2;
		int puntuacionJ1 = 0;
		int puntuacionJ2 = 0;
		//public static final char A='A';
		/*public static final char B='B';
		public static final char C='C';
		char [][] jugadas = {
			{A, X},
			{A, X},
			{A, Z},
			{B, X},
			{A, X},
			{B, Z},
			{A, X},
			{A, X},
			{A, X},
			{A, X},
			{C, Z},
			{C, Y},
			{A, X},
			{A, X},
			{A, Z},
			{C, Y},
			{A, Z},
			{B, Y},
			{C, Z},
			{A, X},
			{B, Y},
			{C, X},
			{C, Z},
			{C, Y},
			{A, Y},
			{B, X},
			{B, X},
			{A, X},
			{B, X},
			{A, X},
			{C, X},
			{B, Z},
			{C, Y},
			{A, X},
			{A, X},
			{C, Z},
			{A, Z},
			{A, X},
			{B, X},
			{B, X},
			{A, X},
			{B, X},
			{B, Y},
			{A, X},
			{A, X},
			{A, Z},
			{A, Y},
			{C, Y},
			{A, Z},
			{C, Z},
			{C, Y},
			{A, Z},
			{A, X},
			{B, Z},
			{A, X},
			{C, Y},
			{B, Z},
			{C, Y},
			{A, X},
			{A, Y},
			{C, Y},
			{A, Z}
		};*/

		
		for(int i=0;i<jugadas.length;i++){//filas
			for(int j=0;j<jugadores;j++) {//columnas
				//JUGADOR 1
				if(jugadas[i][0]=='A') {
					//piedra
					puntuacionJ1 += 1;
				}else if(jugadas[i][0]=='B') {
					//papel
					puntuacionJ1 += 2;
				}else if(jugadas[i][0]=='C') {
					//tijera
					puntuacionJ1 += 3;
				}
				//JUGADOR 2
				if(jugadas[i][1]=='X') {
					//piedra
					puntuacionJ2 += 1;
				}else if(jugadas[i][1]=='Y') {
					//papel
					puntuacionJ2 += 2;
				}else if(jugadas[i][1]=='Z') {
					//tijera
					puntuacionJ2 += 3;
				}
			
			
				//COMPARACIÓN TIRADAS
				if(jugadas[i][0]=='B' && jugadas[i][1]=='X' || jugadas[i][0]=='C' && jugadas[i][1]=='Y' || jugadas[i][0]=='A' && jugadas[i][1]=='Z') {//papel-piedra
					puntuacionJ1 += 6;
					puntuacionJ2 += 0;
				}/*else if(jugadasJ1[i]=='A' && jugadasJ2[i]=='Y') {//piedra-papel
					puntuacionJ1 += 0;
					puntuacionJ2 += 6;
				}else if(jugadasJ1[i]=='C' && jugadasJ2[i]=='Y') {//tijera-papel
					puntuacionJ1 += 6;
					puntuacionJ2 += 0;
				}else if(jugadasJ1[i]=='A' && jugadasJ2[i]=='Z') {//papel-tijera
					puntuacionJ1 += 0;
					puntuacionJ2 += 6;
				}else if(jugadasJ1[i]=='A' && jugadasJ2[i]=='Z') {//piedra-tijera
					puntuacionJ1 += 6;
					puntuacionJ2 += 0;
				}else if(jugadasJ1[i]=='C' && jugadasJ2[i]=='X') {//tijera-piedra
					puntuacionJ1 += 0;
					puntuacionJ2 += 6;
				}*/
				else if(jugadas[i][0]=='A' && jugadas[i][1]=='X' || jugadas[i][0]=='B' && jugadas[i][1]=='Y' || jugadas[i][0]=='C' && jugadas[i][1]=='Z') {
					puntuacionJ1 += 3;
					puntuacionJ2 += 3;
				}else{
					puntuacionJ1 += 0;
					puntuacionJ2 += 6;
				}
			}//for j
		}//for i
		System.out.println(puntuacionJ1);
		System.out.println(puntuacionJ2);
		if(puntuacionJ1>puntuacionJ2) {
			System.out.println("Gana Jugador 1 con: "+puntuacionJ1+" puntos");
		}else if(puntuacionJ1<puntuacionJ2) {
			System.out.println("Gana Jugador 2 con: "+puntuacionJ2+" puntos");
		}else {
			System.out.println("Empate con: "+puntuacionJ2+" puntos");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(calcula_maximo(datos));
		//top_3(datos);
		juego();
		//juego2();
	}//main

}//MainApp
