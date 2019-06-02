package Dinosaur.userinterface;

import java.awt.Container;
import java.awt.*;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Box;
import java.awt.BorderLayout;


public class LabelDemo {
 public static void main(String[] args) {
  JFrame frame = new JFrame("小恐龍跑跑跑");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  GameScreen gameScreen = new GameScreen();
  JPanel panel = new JPanel();
  JPanel data = new JPanel();
  panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
  panel.add(Box.createVerticalStrut(150));
  panel.add(new JButton("Shop"));
  panel.add(Box.createVerticalStrut(30));
  panel.add(new JButton("Gift"));
  panel.add(Box.createVerticalStrut(30));
  panel.add(new JButton("Honor"));
  panel.add(Box.createVerticalStrut(30));
  panel.add(new JButton("Bag"));
  panel.add(Box.createVerticalStrut(30));
  panel.add(new JButton("Stock"));
  panel.add(Box.createVerticalStrut(100));
  data.add(new Label("  6666  "));
  data.add(new Label("  LV87  "));
  data.add(new Label("  exp 9487  "));
  data.add(new Label("  money 1234  "));


  frame.add(gameScreen, BorderLayout.CENTER);

  frame.addKeyListener(gameScreen);
  frame.add(data, BorderLayout.NORTH);
  frame.setSize(1200, 675);
  frame.setVisible(true);
 }
}