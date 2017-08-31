CREATE DEFINER=`root`@`localhost` PROCEDURE `spuBuscarCliente`(
in aCampo varchar(50), 
in aContenido varchar(50))
begin
	if(aCampo='Nombres') then
		select * from TCliente  where Nombres = aContenido+'%';
	end if;
	if(aCampo='DNI') then
		select * from TCliente  where DNI = aContenido+'%';
	end if;
	if(aCampo='Apellidos') then
		select * from TCliente  where Apellidos = aContenido+'%';
	end if;
	if(aCampo='Direccion') then
		select * from TCliente  where Direccion = aContenido+'%';
	end if;
	if(aCampo='Telefono') then
		select * from TCliente  where Telefono = aContenido+'%';
	end if;
end