
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


/*
Carson may 19th
fixed errors
 */
public class Room extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Room frame = new Room();
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
	public Room() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblA = new JLabel("A1");
		lblA.setBounds(10, 11, 40, 40);
		contentPane.add(lblA);
		
		JLabel lblA_1 = new JLabel("A2");
		lblA_1.setBounds(40, 11, 40, 40);
		contentPane.add(lblA_1);
		
		JLabel lblA_2 = new JLabel("A3");
		lblA_2.setBounds(70, 11, 40, 40);
		contentPane.add(lblA_2);
		
		JLabel lblA_3 = new JLabel("A4");
		lblA_3.setBounds(100, 11, 40, 40);
		contentPane.add(lblA_3);
		
		JLabel lblA_4 = new JLabel("A5");
		lblA_4.setBounds(130, 11, 40, 40);
		contentPane.add(lblA_4);
		
		JLabel lblA_5 = new JLabel("A6");
		lblA_5.setBounds(160, 11, 40, 40);
		contentPane.add(lblA_5);
		
		JLabel lblA_6 = new JLabel("A7");
		lblA_6.setBounds(190, 11, 40, 40);
		contentPane.add(lblA_6);
		
		JLabel lblA_7 = new JLabel("A8");
		lblA_7.setBounds(220, 11, 40, 40);
		contentPane.add(lblA_7);
		
		JLabel lblA_8 = new JLabel("A9");
		lblA_8.setBounds(250, 11, 40, 40);
		contentPane.add(lblA_8);
		
		JLabel lblA_9 = new JLabel("A10");
		lblA_9.setBounds(280, 11, 40, 40);
		contentPane.add(lblA_9);
		
		JLabel lblA_10 = new JLabel("A11");
		lblA_10.setBounds(310, 11, 40, 40);
		contentPane.add(lblA_10);
		
		JLabel lblA_11 = new JLabel("A12");
		lblA_11.setBounds(340, 11, 40, 40);
		contentPane.add(lblA_11);
		
		JLabel lblA_12 = new JLabel("A13");
		lblA_12.setBounds(370, 11, 40, 40);
		contentPane.add(lblA_12);
		
		JLabel lblA_13 = new JLabel("A14");
		lblA_13.setBounds(400, 11, 40, 40);
		contentPane.add(lblA_13);
		
		JLabel lblA_14 = new JLabel("A15");
		lblA_14.setBounds(430, 11, 40, 40);
		contentPane.add(lblA_14);
		
		JLabel lblA_15 = new JLabel("A16");
		lblA_15.setBounds(460, 11, 40, 40);
		contentPane.add(lblA_15);
		
		JLabel lblA_16 = new JLabel("A17");
		lblA_16.setBounds(490, 11, 40, 40);
		contentPane.add(lblA_16);
		
		JLabel lblA_17 = new JLabel("A18");
		lblA_17.setBounds(520, 11, 40, 40);
		contentPane.add(lblA_17);
		
		JLabel lblA_18 = new JLabel("A19");
		lblA_18.setBounds(550, 11, 40, 40);
		contentPane.add(lblA_18);
		
		JLabel lblA_19 = new JLabel("A20");
		lblA_19.setBounds(580, 11, 40, 40);
		contentPane.add(lblA_19);
 
		JLabel lblB = new JLabel("I1");
		lblB.setBounds(10, 31, 40, 40);
		contentPane.add(lblB);
		
		JLabel lblB_1 = new JLabel("I2");
		lblB_1.setBounds(40, 31, 40, 40);
		contentPane.add(lblB_1);
		
		JLabel lblB_2 = new JLabel("I3");
		lblB_2.setBounds(70, 31, 40, 40);
		contentPane.add(lblB_2);
		
		JLabel lblB_3 = new JLabel("I4");
		lblB_3.setBounds(100, 31, 40, 40);
		contentPane.add(lblB_3);
		
		JLabel lblB_4 = new JLabel("I5");
		lblB_4.setBounds(130, 31, 40, 40);
		contentPane.add(lblB_4);
		
		JLabel lblB_5 = new JLabel("I6");
		lblB_5.setBounds(160, 31, 40, 40);
		contentPane.add(lblB_5);
		
		JLabel lblB_6 = new JLabel("I7");
		lblB_6.setBounds(190, 31, 40, 40);
		contentPane.add(lblB_6);
		
		JLabel lblB_7 = new JLabel("I8");
		lblB_7.setBounds(220, 31, 40, 40);
		contentPane.add(lblB_7);
		
		JLabel lblB_8 = new JLabel("I9");
		lblB_8.setBounds(250, 31, 40, 40);
		contentPane.add(lblB_8);
		
		JLabel lblB_9 = new JLabel("I10");
		lblB_9.setBounds(280, 31, 40, 40);
		contentPane.add(lblB_9);
		
		JLabel lblB_10 = new JLabel("I11");
		lblB_10.setBounds(310, 31, 40, 40);
		contentPane.add(lblB_10);
		
		JLabel lblB_11 = new JLabel("I12");
		lblB_11.setBounds(340, 31, 40, 40);
		contentPane.add(lblB_11);
		
		JLabel lblB_12 = new JLabel("I13");
		lblB_12.setBounds(370, 31, 40, 40);
		contentPane.add(lblB_12);
		
		JLabel lblB_13 = new JLabel("I14");
		lblB_13.setBounds(400, 31, 40, 40);
		contentPane.add(lblB_13);
		
		JLabel lblB_14 = new JLabel("I15");
		lblB_14.setBounds(430, 31, 40, 40);
		contentPane.add(lblB_14);
		
		JLabel lblB_15 = new JLabel("I16");
		lblB_15.setBounds(460, 31, 40, 40);
		contentPane.add(lblB_15);
		
		JLabel lblB_16 = new JLabel("I17");
		lblB_16.setBounds(490, 31, 40, 40);
		contentPane.add(lblB_16);
		
		JLabel lblB_17 = new JLabel("I18");
		lblB_17.setBounds(520, 31, 40, 40);
		contentPane.add(lblB_17);
		
		JLabel lblB_18 = new JLabel("I19");
		lblB_18.setBounds(550, 31, 40, 40);
		contentPane.add(lblB_18);
		
		JLabel lblB_19 = new JLabel("I20");
		lblB_19.setBounds(580, 31, 40, 40);
		contentPane.add(lblB_19);
		
		JLabel lblC = new JLabel("I1");
		lblC.setBounds(10, 51, 40, 40);
		contentPane.add(lblC);
		
		JLabel lblC_1 = new JLabel("I2");
		lblC_1.setBounds(40, 51, 40, 40);
		contentPane.add(lblC_1);
		
		JLabel lblC_2 = new JLabel("I3");
		lblC_2.setBounds(70, 51, 40, 40);
		contentPane.add(lblC_2);
		
		JLabel lblC_3 = new JLabel("I4");
		lblC_3.setBounds(100, 51, 40, 40);
		contentPane.add(lblC_3);
		
		JLabel lblC_4 = new JLabel("I5");
		lblC_4.setBounds(130, 51, 40, 40);
		contentPane.add(lblC_4);
		
		JLabel lblC_5 = new JLabel("I6");
		lblC_5.setBounds(160, 51, 40, 40);
		contentPane.add(lblC_5);
		
		JLabel lblC_6 = new JLabel("I7");
		lblC_6.setBounds(190, 51, 40, 40);
		contentPane.add(lblC_6);
		
		JLabel lblC_7 = new JLabel("I8");
		lblC_7.setBounds(220, 51, 40, 40);
		contentPane.add(lblC_7);
		
		JLabel lblC_8 = new JLabel("I9");
		lblC_8.setBounds(250, 51, 40, 40);
		contentPane.add(lblC_8);
		
		JLabel lblC_9 = new JLabel("I10");
		lblC_9.setBounds(280, 51, 40, 40);
		contentPane.add(lblC_9);
		
		JLabel lblC_10 = new JLabel("I11");
		lblC_10.setBounds(310, 51, 40, 40);
		contentPane.add(lblC_10);
		
		JLabel lblC_11 = new JLabel("I12");
		lblC_11.setBounds(340, 51, 40, 40);
		contentPane.add(lblC_11);
		
		JLabel lblC_12 = new JLabel("I13");
		lblC_12.setBounds(370, 51, 40, 40);
		contentPane.add(lblC_12);
		
		JLabel lblC_13 = new JLabel("I14");
		lblC_13.setBounds(400, 51, 40, 40);
		contentPane.add(lblC_13);
		
		JLabel lblC_14 = new JLabel("I15");
		lblC_14.setBounds(430, 51, 40, 40);
		contentPane.add(lblC_14);
		
		JLabel lblC_15 = new JLabel("I16");
		lblC_15.setBounds(460, 51, 40, 40);
		contentPane.add(lblC_15);
		
		JLabel lblC_16 = new JLabel("I17");
		lblC_16.setBounds(490, 51, 40, 40);
		contentPane.add(lblC_16);
		
		JLabel lblC_17 = new JLabel("I18");
		lblC_17.setBounds(520, 51, 40, 40);
		contentPane.add(lblC_17);
		
		JLabel lblC_18 = new JLabel("I19");
		lblC_18.setBounds(550, 51, 40, 40);
		contentPane.add(lblC_18);
		
		JLabel lblC_19 = new JLabel("I20");
		lblC_19.setBounds(580, 51, 40, 40);
		contentPane.add(lblC_19);
		
		JLabel lblD = new JLabel("D1");
		lblD.setBounds(10, 71, 40, 40);
		contentPane.add(lblD);
		
		JLabel lblD_1 = new JLabel("D2");
		lblD_1.setBounds(40, 71, 40, 40);
		contentPane.add(lblD_1);
		
		JLabel lblD_2 = new JLabel("D3");
		lblD_2.setBounds(70, 71, 40, 40);
		contentPane.add(lblD_2);
		
		JLabel lblD_3 = new JLabel("D4");
		lblD_3.setBounds(100, 71, 40, 40);
		contentPane.add(lblD_3);
		
		JLabel lblD_4 = new JLabel("D5");
		lblD_4.setBounds(130, 71, 40, 40);
		contentPane.add(lblD_4);
		
		JLabel lblD_5 = new JLabel("D6");
		lblD_5.setBounds(160, 71, 40, 40);
		contentPane.add(lblD_5);
		
		JLabel lblD_6 = new JLabel("D7");
		lblD_6.setBounds(190, 71, 40, 40);
		contentPane.add(lblD_6);
		
		JLabel lblD_7 = new JLabel("D8");
		lblD_7.setBounds(220, 71, 40, 40);
		contentPane.add(lblD_7);
		
		JLabel lblD_8 = new JLabel("D9");
		lblD_8.setBounds(250, 71, 40, 40);
		contentPane.add(lblD_8);
		
		JLabel lblD_9 = new JLabel("D10");
		lblD_9.setBounds(280, 71, 40, 40);
		contentPane.add(lblD_9);
		
		JLabel lblD_10 = new JLabel("D11");
		lblD_10.setBounds(310, 71, 40, 40);
		contentPane.add(lblD_10);
		
		JLabel lblD_11 = new JLabel("D12");
		lblD_11.setBounds(340, 71, 40, 40);
		contentPane.add(lblD_11);
		
		JLabel lblD_12 = new JLabel("D13");
		lblD_12.setBounds(370, 71, 40, 40);
		contentPane.add(lblD_12);
		
		JLabel lblD_13 = new JLabel("D14");
		lblD_13.setBounds(400, 71, 40, 40);
		contentPane.add(lblD_13);
		
		JLabel lblD_14 = new JLabel("D15");
		lblD_14.setBounds(430, 71, 40, 40);
		contentPane.add(lblD_14);
		
		JLabel lblD_15 = new JLabel("D16");
		lblD_15.setBounds(460, 71, 40, 40);
		contentPane.add(lblD_15);
		
		JLabel lblD_16 = new JLabel("D17");
		lblD_16.setBounds(490, 71, 40, 40);
		contentPane.add(lblD_16);
		
		JLabel lblD_17 = new JLabel("D18");
		lblD_17.setBounds(520, 71, 40, 40);
		contentPane.add(lblD_17);
		
		JLabel lblD_18 = new JLabel("D19");
		lblD_18.setBounds(550, 71, 40, 40);
		contentPane.add(lblD_18);
		
		JLabel lblD_19 = new JLabel("D20");
		lblD_19.setBounds(580, 71, 40, 40);
		contentPane.add(lblD_19);
		
		JLabel lblE = new JLabel("I1");
		lblE.setBounds(10, 91, 40, 40);
		contentPane.add(lblE);
		
		JLabel lblE_1 = new JLabel("I2");
		lblE_1.setBounds(40, 91, 40, 40);
		contentPane.add(lblE_1);
		
		JLabel lblE_2 = new JLabel("I3");
		lblE_2.setBounds(70, 91, 40, 40);
		contentPane.add(lblE_2);
		
		JLabel lblE_3 = new JLabel("I4");
		lblE_3.setBounds(100, 91, 40, 40);
		contentPane.add(lblE_3);
		
		JLabel lblE_4 = new JLabel("I5");
		lblE_4.setBounds(130, 91, 40, 40);
		contentPane.add(lblE_4);
		
		JLabel lblE_5 = new JLabel("I6");
		lblE_5.setBounds(160, 91, 40, 40);
		contentPane.add(lblE_5);
		
		JLabel lblE_6 = new JLabel("I7");
		lblE_6.setBounds(190, 91, 40, 40);
		contentPane.add(lblE_6);
		
		JLabel lblE_7 = new JLabel("I8");
		lblE_7.setBounds(220, 91, 40, 40);
		contentPane.add(lblE_7);
		
		JLabel lblE_8 = new JLabel("I9");
		lblE_8.setBounds(250, 91, 40, 40);
		contentPane.add(lblE_8);
		
		JLabel lblE_9 = new JLabel("I10");
		lblE_9.setBounds(280, 91, 40, 40);
		contentPane.add(lblE_9);
		
		JLabel lblE_10 = new JLabel("I11");
		lblE_10.setBounds(310, 91, 40, 40);
		contentPane.add(lblE_10);
		
		JLabel lblE_11 = new JLabel("I12");
		lblE_11.setBounds(340, 91, 40, 40);
		contentPane.add(lblE_11);
		
		JLabel lblE_12 = new JLabel("I13");
		lblE_12.setBounds(370, 91, 40, 40);
		contentPane.add(lblE_12);
		
		JLabel lblE_13 = new JLabel("I14");
		lblE_13.setBounds(400, 91, 40, 40);
		contentPane.add(lblE_13);
		
		JLabel lblE_14 = new JLabel("I15");
		lblE_14.setBounds(430, 91, 40, 40);
		contentPane.add(lblE_14);
		
		JLabel lblE_15 = new JLabel("I16");
		lblE_15.setBounds(460, 91, 40, 40);
		contentPane.add(lblE_15);
		
		JLabel lblE_16 = new JLabel("I17");
		lblE_16.setBounds(490, 91, 40, 40);
		contentPane.add(lblE_16);
		
		JLabel lblE_17 = new JLabel("I18");
		lblE_17.setBounds(520, 91, 40, 40);
		contentPane.add(lblE_17);
		
		JLabel lblE_18 = new JLabel("I19");
		lblE_18.setBounds(550, 91, 40, 40);
		contentPane.add(lblE_18);
		
		JLabel lblE_19 = new JLabel("I20");
		lblE_19.setBounds(580, 91, 40, 40);
		contentPane.add(lblE_19);
		
		JLabel lblF = new JLabel("F1");
		lblF.setBounds(10, 111, 40, 40);
		contentPane.add(lblF);
		
		JLabel lblF_1 = new JLabel("F2");
		lblF_1.setBounds(40, 111, 40, 40);
		contentPane.add(lblF_1);
		
		JLabel lblF_2 = new JLabel("F3");
		lblF_2.setBounds(70, 111, 40, 40);
		contentPane.add(lblF_2);
		
		JLabel lblF_3 = new JLabel("F4");
		lblF_3.setBounds(100, 111, 40, 40);
		contentPane.add(lblF_3);
		
		JLabel lblF_4 = new JLabel("F5");
		lblF_4.setBounds(130, 111, 40, 40);
		contentPane.add(lblF_4);
		
		JLabel lblF_5 = new JLabel("F6");
		lblF_5.setBounds(160, 111, 40, 40);
		contentPane.add(lblF_5);
		
		JLabel lblF_6 = new JLabel("F7");
		lblF_6.setBounds(190, 111, 40, 40);
		contentPane.add(lblF_6);
		
		JLabel lblF_7 = new JLabel("F8");
		lblF_7.setBounds(220, 111, 40, 40);
		contentPane.add(lblF_7);
		
		JLabel lblF_8 = new JLabel("F9");
		lblF_8.setBounds(250, 111, 40, 40);
		contentPane.add(lblF_8);
		
		JLabel lblF_9 = new JLabel("F10");
		lblF_9.setBounds(280, 111, 40, 40);
		contentPane.add(lblF_9);
		
		JLabel lblF_10 = new JLabel("F11");
		lblF_10.setBounds(310, 111, 40, 40);
		contentPane.add(lblF_10);
		
		JLabel lblF_11 = new JLabel("F12");
		lblF_11.setBounds(340, 111, 40, 40);
		contentPane.add(lblF_11);
		
		JLabel lblF_12 = new JLabel("F13");
		lblF_12.setBounds(370, 111, 40, 40);
		contentPane.add(lblF_12);
		
		JLabel lblF_13 = new JLabel("F14");
		lblF_13.setBounds(400, 111, 40, 40);
		contentPane.add(lblF_13);
		
		JLabel lblF_14 = new JLabel("F15");
		lblF_14.setBounds(430, 111, 40, 40);
		contentPane.add(lblF_14);
		
		JLabel lblF_15 = new JLabel("F16");
		lblF_15.setBounds(460, 111, 40, 40);
		contentPane.add(lblF_15);
		
		JLabel lblF_16 = new JLabel("F17");
		lblF_16.setBounds(490, 111, 40, 40);
		contentPane.add(lblF_16);
		
		JLabel lblF_17 = new JLabel("F18");
		lblF_17.setBounds(520, 111, 40, 40);
		contentPane.add(lblF_17);
		
		JLabel lblF_18 = new JLabel("F19");
		lblF_18.setBounds(550, 111, 40, 40);
		contentPane.add(lblF_18);
		
		JLabel lblF_19 = new JLabel("F20");
		lblF_19.setBounds(580, 111, 40, 40);
		contentPane.add(lblF_19);
		
		JLabel lblG = new JLabel("G1");
		lblG.setBounds(10, 131, 40, 40);
		contentPane.add(lblG);
		
		JLabel lblG_1 = new JLabel("G2");
		lblG_1.setBounds(40, 131, 40, 40);
		contentPane.add(lblG_1);
		
		JLabel lblG_2 = new JLabel("G3");
		lblG_2.setBounds(70, 131, 40, 40);
		contentPane.add(lblG_2);
		
		JLabel lblG_3 = new JLabel("G4");
		lblG_3.setBounds(100, 131, 40, 40);
		contentPane.add(lblG_3);
		
		JLabel lblG_4 = new JLabel("G5");
		lblG_4.setBounds(130, 131, 40, 40);
		contentPane.add(lblG_4);
		
		JLabel lblG_5 = new JLabel("G6");
		lblG_5.setBounds(160, 131, 40, 40);
		contentPane.add(lblG_5);
		
		JLabel lblG_6 = new JLabel("G7");
		lblG_6.setBounds(190, 131, 40, 40);
		contentPane.add(lblG_6);
		
		JLabel lblG_7 = new JLabel("G8");
		lblG_7.setBounds(220, 131, 40, 40);
		contentPane.add(lblG_7);
		
		JLabel lblG_8 = new JLabel("G9");
		lblG_8.setBounds(250, 131, 40, 40);
		contentPane.add(lblG_8);
		
		JLabel lblG_9 = new JLabel("G10");
		lblG_9.setBounds(280, 131, 40, 40);
		contentPane.add(lblG_9);
		
		JLabel lblG_10 = new JLabel("G11");
		lblG_10.setBounds(310, 131, 40, 40);
		contentPane.add(lblG_10);
		
		JLabel lblG_11 = new JLabel("G12");
		lblG_11.setBounds(340, 131, 40, 40);
		contentPane.add(lblG_11);
		
		JLabel lblG_12 = new JLabel("G13");
		lblG_12.setBounds(370, 131, 40, 40);
		contentPane.add(lblG_12);
		
		JLabel lblG_13 = new JLabel("G14");
		lblG_13.setBounds(400, 131, 40, 40);
		contentPane.add(lblG_13);
		
		JLabel lblG_14 = new JLabel("G15");
		lblG_14.setBounds(430, 131, 40, 40);
		contentPane.add(lblG_14);
		
		JLabel lblG_15 = new JLabel("G16");
		lblG_15.setBounds(460, 131, 40, 40);
		contentPane.add(lblG_15);
		
		JLabel lblG_16 = new JLabel("G17");
		lblG_16.setBounds(490, 131, 40, 40);
		contentPane.add(lblG_16);
		
		JLabel lblG_17 = new JLabel("G18");
		lblG_17.setBounds(520, 131, 40, 40);
		contentPane.add(lblG_17);
		
		JLabel lblG_18 = new JLabel("G19");
		lblG_18.setBounds(550, 131, 40, 40);
		contentPane.add(lblG_18);
		
		JLabel lblG_19 = new JLabel("G20");
		lblG_19.setBounds(580, 131, 40, 40);
		contentPane.add(lblG_19);
		
		JLabel lblH = new JLabel("H1");
		lblH.setBounds(10, 151, 40, 40);
		contentPane.add(lblH);
		
		JLabel lblH_1 = new JLabel("H2");
		lblH_1.setBounds(40, 151, 40, 40);
		contentPane.add(lblH_1);
		
		JLabel lblH_2 = new JLabel("H3");
		lblH_2.setBounds(70, 151, 40, 40);
		contentPane.add(lblH_2);
		
		JLabel lblH_3 = new JLabel("H4");
		lblH_3.setBounds(100, 151, 40, 40);
		contentPane.add(lblH_3);
		
		JLabel lblH_4 = new JLabel("H5");
		lblH_4.setBounds(130, 151, 40, 40);
		contentPane.add(lblH_4);
		
		JLabel lblH_5 = new JLabel("H6");
		lblH_5.setBounds(160, 151, 40, 40);
		contentPane.add(lblH_5);
		
		JLabel lblH_6 = new JLabel("H7");
		lblH_6.setBounds(190, 151, 40, 40);
		contentPane.add(lblH_6);
		
		JLabel lblH_7 = new JLabel("H8");
		lblH_7.setBounds(220, 151, 40, 40);
		contentPane.add(lblH_7);
		
		JLabel lblH_8 = new JLabel("H9");
		lblH_8.setBounds(250, 151, 40, 40);
		contentPane.add(lblH_8);
		
		JLabel lblH_9 = new JLabel("H10");
		lblH_9.setBounds(280, 151, 40, 40);
		contentPane.add(lblH_9);
		
		JLabel lblH_10 = new JLabel("H11");
		lblH_10.setBounds(310, 151, 40, 40);
		contentPane.add(lblH_10);
		
		JLabel lblH_11 = new JLabel("H12");
		lblH_11.setBounds(340, 151, 40, 40);
		contentPane.add(lblH_11);
		
		JLabel lblH_12 = new JLabel("H13");
		lblH_12.setBounds(370, 151, 40, 40);
		contentPane.add(lblH_12);
		
		JLabel lblH_13 = new JLabel("H14");
		lblH_13.setBounds(400, 151, 40, 40);
		contentPane.add(lblH_13);
		
		JLabel lblH_14 = new JLabel("H15");
		lblH_14.setBounds(430, 151, 40, 40);
		contentPane.add(lblH_14);
		
		JLabel lblH_15 = new JLabel("H16");
		lblH_15.setBounds(460, 151, 40, 40);
		contentPane.add(lblH_15);
		
		JLabel lblH_16 = new JLabel("H17");
		lblH_16.setBounds(490, 151, 40, 40);
		contentPane.add(lblH_16);
		
		JLabel lblH_17 = new JLabel("H18");
		lblH_17.setBounds(520, 151, 40, 40);
		contentPane.add(lblH_17);
		
		JLabel lblH_18 = new JLabel("H19");
		lblH_18.setBounds(550, 151, 40, 40);
		contentPane.add(lblH_18);
		
		JLabel lblH_19 = new JLabel("H20");
		lblH_19.setBounds(580, 151, 40, 40);
		contentPane.add(lblH_19);
		
		JLabel lblI = new JLabel("I1");
		lblI.setBounds(10, 171, 40, 40);
		contentPane.add(lblI);
		
		JLabel lblI_1 = new JLabel("I2");
		lblI_1.setBounds(40, 171, 40, 40);
		contentPane.add(lblI_1);
		
		JLabel lblI_2 = new JLabel("I3");
		lblI_2.setBounds(70, 171, 40, 40);
		contentPane.add(lblI_2);
		
		JLabel lblI_3 = new JLabel("I4");
		lblI_3.setBounds(100, 171, 40, 40);
		contentPane.add(lblI_3);
		
		JLabel lblI_4 = new JLabel("I5");
		lblI_4.setBounds(130, 171, 40, 40);
		contentPane.add(lblI_4);
		
		JLabel lblI_5 = new JLabel("I6");
		lblI_5.setBounds(160, 171, 40, 40);
		contentPane.add(lblI_5);
		
		JLabel lblI_6 = new JLabel("I7");
		lblI_6.setBounds(190, 171, 40, 40);
		contentPane.add(lblI_6);
		
		JLabel lblI_7 = new JLabel("I8");
		lblI_7.setBounds(220, 171, 40, 40);
		contentPane.add(lblI_7);
		
		JLabel lblI_8 = new JLabel("I9");
		lblI_8.setBounds(250, 171, 40, 40);
		contentPane.add(lblI_8);
		
		JLabel lblI_9 = new JLabel("I10");
		lblI_9.setBounds(280, 171, 40, 40);
		contentPane.add(lblI_9);
		
		JLabel lblI_10 = new JLabel("I11");
		lblI_10.setBounds(310, 171, 40, 40);
		contentPane.add(lblI_10);
		
		JLabel lblI_11 = new JLabel("I12");
		lblI_11.setBounds(340, 171, 40, 40);
		contentPane.add(lblI_11);
		
		JLabel lblI_12 = new JLabel("I13");
		lblI_12.setBounds(370, 171, 40, 40);
		contentPane.add(lblI_12);
		
		JLabel lblI_13 = new JLabel("I14");
		lblI_13.setBounds(400, 171, 40, 40);
		contentPane.add(lblI_13);
		
		JLabel lblI_14 = new JLabel("I15");
		lblI_14.setBounds(430, 171, 40, 40);
		contentPane.add(lblI_14);
		
		JLabel lblI_15 = new JLabel("I16");
		lblI_15.setBounds(460, 171, 40, 40);
		contentPane.add(lblI_15);
		
		JLabel lblI_16 = new JLabel("I17");
		lblI_16.setBounds(490, 171, 40, 40);
		contentPane.add(lblI_16);
		
		JLabel lblI_17 = new JLabel("I18");
		lblI_17.setBounds(520, 171, 40, 40);
		contentPane.add(lblI_17);
		
		JLabel lblI_18 = new JLabel("I19");
		lblI_18.setBounds(550, 171, 40, 40);
		contentPane.add(lblI_18);
		
		JLabel lblI_19 = new JLabel("I20");
		lblI_19.setBounds(580, 171, 40, 40);
		contentPane.add(lblI_19);
		
		JLabel lblJ = new JLabel("J1");
		lblJ.setBounds(10, 191, 40, 40);
		contentPane.add(lblJ);
		
		JLabel lblJ_1 = new JLabel("J2");
		lblJ_1.setBounds(40, 191, 40, 40);
		contentPane.add(lblJ_1);
		
		JLabel lblJ_2 = new JLabel("J3");
		lblJ_2.setBounds(70, 191, 40, 40);
		contentPane.add(lblJ_2);
		
		JLabel lblJ_3 = new JLabel("J4");
		lblJ_3.setBounds(100, 191, 40, 40);
		contentPane.add(lblJ_3);
		
		JLabel lblJ_4 = new JLabel("J5");
		lblJ_4.setBounds(130, 191, 40, 40);
		contentPane.add(lblJ_4);
		
		JLabel lblJ_5 = new JLabel("J6");
		lblJ_5.setBounds(160, 191, 40, 40);
		contentPane.add(lblJ_5);
		
		JLabel lblJ_6 = new JLabel("J7");
		lblJ_6.setBounds(190, 191, 40, 40);
		contentPane.add(lblJ_6);
		
		JLabel lblJ_7 = new JLabel("J8");
		lblJ_7.setBounds(220, 191, 40, 40);
		contentPane.add(lblJ_7);
		
		JLabel lblJ_8 = new JLabel("J9");
		lblJ_8.setBounds(250, 191, 40, 40);
		contentPane.add(lblJ_8);
		
		JLabel lblJ_9 = new JLabel("J10");
		lblJ_9.setBounds(280, 191, 40, 40);
		contentPane.add(lblJ_9);
		
		JLabel lblJ_10 = new JLabel("J11");
		lblJ_10.setBounds(310, 191, 40, 40);
		contentPane.add(lblJ_10);
		
		JLabel lblJ_11 = new JLabel("J12");
		lblJ_11.setBounds(340, 191, 40, 40);
		contentPane.add(lblJ_11);
		
		JLabel lblJ_12 = new JLabel("J13");
		lblJ_12.setBounds(370, 191, 40, 40);
		contentPane.add(lblJ_12);
		
		JLabel lblJ_13 = new JLabel("J14");
		lblJ_13.setBounds(400, 191, 40, 40);
		contentPane.add(lblJ_13);
		
		JLabel lblJ_14 = new JLabel("J15");
		lblJ_14.setBounds(430, 191, 40, 40);
		contentPane.add(lblJ_14);
		
		JLabel lblJ_15 = new JLabel("J16");
		lblJ_15.setBounds(460, 191, 40, 40);
		contentPane.add(lblJ_15);
		
		JLabel lblJ_16 = new JLabel("J17");
		lblJ_16.setBounds(490, 191, 40, 40);
		contentPane.add(lblJ_16);
		
		JLabel lblJ_17 = new JLabel("J18");
		lblJ_17.setBounds(520, 191, 40, 40);
		contentPane.add(lblJ_17);
		
		JLabel lblJ_18 = new JLabel("J19");
		lblJ_18.setBounds(550, 191, 40, 40);
		contentPane.add(lblJ_18);
		
		JLabel lblJ_19 = new JLabel("J20");
		lblJ_19.setBounds(580, 191, 40, 40);
		contentPane.add(lblJ_19);
		JLabel lblK = new JLabel("K1");
		lblK.setBounds(10, 211, 40, 40);
		contentPane.add(lblK);
		
		JLabel lblK_1 = new JLabel("K2");
		lblK_1.setBounds(40, 211, 40, 40);
		contentPane.add(lblK_1);
		
		JLabel lblK_2 = new JLabel("K3");
		lblK_2.setBounds(70, 211, 40, 40);
		contentPane.add(lblK_2);
		
		JLabel lblK_3 = new JLabel("K4");
		lblK_3.setBounds(100, 211, 40, 40);
		contentPane.add(lblK_3);
		
		JLabel lblK_4 = new JLabel("K5");
		lblK_4.setBounds(130, 211, 40, 40);
		contentPane.add(lblK_4);
		
		JLabel lblK_5 = new JLabel("K6");
		lblK_5.setBounds(160, 211, 40, 40);
		contentPane.add(lblK_5);
		
		JLabel lblK_6 = new JLabel("K7");
		lblK_6.setBounds(190, 211, 40, 40);
		contentPane.add(lblK_6);
		
		JLabel lblK_7 = new JLabel("K8");
		lblK_7.setBounds(220, 211, 40, 40);
		contentPane.add(lblK_7);
		
		JLabel lblK_8 = new JLabel("K9");
		lblK_8.setBounds(250, 211, 40, 40);
		contentPane.add(lblK_8);
		
		JLabel lblK_9 = new JLabel("K10");
		lblK_9.setBounds(280, 211, 40, 40);
		contentPane.add(lblK_9);
		
		JLabel lblK_10 = new JLabel("K11");
		lblK_10.setBounds(310, 211, 40, 40);
		contentPane.add(lblK_10);
		
		JLabel lblK_11 = new JLabel("K12");
		lblK_11.setBounds(340, 211, 40, 40);
		contentPane.add(lblK_11);
		
		JLabel lblK_12 = new JLabel("K13");
		lblK_12.setBounds(370, 211, 40, 40);
		contentPane.add(lblK_12);
		
		JLabel lblK_13 = new JLabel("K14");
		lblK_13.setBounds(400, 211, 40, 40);
		contentPane.add(lblK_13);
		
		JLabel lblK_14 = new JLabel("K15");
		lblK_14.setBounds(430, 211, 40, 40);
		contentPane.add(lblK_14);
		
		JLabel lblK_15 = new JLabel("K16");
		lblK_15.setBounds(460, 211, 40, 40);
		contentPane.add(lblK_15);
		
		JLabel lblK_16 = new JLabel("K17");
		lblK_16.setBounds(490, 211, 40, 40);
		contentPane.add(lblK_16);
		
		JLabel lblK_17 = new JLabel("K18");
		lblK_17.setBounds(520, 211, 40, 40);
		contentPane.add(lblK_17);
		
		JLabel lblK_18 = new JLabel("K19");
		lblK_18.setBounds(550, 211, 40, 40);
		contentPane.add(lblK_18);
		
		JLabel lblK_19 = new JLabel("K20");
		lblK_19.setBounds(580, 211, 40, 40);
		contentPane.add(lblK_19);
		
		JLabel lblL = new JLabel("L1");
		lblL.setBounds(10, 231, 40, 40);
		contentPane.add(lblL);
		
		JLabel lblL_1 = new JLabel("L2");
		lblL_1.setBounds(40, 231, 40, 40);
		contentPane.add(lblL_1);
		
		JLabel lblL_2 = new JLabel("L3");
		lblL_2.setBounds(70, 231, 40, 40);
		contentPane.add(lblL_2);
		
		JLabel lblL_3 = new JLabel("L4");
		lblL_3.setBounds(100, 231, 40, 40);
		contentPane.add(lblL_3);
		
		JLabel lblL_4 = new JLabel("L5");
		lblL_4.setBounds(130, 231, 40, 40);
		contentPane.add(lblL_4);
		
		JLabel lblL_5 = new JLabel("L6");
		lblL_5.setBounds(160, 231, 40, 40);
		contentPane.add(lblL_5);
		
		JLabel lblL_6 = new JLabel("L7");
		lblL_6.setBounds(190, 231, 40, 40);
		contentPane.add(lblL_6);
		
		JLabel lblL_7 = new JLabel("L8");
		lblL_7.setBounds(220, 231, 40, 40);
		contentPane.add(lblL_7);
		
		JLabel lblL_8 = new JLabel("L9");
		lblL_8.setBounds(250, 231, 40, 40);
		contentPane.add(lblL_8);
		
		JLabel lblL_9 = new JLabel("L10");
		lblL_9.setBounds(280, 231, 40, 40);
		contentPane.add(lblL_9);
		
		JLabel lblL_10 = new JLabel("L11");
		lblL_10.setBounds(310, 231, 40, 40);
		contentPane.add(lblL_10);
		
		JLabel lblL_11 = new JLabel("L12");
		lblL_11.setBounds(340, 231, 40, 40);
		contentPane.add(lblL_11);
		
		JLabel lblL_12 = new JLabel("L13");
		lblL_12.setBounds(370, 231, 40, 40);
		contentPane.add(lblL_12);
		
		JLabel lblL_13 = new JLabel("L14");
		lblL_13.setBounds(400, 231, 40, 40);
		contentPane.add(lblL_13);
		
		JLabel lblL_14 = new JLabel("L15");
		lblL_14.setBounds(430, 231, 40, 40);
		contentPane.add(lblL_14);
		
		JLabel lblL_15 = new JLabel("L16");
		lblL_15.setBounds(460, 231, 40, 40);
		contentPane.add(lblL_15);
		
		JLabel lblL_16 = new JLabel("L17");
		lblL_16.setBounds(490, 231, 40, 40);
		contentPane.add(lblL_16);
		
		JLabel lblL_17 = new JLabel("L18");
		lblL_17.setBounds(520, 231, 40, 40);
		contentPane.add(lblL_17);
		
		JLabel lblL_18 = new JLabel("L19");
		lblL_18.setBounds(550, 231, 40, 40);
		contentPane.add(lblL_18);
		
		JLabel lblL_19 = new JLabel("L20");
		lblL_19.setBounds(580, 231, 40, 40);
		contentPane.add(lblL_19);
		
		JLabel lblM = new JLabel("M1");
		lblM.setBounds(10, 251, 40, 40);
		contentPane.add(lblM);
		
		JLabel lblM_1 = new JLabel("M2");
		lblM_1.setBounds(40, 251, 40, 40);
		contentPane.add(lblM_1);
		
		JLabel lblM_2 = new JLabel("M3");
		lblM_2.setBounds(70, 251, 40, 40);
		contentPane.add(lblM_2);
		
		JLabel lblM_3 = new JLabel("M4");
		lblM_3.setBounds(100, 251, 40, 40);
		contentPane.add(lblM_3);
		
		JLabel lblM_4 = new JLabel("M5");
		lblM_4.setBounds(130, 251, 40, 40);
		contentPane.add(lblM_4);
		
		JLabel lblM_5 = new JLabel("M6");
		lblM_5.setBounds(160, 251, 40, 40);
		contentPane.add(lblM_5);
		
		JLabel lblM_6 = new JLabel("M7");
		lblM_6.setBounds(190, 251, 40, 40);
		contentPane.add(lblM_6);
		
		JLabel lblM_7 = new JLabel("M8");
		lblM_7.setBounds(220, 251, 40, 40);
		contentPane.add(lblM_7);
		
		JLabel lblM_8 = new JLabel("M9");
		lblM_8.setBounds(250, 251, 40, 40);
		contentPane.add(lblM_8);
		
		JLabel lblM_9 = new JLabel("M10");
		lblM_9.setBounds(280, 251, 40, 40);
		contentPane.add(lblM_9);
		
		JLabel lblM_10 = new JLabel("M11");
		lblM_10.setBounds(310, 251, 40, 40);
		contentPane.add(lblM_10);
		
		JLabel lblM_11 = new JLabel("M12");
		lblM_11.setBounds(340, 251, 40, 40);
		contentPane.add(lblM_11);
		
		JLabel lblM_12 = new JLabel("M13");
		lblM_12.setBounds(370, 251, 40, 40);
		contentPane.add(lblM_12);
		
		JLabel lblM_13 = new JLabel("M14");
		lblM_13.setBounds(400, 251, 40, 40);
		contentPane.add(lblM_13);
		
		JLabel lblM_14 = new JLabel("M15");
		lblM_14.setBounds(430, 251, 40, 40);
		contentPane.add(lblM_14);
		
		JLabel lblM_15 = new JLabel("M16");
		lblM_15.setBounds(460, 251, 40, 40);
		contentPane.add(lblM_15);
		
		JLabel lblM_16 = new JLabel("M17");
		lblM_16.setBounds(490, 251, 40, 40);
		contentPane.add(lblM_16);
		
		JLabel lblM_17 = new JLabel("M18");
		lblM_17.setBounds(520, 251, 40, 40);
		contentPane.add(lblM_17);
		
		JLabel lblM_18 = new JLabel("M19");
		lblM_18.setBounds(550, 251, 40, 40);
		contentPane.add(lblM_18);
		
		JLabel lblM_19 = new JLabel("M20");
		lblM_19.setBounds(580, 251, 40, 40);
		contentPane.add(lblM_19);
		
		JLabel lblN = new JLabel("N1");
		lblN.setBounds(10, 271, 40, 40);
		contentPane.add(lblN);
		
		JLabel lblN_1 = new JLabel("N2");
		lblN_1.setBounds(40, 271, 40, 40);
		contentPane.add(lblN_1);
		
		JLabel lblN_2 = new JLabel("N3");
		lblN_2.setBounds(70, 271, 40, 40);
		contentPane.add(lblN_2);
		
		JLabel lblN_3 = new JLabel("N4");
		lblN_3.setBounds(100, 271, 40, 40);
		contentPane.add(lblN_3);
		
		JLabel lblN_4 = new JLabel("N5");
		lblN_4.setBounds(130, 271, 40, 40);
		contentPane.add(lblN_4);
		
		JLabel lblN_5 = new JLabel("N6");
		lblN_5.setBounds(160, 271, 40, 40);
		contentPane.add(lblN_5);
		
		JLabel lblN_6 = new JLabel("N7");
		lblN_6.setBounds(190, 271, 40, 40);
		contentPane.add(lblN_6);
		
		JLabel lblN_7 = new JLabel("N8");
		lblN_7.setBounds(220, 271, 40, 40);
		contentPane.add(lblN_7);
		
		JLabel lblN_8 = new JLabel("N9");
		lblN_8.setBounds(250, 271, 40, 40);
		contentPane.add(lblN_8);
		
		JLabel lblN_9 = new JLabel("N10");
		lblN_9.setBounds(280, 271, 40, 40);
		contentPane.add(lblN_9);
		
		JLabel lblN_10 = new JLabel("N11");
		lblN_10.setBounds(310, 271, 40, 40);
		contentPane.add(lblN_10);
		
		JLabel lblN_11 = new JLabel("N12");
		lblN_11.setBounds(340, 271, 40, 40);
		contentPane.add(lblN_11);
		
		JLabel lblN_12 = new JLabel("N13");
		lblN_12.setBounds(370, 271, 40, 40);
		contentPane.add(lblN_12);
		
		JLabel lblN_13 = new JLabel("N14");
		lblN_13.setBounds(400, 271, 40, 40);
		contentPane.add(lblN_13);
		
		JLabel lblN_14 = new JLabel("N15");
		lblN_14.setBounds(430, 271, 40, 40);
		contentPane.add(lblN_14);
		
		JLabel lblN_15 = new JLabel("N16");
		lblN_15.setBounds(460, 271, 40, 40);
		contentPane.add(lblN_15);
		
		JLabel lblN_16 = new JLabel("N17");
		lblN_16.setBounds(490, 271, 40, 40);
		contentPane.add(lblN_16);
		
		JLabel lblN_17 = new JLabel("N18");
		lblN_17.setBounds(520, 271, 40, 40);
		contentPane.add(lblN_17);
		
		JLabel lblN_18 = new JLabel("N19");
		lblN_18.setBounds(550, 271, 40, 40);
		contentPane.add(lblN_18);
		
		JLabel lblN_19 = new JLabel("N20");
		lblN_19.setBounds(580, 271, 40, 40);
		contentPane.add(lblN_19);
		
		JLabel lblO = new JLabel("O1");
		lblO.setBounds(10, 291, 40, 40);
		contentPane.add(lblO);
		
		JLabel lblO_1 = new JLabel("O2");
		lblO_1.setBounds(40, 291, 40, 40);
		contentPane.add(lblO_1);
		
		JLabel lblO_2 = new JLabel("O3");
		lblO_2.setBounds(70, 291, 40, 40);
		contentPane.add(lblO_2);
		
		JLabel lblO_3 = new JLabel("O4");
		lblO_3.setBounds(100, 291, 40, 40);
		contentPane.add(lblO_3);
		
		JLabel lblO_4 = new JLabel("O5");
		lblO_4.setBounds(130, 291, 40, 40);
		contentPane.add(lblO_4);
		
		JLabel lblO_5 = new JLabel("O6");
		lblO_5.setBounds(160, 291, 40, 40);
		contentPane.add(lblO_5);
		
		JLabel lblO_6 = new JLabel("O7");
		lblO_6.setBounds(190, 291, 40, 40);
		contentPane.add(lblO_6);
		
		JLabel lblO_7 = new JLabel("O8");
		lblO_7.setBounds(220, 291, 40, 40);
		contentPane.add(lblO_7);
		
		JLabel lblO_8 = new JLabel("O9");
		lblO_8.setBounds(250, 291, 40, 40);
		contentPane.add(lblO_8);
		
		JLabel lblO_9 = new JLabel("O10");
		lblO_9.setBounds(280, 291, 40, 40);
		contentPane.add(lblO_9);
		
		JLabel lblO_10 = new JLabel("O11");
		lblO_10.setBounds(310, 291, 40, 40);
		contentPane.add(lblO_10);
		
		JLabel lblO_11 = new JLabel("O12");
		lblO_11.setBounds(340, 291, 40, 40);
		contentPane.add(lblO_11);
		
		JLabel lblO_12 = new JLabel("O13");
		lblO_12.setBounds(370, 291, 40, 40);
		contentPane.add(lblO_12);
		
		JLabel lblO_13 = new JLabel("O14");
		lblO_13.setBounds(400, 291, 40, 40);
		contentPane.add(lblO_13);
		
		JLabel lblO_14 = new JLabel("O15");
		lblO_14.setBounds(430, 291, 40, 40);
		contentPane.add(lblO_14);
		
		JLabel lblO_15 = new JLabel("O16");
		lblO_15.setBounds(460, 291, 40, 40);
		contentPane.add(lblO_15);
		
		JLabel lblO_16 = new JLabel("O17");
		lblO_16.setBounds(490, 291, 40, 40);
		contentPane.add(lblO_16);
		
		JLabel lblO_17 = new JLabel("O18");
		lblO_17.setBounds(520, 291, 40, 40);
		contentPane.add(lblO_17);
		
		JLabel lblO_18 = new JLabel("O19");
		lblO_18.setBounds(550, 291, 40, 40);
		contentPane.add(lblO_18);
		
		JLabel lblO_19 = new JLabel("O20");
		lblO_19.setBounds(580, 291, 40, 40);
		contentPane.add(lblO_19);
		
		JLabel lblP = new JLabel("P1");
		lblP.setBounds(10, 311, 40, 40);
		contentPane.add(lblP);
		
		JLabel lblP_1 = new JLabel("P2");
		lblP_1.setBounds(40, 311, 40, 40);
		contentPane.add(lblP_1);
		
		JLabel lblP_2 = new JLabel("P3");
		lblP_2.setBounds(70, 311, 40, 40);
		contentPane.add(lblP_2);
		
		JLabel lblP_3 = new JLabel("P4");
		lblP_3.setBounds(100, 311, 40, 40);
		contentPane.add(lblP_3);
		
		JLabel lblP_4 = new JLabel("P5");
		lblP_4.setBounds(130, 311, 40, 40);
		contentPane.add(lblP_4);
		
		JLabel lblP_5 = new JLabel("P6");
		lblP_5.setBounds(160, 311, 40, 40);
		contentPane.add(lblP_5);
		
		JLabel lblP_6 = new JLabel("P7");
		lblP_6.setBounds(190, 311, 40, 40);
		contentPane.add(lblP_6);
		
		JLabel lblP_7 = new JLabel("P8");
		lblP_7.setBounds(220, 311, 40, 40);
		contentPane.add(lblP_7);
		
		JLabel lblP_8 = new JLabel("P9");
		lblP_8.setBounds(250, 311, 40, 40);
		contentPane.add(lblP_8);
		
		JLabel lblP_9 = new JLabel("P10");
		lblP_9.setBounds(280, 311, 40, 40);
		contentPane.add(lblP_9);
		
		JLabel lblP_10 = new JLabel("P11");
		lblP_10.setBounds(310, 311, 40, 40);
		contentPane.add(lblP_10);
		
		JLabel lblP_11 = new JLabel("P12");
		lblP_11.setBounds(340, 311, 40, 40);
		contentPane.add(lblP_11);
		
		JLabel lblP_12 = new JLabel("P13");
		lblP_12.setBounds(370, 311, 40, 40);
		contentPane.add(lblP_12);
		
		JLabel lblP_13 = new JLabel("P14");
		lblP_13.setBounds(400, 311, 40, 40);
		contentPane.add(lblP_13);
		
		JLabel lblP_14 = new JLabel("P15");
		lblP_14.setBounds(430, 311, 40, 40);
		contentPane.add(lblP_14);
		
		JLabel lblP_15 = new JLabel("P16");
		lblP_15.setBounds(460, 311, 40, 40);
		contentPane.add(lblP_15);
		
		JLabel lblP_16 = new JLabel("P17");
		lblP_16.setBounds(490, 311, 40, 40);
		contentPane.add(lblP_16);
		
		JLabel lblP_17 = new JLabel("P18");
		lblP_17.setBounds(520, 311, 40, 40);
		contentPane.add(lblP_17);
		
		JLabel lblP_18 = new JLabel("P19");
		lblP_18.setBounds(550, 311, 40, 40);
		contentPane.add(lblP_18);
		
		JLabel lblP_19 = new JLabel("P20");
		lblP_19.setBounds(580, 311, 40, 40);
		contentPane.add(lblP_19);
		JLabel lblQ = new JLabel("Q1");
		lblQ.setBounds(10, 331, 40, 40);
		contentPane.add(lblQ);
		
		JLabel lblQ_1 = new JLabel("Q2");
		lblQ_1.setBounds(40, 331, 40, 40);
		contentPane.add(lblQ_1);
		
		JLabel lblQ_2 = new JLabel("Q3");
		lblQ_2.setBounds(70, 331, 40, 40);
		contentPane.add(lblQ_2);
		
		JLabel lblQ_3 = new JLabel("Q4");
		lblQ_3.setBounds(100, 331, 40, 40);
		contentPane.add(lblQ_3);
		
		JLabel lblQ_4 = new JLabel("Q5");
		lblQ_4.setBounds(130, 331, 40, 40);
		contentPane.add(lblQ_4);
		
		JLabel lblQ_5 = new JLabel("Q6");
		lblQ_5.setBounds(160, 331, 40, 40);
		contentPane.add(lblQ_5);
		
		JLabel lblQ_6 = new JLabel("Q7");
		lblQ_6.setBounds(190, 331, 40, 40);
		contentPane.add(lblQ_6);
		
		JLabel lblQ_7 = new JLabel("Q8");
		lblQ_7.setBounds(220, 331, 40, 40);
		contentPane.add(lblQ_7);
		
		JLabel lblQ_8 = new JLabel("Q9");
		lblQ_8.setBounds(250, 331, 40, 40);
		contentPane.add(lblQ_8);
		
		JLabel lblQ_9 = new JLabel("Q10");
		lblQ_9.setBounds(280, 331, 40, 40);
		contentPane.add(lblQ_9);
		
		JLabel lblQ_10 = new JLabel("Q11");
		lblQ_10.setBounds(310, 331, 40, 40);
		contentPane.add(lblQ_10);
		
		JLabel lblQ_11 = new JLabel("Q12");
		lblQ_11.setBounds(340, 331, 40, 40);
		contentPane.add(lblQ_11);
		
		JLabel lblQ_12 = new JLabel("Q13");
		lblQ_12.setBounds(370, 331, 40, 40);
		contentPane.add(lblQ_12);
		
		JLabel lblQ_13 = new JLabel("Q14");
		lblQ_13.setBounds(400, 331, 40, 40);
		contentPane.add(lblQ_13);
		
		JLabel lblQ_14 = new JLabel("Q15");
		lblQ_14.setBounds(430, 331, 40, 40);
		contentPane.add(lblQ_14);
		
		JLabel lblQ_15 = new JLabel("Q16");
		lblQ_15.setBounds(460, 331, 40, 40);
		contentPane.add(lblQ_15);
		
		JLabel lblQ_16 = new JLabel("Q17");
		lblQ_16.setBounds(490, 331, 40, 40);
		contentPane.add(lblQ_16);
		
		JLabel lblQ_17 = new JLabel("Q18");
		lblQ_17.setBounds(520, 331, 40, 40);
		contentPane.add(lblQ_17);
		
		JLabel lblQ_18 = new JLabel("Q19");
		lblQ_18.setBounds(550, 331, 40, 40);
		contentPane.add(lblQ_18);
		
		JLabel lblQ_19 = new JLabel("Q20");
		lblQ_19.setBounds(580, 331, 40, 40);
		contentPane.add(lblQ_19);
		
		JLabel lblR = new JLabel("R1");
		lblR.setBounds(10, 351, 40, 40);
		contentPane.add(lblR);
		
		JLabel lblR_1 = new JLabel("R2");
		lblR_1.setBounds(40, 351, 40, 40);
		contentPane.add(lblR_1);
		
		JLabel lblR_2 = new JLabel("R3");
		lblR_2.setBounds(70, 351, 40, 40);
		contentPane.add(lblR_2);
		
		JLabel lblR_3 = new JLabel("R4");
		lblR_3.setBounds(100, 351, 40, 40);
		contentPane.add(lblR_3);
		
		JLabel lblR_4 = new JLabel("R5");
		lblR_4.setBounds(130, 351, 40, 40);
		contentPane.add(lblR_4);
		
		JLabel lblR_5 = new JLabel("R6");
		lblR_5.setBounds(160, 351, 40, 40);
		contentPane.add(lblR_5);
		
		JLabel lblR_6 = new JLabel("R7");
		lblR_6.setBounds(190, 351, 40, 40);
		contentPane.add(lblR_6);
		
		JLabel lblR_7 = new JLabel("R8");
		lblR_7.setBounds(220, 351, 40, 40);
		contentPane.add(lblR_7);
		
		JLabel lblR_8 = new JLabel("R9");
		lblR_8.setBounds(250, 351, 40, 40);
		contentPane.add(lblR_8);
		
		JLabel lblR_9 = new JLabel("R10");
		lblR_9.setBounds(280, 351, 40, 40);
		contentPane.add(lblR_9);
		
		JLabel lblR_10 = new JLabel("R11");
		lblR_10.setBounds(310, 351, 40, 40);
		contentPane.add(lblR_10);
		
		JLabel lblR_11 = new JLabel("R12");
		lblR_11.setBounds(340, 351, 40, 40);
		contentPane.add(lblR_11);
		
		JLabel lblR_12 = new JLabel("R13");
		lblR_12.setBounds(370, 351, 40, 40);
		contentPane.add(lblR_12);
		
		JLabel lblR_13 = new JLabel("R14");
		lblR_13.setBounds(400, 351, 40, 40);
		contentPane.add(lblR_13);
		
		JLabel lblR_14 = new JLabel("R15");
		lblR_14.setBounds(430, 351, 40, 40);
		contentPane.add(lblR_14);
		
		JLabel lblR_15 = new JLabel("R16");
		lblR_15.setBounds(460, 351, 40, 40);
		contentPane.add(lblR_15);
		
		JLabel lblR_16 = new JLabel("R17");
		lblR_16.setBounds(490, 351, 40, 40);
		contentPane.add(lblR_16);
		
		JLabel lblR_17 = new JLabel("R18");
		lblR_17.setBounds(520, 351, 40, 40);
		contentPane.add(lblR_17);
		
		JLabel lblR_18 = new JLabel("R19");
		lblR_18.setBounds(550, 351, 40, 40);
		contentPane.add(lblR_18);
		
		JLabel lblR_19 = new JLabel("R20");
		lblR_19.setBounds(580, 351, 40, 40);
		contentPane.add(lblR_19);
		
		JLabel lblS = new JLabel("S1");
		lblS.setBounds(10, 371, 40, 40);
		contentPane.add(lblS);
		
		JLabel lblS_1 = new JLabel("S2");
		lblS_1.setBounds(40, 371, 40, 40);
		contentPane.add(lblS_1);
		
		JLabel lblS_2 = new JLabel("S3");
		lblS_2.setBounds(70, 371, 40, 40);
		contentPane.add(lblS_2);
		
		JLabel lblS_3 = new JLabel("S4");
		lblS_3.setBounds(100, 371, 40, 40);
		contentPane.add(lblS_3);
		
		JLabel lblS_4 = new JLabel("S5");
		lblS_4.setBounds(130, 371, 40, 40);
		contentPane.add(lblS_4);
		
		JLabel lblS_5 = new JLabel("S6");
		lblS_5.setBounds(160, 371, 40, 40);
		contentPane.add(lblS_5);
		
		JLabel lblS_6 = new JLabel("S7");
		lblS_6.setBounds(190, 371, 40, 40);
		contentPane.add(lblS_6);
		
		JLabel lblS_7 = new JLabel("S8");
		lblS_7.setBounds(220, 371, 40, 40);
		contentPane.add(lblS_7);
		
		JLabel lblS_8 = new JLabel("S9");
		lblS_8.setBounds(250, 371, 40, 40);
		contentPane.add(lblS_8);
		
		JLabel lblS_9 = new JLabel("S10");
		lblS_9.setBounds(280, 371, 40, 40);
		contentPane.add(lblS_9);
		
		JLabel lblS_10 = new JLabel("S11");
		lblS_10.setBounds(310, 371, 40, 40);
		contentPane.add(lblS_10);
		
		JLabel lblS_11 = new JLabel("S12");
		lblS_11.setBounds(340, 371, 40, 40);
		contentPane.add(lblS_11);
		
		JLabel lblS_12 = new JLabel("S13");
		lblS_12.setBounds(370, 371, 40, 40);
		contentPane.add(lblS_12);
		
		JLabel lblS_13 = new JLabel("S14");
		lblS_13.setBounds(400, 371, 40, 40);
		contentPane.add(lblS_13);
		
		JLabel lblS_14 = new JLabel("S15");
		lblS_14.setBounds(430, 371, 40, 40);
		contentPane.add(lblS_14);
		
		JLabel lblS_15 = new JLabel("S16");
		lblS_15.setBounds(460, 371, 40, 40);
		contentPane.add(lblS_15);
		
		JLabel lblS_16 = new JLabel("S17");
		lblS_16.setBounds(490, 371, 40, 40);
		contentPane.add(lblS_16);
		
		JLabel lblS_17 = new JLabel("S18");
		lblS_17.setBounds(520, 371, 40, 40);
		contentPane.add(lblS_17);
		
		JLabel lblS_18 = new JLabel("S19");
		lblS_18.setBounds(550, 371, 40, 40);
		contentPane.add(lblS_18);
		
		JLabel lblS_19 = new JLabel("S20");
		lblS_19.setBounds(580, 371, 40, 40);
		contentPane.add(lblS_19);
		
		JLabel lblT = new JLabel("T1");
		lblT.setBounds(10, 391, 40, 40);
		contentPane.add(lblT);
		
		JLabel lblT_1 = new JLabel("T2");
		lblT_1.setBounds(40, 391, 40, 40);
		contentPane.add(lblT_1);
		
		JLabel lblT_2 = new JLabel("T3");
		lblT_2.setBounds(70, 391, 40, 40);
		contentPane.add(lblT_2);
		
		JLabel lblT_3 = new JLabel("T4");
		lblT_3.setBounds(100, 391, 40, 40);
		contentPane.add(lblT_3);
		
		JLabel lblT_4 = new JLabel("T5");
		lblT_4.setBounds(130, 391, 40, 40);
		contentPane.add(lblT_4);
		
		JLabel lblT_5 = new JLabel("T6");
		lblT_5.setBounds(160, 391, 40, 40);
		contentPane.add(lblT_5);
		
		JLabel lblT_6 = new JLabel("T7");
		lblT_6.setBounds(190, 391, 40, 40);
		contentPane.add(lblT_6);
		
		JLabel lblT_7 = new JLabel("T8");
		lblT_7.setBounds(220, 391, 40, 40);
		contentPane.add(lblT_7);
		
		JLabel lblT_8 = new JLabel("T9");
		lblT_8.setBounds(250, 391, 40, 40);
		contentPane.add(lblT_8);
		
		JLabel lblT_9 = new JLabel("T10");
		lblT_9.setBounds(280, 391, 40, 40);
		contentPane.add(lblT_9);
		
		JLabel lblT_10 = new JLabel("T11");
		lblT_10.setBounds(310, 391, 40, 40);
		contentPane.add(lblT_10);
		
		JLabel lblT_11 = new JLabel("T12");
		lblT_11.setBounds(340, 391, 40, 40);
		contentPane.add(lblT_11);
		
		JLabel lblT_12 = new JLabel("T13");
		lblT_12.setBounds(370, 391, 40, 40);
		contentPane.add(lblT_12);
		
		JLabel lblT_13 = new JLabel("T14");
		lblT_13.setBounds(400, 391, 40, 40);
		contentPane.add(lblT_13);
		
		JLabel lblT_14 = new JLabel("T15");
		lblT_14.setBounds(430, 391, 40, 40);
		contentPane.add(lblT_14);
		
		JLabel lblT_15 = new JLabel("T16");
		lblT_15.setBounds(460, 391, 40, 40);
		contentPane.add(lblT_15);
		
		JLabel lblT_16 = new JLabel("T17");
		lblT_16.setBounds(490, 391, 40, 40);
		contentPane.add(lblT_16);
		
		JLabel lblT_17 = new JLabel("T18");
		lblT_17.setBounds(520, 391, 40, 40);
		contentPane.add(lblT_17);
		
		JLabel lblT_18 = new JLabel("T19");
		lblT_18.setBounds(550, 391, 40, 40);
		contentPane.add(lblT_18);
		
		JLabel lblT_19 = new JLabel("T20");
		lblT_19.setBounds(580, 391, 40, 40);
		contentPane.add(lblT_19);
		
	}
	String labelNames[][]=new String[20][20]; {
		//_____________________________________________________________________________________________________________
		labelNames[0][0]= "lblA"; labelNames[0][1]="lblA_1"; labelNames[0][2]="lblA_2"; labelNames[0][3]="lblA_3"; labelNames[0][4]="lblA_4";
		labelNames[0][5]="lblA_5"; labelNames[0][6]="lblA_6"; labelNames[0][7]="lblA_7"; labelNames[0][8]="lblA_8"; labelNames[0][9]="lblA_9";
		labelNames[0][10]="lblA_10";labelNames[0][11]="lblA_11";labelNames[0][12]="lblA_12";labelNames[0][13]="lblA_13";labelNames[0][14]="lblA_14";
		labelNames[0][15]="lblA_15";labelNames[0][16]="lblA_16";labelNames[0][17]="lblA_17";labelNames[0][18]="lblA_18";labelNames[0][19]="lblA_19";
		//_____________________________________________________________________________________________________________
		labelNames[1][0]="lblB"; labelNames[1][1]="lblB_1"; labelNames[1][2]="lblB_2"; labelNames[1][3]="lblB_3"; labelNames[1][4]="lblB_4";
		labelNames[1][5]="lblB_5"; labelNames[1][6]="lblB_6"; labelNames[1][7]="lblB_7"; labelNames[1][8]="lblB_8"; labelNames[1][9]="lblB_9";
		labelNames[1][10]="lblB_10";labelNames[1][11]="lblB_11";labelNames[1][12]="lblB_12";labelNames[1][13]="lblB_13";labelNames[1][14]="lblB_14";
		labelNames[1][15]="lblB_15";labelNames[1][16]="lblB_16";labelNames[1][17]="lblB_17";labelNames[1][18]="lblB_18";labelNames[1][19]="lblB_19";
		//_____________________________________________________________________________________________________________
		labelNames[1][0]="lblC"; labelNames[1][1]="lblC_1"; labelNames[1][2]="lblC_2"; labelNames[1][3]="lblC_3"; labelNames[1][4]="lblC_4";
		labelNames[1][5]="lblC_5"; labelNames[1][6]="lblC_6"; labelNames[1][7]="lblC_7"; labelNames[1][8]="lblC_8"; labelNames[1][9]="lblC_9";
		labelNames[1][10]="lblC_10";labelNames[1][11]="lblC_11";labelNames[1][12]="lblC_12";labelNames[1][13]="lblC_13";labelNames[1][14]="lblC_14";
		labelNames[1][15]="lblC_15";labelNames[1][16]="lblC_16";labelNames[1][17]="lblC_17";labelNames[1][18]="lblC_18";labelNames[1][19]="lblC_19";
		//_____________________________________________________________________________________________________________
		labelNames[3][1]="lblD"; labelNames[3][1]="lblD_1"; labelNames[3][2]="lblD_2"; labelNames[3][3]="lblD_3"; labelNames[3][4]="lblD_4";
		labelNames[3][5]="lblD_5"; labelNames[3][6]="lblD_6"; labelNames[3][7]="lblD_7"; labelNames[3][8]="lblD_8"; labelNames[3][9]="lblD_9";
		labelNames[3][10]="lblD_10";labelNames[3][11]="lblD_11";labelNames[3][12]="lblD_12";labelNames[3][13]="lblD_13";labelNames[3][14]="lblD_14";
		labelNames[3][15]="lblD_15";labelNames[3][16]="lblD_16";labelNames[3][17]="lblD_17";labelNames[3][18]="lblD_18";labelNames[3][19]="lblD_19";
		//_____________________________________________________________________________________________________________
		labelNames[4][1]="lblE"; labelNames[4][1]="lblE_1"; labelNames[4][2]="lblE_2"; labelNames[4][3]="lblE_3"; labelNames[4][4]="lblE_4";
		labelNames[4][5]="lblE_5"; labelNames[4][6]="lblE_6"; labelNames[4][7]="lblE_7"; labelNames[4][8]="lblE_8"; labelNames[4][9]="lblE_9";
		labelNames[4][10]="lblE_10";labelNames[4][11]="lblE_11";labelNames[4][12]="lblE_12";labelNames[4][13]="lblE_13";labelNames[4][14]="lblE_14";
		labelNames[4][15]="lblE_15";labelNames[4][16]="lblE_16";labelNames[4][17]="lblE_17";labelNames[4][18]="lblE_18";labelNames[4][19]="lblE_19";
		//_____________________________________________________________________________________________________________
		labelNames[5][1]="lblF"; labelNames[5][1]="lblF_1"; labelNames[5][2]="lblF_2"; labelNames[5][3]="lblF_3"; labelNames[5][4]="lblF_4";
		labelNames[5][5]="lblF_5"; labelNames[5][6]="lblF_6"; labelNames[5][7]="lblF_7"; labelNames[5][8]="lblF_8"; labelNames[5][9]="lblF_9";
		labelNames[5][10]="lblF_10";labelNames[5][11]="lblF_11";labelNames[5][12]="lblF_12";labelNames[5][13]="lblF_13";labelNames[5][14]="lblF_14";
		labelNames[5][15]="lblF_15";labelNames[5][16]="lblF_16";labelNames[5][17]="lblF_17";labelNames[5][18]="lblF_18";labelNames[5][19]="lblF_19";
		//_____________________________________________________________________________________________________________
		labelNames[6][1]="lblG"; labelNames[6][1]="lblG_1"; labelNames[6][2]="lblG_2"; labelNames[6][3]="lblG_3"; labelNames[6][4]="lblG_4";
		labelNames[6][5]="lblG_5"; labelNames[6][6]="lblG_6"; labelNames[6][7]="lblG_7"; labelNames[6][8]="lblG_8"; labelNames[6][9]="lblG_9";
		labelNames[6][10]="lblG_10";labelNames[6][11]="lblG_11";labelNames[6][12]="lblG_12";labelNames[6][13]="lblG_13";labelNames[6][14]="lblG_14";
		labelNames[6][15]="lblG_15";labelNames[6][16]="lblG_16";labelNames[6][17]="lblG_17";labelNames[6][18]="lblG_18";labelNames[6][19]="lblG_19";
		//_____________________________________________________________________________________________________________
		labelNames[7][0]="lblH"; labelNames[7][1]="lblH_1"; labelNames[7][2]="lblH_2"; labelNames[7][3]="lblH_3"; labelNames[7][4]="lblH_4";
		labelNames[7][5]="lblH_5"; labelNames[7][6]="lblH_6"; labelNames[7][7]="lblH_7"; labelNames[7][8]="lblH_8"; labelNames[7][9]="lblH_9";
		labelNames[7][10]="lblH_10";labelNames[7][11]="lblH_11";labelNames[7][12]="lblH_12";labelNames[7][13]="lblH_13";labelNames[7][14]="lblH_14";
		labelNames[7][15]="lblH_15";labelNames[7][16]="lblH_16";labelNames[7][17]="lblH_17";labelNames[7][18]="lblH_18";labelNames[7][19]="lblH_19";
		//_____________________________________________________________________________________________________________
		labelNames[8][0]="lblI"; labelNames[8][1]="lblI_1"; labelNames[8][2]="lblI_2"; labelNames[8][3]="lblI_3"; labelNames[8][4]="lblI_4";
		labelNames[8][5]="lblI_5"; labelNames[8][6]="lblI_6"; labelNames[8][7]="lblI_7"; labelNames[8][8]="lblI_8"; labelNames[8][9]="lblI_9";
		labelNames[8][10]="lblI_10";labelNames[8][11]="lblI_11";labelNames[8][12]="lblI_12";labelNames[8][13]="lblI_13";labelNames[8][14]="lblI_14";
		labelNames[8][15]="lblI_15";labelNames[8][16]="lblI_16";labelNames[8][17]="lblI_17";labelNames[8][18]="lblI_18";labelNames[8][19]="lblI_19";
		//_____________________________________________________________________________________________________________
		labelNames[9][0]="lblJ"; labelNames[9][1]="lblJ_1"; labelNames[9][2]="lblJ_2"; labelNames[9][3]="lblJ_3"; labelNames[9][4]="lblJ_4";
		labelNames[9][5]="lblJ_5"; labelNames[9][6]="lblJ_6"; labelNames[9][7]="lblJ_7"; labelNames[9][8]="lblJ_8"; labelNames[9][9]="lblJ_9";
		labelNames[9][10]="lblJ_10";labelNames[9][11]="lblJ_11";labelNames[9][12]="lblJ_12";labelNames[9][13]="lblJ_13";labelNames[9][14]="lblJ_14";
		labelNames[9][15]="lblJ_15";labelNames[9][16]="lblJ_16";labelNames[9][17]="lblJ_17";labelNames[9][18]="lblJ_18";labelNames[9][19]="lblJ_19";
		//_____________________________________________________________________________________________________________
		labelNames[10][0]="lblK"; labelNames[10][1]="lblK_1"; labelNames[10][2]="lblK_2"; labelNames[10][3]="lblK_3"; labelNames[10][4]="lblK_4";
		labelNames[10][5]="lblK_5"; labelNames[10][6]="lblK_6"; labelNames[10][7]="lblK_7"; labelNames[10][8]="lblK_8"; labelNames[10][9]="lblK_9";
		labelNames[10][10]="lblK_10";labelNames[10][11]="lblK_11";labelNames[10][12]="lblK_12";labelNames[10][13]="lblK_13";labelNames[10][14]="lblK_14";
		labelNames[10][15]="lblK_15";labelNames[10][16]="lblK_16";labelNames[10][17]="lblK_17";labelNames[10][18]="lblK_18";labelNames[10][19]="lblK_19";
		//_____________________________________________________________________________________________________________
		labelNames[11][0]="lblL"; labelNames[11][1]="lblL_1"; labelNames[11][2]="lblL_2"; labelNames[11][3]="lblL_3"; labelNames[11][4]="lblL_4";
		labelNames[11][5]="lblL_5"; labelNames[11][6]="lblL_6"; labelNames[11][7]="lblL_7"; labelNames[11][8]="lblL_8"; labelNames[11][9]="lblL_9";
		labelNames[11][10]="lblL_10";labelNames[11][11]="lblL_11";labelNames[11][12]="lblL_12";labelNames[11][13]="lblL_13";labelNames[11][14]="lblL_14";
		labelNames[11][15]="lblL_15";labelNames[11][16]="lblL_16";labelNames[11][17]="lblL_17";labelNames[11][18]="lblL_18";labelNames[11][19]="lblL_19";
		//_____________________________________________________________________________________________________________
		labelNames[12][0]="lblM"; labelNames[12][1]="lblM_1"; labelNames[12][2]="lblM_2"; labelNames[12][3]="lblM_3"; labelNames[12][4]="lblM_4";
		labelNames[12][5]="lblM_5"; labelNames[12][6]="lblM_6"; labelNames[12][7]="lblM_7"; labelNames[12][8]="lblM_8"; labelNames[12][9]="lblM_9";
		labelNames[12][10]="lblM_10";labelNames[12][11]="lblM_11";labelNames[12][12]="lblM_12";labelNames[12][13]="lblM_13";labelNames[12][14]="lblM_14";
		labelNames[12][15]="lblM_15";labelNames[12][16]="lblM_16";labelNames[12][17]="lblM_17";labelNames[12][18]="lblM_18";labelNames[12][19]="lblM_19";
		//_____________________________________________________________________________________________________________
		labelNames[13][0]="lblN"; labelNames[13][1]="lblN_1"; labelNames[13][2]="lblN_2"; labelNames[13][3]="lblN_3"; labelNames[13][4]="lblN_4";
		labelNames[13][5]="lblN_5"; labelNames[13][6]="lblN_6"; labelNames[13][7]="lblN_7"; labelNames[13][8]="lblN_8"; labelNames[13][9]="lblN_9";
		labelNames[13][10]="lblN_10";labelNames[13][11]="lblN_11";labelNames[13][12]="lblN_12";labelNames[13][13]="lblN_13";labelNames[13][14]="lblN_14";
		labelNames[13][15]="lblN_15";labelNames[13][16]="lblN_16";labelNames[13][17]="lblN_17";labelNames[13][18]="lblN_18";labelNames[13][19]="lblN_19";
		//_____________________________________________________________________________________________________________
		labelNames[14][0]="lblO"; labelNames[14][1]="lblO_1"; labelNames[14][2]="lblO_2"; labelNames[14][3]="lblO_3"; labelNames[14][4]="lblO_4";
		labelNames[14][5]="lblO_5"; labelNames[14][6]="lblO_6"; labelNames[14][7]="lblO_7"; labelNames[14][8]="lblO_8"; labelNames[14][9]="lblO_9";
		labelNames[14][10]="lblO_10";labelNames[14][11]="lblO_11";labelNames[14][12]="lblO_12";labelNames[14][13]="lblO_13";labelNames[14][14]="lblO_14";
		labelNames[14][15]="lblO_15";labelNames[14][16]="lblO_16";labelNames[14][17]="lblO_17";labelNames[14][18]="lblO_18";labelNames[14][19]="lblO_19";
		//_____________________________________________________________________________________________________________
		labelNames[15][0]="lblP"; labelNames[15][1]="lblP_1"; labelNames[15][2]="lblP_2"; labelNames[15][3]="lblP_3"; labelNames[15][4]="lblP_4";
		labelNames[15][5]="lblP_5"; labelNames[15][6]="lblP_6"; labelNames[15][7]="lblP_7"; labelNames[15][8]="lblP_8"; labelNames[15][9]="lblP_9";
		labelNames[15][10]="lblP_10";labelNames[15][11]="lblP_11";labelNames[15][12]="lblP_12";labelNames[15][13]="lblP_13";labelNames[15][14]="lblP_14";
		labelNames[15][15]="lblP_15";labelNames[15][16]="lblP_16";labelNames[15][17]="lblP_17";labelNames[15][18]="lblP_18";labelNames[15][19]="lblP_19";
		//_____________________________________________________________________________________________________________
		labelNames[16][0]="lblQ"; labelNames[16][1]="lblQ_1"; labelNames[16][2]="lblQ_2"; labelNames[16][3]="lblQ_3"; labelNames[16][4]="lblQ_4";
		labelNames[16][5]="lblQ_5"; labelNames[16][6]="lblQ_6"; labelNames[16][7]="lblQ_7"; labelNames[16][8]="lblQ_8"; labelNames[16][9]="lblQ_9";
		labelNames[16][10]="lblQ_10";labelNames[16][11]="lblQ_11";labelNames[16][12]="lblQ_12";labelNames[16][13]="lblQ_13";labelNames[16][14]="lblQ_14";
		labelNames[16][15]="lblQ_15";labelNames[16][16]="lblQ_16";labelNames[16][17]="lblQ_17";labelNames[16][18]="lblQ_18";labelNames[16][19]="lblQ_19";
		//_____________________________________________________________________________________________________________
		labelNames[17][0]="lblR"; labelNames[17][1]="lblR_1"; labelNames[17][2]="lblR_2"; labelNames[17][3]="lblR_3"; labelNames[17][4]="lblR_4";
		labelNames[17][5]="lblR_5"; labelNames[17][6]="lblR_6"; labelNames[17][7]="lblR_7"; labelNames[17][8]="lblR_8"; labelNames[17][9]="lblR_9";
		labelNames[17][10]="lblR_10";labelNames[17][11]="lblR_11";labelNames[17][12]="lblR_12";labelNames[17][13]="lblR_13";labelNames[17][14]="lblR_14";
		labelNames[17][15]="lblR_15";labelNames[17][16]="lblR_16";labelNames[17][17]="lblR_17";labelNames[17][18]="lblR_18";labelNames[17][19]="lblR_19";
		//_____________________________________________________________________________________________________________
		labelNames[18][0]="lblS"; labelNames[8][1]="lblS_1"; labelNames[8][2]="lblS_2"; labelNames[8][3]="lblS_3"; labelNames[8][4]="lblS_4";
		labelNames[8][5]="lblS_5"; labelNames[8][6]="lblS_6"; labelNames[8][7]="lblS_7"; labelNames[8][8]="lblS_8"; labelNames[8][9]="lblS_9";
		labelNames[8][10]="lblS_10";labelNames[8][11]="lblS_11";labelNames[8][12]="lblS_12";labelNames[8][13]="lblS_13";labelNames[8][14]="lblS_14";
		labelNames[8][15]="lblS_15";labelNames[8][16]="lblS_16";labelNames[8][17]="lblS_17";labelNames[8][18]="lblS_18";labelNames[8][19]="lblS_19";
		//_____________________________________________________________________________________________________________
		labelNames[19][0]="lblT"; labelNames[19][1]="lblT_1"; labelNames[19][2]="lblT_2"; labelNames[19][3]="lblT_3"; labelNames[19][4]="lblT_4";
		labelNames[19][5]="lblT_5"; labelNames[19][6]="lblT_6"; labelNames[19][7]="lblT_7"; labelNames[19][8]="lblT_8"; labelNames[19][9]="lblT_9";
		labelNames[19][10]="lblT_10";labelNames[19][11]="lblT_11";labelNames[19][12]="lblT_12";labelNames[19][13]="lblT_13";labelNames[19][14]="lblT_14";
		labelNames[19][15]="lblT_15";labelNames[19][16]="lblT_16";labelNames[19][17]="lblT_17";labelNames[19][18]="lblT_18";labelNames[19][19]="lblT_19";
		//_____________________________________________________________________________________________________________
	}
}

	

