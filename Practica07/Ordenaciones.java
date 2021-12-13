import java.util.Random;
/**
 *Programa para probar las ordenaciones con quicksort y bubblesort
 *@author Mario Rosales
 *@version 1.0
 */
public class Ordenaciones{
    /**
     *Metodo principal
     *@param args El tamaño del arreglo a ordenar
     */
    public static void main(String[] args){

	//Se crea el objeto Random
	Random r = new Random();

	//Se declaran dos arreglo de enteros
	int[] arr1;
	int[] arr2;
	
	//Si hay un argumento se inicializan los  arreglos con el tamaño que indique el argumento
	if(args.length > 0){
	    arr1 = new int[Integer.parseInt(args[0])];
	    arr2 = new int[Integer.parseInt(args[0])];
	}
	//Si no, se inicializa con tamaño 10
	else{
	    arr1 = new int[10];
	    arr2 = new int[10];
	}

	for(int i=0; i < arr1.length; i++){
	    //Se asigna un valor aleatorio a cada elemento de un arreglo
	    arr1[i] = r.nextInt(10000000);
	    //Se asigna el mismo valor al otro arreglo
	    arr2[i] = arr1[i];
	}


	//Ordeno el arreglo con quicksort
	System.out.println("Quicksort:");
	quicksort(arr1, 0, arr1.length -1);
	//Imprimo el arreglo ordenado
	for(int i=0; i < arr1.length; i++){
	    System.out.print(arr1[i] + ", ");
	}
	System.out.println("\n");

	//Ordeno el arreglo con bubblesort
	System.out.println("Bubblesort:");
	bubblesort(arr2);
	//Imprimo el arreglo ordenado
	for(int i=0; i < arr2.length; i++){
	    System.out.print(arr2[i] + ", ");
	}
	System.out.println();
    }

    /**Metodo que ordena un arreglo con bubblesort
     *@param arreglo El arreglo a ordenar
     */
    public static void bubblesort(int[] arreglo){

	//Bucle que recorre todo el arreglo hacia atras
	for(int i = arreglo.length - 1; i > 0; i--){
	    
	    //Bucle que recorre el arreglo hasta antes de llegar a los últimos elementos que ya fueron acomodados
	    for(int j=0; j < i; j++){
		//Si el elemento actual es mayor que el siguiente, se intercambian
		if(arreglo[j] > arreglo[j+1]){
		    cambiar(arreglo, j, j+1);
		}
	    }
	}
    }

    /**Metodo que ordena un arreglo con quicksort
     *@param arreglo El arreglo a ordenar
     *@param inicio El inicio del subarreglo que se va a ordenar
     *@param fin El final del subarreglo que se va a ordenar
     */
    public static void quicksort(int[] arreglo, int inicio, int fin){
	//Si inicio es mayor o igual que fin, se detiene la función
	if(inicio >= fin){
	    return;
	}

	
	//Se elige un pivote
	int pivote = (inicio + fin) / 2;
	//Se crean las variables izquierda y derecha
	int izquierda = inicio;
	int derecha = fin;


	//Repetir mientras izquierda sea menor que derecha
	while(izquierda < derecha){
	    //Intercambia el elemento de la izquierda con el de la derecha
	    cambiar(arreglo, izquierda, derecha);
	    
	    
	    //Bucle que recorre la variable izquierda por el arreglo
	    for(; izquierda < fin; izquierda++){
		//Si se encuentra un elemento mayor que el pivote, se rompe el bucle
		if(arreglo[izquierda] > arreglo[pivote]){
		    break;
		}
	    }
	    
	    //Bucle que recorre hacia atrás la variable derecha por el arreglo
	    for(; derecha > inicio; derecha--){
		//Si se encuentra un elemento menor que el pivote, se rompe el bucle
		if(arreglo[derecha] < arreglo[pivote]){
		    break;
		}
	    }
	}
	//Si izquierda sigue estando a la izquierda del pivote, se intercambia estos dos elementos
	if(izquierda < pivote){
	    cambiar(arreglo, izquierda, pivote);
	    //La posicion del pivote se cambia a la posicion de izquierda
	    pivote = izquierda;
	}else{
	    //Si derecha sigue estando a la derecha del pivote, se intercambian estos dos elementos
	    if(derecha > pivote){
		cambiar(arreglo, derecha, pivote);
		//La posicion del pivote se cambia a la posicion de derecha
		pivote = derecha;
	    }
	}

	//Se aplica la recursion con los subarreglos a la izquierda del pivote y a la derecha del pivote
	quicksort(arreglo, inicio, pivote -1);
	quicksort(arreglo, pivote + 1, fin);
    }

    /**Metodo para intercambiar dos elementos de un arreglo
     *@param arreglo El arreglo en el que se va a realizar el intercambio
     *@param p1 La posicion en el arreglo de uno de los elementos que se van a intercambiar
     *@param p2 La posicion en el arreglo del otro elemento que se va a intercambiar
     */
    public static void cambiar(int[] arreglo, int p1, int p2){
	int temp = arreglo[p1];
	arreglo[p1] = arreglo[p2];
	arreglo[p2] = temp;
    }
}
