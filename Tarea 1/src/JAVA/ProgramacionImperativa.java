package JAVA;

/**
 * <h1>Programacion Imperativa!</h1> El programa ProgramacionImperativa
 * implementa 2 metodos de ordenacion y 1 metodo de busqueda en un conjunto de
 * datos
 *
 * @author Victor Hugo Gallegos Mota Y Carlos Cruz Rangel
 * @version 1.0
 * @since 2021-06-11
 */
public class ProgramacionImperativa {

  /**
   * @param arr[]     Mezclamos dos submatrices de arr[].
   * @param izquierda El primer subarreglo es arr[izquierda..centro]
   * @param centro    Centro del arreglo
   * @param derechaEl segundo es arr[centro+1..derecha]
   */

  void merge(int arr[], int izquierda, int centro, int derecha) {
    // Encontramos los tamaños de dos submatrices para fusionar
    int n1 = centro - izquierda + 1;
    int n2 = derecha - centro;

    /* Creamos arreglos temporales */
    int IZQUIERDA[] = new int[n1];
    int DERECHA[] = new int[n2];

    /* Copiamos los datos de los arreglos temporales */
    for (int i = 0; i < n1; ++i)
      IZQUIERDA[i] = arr[izquierda + i];
    for (int j = 0; j < n2; ++j)
      DERECHA[j] = arr[centro + 1 + j];

    /* Mezclamos los arreglos temporales */

    // Índices iniciales del primer y segundo subarreglos
    int i = 0, j = 0;

    // Índice inicial de la matriz de subarreglos combinada
    int k = izquierda;
    while (i < n1 && j < n2) {
      if (IZQUIERDA[i] <= DERECHA[j]) {
        arr[k] = IZQUIERDA[i];
        i++;
      } else {
        arr[k] = DERECHA[j];
        j++;
      }
      k++;
    }

    /* Copiamos los elementos restantes de IZQUIERDA[] si alguno */
    while (i < n1) {
      arr[k] = IZQUIERDA[i];
      i++;
      k++;
    }

    /* Copiamos los elementos restantes de DERECHA[] si alguno */
    while (j < n2) {
      arr[k] = DERECHA[j];
      j++;
      k++;
    }
  }

  /**
   * Funcion Principal para ordenar el arreglo usando mergeSort()
   * 
   * @param arr[]     Arreglo
   * @param izquierda Lado izquierdo del arreglo
   * @param derecha   Lado derecho del arreglo
   */

  void mergeSort(int arr[], int izquierda, int derecha) {
    if (izquierda < derecha) {
      // Encontramos el centro
      int centro = izquierda + (derecha - izquierda) / 2;

      // Ordenamos la primer y segunda mitad
      mergeSort(arr, izquierda, centro);
      mergeSort(arr, centro + 1, derecha);

      // Fusionamos las mitades ordenadas
      merge(arr, izquierda, centro, derecha);
    }
  }

  /**
   * Una función de utilidad para imprimir una matriz de tamaño n
   * 
   * @param arr[] Arreglo
   */
  static void printArrayMerge(int arr[]) {
    for (int i = 0; i < arr.length; ++i) {
      System.out.print(arr[i] + " ");
    }
  }

  /**
   * @param arr[] Arreglo
   */
  public void heapSort(int arr[]) {
    int temp;

    for (int i = arr.length / 2 - 1; i >= 0; i--) // Construimos el Heap
    {
      heapify(arr, arr.length, i);
    }

    for (int i = arr.length - 1; i > 0; i--) // Extraimos elementos del heap
    {
      temp = arr[0]; // mover la raíz actual al final (ya que es la más grande)
      arr[0] = arr[i];
      arr[i] = temp;
      heapify(arr, i, 0); // Mandar a llamar heapify para reconstruir el heap para los elementos
                          // restantes
    }
  }

  /**
   * @param arr[] arreglo
   * @param n     tamaño n de la matriz
   * @param i     indice
   */
  void heapify(int arr[], int n, int i) {
    int MAX = i; // Inicializar más grande como raíz
    int izquierda = 2 * i + 1; // Índice del hijo izquierdo del nodo i-ésimo = 2*i + 1
    int derecha = 2 * i + 2; // Índice del hijo derecho del nodo i-ésimo = 2*i + 2
    int temp;

    if (izquierda < n && arr[izquierda] > arr[MAX]) // Comprobamos si el hijo izquierdo de la raíz es más grande que la
                                                    // raíz
    {
      MAX = izquierda;
    }

    if (derecha < n && arr[derecha] > arr[MAX]) // compruebe si el hijo correcto de la raíz es más grande que la raíz
    {
      MAX = derecha;
    }

    if (MAX != i) { // Repetimos el procedimiento para encontrar el elemento más grande en el heap
      temp = arr[i];
      arr[i] = arr[MAX];
      arr[MAX] = temp;
      heapify(arr, n, MAX);
    }
  }

  /**
   * Una función de utilidad para imprimir una matriz de tamaño x
   * 
   * @param arr[]
   */
  static void printArrayHeap(int arr[]) // printArrayHeap
  {
    for (int i = 0; i < arr.length; ++i) {
      System.out.print(arr[i] + " ");
    }
  }

  /**
   * Implementación Java de búsqueda binaria recursiva
   * 
   * @param arr[]     Arreglo
   * @param izquierda Devuelve el índice de x si está presente en arr[izquierda..
   * @param derecha   derecha]
   * @param x         Indice de x
   * @return int -1
   */

  int binarySearch(int arr[], int izquierda, int derecha, int x) {
    if (derecha >= izquierda) {
      int mitad = izquierda + (derecha - izquierda) / 2;

      // Si el elemento está presente a la mitad de si mismo
      if (arr[mitad] == x)
        return mitad;

      // Si el elemento es más pequeño que mitad, entonces
      // solo puede estar presente en el subarreglo izquierdo
      if (arr[mitad] > x)
        return binarySearch(arr, izquierda, mitad - 1, x);

      // De lo contrario, el elemento solo puede estar presente
      // en el subarreglo derecho
      return binarySearch(arr, mitad + 1, derecha, x);
    }
    // Llegamos aquí cuando el elemento no está presente.
    return -1;
  }

  /**
   * Metodo principal para ejecutar el programa
   * 
   * @param args[] Arreglo para hacer demostracion
   */
  public static void main(String args[]) {
    int arr[] = { 6, 5, 3, 1, 8, 7, 2, 4 };

    System.out.println("Conjunto de datos dado:");
    printArrayMerge(arr);

    ProgramacionImperativa obm = new ProgramacionImperativa();
    obm.mergeSort(arr, 0, arr.length - 1);

    System.out.println("\nConjunto de datos ordenado por MERGESORT:");
    printArrayMerge(arr);

    ProgramacionImperativa obh = new ProgramacionImperativa();
    obh.heapSort(arr);

    System.out.println("\nConjunto de datos ordenado por HEAPSORT:");
    printArrayHeap(arr);
    System.out.println();

    ProgramacionImperativa ob = new ProgramacionImperativa();
    System.out.println("\nBusqueda Binaria de un Elemento sobre el arreglo recien ordenado:");
    printArrayHeap(arr);
    System.out.println();
    int n = arr.length;
    int x = 1;
    int result = ob.binarySearch(arr, 0, n - 1, x);
    if (result == -1)
      System.out.println("Elemento " + x + " no encontrado");
    else
      System.out.println("Elemento " + x + " encontrado en el indice " + result);
  }

}
