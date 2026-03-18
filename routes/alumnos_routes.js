const express = require('express');
const router = express.Router();

const alumno_controller = require('../controllers/alumno_controller');

//Ruta para mostrar TODOS los alumnos
router.get('/', alumno_controller.findAll);

//altas
router.post('/', alumno_controller.create);

//consultar alumno
router.get('/:id', alumno_controller.findById);

//eliminar
router.post('/eliminar/:id', alumno_controller.delete);

//modificar alumno
router.post('/:id', alumno_controller.update);



module.exports = router;
