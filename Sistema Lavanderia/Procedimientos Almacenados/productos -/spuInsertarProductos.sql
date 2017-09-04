/*Nombre: spuInsertarProducto
  Proposito: Insertar Productos*/
  create procedure spuInsertarProducto
  @Descripcion varchar(50)
as
begin
	set @Descripcion = lower(@Descripcion);
	if not exists (select * from Tproducto where @Descripcion = descripcion)
	begin
		insert into tProducto values ( @descripcion,1)
		select CodError=0, Mensaje='Se inserto Producto'
	end
	else
	begin
		select CodError=1, Mensaje='Ya existe la Producto' 
	end
end


--drop procedure spuInsertarProducto