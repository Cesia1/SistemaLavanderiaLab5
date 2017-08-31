/*Nombre:			spuListarUsuario
Parametros entrada:	---
Parametros salida:	Registro */
DROP PROCEDURE IF EXISTS spuListarUsuario;  
DELIMITER $$

create procedure spuListarUsuario()
begin
	select DNI,Apellidos,Nombres,Telefono,Direccion,Correo,Cargo,Habilitado from TUsuario  ;

END$$
DELIMITER ;
