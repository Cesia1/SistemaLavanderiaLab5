/*Nombre:			spuModificarProducto
Proposito:			Modifica valores de en la Tabla TProducto
Parametros entrada:	@idprenda, @denominacion
Parametros salida:	---	*/

create procedure spuModificarProducto @Idproducto int ,
									 @Descripcion varchar(50)

as
begin
	set @Descripcion = lower(@descripcion);
	if exists(select * from tProducto where @Idproducto = Idproducto)
	begin
		update tProducto set descripcion = @descripcion where @Idproducto = Idproducto
		select CodError=0,Mensaje='Se modifico el Producto'
	end
	else
	begin
		select CodError=1,Mensaje='No existe el producto'
	end
end

--drop procedure spuModificarProducto