CREATE DEFINER=`root`@`localhost` PROCEDURE `spuBuscarBoleta`(
in acampo varchar(50),
in acontenido varchar(50))
begin
	if(acampo ='Cliente') then 
		select NroBoleta, DocEntrada, c.IdCliente, c.Nombres+' ' +c.Apellidos  as Cliente from 
		tBoleta b inner join tCliente c
		on b.idCliente = c.IdCliente
		where Nombres = acontenido + '%d' or apellidos = acontenido + '%d' ;
        end if;
	if(acampo = 'NroComprobante') then 
		select NroBoleta, DocEntrada, c.IdCliente, c.Nombres+' ' +c.Apellidos  as Cliente from 
		tBoleta b inner join tCliente c
		on b.idCliente = c.IdCliente
		where NroBoleta = @contenido + '%d';
        end if;
	if(acampo = 'DocEntrada') then 
		select NroBoleta, DocEntrada, c.IdCliente, c.Nombres+' ' +c.Apellidos  as Cliente from 
		tBoleta b inner join tCliente c
		on b.idCliente = c.IdCliente
		where DocEntrada = acontenido + '%d';
		end if;
end