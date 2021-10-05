import java.io.Serializable;

/**
 * Tarea 0
 * 
 * @author Gallegos Mota Victor Hugo, Carlos Cruz Rangel
 *
 *         En esta clase se especifican los campos que se utilizarán para la
 *         creación de la nómina del personal. Estos son los datos generales que
 *         serán requeridos en pantalla para que el usuario los ingrese, excepto
 *         sueldototal que será calculado de forma automática, sin intervención
 *         del Usuario y también será mostrado en pantalla.
 *
 */

public class Empleado implements Serializable {

  private String nombre, apellidopaterno, apellidomaterno, curp, direccion, email, antiguedad;
  private int numemp, diaslab;
  private float sueldodiario, sueldototal;

  public Empleado(String nombre, String apellidopaterno, String apellidomaterno, int numemp, String direccion,
      String curp, float sueldodiario, int diaslab, float sueldototal, String email, String antiguedad)

  {
    this.nombre = nombre;
    this.apellidopaterno = apellidopaterno;
    this.apellidomaterno = apellidomaterno;
    this.curp = curp;
    this.direccion = direccion;
    this.numemp = numemp;
    this.sueldodiario = sueldodiario;
    this.diaslab = diaslab;
    this.sueldototal = sueldototal;
    this.email = email;
    this.antiguedad = antiguedad;
  }

  /**
   * Asigna el nombre del empleado tecleado por el Usuario al campo nombre
   *
   * @param nombre - recibe el nombre del empleado tecleado por el usuario
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Devuelve el valor almacenado en el campo nombre
   *
   * @return
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Asigna el apellido paterno del empleado tecleado por el Usuario al campo
   * apellido paterno
   *
   * @param apellidopaterno - recibe el apellido paterno del empleado tecleado por
   *                        el usuario
   */
  public void setApellidopaterno(String apellidopaterno) {
    this.apellidopaterno = apellidopaterno;
  }

  /**
   * Devuelve el valor almacenado en el campo nombre
   *
   * @return
   */
  public String getApellidopaterno() {
    return apellidopaterno;
  }

  /**
   * Asigna el apellido paterno del empleado tecleado por el Usuario al campo
   * apellido paterno
   *
   * @param apellidomaterno - recibe el apellido paterno del empleado tecleado por
   *                        el usuario
   */
  public void setApellidomaterno(String apellidomaterno) {
    this.apellidomaterno = apellidomaterno;
  }

  /**
   * Devuelve el valor almacenado en el campo nombre
   *
   * @return
   */
  public String getApellidomaterno() {
    return apellidomaterno;
  }

  /**
   * Asigna la direccion del empleado tecleado por el usuario al campo direccion
   * 
   * @param direccion - recibe el nombre del empleado tecleado por el usuario
   */
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  /**
   * Devuelve el valor almacenado en el campo direccion
   * 
   * @return
   */
  public String getDireccion() {
    return direccion;
  }

  /**
   * Asigna el número del empleado tecleado por el Usuario al campo nomemp
   * 
   * @param numemp - recibe el número del empleado tecleado por el usuario
   */
  public void setNumemp(int numemp) {
    this.numemp = numemp;
  }

  /**
   * Devuelve el valor almacenado en el campo numemp
   * 
   * @return
   */
  public int getNumEmp() {
    return numemp;
  }

  /**
   * Asigna el número del empleado tecleado por el Usuario al campo nomemp
   * 
   * @param antiguedad - recibe el número del empleado tecleado por el usuario
   */
  public void setAntiguedad(String antiguedad) {
    this.antiguedad = antiguedad;
  }

  /**
   * Devuelve el valor almacenado en el campo antiguedad
   * 
   * @return
   */
  public String getAntiguedad() {
    return antiguedad;
  }

  /**
   * Asigna los días laborados por el empleado tecleado por el Usuario al campo
   * diaslab.
   * 
   * @param diaslab - recibe el número de días laborados por el empleado tecleado
   *                por el usuario.
   */
  public void setDiasLab(int diaslab) {
    this.diaslab = diaslab;
  }

  /**
   * Devuelve el valor almacenado en el campo diaslab
   * 
   * @return
   */
  public int getDiasLab() {
    return diaslab;
  }

  /**
   * Asigna el CURP del empleado tecleado por el Usuario al campo curp
   * 
   * @param curp - recibe el curp del empleado tecleado por el usuario
   */
  public void setCurp(String curp) {
    this.curp = curp;
  }

  /**
   * Devuelve el valor almacenado en el campo curp
   * 
   * @return
   */
  public String getCurp() {
    return curp;
  }

  /**
   * Asigna el sueldo diario del empleado tecleado por el Usuario al campo
   * sueldodiario
   * 
   * @param sueldodiario - recibe el sueldo diario del empleado tecleado por el
   *                     usuario
   */
  public void setSueldoDiario(float sueldodiario) {
    this.sueldodiario = sueldodiario;
  }

  /**
   * Devuelve el valor almacenado en el campo sueldodiario
   * 
   * @return
   */
  public float getSueldoDiario() {
    return sueldodiario;
  }

  /**
   * Guarda el valor del sueldo total calculado automaticamente cuando el usuario
   * ingresa los datos del empleado
   * 
   * @param sueldototal - Guarda el sueldo total
   */
  public void setSueldoTotal(float sueldototal) {
    this.sueldototal = sueldototal;
  }

  /**
   * Devuelve el sueldo total, este se calculo automaticamente cuando el usuario
   * ingresa los datos del empleado
   * 
   * @return sueltototal - Devuelve el sueldo total
   */
  public float getSueldoTotal() {
    return sueldototal;
  }

  /**
   * Asigna el email del empleado tecleado por el Usuario al campo email
   *
   * @param email - recibe el email del empleado tecleado por el usuario
   */
  public void setEmail(String nombre) {
    this.email = email;
  }

  /**
   * Devuelve el valor almacenado en el campo nombre
   *
   * @return
   */
  public String getEmail() {
    return email;
  }

}