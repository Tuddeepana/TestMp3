
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


/**
 * Mainview
 */
 class Mp3 extends JFrame{

    JLabel namePlayer;
    JButton pusueButton; 
    JButton playButton;

    Mp3(){
        setSize(780, 320);
        setTitle("My Test Mp3");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());


        //Set name of the player
        namePlayer = new JLabel();
        namePlayer.setText("My Mp3");
        Font boldAppleFont = new Font("Helvetica Neue", Font.BOLD, 15);
        namePlayer.setFont(boldAppleFont);
        

        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        namePanel.add(namePlayer);


        //set pause Button
        JPanel jPanel = new JPanel(new GridLayout(2,2));

        pusueButton = new JButton("Pause");
        pusueButton.setFont(new Font("",1,12));
        pusueButton.setForeground(Color.WHITE);
        

        pusueButton.setBackground(Color.BLACK);


        //Play Button
        playButton = new JButton("Play");
        playButton.setFont(new Font("",1,12));
        playButton.setForeground(Color.WHITE);
        playButton.setBackground(Color.RED);








        
       
        //setup Layout for pause button
        JPanel setBottJPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        setBottJPanel.add(playButton);
        setBottJPanel.add(pusueButton);
        jPanel.add(setBottJPanel);
        jPanel.add(setBottJPanel);
        


       





        add("North",namePanel);
        add("South",jPanel);
        setVisible(true);



    }
    
}

/**
 * Mainview
 */
public class Mainview {

    public static void main(String[] args) {
        new Mp3();
    }
}