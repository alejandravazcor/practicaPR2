# PrácticaPR2
## Calculadora de Distancias

Este proyecto proporciona una aplicación para calcular la distancia de edición entre dos cadenas de texto.

## Funcionalidades

- Calcula la distancia de edición entre dos cadenas utilizando el algoritmo de programación dinámica.
- Proporciona una interfaz de línea de comandos para ingresar las cadenas y mostrar el resultado.

## Uso

Para utilizar la aplicación, sigue estos pasos:

1. Clona el repositorio a tu máquina local:

   ```bash
   git clone https://github.com/tu_usuario/calculadora-distancias.git

## Instalación
Para instalar el programa debe escribir `make jar` y tener instalado el siguiente software:
-Jar
-El entorno JDK
## Compilación y generación del `.jar`
Para compilar y generar el `.jar`, se ejecutara la siguiente instrucción: 
```console
make jar
```
El_script_ definido en el fichero `makefile`está pensado para funcionar en Linux. En caso de que utilice Windows, deberia invocar directamente el compilador de Java.

## Uso del *make*
### Suprime los directorios bin y html, elimina los ficheros .jar, los .class y .txt.
    make limpiar
### Crea el directorio bin y allí almacena los .class que ha compilado durante la ejecución del make. 
    make compilar
### Crea el .jar
    make jar
### Aproximacion al número pi y ejecución
     java -jar pi.jar <numero de pasos>
#### Ejemplo:
      java -jar pi.jar 16 76
### Estructura
Existen dos clases: `CalculadoraDistancias.java` en el paquete `palabras` que contiene el método que realiza el cálculo ; y `Principal.java`en el paquete `aplicacion`que invoca el método de simulación
## Licencia
Copyright [2024] [Alejandra Vázquez Corbella y Manuel Enrique Tabasco García]
Este proyecto esta licenciado bajo la [Licencia Apache 2.0](https://www.apache.org/license/LICENSE-2.0). Consulte el archivo [LICENSE](LICENSE.txt) para obtener más detalles.
