

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Password {

	protected Shell shell;
	private Text enterPassword;
	private int counter;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Password window = new Password();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		int i = 0;
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Label lblPIN = new Label(shell, SWT.NONE);
		lblPIN.setBounds(40, 35, 143, 15);
		lblPIN.setText("Please enter your PIN");
		
		enterPassword = new Text(shell, SWT.BORDER);
		enterPassword.setBounds(65, 71, 76, 21);
		
		Button btnOK = new Button(shell, SWT.NONE);
		btnOK.setEnabled(true);
		btnOK.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (enterPassword != null){						// Pr�fung muss noch umgebaut werden, wenn Inhalt vorhanden
					Cash screen = new Cash();					// geht so mein neuer Bildschirm auf?
					
					
				}else if (counter == 3){
					JOptionPane.showInputDialog("You entered your PIN wrong to often.");
					//Karte einziehen
					ATM_Interface back = new ATM_Interface();
				}else{
					JOptionPane.showInputDialog("Entered PIN is incorrect. Please try again.");
					counter = counter +1;
					ATM_Interface back = new ATM_Interface();
				}
			}
		});
		btnOK.setBounds(53, 144, 75, 25);
		btnOK.setText("OK");

	}
}
