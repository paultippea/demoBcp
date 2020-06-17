INSERT INTO moneda (moneda, codigo, estado) VALUES( 'SOL','PEN',true); --soles
INSERT INTO moneda (moneda, codigo, estado) VALUES( 'DOLAR ESTADOUNIDENSE','USD',true); --dolares
INSERT INTO moneda (moneda, codigo, estado) VALUES( 'DOLAR CANADIENSE','CAD',true); --dolares
INSERT INTO moneda (moneda, codigo, estado) VALUES( 'DOLAR AUSTRALIANO','AUD',true); --dolares

INSERT INTO tipo_cambio (fechaCambio, idMoneda, cambio,estado) VALUES( FORMATDATETIME (NOW(),'dd/MM/yyyy'),1,1,true); --soles
INSERT INTO tipo_cambio (fechaCambio, idMoneda, cambio,estado) VALUES( FORMATDATETIME (NOW(),'dd/MM/yyyy'),2,3.48,true); --dolares
INSERT INTO tipo_cambio (fechaCambio, idMoneda, cambio,estado) VALUES(FORMATDATETIME (NOW(),'dd/MM/yyyy'),3,2.57,true); --CAD
INSERT INTO tipo_cambio (fechaCambio, idMoneda, cambio,estado) VALUES(FORMATDATETIME (NOW(),'dd/MM/yyyy'),4,2.39,true); --AUD




