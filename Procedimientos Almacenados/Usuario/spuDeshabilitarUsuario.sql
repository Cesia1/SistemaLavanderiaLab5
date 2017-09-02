DROP PROCEDURE IF EXISTS spuDeshabilitarUsuario;  
DELIMITER $$
create procedure spuDeshabilitarUsuario (Usuario_ varchar(50))
begin
	update TUsuario set Habilitado=0 where Usuario=Usuario_;
END$$
DELIMITER ;