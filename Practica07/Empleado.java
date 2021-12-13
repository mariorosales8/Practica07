/**
 *Clase que simula un empleado de una empresa
 *@author Mario Rosales
 *@version 1.0
 */
public class Empleado{
    private String nombre;


    /**
     *Metodo constructor sin parametros
     */
    public Empleado(){
	nombre = "Sin nombre";
    }
    /**
     *Metodo constructor que recibe el nombre del empleado
     *@param nombre El nombre del empleado
     */
    public Empleado(String nombre){
	this.nombre = nombre;
    }


    /**
     *Metodo que devuelve el nombre del empleado
     *@return El nombre del empleado
     */
    public String getNombre(){
	return nombre;
    }
    /**
     *Metodo que modifica el nombre del empleado
     *@param nombre El nombre del empleado
     */
    public void setNombre(String nombre){
	this.nombre = nombre;
    }


    /**
     *Metodo que devuelve los datos del empleado en un String
     *@return Un String con la palabra "Empleado" seguido del nombre del empleado
     */
    public String toString(){
	return "Empleado: " + nombre;
    }

    
    /**
     *Metodo que compara si dos empleados son el mismo
     *@param otro El empleado con el que se va a comparar
     *@return true si son iguales, false si son diferentes
     */
    public boolean equals(Empleado otro){
	if(this.nombre.equals(otro.nombre)){
	    return true;
	}else{
	    return false;
	}
    }
}
