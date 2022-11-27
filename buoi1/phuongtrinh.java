package lab01;
// 2.2.6: giai phuong trinh

import javax.swing.JOptionPane;
public class phuongtrinh {
	public static void main ( String [] args) {
		
		String aNumber, bNumber, cNumber, a1Number, b1Number, c1Number;
		
		String x = " Nghiem cua phuong trinh la: ", 
			   x1 = " Nghiem thu nhat cua he phuong trinh la: ", x2 = " Nghiem thu hai cua he phuong trinh la: ",
			   x3 = " Nghiem cua he phuong trinh khi a=0 la: ", x4 = " Nghiem kep cua he phuong trinh la: ",
			   x5 = " Nghiem thu nhat cua he phuong trinh la: ", x6 = " Nghiem thu hai cua he phuong trinh la: ";
		
		// Giai phuong trinh ax + b = 0
		JOptionPane.showMessageDialog(null, "Giai phuong trinh bac nhat 1 an: ax + b = 0", "1.1 giai phuong trinh bac nhat", JOptionPane.INFORMATION_MESSAGE);
		
		aNumber = JOptionPane.showInputDialog(null, "Nhap so a: ",
				"Nhap so a: ", JOptionPane.INFORMATION_MESSAGE);
		
		bNumber = JOptionPane.showInputDialog(null, "Nhap so b: ",
				"Nhap so b: ", JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, aNumber + "x + "+ bNumber + " = 0.", " Phuong trinh: " , JOptionPane.INFORMATION_MESSAGE);
		
		double a = Double.parseDouble(aNumber);
		double b = Double.parseDouble(bNumber);
		
		if( a == 0 ) {
			if( b == 0 ) {
				JOptionPane.showMessageDialog(null, "Phuong trinh co vo so nghiem. "," TH1: ", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem. ","TH2: ", JOptionPane.INFORMATION_MESSAGE);
			}
		}else {
			x += -b / a;
			JOptionPane.showMessageDialog(null, x, "TH3: ", JOptionPane.INFORMATION_MESSAGE);
		}
		
		// Giai he phuong trinh bac nhat hai an x, x1
		// ax + b = c
		// a1x + b1 = c1
		
		JOptionPane.showMessageDialog(null, "Giai he phuong trinh bac nhat 2 an! (a,b lay tu 1.1 Giai phuong trinh)", "1.2 Giai he phuong trinh", JOptionPane.INFORMATION_MESSAGE);
		
		cNumber = JOptionPane.showInputDialog(null, "Nhap so c: ",
				"Phuong trinh thu nhat: ", JOptionPane.INFORMATION_MESSAGE);
		a1Number = JOptionPane.showInputDialog(null, "Nhap so a1: ",
				"Phuong trinh thu hai: ", JOptionPane.INFORMATION_MESSAGE);
		b1Number = JOptionPane.showInputDialog(null, "Nhap so b1: ",
				"Phuong trinh thu hai: ", JOptionPane.INFORMATION_MESSAGE);
		c1Number = JOptionPane.showInputDialog(null, "Nhap so c1: ",
				"Phuong trinh thu hai: ", JOptionPane.INFORMATION_MESSAGE);
		
		double c = Double.parseDouble(cNumber);
		double a1 = Double.parseDouble(a1Number);
		double b1 = Double.parseDouble(b1Number);
		double c1 = Double.parseDouble(c1Number);
		
		if(a / a1 == b / b1 && b / b1 == c / c1) {
			JOptionPane.showMessageDialog(null, "Phuong trinh co vo so nghiem. ","TH1: ", JOptionPane.INFORMATION_MESSAGE);
		} 
		else if(a / a1 == b / b1 && b / b1 != c / c1) {
			JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem. ", "TH2:", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			x2 += (c * a1 - c1 * a) / (b * a1 - b1 * a);
			x1 += (c - b * (c * a1 - c1 * a) / (b * a1 - b1 * a)) / a;  //x= (c-bx1)/a;
			JOptionPane.showMessageDialog(null, x1, "TH3: ", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, x2, "TH3:  ", JOptionPane.INFORMATION_MESSAGE);
		}
		// Giai phuong trinh bac hai
		// ax^2 + bx + c = 0
		JOptionPane.showMessageDialog(null, "Giai phuong trinh bac hai (he so a, b, c lay tu ben tren)", "1.3 Giai phuong trinh bac hai", JOptionPane.INFORMATION_MESSAGE);
		
		if(a == 0) {
			if( b == 0 ) {
				if( c == 0 ) {
					JOptionPane.showMessageDialog(null, "Phuong trinh co vo so nghiem. "," TH1: ", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem. ","TH2: ", JOptionPane.INFORMATION_MESSAGE);
				}
			}else {
				x3 += -c / b;
				JOptionPane.showMessageDialog(null, x3, "TH3: ", JOptionPane.INFORMATION_MESSAGE);
			}
		} else {
			if((b * b - 4 * a * c) == 0) {
				x4 += -b / (2 * a);
				JOptionPane.showMessageDialog(null, x4, "TH1: ", JOptionPane.INFORMATION_MESSAGE);
			}
			else if((b * b - 4 * a * c) < 0) {
				JOptionPane.showMessageDialog(null, "He phuong trinh vo nghiem", "TH2: ", JOptionPane.INFORMATION_MESSAGE);
			} else {
				x5 += ( - b + sqrt(b * b - 4 * a * c)) / (2 * a);
				x6 += ( - b - sqrt(b * b - 4 * a * c)) / (2 * a);
				
				JOptionPane.showMessageDialog(null, x5, "TH3: ", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, x6, "TH3: ", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		System.exit(0);
	}

	private static double sqrt(double d) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
