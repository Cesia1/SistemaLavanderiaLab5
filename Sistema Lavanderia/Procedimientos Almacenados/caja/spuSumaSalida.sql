delimiter $
create procedure spuSumaSalida (
in aFechaInicio datetime,
in aFechaFin datetime)

begin
	select Sum(F.Total)
	from(
	select Sum(A.Cantidad*A.PrecioUnitario) as Total, B.DocSalida as Doc
	from TComprobante_Compra_Detalle A inner join TComprobante_Compra B
	on A.DocSalida=B.DocSalida
	where B.Fecha>=aFechaInicio and B.fecha<=aFechaFin
	group by B.DocSalida) F;
end $

#execute spuSumaSalida '01/07/2015','31/07/2015';
delimiter ;