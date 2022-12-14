package sistema.modelo.cliente;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;

import javafx.util.Pair;
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
	
	public void generarCupon(int monto, int familiares);

	public boolean modificarPlan(String dni, String plan)throws Exception;
	
	public boolean modificarPlanAdmin(int planID, String nuevoNombre, double nuevoReintegro, int nuevoPrecio)throws Exception;
	
	public boolean cargarPlan(String text, String text2, String text3);

	public String[] obtenerServicios();
	
	public List<Pair<String, String>> obtenerSolicitudesCambioPlan();
	
	public ArrayList<ArrayList<String>> obtenerSolicitudesABM();

	public List<Pair<String, String>> cargarClientesTabla();
	
	public void aprobarCambioPlan(String nombre, String apellido) throws Exception;

	public void aprobarPago(String nombre, String apellido);
	
	public boolean eliminarPlan(sistema.utilidades.Pair<String, Integer> planSeleccionado);
	
	public boolean eliminarSolicitud(ArrayList<String> solicitud);

	public String informacionPlan(String nombre);

	public boolean modificarPlan(String nombre, String text, String text2, JTable table_1);
	
	public String informacionSolicitud(ArrayList<String> solicitud);

	public void desaprobarCambioPlan(String nombre, String apellido);

	public void aprobarSolicitud(ArrayList<String> solicitud);

	public void desaprobarSolicitud(ArrayList<String> solicitud);

	public ArrayList<ArrayList<String>> obtenerInfoClientes();

	public ArrayList<String> getPlanesTotales();

	public void actualizarPlanCliente(String string, String string2);

	public boolean eliminarCliente(String string);

}
