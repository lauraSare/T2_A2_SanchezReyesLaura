'use strict';

const conexion = require('../config/database');

// ======= Modelo Alumno =====
let Alumno = function(alumno){
    this.NumControl = alumno.NumControl;
    this.Nombre = alumno.Nombre;
    this.PrimerAp = alumno.PrimerAp;
    this.SegundoAp = alumno.SegundoAp;
    this.FechaNac = alumno.FechaNac;
    this.Semestre = alumno.Semestre;
    this.Carrera = alumno.Carrera; 
};

// ======= Logica para BD Relacional =====

// --- ALTAS ----
Alumno.create = function (alumno, result) {
    conexion.query("INSERT INTO alumnos SET ?", alumno, function (err, res) {
      if(err) {
        console.log("error: ", err);
        result(err, null);
      }
      else{
        console.log(res);
        result(null, res);
      }
    });
};

// ----- BAJAS -----
Alumno.delete = function(nc, result){
    conexion.query("DELETE FROM alumnos WHERE NumControl = ?", [nc], function(err, res){
        if(err){
            console.log('Error: ', err);
            result(err, null);
       }else{
           console.log(res);
           result(null, res);
       }
    });
};

//----- CAMBIOS -----
Alumno.update = function(id, alumno, result){

    console.log("---------->", alumno);

    conexion.query("UPDATE alumnos SET Nombre=?, PrimerAp=?, SegundoAp=?, FechaNac=?, Semestre=?, Carrera=? WHERE NumControl=?",
        [alumno.Nombre, alumno.PrimerAp, alumno.SegundoAp, alumno.FechaNac, 
         alumno.Semestre, alumno.Carrera, alumno.NumControl], function(err, res){
            if(err){
                console.log('Error: ', err);
                result(err, null);
           }else{
               console.log(res);
               result(null, res);
           }
        });
};

//----- CONSULTAS -----
Alumno.findById = function(nc, result){
    conexion.query("SELECT * FROM alumnos WHERE NumControl=?", nc, function(err, res){
        if(err){
            console.log('Error: ', err);
            result(err, null);
       }else{
           console.log(res);
           result(null, res);
       }
    });
};

Alumno.findAll = function(result){
    conexion.query("SELECT * FROM alumnos", function(err, res){
        if(err){
            console.log('Error: ', err);
            result(err, null);
       }else{
           console.log(res);
           result(null, res);
       }
    });
};

module.exports = Alumno;