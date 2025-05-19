package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ThemTK extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtHoTen;
    private JTextField txtTaiKhoan;
    private JPasswordField txtMatKhau;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ThemTK frame = new ThemTK();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public ThemTK() {
        setTitle("Thêm tài khoản");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 320);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(15, 15, 15, 15));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblHoTen = new JLabel("Họ tên:");
        lblHoTen.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblHoTen.setBounds(30, 30, 100, 25);
        contentPane.add(lblHoTen);

        txtHoTen = new JTextField();
        txtHoTen.setBounds(140, 30, 250, 25);
        contentPane.add(txtHoTen);
        txtHoTen.setColumns(10);

        JLabel lblTaiKhoan = new JLabel("Tài khoản:");
        lblTaiKhoan.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblTaiKhoan.setBounds(30, 75, 100, 25);
        contentPane.add(lblTaiKhoan);

        txtTaiKhoan = new JTextField();
        txtTaiKhoan.setBounds(140, 75, 250, 25);
        contentPane.add(txtTaiKhoan);
        txtTaiKhoan.setColumns(10);

        JLabel lblMatKhau = new JLabel("Mật khẩu:");
        lblMatKhau.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblMatKhau.setBounds(30, 120, 100, 25);
        contentPane.add(lblMatKhau);

        txtMatKhau = new JPasswordField();
        txtMatKhau.setBounds(140, 120, 250, 25);
        contentPane.add(txtMatKhau);

        JButton btnLuu = new JButton("Lưu");
        btnLuu.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnLuu.setBounds(100, 190, 100, 35);
        btnLuu.addActionListener(e -> {
            // Lấy dữ liệu từ form
            String hoTen = txtHoTen.getText().trim();
            String taiKhoan = txtTaiKhoan.getText().trim();
            String matKhau = new String(txtMatKhau.getPassword()).trim();

            if (hoTen.isEmpty() || taiKhoan.isEmpty() || matKhau.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // TODO: Thêm code lưu tài khoản vào database hoặc danh sách ở đây

            JOptionPane.showMessageDialog(this, "Lưu tài khoản thành công!");
            // Có thể xóa dữ liệu hoặc đóng form sau khi lưu
            clearForm();
        });
        contentPane.add(btnLuu);

        JButton btnHuy = new JButton("Hủy");
        btnHuy.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnHuy.setBounds(250, 190, 100, 35);
        btnHuy.addActionListener(e -> {
            this.dispose(); 
        });
        contentPane.add(btnHuy);
    }

    private void clearForm() {
        txtHoTen.setText("");
        txtTaiKhoan.setText("");
        txtMatKhau.setText("");
    }
}
