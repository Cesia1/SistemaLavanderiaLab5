/*Nombre:			spuEliminarPrenda
Proposito:			Elimina un valor de  la Tabla Tprenda
Parametros entrada:	@Idprenda
Parametros salida:	---	*/

create procedure spuEliminarPrenda @Idprenda int
as
begin
	if exists (select * from tprenda where IdPrenda = @Idprenda)
	begin
		delete from tPrenda where IdPrenda = @Idprenda
		select CodError=0,Mensaje='Se elimino la Prenda'
	end
	else
	begin
		select CodError=1,Mensaje='No existe la Prenda'
	end
end

--drop procedure spuEliminarCliente