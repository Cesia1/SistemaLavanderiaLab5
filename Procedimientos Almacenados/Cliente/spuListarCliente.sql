/*Nombre:			spuListarCliente
Parametros entrada:	---
Parametros salida:	Registro */
DROP PROCEDURE IF EXISTS spuListarCliente;  
DELIMITER $$

create procedure spuListarCliente ()
begin
	select * from TCliente  ;
END$$
DELIMITER ;