/*Nombre:			spuListarUsuarioEspecial
Parametros entrada:	---
Parametros salida:	Registro */
DROP PROCEDURE IF EXISTS spuModificarContrasenia;  
DELIMITER $$
create procedure spuModificarContrasenia (Usuario_ varchar(50),
									Contrasenia_ varchar(8000))
begin
	if exists(select * from TUsuario where Usuario=Usuario_) THEN
		update TUsuario set Contrasenia=Contrasenia_ where Usuario=Usuario_;
		select CodError=0,Mensaje='Se modifico la contrasenia';
	else
		select CodError=1,Mensaje='No existe el usuario';
	end if;
END$$
DELIMITER ;
