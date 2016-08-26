package Correo;

public class Correo {

	private String usuarioCorreo;
	private String contrasenia;
	private String rutaArchivo;
	private String nombreArchivo;
	private String destino;
	private String asunto;
	private String mensaje;
	
	String getUsuarioCorreo() {
		return usuarioCorreo;
	}
	void setUsuarioCorreo(String usuarioCorreo) {
		this.usuarioCorreo = usuarioCorreo;
	}
	String getContrasenia() {
		return contrasenia;
	}
	void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	String getRutaArchivo() {
		return rutaArchivo;
	}
	void setRutaArchivo(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}
	String getNombreArchivo() {
		return nombreArchivo;
	}
	void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	String getDestino() {
		return destino;
	}
	void setDestino(String destino) {
		this.destino = destino;
	}
	String getAsunto() {
		return asunto;
	}
	void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	String getMensaje() {
		return mensaje;
	}
	void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
