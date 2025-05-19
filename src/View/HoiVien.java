package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Image;


public class HoiVien extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtHiVin;
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
					HoiVien frame = new HoiVien();
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
	public HoiVien() {
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
		btnNewButton.setAction(action_3);
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
		btnQunL.setAction(action_4);
		btnQunL.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnQunL.setBackground(Color.WHITE);
		btnQunL.setBounds(54, 291, 200, 40);
		panel.add(btnQunL);
		
		JButton btnNewButton_1_1 = new JButton("Hội viên");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setAction(action_5);
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
		btnNewButton_1_2.setAction(action_6);
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
		btnNewButton_1_2_1.setAction(action_7);
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
		btnNewButton_1_2_1_1.setAction(action_9);
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
		btnNewButton_1_2_1_2.setAction(action_8);
		btnNewButton_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_2_1_2.setBackground(Color.WHITE);
		btnNewButton_1_2_1_2.setBounds(54, 495, 200, 40);
		panel.add(btnNewButton_1_2_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(359, 29, 866, 47);
		contentPane.add(panel_1);
		
		txtHiVin = new JTextField();
		txtHiVin.setText("Hội viên");
		txtHiVin.setHorizontalAlignment(SwingConstants.CENTER);
		txtHiVin.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtHiVin.setColumns(10);
		txtHiVin.setBounds(0, 0, 211, 47);
		panel_1.add(txtHiVin);
		
		// Tạo dữ liệu cột và dòng mẫu
		String[] columnNames = {"ID", "Họ tên", "Giới tính", "Email", "SĐT"};
		Object[][] data = {
		    {"1", "Nguyễn Văn A", "Nam", "vana@gmail.com", "0901234567"},
		    {"2", "Trần Thị B", "Nữ", "thib@gmail.com", "0987654321"},
		    {"3", "Lê Văn C", "Nam", "vanc@gmail.com", "0912345678"}
		};

		// Tạo bảng
		JTable table = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(table);

		// Đặt vị trí và kích thước phù hợp
		scrollPane.setBounds(359, 170, 866, 500); // Tuỳ chỉnh tọa độ + kích thước
		contentPane.add(scrollPane);
		
		JButton btnNewButton_1_4 = new JButton("Xóa");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteMember updateFrame = new DeleteMember();
				updateFrame.setVisible(true);
			}
		});
		btnNewButton_1_4.setAction(action_2);
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_4.setBounds(613, 126, 117, 33);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_3_1 = new JButton("Thêm");
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddMember addFrame = new AddMember();
				addFrame.setVisible(true);
			}
		});
		btnNewButton_1_3_1.setAction(action);
		btnNewButton_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_3_1.setBounds(359, 126, 117, 33);
		contentPane.add(btnNewButton_1_3_1);
		
		JButton btnNewButton_1_4_1 = new JButton("Sửa");
		btnNewButton_1_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateMember updateFrame = new UpdateMember();
				updateFrame.setVisible(true);
			}
		});
		btnNewButton_1_4_1.setAction(action_1);
		btnNewButton_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_4_1.setBounds(486, 126, 117, 33);
		contentPane.add(btnNewButton_1_4_1);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Thêm");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Sửa");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Xóa");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "HOME");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "Quản lý");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_5 extends AbstractAction {
		public SwingAction_5() {
			putValue(NAME, "Hội viên");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_6 extends AbstractAction {
		public SwingAction_6() {
			putValue(NAME, "Mua sản phẩm");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_7 extends AbstractAction {
		public SwingAction_7() {
			putValue(NAME, "Đăng kí gói");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_8 extends AbstractAction {
		public SwingAction_8() {
			putValue(NAME, "Điểm danh");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_9 extends AbstractAction {
		public SwingAction_9() {
			putValue(NAME, "Đăng xuất");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
