# Proyecto: Árbol Binario en Java - IU Diial

## ¿Qué es un Árbol Binario?

Un árbol binario es una estructura de datos que permite organizar información de manera jerárquica. La idea es imaginar un árbol al revés: En la parte superior está la raíz, que es el primer nodo, y de ahí pueden salir como máximo dos ramas, una hacia la izquierda y otra hacia la derecha. Cada nodo puede tener a su vez otros dos hijos, y así sucesivamente.

Lo importante es que en un árbol binario cada nodo tiene como máximo dos hijos. Esto lo hace más simple que otras estructuras 

Los valores menores que el nodo actual se colocan en la rama izquierda.
Los valores mayores se colocan en la rama derecha.

Gracias a esta regla, el árbol se convierte en una especie de “organizador” de datos.

## Implementación

Clase Nodo  
Lo primero fue crear la clase Nodo. Cada nodo guarda un número y tiene dos referencias: una al hijo izquierdo y otra al hijo derecho. Esto representa la estructura básica del árbol binario.

Clase ArbolBinario  
En esta clase se implementaron los métodos principales:

Insertar: compara el número con el nodo actual. Si es menor va a la izquierda, si es mayor va a la derecha. Si el espacio está vacío, se crea un nuevo nodo.

Recorrido inorden: recorre primero el hijo izquierdo, luego el nodo y finalmente el hijo derecho. Esto garantiza que los números se impriman en orden ascendente.

Buscar: compara el número con el nodo actual. Si es igual, lo encontró; si es menor busca en la izquierda; si es mayor busca en la derecha. Si llega a un nodo vacío, significa que no existe.

Clase Main con menú  
Para que el usuario pueda interactuar, se creó un menú en consola con opciones para insertar varios números seguidos, mostrar el recorrido inorden y buscar un número. 

## Ejemplo de ejecución en consola



## Integrantes del Equipo

-Ayleen Saadrid Orjuela Murillo
