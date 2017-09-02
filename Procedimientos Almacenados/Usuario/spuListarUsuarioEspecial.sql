/*Nombre:			spuListarUsuarioEspecial
Parametros entrada:	---
Parametros salida:	Registro */
DROP PROCEDURE IF EXISTS spuListarUsuarioEspecial;  
DELIMITER $$
create procedure spuListarUsuarioEspecial ()
begin
	select * from TUsuario;
END$$
DELIMITER ;
