package EXAMEN;



public class Tren {
	// constantes para poder modificar los parametros de capacidad y años
	private static int CAPACIDAD_MAXIMA = 400;
	private static int AÑOS_MAXIMO = 40;
    //Atributos
	private String tipo;
	private int referencia;
	private int asientosOcupados;
	private int añosActivo;
    
	//funciones propias
	/**
	 * Mostramos por pantalla los atributos del tren ordenados
	 * 
	 * 
	 */
	public String mostrar() {
        String objetoCompleto;
        objetoCompleto = "TIPO DE TREN :  " + this.getTipo() + "\n" + 
                         "REFERENCIA DE TREN :  " + this.getReferencia() + "\n" +
                         "ASIENTOS OCUPADOS DEL TREN :  " + this.getAsientosOcupados() + "\n" +
                         "AÑOS ACTIVO :  " + this.getAñosActivo() + "\n";
        return objetoCompleto;
			}
    @Override
	public String toString() {
		return this.mostrar();
	}
	/**
     * Comprueba si el tren esta lleno o no
     * @return boolean, en caso de que este lleno true y si no esta lleno false
     */
	public boolean trenLleno() {
		boolean lleno = false;
		if (this.asientosOcupados > CAPACIDAD_MAXIMA) {
			lleno = true;
		} else {
			lleno = false;
		}
		return lleno;
	}
    /**
     * comprueba si el tren es demasiado viejo
     * @return String que nos da el mensaje y asi sacamos por pantalla si esta lleno o no
     */
	public String demasiadoViejo() {
		String esViejoONo;
		if (this.añosActivo > AÑOS_MAXIMO) {
			esViejoONo = "FUERA DE CIRCULACION";
		} else {
			esViejoONo = "EN CIRCULACION";
		}

		return esViejoONo;
	}

    //constructores
	public Tren(String tipo, int referencia, int asientosOcupados, int añosActivo) {
		super();
		this.tipo = tipo;
		this.referencia = referencia;
		this.asientosOcupados = asientosOcupados;
		this.añosActivo = añosActivo;
	}

	public Tren() {
		super();
		this.tipo = "Pasajeros";
		this.referencia = 0;
		this.asientosOcupados = 0;
		this.añosActivo = 0;
	}

   //getters y setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getReferencia() {
		return referencia;
	}

	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}

	public int getAsientosOcupados() {
		return asientosOcupados;
	}

	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}

	public int getAñosActivo() {
		return añosActivo;
	}

	public void setAñosActivo(int añosActivo) {
		this.añosActivo = añosActivo;
	}

}
