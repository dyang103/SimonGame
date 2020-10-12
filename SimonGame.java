//The game is called Simon
//There are 9 different colored blocks that will
//be automatically clicked in some random order
//The objective of the game is to remember that order
//and click the colored blocks in the same order
//with each correct response adding an additional
//colored block to the mix
//
//Have Fun!!


package simon;

import java.awt.*;
import java.util.List;
import javax.swing.*;
import java.lang.Integer;
import java.io.*;
import java.util.*;
import java.lang.*;
import javax.swing.border.LineBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SimonGame{

    static List<Integer> randomList = new ArrayList<Integer>();
    static List<Integer> userList = new ArrayList<Integer>();

    static JButton redButton = new JButton("Red");
    static JButton greenButton = new JButton("Green");
    static JButton yellowButton = new JButton("Yellow");
    static JButton blueButton = new JButton("Blue");
    static JButton whiteButton = new JButton("White");
    static JButton cyanButton = new JButton("Cyan");
    static JButton orangeButton = new JButton("Orange");
    static JButton pinkButton = new JButton("Pink");
    static JButton magentaButton = new JButton("Magenta");


    static int k = 1;
    static int b = 1;
    static int randomListSize = randomList.size();


    public static void createBoard(){
            JFrame frame = new JFrame("Simon Game");
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(null);
                frame.setSize(400,400);
                    frame.setResizable(false);

            JPanel topPanel = new JPanel();
                topPanel.setBounds(0, 0, 400, 200);
                topPanel.setBackground(Color.gray);
                topPanel.setLayout(new GridLayout(3, 3));
                frame.getContentPane().add(topPanel);

            JPanel optionPanel = new JPanel();
                optionPanel.setBounds(0, 200, 400, 100);
                optionPanel.setBackground(Color.black);
                optionPanel.setLayout(new GridLayout(2, 2));
                frame.getContentPane().add(optionPanel);

                redButton.setBackground(Color.RED);
                redButton.setOpaque(true);
                topPanel.add(redButton);

                greenButton.setBackground(Color.GREEN);
                greenButton.setOpaque(true);
                topPanel.add(greenButton);

                yellowButton.setBackground(Color.YELLOW);
                yellowButton.setOpaque(true);
                topPanel.add(yellowButton);

                blueButton.setBackground(Color.BLUE);
                blueButton.setOpaque(true);
                topPanel.add(blueButton);

                whiteButton.setBackground(Color.WHITE);
                whiteButton.setOpaque(true);
                topPanel.add(whiteButton);

                cyanButton.setBackground(Color.CYAN);
                cyanButton.setOpaque(true);
                topPanel.add(cyanButton);

                orangeButton.setBackground(Color.ORANGE);
                orangeButton.setOpaque(true);
                topPanel.add(orangeButton);

                pinkButton.setBackground(Color.PINK);
                pinkButton.setOpaque(true);
                topPanel.add(pinkButton);

                magentaButton.setBackground(Color.MAGENTA);
                magentaButton.setOpaque(true);
                topPanel.add(magentaButton);



            JPanel bottomPanel = new JPanel();
                bottomPanel.setBounds(0, 300, 400, 100);
                frame.getContentPane().add(bottomPanel);


            JButton playGame = new JButton("Play");
                optionPanel.add(playGame);

            JButton checkGame = new JButton("Check");
                optionPanel.add(checkGame);

            JButton restartGame = new JButton("Restart");
                optionPanel.add(restartGame);

            JButton quitGame = new JButton("Quit");
                optionPanel.add(quitGame);


            redButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    System.out.println("Clicked Red");
                    userList.add(0);

                };
            });

            greenButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    System.out.println("Clicked Green");
                    userList.add(1);

                };
            });

            yellowButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    System.out.println("Clicked Yellow");
                    userList.add(2);


                };
            });

            blueButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    System.out.println("Clicked Blue");
                    userList.add(3);


                };
            });

            whiteButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    System.out.println("Clicked White");
                    userList.add(4);

                };
            });

            cyanButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    System.out.println("Clicked Cyan");
                    userList.add(5);

                };
            });

            orangeButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    System.out.println("Clicked Orange");
                    userList.add(6);

                };
            });

            pinkButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    System.out.println("Clicked Pink");
                    userList.add(7);

                };
            });

            magentaButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    System.out.println("Clicked Magenta");
                    userList.add(8);

                };
            });

            quitGame.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    System.exit(0);
                };
            });

            playGame.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    randomList.clear();
                    play();
                };
            });

            checkGame.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    check();
                };
            });

            restartGame.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    randomList.clear();
                    b = 1;
                    play();
                };
            });


    };

    static Random rand = new Random();
    static int n = rand.nextInt(9);

    public static void makeLists(){
        if(randomList.contains(n)){
            n = rand.nextInt(9);
                makeLists();
            } else{
                randomList.add(n);
                randomListSize = randomList.size();
            };

        System.out.println(randomList);

    };

    public static void play(){
        userList.clear();

        makeLists();

        b += 1;

        for(int m = 0; m < randomListSize; m++){
            if(randomList.get(m) == 0){
                redButton.doClick(400);
            } else if(randomList.get(m) == 1){
                greenButton.doClick(400);
            } else if(randomList.get(m) == 2){
                yellowButton.doClick(400);
            } else if(randomList.get(m) == 3){
                blueButton.doClick(400);
            } else if(randomList.get(m) == 4){
                whiteButton.doClick(400);
            } else if(randomList.get(m) == 5){
                cyanButton.doClick(400);
            } else if(randomList.get(m) == 6){
                orangeButton.doClick(400);
            } else if(randomList.get(m) == 7){
                pinkButton.doClick(400);
            } else if(randomList.get(m) == 8){
                magentaButton.doClick(400);
            }
        };

        userList.clear();
    };

    public static void check(){
        if(userList.equals(randomList)){

            System.out.println("You're nice");

            if(randomListSize < 9){
                play();
                k++;
            } else if(userList.size() == 9){
            JFrame winnersScreen = new JFrame();
                winnersScreen.setVisible(true);
                winnersScreen.setLayout(null);
                winnersScreen.setSize(400, 200);
                winnersScreen.setResizable(false);

            JPanel winnersPanel = new JPanel();
                winnersPanel.setBounds(0, 0, 400, 200);
                winnersScreen.add(winnersPanel);

            JLabel winnersMessage = new JLabel();
                winnersMessage.setText("You Won! but sadly there's no reward");
                winnersPanel.add(winnersMessage);

            };
        } else {
            JFrame losersScreen = new JFrame();
                losersScreen.setVisible(true);
                losersScreen.setLayout(null);
                losersScreen.setSize(400, 200);
                losersScreen.setResizable(false);

            JPanel youLost = new JPanel();
                youLost.setBounds(0, 0, 400, 100);
                losersScreen.add(youLost);

            JLabel loseMessage = new JLabel();
                loseMessage.setText("Oh look, you lost :(");
                youLost.add(loseMessage);

            JPanel losersPanel = new JPanel();
                losersPanel.setBounds(0, 100, 400, 100);
                losersPanel.setLayout(new GridLayout(1, 2));
                losersScreen.add(losersPanel);

            JButton loseRestart = new JButton("Restart");
                losersPanel.add(loseRestart);

            JButton loseQuit = new JButton("Quit");
                losersPanel.add(loseQuit);


            loseRestart.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    losersScreen.dispose();
                    randomList.clear();
                    play();
                }
            });

            loseQuit.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    System.exit(0);
                }
            });
        };
    };

    public static void main(String[] args){
        createBoard();
    };

};
