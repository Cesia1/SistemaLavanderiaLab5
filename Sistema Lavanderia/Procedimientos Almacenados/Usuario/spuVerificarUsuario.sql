/*Nombre: spuInsertarUsuario
Proposito: Insertar un elemento a la tabla usuario*/
DROP PROCEDURE IF EXISTS spuVerificarUsuario;  
DELIMITER $$
create procedure spuVerificarUsuario (Usuario_ varchar(50),
									Contrasenia_ varchar(100))
begin
	if not exists (select * from	TUsuario where Usuario=Usuario_ and Contrasenia=Contrasenia_) then
		select CodError=0, Mensaje='El usuario existe';
	else
		select CodError=1, Mensaje='El usuario  no existe';
	end if;
END$$
DELIMITER ;
