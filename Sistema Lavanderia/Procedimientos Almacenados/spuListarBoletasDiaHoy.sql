use dblavanderia;
delimiter $$
create procedure spuListarBoletasDiaHoy (in aFecha datetime)

begin
	select * from tboleta 
    where fecha=afehca;
end $$