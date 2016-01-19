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
public class VetanaCirculo extends JFrame implements ActionListener {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2801784828482775027L;
	
	private JLabel lbRadio = new JLabel("Radio");
	private JLabel lbResult = new JLabel("Resultado");
	private JTextField txtRadio = new JTextField();
	private JButton btnCalcular = new JButton("Calcular");

	private Container c = getContentPane();
	Area p = new Area();

	/**
	 * Constructor
	 * Inicia la ventana y carga los controles por defecto
	 */
	public VetanaCirculo() {
		setTitle("Cuadrado");
		setSize(340, 480);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
	}

	/**
	 * Configura los controles UI
	 */
	private void cargarControles() {
		c.setLayout(null);
		lbRadio.setBounds(10, 30, 300, 50);
		txtRadio.setBounds(10, 130, 300, 50);
		btnCalcular.setBounds(10, 230, 300, 50);
		lbResult.setBounds(10, 290, 300, 50);

		c.add(lbRadio);
		c.add(txtRadio);
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
			double result = p.areaCirculo(Integer.parseInt(txtRadio.getText()));
			lbResult.setText(String.format("%f", result));
		}
		
	}
}
