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
public class VentanaBordeLayout extends JFrame {

    private List<JPanel> jPanleList;
    private List<JLabel> jLabelList;
    private List<JButton> jButtonList;

    public VentanaBordeLayout() throws HeadlessException {
        this.setTitle("Ventana BordeLayout");
        this.setSize(800, 600);
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

        this.jPanleList.get(0).setLayout(new BorderLayout());

        this.jPanleList.get(0).add(this.jPanleList.get(1));
        

    }


    public void iniciarButton() {
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton());
        this.jButtonList.add(new JButton("Hola mundo"));
        this.jButtonList.add(new JButton("Hola mundo 1"));
        this.jButtonList.add(new JButton("Hola mundo 2"));
        this.jButtonList.add(new JButton("Hola mundo 3"));
        this.jButtonList.add(new JButton("Hola mundo 4"));

        
        this.jPanleList.get(0).add(this.jButtonList.get(1), BorderLayout.CENTER);
        this.jPanleList.get(0).add(this.jButtonList.get(2), BorderLayout.SOUTH);
        this.jPanleList.get(0).add(this.jButtonList.get(3), BorderLayout.EAST);
        this.jPanleList.get(0).add(this.jButtonList.get(4), BorderLayout.WEST);
        this.jPanleList.get(0).add(this.jButtonList.get(5), BorderLayout.NORTH);
         
    }

}
