/*Nombre:			spuModificarPrenda
Proposito:			Modifica valores de en la Tabla TPrenda
Parametros entrada:	@idprenda, @denominacion
Parametros salida:	---	*/

create procedure spuModificarPrenda @Idprenda int ,
									 @Descripcion varchar(50)

as
begin
	set @Descripcion = lower(@descripcion);
	if exists(select * from tprenda where @idprenda = idprenda)
	begin
		update Tprenda set descripcion = @descripcion where @idprenda = idprenda
		select CodError=0,Mensaje='Se modifico la Prenda'
	end
	else
	begin
		select CodError=1,Mensaje='No existe la prenda'
	end
end

--drop procedure spuModificarPrenda