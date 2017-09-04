create procedure spuCancelarComprobante_Factura
@docEntrada  varchar(6),
@nroFactura  varchar(6),
@fechaCancelacion datetime 
as
begin 
	update TFactura set FechaCancelacion = @fechaCancelacion
	where DocEntrada = @docEntrada and NroFactura= @nroFactura
end