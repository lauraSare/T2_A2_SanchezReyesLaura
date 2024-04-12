package edu.tecjerez.topicos.vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import edu.tecjerez.topicos.figuras.dosdimensiones.Circulo;
import edu.tecjerez.topicos.figuras.dosdimensiones.Rombo;
import edu.tecjerez.topicos.figuras.tresdimensiones.Cono;
import edu.tecjerez.topicos.figuras.tresdimensiones.Piramide;

public class VentanaInicio extends JFrame implements ActionListener{

    GridBagLayout gbl = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    JButton btnCirculo, btnElipse, btnRombo, btnCono, btnPiramide;

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

        btnCono = new JButton("Cono");
        MetodoAcomodo(btnCono, 0, 1, 1, 1);
        btnCono.addActionListener(this);

        btnPiramide = new JButton("Piramide");
        MetodoAcomodo(btnPiramide, 2, 1, 1, 1);
        btnPiramide.addActionListener(this);

        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void MetodoAcomodo(Component n, int gx, int gy, int gw, int gh) {
        gbc.gridx = gx;
        gbc.gridy = gy;
        gbc.gridwidth = gw;
        gbc.gridheight = gh;
        gbl.setConstraints(n, gbc);
        add(n);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnCirculo) {
            double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce un radio: "));

            Circulo c = new Circulo(radio);
            JOptionPane.showMessageDialog(null, "Area: " + String.valueOf(c.area()) + "\nEl perimetro es: "
                    + String.valueOf(c.perimetro()));
        } else if (e.getSource() == btnRombo) {
            double lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce un lado: "));
            double d = Double.parseDouble(JOptionPane.showInputDialog("Introduce diagonal menor: "));
            double D = Double.parseDouble(JOptionPane.showInputDialog("Introduce diagonal mayor: "));

            Rombo r = new Rombo(lado, D, d);
            JOptionPane.showMessageDialog(null, "El area es: " + String.valueOf(r.area()) + "\nEl perimetro es: "
                    + String.valueOf(r.perimetro()));
        } else if (e.getSource() == btnCono) {
            double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce un radio: "));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce altura: "));
            double generatriz = Double.parseDouble(JOptionPane.showInputDialog("Introduce generatriz: "));

            Cono cono = new Cono(radio, altura, generatriz);
            JOptionPane.showMessageDialog(null, "El área es: " + String.valueOf(cono.area()) + "\nEl volumen es: "
                    + String.valueOf(cono.volumen()));
        } else if (e.getSource() == btnElipse) {
            double radioMayor = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio mayor: "));
            double radioMenor = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio menor: "));

            double areaElipse = Math.PI * radioMayor * radioMenor;

            JOptionPane.showMessageDialog(null, "El área de la elipse es: " + String.valueOf(areaElipse));
        
        } else if (e.getSource() == btnPiramide) {
            double lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado de la base: "));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura: "));
            double apotema = Double.parseDouble(JOptionPane.showInputDialog("Introduce el apotema de la pirámide: "));

            Piramide piramide = new Piramide(lado, apotema, altura);
            JOptionPane.showMessageDialog(null, "El área es: " + String.valueOf(piramide.area())
                    + "\nEl volumen es: " + String.valueOf(piramide.volumen()));
        }
    }
}
