create procedure spuInsertarCompraDetalle @Cantidad int,
										  @PrecioUnitario numeric(15,2),
										  @IdProducto int,
										  @DocSalida TDocSalida
as
begin
	if not exists (select * from TComprobante_Compra_Detalle where DocSalida=@DocSalida and IdProducto=@IdProducto)
	begin
		insert into TComprobante_Compra_Detalle values ( @PrecioUnitario,@IdProducto,@DocSalida,@Cantidad)
		select CodError=0, Mensaje='Se inserto Producto al Comprobante'
	end
	else
	begin
		select CodError=1, Mensaje='Ya existe Producto al Comprobante' 
	end
end