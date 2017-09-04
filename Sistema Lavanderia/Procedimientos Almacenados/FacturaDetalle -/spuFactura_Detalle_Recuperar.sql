create procedure spuFactura_Detalle_Recuperar
@docEntrada varchar(6),
@nroFactura varchar(7)
as
begin
	select Descripcion, Observacion, PrecioUnitario, Cantidad, idComDetalle
	from tFactura_Detalle f inner join TPrenda p
	on f.idPrenda = p.idPrenda
	where DocEntrada = @docEntrada and NroFactura = @nroFactura
end;