DROP PROCEDURE IF EXISTS spuBienvenidaUsuario;  
DELIMITER $$
CREATE PROCEDURE spuBienvenidaUsuario(Usuario_ varchar(50),
									 Contrasenia_ varchar(40))  
BEGIN
    IF (exists(select * from TUsuario where Usuario=Usuario_ and Contrasenia=Contrasenia_ and Habilitado='1') )then
	 	select CodError=0, Mensaje='Bienvenido al sistema';
	else
		 select CodError=1, Mensaje='El usuario esta inabilitado';
	end IF;
END$$
DELIMITER ;


