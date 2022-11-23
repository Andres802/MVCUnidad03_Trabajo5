/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PooUnidad3.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ochoa
 */
public class VentanaGridLayout extends JFrame {

    private List<JPanel> jPanleList;
    private List<JLabel> jLabelList;
    private List<JButton> jButtonList;

    public VentanaGridLayout() throws HeadlessException {
        this.setTitle("Ventana GridLayout");
        this.setSize(800, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanel();
        this.iniciarButton();
        this.setContentPane(this.jPanleList.get(0));
        this.setVisible(true);

    }

    public void iniciarPanel() {
        this.jPanleList = new ArrayList<>();

        this.jPanleList.add(new JPanel());
        this.jPanleList.add(new JPanel());
        this.jPanleList.add(new JPanel());
        this.jPanleList.add(new JPanel());
        this.jPanleList.add(new JPanel());
        this.jPanleList.add(new JPanel());
        this.jPanleList.add(new JPanel());
        this.jPanleList.add(new JPanel());
        this.jPanleList.add(new JPanel());

        this.jPanleList.get(0).setLayout(new GridLayout(2,4));


        this.jPanleList.get(1).setBackground(Color.white);
        this.jPanleList.get(2).setBackground(Color.blue);
        this.jPanleList.get(3).setBackground(Color.yellow);
        this.jPanleList.get(4).setBackground(Color.red);
        this.jPanleList.get(5).setBackground(Color.green);
        this.jPanleList.get(6).setBackground(Color.black);
        
        

        this.jPanleList.get(0).add(this.jPanleList.get(1));
        this.jPanleList.get(0).add(this.jPanleList.get(2));
        this.jPanleList.get(0).add(this.jPanleList.get(3));
        this.jPanleList.get(0).add(this.jPanleList.get(4));
        this.jPanleList.get(0).add(this.jPanleList.get(5));
        this.jPanleList.get(0).add(this.jPanleList.get(6));
        
    

    }

    

    public void iniciarButton() {
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton());
        this.jButtonList.add(new JButton("Hola mundo"));
        this.jButtonList.add(new JButton("Hola mundo 1"));
        this.jButtonList.add(new JButton("Hola mundo 2"));
        this.jButtonList.add(new JButton("Hola mundo 3"));
        this.jButtonList.add(new JButton("Hola mundo 4"));
        this.jButtonList.add(new JButton("Hola mundo 5"));

        this.jPanleList.get(1).add(this.jButtonList.get(1));
        this.jPanleList.get(2).add(this.jButtonList.get(2));
        this.jPanleList.get(3).add(this.jButtonList.get(3));
        this.jPanleList.get(4).add(this.jButtonList.get(4));
        this.jPanleList.get(5).add(this.jButtonList.get(5));
        this.jPanleList.get(6).add(this.jButtonList.get(6));

    }

}
