DROP PROCEDURE IF EXISTS spuGenerarCodigoEntrada;  
DELIMITER $$
create procedure spuGenerarCodigoEntrada()
begin
	declare _ultBoleta int;
	declare _ultFactura int;
	declare _Sgte varchar(6);
	set _ultBoleta=(select Max(cast(right(DocEntrada,5)as UNSIGNED)+1) from tBoleta);
	set _ultFactura=(select Max(cast(right(DocEntrada,5)as UNSIGNED)+1) from tFactura);
	if(_ultBoleta is null and _ultFactura is null) THEN
		set _Sgte='E00001';
	else if(_ultFactura is null )
	THEN
		select _Sgte = 'E'+right(replace(str(_ultBoleta,5),' ',0),5);
	else if(_ultBoleta is null)
	THEN
		select _Sgte = 'E'+right(replace(str(_ultFactura,5),' ',0),5);
	else 
		if(_ultBoleta > _ultFactura) THEN
			select _Sgte = 'E'+right(replace(str(_ultBoleta,5),' ',0),5);
		else
			select _Sgte = 'E'+right(replace(str(_ultFactura,5),' ',0),5);
	end IF;
    END IF;
    END IF;
    END IF;
	select _Sgte as codigo; 
END$$
DELIMITER ;