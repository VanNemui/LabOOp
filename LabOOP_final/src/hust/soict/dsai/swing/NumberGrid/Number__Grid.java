package hust.soict.dsai.swing.NumberGrid;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Number__Grid extends JFrame {
	private JButton[] btnNumbers = new JButton[10];
	private JButton btnDelete, btnReset;
	private JTextField tfDisplay;
	private String strNumber = "";

	public Number__Grid() {
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());

		// thiết lập ô chứa
		JPanel panelButtons = new JPanel(new FlowLayout());
		cp.add(panelButtons, BorderLayout.NORTH);

		// thiết lập phần nhập số
		tfDisplay = new JTextField(20);
		tfDisplay.setEditable(false);
		tfDisplay.setHorizontalAlignment(JTextField.RIGHT);
		panelButtons.add(tfDisplay);

		// thiết lập các button
		JPanel pnlButtons = new JPanel(new GridLayout(4, 3, 3, 3));
		cp.add(pnlButtons, BorderLayout.CENTER);

		ButtonListener btnListener = new ButtonListener(); // thao tác trên button
		// thêm các nút từ 1 đến 9 và add vào JPanel
		for (int i = 1; i <= 9; i++) {
			btnNumbers[i] = new JButton(i + "");
			pnlButtons.add(btnNumbers[i]);
			btnNumbers[i].addActionListener(btnListener);
		}

		/*
		 * nút DEL: xóa toàn bộ dữ liệu Thiết lập nút Del, add vào JPanel Viết chương
		 * trình dành cho nút DEl
		 */
		btnDelete = new JButton("DEL");
		pnlButtons.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				strNumber = "";
				tfDisplay.setText(strNumber);
			}
		});

		btnNumbers[0] = new JButton("0"); // thêm nút 0 vào mảng
		pnlButtons.add(btnNumbers[0]); // thêm vào JPabel
		btnNumbers[0].addActionListener(btnListener);

		btnReset = new JButton("C"); // thêm nút C
		pnlButtons.add(btnReset); // thêm vào JPanel
		btnReset.addActionListener(new ActionListener() {// viết chương trình cho nút C: xóa kí tự vừa thêm vào
			@Override
			public void actionPerformed(ActionEvent e) {
				strNumber += e.getActionCommand();
				int length = strNumber.length();
				strNumber = strNumber.substring(0, length - 2);
				tfDisplay.setText(strNumber);
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // thoát chương trình khi nhấn nút đóng
		setTitle("Number Grid"); // tiêu đề
		setSize(300, 300); // kích thước
		setVisible(true); // hiển thị ra màn hình
		setLocationRelativeTo(null); // hiển thị chính giữa màn hình
	}

	// hiển thị trên JTextField
	private class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			strNumber += e.getActionCommand();
			tfDisplay.setText(strNumber);
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Number__Grid();
			}
		});
	}
}
