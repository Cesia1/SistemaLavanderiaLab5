create procedure spuFactura_Detalle_Insertar
@DocEntrada varchar(6),
@Cantidad numeric, 
@PrecioUnitario numeric, 
@IdPrenda int, 
@Observacion varchar(200),
@nroFactura varchar(6)
as
begin
	--if(not exists (select  * from TFactura_Detalle where @DocEntrada = DocEntrada))
	--begin
		insert into TFactura_Detalle (DocEntrada,Cantidad, PrecioUnitario, IdPrenda, Observacion, nrofactura) values (@DocEntrada, @Cantidad, @PrecioUnitario, @IdPrenda, @Observacion, @nroFactura)
		select Mensaje = 'Se registro factura detalle Exitosamente', codError = '0'
	--end
	--else
		--select Mensaje = 'Ya existe factura detalle con el mismo numero de documento de entrada', codError = '1'
end;

--drop  procedure spuFactura_Detalle_Insertar