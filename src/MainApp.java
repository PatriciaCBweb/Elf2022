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
				}else if(datos[i]==-1 || datos[i]==datos[datos.length-1]) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(calcula_maximo(datos));
		top_3(datos);
	}//main

}//MainApp
