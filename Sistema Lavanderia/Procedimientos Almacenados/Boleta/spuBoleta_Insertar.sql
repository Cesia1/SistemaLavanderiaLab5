delimiter $
create procedure spuBoleta_Insertar(
in aDocEntrada varchar(6), 
in aUsuario varchar(50),
in aIdCliente varchar(6),
in anroBoleta varchar(6))

begin
	if(not exists (select  * from TBoleta where aDocEntrada = DocEntrada)) then 
		insert into TBoleta  (DocEntrada,Usuario, IdCliente, NroBoleta) values (aDocEntrada, aUsuario, aIdCliente, anroBoleta );
		select Mensaje = 'Se registro boleta Exitosamente', codError = '0';
	else
		select Mensaje = 'Ya existe boleta con el mismo numero de documento de entrada', codError = '1';
	end if;
end 

#drop procedure spuBoleta_Insertar