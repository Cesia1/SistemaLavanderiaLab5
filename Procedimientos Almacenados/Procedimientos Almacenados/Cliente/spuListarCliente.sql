CREATE DEFINER=`root`@`localhost` PROCEDURE `spuListarCliente`()
begin
	select * from TCliente  ;
END