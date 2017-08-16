/*Nombre:			spuListarOrdenadoConsultorio
Proposito:			Lista  la Tabla TEspecialidad
Parametros entrada:	---
Parametros salida:	Registro */
delimiter $
create procedure spuListarOrdenadoCliente()
begin
	select * from TCliente order by IdCliente;
end $ 
delimiter ;

