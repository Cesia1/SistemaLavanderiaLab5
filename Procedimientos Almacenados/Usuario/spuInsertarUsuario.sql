/*Nombre: spuInsertarUsuario 
  Proposito: Insertar Usuario*/
DROP PROCEDURE IF EXISTS spuInsertarUsuario;  
DELIMITER $$
create procedure spuInsertarUsuario  (DNI_ varchar(8),
									   Nombres_ varchar(25),
									   Apellidos_ varchar(50),
									   Telefono_ varchar(9),
									   Direccion_ varchar(50),
									   Cargo_ varchar(20),
									   Contrasenia_ varchar(100),
									   Correo_ varchar(50),
									   Usuario_ varchar(50))
begin
	if not exists (select * from TUsuario where Usuario=Usuario_) then
		insert into TUsuario values ( DNI_,Apellidos_,Nombres_,Telefono_, Direccion_,Usuario_,Contrasenia_,1,Correo_,Cargo_);
		select CodError=0, Mensaje='Se inserto Usuario';
	else
		select CodError=1, Mensaje='Ya existe la Usuario' ;
	end if;
END$$
DELIMITER ;
