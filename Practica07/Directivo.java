/**
 *Clase hija de Empleado que simula un directivo de una empresa
 *@author Mario Rosasles
 *@version 1.0
 */
public class Directivo extends Empleado{

    /**
     *Metodo constructor que recibe el nombre del directivo
     @param nombre El nombre del empleado
    */
    public Directivo(String nombre){
	super(nombre);
    }


    /**
     *Metodo que devuelve los datos del directivo en un String
     *@return Un String con la palabra "Directivo" seguido del nombre del directivo
     */
    @Override
    public String toString(){
	return "Directivo: " + getNombre();
    }
}
