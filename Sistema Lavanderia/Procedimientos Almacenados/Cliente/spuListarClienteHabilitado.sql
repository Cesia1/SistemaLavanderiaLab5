use dblavanderia;
delimiter $
CREATE DEFINER=`root`@`localhost` PROCEDURE `spuListarClienteHabilitado`()
begin
	select * from TCliente where Estado=1;
END $