package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class SuaTK extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtTenNguoiDung;
    private JTextField txtTaiKhoanMoi;
    private JPasswordField txtMatKhauMoi;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                SuaTK frame = new SuaTK();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public SuaTK() {
        setTitle("Sửa tài khoản");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 350);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(15, 15, 15, 15));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTenNguoiDung = new JLabel("Tên người dùng:");
        lblTenNguoiDung.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblTenNguoiDung.setBounds(30, 30, 120, 25);
        contentPane.add(lblTenNguoiDung);

        txtTenNguoiDung = new JTextField();
        txtTenNguoiDung.setBounds(160, 30, 230, 25);
        contentPane.add(txtTenNguoiDung);
        txtTenNguoiDung.setColumns(10);

        JLabel lblTaiKhoanMoi = new JLabel("Tài khoản mới:");
        lblTaiKhoanMoi.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblTaiKhoanMoi.setBounds(30, 80, 120, 25);
        contentPane.add(lblTaiKhoanMoi);

        txtTaiKhoanMoi = new JTextField();
        txtTaiKhoanMoi.setBounds(160, 80, 230, 25);
        contentPane.add(txtTaiKhoanMoi);
        txtTaiKhoanMoi.setColumns(10);

        JLabel lblMatKhauMoi = new JLabel("Mật khẩu mới:");
        lblMatKhauMoi.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblMatKhauMoi.setBounds(30, 130, 120, 25);
        contentPane.add(lblMatKhauMoi);

        txtMatKhauMoi = new JPasswordField();
        txtMatKhauMoi.setBounds(160, 130, 230, 25);
        contentPane.add(txtMatKhauMoi);

        JButton btnLuu = new JButton("Lưu");
        btnLuu.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnLuu.setBounds(100, 200, 100, 35);
        btnLuu.addActionListener(e -> {
            String tenNguoiDung = txtTenNguoiDung.getText().trim();
            String taiKhoanMoi = txtTaiKhoanMoi.getText().trim();
            String matKhauMoi = new String(txtMatKhauMoi.getPassword()).trim();

            if (tenNguoiDung.isEmpty() || taiKhoanMoi.isEmpty() || matKhauMoi.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Vui lòng nhập đầy đủ tên người dùng, tài khoản và mật khẩu!",
                        "Lỗi",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            // TODO: Thêm logic cập nhật tài khoản trong database hoặc danh sách ở đây

            JOptionPane.showMessageDialog(this,
                    "Cập nhật tài khoản thành công!");
            // Nếu muốn, có thể reset form:
            txtTenNguoiDung.setText("");
            txtTaiKhoanMoi.setText("");
            txtMatKhauMoi.setText("");
        });
        contentPane.add(btnLuu);

        JButton btnHuy = new JButton("Hủy");
        btnHuy.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnHuy.setBounds(250, 200, 100, 35);
        btnHuy.addActionListener(e -> this.dispose());
        contentPane.add(btnHuy);
    }
}
