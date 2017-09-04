create procedure spuEntregarComprobante_Factura
@docEntrada  varchar(6),
@nroFactura  varchar(6),
@fechaEmision datetime 
as
begin 
	update TFactura set Entregado = 1, FechaEmision = @fechaEmision
	where DocEntrada = @docEntrada and NroFactura= @nroFactura
end