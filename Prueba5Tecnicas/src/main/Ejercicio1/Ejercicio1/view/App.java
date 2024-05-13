package Ejercicio1.view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import Ejercicio1.controller.factory.*;
import Ejercicio1.controller.observer.Menu;
import Ejercicio1.controller.strategy.*;

public class App extends JFrame {

    private JTextArea textArea;

    public App() {
        // Configuración de la ventana principal
        setTitle("Aplicación de Gestión de Restaurantes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        // Crear un panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Crear un área de texto para mostrar la información
        textArea = new JTextArea();
        textArea.setEditable(false); // No editable
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Agregar el área de texto al panel principal
        panel.add(scrollPane, BorderLayout.CENTER);

        // Botón para actualizar la información
        JButton btnActualizar = new JButton("Actualizar Información");
        btnActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarInformacion();
            }
        });
        panel.add(btnActualizar, BorderLayout.SOUTH);

        // Agregar el panel principal a la ventana
        add(panel);
    }

    // Método para mostrar la información de los restaurantes, menú y estrategia de servicio
    private void mostrarInformacion() {
        StringBuilder sb = new StringBuilder();

        // Crear diferentes tipos de restaurantes usando Factory Method
        Restaurante restauranteRapido = Restaurante.crearRestaurante(1);
        Restaurante restauranteTematico = Restaurante.crearRestaurante(2);
        Restaurante restauranteLujo = Restaurante.crearRestaurante(3);

        // Asignar nombre a los restaurantes
        restauranteRapido.setNombre("Rápido");
        restauranteTematico.setNombre("Temático");
        restauranteLujo.setNombre("Lujo");

        // Mostrar información de los restaurantes
        sb.append("Información de los restaurantes:\n");
        sb.append(restauranteRapido.mostrarRestaurante() + ", Menú: " + restauranteRapido.getNombre() + "\n");
        sb.append(restauranteTematico.mostrarRestaurante() + ", Menú: " + restauranteTematico.getNombre() + "\n");
        sb.append(restauranteLujo.mostrarRestaurante() + ", Menú: " + restauranteLujo.getNombre() + "\n\n");

        // Modificar el menú y notificar a los clientes suscritos usando Observer
        Menu sujetoMenu = new Menu();
        sujetoMenu.cambiarMenu("Nuevo menú del día");
        sujetoMenu.notificarObservadores();

        // Mostrar el menú actual
        sb.append("Menú del día: " + sujetoMenu.getMenu() + "\n\n");

        // Seleccionar una estrategia de servicio usando Strategy
        EstrategiaServicioCliente estrategiaServicio = new ServicioLujo();
        estrategiaServicio.ofrecerServicio();
        sb.append("\nEstrategia de Servicio: " + estrategiaServicio.getClass().getSimpleName());

        // Mostrar la información en el área de texto
        textArea.setText(sb.toString());
    }

    public static void main(String[] args) {
        // Crear y mostrar la ventana principal
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                App app = new App();
                app.setVisible(true);
                app.mostrarInformacion(); // Mostrar la información inicial
            }
        });
    }
}
