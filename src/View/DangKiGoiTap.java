package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Image;



public class DangKiGoiTap extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtngKGi;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private final Action action_4 = new SwingAction_4();
	private final Action action_5 = new SwingAction_5();
	private final Action action_6 = new SwingAction_6();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangKiGoiTap frame = new DangKiGoiTap();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DangKiGoiTap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 0, 160));
		panel.setBounds(0, 0, 311, 681);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 311, 143);
		panel.add(lblNewLabel);

		// Load ảnh từ resource
		ImageIcon originalIcon = new ImageIcon(DangKiGoiTap.class.getResource("/resources/f7db9d8c4c6de089f810d77f3d7bce40c515bfbd64ad91b96de2e79a17831b49.jpg"));

		// Lấy Image
		Image originalImage = originalIcon.getImage();

		// Resize ảnh theo kích thước JLabel
		Image scaledImage = originalImage.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);

		// Tạo ImageIcon mới từ ảnh đã scale
		ImageIcon scaledIcon = new ImageIcon(scaledImage);

		// Gán icon mới cho JLabel
		lblNewLabel.setIcon(scaledIcon);
		
		textField = new JTextField();
		textField.setText("WELCOME");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setColumns(10);
		textField.setBackground(new Color(0, 0, 160));
		textField.setBounds(75, 154, 162, 53);
		panel.add(textField);
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.setAction(action_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeMenu updateFrame = new HomeMenu();
				updateFrame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(54, 240, 200, 40);
		panel.add(btnNewButton);
		
		JButton btnQunL = new JButton("Quản lý");
		btnQunL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuanLyTaiKhoan updateFrame = new QuanLyTaiKhoan();
				updateFrame.setVisible(true);
				dispose();
			}
		});
		btnQunL.setAction(action);
		btnQunL.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnQunL.setBackground(Color.WHITE);
		btnQunL.setBounds(54, 291, 200, 40);
		panel.add(btnQunL);
		
		JButton btnNewButton_1_1 = new JButton("Hội viên");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HoiVien updateFrame = new HoiVien();
				updateFrame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setAction(action_2);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(54, 342, 200, 40);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Mua sản phẩm");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MuaSanPham updateFrame = new MuaSanPham();
				updateFrame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_2.setAction(action_3);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_2.setBackground(Color.WHITE);
		btnNewButton_1_2.setBounds(54, 393, 200, 40);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("Đăng kí gói");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2_1.setAction(action_4);
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_2_1.setBackground(Color.WHITE);
		btnNewButton_1_2_1.setBounds(54, 444, 200, 40);
		panel.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_1_1 = new JButton("Đăng xuất");
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DangNhap updateFrame = new DangNhap();
				updateFrame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_2_1_1.setAction(action_6);
		btnNewButton_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_2_1_1.setBackground(Color.WHITE);
		btnNewButton_1_2_1_1.setBounds(87, 609, 135, 34);
		panel.add(btnNewButton_1_2_1_1);
		
		JButton btnNewButton_1_2_1_2 = new JButton("Điểm danh");
		btnNewButton_1_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DiemDanh updateFrame = new DiemDanh();
				updateFrame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_2_1_2.setAction(action_5);
		btnNewButton_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_2_1_2.setBackground(Color.WHITE);
		btnNewButton_1_2_1_2.setBounds(54, 495, 200, 40);
		panel.add(btnNewButton_1_2_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(359, 29, 866, 47);
		contentPane.add(panel_1);
		
		txtngKGi = new JTextField();
		txtngKGi.setText("Đăng ký gói tập");
		txtngKGi.setHorizontalAlignment(SwingConstants.CENTER);
		txtngKGi.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtngKGi.setColumns(10);
		txtngKGi.setBounds(0, 0, 211, 47);
		panel_1.add(txtngKGi);
		
		// Panel chính chứa form đăng ký gói tập
				JPanel formPanel = new JPanel();
				formPanel.setLayout(null);
				formPanel.setBounds(359, 100, 866, 500);
				contentPane.add(formPanel);

				JLabel lblTenHoiVien = new JLabel("Tên hội viên:");
				lblTenHoiVien.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblTenHoiVien.setBounds(30, 30, 120, 30);
				formPanel.add(lblTenHoiVien);

				JTextField txtTenHoiVien = new JTextField();
				txtTenHoiVien.setFont(new Font("Tahoma", Font.PLAIN, 16));
				txtTenHoiVien.setBounds(160, 30, 250, 30);
				formPanel.add(txtTenHoiVien);

				JLabel lblGoiTap = new JLabel("Chọn gói tập:");
				lblGoiTap.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblGoiTap.setBounds(30, 80, 120, 30);
				formPanel.add(lblGoiTap);

				JComboBox<String> comboGoiTap = new JComboBox<>();
				comboGoiTap.setFont(new Font("Tahoma", Font.PLAIN, 16));
				comboGoiTap.setBounds(160, 80, 250, 30);
				comboGoiTap.addItem("Gói cơ bản");
				comboGoiTap.addItem("Gói nâng cao");
				comboGoiTap.addItem("Gói chuyên sâu");
				formPanel.add(comboGoiTap);

				JLabel lblThoiGian = new JLabel("Thời gian:");
				lblThoiGian.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblThoiGian.setBounds(30, 130, 120, 30);
				formPanel.add(lblThoiGian);

				JComboBox<String> comboThoiGian = new JComboBox<>();
				comboThoiGian.setFont(new Font("Tahoma", Font.PLAIN, 16));
				comboThoiGian.setBounds(160, 130, 250, 30);
				comboThoiGian.addItem("1 tháng");
				comboThoiGian.addItem("3 tháng");
				comboThoiGian.addItem("6 tháng");
				comboThoiGian.addItem("1 năm");
				formPanel.add(comboThoiGian);

				JLabel lblMoTa = new JLabel("Mô tả:");
				lblMoTa.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblMoTa.setBounds(30, 180, 120, 30);
				formPanel.add(lblMoTa);

				JTextArea txtMoTa = new JTextArea();
				txtMoTa.setFont(new Font("Tahoma", Font.PLAIN, 14));
				txtMoTa.setLineWrap(true);
				txtMoTa.setWrapStyleWord(true);
				txtMoTa.setBounds(160, 180, 450, 150);
				formPanel.add(txtMoTa);

				JButton btnDangKy = new JButton("Đăng ký");
				btnDangKy.setFont(new Font("Tahoma", Font.BOLD, 16));
				btnDangKy.setBounds(160, 350, 120, 40);
				formPanel.add(btnDangKy);

				JButton btnHuy = new JButton("Hủy");
				btnHuy.setFont(new Font("Tahoma", Font.PLAIN, 16));
				btnHuy.setBounds(300, 350, 120, 40);
				formPanel.add(btnHuy);

				// Hành động nút
				btnDangKy.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String ten = txtTenHoiVien.getText();
						String goi = (String) comboGoiTap.getSelectedItem();
						String thoiGian = (String) comboThoiGian.getSelectedItem();
						String moTa = txtMoTa.getText();
						
						// Xử lý đăng ký (có thể lưu vào database)
						System.out.println("Đăng ký cho: " + ten + " | Gói: " + goi + " | Thời gian: " + thoiGian + " | Mô tả: " + moTa);
					}
				});

				btnHuy.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtTenHoiVien.setText("");
						txtMoTa.setText("");
						comboGoiTap.setSelectedIndex(0);
						comboThoiGian.setSelectedIndex(0);
					}
				});
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Quản lý");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "HOME");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Hội viên");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Mua sản phẩm");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "Đăng kí gói");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_5 extends AbstractAction {
		public SwingAction_5() {
			putValue(NAME, "Điểm danh");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_6 extends AbstractAction {
		public SwingAction_6() {
			putValue(NAME, "Đăng xuất");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
