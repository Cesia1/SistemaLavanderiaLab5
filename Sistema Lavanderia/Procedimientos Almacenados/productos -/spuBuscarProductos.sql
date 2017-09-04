/*Nombre:			spuBuscarProducto
Proposito:			Busca un valor de  la Tabla TProducto
Parametros entrada:	@campo, @contenido
Parametros salida:	Registro */

create procedure spuBuscarProducto @Campo varchar(50), 
									  @Contenido varchar(50)
as
begin
	if(lower(@Campo)='descripcion')
	begin
		select * from Tproducto where descripcion like @Contenido+'%'
	end
end

--drop procedure spuBuscarProducto