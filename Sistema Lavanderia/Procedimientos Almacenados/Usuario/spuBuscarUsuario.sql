CREATE DEFINER=`root`@`localhost` PROCEDURE `spuBuscarUsuario`(Campo_ varchar(50), 
									  Contenido_ varchar(50))
begin
	if(Campo_='Nombres') then
		select DNI,Apellidos,Nombres,Telefono,Direccion,Correo,Cargo,Habilitado  from TUsuario  where Nombres REGEXP Contenido_+'%';
	end if;
	if(Campo_='DNI') then
		select DNI,Apellidos,Nombres,Telefono,Direccion,Correo,Cargo,Habilitado  from TUsuario  where DNI REGEXP  Contenido_+'%';
	end if;
	if(Campo_='Apellidos') then
		select DNI,Apellidos,Nombres,Telefono,Direccion,Correo,Cargo,Habilitado  from TUsuario  where Apellidos REGEXP Contenido_+'%';
	end if;
	if(Campo_='Direccion') then
		select DNI,Apellidos,Nombres,Telefono,Direccion,Correo,Cargo,Habilitado  from TUsuario  where Direccion REGEXP Contenido_+'%';
	end if;
	if(Campo_='Telefono') then
		select DNI,Apellidos,Nombres,Telefono,Direccion,Correo,Cargo,Habilitado  from TUsuario  where Telefono REGEXP Contenido_+'%';
	end if;
	if(Campo_='Correo') then
		select DNI,Apellidos,Nombres,Telefono,Direccion,Correo,Cargo,Habilitado  from TUsuario  where Correo REGEXP Contenido_+'%';
	end if;
END