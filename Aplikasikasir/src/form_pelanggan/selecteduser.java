/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form_pelanggan;
import javax.swing.*;
/**
 *
 * @author User
 */
public class selecteduser extends JFrame {
    public selecteduser() {
        setTitle("Menu Utama");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton bcustomer = new JButton("Form customer");
        JButton bkasir = new JButton("Form kasir");

        bcustomer.setBounds(100, 60, 200, 40);
        bkasir.setBounds(100, 120, 200, 40);

        add(bcustomer);
        add(bkasir);

        // Event buka form
        bcustomer.addActionListener(e -> {
            new customer().setVisible(true);
        });

        bkasir.addActionListener(e -> {
            new kasir().setVisible(true);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new selecteduser().setVisible(true));
    }
}
