create procedure spuBuscarCompras @Usuario varchar(50)
as
begin
	select * from TComprobante_Compra where usuario=@Usuario
end
