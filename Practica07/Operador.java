/**
 *Clase hija de Empleado que simula un operador de una empresa
 *@author Mario Rosasles
 *@version 1.0
 */
public class Operador extends Empleado{

    /**
     *Metodo constructor que recibe el nombre del operador
     @param nombre El nombre del operador
    */
    public Operador(String nombre){
	super(nombre);
    }


    /**
     *Metodo que devuelve los datos del operador en un String
     *@return Un String con la palabra "Operador" seguido del nombre del operador
     */
    @Override
    public String toString(){
	return "Operador: " + getNombre();
    }
}
