package co.com.bancolombia.operacionespruebasunitarias;

/**
 * Lanzada cuando se intenta hacer una operación con una entrada no permitida.
 */
public class InvalidOperationException extends Exception {

    /**
     * Nombre de la operación
     */
    private String operation;

    /**
     * Construye una InvalidOperationException con el nombre de la operación y el mensaje especificado
     * @param operation Nombre de la operación
     * @param message Mensaje de detalle del error
     */
    public InvalidOperationException(String operation, String message) {
        super(message);
        this.operation = operation;
    }

    /**
     * Obtiene el valor del atributo operation
     * @return Valor de operation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Cambia el valor de operation
     * @param operation nuevo valor para operation
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

}
