# Repaso para el examen

## Linked List

### 1. Rotate a linked list
Dado el primer elemento de una lista enlazada, constuya una función que rote a la derecha la lista $k$ veces.<br/>
[enunciado](https://leetcode.com/problems/rotate-list)

**Input**<br/>
La función recibira el primer elemento de la lista enlazada y un numero $k$

**Output**<br/>
Esta debe retornar la lista enlazada ordenada.

**Ejemplo**<br/>
Input:<br/>
1 2 3 4 5<br/>
2<br/>
Output:<br/>
4 5 1 2 3<br/>
![image](https://github.com/tanaxer01/EDA-2023/assets/2672077/0c4bdc41-928b-4a70-845c-ed59bad8e5a5)  

### 2. Sort a linked list
Dado el primer elemento de una lista enlazada, construya una función que la ordene ascendentemente.<br/> 
[enunciado](https://leetcode.com/problems/sort-list)

**Input**<br/>
La función recibira el primer elemento de la lista enlazada.

**Output**<br/>
Esta debe retornar la lista enlazada ordenada.

**Ejemplo**<br/>
Input:<br/>
4 2 1 3<br/>
Output:<br/>
1 2 3 4<br/>
![image](https://github.com/tanaxer01/EDA-2023/assets/2672077/5227c93e-9afa-4110-9232-f95a7e1e9dba)

## Binary Search Tree

### 3. Flatten a BST
Dada la raiz de una arbol de busqueda binaria, consruyea una función que lo convierta en una lista enlazada.<br/>
[enunciado](https://leetcode.com/problems/flatten-binary-tree-to-linked-list)

+ La lista enlazada deberia utilizar la misma clase _TreeNode_ donde el hijo derecho apunta al siguiente elemento y el hijo izquierdo siempre es nulo.
+ La lista enlazada deberia seguir el orden _pre-order traversal_ del arbol binario.

**Input**<br/>
La función recibira la raiz del arbol.

**Output**<br/>
Esta debe retornar el arbol modificado.

**Ejemplo**<br/>
Input:<br/>
1 2 5 3 4 null 6<br/>
Output:<br/>
1 null 2 null 3 null 4 null 5 null 6

![image](https://github.com/tanaxer01/EDA-2023/assets/2672077/1ef0b1e9-b001-48ec-b131-fe0073f1ee29)


### 4. Search a 2D Matrix
Si se tiene una matriz $m\ x\ n$ de enteros, que cumple las siguientes propiedades:

+ Cada fila esta ordenada ascendentemente.
+ El primer entero de cada fila es mayor al ultimo entero de la fila anterior.

Dado un numero $target$ construya una función que determine si $target$ esta en la matriz o no.<br/>
La solución debe tener una complejidad $\mathcal{O}(log(m*n))$<br/>
[enunciado](https://leetcode.com/problems/search-a-2d-matrix)

**Input**<br/>
La función recibira una matriz $matrix$ de numeros enteros y un numero $target$.<br/>

**Output**<br/>
Verdadero si el numero se encuentra en la matriz, Falso de lo contrario.

**Ejemplo**<br/>
Input:<br/>
[[1,3,5,7],[10,11,16,20],[23,30,34,60]]<br/>
3<br/>
Output:<br/>
true<br/>
![image](https://github.com/tanaxer01/EDA-2023/assets/2672077/ae41210c-793b-4e41-8888-32fea353a1d3)


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
