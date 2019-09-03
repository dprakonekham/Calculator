// Description: An integer calculator that only allows 8 digits and the result can be negative.

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class JCalculator implements ActionListener,KeyListener
{
    private JFrame frame;
    private ImageIcon icon;
    private JPanel innerframe;
    private JPanel display;
    private JLabel input;
    private JButton operator1;
    private JButton operator2;
    private JButton operator3;
    private JButton operator4;
    private JButton operator5;
    private JButton operator6;
    private JButton operand0;
    private JButton operand1;
    private JButton operand2;
    private JButton operand3;
    private JButton operand4;
    private JButton operand5;
    private JButton operand6;
    private JButton operand7;
    private JButton operand8;
    private JButton operand9;
    private int num1 = 0;
    private int num2 = 0;
    private int result = 0;
    private JLabel credits = new JLabel("(c)Danny Prakonekham");
    private int MAX_CAPACITY = 8;
    private String currentOperator = null; // Tracks the operator that was pressed
    private boolean resultFlag = false; // This makes it so the digits can override the result on the display

    public JCalculator()
    {
        frame = new JFrame("Calculator"); //JFrame creation
        frame.setLayout(new BorderLayout());
        frame.setSize(640,480);
        icon = new ImageIcon("JCalculator.png"); // Adding the icon of the calculator
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); // Close

        display = new JPanel(new GridLayout(1,4)); // This JPanel is where the input is displayed
        Border border = BorderFactory.createLineBorder(Color.BLUE); // Adding a border to the display
        display.setBorder(border);
        input = new JLabel("0");
        input.setFont(new Font("monospace", Font.PLAIN,20)); // Changing the font to a more visible font
        input.setHorizontalAlignment(SwingConstants.RIGHT); // Aligning to the right
        display.add(input);
        frame.add(display,BorderLayout.NORTH); // Display to the top

        innerframe = new JPanel(new GridLayout(4,4)); // This JPanel will consist of operands and operators
        innerframe.add(operand7 = new JButton("7")); // Populating the grid
        innerframe.add(operand8 = new JButton("8")); // Populating the grid
        innerframe.add(operand9 = new JButton("9")); // Populating the grid
        innerframe.add(operator1 = new JButton("/")); // Populating the grid
        innerframe.add(operand4 = new JButton("4")); // Populating the grid
        innerframe.add(operand5 = new JButton("5")); // Populating the grid
        innerframe.add(operand6 = new JButton("6")); // Populating the grid
        innerframe.add(operator2 = new JButton("x")); // Populating the grid
        innerframe.add(operand1 = new JButton("1")); // Populating the grid
        innerframe.add(operand2 = new JButton("2")); // Populating the grid
        innerframe.add(operand3 = new JButton("3")); // Populating the grid
        innerframe.add(operator3 = new JButton("-")); // Populating the grid
        innerframe.add(operand0 = new JButton("0")); // Populating the grid
        operator4 = new JButton("C");
        operator4.setMnemonic(MouseEvent.BUTTON1);
        innerframe.add(operator4); // Populating the grid
        innerframe.add(operator5 = new JButton("=")); // Populating the grid
        innerframe.add(operator6 = new JButton("+")); // Populating the grid
        frame.add(innerframe,BorderLayout.CENTER);

        operand0.addActionListener(this);
        operand1.addActionListener(this);
        operand2.addActionListener(this);
        operand3.addActionListener(this);
        operand4.addActionListener(this);
        operand5.addActionListener(this);
        operand6.addActionListener(this);
        operand7.addActionListener(this);
        operand8.addActionListener(this);
        operand9.addActionListener(this);
        operator1.addActionListener(this);
        operator2.addActionListener(this);
        operator3.addActionListener(this);
        operator4.addActionListener(this);
        operator5.addActionListener(this);
        operator6.addActionListener(this);
        operator4.addKeyListener(this);

        frame.getRootPane().setDefaultButton(operator5);
        frame.setLocationRelativeTo(null); // The program will be centered
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("0")) {
            if (input.getText() == "0" || input.getText() == " " || resultFlag == true) { // This is to ensure that the numbers don't append wrong
                resultFlag = false;
                input.setText("0");
            } else if (input.getText() == credits.getText()) { // Makes it so [C] will be the only button that will clear the display

            } else if (input.getText().length() == MAX_CAPACITY) { // Displays overflow when it reaches 9 digits
                input.setText("Overflow");
            } else if (input.getText().equals("Cannot Divide by 0")) { // Makes it so [C] will be the only button that will clear the display

            } else {
                input.setText(input.getText() + "0");
            }
        }

        if (ae.getActionCommand().equals("1")) {
            if (input.getText() == "0" || input.getText() == " " || resultFlag == true) { // This is to ensure that the numbers don't append wrong
                resultFlag = false;
                input.setText("1");
            } else if (input.getText() == credits.getText()) { // Makes it so [C] will be the only button that will clear the display

            } else if (input.getText().length() == MAX_CAPACITY) {// Displays overflow when it reaches 9 digits
                input.setText("Overflow");
            } else if (input.getText().equals("Cannot Divide by 0")) { // Makes it so [C] will be the only button that will clear the display

            } else {
                input.setText(input.getText() + "1");
            }
        }
        if (ae.getActionCommand().equals("2")) {
            if (input.getText() == "0" || input.getText() == " " || resultFlag == true) {
                resultFlag = false;
                input.setText("2");
            } else if (input.getText() == credits.getText()) {

            } else if (input.getText().length() == MAX_CAPACITY) {
                input.setText("Overflow");
            } else if (input.getText().equals("Cannot Divide by 0")) {

            } else {
                input.setText(input.getText() + "2");
            }
        }
        if (ae.getActionCommand().equals("3")) {
            if (input.getText() == "0" || input.getText() == " " || resultFlag == true) {
                resultFlag = false;
                input.setText("3");
            } else if (input.getText() == credits.getText()) {

            } else if (input.getText().length() == MAX_CAPACITY) {
                input.setText("Overflow");
            } else if (input.getText().equals("Cannot Divide by 0")) {

            } else {
                input.setText(input.getText() + "3");
            }
        }
        if (ae.getActionCommand().equals("4")) {
            if (input.getText() == "0" || input.getText() == " " || resultFlag == true) {
                resultFlag = false;
                input.setText("4");
            } else if (input.getText() == credits.getText()) {

            } else if (input.getText().length() == MAX_CAPACITY) {
                input.setText("Overflow");
            } else if (input.getText().equals("Cannot Divide by 0")) {

            } else {
                input.setText(input.getText() + "4");
            }
        }
        if (ae.getActionCommand().equals("5")) {
            if (input.getText() == "0" || input.getText() == " " || resultFlag == true) {
                resultFlag = false;
                input.setText("5");
            } else if (input.getText() == credits.getText()) {

            } else if (input.getText().length() == MAX_CAPACITY) {
                input.setText("Overflow");
            } else if (input.getText().equals("Cannot Divide by 0")) {

            } else {
                input.setText(input.getText() + "5");
            }
        }
        if (ae.getActionCommand().equals("6")) {
            if (input.getText() == "0" || input.getText() == " " || resultFlag == true) {
                resultFlag = false;
                input.setText("6");
            } else if (input.getText() == credits.getText()) {

            } else if (input.getText().length() == MAX_CAPACITY) {
                input.setText("Overflow");
            } else if (input.getText().equals("Cannot Divide by 0")) {

            } else {
                input.setText(input.getText() + "6");
            }
        }
        if (ae.getActionCommand().equals("7")) {
            if (input.getText() == "0" || input.getText() == " " || resultFlag == true) {
                resultFlag = false;
                input.setText("7");
            } else if (input.getText() == credits.getText()) {

            } else if (input.getText().length() == MAX_CAPACITY) {
                input.setText("Overflow");
            } else if (input.getText().equals("Cannot Divide by 0")) {

            } else {
                input.setText(input.getText() + "7");
            }
        }
        if (ae.getActionCommand().equals("8")) {
            if (input.getText() == "0" || input.getText() == " " || resultFlag == true) {
                resultFlag = false;
                input.setText("8");
            } else if (input.getText() == credits.getText()) {

            } else if (input.getText().length() == MAX_CAPACITY) {
                input.setText("Overflow");
            } else if (input.getText().equals("Cannot Divide by 0")) {

            } else {
                input.setText(input.getText() + "8");
            }
        }
        if (ae.getActionCommand().equals("9")) {
            if (input.getText() == "0" || input.getText() == " " || resultFlag == true) {
                resultFlag = false;
                input.setText("9");
            } else if (input.getText() == credits.getText()) {

            } else if (input.getText().length() == MAX_CAPACITY) {
                input.setText("Overflow");
            } else if (input.getText().equals("Cannot Divide by 0")) {

            } else {
                input.setText(input.getText() + "9");
            }
        }
        if (ae.getActionCommand().equals("C")) {// Returns everything to initial state
            operator4.setFocusable(true); // Need this in order display the credits correctly
            input.setText("0"); // Sets the display to 0
            num1 = 0;
            num2 = 0;
            result = 0;
        }
        if (ae.getActionCommand().equals("/")) {
            if (input.getText() == credits.getText()) { // Makes it so [C] is the only button that works

            } else if (input.getText().equals("Cannot Divide by 0")) { // Makes it so [C] is the only button that works

            }
            else if(input.getText().equals("Overflow")) // Makes it so [C] is the only button that works
            {

            }else {
                currentOperator = "/"; // Keeps track of the operator
                num1 = Integer.parseInt(input.getText()); // Stores the current input into num1
                input.setText(" "); //Resets the display
            }
        }
        if (ae.getActionCommand().equals("x")) {
            if (input.getText() == credits.getText()) { // Makes it so [C] is the only button that works

            } else if (input.getText().equals("Cannot Divide by 0")) { // Makes it so [C] is the only button that works

            }
            else if(input.getText().equals("Overflow")) // Makes it so [C] is the only button that works
            {

            }else {
                currentOperator = "x"; // Keeps track of the operator
                num1 = Integer.parseInt(input.getText()); // Stores the current input into num1
                input.setText(" "); //Resets the display
            }
        }
        if (ae.getActionCommand().equals("-")) {
            if (input.getText() == credits.getText()) {

            } else if (input.getText().equals("Cannot Divide by 0")) {

            }
            else if(input.getText().equals("Overflow"))
            {

            }else {
                currentOperator = "-";
                num1 = Integer.parseInt(input.getText());
                input.setText(" ");
            }
        }
        if (ae.getActionCommand().equals("+")) {
            if (input.getText() == credits.getText()) {

            } else if (input.getText().equals("Cannot Divide by 0")) {

            }
            else if(input.getText().equals("Overflow"))
            {

            }else {
                currentOperator = "+";
                num1 = Integer.parseInt(input.getText());
                input.setText(" ");
            }
        }
        if (ae.getActionCommand().equals("=")) {
            if (input.getText() == credits.getText()) { // Makes it so [C] is the only button that works

            } else if (input.getText().equals("Cannot Divide by 0")) { // Makes it so [C] is the only button that works

            } else if (input.getText().equals("Overflow")) { // Makes it so [C] is the only button that works

            } else {
                if (currentOperator != null) { // If there is no operator, the program doesn't do anything
                    num2 = Integer.parseInt(input.getText()); // Stores the next number in ito num2
                    if (currentOperator.equals("/") && num2 != 0) { // Division
                        result = num1 / num2;
                    }
                    if (currentOperator.equals("/") && num2 == 0) { // Making sure that we don't divide by 0

                        result = 999999999; //Since the calculator can only reach 8 digits, I can use this number to indicate the division by 0

                    }
                    if (currentOperator.equals("x")) { // Multiplication
                        result = num1 * num2;
                    }
                    if (currentOperator.equals("+")) { // Addition
                        result = num1 + num2;
                    }
                    if (currentOperator.equals("-")) { // Subtraction
                        result = num1 - num2;
                    }
                    if (result != 999999999) { //If the result is not flagged for division by 0
                        if (input.getText().length() == MAX_CAPACITY) { // Checking for overflow
                            input.setText("Overflow");
                        } else {
                            input.setText(Integer.toString(result)); // Displays the result
                            resultFlag = true;
                            currentOperator = null;
                        }
                    } else {
                        input.setText("Cannot Divide by 0"); // Flagged for division by 0
                    }
                }

            }
        }
    }
    public void keyTyped(KeyEvent e) {

    }
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_CONTROL)
        {
            input.setText("(c)Danny Prakonekham"); // Displays the credits
        }
    }
    public void keyReleased(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_CONTROL)
        {
            operator4.setFocusable(false); // Makes it so when control is released, the credits won't show
        }
    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new JCalculator();
            }
        });
    }
}
