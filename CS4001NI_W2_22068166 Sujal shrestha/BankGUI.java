 
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.GridLayout;
public class BankGUI
{
    //private ArrayList<BankCard>bankcard;
    private JFrame fBankCard, fDebitCard, fCreditCard, fDisplay;
    private JPanel pBankCard, pDebitCard, pCreditCard, pDisplay;
    private JLabel lblTitle, lblID, lblAccount, lblName, lblAmount, lblIssuer, lblPin, lblConfirmPin, lblDate;
    private JTextField txtID, txtAccount, txtName, txtAmount, txtIssuer, txtPin, txtConfirmPin;
    private JComboBox<String> boxDD, boxMM, boxYY;
    private JButton btnCreate, btnDisplay, btnClear, btnGoDebit, btnGoCredit;
    private JLabel lblDebTitle, lblDebID, lblDebAccount, lblDebName, lblDebAmount, lblDebIssuer, lblDebPin, lblWithDraw, lblDebDate;
    private JTextField txtDebID, txtDebAccount, txtDebName, txtDebAmount, txtDebIssuer, txtDebPin, txtWithDraw;
    private JButton btnDebGo, btnDebDisplay, btnDebClear, btnGoBank, btnWithDraw;
    private JComboBox<String> boxDebDD, boxDebMM, boxDebYY;
    private JLabel lblCreTitle, lblCreID, lblCreAccount, lblCreName, lblCreAmount, lblCreIssuer, lblCrePin, lblCvc, lblLimit, lblInterest, lblGrace, lblExpiration;
    private JTextField txtCreID, txtCreAccount, txtCreName, txtCreAmount, txtCreIssuer, txtCrePin, txtCvc, txtLimit, txtInterest, txtGrace;
    private JComboBox<String> boxCreDD, boxCreMM, boxCreYY;//generic
    private JButton btnCreGo, btnCreDisplay, btnCreClear, btnCreGoBank, btnCreAdd, btnSet, btnCancel;
    public BankGUI()
    {
        //bankcard = new ArrayList<BankCard>();
        ArrayList<BankCard>bankcard = new ArrayList<BankCard>();
        fBankCard = new JFrame("BankCard");
        pBankCard = new JPanel();
        lblTitle = new JLabel("Bank Card");
        lblTitle.setForeground(Color.CYAN);
        lblTitle.setFont(new Font("",50,30));
        lblID = new JLabel("Card ID:");
        //lblID.setFont(new Font("",35,15));
        lblID.setForeground(Color.CYAN);
        txtID = new JTextField();
        txtID.setFont(new Font("",25,15));
        txtID.setForeground(Color.BLUE);
        lblAccount = new JLabel("Bank Account:");
        lblAccount.setForeground(Color.CYAN);
        txtAccount = new JTextField();
        txtAccount.setFont(new Font("",25,15));
        txtAccount.setForeground(Color.BLUE);
        lblName = new JLabel("Client Name:");
        lblName.setForeground(Color.CYAN);
        txtName = new JTextField();
        txtName.setFont(new Font("",25,15));
        txtName.setForeground(Color.BLUE);
        lblAmount = new JLabel("Balance Amount:");
        lblAmount.setForeground(Color.CYAN);
        txtAmount = new JTextField();
        txtAmount.setFont(new Font("",25,15));
        txtAmount.setForeground(Color.BLUE);
        lblIssuer = new JLabel("Issuer Bank:");
        lblIssuer.setForeground(Color.CYAN);
        txtIssuer = new JTextField();
        txtIssuer.setFont(new Font("",25,15));
        txtIssuer.setForeground(Color.BLUE);
        lblPin = new JLabel("Pin:");
        lblPin.setForeground(Color.CYAN);
        txtPin = new JTextField();
        txtPin.setFont(new Font("",25,15));
        txtPin.setForeground(Color.BLUE);
        lblConfirmPin = new JLabel("Confirm Pin:");
        lblConfirmPin.setForeground(Color.CYAN);
        txtConfirmPin = new JTextField();
        txtConfirmPin.setFont(new Font("",25,15));
        txtConfirmPin.setForeground(Color.BLUE);
        lblDate = new JLabel("Date:");
        lblDate.setForeground(Color.CYAN);
        String day[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        boxDD = new JComboBox<String>(day);
        boxDD.setForeground(Color.BLUE);
        boxDD.setEditable(true);
        String month[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        boxMM = new JComboBox<String>(month);
        boxMM.setEditable(true);
        String year[] = {"2023","2024","2025","2026"};
        boxYY = new JComboBox<String>(year);
        boxYY.setEditable(true);
        btnCreate = new JButton("Create");
        btnCreate.setForeground(Color.BLUE);
        btnCreate.setBackground(Color.CYAN);
        btnCreate.setFont(new Font("",45,15));
        btnDisplay = new JButton("Display");
        btnDisplay.setForeground(Color.BLUE);
        btnDisplay.setBackground(Color.CYAN);
        btnClear = new JButton("Clear");
        btnClear.setForeground(Color.BLUE);
        btnClear.setBackground(Color.YELLOW);
        btnGoDebit = new JButton("Go to Debit Card");
        btnGoDebit.setForeground(Color.BLUE);
        btnGoDebit.setBackground(Color.GREEN);
        btnGoCredit = new JButton("Go to Credit Card");
        btnGoCredit.setBackground(Color.GREEN);
        btnGoCredit.setForeground(Color.BLUE);

        lblTitle.setBounds(210,10,180,30);
        lblID.setBounds(30,60,100,30);
        txtID.setBounds(130,60,130,30);
        lblAccount.setBounds(30,105,100,30);
        txtAccount.setBounds(130,105,130,30);
        lblName.setBounds(30,150,100,30);
        txtName.setBounds(130,150,130,30);
        lblAmount.setBounds(30,195,100,30);
        txtAmount.setBounds(130,195,130,30);
        lblIssuer.setBounds(330,60,100,30);
        txtIssuer.setBounds(420,60,130,30);
        lblPin.setBounds(330,105,100,30);
        txtPin.setBounds(420,105,130,30);
        lblConfirmPin.setBounds(330,150,100,30);
        txtConfirmPin.setBounds(420,150,130,30);
        lblDate.setBounds(330,195,100,30);
        boxDD.setBounds(400,195,50,30);
        boxMM.setBounds(450,195,50,30);
        boxYY.setBounds(500,195,80,30);
        btnCreate.setBounds(110,270,180,40);
        btnDisplay.setBounds(300,270,180,40);
        btnClear.setBounds(210,320,180,40);
        btnGoDebit.setBounds(210,370,180,40);
        btnGoCredit.setBounds(210,420,180,40);

        fBankCard.add(pBankCard);
        pBankCard.add(lblTitle);
        pBankCard.add(lblID);
        pBankCard.add(txtID);
        pBankCard.add(lblAccount);
        pBankCard.add(txtAccount);
        pBankCard.add(lblName);
        pBankCard.add(txtName);
        pBankCard.add(lblAmount);
        pBankCard.add(txtAmount);
        pBankCard.add(lblIssuer);
        pBankCard.add(txtIssuer);
        pBankCard.add(lblPin);
        pBankCard.add(txtPin);
        pBankCard.add(lblConfirmPin);
        pBankCard.add(txtConfirmPin);
        pBankCard.add(lblDate);
        pBankCard.add(boxDD);
        pBankCard.add(boxMM);
        pBankCard.add(boxYY);
        pBankCard.add(btnCreate);
        pBankCard.add(btnDisplay);
        pBankCard.add(btnClear);
        pBankCard.add(btnGoDebit);
        pBankCard.add(btnGoCredit);

        pBankCard.setLayout(null);
        pBankCard.setSize(600,550);
        pBankCard.setVisible(true);
        fBankCard.setVisible(true);
        fBankCard.setSize(600,550);
        fBankCard.setResizable(false);
        fBankCard.setLocationRelativeTo(null);
        pBankCard.setBackground(Color.DARK_GRAY);
        fBankCard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fDebitCard = new JFrame("Debit Card");
        pDebitCard = new JPanel();
        lblDebTitle = new JLabel("Debit Card");
        lblDebTitle.setFont(new Font("",30,30));
        lblDebTitle.setForeground(Color.CYAN);
        lblDebID = new JLabel("Card ID:");
        lblDebID.setForeground(Color.CYAN);
        txtDebID = new JTextField();
        txtDebID.setForeground(Color.BLUE);
        txtDebID.setFont(new Font("",25,15));
        btnDebGo = new JButton("Go");
        btnDebGo.setBackground(Color.CYAN);
        btnDebGo.setForeground(Color.BLUE);
        lblDebAccount = new JLabel("Bank Account:");
        lblDebAccount.setForeground(Color.CYAN);
        txtDebAccount = new JTextField();
        txtDebAccount.setForeground(Color.BLUE);
        txtDebAccount.setFont(new Font("",25,15));
        lblDebName = new JLabel("Client Name:");
        lblDebName.setForeground(Color.CYAN);
        txtDebName = new JTextField();
        txtDebName.setForeground(Color.BLUE);
        txtDebName.setFont(new Font("",25,15));
        lblDebAmount = new JLabel("Balance Amount:");
        lblDebAmount.setForeground(Color.CYAN);
        txtDebAmount = new JTextField();
        txtDebAmount.setForeground(Color.BLUE);
        txtDebAmount.setFont(new Font("",25,15));
        lblDebIssuer = new JLabel("Issuer Bank:");
        lblDebIssuer.setForeground(Color.CYAN);
        txtDebIssuer = new JTextField();
        txtDebIssuer.setForeground(Color.BLUE);
        txtDebIssuer.setFont(new Font("",25,15));
        lblDebPin = new JLabel("Pin:");
        lblDebPin.setForeground(Color.CYAN);
        txtDebPin = new JTextField();
        txtDebPin.setForeground(Color.BLUE);
        txtDebPin.setFont(new Font("",25,15));
        lblWithDraw = new JLabel("WithDraw:");
        lblWithDraw.setForeground(Color.CYAN);
        txtWithDraw = new JTextField();
        txtWithDraw.setForeground(Color.BLUE);
        txtWithDraw.setFont(new Font("",25,15));
        lblDebDate = new JLabel("Date:");
        lblDebDate.setForeground(Color.CYAN);
        String Debday[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        boxDebDD = new JComboBox<String>(Debday);
        boxDebDD.setEditable(true);
        String Debmonth[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        boxDebMM = new JComboBox<String>(Debmonth);
        boxDebMM.setEditable(true);
        String Debyear[] = {"2023","2024","2025","2026"};
        boxDebYY = new JComboBox<String>(Debyear);
        boxDebYY.setEditable(true);
        btnWithDraw = new JButton("WithDraw");
        btnWithDraw.setBackground(Color.CYAN);
        btnWithDraw.setForeground(Color.BLUE);
        btnDebDisplay = new JButton("Display");
        btnDebDisplay.setBackground(Color.CYAN);
        btnDebDisplay.setForeground(Color.BLUE);
        btnDebClear = new JButton("Clear");
        btnDebClear.setBackground(Color.YELLOW);
        btnDebClear.setForeground(Color.BLUE);
        btnGoBank = new JButton("Go to Bank Card");
        btnGoBank.setBackground(Color.GREEN);
        btnGoBank.setForeground(Color.BLUE);

        lblDebTitle.setBounds(210,5,180,30);
        lblDebID.setBounds(30,60,100,30);
        txtDebID.setBounds(130,60,100,30);
        btnDebGo.setBounds(230,60,60,28);
        lblDebAccount.setBounds(30,105,100,30);
        txtDebAccount.setBounds(130,105,130,30);
        lblDebName.setBounds(30,150,100,30);
        txtDebName.setBounds(130,150,130,30);
        lblDebAmount.setBounds(30,240,100,30);
        txtDebAmount.setBounds(130,240,130,30);
        lblDebIssuer.setBounds(30,195,100,30);
        txtDebIssuer.setBounds(130,195,130,30);
        lblWithDraw.setBounds(330,60,100,30);
        txtWithDraw.setBounds(420,60,130,30);
        lblDebPin.setBounds(330,105,100,30);
        txtDebPin.setBounds(420,105,130,30);
        lblDebDate.setBounds(330,150,100,30);
        boxDebDD.setBounds(400,150,50,30);
        boxDebMM.setBounds(450,150,50,30);
        boxDebYY.setBounds(500,150,80,30);
        btnWithDraw.setBounds(360,215,180,40);
        btnDebDisplay.setBounds(360,270,180,40);
        btnDebClear.setBounds(210,340,180,40);
        btnGoBank.setBounds(210,390,180,40);

        fDebitCard.add(pDebitCard);
        pDebitCard.add(lblDebTitle);
        pDebitCard.add(lblDebID);
        pDebitCard.add(txtDebID);
        pDebitCard.add(btnDebGo);
        pDebitCard.add(lblDebAccount);
        pDebitCard.add(txtDebAccount);
        pDebitCard.add(lblDebName);
        pDebitCard.add(txtDebName);
        pDebitCard.add(lblDebIssuer);
        pDebitCard.add(txtDebIssuer);
        pDebitCard.add(lblDebAmount);
        pDebitCard.add(txtDebAmount);
        pDebitCard.add(lblDebPin);
        pDebitCard.add(txtDebPin);
        pDebitCard.add(lblWithDraw);
        pDebitCard.add(txtWithDraw);
        pDebitCard.add(lblDebDate);
        pDebitCard.add(boxDebDD);
        pDebitCard.add(boxDebMM);
        pDebitCard.add(boxDebYY);
        pDebitCard.add(btnWithDraw);
        pDebitCard.add(btnDebDisplay);
        pDebitCard.add(btnDebClear);
        pDebitCard.add(btnGoBank);
        pDebitCard.setLayout(null);
        pDebitCard.setVisible(false);
        pDebitCard.setSize(600,550);
        pDebitCard.setBackground(Color.DARK_GRAY);

        fDebitCard.setVisible(false);
        fDebitCard.setResizable(false);
        fDebitCard.setSize(600,550);
        fDebitCard.setLocationRelativeTo(null);
        fDebitCard.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        fCreditCard = new JFrame("Credit Card");
        pCreditCard = new JPanel();
        lblCreTitle = new JLabel("Credit Card");
        lblCreTitle.setForeground(Color.CYAN);
        lblCreTitle.setFont(new Font("",30,30));
        lblCreID = new JLabel("Card ID:");
        lblCreID.setForeground(Color.CYAN);
        txtCreID = new JTextField();
        txtCreID.setForeground(Color.BLUE);
        txtCreID.setFont(new Font("",25,15));
        btnCreGo = new JButton("Go");
        btnCreGo.setForeground(Color.BLUE);
        btnCreGo.setBackground(Color.CYAN);
        lblCreAccount = new JLabel("Bank Account:");
        lblCreAccount.setForeground(Color.CYAN);
        txtCreAccount = new JTextField();
        txtCreAccount.setForeground(Color.BLUE);
        txtCreAccount.setFont(new Font("",25,15));
        lblCreName = new JLabel("Client Name:");
        lblCreName.setForeground(Color.CYAN);
        txtCreName = new JTextField();
        txtCreName.setForeground(Color.BLUE);
        txtCreName.setFont(new Font("",25,15));
        lblCreAmount = new JLabel("Balance Amount:");
        lblCreAmount.setForeground(Color.CYAN);
        txtCreAmount = new JTextField();
        txtCreAmount.setForeground(Color.BLUE);
        txtCreAmount.setFont(new Font("",25,15));
        lblCreIssuer = new JLabel("Issuer Bank:");
        lblCreIssuer.setForeground(Color.CYAN);
        txtCreIssuer = new JTextField();
        txtCreIssuer.setForeground(Color.BLUE);
        txtCreIssuer.setFont(new Font("",25,15));
        lblCrePin = new JLabel("Pin:");
        lblCrePin.setForeground(Color.CYAN);
        txtCrePin = new JTextField();
        txtCrePin.setForeground(Color.BLUE);
        txtCrePin.setFont(new Font("",25,15));
        lblCvc = new JLabel("CVC NO:");
        lblCvc.setForeground(Color.CYAN);
        txtCvc = new JTextField();
        txtCvc.setForeground(Color.BLUE);
        txtCvc.setFont(new Font("",25,15));
        lblLimit = new JLabel("Credit Limit:");
        lblLimit.setForeground(Color.CYAN);
        txtLimit = new JTextField();
        txtLimit.setForeground(Color.BLUE);
        txtLimit.setFont(new Font("",25,15));
        lblInterest = new JLabel("Interest Rate:");
        lblInterest.setForeground(Color.CYAN);
        txtInterest = new JTextField();
        txtInterest.setForeground(Color.BLUE);
        txtInterest.setFont(new Font("",25,15));
        lblExpiration = new JLabel("Expiration:");
        lblExpiration.setForeground(Color.CYAN);
        //JTextField txtExpiration = new JTextField();
        String Creday[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        boxCreDD = new JComboBox<String>(Creday);
        boxCreDD.setEditable(true);
        String Cremonth[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        boxCreMM = new JComboBox<String>(Cremonth);
        boxCreMM.setEditable(true);
        String Creyear[] = {"2023","2024","2025","2026"};
        boxCreYY = new JComboBox<String>(Creyear);
        boxCreYY.setEditable(true);
        lblGrace = new JLabel("Grace Period:");
        lblGrace.setForeground(Color.CYAN);
        txtGrace = new JTextField();
        txtGrace.setForeground(Color.BLUE);
        txtGrace.setFont(new Font("",25,15));
        btnCreAdd = new JButton("Add");
        btnCreAdd.setForeground(Color.BLUE);
        btnCreAdd.setBackground(Color.CYAN);
        btnCreDisplay = new JButton("Display");
        btnCreDisplay.setForeground(Color.BLUE);
        btnCreDisplay.setBackground(Color.CYAN);
        btnSet = new JButton("Set Credit Limit");
        btnSet.setForeground(Color.BLUE);
        btnSet.setBackground(Color.CYAN);
        btnCancel = new JButton("Cancel Credit Card");
        btnCancel.setForeground(Color.WHITE);
        btnCancel.setBackground(Color.RED);
        btnCreClear = new JButton("Clear");
        btnCreClear.setForeground(Color.BLUE);
        btnCreClear.setBackground(Color.YELLOW);
        btnCreGoBank = new JButton("Go to Bank Card");
        btnCreGoBank.setForeground(Color.BLUE);
        btnCreGoBank.setBackground(Color.GREEN);

        lblCreTitle.setBounds(210,5,180,30);
        lblCreID.setBounds(30,60,100,30);
        txtCreID.setBounds(130,60,100,30);
        btnCreGo.setBounds(230,60,60,28);
        lblCreAccount.setBounds(30,105,100,30);
        txtCreAccount.setBounds(130,105,130,30);
        lblCreName.setBounds(30,150,100,30);
        txtCreName.setBounds(130,150,130,30);
        lblCreAmount.setBounds(30,240,100,30);
        txtCreAmount.setBounds(130,240,130,30);
        lblCreIssuer.setBounds(30,195,100,30);
        txtCreIssuer.setBounds(130,195,130,30);
        lblCrePin.setBounds(30,285,100,30);
        txtCrePin.setBounds(130,285,130,30);
        lblCvc.setBounds(330,105,100,30);
        txtCvc.setBounds(420,105,130,30);
        lblLimit.setBounds(330,150,100,30);
        txtLimit.setBounds(420,150,130,30);
        lblInterest.setBounds(330,195,100,30);
        txtInterest.setBounds(420,195,130,30);
        lblExpiration.setBounds(330,285,100,30);
        //txtExpiration.setBounds(420,285,130,30);
        boxCreDD.setBounds(400,285,50,30);
        boxCreMM.setBounds(450,285,50,30);
        boxCreYY.setBounds(500,285,80,30);
        lblGrace.setBounds(330,240,100,30);
        txtGrace.setBounds(420,240,130,30);
        btnCreAdd.setBounds(40,350,160,40);
        btnSet.setBounds(210,350,160,40);
        btnCancel.setBounds(380,350,160,40);
        btnCreDisplay.setBounds(200,400,180,40);
        btnCreClear.setBounds(200,450,180,40);
        btnCreGoBank.setBounds(200,500,180,40);

        fCreditCard.add(pCreditCard);
        pCreditCard.add(lblCreTitle);
        pCreditCard.add(lblCreID);
        pCreditCard.add(txtCreID);
        pCreditCard.add(lblCreAccount);
        pCreditCard.add(txtCreAccount);
        pCreditCard.add(lblCreName);
        pCreditCard.add(txtCreName);
        pCreditCard.add(lblCreIssuer);
        pCreditCard.add(txtCreIssuer);
        pCreditCard.add(lblCreAmount);
        pCreditCard.add(txtCreAmount);
        pCreditCard.add(lblCrePin);
        pCreditCard.add(txtCrePin);
        pCreditCard.add(lblCvc);
        pCreditCard.add(txtCvc);
        pCreditCard.add(lblLimit);
        pCreditCard.add(txtLimit);
        pCreditCard.add(lblInterest);
        pCreditCard.add(txtInterest);
        pCreditCard.add(lblExpiration);
        //pCreditCard.add(txtExpiration);
        pCreditCard.add(boxCreDD);
        pCreditCard.add(boxCreMM);
        pCreditCard.add(boxCreYY);
        pCreditCard.add(lblGrace);
        pCreditCard.add(txtGrace);
        pCreditCard.add(btnCreGo);
        pCreditCard.add(btnCreAdd);
        pCreditCard.add(btnCreDisplay);
        pCreditCard.add(btnSet);
        pCreditCard.add(btnCancel);
        pCreditCard.add(btnCreClear);
        pCreditCard.add(btnCreGoBank);
        pCreditCard.setLayout(null);
        pCreditCard.setVisible(false);
        pCreditCard.setSize(600,600);
        pCreditCard.setBackground(Color.DARK_GRAY);

        fCreditCard.setVisible(false);
        fCreditCard.setResizable(false);
        fCreditCard.setSize(600,600);
        fCreditCard.setLocationRelativeTo(null);
        fCreditCard.getContentPane().setBackground(Color.CYAN);
        fCreditCard.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        fDisplay=new JFrame("Display");
        pDisplay=new JPanel();
        JTextArea textArea=new JTextArea();
        textArea.setEditable ( false ); // set textArea non-editable
        JScrollPane scroll = new JScrollPane ( textArea );
        scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED );
        GridLayout layout1=new GridLayout(1,1);
        pDisplay.setLayout(layout1);
        pDisplay.add(scroll);
        pDisplay.setSize(400,500);
        fDisplay.add(pDisplay);
        fDisplay.setSize(400,500);
        fDisplay.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fDisplay.setVisible(false);

        btnGoDebit.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    fDebitCard.setVisible(true);
                    pDebitCard.setVisible(true);
                    fBankCard.setVisible(false);
                    pBankCard.setVisible(false);
                }
            });

        btnGoBank.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    fDebitCard.setVisible(false);
                    pDebitCard.setVisible(false);
                    fBankCard.setVisible(true);
                    pBankCard.setVisible(true);
                }
            });

