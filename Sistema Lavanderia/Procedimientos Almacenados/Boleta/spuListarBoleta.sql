use dblavanderia;
delimiter $
CREATE DEFINER=`root`@`localhost` PROCEDURE `spuListarBoleta`()
begin
	select NroBoleta, DocEntrada, c.IdCliente, c.Nombres+' ' +c.Apellidos  as Cliente from 
	tBoleta b inner join tCliente c
	on b.idCliente = c.IdCliente;
end $