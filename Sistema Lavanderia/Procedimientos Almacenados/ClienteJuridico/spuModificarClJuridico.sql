use dblavanderia;
delimiter $$
create procedure spuModificarClJuridico (
in aIdCliente varchar(20),
in aRUC varchar(25),
in aRazonSocial varchar(50),
in aTelefono varchar(9),
in aDireccion varchar(50),
in aRubro varchar(50))

begin
	declare coderror varchar(2);
    declare mensaje varchar(60);
	if exists(select * from TClienteJuridico where IdCliente=aIdCliente) then
		update TClienteJuridico set RUC=arUC, RazonSocial=aRazonSocial, Direccion=aDireccion,Telefono=aTelefono, Rubro=aRubro where IdCliente=aIdCliente;
		set CodError="1";
        set Mensaje='Se modifico la Emprea';
        select CodError,Mensaje;
	else
        set CodError='0';
        set Mensaje='No existe la Empresa';
		select coderror,mensaje;
	end if;
end $$


