package de.rub.nds.eccjava.view.curve;

import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 * 
 * @author Juraj Somorovsky - juraj.somorovsky@rub.de
 */
public class CurveLoading extends javax.swing.JPanel {

    private static final Logger LOG = Logger.getLogger(CurveLoading.class);

    /**
     * Creates new form CurveLoading
     */
    public CurveLoading() {
	initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed"
    // desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

	appController1 = new de.rub.nds.eccjava.controller.AppController();
	jLoadTextField = new javax.swing.JTextField();
	jLoadButton = new javax.swing.JButton();
	jSaveButton = new javax.swing.JButton();
	jSaveTextField = new javax.swing.JTextField();
	jLabel1 = new javax.swing.JLabel();
	jLabel2 = new javax.swing.JLabel();
	jLabel3 = new javax.swing.JLabel();
	jLabel4 = new javax.swing.JLabel();
	jLabel5 = new javax.swing.JLabel();
	jLabel6 = new javax.swing.JLabel();
	jNameTextField = new javax.swing.JTextField();
	jpTextField = new javax.swing.JTextField();
	jaTextField = new javax.swing.JTextField();
	jbTextField = new javax.swing.JTextField();
	jButton1 = new javax.swing.JButton();
	jLabel7 = new javax.swing.JLabel();
	jxTextField = new javax.swing.JTextField();
	jyTextField = new javax.swing.JTextField();
	jLabel8 = new javax.swing.JLabel();
	jLabel9 = new javax.swing.JLabel();

	setPreferredSize(new java.awt.Dimension(1000, 600));

	jLoadTextField.setText("secp256r1");
	jLoadTextField.setToolTipText("Curve name or file location to be loaded");

	jLoadButton.setText("Load");
	jLoadButton.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
		jLoadButtonActionPerformed(evt);
	    }
	});

	jSaveButton.setText("Save");
	jSaveButton.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
		jSaveButtonActionPerformed(evt);
	    }
	});

	jSaveTextField.setEnabled(false);

	jLabel1.setText("Load your curve ...");

	jLabel2.setText("... or define a new one:");

	jLabel3.setText("Name:");

	jLabel4.setText("p:");

	jLabel5.setText("a:");

	jLabel6.setText("b:");

	jButton1.setText("Create");
	jButton1.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
		jButton1ActionPerformed(evt);
	    }
	});

	jLabel7.setText("Save in file:");

	jLabel8.setText("Base Point x:");

	jLabel9.setText("Base Point y:");

	javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
	this.setLayout(layout);
	layout.setHorizontalGroup(layout
		.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(
			layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(
					layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
							javax.swing.GroupLayout.Alignment.TRAILING,
							layout.createSequentialGroup()
								.addGroup(
									layout.createParallelGroup(
										javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(
											layout.createSequentialGroup()
												.addComponent(
													jLabel3,
													javax.swing.GroupLayout.PREFERRED_SIZE,
													102,
													javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(11, 11, 11)
												.addComponent(
													jNameTextField,
													javax.swing.GroupLayout.DEFAULT_SIZE,
													892,
													Short.MAX_VALUE))
										.addComponent(jLoadTextField))
								.addGap(18, 18, 18)
								.addGroup(
									layout.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(
											jLoadButton,
											javax.swing.GroupLayout.PREFERRED_SIZE,
											88,
											javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(
											jButton1,
											javax.swing.GroupLayout.Alignment.TRAILING,
											javax.swing.GroupLayout.PREFERRED_SIZE,
											88,
											javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(
							layout.createSequentialGroup()
								.addGroup(
									layout.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING,
										false)
										.addComponent(
											jLabel8,
											javax.swing.GroupLayout.DEFAULT_SIZE,
											javax.swing.GroupLayout.DEFAULT_SIZE,
											Short.MAX_VALUE)
										.addComponent(
											jLabel7,
											javax.swing.GroupLayout.DEFAULT_SIZE,
											javax.swing.GroupLayout.DEFAULT_SIZE,
											Short.MAX_VALUE)
										.addComponent(
											jLabel9,
											javax.swing.GroupLayout.DEFAULT_SIZE,
											102, Short.MAX_VALUE))
								.addPreferredGap(
									javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
									layout.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(
											jxTextField,
											javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jyTextField)
										.addGroup(
											javax.swing.GroupLayout.Alignment.TRAILING,
											layout.createSequentialGroup()
												.addComponent(
													jSaveTextField)
												.addGap(18, 18, 18)
												.addComponent(
													jSaveButton,
													javax.swing.GroupLayout.PREFERRED_SIZE,
													88,
													javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGroup(
							layout.createSequentialGroup()
								.addGroup(
									layout.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING,
										false)
										.addComponent(
											jLabel6,
											javax.swing.GroupLayout.DEFAULT_SIZE,
											102, Short.MAX_VALUE)
										.addComponent(
											jLabel5,
											javax.swing.GroupLayout.DEFAULT_SIZE,
											javax.swing.GroupLayout.DEFAULT_SIZE,
											Short.MAX_VALUE))
								.addGap(11, 11, 11)
								.addGroup(
									layout.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(
											jpTextField,
											javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(
											jaTextField,
											javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jbTextField)))
						.addGroup(
							layout.createSequentialGroup()
								.addGroup(
									layout.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel1)
										.addComponent(jLabel2)
										.addComponent(
											jLabel4,
											javax.swing.GroupLayout.PREFERRED_SIZE,
											102,
											javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(0, 0, Short.MAX_VALUE))).addContainerGap()));
	layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
		layout.createSequentialGroup()
			.addGap(22, 22, 22)
			.addComponent(jLabel1)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			.addGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jLoadTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLoadButton))
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
			.addComponent(jLabel2)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
			.addGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jLabel3)
					.addComponent(jNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jButton1))
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
			.addGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jLabel4)
					.addComponent(jpTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE))
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
			.addGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jLabel5)
					.addComponent(jaTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE))
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
			.addGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jLabel6)
					.addComponent(jbTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE))
			.addGap(18, 18, 18)
			.addGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(jLabel8)
					.addGroup(
						layout.createSequentialGroup()
							.addComponent(jxTextField,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, 18)
							.addGroup(
								layout.createParallelGroup(
									javax.swing.GroupLayout.Alignment.BASELINE)
									.addComponent(jyTextField,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
									.addComponent(jLabel9))))
			.addGap(18, 18, 18)
			.addGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
					.addGroup(
						layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
							.addComponent(jSaveTextField,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addComponent(jSaveButton)).addContainerGap(279, Short.MAX_VALUE)));
    }// </editor-fold>//GEN-END:initComponents

    private void jLoadButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jLoadButtonActionPerformed
	try {
	    appController1.getCurveHandler().loadCurve(jLoadTextField.getText());
	    jSaveTextField.setText(appController1.getCurveHandler().getFileName());

	    jNameTextField.setText(appController1.getCurveHandler().getCurve().getName());
	    jpTextField.setText(appController1.getCurveHandler().getCurve().getP().toString());
	    jaTextField.setText(appController1.getCurveHandler().getCurve().getA().toString());
	    jbTextField.setText(appController1.getCurveHandler().getCurve().getB().toString());
	    jxTextField.setText(appController1.getCurveHandler().getCurve().getBasePointX().toString());
	    jyTextField.setText(appController1.getCurveHandler().getCurve().getBasePointY().toString());

	} catch (Exception e) {
	    LOG.warn(e);
	    JOptionPane.showMessageDialog(this, e.getLocalizedMessage());
	}
    }// GEN-LAST:event_jLoadButtonActionPerformed

    private void jSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jSaveButtonActionPerformed
	try {
	    appController1.getCurveHandler().storeCurve();
	} catch (Exception e) {
	    LOG.warn(e);
	    JOptionPane.showMessageDialog(this, e.getLocalizedMessage());
	}
    }// GEN-LAST:event_jSaveButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
	appController1.getCurveHandler().initializeNewCurve(jNameTextField.getText(), jpTextField.getText(),
		jaTextField.getText(), jbTextField.getText(), jxTextField.getText(), jyTextField.getText());
	jSaveTextField.setText(appController1.getCurveHandler().getCurve().getName());
    }// GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.rub.nds.eccjava.controller.AppController appController1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLoadButton;
    private javax.swing.JTextField jLoadTextField;
    private javax.swing.JTextField jNameTextField;
    private javax.swing.JButton jSaveButton;
    private javax.swing.JTextField jSaveTextField;
    private javax.swing.JTextField jaTextField;
    private javax.swing.JTextField jbTextField;
    private javax.swing.JTextField jpTextField;
    private javax.swing.JTextField jxTextField;
    private javax.swing.JTextField jyTextField;
    // End of variables declaration//GEN-END:variables
}
