package edu.tecjerez.topicos.vista;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import edu.tecjerez.topicos.figuras.dosdimensiones.*;
import edu.tecjerez.topicos.figuras.tresdimensiones.*;
import edu.tecjerez.topicos.figuras.Triangulo;
import edu.tecjerez.topicos.geometria.Punto;

public class VentanaInicio extends JFrame implements ActionListener{

	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	JButton btnCirculo,btnElipse,btnRombo,btnTriangulo,btnCono,btnPiramide;


	public VentanaInicio() {

		getContentPane().setLayout(gbl);
		setBackground(Color.GRAY);
		setSize(350, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Figuras");

		btnCirculo = new JButton("Circulo");
		MetodoAcomodo(btnCirculo, 0, 0, 1, 1);
		btnCirculo.addActionListener(this);

		btnElipse = new JButton("Elipse");
		MetodoAcomodo(btnElipse, 1, 0, 1, 1);
		btnElipse.addActionListener(this);

		btnRombo = new JButton("Rombo");
		MetodoAcomodo(btnRombo, 2, 0, 1, 1);
		btnRombo.addActionListener(this);

		btnTriangulo = new JButton("Triangulo");
		MetodoAcomodo(btnTriangulo, 0, 1, 1, 1);
		btnTriangulo.addActionListener(this);

		btnCono = new JButton("Cono");
		MetodoAcomodo(btnCono, 1, 1, 1, 1);
		btnCono.addActionListener(this);

		btnPiramide = new JButton("Piramide");
		MetodoAcomodo(btnPiramide, 2, 1, 1, 1);
		btnPiramide.addActionListener(this);
		


		setLocationRelativeTo(null);
		setVisible(true);

	}

	public void MetodoAcomodo(Component n, int gx, int gy, int gw, int gh) {
		gbc.gridx=gx;
		gbc.gridy=gy;
		gbc.gridwidth=gw;
		gbc.gridheight=gh;
		gbl.setConstraints(n, gbc);
		add(n);
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==btnCirculo) {
			double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce un radio: "));

			Circulo c = new Circulo(radio);
			JOptionPane.showMessageDialog(null, "Area: "+String.valueOf(c.area())+"\nEl perimetro es: "+String.valueOf(c.perimetro()));
		}else if(e.getSource()==btnRombo) {
			double lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce un lado: "));
			double d = Double.parseDouble(JOptionPane.showInputDialog("Introduce diagonal menor: "));
			double D = Double.parseDouble(JOptionPane.showInputDialog("Introduce diagonal mayor: "));

			Rombo r = new Rombo(lado, D, d);
			JOptionPane.showMessageDialog(null, "El area es: "+String.valueOf(r.area())+"\nEl perimetro es: "+String.valueOf(r.perimetro()));
		}else if(e.getSource()==btnCono) {
			double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce un radio: "));
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce altura: "));
			double generatriz = Double.parseDouble(JOptionPane.showInputDialog("Introduce generatriz: "));

			Rombo r = new Rombo(radio, altura, generatriz);
			JOptionPane.showMessageDialog(null, "El area es: "+String.valueOf(r.area())+"\nEl perimetro es: "+String.valueOf(r.perimetro()));
		}else if(e.getSource()==btnElipse) {
			double radioMa = Double.parseDouble(JOptionPane.showInputDialog("Introduce un radio mayor: "));
			double radioMe = Double.parseDouble(JOptionPane.showInputDialog("Introduce un radio menor: "));

			Elipse el = new Elipse(radioMa, radioMe);
			JOptionPane.showMessageDialog(null, "El area es: "+String.valueOf(el.area())+"\n El perimetro es: "+String.valueOf(el.perimetro()));
		}else if(e.getSource()==btnTriangulo) {
			double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce lado 1: "));
			double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce lado 2: "));
			double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce lado 3: "));

			Triangulo t = new Triangulo(lado1, lado2, lado3);
			JOptionPane.showMessageDialog(null, "El area es: "+String.valueOf(t.area())+"\nEl perimetro es: "+String.valueOf(t.perimetro()));
		}else {
			double a = Double.parseDouble(JOptionPane.showInputDialog("Introduce valor de a: "));
			double a2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce valor de a': "));
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce altura: "));
			Piramide p = new Piramide(a, a2, altura);
			JOptionPane.showMessageDialog(null, "Area: "+String.valueOf(p.area())+"\nVolumen: "+String.valueOf(p.volumen()));
		}	

	}
}