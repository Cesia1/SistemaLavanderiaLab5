use dblavanderia
delimiter $$
create procedure spuListarClJuridicoEmpleado ()
begin
	select * from TClienteJuridico where Estado=1;
end $$

