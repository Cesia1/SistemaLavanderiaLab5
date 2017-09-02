use dblavanderia;
delimiter $
create procedure spuBoleta_Detalle_Insertar(
in aDocEntrada varchar(6),
in aCantidad numeric, 
in aPrecioUnitario numeric, 
in aIdPrenda int, 
in aObservacion varchar(200),
in anroBoleta varchar(6))

begin
	declare mensaje varchar(50) default 'No se registro la boleta';
    declare coderror varchar(2) default '0';
	insert into TBoleta_Detalle (DocEntrada,Cantidad, PrecioUnitario, IdPrenda, Observacion, NroBoleta) 
		values (aDocEntrada, aCantidad, aPrecioUnitario, aIdPrenda, aObservacion, anroBoleta );
	set mensaje = 'Se registro boleta detalle Exitosamente';
	set coderror = '1';
	select coderror,mensaje;
	
end $;

delimiter ;