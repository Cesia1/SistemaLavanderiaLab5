/*Nombre:			spuListarOrdenadoConsultorio
Proposito:			Lista  la Tabla TEspecialidad
Parametros entrada:	---
Parametros salida:	Registro */

DROP PROCEDURE IF EXISTS spuListarOrdenadoCliente;  
DELIMITER $$

create procedure spuListarOrdenadoCliente()
begin
	select * from TCliente order by IdCliente;
END$$
DELIMITER ;