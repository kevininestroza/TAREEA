/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea5;

/**
 *
 * @author yadira
 */
public class ejercicio {
	  //Bueno esta tarea 5 me costo un poco junto cn mi compañero kevin ya que cuando corriamos el programa no nos tiraba nada solo 
	  //unas letras en blanco haci que decidimos agregar una lineas de codigo para que ala hora de ejecutarlo nos pudiera mostrar 
	  //los mensajes de cada uno de los incisos de la tarea.
         //soy kevin con esto obtenemos la posicion de la fila y la columna
    	//Devuelve el valor de mi_arreglo en la posicion [columna][fila]
	static String obtenerValor(String mi_arreglo[][], int columna, int fila)
	{
           
	System.out.print(mi_arreglo[fila][columna]);
		return 
                        mi_arreglo[columna][fila];
                
	}
	// soy kevin declaramos la variable columna luego creamos un ciclo para la cantidad de columnas y nos retornara la cantidad
	//Devuelve la cantidad de columnas de mi_arreglo
	static int obtenerCantidadColumnas(double mi_arreglo[][])
	{
		 int columnas=0;
            for(int i=0;i<mi_arreglo.length;i++){
            for(columnas=0;columnas<mi_arreglo[i].length;columnas++)
            {
            }
            }
            System.out.print("el numero de columnas es:"+columnas);
		return -1;
	}
	//soy kevin hacemos lo mismo que en lo anterior declaramos la variable fila y creamos un ciclo para que nos devuelva la cantidad
	//Devuelve la cantidad de filas de mi_arreglo
	static int obtenerCantidadFilas(double mi_arreglo[][])
	{
		int filas;
            for(filas=0;filas<mi_arreglo.length;filas++){
            }
            System.out.print("el numero de filas es:"+filas);
		return -1;
	}
	// soy kevin con esto declaramos la variables filas y columnas hacemos los ciclos ponemos para obtener la cantidad de filas y columnas
	//Devuelve la cantidad de elementos que puede alacenar mi_arreglo
	static int obtenerCantidadElementos(double mi_arreglo[][])
	{
		int fila = 0;
             int columna;
            for(columna=0;columna<mi_arreglo.length;columna++)
            {
            for(fila=0;fila<mi_arreglo[columna].length;fila++)
            {
            }
            }
            int total=fila*columna;
            System.out.print("la cantidad de elementos almacenados es:" +total);
		return -1;
        }
      
	
	//Devuelve la sua de todos los elementos de mi_arreglo
	static double sumaElementos(double mi_arreglo[][])
	{
              int fila = 0;
             int columna;
                  double sumelemt=0;
            for(columna=0;columna<mi_arreglo.length;columna++){
            for(fila=0;fila<mi_arreglo[columna].length;fila++){
            sumelemt=sumelemt+mi_arreglo[columna][fila];
            }
            }
             System.out.print("suma es:"+sumelemt);
		return -1;
	}
	//soy kevin  en este ejercicion usamos el int declaramos variable luego con los ciclos for obtendremos el promedio de los elementos
	//Devuelve el promedio de todos los elementos de mi_arreglo
	static double promedioElementos(double mi_arreglo[][])
	{
             int fila= 0;
             int columna;
                  double suma=0;
                  int contador=0;
            for(columna=0;columna<mi_arreglo.length;columna++){
            for(fila=0;fila<mi_arreglo[columna].length;fila++){
            suma=suma+mi_arreglo[columna][fila];contador++;
            }
            }
             System.out.print("el promedio es:"+suma/contador);
		return -1;
	}
	//soy kevin en este hacemos los ciclos con los arreglos luego ponemos una condicion si existe el arreglo si existe o no nos devolvera true o false
	//Devuelve verdadero si num esta en mi_arreglo, de lo contrario devuelve false
	static boolean existe(double mi_arreglo[][], int num)
	{
		for(int i = 0; i < mi_arreglo.length; i++)
		{
			for(int j = 0; j < mi_arreglo[i].length; j++)
			{
				if(mi_arreglo[i][j] == num)
				{
			           return true;
				  }
                                else
                                    return false;
			}
				}
            return false;
                                    
                                    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                    double matriz[][] = {{5,4,2},{4,3,2},{4,3,2}}; 
             String matriz2[][] = {{"1","3","6"},{"1","3","6"},{"1","3","6"}}; 
            obtenerValor(matriz2,0,1);
            System.out.println();
            obtenerCantidadFilas(matriz);
              System.out.println();
            obtenerCantidadElementos(matriz);
             System.out.println();
          sumaElementos(matriz);
            System.out.println();
            promedioElementos(matriz);
             System.out.println();
             
             if(existe(matriz,47)==true)
             {
             System.out.print("el elemento buscado si se encontro");
             
             }
             else if(existe(matriz,4)==false)
             {
             System.out.print("el elemento buscado no se encontro");
             }
            
	}

}
//soy kevin trabaje con digna en esta tarea 5
