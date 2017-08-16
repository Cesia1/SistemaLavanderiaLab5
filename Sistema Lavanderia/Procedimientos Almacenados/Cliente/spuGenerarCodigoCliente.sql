/*Nombre:			spuGenerarCodigoCliente
Proposito:			Genera Codigos para los clientes
Parametros entrada:	Ninguno
Parametros salida:	---	*/

DROP PROCEDURE IF EXISTS spuGenerarCodigoCliente;  
DELIMITER $$

create procedure spuGenerarCodigoCliente()
begin
	declare ultimo_ int;
	declare Sgte_ varchar(6);
	set ultimo_=(SELECT max(cast(right(IdCliente,5) as UNSIGNED)+1) from TCliente);
	if (ultimo_ is null) then
		set @Sgte='P00001';
	else
		set @Sgte=(select 'P'+right(replace(str(@ultimo,5),' ',0),5));
	end if;
	select @Sgte;
END$$
DELIMITER ;