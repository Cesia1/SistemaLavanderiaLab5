/*Nombre:			spuModificarUsuario
Proposito:			Medifica valores de en la Tabla TEspecialidad
Parametros entrada:	@IdEspecialida, @Denominacion
Parametros salida:	---	*/
DROP PROCEDURE IF EXISTS spuModificarUsuario;  
DELIMITER $$
create procedure spuModificarUsuario (Usuario_ varchar(50),
									 Nombres_ varchar(25),
									 Apellidos_ varchar(50),
									 Telefono_ varchar(9),
									 Direccion_ varchar(25),
									 Habilitado_ bit)
begin
	if exists(select * from TUsuario where Usuario=Usuario_) THEN
		update TUsuario set Nombres=Nombres_,  Apellidos=Apellidos_,Direccion=Direccion_,Telefono=Telefono_, Habilitado=Habilitado_ where Usuario=Usuario_;
		select CodError=0,Mensaje='Se modifico el Usuario';
	else
		select CodError=1,Mensaje='No existe el Usuario';
	end IF;
END$$
DELIMITER ;
