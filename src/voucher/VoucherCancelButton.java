package voucher;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import interfaces.Setting;
import mainClasses.VoucherFrame;

public class VoucherCancelButton extends JButton implements Setting {

	@Override
	public void setThis(Component prevComp) {
		// TODO Auto-generated method stub
		this.setText("Cancel");
		this.setFont(VoucherInfoPanel.font);
		this.setBorderPainted(true);
		this.setBounds(prevComp.getX(), prevComp.getY()+prevComp.getHeight(), prevComp.getWidth()/2, prevComp.getHeight()/2);
		this.addActionListener(new Listener());
	}

	@Override
	public void setComponents() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addComponents() {
		// TODO Auto-generated method stub

	}
	
	public class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			mainClasses.MainController.myPageFrame = new mainClasses.MyPageFrame();
			mainClasses.MainController.voucherFrame.setVisible(false);
			mainClasses.MainController.voucherFrame = null;
		}
	}

}
