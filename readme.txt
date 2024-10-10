--Sistema de Ingreso de Notas
Este proyecto es una aplicación diseñada para gestionar las notas de estudiantes. Aquí te mostrare una guía detallada sobre cómo usar el programa, incluyendo pasos para crear la base de datos y ejecutar tanto el backend como el frontend.

1 CREAR BASE DE DATOS
EL PROGRAMA VA CONFIGURADO COMO USERNAME: ROOT
	CREATE DATABASE gestor_notas;
	CREATE TABLE estudiantes (
   		id BIGINT AUTO_INCREMENT PRIMARY KEY,
    		nombre VARCHAR(255) NOT NULL,
    		actividades INT,
    		primerParcial INT,
    		segundoParcial INT,
    		examenFinal INT,
    		puntajeTotal INT
);

2 Ejecutar el Backend
Desde la terminal ingresar: mvn spring-boot:run
Puedes verificar su inicio en la ruta: http://localhost:8080

3 Ejecutar el Frontend
Desde la terminal ingresar: npm start
Puedes verificar su inicio en la ruta: http://localhost:3000

Uso de la Aplicación
Agregar Estudiantes
En la página principal, verás un formulario con los siguientes campos:

Nombre: Ingresa el nombre del estudiante.
Actividades: Ingresa el puntaje de actividades (máximo 35).
Primer Parcial: Ingresa el puntaje del primer parcial (máximo 15).
Segundo Parcial: Ingresa el puntaje del segundo parcial (máximo 15).
Examen Final: Ingresa el puntaje del examen final (máximo 35).
Completa todos los campos y haz clic en el botón "Agregar Estudiante". Verás un mensaje de confirmación si los datos se ingresaron correctamente.

Visualizar Estudiantes
Después de agregar estudiantes, puedes hacer clic en el botón "Mostrar Estudiantes".
Esto mostrará una tabla con la lista de estudiantes, sus puntajes en cada evaluación y el puntaje total.