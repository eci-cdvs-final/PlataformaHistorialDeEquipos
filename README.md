## Escuela Colombiana de Ingeniería

### Plataforma Historial De Equipos

#### Tercer Corte
#### CVDS – Ciclos de Vida del desarrollo de Software
#### Integrantes: 
* David Caycedo 
* Santiago Vega 
* Mateo Gonzalez 
* Diego Puerto
#### Presentado a:
* Santiago Alzate
* Julián Velasco
#### Descripción del producto:
* Descripción General

	Con esta aplicación podremos registrar, aociar, modificar y eliminar los elemtos necesarios para administrar las salas de informática de la decanatura de sistemas, permitiendo un control más visual y organizado de todos los cambios que se realizan a diario en las diferentes aulas.

* Manual de usuario
* Imágenes y descripción de las funcionalidades más importantes
#### Arquitectura y Diseño detallado:
* Modelo E-R.

![](https://github.com/eci-cdvs-final/PlataformaHistorialDeEquipos/blob/master/img/ModeloE-R.PNG) 

* Diagrama de clases (hacerlo mediante ingeniería inversa)
* Descripción de la arquitectura (capas) y del Stack de tecnologías utilizado (PrimeFaces, Guice, QuickTheories, PostgreSQL).

	Para la capa de presentación se implementó la infraestructura de PrimeFaces.
	Guice brinda el mecanismo que nos permite atrapar y transportar la información desde la capa de presentacion hasta la base de datos y viceversa, y los objetos de interactuan a lo largo de los distintos procesos.
	PostgreSQL nos brinda la infraestructura necesaria para crear y manipular la base de datos requerida para el proyecto y su desarrollo.
	QuickTheories nos provee herramientas para poder ejecutar pruebas, estas nos permiten verificar y corregir el funcionamiento de cada una de las funcionalidades aquí implementadas
	

* https://plataformashisorialequipo.herokuapp.com/faces/login.xhtml

Usuario: claudia.santiago

Contraseña: Admin1234

### Descripción del proceso:
* Breve descripción de la Metodología.

   Para desarrollar el proyecto se llevó a cabo la metodología Scrum. Aquí se desarrollaron tres sprints, cada uno con una duración de dos semanas, dentro de cada sprint se ubicó un conjunto de historias de usuario y cada una de ellas estaba subdividida en una serie de actividades necesarias para cumplir con el desarrollo completo de la misma.
   Debido a que cada historia de usuario cuenta con una puntuación, que representa la cantidad de horas proyectadas para su desarrollo, dichas historias se acomodaron teniendo en cuenta los créditos de la materia y la cantidad de integrantes del grupo, dando así un promedio de 80 horas por cada sprint.
* Enlace a Taiga: https://tree.taiga.io/project/diego23p-historial-de-equipos-labinfo/backlog

#### Sprint 1:

* Modelo E-R.

![](https://github.com/eci-cdvs-final/PlataformaHistorialDeEquipos/blob/master/img/ModeloE-R-Sprint1.png)

* Imagen del 'sprint-backlog'

![](https://github.com/eci-cdvs-final/PlataformaHistorialDeEquipos/blob/master/img/Sprint1_backlog.png)

* Imagen del 'sprint-burndown chart'

![](https://github.com/eci-cdvs-final/PlataformaHistorialDeEquipos/blob/master/img/Sprint1_burndown.png)
   
* Se hizo bien

	Todos los integrantes del equipo aportaron al proyecto, se usó en gran medida la metodología de trabajo propuesta.
	Se logró un buen funcionamiento de las dos historias de uso propuestas

* Problemas

	Como mayor problema, nos encontramos con que las historias de usuario requerían más tiempo del planeado, por ello, el trabajo proyectado al inicio no se cumplió en su totalidad y se observan varias horas de trabajo no finalizadas.

* Nos comprometememos

   Las mejoras para el siguiente sprint se basan en tener una mejor planeación de las historias de usuario, así, como también destinar más tiempo en el desarrollo del proyecto

#### Sprint 2:

* Modelo E-R.

![](https://github.com/eci-cdvs-final/PlataformaHistorialDeEquipos/blob/master/img/ModeloE-R-Sprint2.png)

* Imagen del 'sprint-backlog'

![](https://github.com/eci-cdvs-final/PlataformaHistorialDeEquipos/blob/master/img/Sprint2_backlog.png)

* Imagen del 'sprint-burndown chart'

![](https://github.com/eci-cdvs-final/PlataformaHistorialDeEquipos/blob/master/img/Sprint2_burndown.png)

* Se hizo bien

	Se logró corregir oportunamente las actividades que quedaron pendientes del Sprint 1.
	Se logró un buen y completo funcionamiento de tres historias de usuario propuestas para este Sprint.

* Problemas

	Hicieron falta algunas pruebas de las historias de usuario.
	No se tuvo en cuenta algunos requisitos de "Registrar Equipo" y "Reporte de Equipos"

* Nos comprometememos

   A terminar las pruebas que quedaron pendientes en el Sprint 2.
   Lograr un buen funcionamiento y planeación de las historias de usuario, quedando así completos todos los objetivos propuestos en el backlog del sprint 3 

#### Sprint 3:

* Modelo E-R.

![](https://github.com/eci-cdvs-final/PlataformaHistorialDeEquipos/blob/master/img/ModeloE-R.PNG)

* Imagen del 'sprint-backlog'

![](https://github.com/eci-cdvs-final/PlataformaHistorialDeEquipos/blob/master/img/Sprint3_backlog.png)

* Imagen del 'sprint-burndown chart' (sacado del sprint-backlog anterior), y una descripción breve de los problemas encontrados y mejoras realizadas al proceso.

![](https://github.com/eci-cdvs-final/PlataformaHistorialDeEquipos/blob/master/img/Sprint3_burndown.png)

* Se hizo bien

	A lo largo de las dos semanas del Sprint, logramos trabajar más distribuidamente a lo largo de los días en comparación con los sprints pasados.
	Se logró completar las actividades faltantes del sprin pasado.

* Problemas

	No todas las pruebas de las historias de usuario quedaron implememntadas

* Nos comprometememos

   A aplicar la metodología Scrun de la forma correcta en todos los proyectos que lo requieran