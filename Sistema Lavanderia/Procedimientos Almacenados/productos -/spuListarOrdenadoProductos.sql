/*Nombre:			spuListarOrdenadoProducto
Proposito:			Lista  la Tabla TPtoducto
Parametros entrada:	---
Parametros salida:	Registro */

create procedure spuListarOrdenadoProducto
as
begin
	select * from TProducto order by descripcion
end

