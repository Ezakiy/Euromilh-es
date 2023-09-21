import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class euromillion extends JFrame {
	Random rnd= new Random();
	int num=0;
	int numeros_certos=0;
	ArrayList<Integer> numeros=new ArrayList<Integer>();
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					euromillion frame = new euromillion();
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
	public euromillion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		JLabel lblNewLabel_1 = new JLabel("+");
		lblNewLabel_1.setBounds(294, 17, 11, 24);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_5 = new JTextField();
		textField_5.setBounds(369, 11, 48, 34);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(315, 11, 48, 34);
		textField_6.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setBounds(96, 166, 328, 47);
		
		lblNewLabel = new JLabel("Chave gerada");
		lblNewLabel.setBounds(5, 179, 76, 14);

		setContentPane(contentPane);
		
		textField_3 = new JTextField();
		textField_3.setBounds(15, 12, 45, 33);
		textField_3.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(66, 12, 49, 32);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(121, 11, 47, 34);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(174, 11, 48, 34);
		textField_1.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(228, 11, 48, 34);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Jogar");
		btnNewButton.setBounds(174, 105, 72, 35);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl.setText("");
				numeros.clear();
				numeros_certos=0;
				
				for (int i =0; i<(5); i++) {
					
					num=rnd.nextInt(50)+1;
					
					while(numeros.contains(num)) {
						
						num = rnd.nextInt(50)+1;
						
					}
					numeros.add(num);
					
					lbl.setText(lbl.getText() + num + " ");
				}
				
		for (int i =0; i<(2); i++) {
					
					num=rnd.nextInt(12)+1;
					
					while(numeros.contains(num)) {
						
						num = rnd.nextInt(12)+1;
						
					}
					numeros.add(num);
					
					lbl.setText(lbl.getText() + num + " ");
				}
		
				
				if(numeros.contains(Integer.parseInt(textField.getText()))) {
					numeros_certos++;
				}
				if(numeros.contains(Integer.parseInt(textField_1.getText()))) {
					numeros_certos++;
				}
				if(numeros.contains(Integer.parseInt(textField_2.getText()))) {
					numeros_certos++;
				}
				if(numeros.contains(Integer.parseInt(textField_3.getText()))) {
					numeros_certos++;
				}
				if(numeros.contains(Integer.parseInt(textField_4.getText()))) {
					numeros_certos++;
				}
				if(numeros.contains(Integer.parseInt(textField_5.getText()))) {
					numeros_certos++;
				}
				if(numeros.contains(Integer.parseInt(textField_6.getText()))) {
					numeros_certos++;
				}
				lblNewLabel_2.setText("Acertou " + numeros_certos);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(textField_3);
		contentPane.add(textField);
		contentPane.add(textField_2);
		contentPane.add(btnNewButton);
		contentPane.add(textField_1);
		contentPane.add(textField_4);
		contentPane.add(lblNewLabel_1);
		contentPane.add(textField_6);
		contentPane.add(textField_5);
		contentPane.add(lblNewLabel);
		contentPane.add(lbl);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(14, 236, 208, 14);
		contentPane.add(lblNewLabel_2);
	}
}
