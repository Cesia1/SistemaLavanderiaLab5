/*Nombre: spuInsertarPrenda
  Proposito: Insertar Prendas*/
  create procedure spuInsertarPrenda 
  @Descripcion varchar(50)
as
begin
	set @Descripcion = lower(@Descripcion);
	if not exists (select * from Tprenda where @Descripcion = descripcion)
	begin
		insert into tPrenda values ( @descripcion,1)
		select CodError=0, Mensaje='Se inserto Prenda'
	end
	else
	begin
		select CodError=1, Mensaje='Ya existe la Prenda' 
	end
end


--drop procedure spuInsertarCliente