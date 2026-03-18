'use strict';

const Alumno = require('../models/alumno')

//----- Crear nuevo alumno -----
exports.create = function(req, res){
    console.log(req.body.num_control);
    console.log(req.body.nombre);
    console.log(req.body.primer_ap);
    console.log(req.body.segundo_ap);
    console.log(req.body.fecha_nac);
    console.log(req.body.semestre);
    console.log(req.body.carrera);

    //Verificar que no esten vacios los campos
    if(req.body.constructor === Object && Object.keys(req.body).length === 0 ){
        res.status(400).send({error: true, message: 'Falta informacion'});
    }else{
        const a = {
            NumControl : req.body.num_control,
            Nombre : req.body.nombre,
            PrimerAp : req.body.primer_ap,
            SegundoAp : req.body.segundo_ap,
            FechaNac : req.body.fecha_nac,
            Semestre : req.body.semestre,
            Carrera : req.body.carrera  
        }

        const alumno = new Alumno(a);

        Alumno.create(alumno, function(err, alumno){
            console.log("Guardando alumno", req.body);
            if(err)
                return res.send(err);

            req.flash('message', 'Alumno AGREGADO con EXITO!');
            res.redirect('/')
        });
    }
};

//----- Eliminar un alumno -----
exports.delete = function(req, res){
    Alumno.delete(req.params.id, function(err){
        if(err)
            res.send(err);

        req.flash('message', 'Alumno ELIMINADO con EXITO!');
        res.redirect('/')
    });
};

//----- Modificar alumno -----
exports.update = function(req, res) {
    Alumno.findById(req.params.id, function(err, alumno) {    

      console.log("actualizar: " + req.body.num_control);
      console.log("actualizar: " + req.body.nombre);
      console.log("actualizar: " + req.body.primer_ap);
      console.log("actualizar: " + req.body.segundo_ap);
      console.log("actualizar: " + req.body.fecha_nac);
      console.log("actualizar: " + req.body.semestre);
      console.log("actualizar: " + req.body.carrera);
    
      const a = {
            NumControl : req.body.num_control,
            Nombre : req.body.nombre,
            PrimerAp : req.body.primer_ap,
            SegundoAp : req.body.segundo_ap,
            FechaNac : req.body.fecha_nac,
            Semestre : req.body.semestre,
            Carrera : req.body.carrera  
      }

      Alumno.update(req.params.id, new Alumno(a), function(err, alumno) {      
        req.flash('message', 'Alumno ACTUALIZADO Correctamente !');
        res.redirect('/');
      });
    });     
};

//----- Mostrar TODOS los alumnos en la vista principal -----
exports.findAll = function(req, res){
    Alumno.findAll(function(err, alumnos){
        if(err)
            res.send(err);

        console.log("Alumno: ", alumnos);
        res.status(200).send(alumnos);
    });
};

//----- Buscar un Alumno -----
exports.findById = function(req, res){
    Alumno.findById(req.params.id, function(err, alumno){
        if(err)
            res.send(err);

        res.json(alumno);
    });
};