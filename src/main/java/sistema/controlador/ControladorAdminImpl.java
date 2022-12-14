package sistema.controlador;

import javax.swing.JTable;

import sistema.modelo.ModeloLogin;
import sistema.modelo.ModeloLoginImpl;
import sistema.modelo.cliente.ModeloUsuario;
import sistema.utilidades.Pair;
import sistema.vista.admin.VentanaAdmin;
import sistema.vista.login.VentanaLogin;
import sistema.vista.login.VentanaLoginImpl;

public class ControladorAdminImpl implements ControladorAdmin {
	
	private VentanaAdmin ventana;
	private ModeloUsuario modelo;
	
	public ControladorAdminImpl(VentanaAdmin ventana, ModeloUsuario modelo) {		
		this.ventana = ventana;
		this.modelo = modelo;
		this.ventana.registrarControlador(this);		
	}
	
	public void ejecutar() {
		try {
			this.ventana.mostrarVentana(true);
		} catch (Exception e) {
			String s = "Se produjo un error al intentar crear la ventana";
			this.ventana.informar(e.getMessage());
		}
	}

	public void salirAplicacion() {
		this.modelo.desconectar();
		this.ventana.eliminarVentana();
		System.exit(0);
	}

	public void cerrarSesion() {
		this.modelo.desconectar();
		this.ventana.eliminarVentana();

		ModeloLogin modeloLogin = new ModeloLoginImpl();  
		VentanaLogin ventanaLogin = new VentanaLoginImpl();
		@SuppressWarnings("unused")
		ControladorLogin controlador = new ControladorLoginImpl(ventanaLogin, modeloLogin);
	}

	@Override
	public boolean cargarPlan(String text, String text2, String text3) {

		return modelo.cargarPlan(text, text2, text3);
	}

	@Override
	public String[] obtenerServicios() {
		System.out.println("Entro controlador");
		return modelo.obtenerServicios();
	}

	@Override
	public boolean eliminarPlan(Pair<String, Integer> planSeleccionado) {
		return modelo.eliminarPlan(planSeleccionado);
	}

	@Override
	public String informacionPlan(String nombre) {
		return modelo.informacionPlan(nombre);
	}

	@Override
	public boolean modificarPlan(String nombre, String text, String text2, JTable table_1) {
		return modelo.modificarPlan(nombre, text, text2, table_1);
	}
}