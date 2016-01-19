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
public class VentanaCuadrado extends JFrame implements ActionListener {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4720464614245763601L;
	
	private JLabel lbLado = new JLabel("Lado");
	private JTextField txtLado = new JTextField();
	
	private JLabel lbResult = new JLabel("Resultado");
	
	private JButton btnLalcular = new JButton("Calcular");
	
	Container c = getContentPane();
	Area p = new Area();

	/**
	 * Constructor
	 * Inicia la ventana y carga los controles por defecto
	 */
	public VentanaCuadrado() {
		
		setTitle("Cuadrado");
		setSize(340, 480);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
	}

	/**
	 * Metodo para cargar objetos
	 */
	private void cargarControles() {
		
		c.setLayout(null);
		lbLado.setBounds(10,30,300,50);
		txtLado.setBounds(10,130,300,50);
		btnLalcular.setBounds(10,230,300,50);
		lbResult.setBounds(10,290,300,50);
		
		c.add(lbLado);
		c.add(txtLado);
		c.add(btnLalcular);
		c.add(lbResult);
		
		btnLalcular.addActionListener(this);		
	}

	/**
	 * Eventos
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnLalcular){
			int result = p.areaCuadrado(Integer.parseInt(txtLado.getText()));
			lbResult.setText(String.format("%d",result));
		}
		
	}
	
}
