/**
 *Clase hija de Operador que simula un oficial de una empresa
 *@author Mario Rosasles
 *@version 1.0
 */
public class Oficial extends Operador{

    /**
     *Metodo constructor que recibe el nombre del oficial
     @param nombre El nombre del oficial
    */
    public Oficial(String nombre){
	super(nombre);
    }


    /**
     *Metodo que devuelve los datos del oficial en un String
     *@return Un String con la palabra "Oficial" seguido del nombre del oficial
     */
    @Override
    public String toString(){
	return "Oficial: " + getNombre();
    }


    /**
     *Metodo para ver si el oficial esta trabajando
     *@return El String "Estoy trabajando"
     */
    public String trabaja(){
	return "Estoy trabajando";
    }
}
