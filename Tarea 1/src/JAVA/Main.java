package JAVA;

public class Main {
  public static int masPequeño(int[] a, int total) {
    int temp;
    for (int i = 0; i < total; i++) {
      for (int j = i + 1; j < total; j++) {
        if (a[i] > a[j]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
    return a[0];
  }

  public static void main(String args[]) {
    int a[] = { 8, 5, 5, 2, 1 };
    int b[] = { 8, 5, 5, 2, 1 };
    System.out.println("Salida: " + masPequeño(a, 4));
    System.out.println("Salida: " + masPequeño(b, 0));

  }
}