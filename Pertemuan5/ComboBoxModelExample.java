import javax.swing.*;
import java.awt.event.*;

public class ComboBoxModelExample {
    public static void main(String[] args) {
        // Membuat JFrame
        JFrame frame = new JFrame("ComboBoxModel Example");

        // Membuat model dengan opsi
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        comboBoxModel.addElement("Item 1");
        comboBoxModel.addElement("Item 2");
        comboBoxModel.addElement("Item 3");
        comboBoxModel.addElement("Item 4");

        // Membuat JComboBox dengan model
        JComboBox<String> comboBox = new JComboBox<>(comboBoxModel);

        // Menambahkan ActionListener untuk JComboBox
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mendapatkan item yang dipilih
                String selectedItem = (String) comboBox.getSelectedItem();
                System.out.println("Selected: " + selectedItem);
            }
        });

        // Mengatur layout dan posisi JComboBox
        frame.setLayout(null);
        comboBox.setBounds(50, 50, 150, 20);
        frame.add(comboBox);

        // Konfigurasi JFrame
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
