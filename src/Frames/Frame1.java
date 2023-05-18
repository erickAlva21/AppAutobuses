package Frames;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Frame1 {
    public Frame1(){
        JFrame frame = new JFrame("Sistema Autobuses");
        JPanel contentPane = (JPanel) frame.getContentPane();
        //Panel pricipal con border layout
        JPanel panelPrincipal = new JPanel();
        
        JLabel titulo = new JLabel("Bienvenido a el sistema de Autobuses");
        JButton button = new JButton("Comenzar");
        
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame2 frame2 = new Frame2();
                frame.setVisible(false);
            }
            
        });
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.add(titulo, BorderLayout.CENTER);
        panelPrincipal.add(button, BorderLayout.SOUTH);
        contentPane.add(panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,250);
        frame.setVisible(true);
    }
}
