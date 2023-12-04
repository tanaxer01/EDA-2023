# Repaso para el examen

## Linked List

### 1. Rotate a linked list
Dado el primer elemento de una lista enlazada, rota a la derecha la lista $k$ veces.<br/>
[enunciado](https://leetcode.com/problems/rotate-list)

**Input**<br/>

**Output**<br/>

**Ejemplo**<br/>

### 2. Sort a linked list
Dado el primer elemento de una lista enlazada, ordenela ascendentemente.<br/> 
[enunciado](https://leetcode.com/problems/sort-list)

**Input**<br/>

**Output**<br/>

**Ejemplo**<br/>

## Binary Search Tree

### 3. Flatten a BST
Dada la raiz de una arbol de busqueda binaria, conviertalo en una lista enlazada.<br/>
[enunciado](https://leetcode.com/problems/flatten-binary-tree-to-linked-list)

+ La lista enlazada deberia utilizar la misma clase _TreeNode_ donde el hijo derecho apunta al siguiente elemento y el hijo izquierdo siempre es nulo.
+ La lista enlazada deberia seguir el orden _pre-order traversal_ del arbol binario.

**Input**<br/>

**Output**<br/>

**Ejemplo**<br/>

### 4. Search a 2D Matrix
Si se tiene una matriz $m\ x\ n$ de enteros, que cumple las siguientes propiedades:

+ Cada fila esta ordenada ascendentemente.
+ El primer entero de cada fila es mayor al ultimo entero de la fila anterior.

Dado un numero $target$ responda si $target$ esta en la matriz o no.<br/>
La solución debe tener una complejidad $\mathcal{O}(log(m*n))$<br/>
[enunciado](https://leetcode.com/problems/search-a-2d-matrix)

**Input**<br/>

**Output**<br/>

**Ejemplo**<br/>

### 5. Subordinates
Dada la estructura de una compañia, su tarea es calcular el numero de subordinados por cada empleado.<br/>
[enunciado](https://cses.fi/problemset/task/1674)

**Input**<br/>
La primera linea indica el numero de empleados $n$. El empleado 1 es el director general (no tiene jefe).<br/>
La segunda linea tiene $n-1$ numeros, que indican el jefe directo de cada empleado.

**Output**<br/>
Imprime $n$ numeros: por cada empleado $1,2,...n$ su numero de subordinados.

**Ejemplo**<br/>
Input:<br/>
5<br/>
1 1 2 3<br/>
Output:<br/>
4 1 1 0 0

## Hash Map & Sets

### 6. Distinct Numbers 
Te entregan una lista de $n$ números, tu tareas es calcular la cantidad de valores distintos en la lista.<br/>
[enunciado](https://cses.fi/problemset/task/1621)

**Input**<br/>
La primera linea tiene un numero $n$ que representa el numero de elementos.<br/>
La segunda linea tiene $n$ enteros $x_1,x_2,...,x_n$

**Output**<br/>
El numero de valores distintos.

**Ejemplo**<br/>
Input:<br/>
5<br/>
2 3 2 2 3<br/>
Output:<br/>
2
