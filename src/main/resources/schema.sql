CREATE TABLE usuarios (
	usu_codusu SERIAL PRIMARY KEY,
	usu_usuario VARCHAR(40) NOT NULL UNIQUE,
	usu_contra VARCHAR(40) NOT NULL
);

CREATE TABLE usu_not (
	uno_coduno INT PRIMARY KEY,
	usu_codusu INT NOT NULL references usuarios(usu_codusu),
	not_codnot INT NOT NULL references usuarios(not_codnot ),
	uno_permisosEditar BOOLEAN NOT NULL
);

-- tabla de notas con:
-- categorias donde diras si es una nota de voz una imagen texto...
-- fecha tanto de creacion como modificacion para saber si se edita y cuando se creo
-- not_nota donde ira el texto de la nota 
-- not_notavoz es un bool donde anotaremos si tiene una nota de voz 
-- miraremos si es privada con not_public
-- podremos compartir nuestra nota a traves de una url
CREATE TABLE notas (
	not_codnot SERIAL PRIMARY KEY,
	not_nombre VARCHAR(40) NOT NULL,
	not_categoria VARCHAR(40) NOT NULL,
	not_fechaCreacion DATE NOT NULL,
	not_fechaModificacion DATE,
	not_nota JSON NOT NULL,
	not_notaVoz BOOLEAN,
    not_public BOOLEAN not null,
    not_url varchar(200)
);

-- aqui se almacenaran los archivos de las notas
create table files(
	fil_id serial primary key,
	fil_notaid integer not null references notas(not_codnot),
	fil_nombre varchar(255),
	fil_tipo varchar(255),
	fil_data bytea
);