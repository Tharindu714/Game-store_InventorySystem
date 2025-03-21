package GUI;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JOptionPane;

public class splash extends javax.swing.JFrame {

    public splash() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
                Thread th = new Thread(
                () -> {
                    for (int i = 0; i <= 100; i++) {
                        jProgressBar1.setValue(i);
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, e, "Thread Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    Home home = new Home();
                    home.setVisible(true);
                    this.dispose();
                }
        );
        th.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jImagePanel1 = new main.JImagePanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 30));
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jProgressBar1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jImagePanel1.setFitToPanel(true);
        jImagePanel1.setImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/communication.jpg"))); // NOI18N
        jImagePanel1.setSmoothRendering(true);
        jImagePanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/gif.gif"))); // NOI18N
        jImagePanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 500, 220, 230));

        jPanel2.add(jImagePanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.JImagePanel jImagePanel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