        btnCreGoBank.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    fBankCard.setVisible(true);
                    pBankCard.setVisible(true);
                    fCreditCard.setVisible(false);
                    pCreditCard.setVisible(false);
                }
            });

        btnGoCredit.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    fBankCard.setVisible(false);
                    pBankCard.setVisible(false);
                    fCreditCard.setVisible(true);
                    pCreditCard.setVisible(true);
                }
            });

        btnClear.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    txtID.setText("");
                    txtAccount.setText("");
                    txtName.setText("");
                    txtAmount.setText("");
                    txtIssuer.setText("");
                    txtPin.setText("");
                    txtConfirmPin.setText("");
                }
            });

        btnDebClear.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    txtDebID.setText("");
                    txtDebAccount.setText("");
                    txtDebName.setText("");
                    txtDebAmount.setText("");
                    txtDebIssuer.setText("");
                    txtDebPin.setText("");
                    txtWithDraw.setText("");
                }
            });

        btnCreClear.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    txtCreID.setText("");
                    txtCreAccount.setText("");
                    txtCreName.setText("");
                    txtCreAmount.setText("");
                    txtCreIssuer.setText("");
                    txtCrePin.setText("");
                    txtCvc.setText("");
                    txtLimit.setText("");
                    txtInterest.setText("");
                    txtGrace.setText("");
                }
            });

        btnCreate.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    boolean check = true;
                    for(BankCard cards : bankcard)
                    {
                        if(cards instanceof BankCard)
                        {
                            BankCard bankcard = (BankCard) cards;
                            if(txtID.getText().equals(String.valueOf(bankcard.getcardID())))
                            {
                                check = false;
                                break;
                            }
                            else
                            {
                                check = true;
                            }
                        }
                    }
                    try
                    {
                        if(check == true)
                        {
                            if(Integer.parseInt(txtID.getText()) < 0 ||txtName.getText().isEmpty() || txtAmount.getText().isEmpty() || Integer.parseInt(txtAmount.getText()) < 0 
                            || txtID.getText().isEmpty() || txtAccount.getText().isEmpty() || txtIssuer.getText().isEmpty() || txtPin.getText().isEmpty() || Integer.parseInt(txtPin.getText()) < 0)
                            {
                                JOptionPane.showMessageDialog(null,"Input Invalid","Error",JOptionPane.ERROR_MESSAGE);
                            }
                            else
                            {
                                if(txtPin.getText().equals(txtConfirmPin.getText()))
                                {
                                    int id = Integer.parseInt(txtID.getText());
                                    String account = txtAccount.getText();
                                    String name = txtName.getText();
                                    double balance = Double.parseDouble(txtAmount.getText());
                                    String bank = txtIssuer.getText();
                                    int pin = Integer.parseInt(txtPin.getText());

                                    BankCard objbankcard = new BankCard(balance,id,account,bank);
                                    DebitCard debitcard = new DebitCard(balance,id,account,bank,name,pin);
                                    bankcard.add(debitcard);
                                    JOptionPane.showMessageDialog(null,"Account Created!","Message",JOptionPane.WARNING_MESSAGE);

                                }

                                else
                                {
                                    JOptionPane.showMessageDialog(null,"Check Pin","Error",JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                        else if(check == false)
                        {
                            JOptionPane.showMessageDialog(null,"Card ID already Use!","Error",JOptionPane.ERROR_MESSAGE);   
                        }
                    }
                    catch(NumberFormatException ex)
                    {
                        JOptionPane.showMessageDialog(null,"Check All the Data CareFully","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }

            });

        btnDisplay.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    fDisplay.setVisible(true);
                    StringBuilder builder = new StringBuilder();
                    String day = String.valueOf(boxDD.getSelectedItem());
                    String month = String.valueOf(boxMM.getSelectedItem());
                    String year = String.valueOf(boxYY.getSelectedItem());
                    for(BankCard card : bankcard)
                    {
                        if(card instanceof DebitCard)
                        {
                            DebitCard objDebitCard = (DebitCard) card;
                            builder.append("Card ID:" +objDebitCard.getcardID() +"\n");
                            builder.append("Bank Account:" +objDebitCard.getBankAccount() +"\n");
                            builder.append("Client Name:" +objDebitCard.getClientName() +"\n");
                            builder.append("Balance Amount:"+objDebitCard.getBalanceAmount() +"\n");
                            builder.append("Issuer Bank:" +objDebitCard.getissureBank() +"\n");
                            builder.append("Pin:" +objDebitCard.getPinNumber() +"\n");
                            builder.append("Date:" +day+"/"+month+"/"+year+"\n");
                            builder.append("---------------------------------------------------" +"\n");
                        }
                    }
                    if(builder.toString().isEmpty())
                    {
                        textArea.setText("No Data Found");
                    }
                    else
                    {
                        textArea.setText(builder.toString());
                    }
                }
            });

        btnDebGo.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    boolean check = true;
                    try
                    {
                        int ids = Integer.parseInt(txtDebID.getText());
                        for(BankCard cards: bankcard){
                            if(cards instanceof DebitCard)
                            {

                                DebitCard debitcard = (DebitCard) cards;
                                if( ids == debitcard.getcardID())
                                {
                                    check = true;
                                    break;
                                }
                                else
                                {
                                    check = false;
                                }

                            }

                        }

                        if(check == true)
                        {
                            for(BankCard card : bankcard)
                            {
                                if(card instanceof DebitCard)
                                {

                                    //int id = Integer.parseInt(txtDebID.getText());

                                    DebitCard objDebitCard = (DebitCard) card;

                                    if(ids == objDebitCard.getcardID())
                                    {
                                        txtDebAccount.setText(objDebitCard.getBankAccount());
                                        txtDebAccount.setEditable(false);
                                        txtDebName.setText(objDebitCard.getClientName());
                                        txtDebName.setEditable(false);
                                        txtDebIssuer.setText(objDebitCard.getissureBank());
                                        txtDebIssuer.setEditable(false);
                                        txtDebAmount.setText(String.valueOf(objDebitCard.getBalanceAmount()));
                                        txtDebAmount.setEditable(false);
                                    }
                                }
                            }
                        }
                        if(check == false)
                        {
                            JOptionPane.showMessageDialog(null,"Card ID Not Found","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    catch(NumberFormatException ex)
                    {
                        JOptionPane.showMessageDialog(null,"Check All the Data CareFully","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

        btnWithDraw.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    try
                    {
                        for(BankCard card : bankcard)
                        {
                            if(card instanceof DebitCard)
                            {

                                int withdraw = Integer.parseInt(txtWithDraw.getText());
                                int pin = Integer.parseInt(txtDebPin.getText());
                                String day = String.valueOf(boxDebDD.getSelectedItem());
                                String month = String.valueOf(boxDebMM.getSelectedItem());
                                String year = String.valueOf(boxDebYY.getSelectedItem());
                                String date = String.valueOf(day+"/"+month+"/"+year);

                                DebitCard objDebitCard = (DebitCard) card;
                                if(txtDebID.getText().equals(String.valueOf(objDebitCard.getcardID())))
                                {
                                    if(txtDebPin.getText().equals(String.valueOf(objDebitCard.getPinNumber())))
                                    {
                                        if(Integer.parseInt(txtWithDraw.getText()) < 0)
                                        {
                                            JOptionPane.showMessageDialog(null,"Amount cannot be Negative!","Error",JOptionPane.ERROR_MESSAGE);
                                        }
                                        else
                                        {
                                            if(Integer.parseInt(txtWithDraw.getText())<= objDebitCard.getBalanceAmount())
                                            {
                                                //objDebitCard.setWithdrawalAmount(withdraw);
                                                objDebitCard.withdraw(withdraw,date,pin);
                                                //objDebitCard.setBalanceAmount(objDebitCard.getBalanceAmount() - objDebitCard.getWithdrawalAmount());
                                                JOptionPane.showMessageDialog(null,"Card ID:"+objDebitCard.getcardID()+"\n"+"Bank Account:" +objDebitCard.getBankAccount()+"\n"+
                                                    "Client Name:"+objDebitCard.getClientName()+"\n"+ "Issuer Bank:"+objDebitCard.getissureBank()+"\n"+"Pin:"+objDebitCard.getPinNumber()+"\n"+
                                                    "Balance Amount:"+objDebitCard.getBalanceAmount()+"\n"+"WithDrawal Amount:"+objDebitCard.getWithdrawalAmount()+"\n"+"Date Of WithDrawal:"+objDebitCard.getDateOfWithdrawal()
                                                    +"\n"+"Amount WithDrawed","Message",JOptionPane.INFORMATION_MESSAGE);

                                            }
                                            else
                                            {
                                                JOptionPane.showMessageDialog(null,"Insufficent Balance","Error",JOptionPane.ERROR_MESSAGE);
                                            }
                                        }
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(null,"Incorrect Pin!","Error",JOptionPane.ERROR_MESSAGE);
                                    }
                                }

                            }
                        }
                    }
                    catch(NumberFormatException ex)
                    {
                        JOptionPane.showMessageDialog(null,"Check Data CareFully","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

        btnDebDisplay.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    fDisplay.setVisible(true);
                    StringBuilder builder = new StringBuilder();
                    for(BankCard card : bankcard)
                    {
                        if(card instanceof DebitCard)
                        {
                            DebitCard objDebitCard = (DebitCard) card;
                            builder.append("Card ID:" +objDebitCard.getcardID() +"\n");
                            builder.append("Bank Account:" +objDebitCard.getBankAccount() +"\n");
                            builder.append("Client Name:" +objDebitCard.getClientName() +"\n");
                            builder.append("Balance Amount:"+objDebitCard.getBalanceAmount() +"\n");
                            builder.append("Issuer Bank:" +objDebitCard.getissureBank() +"\n");
                            builder.append("Pin:" +objDebitCard.getPinNumber() +"\n");
                            builder.append("WithDrawal Amount:" +objDebitCard.getWithdrawalAmount() +"\n");
                            builder.append("Date of WithDrawal:" +objDebitCard.getDateOfWithdrawal() +"\n");
                            builder.append("Has WithDrawan:" +objDebitCard.getHasWithdrawn() +"\n");
                            builder.append("---------------------------------------------------" +"\n");
                        }
                    }
                    if(builder.toString().isEmpty())
                    {
                        textArea.setText("No Data Found");
                    }
                    else
                    {
                        textArea.setText(builder.toString());
                    }
                }
            });

        btnCreGo.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    boolean check = true;
                    for(BankCard cards : bankcard)
                    {
                        if(cards instanceof BankCard)
                        {
                            BankCard bankcard = (BankCard) cards;
                            if(txtCreID.getText().equals(String.valueOf(bankcard.getcardID())))
                            {
                                check = true;
                                break;
                            }
                            else
                            {
                                check = false;
                            }
                        }
                    }

                    if(check == true)
                    {
                        for(BankCard card : bankcard)
                        {
                            if(card instanceof BankCard)
                            {
                                BankCard objBankCard = (BankCard) card;
                                if(Integer.parseInt(txtCreID.getText()) == objBankCard.getcardID())
                                {
                                    txtCreAccount.setText(objBankCard.getBankAccount());
                                    txtCreAccount.setEditable(false);
                                    txtCreName.setText(objBankCard.getClientName());
                                    txtCreName.setEditable(false);
                                    txtCreIssuer.setText(objBankCard.getissureBank());
                                    txtCreIssuer.setEditable(false);
                                    txtCreAmount.setText(String.valueOf(objBankCard.getBalanceAmount()));
                                    txtCreAmount.setEditable(false);
                                }
                            }
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Card ID Not Found","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

        btnCreAdd.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    try{
                        int id = Integer.parseInt(txtCreID.getText());
                        String account = txtCreAccount.getText();
                        String name = txtCreName.getText();
                        double balance = Double.parseDouble(txtCreAmount.getText());
                        String bank = txtCreIssuer.getText();
                        int cvc = Integer.parseInt(txtCvc.getText());
                        double rate = Double.parseDouble(txtInterest.getText());
                        String day = String.valueOf(boxCreDD.getSelectedItem());
                        String month = String.valueOf(boxCreMM.getSelectedItem());
                        String year = String.valueOf(boxCreYY.getSelectedItem());
                        String date = String.valueOf(day+"/"+month+"/"+year); 

                        CreditCard objCreditCard = new CreditCard(id,name,bank,account,balance,cvc, rate,date);
                        bankcard.add(objCreditCard);
                        JOptionPane.showMessageDialog(null,"CreditCard Added","Message",JOptionPane.INFORMATION_MESSAGE);
                    }
                    catch(NumberFormatException ex)
                    {
                        JOptionPane.showMessageDialog(null,"Check Data Carefully!","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

        btnSet.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    for(BankCard card: bankcard)
                    {
                        if(card instanceof CreditCard)
                        {
                            try{
                                CreditCard objCreditCard = (CreditCard) card;
                                double limit = Double.parseDouble(txtLimit.getText());
                                int grace = Integer.parseInt(txtGrace.getText());
                                if(txtCreID.getText().equals(String.valueOf(objCreditCard.getcardID())))
                                {
                                    if(objCreditCard.getIsGranted() == false)
                                    {
                                        if(Double.parseDouble(txtLimit.getText()) <= 2.5 * objCreditCard.getBalanceAmount())
                                        {
                                            objCreditCard.setCreditLimit(limit,grace);
                                            JOptionPane.showMessageDialog(null,"Card ID:"+objCreditCard.getcardID()+"\n"+"Credit Limit:"+objCreditCard.getCreditLimit()+"\n"
                                                +"Grace Period:"+objCreditCard.getGracePeriod()+"\n"+"Credit Issued","Message",JOptionPane.INFORMATION_MESSAGE);
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(null,"Credit cannot be Issued","Error",JOptionPane.ERROR_MESSAGE);
                                        }
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(null,"Credit Already taken","Error",JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            }
                            catch(NumberFormatException ex)
                            {
                                JOptionPane.showMessageDialog(null,"Check Data CareFully","Error",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            });

        btnCancel.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    String x =JOptionPane.showInputDialog(null,"Enter your pin","Question",JOptionPane.QUESTION_MESSAGE);
                    for(BankCard card : bankcard)
                    {
                        if(card instanceof CreditCard)
                        {
                            CreditCard objCreditCard = (CreditCard) card;
                            if(txtCreID.getText().equals(String.valueOf(objCreditCard.getcardID())))
                            {
                                if(x.equals(txtCrePin.getText()))
                                {
                                    if(objCreditCard.getIsGranted() == true)
                                    {
                                        objCreditCard.cancelCreditCard();
                                        JOptionPane.showMessageDialog(null,"Credit Cancelled","Message",JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(null,"Credit Not Taken Yet!","Error",JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null,"Pin Incorrect","Error",JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                    }
                }
            });

        btnCreDisplay.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    fDisplay.setVisible(true);
                    StringBuilder builder = new StringBuilder();
                    for(BankCard card : bankcard)
                    {
                        if(card instanceof CreditCard)
                        {
                            CreditCard objCreditCard = (CreditCard) card;
                            builder.append("Card ID:" +objCreditCard.getcardID() +"\n");
                            builder.append("Bank Account:" +objCreditCard.getBankAccount() +"\n");
                            builder.append("Client Name:" +objCreditCard.getClientName() +"\n");
                            builder.append("Balance Amount:"+objCreditCard.getBalanceAmount() +"\n");
                            builder.append("Issuer Bank:" +objCreditCard.getissureBank() +"\n");
                            builder.append("CVC Number:" +objCreditCard.getCVC_Number() +"\n");
                            builder.append("Grace Period:" +objCreditCard.getGracePeriod() +"\n");
                            builder.append("Credit Limit:" +objCreditCard.getCreditLimit()+ "\n");
                            builder.append("Interest Rate:" +objCreditCard.getInterestRate() +"\n");
                            builder.append("Expiration Date:" +objCreditCard.getExpirationDate() +"\n");
                            builder.append("---------------------------------------------------" +"\n");
                        }
                    }
                    if(builder.toString().isEmpty())
                    {
                        textArea.setText("No Data Found");
                    }
                    else
                    {
                        textArea.setText(builder.toString());
                    }
                }
            });
    }

    public static void main(String []args)
    {
        new BankGUI();
    }
}