use dblavanderia;
delimiter $
CREATE DEFINER=`root`@`localhost` PROCEDURE `spuListarOrdenadoCliente`()
begin
	select * from TCliente order by IdCliente;
END $