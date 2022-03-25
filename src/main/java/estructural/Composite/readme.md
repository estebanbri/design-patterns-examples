Usalo cuando notes que tu modelo a representar en una jerarquia notes una estructura recursiva, en forma de arbol.
Es decir un unico objeto padre va a referenciar a toda una estructura de objetos hijos, y los hijos pudiendo ser padres:
Padre
/    \ 
Hijo  Padre
      /    \
    Hijo   Hijo

   2Por1
/             \ 
HomePC          GamerPC
|   |           |   |
cpu cooler...   cpu cooler...

Como ves este patron te da el poder de una herencia no static convencional, sino que 
a medida que necesite el cliente, los niveles de la jerarquia son creados por el cliente.
Supongamos que hubieras usado herencia convesional para el ejemplo de la computadora.

ParentContainer
|
ParentProduct
|
ChildProduct

El dia de mañana te dicen que necesitas que los ChildProduct tambien tengan otras clases hijas, entonces vas a tener que cambiar el modelo.
En cambio usando el patron composite no es necesario agregar mas niveles en la jerarquia de herencia simplemente
el cliente va a instanciar objetos para ir formando la jerarquia que desee.

Ejemplo: https://www.oscarblancarteblog.com/2014/10/07/patron-de-diseno-composite/

