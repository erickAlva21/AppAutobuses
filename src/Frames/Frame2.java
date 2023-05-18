
package Frames;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Frame2 {
    Frame2(){
        JFrame frame = new JFrame("Formulario");
        JPanel contentPane = (JPanel) frame.getContentPane();
        //Panel pricipal con border layout
        JPanel panelPrincipal = new JPanel();
        JPanel panelBotonesGrid = new JPanel();
        JButton tipo1 = new JButton("Tipo 1");
        JButton tipo2 = new JButton("Tipo 2");
        JLabel titulo = new JLabel("¿En que tipo de camión deseas reservar? ");
        
        tipo1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                CamionTipo1Reservaciones camion1 = new CamionTipo1Reservaciones();
                frame.setVisible(false);
            }
            
        });
        
        tipo2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                CamionTipo2Reservaciones camion2 = new CamionTipo2Reservaciones();
                frame.setVisible(false);
            }
            
        });
        
        panelPrincipal.setLayout(new BorderLayout());
        panelBotonesGrid.setLayout(new GridLayout(1,2));
        
        panelBotonesGrid.add(tipo1);
        panelBotonesGrid.add(tipo2);
        
        panelPrincipal.add(panelBotonesGrid, BorderLayout.SOUTH);
        panelPrincipal.add(titulo, BorderLayout.CENTER);
        
        contentPane.add(panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,250);
        frame.setVisible(true);
    }
}
