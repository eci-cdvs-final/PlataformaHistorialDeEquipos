create table laboratorio
	(id varchar(10) primary key,
	nombre varchar(30) not null,
	descripcion varchar(500) not null,
	capacidadequipos integer not null);


create table usuario(username varchar(50) primary key,
					estado varchar(10) not null,
					rol varchar(20) not null,
					correo varchar(100) not null, 
					contraseña varchar(50) not null, 
					nombrecompleto varchar(100) not null );
				
create table equipo(id integer primary key,
					laboratorioID varchar(10),
					CONSTRAINT FK_EquipoLaborotorio
					FOREIGN KEY (laboratorioID) REFERENCES laboratorio(id)
					);
				
create table elemento(id INTEGER primary key,
					tipo varchar(10)not null,
					equipoID integer not null,
					CONSTRAINT FK_ElementoEquipo
					FOREIGN KEY (equipoID) REFERENCES equipo(id)
					);
				
create table novedad(id integer primary key,	
					elementoID varchar(10),
					equipoID varchar(10),
					fecha DATE not null,
					titulo varchar(200) not null,
					usuarioID varchar(50) not null,
					detalle varchar(500)not null,
					CONSTRAINT FK_NovedadElemento
					FOREIGN KEY (elementoID) REFERENCES elemento(id),
					CONSTRAINT FK_NovedadEquipo
					FOREIGN KEY (equipoID) REFERENCES equipo(id),
					CONSTRAINT FK_NovedadUsuario
					FOREIGN KEY (usuarioID) REFERENCES usuario(username)
					);

alter table elemento add constraint ck_tipoequipos
check (tipo in ('Mouse','Teclado','Torre','Pantalla'));

alter table usuario add constraint ck_correo
check (correo like '%@%.%');

alter table usuario add constraint ck_estados
check (estado in ('Activo','Inactivo'));

alter table usuario add constraint ck_rol
check (rol in ('Profesor','Decano','Monitor','Estudiante'));

	
				
