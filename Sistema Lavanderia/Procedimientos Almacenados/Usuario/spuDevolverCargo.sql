DROP PROCEDURE IF EXISTS spuDevolverCargo;  
DELIMITER $$
create procedure spuDevolverCargo (Usuario_ varchar(50))
begin
	select Cargo from TUsuario where Usuario=Usuario_;
END$$
DELIMITER ;