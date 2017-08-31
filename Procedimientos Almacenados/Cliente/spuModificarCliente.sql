/*Nombre: spuInsertarCliente 
  Proposito: Insertar Cliente*/
DROP PROCEDURE IF EXISTS spuModificarCliente;  
DELIMITER $$
/*Nombre:			spuModificarCliente
Proposito:			Medifica valores de en la Tabla TEspecialidad
Parametros entrada:	@IdEspecialida, @Denominacion
Parametros salida:	---	*/

create procedure spuModificarCliente (IdCliente varchar(6),
									 DNI_ varchar(8),
									 Nombres_ varchar(25),
									 Apellidos_ varchar(50),
									 Telefono_ varchar(9),
									 Direccion_ varchar(50))
begin
	if exists(select * from TCliente where IdCliente=IdCliente_) THEN
		update TCliente set Nombres=Nombres_, DNI=DNI_, Apellidos=Apellidos_,Direccion=Direccion_,Telefono=Telefono_ where IdCliente=IdCliente_;
		select CodError=0,Mensaje='Se modifico el Cliente';
	else
		select CodError=1,Mensaje='No existe el Cliente';
	end IF;

END$$
DELIMITER ;