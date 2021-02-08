# ExamenJavaRecuperacion4Feb

//Es encesario hacer una carpeta src para que funcione.


## 1a pregunta



creo el proyecto en GitHub, le meto el readme y el gitignore
abro la terminal y hago git clone
descargo el zip y inicial y lo descomprimo en la carpeda descargada de gitHub

creo el paquete es.lanyu.cartas
creo la clase con el main en elpaquete com.tute

## 2a Pregunta

Creo la clase carta

he tenido que cambiar la pespectiva a javaView en eclipse, he tenido que crear una carpeta src y mover los paquetes ahi para que funcione (como en otros proyectos para que funcione...) me doy mus con estas cosas


//para hacer la carta se ha de considerar que deben tener un String para los palos y un int para los numeros. hay que tener en cuenta que pueden cambiar en el futuro(se modificara).
se ponen en privado y se crean los getters
se crea un constructor con eclipse



## 3a Pregunta
creo la baraja, tendra varios palos y un numero de cartas por palo, el constructor recorre todos los palos y todas los numeros de carta y los añade a una collection para que se puedan ordenar y mezclar

creo la mano, sera un array de un numero de cartas definido con un constructor con n que creara el array de tamaño n cartas de la mano

-- me adelanto a la pregunta 4 y cambio el to string de carta para que cuando sea as sota caballo o rey al devolverlo de "as de copas"


//la mano sera un numero de cartas
//la baraja seran todas las cartas
para valorar la reutilizacion -> no pueden heredar una de otra
creo una clase Mano

creo una clase Baraja
... sigo por la 4a para luego volver

## 4a pregunta

en el main creo un String con los palos

creo una baraja española con los palos creados 
creo el get cartas de la baraja en Baraja para que me de la colleccion de cartas y la imprimo con el forEach


//creo una baraja en el main, hago un bucle con los numeros y los palos
para los palos Hago un String[] {"oros", "espadas"...}
hago una baraja, aun no tiene constructor...
voy a Baraja y la baraja sera una Collection de Cartas como array List
en el main hago el for para meter cartas a la baraja, pasando por todos los palos y los numeros.

hago la prueba de imprimirlo. -> como no me sale, voy a carta y ahgo el toString de Carta -> como tampoco sale, modifico el toString para que me diga cuando es 1a carta sea AS... con un If, else para el 8, else...

## 5a Pregunta

en la interfaz crupier creo los metodos por defecto

barajar: coje las cartas de la baraja con el metodo getCartas que implementan los mazos y le hace un shufle

robar: comprueba si el mazo esta vacio -> si: devuelve null
si la carta que le paso hay una igual en el mazo, me la devuelve y saca la carta del mazo
si no esta la carta, me saca la  primera

contiene carta: con el list.contains

//como dice que tiene que barajar en mano y en Baraja 
voy a Baraja y hago el Collection.shufle -> como peta cambio la collection a List

puedo hacerlo con ThreadLocalRandom y meto un for pasando por todas las posiciones

como barajar lo voy a necesitar tambien en Mano, voy a tenre que sacar eL getCartas y el barajar, lo paso a un grupo de cartas superior( abstracta).
hago que la mano herede tambien del grupo de cartas para que tambien baraje.

//metodo robar, tiene que buscar en un grupo de elementos la carta y sacarla de el  lo pongo en grupo de cartas
hago un forEach y busco la carta en el grupode cartas(getcartas)
si la encuentro, la devuelvo y la saco del mazo con remove
como no me funciona -> necesitare el equals en carta.
lo meto en un if == null. para asegurame que hay cartas, le tengo que meter una condicion que la si carta buscada es null && que existen cartas en el mazo, si se cumple devolvera null

//el metodo contiene carta return getCartas.contains(cartaBuscada)


## 6a pregunta

saco a una clase abstracta las caracteristicas de la baraja española, los palos y los numeros de cartas, para centralizarlos

en carta implemento la interfaz comparable<Cartas> y le pongo el metodo compareTo
1 comparo el string del palo de la carta con la otra ( como lo haga la maquina)// me dice que el orden de los palos es indiferente
2 meto en el compare un If, si me da el mismo palo la diferencia me dara 0, por lo tanto entro a comparar el numero de la carta a pelo restandolos.

mezclo y ordeno en el main

// el orden natural -> comparable siempre
en la carta le digo que implementa Comparable
desarrollo el compareTocomparo el Palo de una con el Palo de la otra, if ( == 0) comparo los numeros (con una resta a pelo es suficiente)

## 7a pregunta

necesito hacer una interface, extrayendo de mi carta lo minimo ( el palo y el numero). lo hago con eclipse, refactorizar.
para trabajar con spring de modo automatico, al meter una carta implementada con un ainterface, le mete Impl de sufijo a la clase que se implemente.

Carta la cambio a CartaImpl y creo una Interface Carta en la que le meto los metodos de Carta (get palo, compare y get numero)

en la interfaz, meto el default para el compareTo, para que me permita comparar cartas externas con las mias

creo la carta externa que hereda de la Card del paquete externo, que implementa mi interfaz Carta

como al extraer la carta externa me dice que las crea con int para los palos, refactorizo para que sea un entero(luego en la siguiente tendre que hacerlo generico)
me voy a carta y lo cambio el palo a int -> me petara el compare, lo cambio segun los errores que me de eclipse

tendre que cambiar el crear una baraja

tendre que cambiar tambien el to String

en la baraja impleentada(que tenia una lista de cartas), tengo que cambiar le digo que debe ser de la interfaz carta

al meter una carta externa funcionaria


## 9a pregunta

//para que funcione se deben meter genericos
en la interfaz carta mete los metodos getnumeroString y getpaloString. luego tiene que implementarlos en la carta implementada, encapsula lo que tenia en el to string y lo pasa al get to string
se implementa tambien el la carta externa
modifica la interfaz y hace que el palo sea un generico del tipo T y para que el compareTo funcione debe se T extends comparable, resolver los fallos que de el eclipse

Para hacer la prueba creo una nueva carta de tipo CartaFamilia que extiende cartaImplementada. necesito sobreescribir el getPaloString de carta implementada

## 8a pregunta

en el main, creo un comparator<Manos> caomparador,

hago un mapa campo:valor palos:cantidad
necesito ordenarlo para ir contando por palos y acumulando.

hago la ordenacion de la primera mano, creo una lista ordenada 

paso por todas las cartas ordenadas y guardo el palo que estoy contando 