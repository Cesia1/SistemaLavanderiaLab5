/*Nombre:			spuDeshabilitarCliente
Proposito:			Deshabilitar Clientes
Parametros entrada:	IdCliente
Parametros salida:	Sin Salida */

DROP PROCEDURE IF EXISTS spuDeshabilitarCliente;  
DELIMITER $$
create procedure spuDeshabilitarCliente (IdCliente_ varchar(6))
begin
	update TCliente set Estado=0 where IdCliente=IdCliente;
END$$
DELIMITER ;