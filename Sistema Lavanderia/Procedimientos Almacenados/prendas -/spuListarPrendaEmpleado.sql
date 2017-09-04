/*Nombre:			spuListarPrenda
Parametros entrada:	---
Parametros salida:	Registro */

create procedure spuListarPrendaEmpleado
as
begin
	select * from Tprenda where Estado=1
end

