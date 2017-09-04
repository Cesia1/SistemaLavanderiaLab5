create procedure spuDeshabilitarPrenda @IdPrenda int
as
begin
	update TPrenda set Estado=0 where IdPrenda=@IdPrenda
end