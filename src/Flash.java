
import java.awt.Color;



public class Flash extends javax.swing.JFrame implements Runnable 
{
    public Flash() 
    {
        initComponents();
        //jProgressBar1.setForeground(Color.gray);
        jProgressBar1.setForeground(Color.blue);
        Thread thread=new Thread(this);
        thread.start();
    }
    @Override
    public void run()
    {
     try
      {
          for(int i=0;i<100;i++)
          {
              jProgressBar1.setValue(i);
              Thread.sleep(10);
          }
          dispose();
          new NextWindow().setVisible(true);
      }catch(Exception ex)
      {
          ex.printStackTrace();
      }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 18)); // NOI18N
        jLabel3.setText("Please wait...........");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 150, 20));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgressBar1.setBackground(new java.awt.Color(153, 153, 153));
        jProgressBar1.setForeground(new java.awt.Color(0, 102, 153));
        jProgressBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 20));

        jLabel1.setText("Please Wait...");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 70, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 760, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pexels-kelly-2402235.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 460));

        setSize(new java.awt.Dimension(759, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) 
    {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Flash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Flash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Flash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Flash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
