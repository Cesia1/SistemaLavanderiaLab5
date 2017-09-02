CREATE DEFINER=`root`@`localhost` PROCEDURE `spuDevolverCargo`(Usuario_ varchar(50))
begin
	select Cargo from TUsuario where Usuario=Usuario_;
END