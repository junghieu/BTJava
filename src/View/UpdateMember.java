package View;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateMember extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSearch, txtEmail, txtPhone, txtNgayDK, txtNgaySinh;
	private JComboBox<String> comboGioiTinh;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				UpdateMember frame = new UpdateMember();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public UpdateMember() {
		setTitle("Cập nhật hội viên");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel lblSearch = new JLabel("Tìm tên hội viên:");
		lblSearch.setBounds(30, 20, 120, 25);
		contentPane.add(lblSearch);

		txtSearch = new JTextField();
		txtSearch.setBounds(160, 20, 200, 25);
		contentPane.add(txtSearch);

		JButton btnSearch = new JButton("Tìm");
		btnSearch.setBounds(370, 20, 70, 25);
		contentPane.add(btnSearch);

		JLabel lblGioiTinh = new JLabel("Giới tính:");
		lblGioiTinh.setBounds(30, 70, 100, 25);
		contentPane.add(lblGioiTinh);

		comboGioiTinh = new JComboBox<>(new String[]{"Nam", "Nữ", "Khác"});
		comboGioiTinh.setBounds(160, 70, 200, 25);
		contentPane.add(comboGioiTinh);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(30, 110, 100, 25);
		contentPane.add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setBounds(160, 110, 200, 25);
		contentPane.add(txtEmail);

		JLabel lblNgayDK = new JLabel("Ngày đăng ký:");
		lblNgayDK.setBounds(30, 150, 100, 25);
		contentPane.add(lblNgayDK);

		txtNgayDK = new JTextField("yyyy-MM-dd");
		txtNgayDK.setBounds(160, 150, 200, 25);
		contentPane.add(txtNgayDK);

		JLabel lblSDT = new JLabel("SĐT:");
		lblSDT.setBounds(30, 190, 100, 25);
		contentPane.add(lblSDT);

		txtPhone = new JTextField();
		txtPhone.setBounds(160, 190, 200, 25);
		contentPane.add(txtPhone);

		JLabel lblNgaySinh = new JLabel("Ngày sinh:");
		lblNgaySinh.setBounds(30, 230, 100, 25);
		contentPane.add(lblNgaySinh);

		txtNgaySinh = new JTextField("yyyy-MM-dd");
		txtNgaySinh.setBounds(160, 230, 200, 25);
		contentPane.add(txtNgaySinh);

		JButton btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.setBounds(100, 280, 120, 30);
		contentPane.add(btnCapNhat);

		JButton btnHuy = new JButton("Hủy");
		btnHuy.setBounds(250, 280, 120, 30);
		contentPane.add(btnHuy);

		// Xử lý nút Tìm
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ten = txtSearch.getText().trim();
				if (ten.isEmpty()) {
					JOptionPane.showMessageDialog(UpdateMember.this, "Vui lòng nhập tên để tìm kiếm.");
					return;
				}

				// TODO: Truy vấn thông tin từ database bằng tên người dùng
				// Giả lập: đổ dữ liệu demo
				comboGioiTinh.setSelectedItem("Nam");
				txtEmail.setText("abc@email.com");
				txtPhone.setText("0123456789");
				txtNgayDK.setText("2024-01-01");
				txtNgaySinh.setText("2000-01-01");
			}
		});

		// Xử lý nút Cập nhật
		btnCapNhat.addActionListener(e -> {
			String ten = txtSearch.getText().trim();
			String gioiTinh = (String) comboGioiTinh.getSelectedItem();
			String email = txtEmail.getText().trim();
			String ngayDK = txtNgayDK.getText().trim();
			String sdt = txtPhone.getText().trim();
			String ngaySinh = txtNgaySinh.getText().trim();

			if (ten.isEmpty() || email.isEmpty() || ngayDK.isEmpty() || sdt.isEmpty() || ngaySinh.isEmpty()) {
				JOptionPane.showMessageDialog(UpdateMember.this, "Vui lòng điền đầy đủ thông tin.");
				return;
			}

			// TODO: Gọi DAO để cập nhật vào DB
			JOptionPane.showMessageDialog(UpdateMember.this, "Cập nhật thông tin hội viên thành công!");
		});

		// Xử lý nút Hủy
		btnHuy.addActionListener(e -> dispose());
	}
}
