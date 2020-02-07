
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class OptionHolder extends javax.swing.JFrame {
       
        int mousepX;
        int mousepY;
        JFrame frame;
        private static HttpURLConnection connection;
    /**
     * Creates new form OptionHolder
     */static Voice voice;
     private static final String voicema = "kevin16";
    public OptionHolder() {
       // StringBuffer bf = Jcombosetdata.getData();
        System.setProperty("mbrola.base", "E:\\softwares and drivers\\jar_files\\freetts-1.2\\mbrola");
    VoiceManager vm = VoiceManager.getInstance();
    voice = vm.getVoice(voicema);
     voice.allocate();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        akey = new javax.swing.JLabel();
        aun = new javax.swing.JLabel();
        un = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        data = new javax.swing.JTextField();
        data1 = new javax.swing.JTextField();
        senddatalabel = new javax.swing.JLabel();
        getdatalabel = new javax.swing.JLabel();
        senddata = new javax.swing.JButton();
        getdata1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        data2 = new javax.swing.JTextField();
        setting = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(41, 128, 185));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        akey.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        akey.setForeground(new java.awt.Color(255, 255, 255));
        akey.setText("AIO_Key");
        jPanel1.add(akey, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 220, 40));

        aun.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        aun.setForeground(new java.awt.Color(255, 255, 255));
        aun.setText("AIO_UserName");
        jPanel1.add(aun, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 220, 50));

        un.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        un.setForeground(new java.awt.Color(255, 255, 255));
        un.setText("User Name");
        jPanel1.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 180, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 127, 0));
        jLabel2.setText("User Details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, 20));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Io8.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 410));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(38, 38, 38));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        data.setBackground(new java.awt.Color(0, 0, 0));
        data.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        data.setForeground(new java.awt.Color(255, 255, 255));
        data.setText("FeedName");
        data.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataFocusGained(evt);
            }
        });
        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });
        jPanel2.add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 180, 30));

        data1.setBackground(new java.awt.Color(0, 0, 0));
        data1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        data1.setForeground(new java.awt.Color(255, 255, 255));
        data1.setText("FeedName");
        jPanel2.add(data1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 170, 30));

        senddatalabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        senddatalabel.setForeground(new java.awt.Color(255, 127, 0));
        senddatalabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senddatalabel.setText("Send Data");
        jPanel2.add(senddatalabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 150, 50));

        getdatalabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        getdatalabel.setForeground(new java.awt.Color(255, 127, 0));
        getdatalabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getdatalabel.setText("Get Data");
        jPanel2.add(getdatalabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 140, 50));

        senddata.setBackground(new java.awt.Color(0, 98, 205));
        senddata.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        senddata.setForeground(new java.awt.Color(255, 255, 255));
        senddata.setText("SendData");
        senddata.setBorder(null);
        senddata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senddataActionPerformed(evt);
            }
        });
        jPanel2.add(senddata, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 100, 40));

        getdata1.setBackground(new java.awt.Color(0, 98, 205));
        getdata1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getdata1.setForeground(new java.awt.Color(255, 255, 255));
        getdata1.setText("GetData");
        getdata1.setBorder(null);
        getdata1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getdata1ActionPerformed(evt);
            }
        });
        jPanel2.add(getdata1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("   All rights reserved Copyright©_cloud_titans");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 380, 20));

        data2.setBackground(new java.awt.Color(0, 0, 0));
        data2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        data2.setForeground(new java.awt.Color(255, 255, 255));
        data2.setText("Value");
        jPanel2.add(data2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 170, 30));

        setting.setFont(new java.awt.Font("Engravers MT", 3, 18)); // NOI18N
        setting.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 160, 30));

        jLabel5.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/darkgif.gif"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 500, 390));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 580, 410));

        jPanel3.setBackground(new java.awt.Color(0, 98, 205));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon feather-arrow-left-circle.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        mini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon awesome-window-minimize.png"))); // NOI18N
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });
        jPanel3.add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 30, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Group 1.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int xcoo = evt.getXOnScreen();
        int ycoo = evt.getYOnScreen();
       this.setLocation(xcoo-mousepX,ycoo-mousepY);
    }//GEN-LAST:event_formMouseDragged

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_formMouseMoved

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
     //this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_ICONIFIED));
       this.setState(this.ICONIFIED);//  this line is for minimize the frame.
     
    }//GEN-LAST:event_miniMouseClicked

    private void getdata1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getdata1ActionPerformed
String s = Jcombosetdata.getData(data.getText());
String value = null;
            try {
                JSONObject json = new JSONObject(s);
                 value=json.getString("value");
            } catch (JSONException ex) {
                Logger.getLogger(OptionHolder.class.getName()).log(Level.SEVERE, null, ex);
            }
if(Integer.parseInt(value)==1){ setting.setText("ON");voice.speak("Your device is on Mister!. if you want to turn it off then send Zero");}
else{ setting.setText("OFF");voice.speak("Your device is OFF Mister!. if you want to turn it on then send one");}      
    }//GEN-LAST:event_getdata1ActionPerformed

    private void senddataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senddataActionPerformed
            try {
               String s= Jcombosetdata.senddata(data1.getText(),data2.getText());
               String resp = "ok";
        if(s.equalsIgnoreCase(resp)==true){voice.speak("sent successfully your device is now. Switched on.you can turn it.off by sending zero");}
        else{voice.speak("Failed to send!. Either you entered an. unknown. feed. or.you! entered !wrong !data!.if the problem.still persists! try reconnecting your computer to a! network!");}
            } catch (IOException ex) {
                Logger.getLogger(OptionHolder.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_senddataActionPerformed

    private void dataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataFocusGained
        
    }//GEN-LAST:event_dataFocusGained

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataActionPerformed

     public static String charRemoveAt(String str, int p) {  
              return str.substring(0, p) + str.substring(p + 1);  
           } 
    
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
            java.util.logging.Logger.getLogger(OptionHolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionHolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionHolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionHolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionHolder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel akey;
    public javax.swing.JLabel aun;
    public javax.swing.JTextField data;
    private javax.swing.JTextField data1;
    private javax.swing.JTextField data2;
    private javax.swing.JButton getdata1;
    private javax.swing.JLabel getdatalabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel mini;
    private javax.swing.JButton senddata;
    private javax.swing.JLabel senddatalabel;
    private javax.swing.JLabel setting;
    public javax.swing.JLabel un;
    // End of variables declaration//GEN-END:variables
}