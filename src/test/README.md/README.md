# CRUD de Animales Salvajes - Spring Boot y MySQL

Este proyecto es un CRUD básico (Crear, Leer, Actualizar y Eliminar) que gestiona información sobre animales salvajes. Está construido con Spring Boot para el backend y utiliza MySQL como base de datos. Las pruebas de las rutas se pueden realizar con Postman.

## Tabla de Contenidos
1. [Requisitos Previos](#requisitos-previos)
2. [Instalación](#instalación)
3. [Uso](#uso)
4. [Estructura del Proyecto](#estructura-del-proyecto)
5. [Rutas API](#rutas-api)

## Requisitos Previos

Antes de comenzar, asegúrate de tener instalados los siguientes componentes:

- [JDK 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven](https://maven.apache.org/)
- [MySQL](https://dev.mysql.com/downloads/)
- [Postman](https://www.postman.com/downloads/)

También necesitarás tener configuradas las siguientes herramientas para la base de datos:

- MySQL con una base de datos llamada `animal`
- Tabla `wild_animal` con los siguientes campos:
  - `id`: (INT) Identificador del animal
  - `name`: (VARCHAR) Nombre del animal
  - `age`: (INT) Edad del animal
  - `food`: (VARCHAR) Tipo de comida del animal

## Instalación

Sigue los pasos a continuación para configurar el proyecto en tu entorno local.

1. Clona este repositorio en tu máquina local:
   bash
   git clone 

2. Navega al directorio del proyecto
cd 

3. cofigura tu base de datos MySQL
Asegúrate de que la base de datos animal y la tabla wild_animal estén creadas según los requisitos mencionados.

4. Actualiza el archivo src/main/resources/application.properties con la configuración de tu base de datos
spring.datasource.url=jdbc:mysql://localhost:3306/animal
spring.datasource.username=root
spring.datasource.password=Tarmmi123*
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

5. Compila y ejecuta el proyecto con Maven
mvn spring-boot:run (Desde vsc puedes inciar desde la parte superior derecha run java)

USO

1. Abre Visual Studio Code y asegúrate de que el servidor se esté ejecutando correctamente usando
mvn spring-boot:run(parte superior derecha triangulo invertido run java)

Pruebas con postman 
Abre Postman y usa las siguientes rutas para interactuar con la API:

Rutas API
Método	Ruta	Descripción
GET	/api/animals	Obtener todos los animales
GET	/api/animals/{id}	Obtener un animal por ID
POST	/api/animals	Crear un nuevo animal
PUT	/api/animals/{id}	Actualizar un animal por ID
DELETE	/api/animals/{id}	Eliminar un animal por ID

Explicación de las carpetas:
controllers: Contiene los controladores que manejan las solicitudes HTTP.
model: Contiene las entidades JPA que representan las tablas de la base de datos.
repositories: Contiene los repositorios que interactúan con la base de datos.
services: Contiene la lógica del negocio.