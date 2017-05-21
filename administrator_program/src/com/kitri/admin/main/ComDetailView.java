package com.kitri.admin.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ComDetailView extends JFrame {

   private JPanel contentPane;
   private JTextField comViewId;
   private JLabel comViewNameLabel;
   private JTextField comViewName;
   private JLabel comViewRestTimeLabel;
   private JTextField comViewRestTime;
   private JLabel comViewUseTimeLabel;
   private JTextField comViewUseTime;
   private JLabel comViewUseProgram;
   private JLabel comViewIdLabel;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               ComDetailView frame = new ComDetailView();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   public ComDetailView() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 334, 306);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      comViewIdLabel = new JLabel("ID");
      comViewIdLabel.setHorizontalAlignment(SwingConstants.RIGHT);
      comViewIdLabel.setBounds(49, 21, 57, 15);
      contentPane.add(comViewIdLabel);
      
      comViewId = new JTextField();
      comViewId.setBounds(144, 18, 116, 21);
      contentPane.add(comViewId);
      comViewId.setColumns(10);
      
      comViewNameLabel = new JLabel("\uC774\uB984");
      comViewNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
      comViewNameLabel.setBounds(49, 54, 57, 15);
      contentPane.add(comViewNameLabel);
      
      comViewName = new JTextField();
      comViewName.setColumns(10);
      comViewName.setBounds(144, 51, 116, 21);
      contentPane.add(comViewName);
      
      comViewRestTimeLabel = new JLabel("\uC794\uC5EC\uC2DC\uAC04");
      comViewRestTimeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
      comViewRestTimeLabel.setBounds(49, 92, 57, 15);
      contentPane.add(comViewRestTimeLabel);
      
      comViewRestTime = new JTextField();
      comViewRestTime.setColumns(10);
      comViewRestTime.setBounds(144, 89, 116, 21);
      contentPane.add(comViewRestTime);
      
      comViewUseTimeLabel = new JLabel("\uC0AC\uC6A9\uC2DC\uAC04");
      comViewUseTimeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
      comViewUseTimeLabel.setBounds(49, 131, 57, 15);
      contentPane.add(comViewUseTimeLabel);
      
      comViewUseTime = new JTextField();
      comViewUseTime.setColumns(10);
      comViewUseTime.setBounds(144, 128, 116, 21);
      contentPane.add(comViewUseTime);
      
      comViewUseProgram = new JLabel("\uC0AC\uC6A9\uD504\uB85C\uADF8\uB7A8");
      comViewUseProgram.setHorizontalAlignment(SwingConstants.RIGHT);
      comViewUseProgram.setBounds(15, 169, 91, 15);
      contentPane.add(comViewUseProgram);
      
      JTextArea comViewUseProgramTA = new JTextArea();
      comViewUseProgramTA.setBounds(39, 194, 221, 63);
      contentPane.add(comViewUseProgramTA);
   }
}