# Analisis de Complejidad de Algoritmos

Instituto Tecnológico de Costa Rica.<br/>
I Proyecto de Analisis de Algoritmos, primer semestre, 2022.<br/>
- Samantha Acuña Montero.
- Fernanda Sanabria Solano
- Raquel Arguedas Sánchez.

## 🔍 Análisis del Problema

Este proyecto tiene como objetivo **comparar dos algoritmos** con distintas estrategias para resolver el siguiente problema: **encontrar un subconjunto de números (positivos y negativos) dentro de un arreglo que sumen exactamente cero**.

Se probarán dos enfoques:

* **Fuerza bruta**: evalúa **todas las combinaciones posibles** del arreglo hasta encontrar un subconjunto cuya suma sea cero.
* **Programación dinámica**: evita recalcular subconjuntos repetidos, haciendo uso de **memoización** o **almacenamiento intermedio** para mejorar la eficiencia.

Para evaluar ambos algoritmos, se generan arreglos de diferentes tamaños (por ejemplo: 3, 6, 11, 15, 20...) con números aleatorios tanto positivos como negativos. Esto permite observar cuál estrategia es más eficiente en cuanto a **recursos computacionales** y **tiempo de ejecución**.

También se recopilan métricas como:

* Número de asignaciones.
* Número de comparaciones.
* Cantidad de líneas ejecutadas.
* Tiempo de ejecución.
* Cantidad de líneas de código.

Estas métricas permiten analizar la **complejidad algorítmica** y determinar si el problema es tratable o intratable según el tamaño de entrada.

Además, se calcula el **factor de crecimiento** y se clasifica el rendimiento de cada algoritmo utilizando notaciones asintóticas:

* **Ω (Omega):** Mejor de los casos.
* **Θ (Theta):** Caso promedio.
* **O (O grande):** Peor de los casos, con base en las comparaciones, asignaciones, líneas y tiempo ejecutado.

Finalmente, se realiza una **evaluación analítica** y empírica para clasificar cada algoritmo según su complejidad computacional.

---

## 🧠 Solución del Problema

### 🔹 Estrategia de Fuerza Bruta

Se partió de un algoritmo base que imprimía todos los subconjuntos cuya suma era cero. Se realizaron varias adaptaciones para:

* Terminar la ejecución tan pronto se encuentra el **primer subconjunto** válido.
* Devolver dicho subconjunto como resultado, en lugar de solo imprimirlo.
* Mejorar la estructura y legibilidad del código para facilitar la toma de métricas.

📊 **Diagrama de clases del algoritmo adaptado:**

<p align='center'>
  <img src="https://res.cloudinary.com/dgm059qwp/image/upload/v1650045540/Analisis%20de%20Algoritmos%20/Imagen2_aur757.png" width="400">
</p>

### 🔹 Estrategia de Programación Dinámica

Se utilizó un segundo algoritmo base que contaba **todas las combinaciones** que sumaban cero. Sin embargo, para ajustarlo al objetivo del proyecto (encontrar el **primer subconjunto válido**), fue necesario:

* Analizar el algoritmo en detalle (paso a paso y de forma manual).
* Rastrear las variables, llamadas recursivas y retornos de función usando **Excel**.

📊 **Seguimiento manual de variables:**

<p align='center'>
  <img src="https://res.cloudinary.com/dgm059qwp/image/upload/v1650046038/Analisis%20de%20Algoritmos%20/Imagen4_paayrn.png" width="550">
</p>

Para comprender visualmente cómo el algoritmo explora los subconjuntos, se construyó un **diagrama de árbol binario**, ya que el algoritmo usa recursión doble:

📈 **Diagrama de recorrido del árbol de decisiones:**

<p align='center'>
  <img src="https://res.cloudinary.com/dgm059qwp/image/upload/v1650047069/Analisis%20de%20Algoritmos%20/Imagen5_bohvfj.png" width="550">
</p>

🎨 **Leyenda de colores del árbol:**

* 🟡 Amarillo: Camino en ejecución.
* 🟢 Verde: Resultado ya procesado previamente.
* 🔵 Celeste: Camino terminado, pero suma distinta de cero.
* 🔴 Rojo: Camino válido cuya suma es cero (solución encontrada).

🛠️ Para encontrar y devolver ese primer subconjunto válido:

* Se agregó una variable auxiliar que almacena los elementos involucrados.
* Se adaptó el flujo del algoritmo para que, al llegar a un subconjunto válido, **detenga la ejecución** y devuelva ese conjunto.
* Se eliminaron variables y partes innecesarias del algoritmo original que procesaban subconjuntos múltiples.

📊 **Diagrama de clases del algoritmo final optimizado:**

<p align='center'>
  <img src="https://res.cloudinary.com/dgm059qwp/image/upload/v1650047422/Analisis%20de%20Algoritmos%20/Imagen6_ovyniq.png" width="400">
</p>

