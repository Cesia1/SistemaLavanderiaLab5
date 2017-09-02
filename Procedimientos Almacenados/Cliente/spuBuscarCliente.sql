/*Nombre:			spuBuscarCliente
Proposito:			Busca un valor de  la Tabla TEspecialidad
Parametros entrada:	@IdEspecialidad
Parametros salida:	Registro */

DROP PROCEDURE IF EXISTS spuBuscarCliente;  
DELIMITER $$
create procedure spuBuscarCliente (Campo_ varchar(50), 
									  Contenido_ varchar(50))
begin
	if(Campo_='Nombres') then
		select * from TCliente  where Nombres regexp Contenido_+'%';
	end if;
	if(Campo_='DNI') then
		select * from TCliente  where DNI regexp Contenido_+'%';
	end if;
	if(Campo_='Apellidos') then
		select * from TCliente  where Apellidos regexp Contenido_+'%';
	end if;
	if(Campo_='Direccion') then
		select * from TCliente  where Direccion regexp Contenido_+'%';
	end if;
	if(Campo_='Telefono') then
		select * from TCliente  where Telefono regexp Contenido_+'%';
	end if;
END$$
DELIMITER ;