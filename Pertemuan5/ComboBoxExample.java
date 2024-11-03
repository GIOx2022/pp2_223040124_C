import javax.swing.*;
import java.awt.event.*;

public class ComboBoxExample {
    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("JComboBox Example");

        // Opsi untuk JComboBox
        String[] options = {"Option 1", "Option 2", "Option 3", "Option 4"};

        // Membuat JComboBox dengan opsi
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Tambahkan ActionListener ke comboBox
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mengambil item yang dipilih
                String selected = (String) comboBox.getSelectedItem();
                System.out.println("Selected: " + selected);
            }
        });

        // Atur layout dan tambahkan comboBox ke frame
        frame.setLayout(null);
        comboBox.setBounds(50, 50, 150, 20);
        frame.add(comboBox);

        // Konfigurasi frame
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}