create procedure spuListarCompraDetalle @DocSalida TDocSalida
as
begin
	select * 
	from 
	(select C.Usuario,D.DocSalida,C.EmpresaProveedora,C.Fecha,C.Nro,C.Serie,D.Cantidad,D.IdComDetalle,D.IdProducto,D.PrecioUnitario,(D.PrecioUnitario*D.Cantidad) as Importe
	from TComprobante_Compra_Detalle D inner join TComprobante_Compra C
	on D.DocSalida=C.DocSalida 
	where D.DocSalida=@DocSalida) A inner join TProducto B
	on A.IdProducto=B.IdProducto
end