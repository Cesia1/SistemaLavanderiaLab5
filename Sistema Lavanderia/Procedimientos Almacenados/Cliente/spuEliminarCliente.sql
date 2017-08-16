/*Nombre:			spuEliminarCliente
Proposito:			Elimina un valor de  la Tabla TEspecialidad
Parametros entrada:	@IdEspecialidad
Parametros salida:	---	*/

DROP PROCEDURE IF EXISTS spuEliminarCliente;  
DELIMITER $$

create procedure spuEliminarCliente (IdCliente_ varchar(6))
begin
	if exists (select * from TCliente where IdCliente=IdCliente_) THEN
		delete from TCliente where IdCliente=IdCliente_;
		select CodError=0,Mensaje='Se elimino el Cliente';
	else
		select CodError=1,Mensaje='No existe el Cliente';
	end IF;
END$$
DELIMITER ;