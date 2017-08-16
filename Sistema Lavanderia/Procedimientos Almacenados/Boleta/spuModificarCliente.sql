/*Nombre:			spuModificarCliente
Proposito:			Medifica valores de en la Tabla TEspecialidad
Parametros entrada:	@IdEspecialida, @Denominacion
Parametros salida:	---	*/
delimiter $
create procedure spuModificarCliente( in aIdCliente TIdCliente,
									 in aDNI varchar(8),
									 in aNombres varchar(25),
									 in aApellidos varchar(50),
									 in aTelefono varchar(9),
									 in aDireccion varchar(50))

begin
	if exists(select * from TCliente where IdCliente=@IdCliente) then
		update TCliente set Nombres=aNombres, DNI=aDNI, Apellidos=aApellidos,Direccion=aDireccion,Telefono=aTelefono where IdCliente=aIdCliente;
		select CodError=0,Mensaje='Se modifico el Cliente';
	else
		select CodError=1,Mensaje='No existe el Cliente';
	end if;
end $

#drop procedure spuModificarCliente
delimiter ;