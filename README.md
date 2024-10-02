# CRUD de Animales Salvajes
Este proyecto es una API REST creada con Java Spring Boot para gestionar animales salvajes, permitiendo realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) en una base de datos MySQL.

Tecnologías utilizadas

Java Spring Boot
Maven
MySQL
Postman (para pruebas)
Visual Studio Code

Configuración de la base de datos
La base de datos utilizada se llama animal y contiene la tabla wild_animal con los siguientes atributos:

id	name	age	food
1	Shark	12	fish
2	Lion	2	meat
3	Cheetah	1	meat
4	Panda	2	bamboo

Configuración en application.properties

spring.application.name=Animals
spring.datasource.url=jdbc:mysql://localhost:3306/animal
spring.datasource.username=root
spring.datasource.password=your_password_here
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update

Cómo ejecutar el proyecto
Clonar este repositorio.
Asegúrate de tener MySQL instalado y funcionando.
Configura tu base de datos en application.properties.
Ejecuta el proyecto desde Visual Studio Code usando Run Java.
Usa Postman para probar los endpoints descritos.


Estructura del proyecto
El proyecto sigue una arquitectura por capas con las siguientes carpetas principales:

controllers: Contiene los controladores que manejan las solicitudes HTTP.
services: Implementa la lógica de negocio del proyecto.
repositories: Interactúa con la base de datos utilizando JPA.
models: Define las entidades del proyecto (como WildAnimal).