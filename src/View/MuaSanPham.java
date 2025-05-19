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
import javax.swing.JLabel;
import java.awt.Image;
import javax.swing.ImageIcon;

public class MuaSanPham extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtMuaSnPhm;
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
					MuaSanPham frame = new MuaSanPham();
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
	public MuaSanPham() {
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
		btnQunL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuanLyTaiKhoan updateFrame = new QuanLyTaiKhoan();
				updateFrame.setVisible(true);
				dispose();
			}
		});
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
		
		txtMuaSnPhm = new JTextField();
		txtMuaSnPhm.setText("Mua sản phẩm");
		txtMuaSnPhm.setHorizontalAlignment(SwingConstants.CENTER);
		txtMuaSnPhm.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtMuaSnPhm.setColumns(10);
		txtMuaSnPhm.setBounds(0, 0, 211, 47);
		panel_1.add(txtMuaSnPhm);
		
		// Form nhập mua sản phẩm
				JLabel lblTenHoiVien = new JLabel("Tên hội viên:");
				lblTenHoiVien.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblTenHoiVien.setBounds(400, 100, 150, 30);
				contentPane.add(lblTenHoiVien);
				
				JTextField txtTenHoiVien = new JTextField();
				txtTenHoiVien.setBounds(550, 100, 250, 30);
				contentPane.add(txtTenHoiVien);
				
				JLabel lblTenSanPham = new JLabel("Tên sản phẩm:");
				lblTenSanPham.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblTenSanPham.setBounds(400, 150, 150, 30);
				contentPane.add(lblTenSanPham);
				
				JTextField txtTenSanPham = new JTextField();
				txtTenSanPham.setBounds(550, 150, 250, 30);
				contentPane.add(txtTenSanPham);
				
				JLabel lblSoLuong = new JLabel("Số lượng:");
				lblSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblSoLuong.setBounds(400, 200, 150, 30);
				contentPane.add(lblSoLuong);
				
				JTextField txtSoLuong = new JTextField();
				txtSoLuong.setBounds(550, 200, 250, 30);
				contentPane.add(txtSoLuong);
				
				JLabel lblNgayMua = new JLabel("Ngày mua (dd/MM/yyyy):");
				lblNgayMua.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNgayMua.setBounds(400, 250, 200, 30);
				contentPane.add(lblNgayMua);
				
				JTextField txtNgayMua = new JTextField();
				txtNgayMua.setBounds(600, 250, 200, 30);
				contentPane.add(txtNgayMua);
				
				JLabel lblTongTien = new JLabel("Tổng tiền:");
				lblTongTien.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblTongTien.setBounds(400, 300, 150, 30);
				contentPane.add(lblTongTien);
				
				JTextField txtTongTien = new JTextField();
				txtTongTien.setEditable(false); // chỉ hiển thị, chưa tính
				txtTongTien.setBounds(550, 300, 250, 30);
				contentPane.add(txtTongTien);
				
				JLabel lblGhiChu = new JLabel("Ghi chú:");
				lblGhiChu.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblGhiChu.setBounds(400, 350, 150, 30);
				contentPane.add(lblGhiChu);
				
				JTextField txtGhiChu = new JTextField();
				txtGhiChu.setBounds(550, 350, 250, 30);
				contentPane.add(txtGhiChu);

				// Nút Mua
				JButton btnMua = new JButton("Mua");
				btnMua.setFont(new Font("Tahoma", Font.BOLD, 16));
				btnMua.setBounds(550, 420, 100, 40);
				contentPane.add(btnMua);

				// Nút Hủy
				JButton btnHuy = new JButton("Hủy");
				btnHuy.setFont(new Font("Tahoma", Font.BOLD, 16));
				btnHuy.setBounds(700, 420, 100, 40);
				contentPane.add(btnHuy);
				
				// Action xử lý khi ấn nút
				btnMua.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        String tenHoiVien = txtTenHoiVien.getText();
				        String tenSanPham = txtTenSanPham.getText();
				        String soLuong = txtSoLuong.getText();
				        String ngayMua = txtNgayMua.getText();
				        String ghiChu = txtGhiChu.getText();
				        
				        // TODO: Tính tổng tiền, kiểm tra dữ liệu và lưu vào CSDL
				        System.out.println("Mua sản phẩm: " + tenSanPham + ", SL: " + soLuong);
				    }
				});
				
				btnHuy.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        txtTenHoiVien.setText("");
				        txtTenSanPham.setText("");
				        txtSoLuong.setText("");
				        txtNgayMua.setText("");
				        txtTongTien.setText("");
				        txtGhiChu.setText("");
				    }
				});
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
}
