create  procedure spuInsertarCompra @DocSalida TDocSalida,
								   @Nro varchar(15),
								   @Serie varchar(15),
								   @Fecha datetime,
								   @Usuario varchar(50),
								   @Empresa varchar(50)
as
begin
	if not exists (select * from TComprobante_Compra where DocSalida=@DocSalida)
	begin
		insert into TComprobante_Compra values ( @DocSalida,@Nro,@Serie,@Fecha,@Usuario,@Empresa)
		select CodError=0, Mensaje='Se inserto Comprobante de Compra'
	end
	else
	begin
		select CodError=1, Mensaje='Ya existe un Comprobante de Compra con el mismo nro' 
	end
end