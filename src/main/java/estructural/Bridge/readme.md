Cuando ves que tu jerarquia de clases (usando herencia) se va a volver
exponencial y tenes un diseño no escalable. Es decir cada vez que se agregue un 
metodo de pago vas a tener que crear una clase para cada tipo de gateway de pago.

Lo anterior es un indicio para aplicar patron bridge el cual hace separar 
en dos jerarquias distintas y lo importante del patron es el u so de composicion para
relacionar las abstraciones con las implementaciones reales.
El patron se basa en la frase composition over inheritance.