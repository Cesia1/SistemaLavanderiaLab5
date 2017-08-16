delimiter $
create procedure spuBoleta_Detalle_Insertar(
in aDocEntrada varchar(6),
in aCantidad numeric, 
in aPrecioUnitario numeric, 
in aIdPrenda int, 
in aObservacion varchar(200),
in anroBoleta varchar(6))

begin
	#if(not exists (select  * from TBoleta_Detalle where @DocEntrada = DocEntrada))
	#begin
		insert into TBoleta_Detalle (DocEntrada,Cantidad, PrecioUnitario, IdPrenda, Observacion, NroBoleta) values (aDocEntrada, aCantidad, aPrecioUnitario, aIdPrenda, aObservacion, anroBoleta );
		select Mensaje = 'Se registro boleta detalle Exitosamente', codError = '0';
	#end
	#else
		#select Mensaje = 'Ya existe boleta detalle con el mismo numero de documento de entrada', codError = '1'
end $;

#drop procedure spuBoleta_Detalle_Insertar
delimiter ;