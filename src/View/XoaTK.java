package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class XoaTK extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtTenNguoiDung;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                XoaTK frame = new XoaTK();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public XoaTK() {
        setTitle("Xóa tài khoản");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 220);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(15, 15, 15, 15));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTenNguoiDung = new JLabel("Tên người dùng:");
        lblTenNguoiDung.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblTenNguoiDung.setBounds(30, 40, 120, 25);
        contentPane.add(lblTenNguoiDung);

        txtTenNguoiDung = new JTextField();
        txtTenNguoiDung.setBounds(160, 40, 230, 25);
        contentPane.add(txtTenNguoiDung);
        txtTenNguoiDung.setColumns(10);

        JButton btnXoa = new JButton("Xóa");
        btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnXoa.setBounds(100, 110, 100, 35);
        btnXoa.addActionListener(e -> {
            String tenNguoiDung = txtTenNguoiDung.getText().trim();
            if (tenNguoiDung.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập tên người dùng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // TODO: Thêm logic xóa tài khoản trong database hoặc danh sách ở đây

            // Giả sử xóa thành công:
            int confirm = JOptionPane.showConfirmDialog(this,
                    "Bạn có chắc muốn xóa tài khoản '" + tenNguoiDung + "' không?",
                    "Xác nhận xóa",
                    JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                // TODO: Thực hiện xóa ở đây

                JOptionPane.showMessageDialog(this, "Xóa tài khoản thành công!");
                txtTenNguoiDung.setText("");
            }
        });
        contentPane.add(btnXoa);

        JButton btnHuy = new JButton("Hủy");
        btnHuy.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnHuy.setBounds(250, 110, 100, 35);
        btnHuy.addActionListener(e -> {
            this.dispose();
        });
        contentPane.add(btnHuy);
    }
}
