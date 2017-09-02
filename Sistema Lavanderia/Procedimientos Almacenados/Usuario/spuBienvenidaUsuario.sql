CREATE DEFINER=`root`@`localhost` PROCEDURE `spuBienvenidaUsuario`(in Usuario_ varchar(50),
									 in Contrasenia_ varchar(40))
BEGIN
	declare CodError varchar(2);
    declare Mensaje varchar(60);
    IF (exists(select * from TUsuario where Usuario=Usuario_ and Contrasenia=Contrasenia_ and Habilitado='1') )then
	 	set CodError='0';
        set Mensaje='Bienvenido al sistema';
        select CodError,Mensaje;
	else
		set CodError='0';
        set Mensaje='El usuario esta inhabilitado';
        select CodError,Mensaje;
	end IF;
END