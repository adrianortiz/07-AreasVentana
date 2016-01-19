import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Adrian
 *
 */
public class VentanaTriangulo extends JFrame implements ActionListener {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3751002669102201932L;
	private JLabel lbLado1 = new JLabel("Base");
	private JTextField txtLado1 = new JTextField();
	
	private JLabel lbLado2 = new JLabel("Altura");
	private JTextField txtLado2 = new JTextField();
	
	private JButton btnCalcular = new JButton("Calcular");
	private JLabel lbResult = new JLabel("Resultado");
	
	private Container c = getContentPane();
	
	Area p = new Area();
	
	/**
	 * Inicia la ventana y carga los controles por defecto
	 */
	public VentanaTriangulo() {
		setTitle("Triangulo");
		setSize(340, 480);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
	}

	/**
	 * Configura los controles UI
	 */
	private void cargarControles() {
		
		c.setLayout(null);
		
		lbLado1.setBounds(10,10,300,40);
		txtLado1.setBounds(10,40,300,40);
		lbLado2.setBounds(10,70,300,40);
		txtLado2.setBounds(10,100,300,40);		
		btnCalcular.setBounds(10,220,300,40);
		lbResult.setBounds(10,250,300,40);
		
		c.add(lbLado1);
		c.add(txtLado1);
		c.add(lbLado2);
		c.add(txtLado2);		
		c.add(btnCalcular);
		c.add(lbResult);
		
		btnCalcular.addActionListener(this);
		
	}

	
	/**
	 * Eventos
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnCalcular){
			int result = p.areaTriangulo(
					Integer.parseInt(txtLado1.getText()),
					Integer.parseInt(txtLado2.getText()));
			lbResult.setText(String.format("%d", result));
		}
	}
}
