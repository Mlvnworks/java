package calcu;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    private JLabel header;
    private JTextArea outputArea;
    private JPanel calcButtons;
    private JButton divideBtn;
    private JButton multiplyBtn;
    private JButton minusBtn;
    private JButton resultBtn;
    private JButton addBtn;
    private JButton clearBtn;
    private JButton deleteBtn;
    private JButton negativeEqBtn;
    private JButton num7;
    private JButton decimalBtn;
    private JButton num0;
    private JButton percentBtn;
    private JButton num3;
    private JButton num2;
    private JButton num1;
    private JButton num6;
    private JButton num5;
    private JButton num4;
    private JButton num9;
    private JButton num8;
    private JPanel calcuUi;


    public String equation = "";


    private void updateEquation(String type, String data){
        String[] splitedEquation = this.equation.split("");
        String lastDigit = splitedEquation[splitedEquation.length - 1];

        //Percent Number
        if(type == "per"){
            if(this.equation != ""){
                if(!Objects.equals(lastDigit, data)){
                    String[] splitedEq = this.equation.split("");
                    String[] splitedStr = this.equation.split("\\+|x|÷|-");
                    int toConvert = Integer.parseInt(splitedStr[splitedStr.length - 1]);
                    String toConvertStr = (""+ (float)toConvert/100);
                    int lastPos = this.equation.lastIndexOf(""+toConvert);

                    String newStrEq = "";
                    for (int i = 0; i < lastPos; i++){
                        newStrEq = newStrEq.concat(splitedEq[i]);
                    }
                    this.equation = newStrEq.concat(toConvertStr);
                }
            }
        }
        //input Number
        if(type == "numBtn"){
            if(data != "0"){
                this.equation = equation.concat(data);
            }

            //If the Input Number Is 0
            if(data.equals("0") && this.equation != ""){
                this.equation = equation.concat(data);
            }
        }

        //Delete And Clear
        if(type == "util" && data == "clear"){
            this.equation = "";

        }else if(type == "util" && data == "del") {
            String delTemp = "";
            for (int i = 0; i < splitedEquation.length - 1; i++) {
                delTemp = delTemp.concat(splitedEquation[i]);
            }
            this.equation = delTemp;
        }
        //Operation and Decimal points
            if(type == "ope" || type == "symb"){
                if(this.equation != ""){
                    if(!Objects.equals(lastDigit, data)){
                        this.equation = this.equation.concat(data);
                    }
                }
            }

        outputArea.setText(this.equation);
    }

    public static double solve(String input) {
        Stack<Double> stack = new Stack<>();
        double num = 0;
        char sign = '+';
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '.') {
                double decimal = 0.1;
                i++;
                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                    num += decimal * (input.charAt(i) - '0');
                    decimal /= 10;
                    i++;
                }
                i--;
            }
            if ((!Character.isDigit(c) && c != ' ' && c != '.') || i == input.length() - 1) {
                if (sign == '+') {
                    stack.push(num);
                } else if (sign == '-') {
                    stack.push(-num);
                } else if (sign == '*') {
                    double val = stack.pop() * num;
                    stack.push(val);
                } else if (sign == '/') {
                    double val = stack.pop() / num;
                    stack.push(val);
                }
                sign = c;
                num = 0;
            }
        }
        double result = 0;
        for (double d : stack) {
            result += d;
        }
        return result;
    }
    private void getTotal(){
        this.equation = this.equation.replace("x", "*").replace("÷", "/");
        this.equation = ""+solve(this.equation);
        outputArea.setText(this.equation);
    }


    public Calculator() {
        //Get Totals
        percentBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEquation("per", "%");
            }
        });

        //Get Totals
        resultBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getTotal();
            }
        });

        //Symbols
        decimalBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEquation("symb", ".");
            }
        });

        //Operation
        divideBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEquation("ope", "÷");
            }
        });

        multiplyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEquation("ope", "x");
            }
        });

        minusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEquation("ope", "-");
            }
        });

        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEquation("ope", "+");
            }
        });



        //Delete and Clear Btn Event
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEquation("util", "clear");
            }
        });

        deleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEquation("util", "del");
            }
        });

        //Number Btn Input
        num1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEquation("numBtn", "1");
            }
        });

        num2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEquation("numBtn", "2");
            }
        });

        num3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEquation("numBtn", "3");
            }
        });

        num4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEquation("numBtn", "4");
            }
        });

        num5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEquation("numBtn", "5");
            }
        });

        num6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEquation("numBtn", "6");
            }
        });

        num7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEquation("numBtn", "7");
            }
        });

        num8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEquation("numBtn", "8");
            }
        });

        num9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEquation("numBtn", "9");
            }
        });

        num0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEquation("numBtn", "0");
            }
        });
    }

    public void Calculator(){
        JFrame mainFrame = new JFrame("Caculator");
        mainFrame.add(this.calcuUi);
        mainFrame.setTitle("Calculator");
        mainFrame.setSize(800, 410);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
