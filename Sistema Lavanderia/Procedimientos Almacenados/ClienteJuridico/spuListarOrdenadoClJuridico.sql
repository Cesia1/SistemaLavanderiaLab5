use dblavanderia;
delimiter $$
create procedure spuListarOrdenadoClJuridico()
begin
	select * from TClienteJuridico order by IdCliente;
end $$

