use dblavanderia;
delimiter $
CREATE DEFINER=`root`@`localhost` PROCEDURE `spuInsertarCliente`(IdCliente_ varchar(6),
									DNI_ varchar(8),
									 Nombres_ varchar(25),
									 Apellidos_ varchar(50),
									 Telefono_ varchar(9),
									 Direccion_ varchar(50))
begin
	declare CodError varchar(2);
    declare Mensaje varchar(60);
	if not exists (select * from TCliente where IdCliente=@IdCliente) THEN
		insert into TCliente values ( IdCliente_,DNI_,Nombres_,Apellidos_,Telefono_, Direccion_,1);
		set CodError='1';
        set Mensaje='se inserto el cliente';
        select CodError,Mensaje;
	else
		set CodError='0';
        set Mensaje='El cliente ya existe';
        select CodError,Mensaje;
	end IF;
END $