/*Nombre:			spuListarCliente
Parametros entrada:	---
Parametros salida:	Registro */
delimiter $
create procedure spuListarClienteHabilitado()
begin
	select * from TCliente where Estado=1;  
end $
delimiter ;
