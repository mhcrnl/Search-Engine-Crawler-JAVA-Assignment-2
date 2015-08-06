/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2final;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JianYiee
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainJFrame
     */
    public HashMap<String, String> urlProcessed = new HashMap<>();

    public MainJFrame() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        queryField = new javax.swing.JTextField();
        crawlButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayText = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        urlList = new java.awt.List();
        getSource = new javax.swing.JButton();
        threadCountCombo = new javax.swing.JComboBox();
        crawlCountCombo = new javax.swing.JComboBox();
        checkCrawl = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        crawlButton.setText("Crawl");
        crawlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crawlButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("~ Web Crawler~");

        clearButton.setText("Clear all");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        displayText.setColumns(20);
        displayText.setLineWrap(true);
        displayText.setRows(5);
        displayText.setEnabled(false);
        jScrollPane2.setViewportView(displayText);

        jLabel2.setText("Thread count:");

        jLabel3.setText("Crawl Count:");

        getSource.setText("View Source");
        getSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSourceActionPerformed(evt);
            }
        });

        threadCountCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "4", "6", "8", "12", "16" }));

        crawlCountCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));

        checkCrawl.setText("check crawl");
        checkCrawl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCrawlActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(queryField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(crawlButton))
                            .addComponent(urlList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(getSource, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                            .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(threadCountCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(crawlCountCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(checkCrawl)
                                .addGap(0, 207, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(484, 484, 484)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crawlButton)
                    .addComponent(queryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(threadCountCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crawlCountCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkCrawl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(urlList, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(getSource)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(refreshButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crawlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crawlButtonActionPerformed
        // TODO add your handling code here:
        String query = queryField.getText();

        if (!query.equals("")) {
            System.out.println("Searching for query: " + query);
            initSearch(query);
        }

    }//GEN-LAST:event_crawlButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:

        queryField.setText("");
        urlList.removeAll();
        displayText.setText("");
        urlProcessed.clear();


    }//GEN-LAST:event_clearButtonActionPerformed

    private void getSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSourceActionPerformed
        // TODO add your handling code here:

        String key = urlList.getSelectedItem();
        String source = urlProcessed.get(key);
        displayText.setText(source);

    }//GEN-LAST:event_getSourceActionPerformed

    private void checkCrawlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCrawlActionPerformed
        System.out.println("Query: " + queryField.getText());
        System.out.println("Thread count: " + threadCountCombo.getSelectedItem());
        System.out.println("Number of crawls: " + crawlCountCombo.getSelectedItem());

// TODO add your handling code here:
    }//GEN-LAST:event_checkCrawlActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        urlList.removeAll();
         for (String s : urlProcessed.keySet()) {
            urlList.add(s);
        }
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void initSearch(String query) {

        ArrayList<String> liveThread = new ArrayList<>();
        LinkedList linkedUrl = new LinkedList();
        HashMap<String, Integer> antiDuplicate = new HashMap<>();

        antiDuplicate.put("DEFAULT", 0);
        SearchEngine se = new SearchEngine(query,"https://www.bing.com/search?q=", linkedUrl, antiDuplicate);
        SearchEngine se2 = new SearchEngine(query, "http://www.ask.com/web?q=" , linkedUrl, antiDuplicate);
        se.start();
        se2.start();
        System.out.println("THREAD STARTED");

        try {
            se.join();
            se2.join();
        } catch (InterruptedException e) {
            System.out.println("Error: " + e);
        }

        System.out.println("");
        while (urlProcessed.size() < Integer.parseInt((String) crawlCountCombo.getSelectedItem())) {

            if (liveThread.size() <= Integer.parseInt((String) threadCountCombo.getSelectedItem()) && !linkedUrl.isEmpty()) {

                String buffer = (String) linkedUrl.pollFirst();
                System.out.println("Working on: " + buffer);

                CrawlThread crawlie = new CrawlThread(buffer, urlProcessed, Integer.parseInt((String) crawlCountCombo.getSelectedItem()), linkedUrl, antiDuplicate, liveThread);

                crawlie.start();
                System.out.println("Current running " + liveThread.size() + " number of threads");
                

                System.out.println("Beep");

            } 
        }
        System.out.println("COMPLETED YAY");

        System.out.println("Numbers of url collected: " + urlProcessed.size());

        for (String s : urlProcessed.keySet()) {
            urlList.add(s);
        }
    }

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkCrawl;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton crawlButton;
    private javax.swing.JComboBox crawlCountCombo;
    private javax.swing.JTextArea displayText;
    private javax.swing.JButton getSource;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField queryField;
    private javax.swing.JButton refreshButton;
    private javax.swing.JComboBox threadCountCombo;
    private java.awt.List urlList;
    // End of variables declaration//GEN-END:variables
}
