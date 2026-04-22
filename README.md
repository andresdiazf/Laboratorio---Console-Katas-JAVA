 Grupo 13: Enith Gicela Vargas Vargas, Daniel Felipe Avila Cordoba, y Andres Diaz Figueroa

Ejecicio 1:

¿Por qué usas double para el precio y no int? ¿Qué pasaría si declaras el precio como int y le
asignas 3.50?

respuesta: Usamos double para el precio porque el precio puede tener decimales como 10.50. Si declaramos el precio como int y le asignamos 10.50, el valor se truncaría a 10, perdiendo la parte decimal y dando un resultado incorrecto. daria error - java: incompatible types: possible lossy conversion from double to int


Ejercicio 2:
¿Qué operador usaste para determinar si aplica el descuento? ¿Qué tipo de dato devuelve ese perador?

Rta: Se usa el operador de mayor que (>), para poder determinar si el valor del subtotal es mayor a 30000. Este operador analiza la condición y devuelve un tipo de dato booleano, true en caso de que si se cumpla la condición o false en caso de que no.


Ejercicio 3:

Rta: El switch es una herramienta que prefiero usar cuando debo realizar un menú de opciones y tengo que relacionar cada opción con una accion. Se podría decir que una cadena de if.else funcionaria igual de bien, pero se ve mas amigable visualmente un código de switch. En este ejercicio el switch no podría ser la mejor opción para casos como el del iva de los postres y la comida que es igual, se podría decir uno de los casos es innecesario.

Ejercicio 4:

Si la condición del while nunca se vuelve falsa el ciclo se repetirá infinidad de veces, o hasta que la ram del pc se agote. En este caso para evitar que el ciclo se repita infinitamente se debe actualizar la variable inventario por cada ciclo para que esta disminuya su valor.

Ejercicio5:

¿Por qué do-while es más apropiado que while aquí? 
do-while es más apropiado porque el cajero debe ingresar el monto de apertura al menos una vez.
Con while, si la condición es falsa desde el principio, el bloque nunca se ejecutaría.

Describe con tus palabras la diferencia en el orden de ejecución.
El bucle while evalúa la condición primero y solo ejecuta el bloque si la condición es verdadera, 
por lo que puede ejecutarse cero veces. En cambio, el bucle do-while ejecuta el bloque primero y 
luego evalúa la condición, garantizando que el bloque se ejecute al menos una vez. 
En el ejercicio de apertura de caja, necesitamos que el cajero ingrese el monto necesariamente, por lo que do-while es más apropiado ya que asegura una ejecución inicial antes de validar.



Ejercicio 6:
¿Por qué usas for aquí y no while? ¿Qué tiene el for que lo hace más conveniente cuando conoces el número de elementos?

Usamos el bucle for porque es el que controlo por medio de un contador (i++) que se incrementa en cada iteración, lo que es ideal cuando conocemos el número de elementos a procesar en este caso el largo del array (productos.length) que es 5. El for nos permite inicializar, evaluar y actualizar el contador en una sola línea, lo que hace que el código sea más claro y fácil de leer. En cambio, el while es más adecuado para situaciones donde no sabemos cuántas veces se repetirá el bloque de código, ya que se basa en una condición que se evalúa antes de cada iteración.

Ejercicio 7:

¿Cuántos errores encontraste? Clasifica cada uno: ¿es un error de compilación o un error
lógico? ¿Cómo los distingues?
