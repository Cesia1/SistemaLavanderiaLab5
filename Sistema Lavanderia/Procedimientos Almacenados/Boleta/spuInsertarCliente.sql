delimiter $
/*Nombre: spuInsertarCliente 
  Proposito: Insertar Cliente*/
  create procedure spuInsertarCliente (in aIdCliente TIdCliente,
									   in aDNI varchar(8),
									   in aNombres varchar(25),
									   in taApellidos varchar(50),
									   in aTelefono varchar(9),
									   in aDireccion varchar(50))
begin
	if not exists (select * from TCliente where IdCliente=@IdCliente) then
		insert into TCliente values ( aIdCliente,aDNI,aNombres,aApellidos,aTelefono, aDireccion,1);
		select CodError=0, Mensaje='Se inserto Cliente';
	else

		select CodError=1, Mensaje='Ya existe la Cliente' ;
	end if;
end $

#-drop procedure spuInsertarCliente
delimiter ;