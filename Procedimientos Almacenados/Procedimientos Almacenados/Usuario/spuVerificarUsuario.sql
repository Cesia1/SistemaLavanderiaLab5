CREATE DEFINER=`root`@`localhost` PROCEDURE `spuVerificarUsuario`(IN Usuario_ varchar(50),
									IN Contrasenia_ varchar(100)
                                    )
begin
	declare CodError VARCHAR(2);
	declare Mensaje varchar(50);
	if  exists (select * from	TUsuario where Usuario=Usuario_ and Contrasenia=Contrasenia_) then
		set CodError='0';
        set Mensaje='El usuario existe';
SELECT CodError, Mensaje;
	else
		set CodError='1';
        set Mensaje='El usuario no existe';
SELECT CodError, Mensaje;
	end if;
END