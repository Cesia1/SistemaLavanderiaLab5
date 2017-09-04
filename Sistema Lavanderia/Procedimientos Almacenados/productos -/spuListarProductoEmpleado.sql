/*Nombre:			spuListarProducto
Parametros entrada:	---
Parametros salida:	Registro */

create procedure spuListarProductoEmpleado
as
begin
	select * from Tproducto where Estado=1
end

