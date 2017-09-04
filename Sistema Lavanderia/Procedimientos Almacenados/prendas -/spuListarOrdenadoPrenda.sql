/*Nombre:			spuListarOrdenadoPrenda
Proposito:			Lista  la Tabla TPrenda
Parametros entrada:	---
Parametros salida:	Registro */

create procedure spuListarOrdenadoPrenda
as
begin
	select * from TPrenda order by descripcion
end

