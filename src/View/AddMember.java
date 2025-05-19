package View;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddMember extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtHoTen, txtNgaySinh, txtEmail, txtSDT, txtNgayDangKy;
	private JComboBox<String> comboGioiTinh;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				AddMember frame = new AddMember();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public AddMember() {
		setTitle("Thêm hội viên");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel lblHoTen = new JLabel("Họ và tên:");
		lblHoTen.setBounds(30, 30, 100, 25);
		contentPane.add(lblHoTen);

		txtHoTen = new JTextField();
		txtHoTen.setBounds(150, 30, 300, 25);
		contentPane.add(txtHoTen);

		JLabel lblGioiTinh = new JLabel("Giới tính:");
		lblGioiTinh.setBounds(30, 70, 100, 25);
		contentPane.add(lblGioiTinh);

		comboGioiTinh = new JComboBox<>(new String[]{"Nam", "Nữ"});
		comboGioiTinh.setBounds(150, 70, 300, 25);
		contentPane.add(comboGioiTinh);

		JLabel lblNgaySinh = new JLabel("Ngày sinh:");
		lblNgaySinh.setBounds(30, 110, 100, 25);
		contentPane.add(lblNgaySinh);

		txtNgaySinh = new JTextField("dd/MM/yyyy");
		txtNgaySinh.setBounds(150, 110, 300, 25);
		contentPane.add(txtNgaySinh);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(30, 150, 100, 25);
		contentPane.add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setBounds(150, 150, 300, 25);
		contentPane.add(txtEmail);

		JLabel lblSDT = new JLabel("Số điện thoại:");
		lblSDT.setBounds(30, 190, 100, 25);
		contentPane.add(lblSDT);

		txtSDT = new JTextField();
		txtSDT.setBounds(150, 190, 300, 25);
		contentPane.add(txtSDT);

		JLabel lblNgayDangKy = new JLabel("Ngày đăng ký:");
		lblNgayDangKy.setBounds(30, 230, 100, 25);
		contentPane.add(lblNgayDangKy);

		txtNgayDangKy = new JTextField("dd/MM/yyyy");
		txtNgayDangKy.setBounds(150, 230, 300, 25);
		contentPane.add(txtNgayDangKy);

		JButton btnThem = new JButton("Thêm");
		btnThem.setBounds(180, 280, 100, 30);
		contentPane.add(btnThem);

		// Xử lý nút Thêm
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hoTen = txtHoTen.getText();
				String gioiTinh = (String) comboGioiTinh.getSelectedItem();
				String ngaySinh = txtNgaySinh.getText();
				String email = txtEmail.getText();
				String sdt = txtSDT.getText();
				String ngayDK = txtNgayDangKy.getText();

				JOptionPane.showMessageDialog(AddMember.this,
						"Thông tin hội viên:\n" +
						"Họ tên: " + hoTen + "\n" +
						"Giới tính: " + gioiTinh + "\n" +
						"Ngày sinh: " + ngaySinh + "\n" +
						"Email: " + email + "\n" +
						"SĐT: " + sdt + "\n" +
						"Ngày ĐK: " + ngayDK
				);
			}
		});
	}
}
