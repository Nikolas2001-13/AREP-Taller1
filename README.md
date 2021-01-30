# INTRODUCTION TO COMPLEX SYSTEMS, JAVA, MVN, AND GIT
## LinkedList

En este laboratorio se deberá realizar una linked list creada por nosotros mismos, y con 
los elementos que esta tiene se deberá calcular la media y la desviación estandar de los datos que esta contiene.

## Empezando e Instalando

Entramos a la carpeta donde queremos guardar nuestro repositorio, en este caso Desktop

`$ cd Desktop`

Clonamos el repositorio en la carpeta

`$ git clone https://github.com/Nikolas2001-13/AREP-Taller1`

Nos dirigimos a la carpeta que contiene el proyecto

`$ cd AREP-Taller1`

Compilamos con maven

`$ mvn package`

Y por último corremos el programa

`$ mvn exec:java -Dexec.mainClass="edu.eci.arep.Main"`

### Prerrequisitos
Java SE Development Kit 8 -Java SE Runtime Environment 8 -Apache Maven.

## Correr las Pruebas

Para correr las pruebas del programa habrá que ejecutar el comando

`$ mvn test`

## Documentacion

Para generar la documentación habrá que ejecutar el siguiente comando

`$ mvn javadoc:javadoc`

## Construido Con

* [JUnit](https://mvnrepository.com/artifact/junit/junit) - Test framework
* [Maven](https://maven.apache.org/) - Dependency Management
* [IntelliJ](https://www.jetbrains.com/es-es/idea/) - IDE

## Autor

* **Nikolás Bernal Giraldo** - [Nikolas2001-13](https://github.com/Nikolas2001-13) - Estudiante de la Escuela Colombiana de Ingeniería Julio Gravito

## Licencia

[LICENSE.md](http://www.gnu.org/licenses/gpl.html) 
