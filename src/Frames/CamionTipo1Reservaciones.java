
package Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MiEscuchador implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        clickedButton.setEnabled(false);
        clickedButton.setText("Reservado");
    }
}

public class CamionTipo1Reservaciones {
    CamionTipo1Reservaciones(){
        JFrame frame = new JFrame("Reservaciones");
        JPanel contentPane = (JPanel) frame.getContentPane();
        JPanel principal = new JPanel(); //Border Layout
        JPanel norte = new JPanel();//Grid Layout Titulo
        JPanel tituloCentro = new JPanel(); //Grid Layout Titulo Secciones
        JPanel centroTodo = new JPanel();
        JPanel centro = new JPanel(); //Grid Layout botones para reservar
        JPanel sur = new JPanel(); //Grid Layout botones regreso y cancelar 
        
        JLabel titulo = new JLabel("Reservaciones del camion 1");
        JLabel seccion = new JLabel("En que seccion deseas tu reservacion");
        JButton botonLujo1 = new JButton("Seccion Lujo");
        JButton botonFumar1 = new JButton("Seccion Fumar");
        JButton botonNoFumar1 = new JButton("Seccion no Fumar");
        
        JButton terminar = new JButton("Terminar");
        JButton regresar = new JButton("Regresar");
        
        
        botonLujo1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Reservaciones de lujo");
                JPanel contentPane = (JPanel) frame.getContentPane();
                JPanel panel = new JPanel();
                panel.setLayout(new GridLayout(4,3));
                for(int i=1; i<=10; i++){
                    String numero = String.valueOf(i);
                    JButton button= new JButton("Asiento"+numero);
                    button.addActionListener(new MiEscuchador());
                    panel.add(button);
                }
        contentPane.add(panel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(600,300);
        frame.setVisible(true);
                
            }
            
        });
        
        botonFumar1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Reservaciones Fumar");
                JPanel contentPane = (JPanel) frame.getContentPane();
                JPanel panel = new JPanel();
                panel.setLayout(new GridLayout(4,4));
                for(int i=1; i<=16; i++){
                    String numero = String.valueOf(i);
                    JButton button= new JButton("Asiento"+numero);
                    button.addActionListener(new MiEscuchador());
                    panel.add(button);
                }
        contentPane.add(panel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(600,300);
        frame.setVisible(true);
                
            }
            
        });
        
        botonNoFumar1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Reservaciones No Fumar");
                JPanel contentPane = (JPanel) frame.getContentPane();
                JPanel panel = new JPanel();
                panel.setLayout(new GridLayout(5,4));
                for(int i=1; i<=20; i++){
                    String numero = String.valueOf(i);
                    JButton button= new JButton("Asiento"+numero);
                    button.addActionListener(new MiEscuchador());
                    panel.add(button);
                }
        contentPane.add(panel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(600,300);
        frame.setVisible(true);
                
            }
            
        });
        
        terminar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Camion Listo para Salir o Cancelado");
                frame.dispose();
            }
            
        });
        
        regresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame2 frame2 = new Frame2();
                frame.setVisible(false);
            }
            
        });
        
        principal.setLayout(new BorderLayout());
        
        norte.setLayout(new GridLayout());
        norte.add(titulo);
        
        tituloCentro.setLayout(new GridLayout(1,1));
        tituloCentro.add(seccion);
        
        centro.setLayout(new GridLayout(1,3));
        centro.add(botonLujo1);
        centro.add(botonFumar1);
        centro.add(botonNoFumar1);
        
        centroTodo.setLayout(new BorderLayout());
        centroTodo.add(tituloCentro, BorderLayout.NORTH);
        centroTodo.add(centro, BorderLayout.CENTER);
        
        sur.setLayout(new GridLayout());
        sur.add(terminar);
        sur.add(regresar);
        
        principal.add(norte, BorderLayout.NORTH);
        principal.add(centroTodo, BorderLayout.CENTER);
        principal.add(sur, BorderLayout.SOUTH);
        
        
        
        contentPane.add(principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,250);
        frame.setVisible(true);
    }
}
