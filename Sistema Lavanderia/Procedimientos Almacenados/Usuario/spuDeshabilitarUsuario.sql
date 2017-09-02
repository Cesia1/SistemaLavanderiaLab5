CREATE DEFINER=`root`@`localhost` PROCEDURE `spuDeshabilitarUsuario`(Usuario_ varchar(50))
begin
	update TUsuario set Habilitado=0 where Usuario=Usuario_;
END