create procedure spuBuscarFactura
@campo varchar(50),
@contenido varchar(50)
as
begin
	if(@campo ='Cliente')
		select NroFactura, DocEntrada, c.IdCliente, c.RazonSocial as Cliente from 
		TFactura f inner join tClienteJuridico c
		on f.idCliente = c.IdCliente
		where c.razonSocial like @contenido + '%d'
	else if(@campo = 'NroComprobante')
		select NroFactura, DocEntrada, c.IdCliente, c.RazonSocial as Cliente from 
		TFactura f inner join tClienteJuridico c
		on f.idCliente = c.IdCliente
		where NroFactura like @contenido + '%d'
	else if(@campo = 'DocEntrada')
		select NroFactura, DocEntrada, c.IdCliente, c.RazonSocial as Cliente from 
		TFactura f inner join tClienteJuridico c
		on f.idCliente = c.IdCliente
		where DocEntrada like @contenido + '%d'


end;