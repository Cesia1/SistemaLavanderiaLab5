CREATE DEFINER=`root`@`localhost` PROCEDURE `spuDeshabilitarCliente`(in aIdCliente varchar(10))
begin
	update TCliente set Estado=0 where IdCliente=aIdCliente;
end