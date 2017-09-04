create procedure spuListarFactura
as
begin
	select NroFactura, DocEntrada, c.IdCliente, c.RazonSocial as Cliente from 
	TFactura f inner join tClienteJuridico c
	on f.idCliente = c.IdCliente
end;
