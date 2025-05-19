package View;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteMember extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTenHoiVien;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				DeleteMember frame = new DeleteMember();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DeleteMember() {
		setTitle("Xóa Hội Viên");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 250);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel lblTenHoiVien = new JLabel("Tên hội viên:");
		lblTenHoiVien.setBounds(30, 40, 100, 25);
		contentPane.add(lblTenHoiVien);

		txtTenHoiVien = new JTextField();
		txtTenHoiVien.setBounds(140, 40, 250, 25);
		contentPane.add(txtTenHoiVien);

		JButton btnXoa = new JButton("Xóa");
		btnXoa.setBounds(100, 100, 100, 30);
		contentPane.add(btnXoa);

		JButton btnHuy = new JButton("Hủy");
		btnHuy.setBounds(230, 100, 100, 30);
		contentPane.add(btnHuy);

		// Sự kiện nút XÓA
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tenHoiVien = txtTenHoiVien.getText().trim();

				if (tenHoiVien.isEmpty()) {
					JOptionPane.showMessageDialog(DeleteMember.this,
							"Vui lòng nhập tên hội viên cần xóa.",
							"Lỗi", JOptionPane.WARNING_MESSAGE);
					return;
				}

				int confirm = JOptionPane.showConfirmDialog(DeleteMember.this,
						"Bạn có chắc muốn xóa hội viên \"" + tenHoiVien + "\"?",
						"Xác nhận", JOptionPane.YES_NO_OPTION);

				if (confirm == JOptionPane.YES_OPTION) {
					// TODO: Gọi DAO hoặc xử lý xóa từ cơ sở dữ liệu ở đây

					JOptionPane.showMessageDialog(DeleteMember.this,
							"Đã xóa hội viên: " + tenHoiVien,
							"Thành công", JOptionPane.INFORMATION_MESSAGE);
					txtTenHoiVien.setText("");
				}
			}
		});

		// Sự kiện nút HỦY
		btnHuy.addActionListener(e -> dispose());
	}
}
