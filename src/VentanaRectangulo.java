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
public class VentanaRectangulo extends JFrame implements ActionListener {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3809598988391475803L;
	
	private JLabel lbLado1 = new JLabel("Base");
	private JTextField txtLado1 = new JTextField();
	
	private JLabel lbLado2 = new JLabel("Altura");
	private JTextField txtLado2 = new JTextField();
	
	private JLabel lbResult = new JLabel("Resultado");
	
	private JButton btnCalcular = new JButton("Calcular");
	
	Container c = getContentPane();
	Area p = new Area();
	
	/**
	 * Constructor
	 * Inicia la ventana y carga los controles por defecto
	 */
	public  VentanaRectangulo(){
		setTitle("Rectangulo");
		setSize(340,480);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
	}

	/**
	 * Configura los controles UI
	 */
	private void cargarControles() {
		c.setLayout(null);
		lbLado1.setBounds(10,10,300,50);
		txtLado1.setBounds(10,50,300,50);
		lbLado2.setBounds(10,130,300,50);
		txtLado2.setBounds(10,170,300,50);
		btnCalcular.setBounds(10,250,300,50);
		lbResult.setBounds(10,310,300,50);
		
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
			int result =p.areaRectangulo(
					Integer.parseInt(txtLado1.getText()),
					Integer.parseInt(txtLado2.getText()));
			lbResult.setText(String.format("%d", result));
		}
		
	}
}
