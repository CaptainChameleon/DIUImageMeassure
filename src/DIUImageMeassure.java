
import java.awt.Dimension;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Entrar
 */
public class DIUImageMeassure extends javax.swing.JFrame {

    /**
     * Creates new form DIUImageMeassure
     */
    public DIUImageMeassure() {
        initComponents();
        scrollPanel.getHorizontalScrollBar().addAdjustmentListener(scrollBarListener());
        scrollPanel.getVerticalScrollBar().addAdjustmentListener(scrollBarListener());
    }

    /**
     * This method is called from within the constructor to initialize the for
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        meassuresPanel = new javax.swing.JPanel();
        maxRedField = new javax.swing.JTextField();
        minRedField = new javax.swing.JTextField();
        avgRedField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        maxGreenField = new javax.swing.JTextField();
        minGreenField = new javax.swing.JTextField();
        avgGreenField = new javax.swing.JTextField();
        maxBlueField = new javax.swing.JTextField();
        minBlueField = new javax.swing.JTextField();
        avgBlueField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        optionsPanel = new javax.swing.JPanel();
        openButton = new javax.swing.JButton();
        scrollPanel = new javax.swing.JScrollPane();
        imagePanel = new ImagePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DIUShop");
        setMinimumSize(new java.awt.Dimension(915, 815));
        setPreferredSize(new java.awt.Dimension(915, 815));
        setResizable(false);

        meassuresPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Medidas Estadísticas"));
        meassuresPanel.setToolTipText("Meassures section");

        maxRedField.setEditable(false);
        maxRedField.setBackground(new java.awt.Color(255, 102, 102));
        maxRedField.setText("-");
        maxRedField.setToolTipText("Valor máximo de banda roja");
        maxRedField.setPreferredSize(new java.awt.Dimension(60, 20));

        minRedField.setEditable(false);
        minRedField.setBackground(new java.awt.Color(255, 102, 102));
        minRedField.setText("-");
        minRedField.setToolTipText("Valor mínimo de banda roja");
        minRedField.setPreferredSize(new java.awt.Dimension(60, 20));

        avgRedField.setEditable(false);
        avgRedField.setBackground(new java.awt.Color(255, 102, 102));
        avgRedField.setText("-");
        avgRedField.setToolTipText("Valor promedio de banda roja");
        avgRedField.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel1.setText("Máximo");

        jLabel2.setText("Mínimo");

        jLabel3.setText("Promedio");

        maxGreenField.setEditable(false);
        maxGreenField.setBackground(new java.awt.Color(102, 204, 0));
        maxGreenField.setText("-");
        maxGreenField.setToolTipText("Valor máximo de banda verde");
        maxGreenField.setPreferredSize(new java.awt.Dimension(60, 20));
        maxGreenField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxGreenFieldActionPerformed(evt);
            }
        });

        minGreenField.setEditable(false);
        minGreenField.setBackground(new java.awt.Color(102, 204, 0));
        minGreenField.setText("-");
        minGreenField.setToolTipText("Valor mínimo de banda verde");
        minGreenField.setPreferredSize(new java.awt.Dimension(60, 20));

        avgGreenField.setEditable(false);
        avgGreenField.setBackground(new java.awt.Color(102, 204, 0));
        avgGreenField.setText("-");
        avgGreenField.setToolTipText("Valor promedio de banda verde");
        avgGreenField.setPreferredSize(new java.awt.Dimension(60, 20));

        maxBlueField.setEditable(false);
        maxBlueField.setBackground(new java.awt.Color(102, 204, 255));
        maxBlueField.setText("-");
        maxBlueField.setToolTipText("Valor máximo de banda azul");
        maxBlueField.setPreferredSize(new java.awt.Dimension(60, 20));

        minBlueField.setEditable(false);
        minBlueField.setBackground(new java.awt.Color(102, 204, 255));
        minBlueField.setText("-");
        minBlueField.setToolTipText("Valor mínimo de banda azul");
        minBlueField.setPreferredSize(new java.awt.Dimension(60, 20));

        avgBlueField.setEditable(false);
        avgBlueField.setBackground(new java.awt.Color(102, 204, 255));
        avgBlueField.setText("-");
        avgBlueField.setToolTipText("Valor promedio de banda azul");
        avgBlueField.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel4.setText("Verde");

        jLabel5.setText("Rojo");

        jLabel6.setText("Azul");

        javax.swing.GroupLayout meassuresPanelLayout = new javax.swing.GroupLayout(meassuresPanel);
        meassuresPanel.setLayout(meassuresPanelLayout);
        meassuresPanelLayout.setHorizontalGroup(
            meassuresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(meassuresPanelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(meassuresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, meassuresPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, meassuresPanelLayout.createSequentialGroup()
                        .addGroup(meassuresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(meassuresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(maxGreenField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(maxBlueField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(maxRedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(meassuresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(minRedField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(minGreenField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(minBlueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(meassuresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(avgBlueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(meassuresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(avgGreenField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(avgRedField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        meassuresPanelLayout.setVerticalGroup(
            meassuresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(meassuresPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(meassuresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(meassuresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(maxRedField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minRedField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avgRedField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(meassuresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(maxGreenField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avgGreenField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(meassuresPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(meassuresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel4)
                            .addComponent(minGreenField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(meassuresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(maxBlueField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minBlueField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avgBlueField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        openButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/open.png"))); // NOI18N
        openButton.setText("Abrir imagen");
        openButton.setToolTipText("Abrir imagen");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionsPanelLayout = new javax.swing.GroupLayout(optionsPanel);
        optionsPanel.setLayout(optionsPanelLayout);
        optionsPanelLayout.setHorizontalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPanelLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(openButton)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        optionsPanelLayout.setVerticalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(openButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(optionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(meassuresPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(optionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(meassuresPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 913, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );

        scrollPanel.setViewportView(imagePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maxGreenFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxGreenFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxGreenFieldActionPerformed

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        JFileChooser fc = new JFileChooser(".");
        fc.setFileFilter(new FileNameExtensionFilter("Imágenes", "jpg", "jpeg", "png", "gif"));
        int open = fc.showOpenDialog(rootPane);
        if (open == JFileChooser.APPROVE_OPTION) {
            imagePanel.setImage(fc.getSelectedFile());
            fixDimensions();            
        }
    }//GEN-LAST:event_openButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DIUImageMeassure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DIUImageMeassure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DIUImageMeassure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DIUImageMeassure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DIUImageMeassure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField avgBlueField;
    private javax.swing.JTextField avgGreenField;
    private javax.swing.JTextField avgRedField;
    private ImagePanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField maxBlueField;
    private javax.swing.JTextField maxGreenField;
    private javax.swing.JTextField maxRedField;
    private javax.swing.JPanel meassuresPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JTextField minBlueField;
    private javax.swing.JTextField minGreenField;
    private javax.swing.JTextField minRedField;
    private javax.swing.JButton openButton;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration//GEN-END:variables

    private AdjustmentListener scrollBarListener() {
        return new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                if (imagePanel.getImage() != null) {
                    EstadisticasImagen cE = new EstadisticasImagen();
                    cE.calculaEstadisticas(imagePanel.getImage(), scrollPanel.getViewport());
                    maxRedField.setText(cE.maximo[cE.ROJO] + "");
                    minRedField.setText(cE.minimo[cE.ROJO] + "");
                    avgRedField.setText(cE.promedio[cE.ROJO] + "");

                    maxGreenField.setText(cE.maximo[cE.VERDE] + "");
                    minGreenField.setText(cE.minimo[cE.VERDE] + "");
                    avgGreenField.setText(cE.promedio[cE.VERDE] + "");

                    maxBlueField.setText(cE.maximo[cE.AZUL] + "");
                    minBlueField.setText(cE.minimo[cE.AZUL] + "");
                    avgBlueField.setText(cE.promedio[cE.AZUL] + "");
                }
            }
        };
    }
    
    private void fixDimensions() {
        Dimension imageSize = new Dimension(
                imagePanel.getImage().getWidth(),
                imagePanel.getImage().getHeight());
        
        if (imageSize.width <= 909 && imageSize.height <= 484) {
            scrollPanel.setSize(imageSize);
            scrollPanel.getViewport().setSize(imageSize);
        } else if (imageSize.width <= 909 || imageSize.height <= 484) {
            if (imageSize.width <= 909) {
                scrollPanel.setSize(imageSize.width, 484);
                scrollPanel.getViewport().setSize(imageSize.width, 484);
            } else {
                scrollPanel.setSize(909, imageSize.height);
                scrollPanel.getViewport().setSize(909, imageSize.height);
            }
        } else if (imageSize.width > scrollPanel.getWidth() || imageSize.height > scrollPanel.getHeight()) {
            scrollPanel.setSize(909, 484); // 909 915 | 484 536
            scrollPanel.getViewport().setSize(909, 484);
        }
    }
}
