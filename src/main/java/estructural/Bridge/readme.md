Pregunta que tenes que hacer para saber si hay que usarlo al patron bridge?
La jerarquia de herencia convensional se va volver exponencial con todas las combinaciones posibles de subclases?' 
Es decir Necesito usar un mecanismo de herencia pero necesito flexibilidad, por ende el uso de la herencia convencional no me sirve porque se crea un tightly binding entre clase hijas y clase padre?

Lo que busca este patron es que la especializacion que mediante herencia convencional se volveria exponencial con todas las posibles convinaciones de subclases,
es llevarla a una jerarquia aparte de la actual, es decir separar los dos conceptos y enlazarlos mediante composicion.
     A
    / \
  Aa    Ab
 / \    / \
Aa1 Aa2 Ab1 Ab2

Patron bridge:
   A          #
  / \        / \
Aa    Ab   1     2

El patron se basa en la frase composition over inheritance.

Reduce el numero de subclases cuando la cantidad de entidades hubieran resultado
de combinar dos conceptos (ej, formas y colores).

Resumen: te da el poder como si fuera una herencia que se resuelve dinamicamente en tiempo de ejecucion, y no en tiempo de compilacion como la herencia convensional