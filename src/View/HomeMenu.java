package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Image;

public class HomeMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtWelcome;
	private JTextField txtTrangCh;
	private final Action QuanLy = new SwingAction();
	private final Action HoiVien = new SwingAction_1();
	private final Action MuaSanPham = new SwingAction_2();
	private final Action DangKiGoi = new SwingAction_3();
	private final Action DiemDanh = new SwingAction_4();
	private final Action DangXuat = new SwingAction_5();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeMenu frame = new HomeMenu();
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
	public HomeMenu() {
		setTitle("Home");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel BackGround = new JLabel("");
		BackGround.setIcon(new ImageIcon(HomeMenu.class.getResource("/resources/gym-background-2n2a165exmwmenur.jpg")));
		BackGround.setBounds(359, 102, 866, 487);
		contentPane.add(BackGround);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 160));
		panel.setBounds(0, 0, 311, 681);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtWelcome = new JTextField();
		txtWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcome.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtWelcome.setBounds(75, 154, 162, 53);
		txtWelcome.setForeground(new Color(255, 255, 255));
		txtWelcome.setText("WELCOME");
		txtWelcome.setBackground(new Color(0, 0, 160));
		panel.add(txtWelcome);
		txtWelcome.setColumns(10);
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
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
		btnQunL.setAction(QuanLy);
		btnQunL.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnQunL.setBackground(new Color(255, 255, 255));
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
		btnNewButton_1_2.setAction(MuaSanPham);
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
		btnNewButton_1_2_1.setAction(DangKiGoi);
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
		btnNewButton_1_2_1_1.setAction(DangXuat);
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
		btnNewButton_1_2_1_2.setAction(DiemDanh);
		btnNewButton_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_2_1_2.setBackground(Color.WHITE);
		btnNewButton_1_2_1_2.setBounds(54, 495, 200, 40);
		panel.add(btnNewButton_1_2_1_2);
		
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setBounds(359, 29, 866, 47);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtTrangCh = new JTextField();
		txtTrangCh.setHorizontalAlignment(SwingConstants.CENTER);
		txtTrangCh.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtTrangCh.setText("Trang chủ");
		txtTrangCh.setBounds(0, 0, 211, 47);
		panel_1.add(txtTrangCh);
		txtTrangCh.setColumns(10);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Quản Lý");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Hội viên");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Mua sản phẩm");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Đăng kí gói");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "Điểm danh");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_5 extends AbstractAction {
		public SwingAction_5() {
			putValue(NAME, "Đăng xuất");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
