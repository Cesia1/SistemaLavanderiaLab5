create procedure spuBuscarIdProducto @Descripcion varchar(50)
as
begin
	select IdProducto from TProducto where Descripcion=@Descripcion
end