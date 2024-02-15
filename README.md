# practicaPR2
## Instalación
Para instalar el programa debe escribir "make jar" y tener instalado el siguiente software:
-Jar
-El entorno JDK
## Compilación y generación del `.jar`
Para compilar y generar el `.jar`, se ejecutara la siguinete instrucción: 
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
## Licencia
Copyright [2024] [Alejandra Vázquez Corbella]
Este proyecto esta licenciado bajo la [Licencia Apache 2.0](https://www.apache.org/license/LICENSE-2.0). Consulte el archivo [LICENSE](LICENSE.txt) para obtener más detalles.
