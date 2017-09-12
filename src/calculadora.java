import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class calculadora extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPantalla;

	String memoria1;
	String signo;
	String memoria2;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}}}
	
	}
	/**
	 * Create the frame.
	 */
	public calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelBotones = new JPanel();
		contentPane.add(panelBotones, BorderLayout.CENTER);
		
		JButton btnAC = new JButton("AC");
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		txtPantalla = new JTextField();
		txtPantalla.setColumns(10);
		
		JButton btnDivision = new JButton("/");
		
		JButton btnMultiplica = new JButton("*");
		
		JButton btnBorraUno = new JButton("<");
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText()+"7");
				
			}
		});
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText()+"8");
				
			}
		});
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText()+"9");
				
			}
		});
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText()+"4");
				
			}
		});
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText()+"5");
				
			}
		});
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText()+"6");
				
			}
		});
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText()+"1");
				
			}
		});
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText()+"2");
				
			}
		});
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText()+"3");
				
			}
		});
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText()+"0");
				
			}
		});
		
		JButton btnPunto = new JButton(".");
		btnPunto.addActionListener(new ActionListener() {
			

		

			public void actionPerformed(ActionEvent e) {
				
				private String cadena;
				cadena= txtPantalla.getText();
				
				if(cadena.length()<=0){
					txtPantalla.setText("0.");
					
				}
				else
					if(!existepunto(txtPantalla.getText())){
						txtPantalla.setText(txtPantalla.getText()+".");
					}
			});
		
			public static boolean existepunto(String cadena){
				boolean resultado;
				resultado = false;
				
				for(int i=0;i<cadena.length();i++){
					if(cadena.substring(i,i+1).equals(".");)
						resultado = true;
					break;
				}
				
			}return resultado;
	
		
			JButton btnResultado = new JButton("=");
		
		JButton btnResta = new JButton("-");
		
		JButton btnSuma = new JButton("+");
		btnSuma.setToolTipText("");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton button = new JButton("+/-");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		GroupLayout gl_panelBotones = new GroupLayout(panelBotones);
		gl_panelBotones.setHorizontalGroup(
			gl_panelBotones.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBotones.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_panelBotones.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_panelBotones.createSequentialGroup()
							.addComponent(btn1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btn2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btn3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button))
						.addGroup(gl_panelBotones.createSequentialGroup()
							.addGroup(gl_panelBotones.createParallelGroup(Alignment.LEADING)
								.addComponent(txtPantalla, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
								.addGroup(gl_panelBotones.createSequentialGroup()
									.addComponent(btn7)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btn8)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btn9)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnResta, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
								.addGroup(gl_panelBotones.createSequentialGroup()
									.addComponent(btnAC)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnDivision)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnMultiplica)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnBorraUno))
								.addGroup(gl_panelBotones.createSequentialGroup()
									.addComponent(btn4)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btn5)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btn6)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnSuma, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
								.addGroup(gl_panelBotones.createSequentialGroup()
									.addComponent(btn0)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnPunto)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnResultado, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGap(194)))
					.addGap(24))
		);
		gl_panelBotones.setVerticalGroup(
			gl_panelBotones.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBotones.createSequentialGroup()
					.addGap(19)
					.addComponent(txtPantalla, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panelBotones.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAC)
						.addComponent(btnDivision)
						.addComponent(btnMultiplica)
						.addComponent(btnBorraUno))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelBotones.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn7)
						.addComponent(btn8)
						.addComponent(btn9)
						.addComponent(btnResta))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelBotones.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn4)
						.addComponent(btn5)
						.addComponent(btn6)
						.addComponent(btnSuma))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelBotones.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn1)
						.addComponent(btn2)
						.addComponent(btn3)
						.addComponent(button))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelBotones.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn0)
						.addComponent(btnPunto)
						.addComponent(btnResultado))
					.addContainerGap(27, Short.MAX_VALUE))
		);
		panelBotones.setLayout(gl_panelBotones);
	}
}
