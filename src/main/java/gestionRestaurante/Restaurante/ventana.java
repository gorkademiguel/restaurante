/**
 * @file Ventana APP
 * @brief Ventana emergente
 * Descripcion: Contiene toda la configuracion de la interfaz grafica que interactua con el usuario
 * 
 */

package gestionRestaurante.Restaurante;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana {
	
	//Modificables
	private static String windowTitle="Restaurante App";
	//label
	private static JLabel labelCo = new JLabel("Fecha:");
	private static JLabel labelU = new JLabel("DNI:");
	private static JLabel labelUC = new JLabel("DNI:");
	private static JLabel Nombre = new JLabel("Nombre: ");
	private static JLabel Mensaje = new JLabel("");
	private static JLabel Mensaje2 = new JLabel("");
	private static JLabel Mensaje3 = new JLabel("");
	//Textfields 
	private static JTextField textU = new JTextField(1);
	private static JTextField textUC = new JTextField(2);
	private static JTextField nombreF = new JTextField(4);
	private static JTextField textCo = new JTextField(4);
	//buttons
	private static JButton botonCliente = new JButton ("Registrar Cliente");
	private static JButton botonRegistro = new JButton ("Realizar Reserva");
	private static JButton botonGuardarReserva = new JButton ("Guardar");
	private static JButton botonCancelar = new JButton ("Cancelar");
	private static JButton botonCancelarCliente = new JButton ("Cancelar");
	private static JButton botonGuardarCliente = new JButton ("Guardar");
	
	
/**
 * 
 * @brief Iniciar: Ejecuta la interfaz gráfica donde se visualiza la aplicacion
 * 
 * 
 */
	public static void iniciar () {
		
		
		 /**
		 * 
		 * @brief Panel Inicio
		 * @param frameLogin: JFrame principal de la primera ventana
		 * @param panelLogin: Panel donde se colocan las caracteristicas a agregar
		 * 
		 */
		
		
		 final JFrame frameLogin= new JFrame();
		 JPanel panelLogin= new JPanel();
		
		//frame
		frameLogin.setSize(350,200);
		frameLogin.setTitle(windowTitle);
		frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLogin.add(panelLogin);
		frameLogin.setResizable(false);
		
		//Panel
		panelLogin.setLayout(null);
		panelLogin.setBackground(Color.getHSBColor(150,160,105));
		
		//Date 
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        final String todaysdate = dateFormat.format(date);
		
		//Agregar a panel
		panelLogin.add(botonCliente);
		panelLogin.add(botonRegistro);
		
		//Mensaje
		Mensaje3.setBounds(10,130,300,25);
		panelLogin.add(Mensaje3);	
		
		//Configuracion del frame
		frameLogin.setLocationRelativeTo(null);
		frameLogin.setVisible(true);
		
		
		
		 /**
		 * 
		 *  @param Panel Cliente
		 *  @param frameRegistroCliente: JFrame principal de la ventana nuevo cliente
		 *  @param panelRegistroCliente: Panel donde se colocan las caracteristicas a agregar al registro de nuevo cliente
		 * 
		 */
		
		final JFrame frameRegistroCliente= new JFrame();
		JPanel panelRegistroCliente= new JPanel();
		
		//frame
		frameRegistroCliente.setSize(350,250);
		frameRegistroCliente.setTitle("Registro Cliente");
		frameRegistroCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameRegistroCliente.add(panelRegistroCliente);
		frameRegistroCliente.setResizable(false);
		//Panel
		panelRegistroCliente.setLayout(null);
		panelRegistroCliente.setBackground(Color.getHSBColor(150,160,105));
		
		
		//dni
		labelUC.setBounds(20,40,80,25);
		labelUC.setForeground(Color.white);
		textUC.setBounds(110,40,165,25);
		panelRegistroCliente.add(labelUC);
		panelRegistroCliente.add(textUC);
		
		//Fecha
		Nombre.setBounds(20,80,80,25);
		Nombre.setForeground(Color.white);
		nombreF.setBounds(110,80,165,25);
		panelRegistroCliente.add(Nombre);
		panelRegistroCliente.add(nombreF);
		
		//Agregamos Botones
		panelRegistroCliente.add(botonCancelarCliente);
		panelRegistroCliente.add(botonGuardarCliente);
		
		//Mensaje
		Mensaje.setBounds(10,130,300,25);
		panelRegistroCliente.add(Mensaje);
		
		
		//Configuracion del frame
		frameRegistroCliente.setLocationRelativeTo(null);
		frameRegistroCliente.setVisible(false);
		
		
		 /**
		 * 
		 *  @brief Panel Registro Reserva
		 * 	@param frameRegistro: JFrame principal de la ventana nueva reserva
		 *  @param panelRegistro: Panel donde se colocan las caracteristicas a agregar una nueva reserva
		 *  
		 */
		
		final JFrame frameRegistro= new JFrame();
		JPanel panelRegistro= new JPanel();
		
		//frame
		frameRegistro.setSize(350,250);
		frameRegistro.setTitle("Registro Reserva");
		frameRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameRegistro.add(panelRegistro);
		frameRegistro.setResizable(false);
		//Panel
		panelRegistro.setLayout(null);
		panelRegistro.setBackground(Color.getHSBColor(150,160,105));
		
		
		//dni
		labelU.setBounds(20,40,80,25);
		labelU.setForeground(Color.white);
		textU.setBounds(110,40,165,25);
		panelRegistro.add(labelU);
		panelRegistro.add(textU);
		
		//Fecha
		labelCo.setBounds(20,80,80,25);
		labelCo.setForeground(Color.white);
		textCo.setBounds(110,80,165,25);
		panelRegistro.add(labelCo);
		panelRegistro.add(textCo);
				
	
		//Mensaje
		Mensaje2.setBounds(10,130,300,25);
		panelRegistro.add(Mensaje2);			
		
		//Agregamos Botones
		panelRegistro.add(botonCancelar);
		panelRegistro.add(botonGuardarReserva);
		
		//Configuracion del frame
		frameRegistro.setLocationRelativeTo(null);
		frameRegistro.setVisible(false);
		
		
		
		
		
		 /**
		 * 
		 * @brief Botones
		 * @param botonCliente: Boton que nos lleva a la ventana de cliente
		 * @param botonRegistro: Boton que nos lleva a la ventana de registro
		 * @param botonCancelar: Boton que nos lleva a la ventana principal
		 * @param botonGuardarReserva: Boton que nos lleva a la ventana principal y guarda la informacion de reserva en la base de datos
		 * @param botonGuardarCliente: Boton que nos lleva a la ventana principal y guarda la informacion de cliente en la base de datos
		 * 
		 * 
		 */
		
		//Inicio
		
		
		//RegistrarCliente
				botonCliente.setBounds(95,40,150,25);
				botonCliente.addActionListener(new ActionListener() {
									
					public void actionPerformed(ActionEvent e) {
										
						Mensaje.setText("");
						textUC.setText("");
						nombreF.setText("");
						frameRegistroCliente.setVisible(true);
						frameLogin.setVisible(false);
										
					}
						});
		
		
		//BotonRegistroReserva
		botonRegistro.setBounds(95,95,150,25);
		botonRegistro.addActionListener(new ActionListener() {							
				public void actionPerformed(ActionEvent a) {
							
					frameRegistro.setVisible(true);
					Mensaje2.setText("");
					textU.setText("");
					textCo.setText(todaysdate);
					frameLogin.setVisible(false);
				}
				});
				
		
		
		
		//Registro Reserva
		
		//BotonCancelarRegistro
		botonCancelar.setBounds(50,160,100,25);
		botonCancelar.addActionListener(new ActionListener() {
					
			public void actionPerformed(ActionEvent e) {
						
						frameLogin.setVisible(true);
						frameRegistro.dispose();
						frameRegistroCliente.dispose();
						Mensaje2.setText("");
						Mensaje2.setText("");
						Mensaje3.setText("");
						textU.setText("");
						textCo.setText("");
			}
		});
		//BotonGuardarRegistro
		botonGuardarReserva.setBounds(175,160,100,25);
		botonGuardarReserva.addActionListener(new ActionListener() {
							
			public void actionPerformed(ActionEvent e) {
				
						
					if (textU.getText().isEmpty()||textCo.getText().isEmpty()) {
						Mensaje2.setText("Debe rellenar todos los datos");
						Mensaje2.setForeground(Color.white);
					}else if (sentenciasSQL.registrarReserva(textU.getText(), textCo.getText())){
						sentenciasSQL.registrarReserva(textU.getText(), textCo.getText());
						Mensaje3.setText("Se ha creado la reserva correctamente.");
						Mensaje3.setForeground(Color.green.darker());
						
						frameLogin.setVisible(true);
						frameRegistro.setVisible(false);
					}else if(!sentenciasSQL.registrarReserva(textU.getText(), textCo.getText())){
						Mensaje2.setText("Debe introducir un dni valido");
						Mensaje2.setForeground(Color.white);
					}
						
						
					}
				});
		
		//BotonGuardarCliente
		botonGuardarCliente.setBounds(175,160,100,25);
		botonGuardarCliente.addActionListener(new ActionListener() {
									
				public void actionPerformed(ActionEvent e) {
						
					boolean esCliente=true;
								
							if (textUC.getText().isEmpty()||nombreF.getText().isEmpty()) {
								Mensaje.setText("Debe rellenar todos los datos");
								Mensaje.setForeground(Color.white);
							}else{
							esCliente=sentenciasSQL.registrarCliente(textUC.getText(), nombreF.getText());	
							if (esCliente) {
							Mensaje.setText("El DNI ingresado, ya existe");
							Mensaje.setForeground(Color.white);
							}else {
								Mensaje3.setText("Se ha guardado el cliente correctamente.");
								Mensaje3.setForeground(Color.green.darker());
								frameLogin.setVisible(true);
								frameRegistroCliente.setVisible(false);
							}
								
							
								
							
							
							
														
							}		
								
								
							}
						});
		
		//BotonCancelarCliente
		botonCancelarCliente.setBounds(50,160,100,25);
		botonCancelarCliente.addActionListener(new ActionListener() {
											
				public void actionPerformed(ActionEvent e) {
								
					frameLogin.setVisible(true);
				
					frameRegistroCliente.dispose();
					Mensaje.setText("");
					Mensaje2.setText("");
					Mensaje3.setText("");
					textUC.setText("");
					nombreF.setText("");
										
							}
				});
		
		
	}
}
