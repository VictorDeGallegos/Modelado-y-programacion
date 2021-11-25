/**
 * Clase hecha para obtener tan
 * 
 * @author Gallegos Mota Victor Hugo y Carlos Cruz Rangel
 **/
public class NodoTangente extends NodoOperador {

  /**
   *
   * @param der
   */
  public NodoTangente(CompositeEA der, CompositeEA izq) {
    super(izq, der);
    precedence = 1;
  }

  /**
   * La evaluación del nodo, divide la evaluación de los hijos izquierdo y
   * derecho.
   *
   * @return el seno del hijo derecho entre el hijo derecho.
   */
  @Override
  public double evalua() {

    double d = der.evalua();
    // d = Math.toRadians(d);
    return Math.tan(d);
  }
}