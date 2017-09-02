CREATE DEFINER=`root`@`localhost` PROCEDURE `spuInsertarUsuario`(DNI_ varchar(8),
									   Nombres_ varchar(25),
									   Apellidos_ varchar(50),
									   Telefono_ varchar(9),
									   Direccion_ varchar(50),
									   Cargo_ varchar(20),
									   Contrasenia_ varchar(100),
									   Correo_ varchar(50),
									   Usuario_ varchar(50))
begin
	declare CodError varchar(2);
    declare Mensaje varchar(40);
	if not exists (select * from TUsuario where Usuario=Usuario_) then
		insert into TUsuario values ( DNI_,Apellidos_,Nombres_,Telefono_, Direccion_,Usuario_,Contrasenia_,1,Correo_,Cargo_);
        set CodError='0';
        set Mensaje='Se inserto Usuario';
	else
        set CodError='1';
        set Mensaje='Ya existe la Usuario' ;
	end if;
    select CodError, Mensaje;
END