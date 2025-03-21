package GUI;

import com.formdev.flatlaf.FlatDarkLaf;
import jaco.mp3.player.MP3Player;
import java.io.File;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        MP3player();
    }

    public void MP3player() {
        MP3Player player = new MP3Player(new File("C:\\Users\\Tharindu\\Documents\\NetBeansProjects\\Individual_viva\\src\\Resources\\Upcoming Games in 2024 _ PS5 Games_HD.mp3"));
        player.play();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "Interrupted Execption Detected", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jImagePanel1 = new main.JImagePanel();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(992, 60));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jImagePanel1.setFitToPanel(true);
        jImagePanel1.setImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/8b4520977fd5d1ef92b56d1e83c78255.png"))); // NOI18N
        jImagePanel1.setSmoothRendering(true);

        javax.swing.GroupLayout jImagePanel1Layout = new javax.swing.GroupLayout(jImagePanel1);
        jImagePanel1.setLayout(jImagePanel1Layout);
        jImagePanel1Layout.setHorizontalGroup(
            jImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );
        jImagePanel1Layout.setVerticalGroup(
            jImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(513, Short.MAX_VALUE)
                .addComponent(jImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(346, 346, 346)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel5.setPreferredSize(new java.awt.Dimension(929, 50));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Uriy1966-Steel-System-Games.48.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jPanel5.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Uriy1966-Steel-System-Movies.48.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jPanel5.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Uriy1966-Steel-System-Music.48.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jPanel5.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Uriy1966-Steel-System-Desktop.48.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jPanel5.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Uriy1966-Steel-System-Documents.48.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jPanel5.add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Uriy1966-Steel-System-Group.48.png"))); // NOI18N
        jButton7.setContentAreaFilled(false);
        jPanel5.add(jButton7);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Uriy1966-Steel-System-Library-Windows.48.png"))); // NOI18N
        jButton8.setContentAreaFilled(false);
        jPanel5.add(jButton8);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Uriy1966-Steel-System-Smart.48.png"))); // NOI18N
        jButton9.setContentAreaFilled(false);
        jPanel5.add(jButton9);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Uriy1966-Steel-System-Download.48.png"))); // NOI18N
        jButton10.setContentAreaFilled(false);
        jPanel5.add(jButton10);

        getContentPane().add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel7.setPreferredSize(new java.awt.Dimension(640, 150));
        jPanel7.setLayout(new java.awt.GridLayout(2, 2, 3, 3));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/The_Last_of_us.gif"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        jPanel7.add(jLabel3);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Marvel'sSpider.gif"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });
        jPanel7.add(jLabel2);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/videoplayback.gif"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        jPanel7.add(jLabel1);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Tekken.gif"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });
        jPanel7.add(jLabel4);

        getContentPane().add(jPanel7, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered

    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered

    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered

    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered

    }//GEN-LAST:event_jLabel4MouseEntered

    public static void main(String args[]) throws Exception {
        FlatDarkLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private main.JImagePanel jImagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
