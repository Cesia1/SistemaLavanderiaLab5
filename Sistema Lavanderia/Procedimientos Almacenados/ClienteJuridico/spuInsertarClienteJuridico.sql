use dblavanderia;
delimiter $$
create procedure spuInsertarClJuridico (in aIdCliente varchar(20),
									   in aRUC varchar(25),
									 in aRazonSocial varchar(50),
									 in aTelefono varchar(9),
									 in aDireccion varchar(50),
									 in aRubro varchar(50))
begin
	declare coderror varchar(2);
    declare mensaje varchar(60);
	if not exists (select * from TClienteJuridico where IdCliente=aIdCliente) then
		insert into TClienteJuridico values ( aIdCliente,aRUC,aRazonSocial,aTelefono, aDireccion,1,aRubro);
        set CodError='1';
        set Mensaje='Se inserto Empresa';
	else
        set CodError='0';
        set Mensaje='Ya existe la Empresa'; 
	end if;
    select coderror,mensaje;
end $$

