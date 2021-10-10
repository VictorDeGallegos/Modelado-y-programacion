# Modelado-y-programacion 👨‍💻
Repositorio de prácticas y ejercicios de La asignatura de Modelado y programación semestre 2022-1

- [Modelado-y-programacion 👨‍💻](#modelado-y-programacion-)
  - [**Tarea 0**](#tarea-0)
    - [Funcionamiento ⚙](#funcionamiento-)
    - [Que falta por hacer ? 😱](#que-falta-por-hacer--)

## **Tarea 0**

### Funcionamiento ⚙ 

Para iniciar el programa debe ejecutarse la clase `FormLogin.java` Esto abrira la interfaz (GUI) que mostrara en pantalla el login de acceso donde deberan escribir la contraseña **password** 

```
Usuario: Admin
Contraseña: password
```

Una vez introducida la contraseña y presionando el boton de *entrar* si es incorrecta lanzara un mensaje de "Contraseña incorrecta vuelva a intentarlo" y no nos permitira ingresar hasta que sea correcta, si la contraseña es correcta esta se encriptara y se mostrara en consola (aparecera en funcion `SHA-256`)

```bash
Contraseña encriptada: 5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8
```

Al iniciar el programa se cargara el archivo "nomina.txt". Si el archivo no existe, se creara uno nuevo.

La Interfaz principal cuenta con 3 menus: 

- **Archivo** :
  - Guardar: Se debe utilizar esta opción para guardar los cambios realizados durante el uso de la aplicación y asi lograr hacer el programa persistente. Si no se usa esta opción los cambios no serán guardados.
  - Salir: Cierra la aplicación y guarda los ultimos cambios.

- **Registro** :
  - Dar de alta - Permite dar de alta o registrar a un nuevo trabajador y tener un nuevo registro (con toda la info que todos los trabajadores deben registrar)
  - Dar de baja - Permite dar de baja un trabajador.
  - Cambios/Modificaciones - Permite editar o modificar un archivo existente ingresando el (numero de trabajador) que se desea editar.
  - Buscar - Busca los registros que coincidan con el criterio de búsqueda especificado (numero trabajador). Se habilita la opción "Buscar siguiente" en caso de que existan más de un registro que coincida con el valor proporcionado.
  - Mostrar todos - Muestra un listado de todos los registros de trabajadores almacenados.
  - Generar nómina - Muestra un listado de los registros almacenados con el cálculo del sueldo percibido en forma de sencillos recibos de nómina.

- **AYUDA** :
  - Mas info: Muestra un cuadro de diálogo con información referente a la app.

### Que falta por hacer ? 😱

- **Consultar los cheques expedidos anteriormente a un trabajador en específico:** 


- **Crear cheque de un trabajador en especifico despues de buscarlo**

---
⌨️ con ❤️ por [Victor Gallegos](https://github.com/VictorDeGallegos)🧑🏻  y  [Carlos Cruz](https://github.com/CarlosCruzRangel)🧑🏼
