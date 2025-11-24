import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.Random;

public class ArithmeticGame extends JFrame {

    private JTextField fieldNum1, fieldNum2, fieldAnswer;
    private JLabel labelOperator, labelEquals;
    private JButton btnSubmit;

    private JButton btnContinue, btnReset, btnExit;
    private JLabel lblFeedback; 

    private JPanel panelOperators, panelLevels, panelScoreboard;
    
    private JLabel lblCorrectScore, lblIncorrectScore, lblAttemptsScore;

    private int minRange = 1;
    private int maxRange = 100;
    private String currentOperator = "+";
    private int scoreCorrect = 0;
    private int scoreIncorrect = 0;
    private int attempts = 0;
    private Random random;
    
    private boolean isSetupComplete = false; 

    public ArithmeticGame() {
        random = new Random();
        
        setTitle("Arithmetic Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1100, 700); 
        setMinimumSize(new Dimension(850, 600)); 
        setLocationRelativeTo(null); 
        
        initComponents();
    }

    private void initComponents() {
        
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10)); 
        mainPanel.setBorder(new EmptyBorder(15, 15, 15, 15)); 
        mainPanel.setBackground(new Color(240, 248, 255)); 

        JLabel titleLabel = new JLabel("Arithmetic Game", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        titleLabel.setBorder(new EmptyBorder(0, 0, 10, 0)); // Padding below title
        mainPanel.add(titleLabel, BorderLayout.PAGE_START);
        
        JPanel contentWrapper = new JPanel(new BorderLayout(10, 10)); 
        contentWrapper.setOpaque(false);

        JPanel topCalculationRow = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        topCalculationRow.setOpaque(false);

        fieldNum1 = createBigSquareField();
        fieldNum1.setText("0"); 
        
        labelOperator = new JLabel("+");
        labelOperator.setFont(new Font("Arial", Font.BOLD, 60)); 
        
        fieldNum2 = createBigSquareField();
        fieldNum2.setText("0"); 
        labelEquals = new JLabel("=");
        labelEquals.setFont(new Font("Arial", Font.BOLD, 60)); 
        
        fieldAnswer = new JTextField();
        fieldAnswer.setPreferredSize(new Dimension(150, 150)); 
        fieldAnswer.setFont(new Font("Arial", Font.BOLD, 60));
        fieldAnswer.setHorizontalAlignment(JTextField.CENTER);
        fieldAnswer.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));

        btnSubmit = new JButton("SUBMIT");
        styleButton(btnSubmit, new Color(46, 139, 87)); 
        btnSubmit.setPreferredSize(new Dimension(120, 60)); 
        btnSubmit.addActionListener(e -> checkAnswer());

        topCalculationRow.add(fieldNum1);
        topCalculationRow.add(labelOperator);
        topCalculationRow.add(fieldNum2);
        topCalculationRow.add(labelEquals);
        topCalculationRow.add(fieldAnswer);
        topCalculationRow.add(btnSubmit); 
        
        contentWrapper.add(topCalculationRow, BorderLayout.NORTH);

        
        JPanel middleSection = new JPanel(new GridBagLayout()); 
        middleSection.setOpaque(false);
        middleSection.setBorder(new EmptyBorder(10, 0, 10, 0)); 

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); 

        lblFeedback = new JLabel("", SwingConstants.CENTER); 
        lblFeedback.setFont(new Font("Verdana", Font.BOLD, 20)); 
        lblFeedback.setForeground(Color.BLACK);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.7; 
        gbc.fill = GridBagConstraints.BOTH; 
        middleSection.add(lblFeedback, gbc);

        JPanel controlButtonsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        controlButtonsPanel.setOpaque(false);
        
        btnContinue = new JButton("CONTINUE"); 
        styleButton(btnContinue, new Color(70, 130, 180));
        btnContinue.addActionListener(e -> {
           
            if (isSetupComplete) { 
                generateNumbers();
                fieldAnswer.setText("");
                fieldAnswer.requestFocus();
           
                lblFeedback.setText("");
                lblFeedback.setForeground(Color.BLACK); 
            } else {
                 
                 lblFeedback.setText("Select a Level or Operator first!");
                 lblFeedback.setForeground(Color.RED);
            }
        });

        btnReset = new JButton("RESET"); 
        styleButton(btnReset, new Color(255, 140, 0));
        btnReset.addActionListener(e -> resetGame());

        btnExit = new JButton("EXIT"); 
        styleButton(btnExit, Color.RED);
        btnExit.addActionListener(e -> System.exit(0));

        controlButtonsPanel.add(btnContinue);
        controlButtonsPanel.add(btnReset);
        controlButtonsPanel.add(btnExit);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 0.3; 
        gbc.fill = GridBagConstraints.VERTICAL; 
        gbc.anchor = GridBagConstraints.EAST; 
        middleSection.add(controlButtonsPanel, gbc);

        contentWrapper.add(middleSection, BorderLayout.CENTER);

       
        JPanel bottomSection = new JPanel(new GridLayout(1, 3, 15, 0)); 
        bottomSection.setBorder(new EmptyBorder(10, 0, 0, 0)); 
        bottomSection.setPreferredSize(new Dimension(900, 250)); 

        panelOperators = new JPanel(new GridLayout(5, 1, 5, 5));
        panelOperators.setBorder(createTitledBorder("Operators"));
        String[] ops = {"ADDITION (+)", "SUBTRACTION (-)", "MULTIPLICATION (*)", "DIVISION (/)", "MODULO (%)"};
        String[] symbols = {"+", "-", "*", "/", "%"};
        
        for (int i = 0; i < ops.length; i++) {
            JButton btn = new JButton(ops[i]);
            final int index = i; 
            
            String sym = symbols[i];
            btn.addActionListener(e -> {
                currentOperator = sym;
                labelOperator.setText(currentOperator);
                isSetupComplete = true; 
                
                
                generateNumbers(); 
                
                lblFeedback.setText(""); 
                lblFeedback.setForeground(Color.BLACK);
            });
            panelOperators.add(btn);
        }

        panelLevels = new JPanel(new GridLayout(3, 1, 5, 10));
        panelLevels.setBorder(createTitledBorder("Select Level"));
        
        JButton btnLvl1 = new JButton("LEVEL 1 (1-100)"); 
        btnLvl1.addActionListener(e -> setLevel(1, 100));
        
        JButton btnLvl2 = new JButton("LEVEL 2 (101-200)"); 
        btnLvl2.addActionListener(e -> setLevel(101, 200));
        
        JButton btnLvl3 = new JButton("LEVEL 3 (201-1000)"); 
        btnLvl3.addActionListener(e -> setLevel(201, 1000));

        panelLevels.add(btnLvl1);
        panelLevels.add(btnLvl2);
        panelLevels.add(btnLvl3);

    
        panelScoreboard = new JPanel(new GridLayout(3, 1, 5, 5));
        panelScoreboard.setBorder(createTitledBorder("Scoreboard"));
        
        lblCorrectScore = new JLabel("Correct: 0");
        lblCorrectScore.setForeground(new Color(0, 128, 0));
        lblIncorrectScore = new JLabel("Incorrect: 0");
        lblIncorrectScore.setForeground(Color.RED);
        lblAttemptsScore = new JLabel("Attempts: 0");
        
        lblCorrectScore.setHorizontalAlignment(SwingConstants.CENTER);
        lblIncorrectScore.setHorizontalAlignment(SwingConstants.CENTER);
        lblAttemptsScore.setHorizontalAlignment(SwingConstants.CENTER);
        
        Font scoreFont = new Font("Verdana", Font.BOLD, 18);
        lblCorrectScore.setFont(scoreFont);
        lblIncorrectScore.setFont(scoreFont);
        lblAttemptsScore.setFont(scoreFont);

        panelScoreboard.add(lblCorrectScore);
        panelScoreboard.add(lblIncorrectScore);
        panelScoreboard.add(lblAttemptsScore);

        bottomSection.add(panelOperators);
        bottomSection.add(panelLevels);
        bottomSection.add(panelScoreboard);

        contentWrapper.add(bottomSection, BorderLayout.SOUTH);
        
        mainPanel.add(contentWrapper, BorderLayout.CENTER); 

        // Wrap the mainPanel in a JScrollPane to ensure responsiveness
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16); 
        add(scrollPane);
    }

    // --- Helper Methods ---

    private JTextField createBigSquareField() {
        JTextField tf = new JTextField();
        tf.setEditable(false);
        tf.setPreferredSize(new Dimension(150, 150));
        tf.setFont(new Font("Arial", Font.BOLD, 60));
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setBackground(Color.WHITE);
        tf.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        return tf;
    }

    private TitledBorder createTitledBorder(String title) {
        TitledBorder border = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.DARK_GRAY), title);
        border.setTitleFont(new Font("Segoe UI", Font.BOLD, 16));
        border.setTitleJustification(TitledBorder.CENTER);
        return border;
    }

    private void styleButton(JButton btn, Color bg) {
        btn.setBackground(bg);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 14)); 
        btn.setPreferredSize(new Dimension(120, 35)); 
    }

    // --- Game Logic ---

    private void setLevel(int min, int max) {
        this.minRange = min;
        this.maxRange = max;
        
        isSetupComplete = true; 
        // Numbers generated when level is set
        generateNumbers(); 
        lblFeedback.setText(""); // Clear feedback
        lblFeedback.setForeground(Color.BLACK);
    }

    private void generateNumbers() {
        int num1 = random.nextInt((maxRange - minRange) + 1) + minRange;
        int num2 = random.nextInt((maxRange - minRange) + 1) + minRange;

        fieldNum1.setText(String.valueOf(num1));
        fieldNum2.setText(String.valueOf(num2));
    }

    private void checkAnswer() {
        try {
            String input = fieldAnswer.getText().trim();
            if (input.isEmpty()) {
                lblFeedback.setText("Please enter an answer!");
                lblFeedback.setForeground(Color.RED);
                return;
            }
            
            // Check setup completion first
            if (!isSetupComplete) {
                lblFeedback.setText("Select a Level or Operator first!");
                lblFeedback.setForeground(Color.RED);
                return;
            }

            int userAnswer = Integer.parseInt(input);
            int num1 = Integer.parseInt(fieldNum1.getText());
            int num2 = Integer.parseInt(fieldNum2.getText());
            int actualAnswer = 0;
            boolean calculationPossible = true;

            // Handle calculation based on operator
            switch (currentOperator) {
                case "+": actualAnswer = num1 + num2; break;
                case "-": actualAnswer = num1 - num2; break;
                case "*": actualAnswer = num1 * num2; break;
                case "/": 
                    if (num2 == 0) {
                        lblFeedback.setText("Cannot divide by zero! Please Reset.");
                        calculationPossible = false;
                    } else {
                        actualAnswer = num1 / num2; 
                    }
                    break;
                case "%": 
                     if (num2 == 0) {
                        lblFeedback.setText("Cannot modulo by zero! Please Reset.");
                        calculationPossible = false;
                    } else {
                        actualAnswer = num1 % num2; 
                    }
                    break;
            }

            if (!calculationPossible) {
                lblFeedback.setForeground(Color.RED);
                return;
            }

            // --- Feedback Logic ---
            attempts++;
            if (userAnswer == actualAnswer) {
                scoreCorrect++;
                lblFeedback.setText("Good job! Your Answer is Correct!");
                lblFeedback.setForeground(new Color(0, 128, 0)); // Green
            } else {
                scoreIncorrect++;
                lblFeedback.setText("Your Answer is Wrong! The Correct Answer is " + actualAnswer);
                lblFeedback.setForeground(Color.RED);
            }
            
            // NEW: Generate new numbers after the submission is processed
            generateNumbers();
            fieldAnswer.setText(""); // Clear the answer field
            fieldAnswer.requestFocus();
            // --- End Feedback Logic ---

            updateScoreboard();

        } catch (NumberFormatException ex) {
            lblFeedback.setText("Invalid input! Please enter numbers only.");
            lblFeedback.setForeground(Color.RED);
        }
    }

    private void updateScoreboard() {
        lblCorrectScore.setText("Correct: " + scoreCorrect);
        lblIncorrectScore.setText("Incorrect: " + scoreIncorrect);
        lblAttemptsScore.setText("Attempts: " + attempts);
    }

    private void resetGame() {
        scoreCorrect = 0;
        scoreIncorrect = 0;
        attempts = 0;
        currentOperator = "+";
        labelOperator.setText("+");
        fieldAnswer.setText("");
        
        // Reset numbers to 0 and flag to false
        fieldNum1.setText("0"); 
        fieldNum2.setText("0");
        isSetupComplete = false; 
        
        updateScoreboard();
        // Clear all feedback text on full reset
        lblFeedback.setText(""); 
        lblFeedback.setForeground(Color.BLACK);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ArithmeticGame().setVisible(true);
        });
    }
}