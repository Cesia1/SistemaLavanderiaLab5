use dblavanderia;
delimiter $
create procedure spuSacarBackup (
in aDireccion varchar(8000),
in aNombre varchar(8000))
                                
begin
	BACKUP DATABASE DBLavanderia
	TO DISK = aDireccion
	   WITH FORMAT,
		  MEDIANAME = aNombre,
		  NAME = aNombre;
end $