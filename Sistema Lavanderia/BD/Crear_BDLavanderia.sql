-- Script para crear el esquema permanente, encargado de crear la base de dato por procedimiento almacenado

create schema permanent;
-- nos ubivamos en el esquema
USE permanent;

-- llamamos al procedimiento almacenado para crear la base de datos
call spuCrearBD('DBLavanderia');
-- returns col1 DATABASE_CREATED
call spuCrearBD('DBLavanderia');
-- returns col1 DATABASE_EXIST
