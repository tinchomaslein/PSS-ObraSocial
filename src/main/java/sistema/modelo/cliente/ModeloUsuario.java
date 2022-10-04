package sistema.modelo.cliente;

import java.util.Date;

import sistema.modelo.Modelo;

public interface ModeloUsuario extends Modelo {

	public String getApellido();

	public void setApellido(String apellido);

	public void setNombre(String nombre);

	public int getNroDocumento();

	public void setNroDocumento(int nroDocumento);

	public void setTelefono(String telefono);

	public String getMail();

	public void setMail(String mail);

	public String getFechaNacimiento();

	public void setFechaNacimiento(String fechaNacimiento);

	public String getNombreUsuario();

	public void setNombreUsuario(String usuario);

	public String getContrasena();

	public void setContrasena(String contrasena);
	
	public boolean autenticarUsuarioAplicacion(String usuario, char[] password) throws Exception;
	
	public void generarCupon();

}
