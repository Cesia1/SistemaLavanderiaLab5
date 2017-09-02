use dblavanderia;
delimiter $
CREATE DEFINER=`root`@`localhost` PROCEDURE `spuGenerarCodigoCliente`()
begin
	declare ultimo int;
	declare Sgte varchar(6);
	set ultimo=(SELECT max(cast(right(IdCliente,5) as UNSIGNED)+1) from TCliente);
	if (ultimo is null) then
		set Sgte='P00001';
	else
		set Sgte=(select 'P'+right(replace(str(ultimo,5),' ',0),5));
	end if;
	select Sgte;
END
$