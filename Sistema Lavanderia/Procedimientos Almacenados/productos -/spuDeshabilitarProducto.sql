create procedure spuDeshabilitarProducto @IdProducto int
as
begin
	update TProducto set Estado=0 where IdProducto=@IdProducto
end