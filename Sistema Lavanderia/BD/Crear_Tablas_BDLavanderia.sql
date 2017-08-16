/*Activar la Base de datos DBAlmacenes*/
use DBLavanderia;

/*Crear las tablas*/

create table TCliente(
	IdCliente varchar(6) not null,
	DNI varchar(8) not null,
	Nombres varchar(25),
	Apellidos varchar(50),
	Telefono varchar(9),
	Direccion varchar(25),
	Primary key (IdCliente)
);

create table TUsuario (
	DNI varchar(8) not null,
	Apellidos varchar(50),
	Nombres varchar(25),
	Telefono varchar(9),
	Direccion varchar(25),
	Usuario varchar(50) not null,
	Contrasenia varchar(100)not null,
	Habilitado bit,
	Correo varchar(50)not null,
	Cargo varchar(20),
	Primary key(Usuario)
);


create table TTicket(
	CodTicket varchar(6) not null,
	FechaIngreso Datetime not null,
	FechaRecogo datetime not null,
	IdCliente varchar(6) not null,
	primary key (CodTicket),
	foreign key (IdCliente) references TCliente(IdCliente)
);

create table TTicket_Detalle(
	CodTicketDetalle int auto_increment not null,
	Color varchar(12),
	Cantidad numeric(15,2),
	Material varchar(12),
	TipoLavado varchar(7) check (TipoLavado in ('SECO', 'VAPOR', 'NORMAL')),
	Prenda varchar(20),
	DescripcionPrenda varchar(100),
	Precio decimal(10,2),
	CodTicket varchar(6) not null,
	primary key ( CodTicketDetalle),
	foreign key (CodTicket) references TTicket(CodTicket)
);

create table TComprobante(
	DocEntrada varchar (6) not null,
	CodBoleta varchar(6) not null,
	Nro varchar(15),
	Serie varchar(15),
	Fecha Datetime,
	CodTicket varchar(6) not null,
	DNI varchar(8) not null,
	primary key (DocEntrada, CodBoleta),
	foreign key(CodTicket) references TTicket(CodTicket)
);

create table TComprobante_Detalle(
	DocEntrada varchar(6) not null,
	CodBoleta varchar(6) not null,
	IdComDetalle int NOT null,
	Cantidad numeric(15,2),
	PrecioUnitario numeric(15,2),
	primary key (DocEntrada,IdComDetalle,CodBoleta),
	foreign key (DocEntrada,CodBoleta) references TComprobante(DocEntrada,CodBoleta)
);


create table TComprobante_Compra(
	DocSalida varchar(6) not null,
	Nro varchar(15),
	Serie varchar(15),
	primary key(DocSalida)
);

create table TComprobante_Compra_Detalle(
	CodComDetalle int auto_increment not null,
	Cantidad numeric(15,2),
	PrecioUnitario numeric(15,2),
	DocSalida varchar(6) not null,
	primary key(DocSalida, CodComDetalle),
	foreign key(DocSalida) references TComprobante_Compra
)ENGINE=MyISAM;

