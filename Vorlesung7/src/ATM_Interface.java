
import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import swing2swt.layout.BorderLayout;
import org.eclipse.swt.custom.StackLayout;
import swing2swt.layout.FlowLayout;

public class ATM_Interface {
	

	protected Shell shlBankOfFinland;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		ATM terminal = new ATM(1000, 1234, true);						//our ATM terminal
		try {
			ATM_Interface window = new ATM_Interface();
			if (terminal.usable == true){
			window.open();
			}
			else{
				window.blocked();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}}
			
		
	

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlBankOfFinland.open();
		shlBankOfFinland.layout();
		while (!shlBankOfFinland.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	public void blocked(){
		Display display = Display.getDefault();
		JOptionPane.showInputDialog("This terminal is out of order.");
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		
		shlBankOfFinland = new Shell();
		shlBankOfFinland.setSize(450, 300);
		shlBankOfFinland.setText("Bank of Finland");
		shlBankOfFinland.setLayout(null);
		
		Button btnCash = new Button(shlBankOfFinland, SWT.NONE);
		btnCash.setBounds(50, 5, 92, 25);
		btnCash.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnCash.setText("Withdraw Cash");
		
		Button btnCheckAccount = new Button(shlBankOfFinland, SWT.NONE);
		btnCheckAccount.setBounds(50, 56, 137, 25);
		btnCheckAccount.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnCheckAccount.setText("Check Account Balance");
		
		Button btnTransfer = new Button(shlBankOfFinland, SWT.NONE);
		btnTransfer.setBounds(50, 115, 95, 25);
		btnTransfer.setText("Transfer Money");
		
		Button btnPhone = new Button(shlBankOfFinland, SWT.NONE);
		btnPhone.setBounds(50, 183, 160, 25);
		btnPhone.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnPhone.setText("Load Money on Your Phone");

	}
}
