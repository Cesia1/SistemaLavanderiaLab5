CREATE DEFINER=`root`@`localhost` PROCEDURE `spuModificarCliente`(IdCliente_ varchar(6),
									 DNI_ varchar(8),
									 Nombres_ varchar(25),
									 Apellidos_ varchar(50),
									 Telefono_ varchar(9),
									 Direccion_ varchar(50))
begin
	declare CodError varchar(2);
    declare Mensaje varchar(60);
	if exists(select * from TCliente where IdCliente=IdCliente_) THEN
		update TCliente set Nombres=Nombres_, DNI=DNI_, Apellidos=Apellidos_,Direccion=Direccion_,Telefono=Telefono_ where IdCliente=IdCliente_;
		set CodError='0';
        set Mensaje='se modifico el cliente';
        select CodError,Mensaje;
	else
		set CodError='1';
        set Mensaje='no existe el cliente';
        select CodError,Mensaje;
	end IF;

END