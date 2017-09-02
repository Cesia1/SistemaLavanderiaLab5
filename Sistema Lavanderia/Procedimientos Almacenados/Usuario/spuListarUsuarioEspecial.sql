use dblavanderia;
delimiter $
CREATE DEFINER=`root`@`localhost` PROCEDURE `spuListarUsuarioEspecial`()
begin
	select * from TUsuario;
END $