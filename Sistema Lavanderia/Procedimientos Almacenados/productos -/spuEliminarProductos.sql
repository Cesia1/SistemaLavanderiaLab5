/*Nombre:			spuEliminarProducto
Proposito:			Elimina un valor de  la Tabla Tproducto
Parametros entrada:	@Idprenda
Parametros salida:	---	*/

create procedure spuEliminarProducto @Idproducto int
as
begin
	if exists (select * from tproducto where Idproducto = @Idproducto)
	begin
		delete from tproducto where Idproducto = @Idproducto
		select CodError=0,Mensaje='Se elimino el Producto'
	end
	else
	begin
		select CodError=1,Mensaje='No existe el Producto'
	end
end

--drop procedure spuEliminarProducto