Si queremos acceder a la aplicación, debemos ejecutar la siguiente consulta:

 mvn compile exec:java -Dexec.mainClass="gestionRestaurante.Restaurante.App"
 

Si queremos limpiar y validar :

mvn clean

Si queremos realizar un test completo, deberemos ejecutar la siguiente consulta:

mvn test -Dtest=casesTest

Si queremos realizar test unitarios, las consultas serían las siguientes:

-Test de conexion:
	mvn test -Dtest=connectionTest
-Test de nuevo Cliente:
	mvn test -Dtest=nuevoClienteTest
-Test de conexion:
	mvn test -Dtest=nuevoRegistroTest



Si queremos una ejecucion general, los comandos serán los siguientes:

-Compilar el proyecto:
	mvn compile
-Crear Jar
	mvn package