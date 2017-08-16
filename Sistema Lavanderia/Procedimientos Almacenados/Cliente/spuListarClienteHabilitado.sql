/*Nombre:			spuListarCliente
Parametros entrada:	---
Parametros salida:	Registro */
DROP PROCEDURE IF EXISTS spuListarClienteHabilitado;  
DELIMITER $$
create procedure spuListarClienteHabilitado()
begin
	select * from TCliente where Estado=1;
END$$
DELIMITER ;