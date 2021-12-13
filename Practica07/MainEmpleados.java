/**
 *Programa para probar la clase Empleado y sus clases hijas
 *@author Mario Rosales
 *@version 1.0
 */
public class MainEmpleados{
    /**
     *Metodo principal
     *@param args Los argumentos
     */
    public static void main(String[] args){
	Empleado a = new Empleado();
	a.setNombre("Juan");

	Operador b = new Operador("Pepe");

	Directivo c = new Directivo("Maria");

	Oficial d = new Oficial("Ana");

	Tecnico e = new Tecnico("Jorge");


	System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "  " + d.trabaja() + "\n" + e + "  " + e.trabaja());
    }
}
