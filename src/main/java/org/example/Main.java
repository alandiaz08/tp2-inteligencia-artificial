package org.example;

public class Main {
  public static void main(String[] args) {
    int A = 75; // Posición objetivo en cm

    // Búsqueda exhaustiva
    System.out.println("Búsqueda Exhaustiva: " + exhaustivaSearch(A) + " cm");

    // Búsqueda heurística
    System.out.println("Búsqueda Heurística: " + heuristicaSearch(A) + " cm");
  }

  public static int exhaustivaSearch(int A) {
    for (int x = 0; x <= 100; x++) {
      if (x == A) return x;
    }
    return -1; // No encontrado
  }

  public static int heuristicaSearch(int A) {
    int x = 50; // Posición inicial en cm
    int step = (A > x) ? 5 : -5;

    while (x != A) {
      if (Math.abs(A - x) < 5) step = 1;
      x += step;
      if (x > 100 || x < 0) return -1; // Fuera de límites
    }
    return x;
  }
}
