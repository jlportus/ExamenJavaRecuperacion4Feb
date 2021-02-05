# ExamenJavaRecuperacion4Feb

## 1a pregunta

creo el proyecto en GitHub, le meto el readme y el gitignore
abro la terminal y hago git clone
descargo el zip y inicial y lo descomprimo en la carpeda descargada de gitHub

creo el paquete es.lanyu.cartas
creo la clase con el main en elpaquete com.tute

## 2a Pregunta

Creo la clase carta

he tenido que cambiar la pespectiva a javaView en eclipse, he tenido que crear una carpeta src y mover los paquetes ahi para que funcione (como en otros proyectos para que funcione...) me doy mus con estas cosas

## 3a Pregunta
creo la baraja, tendra varios palos y un numero de cartas por palo, el constructor recorre todos los palos y todas los numeros de carta y los añade a una collection para que se puedan ordenar y mezclar

creo la mano, sera un array de un numero de cartas definido con un constructor con n que creara el array de tamaño n cartas de la mano

// me adelanto a la pregunta 4 y cambio el to string de carta para que cuando sea as sota caballo o rey al devolverlo de "as de copas"

## 4a pregunta

en el main creo un String con los palos

creo una baraja española con los palos creados 
creo el get cartas de la baraja en Baraja para que me de la colleccion de cartas y la imprimo con el forEach

## 5a Pregunta

en la interfaz crupier creo los metodos por defecto

barajar: coje las cartas de la baraja con el metodo getCartas que implementan los mazos y le hace un shufle

robar: comprueba si el mazo esta vacio -> si: devuelve null
si la carta que le paso hay una igual en el mazo, me la devuelve y saca la carta del mazo
si no esta la carta, me saca la  primera

contiene carta: con el list.contains

## 6a pregunta

saco a una clase abstracta las caracteristicas de la baraja española, los palos y los numeros de cartas, para centralizarlos

en carta implemento la interfaz comparable<Cartas> y le pongo el metodo compareTo
1 comparo el string del palo de la carta con la otra ( como lo haga la maquina)// me dice que el orden de los palos es indiferente
2 meto en el compare un If, si me da el mismo palo la diferencia me dara 0, por lo tanto entro a comparar el numero de la carta a pelo restandolos.

mezclo y ordeno en el main