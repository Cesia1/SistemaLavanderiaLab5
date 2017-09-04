create procedure spuFactura_Insertar
@DocEntrada varchar(6), 
@Usuario varchar(50),
@IdCliente varchar(6),
@nroFactura varchar(6)

as
begin
	if(not exists (select  * from TFactura where @DocEntrada = DocEntrada))
	begin
		insert into tfactura (DocEntrada,Usuario, IdCliente, NroFactura) values (@DocEntrada, @Usuario, @IdCliente, @nroFactura)
		select Mensaje = 'Se registro factura Exitosamente', codError = '0'
	end
	else
		select Mensaje = 'Ya existe factura con el mismo numero de documento de entrada', codError = '1'
end;

--drop procedure spuFactura_Insertar