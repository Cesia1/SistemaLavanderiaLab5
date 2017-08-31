/*Nombre: spuInsertarCliente 
  Proposito: Insertar Cliente*/
DROP PROCEDURE IF EXISTS spuInsertarCliente;  
DELIMITER $$

create procedure spuInsertarCliente (IdCliente_ varchar(6),
									DNI_ varchar(8),
									 Nombres_ varchar(25),
									 Apellidos_ varchar(50),
									 Telefono_ varchar(9),
									 Direccion_ varchar(50))
begin
	if not exists (select * from TCliente where IdCliente=@IdCliente) THEN
		insert into TCliente values ( IdCliente_,DNI_,Nombres_,Apellidos_,Telefono_, Direccion_,1);
		select CodError=0, Mensaje='Se inserto Cliente';
	else
		select CodError=1, Mensaje='Ya existe la Cliente' ;
	end IF;
END$$
DELIMITER ;