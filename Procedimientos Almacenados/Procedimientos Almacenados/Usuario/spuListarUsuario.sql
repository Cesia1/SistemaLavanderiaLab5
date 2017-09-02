CREATE DEFINER=`root`@`localhost` PROCEDURE `spuListarUsuario`()
begin
	select DNI,Apellidos,Nombres,Telefono,Direccion,Correo,Cargo,Habilitado from TUsuario  ;

END