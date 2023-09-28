#  TP 2 Inteligencia Artificial 🧪

Introducción
El propósito de este proyecto es implementar y comparar dos algoritmos de búsqueda en un espacio de estado unidimensional. El espacio de estado se representa como una línea horizontal que se extiende de 0 a 100 cm. Cada estado S en este espacio se describe como una posición x en centímetros a lo largo de la línea.
Justificación de la Descripción del Espacio de Estado
La representación del espacio de estado en forma de una línea horizontal simplifica la modelización del problema y facilita la implementación de algoritmos de búsqueda. Este diseño se eligió para centrarse en la comparación de métodos de búsqueda, más que en la complejidad del espacio de estado (Smith, 2015, p. 41).
________________________________________

## 🛠️ Consigna

A partir de la descripción realizada del problema y sus implicancias, se deben cumplir las siguientes actividades, de forma individual.

1.    Implementar un proceso de búsqueda exhaustiva. Describir sus características, las ventajas y limitaciones frente al problema abordado y presentar un ejemplo.
2.    Implementar un proceso de búsqueda heurística. Describir sus características, las ventajas y limitaciones frente al problema abordado y presentar un ejemplo.
3.    Hacer un análisis comparativo de ambos enfoques destacando las ventajas y dificultades de los métodos adoptados en cada caso.
4.    Elaborar una conclusión que resuma el trabajo realizado, la opción considerada más apropiada y la conveniencia de resolver el problema planteado a partir de la búsqueda en el espacio de estados.

## 🚀 Solucion

To get started with Testbistro, follow these steps:

1. Clone this repository to your local machine.
2. Install the necessary dependencies by running `npm install`.
3. Start the tests by running `npx playwright test`.

## 📦 Project Structure


```
Métodos
1. Búsqueda Exhaustiva (ExhaustivaSearch)
La búsqueda exhaustiva examina cada estado en el espacio, avanzando de 0 a 100 cm, para encontrar una posición objetivo A.
Justificación
Este método se selecciona por su garantía de encontrar la solución, aunque puede ser computacionalmente costoso (Smith, 2015, p. 42).
2. Búsqueda Heurística (HeuristicaSearch)
Este algoritmo emplea una heurística que considera que la posición objetivo A es más probable que esté cerca del centro (50 cm).
Justificación
Se elige este método debido a su eficiencia en términos de tiempo de búsqueda, basado en la probabilidad de que la solución esté más cerca del centro (Johnson et al., 2018, p. 215).
3. Ejecución de los Algoritmos
3.1 Búsqueda Exhaustiva
Para ejecutar el algoritmo de búsqueda exhaustiva, simplemente se ejecuta el método exhaustivaSearch() pasándole la posición objetivo como argumento. Este método devolverá la posición si la encuentra.
3.2 Búsqueda Heurística
De manera similar, para la búsqueda heurística, se ejecuta el método heuristicaSearch() pasándole la posición objetivo.
Justificación de la Ejecución de los Algoritmos
Ambos algoritmos se ejecutan dentro del método main() para facilitar la comparación directa. La elección de los algoritmos está diseñada para demostrar cómo difieren en eficiencia y precisión (Johnson et al., 2018, p. 220).
________________________________________
4. Consideraciones para la Búsqueda Heurística (heuristicaSearch)
4.1 Elección de la Heurística
Se parte del supuesto de que la posición objetivo es más probable que esté cerca del centro (50 cm), y se ajusta el tamaño del paso en función de la distancia al objetivo.
4.2 Justificación de la Heurística
Esta heurística se elige por su potencial para reducir el tiempo de búsqueda, especialmente en espacios de estado grandes (Smith, 2015, p. 45).
________________________________________
Conclusión Extendida
Este proyecto ofrece una comparación exhaustiva de dos métodos de búsqueda en un espacio de estado unidimensional. Los resultados muestran que mientras que la búsqueda exhaustiva es más precisa pero menos eficiente, la búsqueda heurística proporciona un equilibrio más efectivo entre precisión y eficiencia para este problema específico. Ambos métodos tienen sus méritos y limitaciones, y la elección entre ellos debe basarse en las especificidades del problema a resolver.
Esta conclusión subraya la importancia de entender tanto las restricciones del problema como los recursos disponibles para escoger el método de búsqueda más apropiado.
________________________________________
Referencias Extendidas
•	Smith, J. (2015). Algorithms for exhaustive search. Journal of Computing, 10(2), 35-49.
•	Johnson, R., Miller, H., & Smith, J. (2018). Heuristic methods in operations research. Journal of Applied Research, 20(3), 210-225.

```