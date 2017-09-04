use dblavanderia;
delimiter $$
create procedure spuGenerarCodigoClJuridico()
begin
	declare aultimo int;
	declare aSgte varchar(6);
	set aultimo=(select Max(cast (right(IdCliente,5))+1) from TClienteJuridico);
	if (aultimo is null) then
		set aSgte='J00001';
	else
		set aSgte=(select 'J'+right(replace(str(@ultimo,5),' ',0),5));
	end if;
    select asgte;
end
