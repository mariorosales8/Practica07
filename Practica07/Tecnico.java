/**
 *Clase hija de Operador que simula un tecnico de una empresa
 *@author Mario Rosasles
 *@version 1.0
 */
public class Tecnico extends Operador{

    /**
     *Metodo constructor que recibe el nombre del tecnico
     @param nombre El nombre del tecnico
    */
    public Tecnico(String nombre){
	super(nombre);
    }


    /**
     *Metodo que devuelve los datos del tecnico en un String
     *@return Un String con la palabra "Tecnico" seguido del nombre del tecnico
     */
    @Override
    public String toString(){
	return "Tecnico: " + getNombre();
    }


    /**
     *Metodo para ver si el tecnico esta trabajando
     *@return El String "Estoy trabajando"
     */
    public String trabaja(){
	return "Estoy trabajando";
    }
}
