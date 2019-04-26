
create table laboratorio
	(id varchar(10) primary key,
	nombre varchar(30) not null,
	descripcion varchar(500) not null,
	capacidadequipos integer not null,
	activo boolean not null);



				
create table equipo(id serial primary key,
					laboratorioID varchar(10),
					activo boolean not null,
					nombre varchar(20) not null,
					CONSTRAINT FK_EquipoLaborotorio
					FOREIGN KEY (laboratorioID) REFERENCES laboratorio(id)
					);
				
create table elemento(id serial primary key,
					tipo varchar(10)not null,
					equipoID integer,
					activo boolean not null,
					marca varchar(50) not null,
					nombre varchar(20) not null,
					CONSTRAINT FK_ElementoEquipo
					FOREIGN KEY (equipoID) REFERENCES equipo(id)
					);
				

create table usuario(username varchar(50) primary key,
					estado varchar(10) not null,
					rol varchar(20) not null,
					correo varchar(100) not null, 
					nombrecompleto varchar(100) not null ,
					contrasena varchar(254) not null 
					);

create table novedad(id serial primary key,	
					elementoID integer,
					equipoID integer,
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
check (rol in ('Profesor','Decano','Monitor','Administrativo'));

insert into usuario values('claudia.santiago','Activo','Profesor','claudia.santiago@escuelaing.edu.co','CLAUDIA PATRICIA SANTIAGO CELY','60fe74406e7f353ed979f350f2fbb6a2e8690a5fa7d1b0c32983d1d8b3f95f67');

insert into equipo(activo,nombre) values(true,'Equipo 1');