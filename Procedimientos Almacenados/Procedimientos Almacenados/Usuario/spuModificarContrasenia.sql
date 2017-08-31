CREATE DEFINER=`root`@`localhost` PROCEDURE `spuModificarContrasenia`(Usuario_ varchar(50),
									Contrasenia_ varchar(8000))
begin
	declare CodError varchar (2);
    declare Mensaje varchar(40);
	if exists(select * from TUsuario where Usuario=Usuario_) THEN
		update TUsuario set Contrasenia=Contrasenia_ where Usuario=Usuario_;
        set CodError='0';
        set Mensaje='Se modifico la contrasenia';
		select CodError, Mensaje;
    else
        set CodError=1;
        set Mensaje='No existe el usuario';
		select CodError, Mensaje;
    end if;
END