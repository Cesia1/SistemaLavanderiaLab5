delimiter $
create procedure spuGenerarCodigoCliente()

begin
	declare aultimo int default 0;
	declare asgte varchar(6) default "";
	set aultimo=(select Max(cast (right(IdCliente,5))+1) from TCliente);
	if (aultimo is null) then
		set asgte='P00001';
	else
		set asgte=(select 'P'+right(replace(str(aultimo,5),' ',0),5));
	end if;
	select asgte;
end $
#drop procedure spuGenerarCodigoCliente

#execute spuGenerarCodigoCliente
delimiter ;