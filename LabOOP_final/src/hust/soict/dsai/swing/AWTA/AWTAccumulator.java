package hust.soict.dsai.swing.AWTA;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame {
	private TextField tfInput; // khai báo TextField input
	private TextField tfOutput; // khai báo kiểu xuất textfield
	private int sum = 0; // tổng = 0, init thành 0

	// trình xây dựng để thiết lập các thành phần GUI và trình xử lý sự kiện
	public AWTAccumulator() {
		setLayout(new GridLayout(2, 2)); // có 2 hàng và 2 cột
		add(new Label("Enter an Integer: ")); // nhãn ẩn danh
		tfInput = new TextField(10); // xây dựng textField
		add(tfInput); // thêm textField
		tfInput.addActionListener((ActionListener) new TFInputListener());
		/*
		 * "tfInput" là đối tượng nguồn kích hoạt ActionEvent khi được nhập nguồn thêm 1
		 * thể hiện ẩn danh của TFInputListener thuộc kiểu ActionListener
		 * 
		 */

		add(new Label("The AWTAccumulated Sum is: ")); // thêm nhãn ẩn danh
		tfOutput = new TextField(10); // cấp phát textField
		tfOutput.setEditable(false); // add-only
		add(tfOutput); // thêm textField
		setTitle("AWT Accumulator"); // đặt tiêu đề
		setSize(350, 120); // kích thước cửa sổ
		setVisible(true);
	}

	// gọi hàm tạo để thiết lập GUI
	public static void main(String[] args) {
		new AWTAccumulator(); // cấp phát một thể hiện ẩn danh
	}

	/*
	 * định nghĩa một lớp bên trong để xử lý textField đầu vào dựa vào interface
	 * ActionListener trình xử lý được gọi lại khi nhấn enter trên textField
	 */
	private class TFInputListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evt) {
			// lấy chuỗi đã nhập vào textField tfInput, chuyển thành kiểu int
			int numberIn = Integer.parseInt(tfInput.getText());
			sum += numberIn; // cộng dồn các số nhập
			tfInput.setText(""); // xóa đầu vào
			tfOutput.setText(sum + ""); // hiển thị tổng trên textField đầu ra, chuyển int thành String

		}
	}
}