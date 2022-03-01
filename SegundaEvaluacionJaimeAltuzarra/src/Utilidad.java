/**
 * 
 * @author VespertinoJaime
 * @since 01/03/2022
 * @version 1.0
 */
public class Utilidad {
   /**
    * 
    * @param a como parametro de entrada
    * @return devuelve un entero
    */

	public int ejercicioD(int a) {
		return (a==0) ? 0: a+factorial(a);
	}
	/**
	 * 
	 * @param n como parametro de entrada
	 * @return devuelve un entero
	 */
	
	public int factorial(int n) {
		if (n==1) {
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	/**
	 * 
	 * @param a parametro a Raul
	 * @param b parametro b Raul
	 * @return devuelve un boolean
	 */
	
	public boolean refactorizacionD(int a, int b) {
		// Calculo único
		int c = a + b;
		// Calculo único
		int d = c + 34;
		
		//Calculo si d es primo
		boolean esPrimo = true;
		for (int i=2;i<d;i++) {
			if (d%i==0) {
				esPrimo = false;
			}
		}
		
		boolean resultado = !esPrimo;
		return (resultado);
	}
	/**
	 * 
	 * @param numeroUno parametro refactorizado Jaime
	 * @param numeroDos parametro refactorizado Jaime
	 * @return devuelve un boolean el metodo
	 */
	//Renombramos las variables a, b dado que no son muy especificas y pueden confundir.
	//Cambiamos la signatura del metodo para diferenciar el metodo de Raul y el nuestro del examen cambiado.
	private boolean refactorizacionExamen(int numeroUno, int numeroDos) {
		// Calculo único
		// Renombramos c como la suma de a y b.
		int suma = numeroUno + numeroDos;
		// Calculo único
		int d = suma + 34;
		
		//Calculo si d es primo
		boolean esPrimo = true;
		for (int i=2;i<d;i++) {
			if (d%i==0) {
				esPrimo = false;
			}
		}
		boolean resultado = !esPrimo;
		return (resultado);
	}
	
}
