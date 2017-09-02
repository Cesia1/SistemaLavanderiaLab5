DROP PROCEDURE IF EXISTS spuCrearBD;  
DELIMITER $$
CREATE PROCEDURE spuCrearBD(IN pDbName VARCHAR(100))  
BEGIN
    DECLARE preExisted INT;
    DECLARE ret VARCHAR(50);

    SET ret='DATABASE_EXIST';
    SELECT COUNT(*) INTO preExisted
    FROM INFORMATION_SCHEMA.SCHEMATA
    WHERE SCHEMA_NAME=pDbName;
    IF preExisted=0 THEN
        SET @sql=CONCAT('CREATE SCHEMA ',pDbName); -- add on any other parts of string like charset etc
        PREPARE stmt1 FROM @sql;
        EXECUTE stmt1;
        DEALLOCATE PREPARE stmt1;
        -- right here you could assume it worked or take additional
        -- step to confirm it
        SET ret='DATABASE_CREATED';
    END IF;
    SELECT ret as 'Estado de la DB';
END$$
DELIMITER ;