/*'use strict';

const mysql = require('mysql2');

const conexion = mysql.createConnection({
    host: 'localhost', 
    user: 'laura', 
    password: 'laura', 
    database: 'BD_Express_2026', 
});


conexion.connect( function(err){
    if(err)
        throw err;
    console.log('Conexión BD Exitosa!!')
});

module.exports = conexion;


*/
'use strict';

const mysql = require('mysql2');

const conexion = mysql.createConnection({
    host: 'b4nqdcelzbjfezqnlfun-mysql.services.clever-cloud.com', 
    user: 'ufwz3lvsbfytcppw', 
    password: '408lAAQxnbEnjLApp335', 
    database: 'b4nqdcelzbjfezqnlfun',
    port: 3306
});

conexion.connect(function(err){
    if(err)
        throw err;
    console.log('Conexión BD Exitosa!!')
});

module.exports = conexion;