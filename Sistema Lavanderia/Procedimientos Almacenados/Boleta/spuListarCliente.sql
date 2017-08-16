/*Nombre:			spuListarCliente
Parametros entrada:	---
Parametros salida:	Registro */
delimiter $
create procedure spuListarCliente()
begin
	select * from TCliente;  
end $
delimiter ;
