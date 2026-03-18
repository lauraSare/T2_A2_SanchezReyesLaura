'use strict';

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


