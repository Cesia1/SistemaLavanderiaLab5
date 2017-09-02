
use dblavanderia;
delimiter $
CREATE DEFINER=`root`@`localhost` PROCEDURE `spuEliminarCliente`(in aIdCliente varchar(10))
begin
	declare CodError varchar(2);
    declare Mensaje varchar(60);
	if exists (select * from TCliente where IdCliente=aIdCliente) then
		delete from TCliente where IdCliente=aIdCliente;
		set CodError='1';
        set Mensaje='se elimino el cliente';
        select CodError,Mensaje;
	else
		set CodError='0';
        set Mensaje='No existe el cliente';
        select CodError,Mensaje;
	end if;
end $