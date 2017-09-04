use dblavanderia;
delimiter $$
create procedure spuBuscarClJuridico (in aCampo varchar(50), 
									  in aContenido varchar(50))
begin
	if(aCampo='RUC') then 
		select * from TClienteJuridico  where RUC = aContenido+'%';
	elseif(aCampo='RazonSocial') then
		select * from TClienteJuridico  where RazonSocial = aContenido+'%';
	elseif(aCampo='Direccion') then
		select * from TClienteJuridico  where Direccion = aContenido+'%';
	elseif(aCampo='Telefono') then
		select * from TClienteJuridico  where Telefono = aContenido+'%';
	else
		select * from tclientejuridico limit 0;
	end if;
end $$