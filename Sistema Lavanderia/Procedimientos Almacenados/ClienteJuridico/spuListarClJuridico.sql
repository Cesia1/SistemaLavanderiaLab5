use dblavanderia;
delimiter $$
create procedure spuListarClJuridico() 

begin
	select * from TClienteJuridico ;
end $$

