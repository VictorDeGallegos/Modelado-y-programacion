# Modelado-y-programacion 👨‍💻
Repositorio de prácticas y ejercicios de La asignatura de Modelado y programación semestre 2022-1

- [Modelado-y-programacion 👨‍💻](#modelado-y-programacion-)
  - [**Tarea 0**](#tarea-0)
    - [Funcionamiento ⚙](#funcionamiento-)
    - [Que falta por hacer ? 😱](#que-falta-por-hacer--)

## **Tarea 0**

### Funcionamiento ⚙ 

Al iniciar el programa se cargara el archivo "nomina.txt". Si el archivo no existe, se creara uno nuevo.

La Interfaz principal cuenta con 3 menus: 

- Archivo :
  - Guardar: Se debe utilizar esta opción para guardar los cambios realizados durante el uso de la aplicación y asi lograr hacer el programa persistente. Si no se usa esta opción los cambios no serán guardados.
  - Salir: Cierra la aplicación y guardar los cambios.

- Registro :
  - Altas - Permite dar de alta o registrar a un nuevo trabajador y tener un nuevo registro (con toda la info que todos los trabajadores deben registrar)
  - Bajas - Permite dar de baja un trabajador y asi eliminar un archivo existente.
  - Cambios - Permite modificar un archivo existente.
  - Buscar - Busca los registros que coincidan con el criterio de búsqueda especificado (nombre del trabajador). Se habilita la opción "Buscar siguiente" en caso de que existan más de un registro que coincida con el valor proporcionado.
  - Mostrar todos - Muestra un listado de todos los registros de trabajadores almacenados.
  - Generar nómina - Muestra un listado de los registros almacenados con el cálculo del sueldo percibido en forma de sencillos recibos de nómina.

- AYUDA :
  - Mas info: Muestra un cuadro de diálogo con información referente al desarrollo.

### Que falta por hacer ? 😱 

- **Implementar un login:** Para que el administrador del sistema acceda a traves de una contraseña maestra, que le permita hacer todos los cambios. Esta contraseña no debe de ser almacenada en el sistema, se debe de almacenar el valor de aplicar la funcion hash sha256 a la contrasena. Por ejemplo:
si la contrasena es “password”, no debemos almacenar la cadena “password”, debemos almacenar el valor 6b3a55e0261b0304143f805a24924d0c1c44524821305f31d9277843b8a10f4e, que es el resultado de la aplicación de función sha256(password), asumiendo que el argumento es la cadena sin comillas.

- **Consultar los cheques expedidos anteriormente a un trabajador en específico:** 

- **Agregar informacion extra a los trabajadores dependiendo de su puesto**

- **Crear cheque de un trabajador en especifico despues de buscarlo**