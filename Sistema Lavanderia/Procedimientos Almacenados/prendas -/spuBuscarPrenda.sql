/*Nombre:			spuBuscarPrenda
Proposito:			Busca un valor de  la Tabla TPrenda
Parametros entrada:	@campo, @contenido
Parametros salida:	Registro */

create procedure spuBuscarPrenda @Campo varchar(50), 
									  @Contenido varchar(50)
as
begin
	if(lower(@Campo)='descripcion')
	begin
		select * from Tprenda  where descripcion like @Contenido+'%'
	end
end

--drop procedure spuBuscarPrenda