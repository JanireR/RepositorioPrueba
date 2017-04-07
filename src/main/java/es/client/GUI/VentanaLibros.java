package es.client.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;

import es.server.jdo.Libro;



public class VentanaLibros extends javax.swing.JFrame implements ActionListener, WindowListener{
	
	private JFrame frame;
	private JPanel panelNorte;
	private JPanel panelCentral;
	private JPanel panelSur;
	private JList listaLibros;
	private JLabel total;
	private JTextField txtCantidadTotal;
	private JTextField txtMasLeido;
	private JTextField txtMenosLeido;
	private JButton alquiler;
	private JButton recomendar;
	private JButton masLeido;
	private JButton MenosLeido;
	
	Libro arraylibros[]= new Libro[10];
	
	String libros[]= new String[10];
		     
	 
	 float totalAlq=0;
	 String titulo;
	 int alquilado=0;
	 
	 VentanaLibros(){
		 
		//cargar los datos de los medicamentos
		 arraylibros[0]= new Libro("El señor de los anillos","A215", "Autor1", "Aventura", 10, 0, 2,3);
		 arraylibros[1]= new Libro("Cien años de soledad","A025", "Autor2", "Literatura", 5, 0,3,4);
		 arraylibros[2]= new Libro("Dracula","A485", "Autor3", "Terror", 4, 0,1,5);
		 arraylibros[3]= new Libro("Juego de tronos","A621", "Autor2", "Fantasia", 6, 0,4,3);
		 arraylibros[4]= new Libro("El hechicero","A023", "Autor4", "Aventura", 2, 0,0,1);
		 arraylibros[5]= new Libro("El hobbit","A748", "Autor5", "Fantasia", 11, 0,2,1);
		 arraylibros[6]= new Libro("La tregua","A202", "Autor7", "Literatura",4, 0,1,5);
		 arraylibros[7]= new Libro("El señor de los anillos 2","A104", "Autor2", "Aventura", 5, 0,2,1);
		 arraylibros[8]= new Libro("Las cronicas de narnia","A956", "Autor1", "Fantasia", 6, 0,3,2);
		 arraylibros[9]= new Libro("Frankenstein","A003", "Autor5", "Terror", 3, 0,4,6);
		 
		 
		 
		 frame = new JFrame();
			panelNorte = new JPanel();
			panelCentral = new JPanel();
			panelSur = new JPanel();
			
				for(int j=0; j< libros.length;j++){
					libros[j]= arraylibros[j].getTitulo();
					listaLibros= new JList(libros);
				}
				
				JScrollPane pane = new JScrollPane(listaLibros);
				DefaultListSelectionModel m = new DefaultListSelectionModel();
				
				
				frame.setTitle("BIBLIOTECA");
				frame.setBounds(100, 100, 700, 400);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//Panel 1
				panelNorte.setLayout(new java.awt.GridLayout(1, 0));
				panelNorte.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
						"LISTA DE LIBROS", TitledBorder.DEFAULT_JUSTIFICATION,
						TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1,
								11)));
				m.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				m.setLeadAnchorNotificationEnabled(false);
				listaLibros.setSelectionModel(m);
				alquiler= new JButton("Alquilar");
				recomendar = new JButton("Recomendar libro");
				alquiler.addActionListener(this);
				recomendar.addActionListener(this);
				
				panelNorte.add(pane);
				panelNorte.add(alquiler);
				panelNorte.add(recomendar);
				
				frame.getContentPane().add(panelNorte, java.awt.BorderLayout.NORTH);
				//Panle 2
				panelCentral.setLayout(new java.awt.GridLayout(2, 1));
				panelCentral.setBorder(javax.swing.BorderFactory.createTitledBorder(
						null, "ESTADISTICAS", TitledBorder.DEFAULT_JUSTIFICATION,
						TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1,
								11)));
				masLeido= new JButton("El libro más leido es : ");
				masLeido.addActionListener(this);
				txtMasLeido= new JTextField(titulo);
				txtMasLeido.setEditable(false);
				MenosLeido= new JButton("El libro menos leido es : ");
				MenosLeido.addActionListener(this);
				txtMenosLeido= new JTextField("");
				txtMenosLeido.setEditable(false);
				
				panelCentral.add(masLeido);
				panelCentral.add(txtMasLeido);
				panelCentral.add(MenosLeido);
				panelCentral.add(txtMenosLeido);
				
				frame.getContentPane().add(panelCentral, java.awt.BorderLayout.CENTER);
				//Panel 3
				panelSur.setLayout(new java.awt.GridLayout(1, 0));
				panelSur.setBorder(javax.swing.BorderFactory.createTitledBorder(
						null, "Cantidad puntos obtenido :", TitledBorder.DEFAULT_JUSTIFICATION,
						TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1,
								11)));
				total= new JLabel("Total puntos obtenidos: ");
				txtCantidadTotal= new JTextField(String.valueOf("0.0"));
				txtCantidadTotal.setEditable(false);
				
				
				panelSur.add(total);
				panelSur.add(txtCantidadTotal);
				
				
				
				frame.getContentPane().add(panelSur, java.awt.BorderLayout.SOUTH);
				frame.setVisible(true);
				
	 }

	 
	 public static void main(String[] args) {
		VentanaLibros vl= new VentanaLibros();
			
		}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		JButton btnPresionado = (JButton) evt.getSource();
		if (btnPresionado == recomendar) {
			for(int i=0; i<arraylibros.length;i++){
				System.out.println("alquilado es: " +arraylibros[i].getAlquilado());
				if(arraylibros[i].getTitulo().equals(listaLibros.getSelectedValue())){
					System.out.println("cantidad libro: " +arraylibros[i].getCantidadDisp());
					if(arraylibros[i].getCantidadDisp()!=0){
						arraylibros[i].setCantidadDisp(arraylibros[i].getCantidadDisp()-1);
						System.out.println("cantidad producto despues de alquilar: " +arraylibros[i].getCantidadDisp());
						arraylibros[i].setAlquilado(arraylibros[i].getAlquilado()+1);
						totalAlq= totalAlq+((arraylibros[i].getPrecio())*1);
						txtCantidadTotal.setText(String.valueOf(totalAlq));
						System.out.println("total alquiler : " +totalAlq);
						System.out.println("alquilado es: " +arraylibros[i].getAlquilado());
						
						JOptionPane.showMessageDialog(frame, "Se ha recomendado el libro: " + arraylibros[i].getTitulo() + "  correctamente");
					}else{
						JOptionPane.showMessageDialog(frame, "El libro no esta disponible");
					}
				}
			}
			
		}else if(btnPresionado== alquiler){
			for(int i=0; i<arraylibros.length;i++){
				System.out.println("la cantidad disponible del libro es : " +arraylibros[i].getCantidadDisp());
				if(arraylibros[i].getTitulo().equals(listaLibros.getSelectedValue())){
					if(arraylibros[i].getCantidadDisp()<=arraylibros[i].getCantidadDisp()){
						arraylibros[i].setCantidadDisp(arraylibros[i].getCantidadDisp()+1);
						JOptionPane.showMessageDialog(frame, "Alquiler realizado correctamente");
						System.out.println("la cantidad disponible del libro despues del alquiler es : " +arraylibros[i].getCantidadDisp());
						
					}else{
						JOptionPane.showMessageDialog(frame, "No se debe realizar el alquiler, hay suficiente");
					}
				}
				
			}
		}else if(btnPresionado==masLeido){
			int nu;
			Set<Integer> hs = new HashSet<Integer>();
			for(int i=0; i< arraylibros.length;i++){
				hs.add(arraylibros[i].getAlquilado());
			}
			nu= Collections.max(hs);
			System.out.println("El número mayor del conjunto es... "+nu);
			for(int i=0; i<arraylibros.length;i++){
				if(nu==arraylibros[i].getAlquilado()){
					txtMasLeido.setText(arraylibros[i].getTitulo());
				}
			}
			
		}else if(btnPresionado==MenosLeido){
			float num;
			Set<Integer> hs = new HashSet<Integer>();
				for(int i=0; i< arraylibros.length;i++){
					hs.add(arraylibros[i].getAlquilado());
				}
				num=Collections.min(hs);
				System.out.println("El número menor del conjunto es... "+ num);
				for(int i=0; i<arraylibros.length;i++){
					if(num==arraylibros[i].getAlquilado()){
						txtMenosLeido.setText(arraylibros[i].getTitulo());
					}
				}
			}
		
	}

}
