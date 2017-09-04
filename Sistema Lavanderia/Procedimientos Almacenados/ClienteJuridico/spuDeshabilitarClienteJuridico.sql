use dblavanderia;
delimiter $$
create procedure spuDeshabilitarClienteJuridico (in aIdCliente varchar(20))
begin
	update TClienteJuridico set Estado=0 where IdCliente=aIdCliente;
end $$