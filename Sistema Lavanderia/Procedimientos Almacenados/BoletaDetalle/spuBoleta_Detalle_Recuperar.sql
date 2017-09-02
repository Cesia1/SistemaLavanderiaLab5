use dblavanderia;
delimiter $
create procedure spuBoleta_Detalle_Recuperar(
in adocEntrada varchar(6),
in anroBoleta varchar(6))

begin
	select Descripcion, Observacion, PrecioUnitario, Cantidad, idComDetalle
	from tBoleta_Detalle b inner join TPrenda p
	on b.idPrenda = p.idPrenda
	where DocEntrada = adocEntrada and NroBoleta = anroBoleta;
end $
