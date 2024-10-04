package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ViewCartas extends JFrame {
    private JButton pregunta2CartasButton;
    private JButton cartasDePersonalidadButton;
    private JPanel BtnYtxt;
    private JButton pregunta4CartasButton;
    private JPanel Mesa;
    private JPanel panel1;
    private JLabel titulo;
    private JPanel PanelTitulo;
    private int contador = 0;

    public ViewCartas(ArrayList<Carta> baraja) {
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        PanelTitulo.setBorder(BorderFactory.createLineBorder(Color.black));

        cartasDePersonalidadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionarCartas(baraja);
            }
        });
        pregunta4CartasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preguntarCartas(baraja);
            }
        });
        pregunta2CartasButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                preguntarCartas2(baraja);
            }
        });


    }
    private void seleccionarCartas(ArrayList<Carta> baraja) {
        Carta carta1 = baraja.get((int) (Math.random()*baraja.size()));
        Carta carta2 = baraja.get((int) (Math.random()*baraja.size()));
        if (carta1.equals(carta2)) {
            carta2 = baraja.get((int) (Math.random()*baraja.size()));
        }
        // Muestra las cartas en el JTextField
        String resultado = "Carta 1: " + carta1.getNombre();
        String resultado2 = "Carta 2: " + carta2.getNombre();
        // Limpiar el JPanel Mesa antes de agregar nuevas cartas
        Mesa.removeAll();
        Mesa.setLayout(new GridLayout(1, 2));

        JPanel primeraCarta = new JPanel();
        primeraCarta.setLayout(new BoxLayout(primeraCarta, BoxLayout.Y_AXIS));
        JLabel nombreLabel1 = new JLabel(resultado, JLabel.CENTER);
        primeraCarta.add(nombreLabel1);

        ImageIcon icon1 = new ImageIcon(carta1.getImagen());
        Image img = icon1.getImage().getScaledInstance(290,400, Image.SCALE_SMOOTH);
        JLabel imagenLabel1 = new JLabel(new ImageIcon(img), JLabel.CENTER);
        primeraCarta.add(imagenLabel1);

        Mesa.add(primeraCarta);
        // SEGUNDA CARTA ----------------------------------------------------------------
        JPanel segundaCarta = new JPanel();
        segundaCarta.setLayout(new BoxLayout(segundaCarta, BoxLayout.Y_AXIS));
        JLabel nombreLabel2 = new JLabel(resultado2, JLabel.CENTER);
        segundaCarta.add(nombreLabel2);
        ImageIcon icon2 = new ImageIcon(carta2.getImagen());
        Image img2 = icon2.getImage().getScaledInstance(290,400, Image.SCALE_SMOOTH);
        JLabel imagenLabel2 = new JLabel(new ImageIcon(img2), JLabel.CENTER);
        segundaCarta.add(imagenLabel2);
        Mesa.add(segundaCarta);
        Mesa.revalidate();
        Mesa.repaint();
    }

    private void preguntarCartas(ArrayList<Carta> baraja) {
        Mesa.removeAll();
        Mesa.setLayout(new BorderLayout());

        TextField msg = new TextField("Introduce el número de la carta que quieres levantar (1-22)");
        Mesa.add(msg, BorderLayout.NORTH);

        JPanel panelCartas = new JPanel(new GridLayout(2, 2));
        Mesa.add(panelCartas, BorderLayout.CENTER);

        msg.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                msg.setText("");
            }
        });

        msg.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER && contador < 4) {
                    try {
                        int numero = Integer.parseInt(msg.getText());
                        if (numero >= 1 && numero <= 22) {
                            String texto = msg.getText();
                            Integer indice = Integer.parseInt(texto);
                            Carta carta1 = baraja.get(indice);

                            JPanel primeraCarta = new JPanel();
                            primeraCarta.setLayout(new BoxLayout(primeraCarta, BoxLayout.Y_AXIS));
                            panelCartas.add(primeraCarta);

                            JLabel nombre1 = new JLabel(carta1.getNombre(), JLabel.CENTER);
                            ImageIcon img1 = new ImageIcon(carta1.getImagen());
                            Image img = img1.getImage().getScaledInstance(230, 340, Image.SCALE_SMOOTH);
                            JLabel imagen1 = new JLabel(new ImageIcon(img), JLabel.CENTER);

                            primeraCarta.add(nombre1);
                            primeraCarta.add(imagen1);
                            msg.setText("");
                            panelCartas.revalidate();
                            panelCartas.repaint();
                            contador++;
                        } else {
                            msg.setText("Por favor, introduce un número del 1 al 22");
                            Mesa.requestFocusInWindow();
                        }
                    }catch (NumberFormatException ex) {
                        msg.setText("Sólo puedes introducir números. Introduce un número del 1 al 22");
                        Mesa.requestFocusInWindow();
                    }
                }
            }
        });
        Mesa.revalidate();
        Mesa.repaint();
    }

    private void preguntarCartas2(ArrayList<Carta> baraja) {
        Mesa.removeAll();
        contador=0;
        Mesa.setLayout(new BorderLayout());

        TextField msg = new TextField("Introduce el número de la carta que quieres levantar (1-22)");
        Mesa.add(msg, BorderLayout.NORTH);

        JPanel panelCartas = new JPanel(new GridLayout(1, 2));
        Mesa.add(panelCartas, BorderLayout.CENTER);

        msg.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                msg.setText("");
            }
        });

        msg.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER && contador < 2) {
                    try {
                        int numero = Integer.parseInt(msg.getText());
                        if (numero >= 1 && numero <= 22) {
                            String texto = msg.getText();
                            Integer indice = Integer.parseInt(texto);
                            Carta carta1 = baraja.get(indice);

                            JPanel primeraCarta = new JPanel();
                            primeraCarta.setLayout(new BoxLayout(primeraCarta, BoxLayout.Y_AXIS));
                            panelCartas.add(primeraCarta);

                            JLabel nombre1 = new JLabel(carta1.getNombre(), JLabel.CENTER);
                            ImageIcon img1 = new ImageIcon(carta1.getImagen());
                            Image img = img1.getImage().getScaledInstance(270, 360, Image.SCALE_SMOOTH);
                            JLabel imagen1 = new JLabel(new ImageIcon(img), JLabel.CENTER);

                            primeraCarta.add(nombre1);
                            primeraCarta.add(imagen1);
                            msg.setText("");
                            panelCartas.revalidate();
                            panelCartas.repaint();
                            contador++;
                        } else {
                            msg.setText("Por favor, introduce un número del 1 al 22");
                            Mesa.requestFocusInWindow();
                        }
                    }catch (NumberFormatException ex) {
                        msg.setText("Sólo puedes introducir números. Introduce un número del 1 al 22");
                        Mesa.requestFocusInWindow();
                    }
                }
            }
        });
        Mesa.revalidate();
        Mesa.repaint();
    }



}
