# Analisis de Complejidad de Algoritmos

Instituto Tecnológico de Costa Rica.<br/>
I Proyecto de Analisis de Algoritmos, primer semestre, 2022.<br/>
- Samantha Acuña Montero.
- Fernanda Sanabria Solano
- Raquel Arguedas Sánchez.
## Analisis del problema
Este proyecto pretende poner a prueba dos algoritmos con distintas estrategias en la solución del problema, el cual es, encontrar números positivos y negativos en un arreglo y que sumen cero. Se probará un algoritmo con la estrategia de fuerza bruta, que consiste en realizar todas las combinaciones posibles hasta encontrar la solución, verificando y efectuando todos los subconjuntos que realicen dicha suma. Por otro lado, está el algoritmo con la estrategia programación dinámica, la cual evita repetir la ejecución de los posibles subconjuntos de un arreglo dado.<br/>

Para poder a prueba los dichos algoritmos, se realizaron arreglos de diferentes tamaños, por ejemplo: 3, 6, 11, 15, 20…, con números negativos y positivos, de manera que se logre saber cuál algoritmo es más eficiente en recursos como en su tiempo de ejecución. También se crea una función con el fin de crear arreglos con diferente tamaño con números aleatorios para probar su funcionalidad.<br/>

Una vez que se realiza la ejecución del problema, se requiere anotar mediciones empíricas como, cantidad de asignaciones, comparaciones, líneas ejecutadas, tiempo de ejecución y cantidad de líneas de código, con el fin de saber cómo la cantidad de elementos en el arreglo puede afectar el rendimiento de los algoritmos, además de así poder analizar si son tratables o intratables.

De igual forma, se calcula el factor de crecimiento y clasificación del algoritmo ya sea: 
- Omega: El mejor de los casos
- Theta: El caso promedio
- O Grande: El peor de los casos, depende de las comparaciones, asignaciones, líneas ejecutadas y el tiempo.<br/>

Finalmente, se realizan mediciones analíticas para cada uno de los algoritmos implementados para la solución del problema planteado para así determinar la clasificación en O grande.
## Solucion del problema
Primeramente, para poder resolver el problema planteado anteriormente se buscó un algoritmo como base que utilizase la estrategia de fuerza bruta que consiste en realizar todas las combinaciones posibles. 

El algoritmo encontrado corresponde al siguiente: 

<p align='center'>
<img src="https://res.cloudinary.com/dgm059qwp/image/upload/v1650046681/Analisis%20de%20Algoritmos%20/code-snapshot_hvy5zt.png" width="700"
</p>
  
<br/>El algoritmo encontrado imprimía todos los posibles subconjuntos que sumarán 0 por lo que se cambió a que al encontrar un subconjunto cuya suma sea igual a 0 terminará el algoritmo. Esta adaptación conllevo a varios cambios más que nos permitieran devolver el subconjunto encontrado desde el algoritmo envés de imprimirlo dentro de él y de esta forma hacer que el algoritmo terminase al encontrar el primer subconjunto.<br/>
El diagrama de clases del algoritmo finalizado con los cambios y utilizado para la toma de datos y análisis posteriores corresponde al siguiente:
  
<p align='center'>
<img src="https://res.cloudinary.com/dgm059qwp/image/upload/v1650045540/Analisis%20de%20Algoritmos%20/Imagen2_aur757.png" width="400"
</p>
 
Después de esto se empezó a buscar otro algoritmo como base para la solución del problema pero que utilizará la estrategia de programación dinámica, la cual se basa en no repetir la ejecución de subconjuntos repetidos dentro del arreglo.
El algoritmo encontrado corresponde al siguiente:

<p align='center'>
<img src="https://res.cloudinary.com/dgm059qwp/image/upload/v1650046898/Analisis%20de%20Algoritmos%20/Dinamico_vua9zu.png" width="700"
</p>
  
Este algoritmo imprimía la cantidad total de algoritmos cuya suma diese 0. Debido a esto, se empezó a analizar el cómo trabajaba el algoritmo para encontrar la manera de devolver los subconjuntos que el algoritmo encontrará. Para esto se corrió el código a mano asegurándose de seguir cada una de las variables con sus datos y así comprender mejor el funcionamiento del algoritmo.<br/>

Para el correcto seguimiento de las variables se utilizó la herramienta de Excel en donde se escribió los datos guardados, las llamadas recursivas y los valores de retorno en las distintas etapas de la ejecución del programa.
  
<p align='center'>
<img src="https://res.cloudinary.com/dgm059qwp/image/upload/v1650046038/Analisis%20de%20Algoritmos%20/Imagen4_paayrn.png" width="550"
</p>
  
Además, para observar la manera en la que el algoritmo recorría el arreglo buscando los subconjuntos, se realizó un diagrama de un árbol binario debido a que el algoritmo utiliza doble recursividad. 
  
<p align='center'>
<img src="https://res.cloudinary.com/dgm059qwp/image/upload/v1650047069/Analisis%20de%20Algoritmos%20/Imagen5_bohvfj.png" width="550"
</p>
  
Cuando se toma el camino izquierdo se le suma al número el siguiente elemento del arreglo, y el camino derecho se queda sin sumar el siguiente elemento.
Los resultados de las sumas están subrayados por los colores según la etapa en la que estén:<br/> 

- Amarillo: No se ha llegado al final del proceso.
- Verde: El resultado de esta suma ya fue vista anteriormente en el proceso.
- Celeste: Se terminó el proceso, pero la suma es distinta a cero.
- Rojo: Se terminó el proceso y la suma es 0.

Las líneas verdes identifican el camino que lleva un subconjunto cuya suma final dé como resultado 0.
Para conseguir el primer subconjunto cuya suma dé 0 del algoritmo añadimos una variable extra que nos permitiera guardar los elementos que no llevaron a este subconjunto. Estos elementos eran guardados cuando se llegaba al final del proceso de un camino, la suma daba 0 y era la primera vez que se llegaba a 0; desde ahí se empiezan a devolver en el algoritmo debido a que se utiliza recursión y se van guardando los datos en la variable comentada anteriormente.
  
El algoritmo base contemplaba todos los posibles subconjuntos cuya suma daba 0, debido a esto se almacenaban varios datos que no necesitamos para la solución de nuestro problema. Por esto, se eliminaron varias variables y partes del código que se encargaban de seguir todos los caminos que podían dar 0.

El diagrama de clases del algoritmo finalizado con los cambios y utilizado para la toma de datos y análisis posteriores corresponde al siguiente:
  
<p align='center'>
<img src="https://res.cloudinary.com/dgm059qwp/image/upload/v1650047422/Analisis%20de%20Algoritmos%20/Imagen6_ovyniq.png" width="400"
</p>
  
