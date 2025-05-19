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
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class QuanLyTaiKhoan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtQunLTi;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private final Action action_4 = new SwingAction_4();
	private final Action action_5 = new SwingAction_5();
	private final Action action_6 = new SwingAction_6();
	private final Action action_7 = new SwingAction_7();
	private final Action action_8 = new SwingAction_8();
	private final Action action_9 = new SwingAction_9();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyTaiKhoan frame = new QuanLyTaiKhoan();
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
	public QuanLyTaiKhoan() {
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
		
		textField = new JTextField();
		textField.setText("WELCOME");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setColumns(10);
		textField.setBackground(new Color(0, 0, 160));
		textField.setBounds(75, 154, 162, 53);
		panel.add(textField);
		
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

		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeMenu updateFrame = new HomeMenu();
				updateFrame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setAction(action);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(54, 240, 200, 40);
		panel.add(btnNewButton);
		
		JButton btnQunL = new JButton("Quản lý");
		btnQunL.setAction(action_1);
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
				DangKiGoiTap updateFrame = new DangKiGoiTap();
				updateFrame.setVisible(true);
				dispose();
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
		
		txtQunLTi = new JTextField();
		txtQunLTi.setText("Quản lý tài khoản");
		txtQunLTi.setHorizontalAlignment(SwingConstants.CENTER);
		txtQunLTi.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtQunLTi.setColumns(10);
		txtQunLTi.setBounds(0, 0, 211, 47);
		panel_1.add(txtQunLTi);
		
		// Bảng danh sách tài khoản
				String[] columnNames = { "ID", "Họ tên", "Tài khoản", "Mật khẩu" };
				Object[][] data = {
				    { 1, "Nguyễn Văn A", "admin", "hashed_pass1" },
				    { 2, "Trần Thị B", "staff01", "hashed_pass2" },
				    { 3, "Lê Văn C", "user01", "hashed_pass3" }
				};

				JTable table = new JTable(data, columnNames);
				table.setFont(new Font("Tahoma", Font.PLAIN, 14));
				table.setRowHeight(25);

				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(359, 215, 866, 442);
				contentPane.add(scrollPane);
				
				JButton btnNewButton_1_3_1 = new JButton("Thêm");
				btnNewButton_1_3_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ThemTK updateFrame = new ThemTK();
						updateFrame.setVisible(true);
					}
				});
				btnNewButton_1_3_1.setAction(action_7);
				btnNewButton_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnNewButton_1_3_1.setBounds(359, 171, 117, 33);
				contentPane.add(btnNewButton_1_3_1);
				
				JButton btnNewButton_1_4_1 = new JButton("Sửa");
				btnNewButton_1_4_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						SuaTK updateFrame = new SuaTK();
						updateFrame.setVisible(true);
					}
				});
				btnNewButton_1_4_1.setAction(action_8);
				btnNewButton_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnNewButton_1_4_1.setBounds(486, 171, 117, 33);
				contentPane.add(btnNewButton_1_4_1);
				
				JButton btnNewButton_1_4 = new JButton("Xóa");
				btnNewButton_1_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						XoaTK updateFrame = new XoaTK();
						updateFrame.setVisible(true);
					}
				});
				btnNewButton_1_4.setAction(action_9);
				btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnNewButton_1_4.setBounds(613, 171, 117, 33);
				contentPane.add(btnNewButton_1_4);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "HOME");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Quản lý");
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
	private class SwingAction_7 extends AbstractAction {
		public SwingAction_7() {
			putValue(NAME, "Thêm");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_8 extends AbstractAction {
		public SwingAction_8() {
			putValue(NAME, "Sửa");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_9 extends AbstractAction {
		public SwingAction_9() {
			putValue(NAME, "Xóa");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
