CREATE DEFINER=`root`@`localhost` PROCEDURE `spuGenerarCodigoEntrada`()
begin
	declare aultBoleta int default 0;
	declare aultFactura int default 0;
	declare aSgte varchar(6) default "      ";
	set aultBoleta=(select Max(cast (right(DocEntrada,5))+1) from tBoleta);
	set aultFactura=(select Max(cast (right(DocEntrada,5))+1) from tFactura);
	if(aultBoleta is null and aultFactura is null) then
		set aSgte='E00001';
        
	else 
		if(aultFactura is null or aultBoleta is null ) then 
			if(aultFactura is null) then
				select aSgte = 'E'+right(replace(str(aultBoleta,5),' ',0),5);
			else 
				select aSgte = 'E'+right(replace(str(aultFactura,5),' ',0),5);
			end if;
		else 
			if(aultBoleta > aultFactura) then
				select aSgte = 'E'+right(replace(str(aultBoleta,5),' ',0),5);
			else
				select aSgte = 'E'+right(replace(str(aultFactura,5),' ',0),5);
			end if;
        end if;
	end if;
	select aSgte as codigo; 
	end