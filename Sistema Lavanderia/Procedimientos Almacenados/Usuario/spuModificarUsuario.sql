use dblavanderia;
delimiter $
CREATE DEFINER=`root`@`localhost` PROCEDURE `spuModificarUsuario`(Usuario_ varchar(50),
									 Nombres_ varchar(25),
									 Apellidos_ varchar(50),
									 Telefono_ varchar(9),
									 Direccion_ varchar(25),
									 Habilitado_ bit)
begin
	declare CodError varchar(2);
    declare Mensaje varchar(40);
	if exists(select * from TUsuario where Usuario=Usuario_) THEN
		update TUsuario set Nombres=Nombres_,  Apellidos=Apellidos_,Direccion=Direccion_,Telefono=Telefono_, Habilitado=Habilitado_ where Usuario=Usuario_;
		
        set CodError='1';
        set Mensaje='Se modifico el Usuario';
        select CodError,Mensaje;
	else
		set CodError='0';
        set Mensaje='El usuario no existe';
        select CodError,Mensaje;
	end IF;
END $