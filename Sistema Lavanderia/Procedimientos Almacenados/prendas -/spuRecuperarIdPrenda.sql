create procedure spuRecuperarIdPrenda 
@descripcion varchar(200)
as
begin
	select  IdPrenda from  tPrenda
	where @descripcion = Descripcion
end;

--drop procedure spuRecuperarIdPrenda