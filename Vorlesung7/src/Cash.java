

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;

public class Cash {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Cash window = new Cash();
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
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Label lblSelectAmountOf = new Label(shell, SWT.NONE);
		lblSelectAmountOf.setBounds(29, 22, 134, 15);
		lblSelectAmountOf.setText("Select Amount of Cash");
		
		Button btn10 = new Button(shell, SWT.NONE);
		btn10.setBounds(10, 65, 105, 25);
		btn10.setText("10 Euro");
		btn10.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		
		Button btn50 = new Button(shell, SWT.NONE);
		btn50.setBounds(10, 121, 105, 25);
		btn50.setText("50 Euro");
		
		Button btn100 = new Button(shell, SWT.NONE);
		btn100.setBounds(264, 65, 105, 25);
		btn100.setText("100 Euro");
		
		Button btnDifferent = new Button(shell, SWT.NONE);
		btnDifferent.setBounds(264, 121, 105, 25);
		btnDifferent.setText("Different Amount");

	}
}
