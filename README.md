<<<<<<< HEAD
README — Taller Principio de Inversión de Dependencias (DIP)
📌 Programación Orientada a Objetos

Unidad 3 – Principios SOLID en Java
Actividad: Taller sobre Inversión de Dependencias (DIP)
Tutor: John Carlos Arrieta Arrieta

🧩 Descripción del Taller

En este taller se aplicó el Principio de Inversión de Dependencias (DIP), uno de los pilares de los principios SOLID.
El objetivo era diseñar sistemas desacoplados, flexibles y fáciles de extender utilizando interfaces como punto de abstracción entre los módulos de alto nivel y las implementaciones concretas.

Los ejercicios propuestos consistían en desarrollar tres sistemas distintos donde el DIP fuera aplicado de forma correcta, evitando dependencias directas entre clases concretas.

🎯 Objetivos

Comprender qué es la Inversión de Dependencias y por qué es importante.

Separar módulos de alto nivel y bajo nivel mediante interfaces.

Aplicar inyección de dependencias por constructor.

Practicar la flexibilidad del diseño al intercambiar implementaciones sin modificar las clases principales.

Desarrollar código limpio, extensible y de bajo acoplamiento.

📘 Contenido del Proyecto

El taller contiene tres ejercicios independientes, cada uno implementando DIP.

📝 Ejercicio 1 — Sistema de Autenticación
✔️ Archivo: ServicioAutenticacion.java

Interfaz que define el método de autenticación.

✔️ Archivo: AutenticacionLocal.java

Implementación de autenticación local (usuario/contraseña).

✔️ Archivo: AutenticacionOAuth.java

Implementación que simula autenticación mediante OAuth.

✔️ Archivo: GestorAutenticacion.java

Clase de alto nivel que depende solo de la abstracción (interfaz).

✔️ Archivo: Main.java

Permite probar distintas implementaciones sin modificar el gestor.

📝 Ejercicio 2 — Sistema de Almacenamiento de Archivos
✔️ Archivo: Almacenamiento.java

Interfaz con métodos para guardar y leer archivos.

✔️ Archivo: AlmacenamientoLocal.java

Simula almacenamiento en disco local.

✔️ Archivo: AlmacenamientoNube.java

Simula almacenamiento en la nube.

✔️ Archivo: GestorArchivos.java

Administra archivos sin depender de implementaciones concretas.

✔️ Archivo: Main.java

Permite intercambiar entre almacenamiento local y nube.

📝 Ejercicio 3 — Sistema de Reportes
✔️ Archivo: GeneradorReporte.java

Interfaz con el método para generar reportes.

✔️ Archivo: ReportePDF.java

Implementación para reportes en formato PDF.

✔️ Archivo: ReporteExcel.java

Implementación para reportes en formato Excel.

✔️ Archivo: GestorReportes.java

Clase que genera reportes basándose solo en la interfaz.

✔️ Archivo: Main.java

Demuestra cómo cambiar entre PDF y Excel sin modificar el gestor.

🧠 ¿Cómo se aplica DIP en el taller?

En los tres ejercicios, las clases de alto nivel (GestorAutenticacion, GestorArchivos, GestorReportes) no dependen de clases concretas, sino de interfaces.
Las implementaciones concretas se inyectan desde afuera usando el constructor, lo cual permite:

Cambiar implementaciones sin editar código interno.

Agregar nuevos tipos de autenticación, almacenamiento o reporte sin modificar los gestores.

Reducir el acoplamiento y mejorar la escalabilidad.
=======
# Taller-sobre-Principios-SOLID-en-Java--Inversi-n-de-Dependencias
>>>>>>> 3286b137eb581dc10eb47f311f9095896a9f6bc6
