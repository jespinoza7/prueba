
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Font;


public class Calculadoragrafica extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel contentPane;
	JTextField txtPantalla;

	double numero1,numero2,resultado;
	char signo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadoragrafica frame = new Calculadoragrafica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadoragrafica() {
		setFont(null);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 64, 64));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		
		txtPantalla = new JTextField();
		txtPantalla.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setToolTipText("");
		btn7.setForeground(new Color(255, 255, 204));
		btn7.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btn7.setBackground(new Color(51, 153, 51));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + '7');
			}
		});
		
		JButton btn4 = new JButton("4");
		btn4.setToolTipText("");
		btn4.setForeground(new Color(255, 255, 204));
		btn4.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btn4.setBackground(new Color(51, 153, 51));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + '4');
			}
		});
		
		JButton btn1 = new JButton("1");
		btn1.setToolTipText("");
		btn1.setForeground(new Color(255, 255, 204));
		btn1.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btn1.setBackground(new Color(51, 153, 51));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + '1');
				
			}
		});
		
		JButton btn0 = new JButton("0");
		btn0.setToolTipText("");
		btn0.setForeground(new Color(255, 255, 204));
		btn0.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btn0.setBackground(new Color(51, 153, 51));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + '0');
			}
		});
		
		JButton btnDivision = new JButton("/");
		btnDivision.setToolTipText("");
		btnDivision.setForeground(new Color(255, 255, 204));
		btnDivision.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnDivision.setBackground(new Color(51, 153, 51));
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtPantalla.getText().length()>0){
					numero1 = Double.parseDouble(txtPantalla.getText());
					signo = '/';
					txtPantalla.setText("");
				}
			}
		});
		
		JButton btn8 = new JButton("8");
		btn8.setToolTipText("");
		btn8.setForeground(new Color(255, 255, 204));
		btn8.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btn8.setBackground(new Color(51, 153, 51));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + '8');
			}
		});
		
		JButton btn5 = new JButton("5");
		btn5.setToolTipText("");
		btn5.setForeground(new Color(255, 255, 204));
		btn5.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btn5.setBackground(new Color(51, 153, 51));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + '5');
			}
		});
		
		JButton btn2 = new JButton("2");
		btn2.setToolTipText("");
		btn2.setForeground(new Color(255, 255, 204));
		btn2.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btn2.setBackground(new Color(51, 153, 51));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + '2');
			}
		});
		
		JButton btnPunto = new JButton(".");
		btnPunto.setToolTipText("");
		btnPunto.setForeground(new Color(255, 255, 204));
		btnPunto.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnPunto.setBackground(new Color(51, 153, 51));
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean haypunto = false;
				for(int i=0;i<txtPantalla.getText().length();i++){
					if(txtPantalla.getText().charAt(i) == '.'){
					haypunto = true;
					break;
					
					}
				}	
					
			if(!haypunto){
				txtPantalla.setText(txtPantalla.getText() + "0.");
			}
				
			}
		});
		
		JButton btnMultiplicacion = new JButton("X");
		btnMultiplicacion.setToolTipText("");
		btnMultiplicacion.setForeground(new Color(255, 255, 204));
		btnMultiplicacion.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnMultiplicacion.setBackground(new Color(51, 153, 51));
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btn9 = new JButton("9");
		btn9.setToolTipText("");
		btn9.setForeground(new Color(255, 255, 204));
		btn9.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btn9.setBackground(new Color(51, 153, 51));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + "9");
			}
		});
		
		JButton bn6 = new JButton("6");
		bn6.setToolTipText("");
		bn6.setForeground(new Color(255, 255, 204));
		bn6.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		bn6.setBackground(new Color(51, 153, 51));
		bn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + "6");
			}
		});
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(51, 153, 51));
		btn3.setForeground(new Color(255, 255, 204));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + "3");
			}
		});
		
		JButton btnCambiaSigno = new JButton("+/-");
		btnCambiaSigno.setToolTipText("");
		btnCambiaSigno.setForeground(new Color(255, 255, 204));
		btnCambiaSigno.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnCambiaSigno.setBackground(new Color(51, 153, 51));
		btnCambiaSigno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double num;
				String cadena="";
				if(txtPantalla.getText().length()>0)
					
					
					cadena = txtPantalla.getText();
					if(cadena.length()>0){
						num=(-1)*Double.parseDouble(cadena);
						txtPantalla.setText(num.toString());
					}
					
					;
				
			}
		});
		
		JButton btnBorrar = new JButton("borrar");
		btnBorrar.setToolTipText("");
		btnBorrar.setForeground(new Color(255, 255, 204));
		btnBorrar.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnBorrar.setBackground(new Color(51, 153, 51));
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtPantalla.getText().length()>0){
					txtPantalla.setText(txtPantalla.getText().substring(0, txtPantalla.getText().length()-1));
				
				}
			}
		});
		
		JButton btnBorraTodo = new JButton("borrar TODO");
		btnBorraTodo.setToolTipText("");
		btnBorraTodo.setForeground(new Color(255, 255, 204));
		btnBorraTodo.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnBorraTodo.setBackground(new Color(51, 153, 51));
		btnBorraTodo.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				if(txtPantalla.getText().length()>0){
					txtPantalla.setText("");
					
				}
				
			}
		});
		
		JButton btnResta = new JButton("-");
		btnResta.setToolTipText("");
		btnResta.setForeground(new Color(255, 255, 204));
		btnResta.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnResta.setBackground(new Color(51, 153, 51));
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtPantalla.getText().length()>0){
					numero1 = Double.parseDouble(txtPantalla.getText());
					signo = '-';
					txtPantalla.setText("");
				}
			}
		});
		
		JButton btnSuma = new JButton("+");
		btnSuma.setToolTipText("");
		btnSuma.setForeground(new Color(255, 255, 204));
		btnSuma.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnSuma.setBackground(new Color(51, 153, 51));
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtPantalla.getText().length()>0){
					numero1 = Double.parseDouble(txtPantalla.getText());
					signo = '+';
					txtPantalla.setText("");
				}
			}
		});
		
		JButton btnResultado = new JButton("=");
		btnResultado.setToolTipText("");
		btnResultado.setForeground(new Color(255, 255, 204));
		btnResultado.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnResultado.setBackground(new Color(51, 153, 51));
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(txtPantalla.getText().length()>0){
				numero2= Double.parseDouble(txtPantalla.getText());
				switch(signo){
				case '+':
					resultado = numero1 + numero2;
					txtPantalla.setText(Double.toString(resultado));
					break;
				case '-':
					resultado = numero1 - numero2;
					txtPantalla.setText(Double.toString(resultado));
					break;
				case '/':
					resultado = numero1 / numero2;
					txtPantalla.setText(Double.toString(resultado));
					break;
				case '*':
					resultado = numero1 * numero2;
					txtPantalla.setText(Double.toString(resultado));
					break;
				}
			}
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(txtPantalla, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(24)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(btn4)
										.addComponent(btn7))
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btn0)
									.addPreferredGap(ComponentPlacement.UNRELATED))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btn1)
									.addPreferredGap(ComponentPlacement.UNRELATED)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnPunto)
										.addComponent(btn2)))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(btnDivision)
									.addComponent(btn8)
									.addComponent(btn5)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(bn6)
								.addComponent(btnCambiaSigno)
								.addComponent(btn3)
								.addComponent(btn9)
								.addComponent(btnMultiplicacion))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnSuma)
								.addComponent(btnResta)
								.addComponent(btnResultado)
								.addComponent(btnBorrar)
								.addComponent(btnBorraTodo))))
					.addGap(18))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(11)
					.addComponent(txtPantalla, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnDivision)
								.addComponent(btnMultiplicacion)
								.addComponent(btnBorrar))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btn8)
								.addComponent(btn7)
								.addComponent(btn9)
								.addComponent(btnBorraTodo))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btn5)
								.addComponent(btn4)
								.addComponent(btnResta)
								.addComponent(bn6))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btn1)
								.addComponent(btn2)
								.addComponent(btn3)
								.addComponent(btnSuma))
							.addGap(29))
						.addComponent(btn0)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnPunto)
							.addComponent(btnCambiaSigno)
							.addComponent(btnResultado)))
					.addContainerGap(71, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{txtPantalla, btn7, btn4, btn1, btn0, btnDivision, btn8, btn5, btn2, btnPunto, btnMultiplicacion, btn9, bn6, btn3, btnCambiaSigno, btnBorrar, btnBorraTodo, btnResta, btnSuma, btnResultado}));
	}
}
