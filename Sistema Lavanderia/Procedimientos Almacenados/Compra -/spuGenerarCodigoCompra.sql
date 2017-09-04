create procedure spuGenerarCodigoCompra
as
begin
	declare @ultimo int
	declare @Sgte varchar(6)
	set @ultimo=(select Max(cast (right(DocSalida,5)as int)+1) from TComprobante_Compra)
	if (@ultimo is null)
	begin
		set @Sgte='G00001'
	end
	else
	begin
		set @Sgte=(select 'G'+right(replace(str(@ultimo,5),' ',0),5))
	end
	select @Sgte;
	select 'G'+replace(str(max(substring(DocSalida,2,9))+1,9),' ',0) from TComprobante_Compra
end