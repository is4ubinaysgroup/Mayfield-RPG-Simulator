package battleScreen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class RoomClass extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoomClass frame = new RoomClass();
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
	public RoomClass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblA = new JLabel("A1");
		lblA.setBounds(10, 11, 20, 20);
		contentPane.add(lblA);
		
		JLabel lblA_1 = new JLabel("A2");
		lblA_1.setBounds(40, 11, 20, 20);
		contentPane.add(lblA_1);
		
		JLabel lblA_2 = new JLabel("A3");
		lblA_2.setBounds(70, 11, 20, 20);
		contentPane.add(lblA_2);
		
		JLabel lblA_3 = new JLabel("A4");
		lblA_3.setBounds(100, 11, 20, 20);
		contentPane.add(lblA_3);
		
		JLabel lblA_4 = new JLabel("A5");
		lblA_4.setBounds(130, 11, 20, 20);
		contentPane.add(lblA_4);
		
		JLabel lblA_5 = new JLabel("A6");
		lblA_5.setBounds(160, 11, 20, 20);
		contentPane.add(lblA_5);
		
		JLabel lblA_6 = new JLabel("A7");
		lblA_6.setBounds(190, 11, 20, 20);
		contentPane.add(lblA_6);
		
		JLabel lblA_7 = new JLabel("A8");
		lblA_7.setBounds(220, 11, 20, 20);
		contentPane.add(lblA_7);
		
		JLabel lblA_8 = new JLabel("A9");
		lblA_8.setBounds(250, 11, 20, 20);
		contentPane.add(lblA_8);
		
		JLabel lblA_9 = new JLabel("A10");
		lblA_9.setBounds(280, 11, 20, 20);
		contentPane.add(lblA_9);
		
		JLabel lblA_10 = new JLabel("A11");
		lblA_10.setBounds(310, 11, 20, 20);
		contentPane.add(lblA_10);
		
		JLabel lblA_11 = new JLabel("A12");
		lblA_11.setBounds(340, 11, 20, 20);
		contentPane.add(lblA_11);
		
		JLabel lblA_12 = new JLabel("A13");
		lblA_12.setBounds(370, 11, 20, 20);
		contentPane.add(lblA_12);
		
		JLabel lblA_13 = new JLabel("A14");
		lblA_13.setBounds(400, 11, 20, 20);
		contentPane.add(lblA_13);
		
		JLabel lblA_14 = new JLabel("A15");
		lblA_14.setBounds(430, 11, 20, 20);
		contentPane.add(lblA_14);
		
		JLabel lblA_15 = new JLabel("A16");
		lblA_15.setBounds(460, 11, 20, 20);
		contentPane.add(lblA_15);
		
		JLabel lblA_16 = new JLabel("A17");
		lblA_16.setBounds(490, 11, 20, 20);
		contentPane.add(lblA_16);
		
		JLabel lblA_17 = new JLabel("A18");
		lblA_17.setBounds(520, 11, 20, 20);
		contentPane.add(lblA_17);
		
		JLabel lblA_18 = new JLabel("A19");
		lblA_18.setBounds(550, 11, 20, 20);
		contentPane.add(lblA_18);
		
		JLabel lblA_19 = new JLabel("A20");
		lblA_19.setBounds(580, 11, 20, 20);
		contentPane.add(lblA_19);
		JLabel lblB = new JLabel("B1");
		lblB.setBounds(10, 21, 20, 20);
		contentPane.add(lblB);
		
		JLabel lblB_1 = new JLabel("B2");
		lblB_1.setBounds(40, 21, 20, 20);
		contentPane.add(lblB_1);
		
		JLabel lblB_2 = new JLabel("B3");
		lblB_2.setBounds(70, 21, 20, 20);
		contentPane.add(lblB_2);
		
		JLabel lblB_3 = new JLabel("B4");
		lblB_3.setBounds(100, 21, 20, 20);
		contentPane.add(lblB_3);
		
		JLabel lblB_4 = new JLabel("B5");
		lblB_4.setBounds(130, 21, 20, 20);
		contentPane.add(lblB_4);
		
		JLabel lblB_5 = new JLabel("B6");
		lblB_5.setBounds(160, 21, 20, 20);
		contentPane.add(lblB_5);
		
		JLabel lblB_6 = new JLabel("B7");
		lblB_6.setBounds(190, 21, 20, 20);
		contentPane.add(lblB_6);
		
		JLabel lblB_7 = new JLabel("B8");
		lblB_7.setBounds(220, 21, 20, 20);
		contentPane.add(lblB_7);
		
		JLabel lblB_8 = new JLabel("B9");
		lblB_8.setBounds(250, 21, 20, 20);
		contentPane.add(lblB_8);
		
		JLabel lblB_9 = new JLabel("B10");
		lblB_9.setBounds(280, 21, 20, 20);
		contentPane.add(lblB_9);
		
		JLabel lblB_10 = new JLabel("B11");
		lblB_10.setBounds(310, 21, 20, 20);
		contentPane.add(lblB_10);
		
		JLabel lblB_21 = new JLabel("B12");
		lblB_21.setBounds(340, 21, 20, 20);
		contentPane.add(lblB_21);
		
		JLabel lblB_12 = new JLabel("B13");
		lblB_12.setBounds(370, 21, 20, 20);
		contentPane.add(lblB_12);
		
		JLabel lblB_13 = new JLabel("B14");
		lblB_13.setBounds(400, 21, 20, 20);
		contentPane.add(lblB_13);
		
		JLabel lblB_14 = new JLabel("B15");
		lblB_14.setBounds(430, 21, 20, 20);
		contentPane.add(lblB_14);
		
		JLabel lblB_15 = new JLabel("B16");
		lblB_15.setBounds(460, 21, 20, 20);
		contentPane.add(lblB_15);
		
		JLabel lblB_16 = new JLabel("B17");
		lblB_16.setBounds(490, 21, 20, 20);
		contentPane.add(lblB_16);
		
		JLabel lblB_17 = new JLabel("B18");
		lblB_17.setBounds(520, 21, 20, 20);
		contentPane.add(lblB_17);
		
		JLabel lblB_18 = new JLabel("B19");
		lblB_18.setBounds(550, 21, 20, 20);
		contentPane.add(lblB_18);
		
		JLabel lblB_19 = new JLabel("B20");
		lblB_19.setBounds(580, 21, 20, 20);
		contentPane.add(lblB_19);
		
		JLabel lblC = new JLabel("C1");
		lblC.setBounds(10, 31, 20, 20);
		contentPane.add(lblC);
		
		JLabel lblC_1 = new JLabel("C2");
		lblC_1.setBounds(40, 31, 20, 20);
		contentPane.add(lblC_1);
		
		JLabel lblC_2 = new JLabel("C3");
		lblC_2.setBounds(70, 31, 20, 20);
		contentPane.add(lblC_2);
		
		JLabel lblC_3 = new JLabel("C4");
		lblC_3.setBounds(100, 31, 20, 20);
		contentPane.add(lblC_3);
		
		JLabel lblC_4 = new JLabel("C5");
		lblC_4.setBounds(130, 31, 20, 20);
		contentPane.add(lblC_4);
		
		JLabel lblC_5 = new JLabel("C6");
		lblC_5.setBounds(160, 31, 20, 20);
		contentPane.add(lblC_5);
		
		JLabel lblC_6 = new JLabel("C7");
		lblC_6.setBounds(190, 31, 20, 20);
		contentPane.add(lblC_6);
		
		JLabel lblC_7 = new JLabel("C8");
		lblC_7.setBounds(220, 31, 20, 20);
		contentPane.add(lblC_7);
		
		JLabel lblC_8 = new JLabel("C9");
		lblC_8.setBounds(250, 31, 20, 20);
		contentPane.add(lblC_8);
		
		JLabel lblC_9 = new JLabel("C10");
		lblC_9.setBounds(280, 31, 20, 20);
		contentPane.add(lblC_9);
		
		JLabel lblC_10 = new JLabel("C11");
		lblC_10.setBounds(310, 31, 20, 20);
		contentPane.add(lblC_10);
		
		JLabel lblC_31 = new JLabel("C12");
		lblC_31.setBounds(340, 31, 20, 20);
		contentPane.add(lblC_31);
		
		JLabel lblC_12 = new JLabel("C13");
		lblC_12.setBounds(370, 31, 20, 20);
		contentPane.add(lblC_12);
		
		JLabel lblC_13 = new JLabel("C14");
		lblC_13.setBounds(400, 31, 20, 20);
		contentPane.add(lblC_13);
		
		JLabel lblC_14 = new JLabel("C15");
		lblC_14.setBounds(430, 31, 20, 20);
		contentPane.add(lblC_14);
		
		JLabel lblC_15 = new JLabel("C16");
		lblC_15.setBounds(460, 31, 20, 20);
		contentPane.add(lblC_15);
		
		JLabel lblC_16 = new JLabel("C17");
		lblC_16.setBounds(490, 31, 20, 20);
		contentPane.add(lblC_16);
		
		JLabel lblC_17 = new JLabel("C18");
		lblC_17.setBounds(520, 31, 20, 20);
		contentPane.add(lblC_17);
		
		JLabel lblC_18 = new JLabel("C19");
		lblC_18.setBounds(550, 31, 20, 20);
		contentPane.add(lblC_18);
		
		JLabel lblC_19 = new JLabel("C20");
		lblC_19.setBounds(580, 31, 20, 20);
		contentPane.add(lblC_19);
		
		JLabel lblD = new JLabel("D1");
		lblD.setBounds(10, 41, 20, 20);
		contentPane.add(lblD);
		
		JLabel lblD_1 = new JLabel("D2");
		lblD_1.setBounds(40, 41, 20, 20);
		contentPane.add(lblD_1);
		
		JLabel lblD_2 = new JLabel("D3");
		lblD_2.setBounds(70, 41, 20, 20);
		contentPane.add(lblD_2);
		
		JLabel lblD_3 = new JLabel("D4");
		lblD_3.setBounds(100, 41, 20, 20);
		contentPane.add(lblD_3);
		
		JLabel lblD_4 = new JLabel("D5");
		lblD_4.setBounds(130, 41, 20, 20);
		contentPane.add(lblD_4);
		
		JLabel lblD_5 = new JLabel("D6");
		lblD_5.setBounds(160, 41, 20, 20);
		contentPane.add(lblD_5);
		
		JLabel lblD_6 = new JLabel("D7");
		lblD_6.setBounds(190, 41, 20, 20);
		contentPane.add(lblD_6);
		
		JLabel lblD_7 = new JLabel("D8");
		lblD_7.setBounds(220, 41, 20, 20);
		contentPane.add(lblD_7);
		
		JLabel lblD_8 = new JLabel("D9");
		lblD_8.setBounds(250, 41, 20, 20);
		contentPane.add(lblD_8);
		
		JLabel lblD_9 = new JLabel("D10");
		lblD_9.setBounds(280, 41, 20, 20);
		contentPane.add(lblD_9);
		
		JLabel lblD_10 = new JLabel("D11");
		lblD_10.setBounds(310, 41, 20, 20);
		contentPane.add(lblD_10);
		
		JLabel lblD_41 = new JLabel("D12");
		lblD_41.setBounds(340, 41, 20, 20);
		contentPane.add(lblD_41);
		
		JLabel lblD_12 = new JLabel("D13");
		lblD_12.setBounds(370, 41, 20, 20);
		contentPane.add(lblD_12);
		
		JLabel lblD_13 = new JLabel("D14");
		lblD_13.setBounds(400, 41, 20, 20);
		contentPane.add(lblD_13);
		
		JLabel lblD_14 = new JLabel("D15");
		lblD_14.setBounds(430, 41, 20, 20);
		contentPane.add(lblD_14);
		
		JLabel lblD_15 = new JLabel("D16");
		lblD_15.setBounds(460, 41, 20, 20);
		contentPane.add(lblD_15);
		
		JLabel lblD_16 = new JLabel("D17");
		lblD_16.setBounds(490, 41, 20, 20);
		contentPane.add(lblD_16);
		
		JLabel lblD_17 = new JLabel("D18");
		lblD_17.setBounds(520, 41, 20, 20);
		contentPane.add(lblD_17);
		
		JLabel lblD_18 = new JLabel("D19");
		lblD_18.setBounds(550, 41, 20, 20);
		contentPane.add(lblD_18);
		
		JLabel lblD_19 = new JLabel("D20");
		lblD_19.setBounds(580, 41, 20, 20);
		contentPane.add(lblD_19);
		
		JLabel lblE = new JLabel("E1");
		lblE.setBounds(10, 51, 20, 20);
		contentPane.add(lblE);
		
		JLabel lblE_1 = new JLabel("E2");
		lblE_1.setBounds(40, 51, 20, 20);
		contentPane.add(lblE_1);
		
		JLabel lblE_2 = new JLabel("E3");
		lblE_2.setBounds(70, 51, 20, 20);
		contentPane.add(lblE_2);
		
		JLabel lblE_3 = new JLabel("E4");
		lblE_3.setBounds(100, 51, 20, 20);
		contentPane.add(lblE_3);
		
		JLabel lblE_4 = new JLabel("E5");
		lblE_4.setBounds(130, 51, 20, 20);
		contentPane.add(lblE_4);
		
		JLabel lblE_5 = new JLabel("E6");
		lblE_5.setBounds(160, 51, 20, 20);
		contentPane.add(lblE_5);
		
		JLabel lblE_6 = new JLabel("E7");
		lblE_6.setBounds(190, 51, 20, 20);
		contentPane.add(lblE_6);
		
		JLabel lblE_7 = new JLabel("E8");
		lblE_7.setBounds(220, 51, 20, 20);
		contentPane.add(lblE_7);
		
		JLabel lblE_8 = new JLabel("E9");
		lblE_8.setBounds(250, 51, 20, 20);
		contentPane.add(lblE_8);
		
		JLabel lblE_9 = new JLabel("E10");
		lblE_9.setBounds(280, 51, 20, 20);
		contentPane.add(lblE_9);
		
		JLabel lblE_10 = new JLabel("E11");
		lblE_10.setBounds(310, 51, 20, 20);
		contentPane.add(lblE_10);
		
		JLabel lblE_51 = new JLabel("E12");
		lblE_51.setBounds(340, 51, 20, 20);
		contentPane.add(lblE_51);
		
		JLabel lblE_12 = new JLabel("E13");
		lblE_12.setBounds(370, 51, 20, 20);
		contentPane.add(lblE_12);
		
		JLabel lblE_13 = new JLabel("E14");
		lblE_13.setBounds(400, 51, 20, 20);
		contentPane.add(lblE_13);
		
		JLabel lblE_14 = new JLabel("E15");
		lblE_14.setBounds(430, 51, 20, 20);
		contentPane.add(lblE_14);
		
		JLabel lblE_15 = new JLabel("E16");
		lblE_15.setBounds(460, 51, 20, 20);
		contentPane.add(lblE_15);
		
		JLabel lblE_16 = new JLabel("E17");
		lblE_16.setBounds(490, 51, 20, 20);
		contentPane.add(lblE_16);
		
		JLabel lblE_17 = new JLabel("E18");
		lblE_17.setBounds(520, 51, 20, 20);
		contentPane.add(lblE_17);
		
		JLabel lblE_18 = new JLabel("E19");
		lblE_18.setBounds(550, 51, 20, 20);
		contentPane.add(lblE_18);
		
		JLabel lblE_19 = new JLabel("E20");
		lblE_19.setBounds(580, 51, 20, 20);
		contentPane.add(lblE_19);
		
		JLabel lblF = new JLabel("F1");
		lblF.setBounds(10, 61, 20, 20);
		contentPane.add(lblF);
		
		JLabel lblF_1 = new JLabel("F2");
		lblF_1.setBounds(40, 61, 20, 20);
		contentPane.add(lblF_1);
		
		JLabel lblF_2 = new JLabel("F3");
		lblF_2.setBounds(70, 61, 20, 20);
		contentPane.add(lblF_2);
		
		JLabel lblF_3 = new JLabel("F4");
		lblF_3.setBounds(100, 61, 20, 20);
		contentPane.add(lblF_3);
		
		JLabel lblF_4 = new JLabel("F5");
		lblF_4.setBounds(130, 61, 20, 20);
		contentPane.add(lblF_4);
		
		JLabel lblF_5 = new JLabel("F6");
		lblF_5.setBounds(160, 61, 20, 20);
		contentPane.add(lblF_5);
		
		JLabel lblF_6 = new JLabel("F7");
		lblF_6.setBounds(190, 61, 20, 20);
		contentPane.add(lblF_6);
		
		JLabel lblF_7 = new JLabel("F8");
		lblF_7.setBounds(220, 61, 20, 20);
		contentPane.add(lblF_7);
		
		JLabel lblF_8 = new JLabel("F9");
		lblF_8.setBounds(250, 61, 20, 20);
		contentPane.add(lblF_8);
		
		JLabel lblF_9 = new JLabel("F10");
		lblF_9.setBounds(280, 61, 20, 20);
		contentPane.add(lblF_9);
		
		JLabel lblF_10 = new JLabel("F11");
		lblF_10.setBounds(310, 61, 20, 20);
		contentPane.add(lblF_10);
		
		JLabel lblF_61 = new JLabel("F12");
		lblF_61.setBounds(340, 61, 20, 20);
		contentPane.add(lblF_61);
		
		JLabel lblF_12 = new JLabel("F13");
		lblF_12.setBounds(370, 61, 20, 20);
		contentPane.add(lblF_12);
		
		JLabel lblF_13 = new JLabel("F14");
		lblF_13.setBounds(400, 61, 20, 20);
		contentPane.add(lblF_13);
		
		JLabel lblF_14 = new JLabel("F15");
		lblF_14.setBounds(430, 61, 20, 20);
		contentPane.add(lblF_14);
		
		JLabel lblF_15 = new JLabel("F16");
		lblF_15.setBounds(460, 61, 20, 20);
		contentPane.add(lblF_15);
		
		JLabel lblF_16 = new JLabel("F17");
		lblF_16.setBounds(490, 61, 20, 20);
		contentPane.add(lblF_16);
		
		JLabel lblF_17 = new JLabel("F18");
		lblF_17.setBounds(520, 61, 20, 20);
		contentPane.add(lblF_17);
		
		JLabel lblF_18 = new JLabel("F19");
		lblF_18.setBounds(550, 61, 20, 20);
		contentPane.add(lblF_18);
		
		JLabel lblG = new JLabel("G1");
		lblG.setBounds(10, 71, 20, 20);
		contentPane.add(lblG);
		
		JLabel lblG_1 = new JLabel("G2");
		lblG_1.setBounds(40, 71, 20, 20);
		contentPane.add(lblG_1);
		
		JLabel lblG_2 = new JLabel("G3");
		lblG_2.setBounds(70, 71, 20, 20);
		contentPane.add(lblG_2);
		
		JLabel lblG_3 = new JLabel("G4");
		lblG_3.setBounds(100, 71, 20, 20);
		contentPane.add(lblG_3);
		
		JLabel lblG_4 = new JLabel("G5");
		lblG_4.setBounds(130, 71, 20, 20);
		contentPane.add(lblG_4);
		
		JLabel lblG_5 = new JLabel("G6");
		lblG_5.setBounds(160, 71, 20, 20);
		contentPane.add(lblG_5);
		
		JLabel lblG_6 = new JLabel("G7");
		lblG_6.setBounds(190, 71, 20, 20);
		contentPane.add(lblG_6);
		
		JLabel lblG_7 = new JLabel("G8");
		lblG_7.setBounds(220, 71, 20, 20);
		contentPane.add(lblG_7);
		
		JLabel lblG_8 = new JLabel("G9");
		lblG_8.setBounds(250, 71, 20, 20);
		contentPane.add(lblG_8);
		
		JLabel lblG_9 = new JLabel("G10");
		lblG_9.setBounds(280, 71, 20, 20);
		contentPane.add(lblG_9);
		
		JLabel lblG_10 = new JLabel("G11");
		lblG_10.setBounds(310, 71, 20, 20);
		contentPane.add(lblG_10);
		
		JLabel lblG_11 = new JLabel("G12");
		lblG_11.setBounds(340, 71, 20, 20);
		contentPane.add(lblG_11);
		
		JLabel lblG_12 = new JLabel("G13");
		lblG_12.setBounds(370, 71, 20, 20);
		contentPane.add(lblG_12);
		
		JLabel lblG_13 = new JLabel("G14");
		lblG_13.setBounds(400, 71, 20, 20);
		contentPane.add(lblG_13);
		
		JLabel lblG_14 = new JLabel("G15");
		lblG_14.setBounds(430, 71, 20, 20);
		contentPane.add(lblG_14);
		
		JLabel lblG_15 = new JLabel("G16");
		lblG_15.setBounds(460, 71, 20, 20);
		contentPane.add(lblG_15);
		
		JLabel lblG_16 = new JLabel("G17");
		lblG_16.setBounds(490, 71, 20, 20);
		contentPane.add(lblG_16);
		
		JLabel lblG_17 = new JLabel("G18");
		lblG_17.setBounds(520, 71, 20, 20);
		contentPane.add(lblG_17);
		
		JLabel lblG_18 = new JLabel("G19");
		lblG_18.setBounds(550, 71, 20, 20);
		contentPane.add(lblG_18);
		
		JLabel lblG_19 = new JLabel("G20");
		lblG_19.setBounds(580, 71, 20, 20);
		contentPane.add(lblG_19);
		
		JLabel lblH = new JLabel("H1");
		lblH.setBounds(10, 81, 20, 20);
		contentPane.add(lblH);
		
		JLabel lblH_1 = new JLabel("H2");
		lblH_1.setBounds(40, 81, 20, 20);
		contentPane.add(lblH_1);
		
		JLabel lblH_2 = new JLabel("H3");
		lblH_2.setBounds(70, 81, 20, 20);
		contentPane.add(lblH_2);
		
		JLabel lblH_3 = new JLabel("H4");
		lblH_3.setBounds(100, 81, 20, 20);
		contentPane.add(lblH_3);
		
		JLabel lblH_4 = new JLabel("H5");
		lblH_4.setBounds(130, 81, 20, 20);
		contentPane.add(lblH_4);
		
		JLabel lblH_5 = new JLabel("H6");
		lblH_5.setBounds(160, 81, 20, 20);
		contentPane.add(lblH_5);
		
		JLabel lblH_6 = new JLabel("H7");
		lblH_6.setBounds(190, 81, 20, 20);
		contentPane.add(lblH_6);
		
		JLabel lblH_7 = new JLabel("H8");
		lblH_7.setBounds(220, 81, 20, 20);
		contentPane.add(lblH_7);
		
		JLabel lblH_8 = new JLabel("H9");
		lblH_8.setBounds(250, 81, 20, 20);
		contentPane.add(lblH_8);
		
		JLabel lblH_9 = new JLabel("H10");
		lblH_9.setBounds(280, 81, 20, 20);
		contentPane.add(lblH_9);
		
		JLabel lblH_10 = new JLabel("H11");
		lblH_10.setBounds(310, 81, 20, 20);
		contentPane.add(lblH_10);
		
		JLabel lblH_21 = new JLabel("H12");
		lblH_21.setBounds(340, 81, 20, 20);
		contentPane.add(lblH_21);
		
		JLabel lblH_12 = new JLabel("H13");
		lblH_12.setBounds(370, 81, 20, 20);
		contentPane.add(lblH_12);
		
		JLabel lblH_13 = new JLabel("H14");
		lblH_13.setBounds(400, 81, 20, 20);
		contentPane.add(lblH_13);
		
		JLabel lblH_14 = new JLabel("H15");
		lblH_14.setBounds(430, 81, 20, 20);
		contentPane.add(lblH_14);
		
		JLabel lblH_15 = new JLabel("H16");
		lblH_15.setBounds(460, 81, 20, 20);
		contentPane.add(lblH_15);
		
		JLabel lblH_16 = new JLabel("H17");
		lblH_16.setBounds(490, 81, 20, 20);
		contentPane.add(lblH_16);
		
		JLabel lblH_17 = new JLabel("H18");
		lblH_17.setBounds(520, 81, 20, 20);
		contentPane.add(lblH_17);
		
		JLabel lblH_18 = new JLabel("H19");
		lblH_18.setBounds(550, 81, 20, 20);
		contentPane.add(lblH_18);
		
		JLabel lblH_19 = new JLabel("H20");
		lblH_19.setBounds(580, 81, 20, 20);
		contentPane.add(lblH_19);
		
		JLabel lblI = new JLabel("I1");
		lblI.setBounds(10, 91, 20, 20);
		contentPane.add(lblI);
		
		JLabel lblI_1 = new JLabel("I2");
		lblI_1.setBounds(40, 91, 20, 20);
		contentPane.add(lblI_1);
		
		JLabel lblI_2 = new JLabel("I3");
		lblI_2.setBounds(70, 91, 20, 20);
		contentPane.add(lblI_2);
		
		JLabel lblI_3 = new JLabel("I4");
		lblI_3.setBounds(100, 91, 20, 20);
		contentPane.add(lblI_3);
		
		JLabel lblI_4 = new JLabel("I5");
		lblI_4.setBounds(130, 91, 20, 20);
		contentPane.add(lblI_4);
		
		JLabel lblI_5 = new JLabel("I6");
		lblI_5.setBounds(160, 91, 20, 20);
		contentPane.add(lblI_5);
		
		JLabel lblI_6 = new JLabel("I7");
		lblI_6.setBounds(190, 91, 20, 20);
		contentPane.add(lblI_6);
		
		JLabel lblI_7 = new JLabel("I8");
		lblI_7.setBounds(220, 91, 20, 20);
		contentPane.add(lblI_7);
		
		JLabel lblI_8 = new JLabel("I9");
		lblI_8.setBounds(250, 91, 20, 20);
		contentPane.add(lblI_8);
		
		JLabel lblI_9 = new JLabel("I10");
		lblI_9.setBounds(280, 91, 20, 20);
		contentPane.add(lblI_9);
		
		JLabel lblI_10 = new JLabel("I11");
		lblI_10.setBounds(310, 91, 20, 20);
		contentPane.add(lblI_10);
		
		JLabel lblI_31 = new JLabel("I12");
		lblI_31.setBounds(340, 91, 20, 20);
		contentPane.add(lblI_31);
		
		JLabel lblI_12 = new JLabel("I13");
		lblI_12.setBounds(370, 91, 20, 20);
		contentPane.add(lblI_12);
		
		JLabel lblI_13 = new JLabel("I14");
		lblI_13.setBounds(400, 91, 20, 20);
		contentPane.add(lblI_13);
		
		JLabel lblI_14 = new JLabel("I15");
		lblI_14.setBounds(430, 91, 20, 20);
		contentPane.add(lblI_14);
		
		JLabel lblI_15 = new JLabel("I16");
		lblI_15.setBounds(460, 91, 20, 20);
		contentPane.add(lblI_15);
		
		JLabel lblI_16 = new JLabel("I17");
		lblI_16.setBounds(490, 91, 20, 20);
		contentPane.add(lblI_16);
		
		JLabel lblI_17 = new JLabel("I18");
		lblI_17.setBounds(520, 91, 20, 20);
		contentPane.add(lblI_17);
		
		JLabel lblI_18 = new JLabel("I19");
		lblI_18.setBounds(550, 91, 20, 20);
		contentPane.add(lblI_18);
		
		JLabel lblI_19 = new JLabel("I20");
		lblI_19.setBounds(580, 91, 20, 20);
		contentPane.add(lblI_19);
		
		JLabel lblJ = new JLabel("J1");
		lblJ.setBounds(10, 101, 20, 20);
		contentPane.add(lblJ);
		
		JLabel lblJ_1 = new JLabel("J2");
		lblJ_1.setBounds(40, 101, 20, 20);
		contentPane.add(lblJ_1);
		
		JLabel lblJ_2 = new JLabel("J3");
		lblJ_2.setBounds(70, 101, 20, 20);
		contentPane.add(lblJ_2);
		
		JLabel lblJ_3 = new JLabel("J4");
		lblJ_3.setBounds(100, 101, 20, 20);
		contentPane.add(lblJ_3);
		
		JLabel lblJ_4 = new JLabel("J5");
		lblJ_4.setBounds(130, 101, 20, 20);
		contentPane.add(lblJ_4);
		
		JLabel lblJ_5 = new JLabel("J6");
		lblJ_5.setBounds(160, 101, 20, 20);
		contentPane.add(lblJ_5);
		
		JLabel lblJ_6 = new JLabel("J7");
		lblJ_6.setBounds(190, 101, 20, 20);
		contentPane.add(lblJ_6);
		
		JLabel lblJ_7 = new JLabel("J8");
		lblJ_7.setBounds(220, 101, 20, 20);
		contentPane.add(lblJ_7);
		
		JLabel lblJ_8 = new JLabel("J9");
		lblJ_8.setBounds(250, 101, 20, 20);
		contentPane.add(lblJ_8);
		
		JLabel lblJ_9 = new JLabel("J10");
		lblJ_9.setBounds(280, 101, 20, 20);
		contentPane.add(lblJ_9);
		
		JLabel lblJ_10 = new JLabel("J11");
		lblJ_10.setBounds(310, 101, 20, 20);
		contentPane.add(lblJ_10);
		
		JLabel lblJ_101 = new JLabel("J12");
		lblJ_101.setBounds(340, 101, 20, 20);
		contentPane.add(lblJ_101);
		
		JLabel lblJ_12 = new JLabel("J13");
		lblJ_12.setBounds(370, 101, 20, 20);
		contentPane.add(lblJ_12);
		
		JLabel lblJ_13 = new JLabel("J14");
		lblJ_13.setBounds(400, 101, 20, 20);
		contentPane.add(lblJ_13);
		
		JLabel lblJ_14 = new JLabel("J15");
		lblJ_14.setBounds(430, 101, 20, 20);
		contentPane.add(lblJ_14);
		
		JLabel lblJ_15 = new JLabel("J16");
		lblJ_15.setBounds(460, 101, 20, 20);
		contentPane.add(lblJ_15);
		
		JLabel lblJ_16 = new JLabel("J17");
		lblJ_16.setBounds(490, 101, 20, 20);
		contentPane.add(lblJ_16);
		
		JLabel lblJ_17 = new JLabel("J18");
		lblJ_17.setBounds(520, 101, 20, 20);
		contentPane.add(lblJ_17);
		
		JLabel lblJ_18 = new JLabel("J19");
		lblJ_18.setBounds(550, 101, 20, 20);
		contentPane.add(lblJ_18);
		
		JLabel lblJ_19 = new JLabel("J20");
		lblJ_19.setBounds(580, 101, 20, 20);
		contentPane.add(lblJ_19);
		
		JLabel lblK = new JLabel("K1");
		lblK.setBounds(10, 111, 20, 20);
		contentPane.add(lblK);
		
		JLabel lblK_1 = new JLabel("K2");
		lblK_1.setBounds(40, 111, 20, 20);
		contentPane.add(lblK_1);
		
		JLabel lblK_2 = new JLabel("K3");
		lblK_2.setBounds(70, 111, 20, 20);
		contentPane.add(lblK_2);
		
		JLabel lblK_3 = new JLabel("K4");
		lblK_3.setBounds(100, 111, 20, 20);
		contentPane.add(lblK_3);
		
		JLabel lblK_4 = new JLabel("K5");
		lblK_4.setBounds(130, 111, 20, 20);
		contentPane.add(lblK_4);
		
		JLabel lblK_5 = new JLabel("K6");
		lblK_5.setBounds(160, 111, 20, 20);
		contentPane.add(lblK_5);
		
		JLabel lblK_6 = new JLabel("K7");
		lblK_6.setBounds(190, 111, 20, 20);
		contentPane.add(lblK_6);
		
		JLabel lblK_7 = new JLabel("K8");
		lblK_7.setBounds(220, 111, 20, 20);
		contentPane.add(lblK_7);
		
		JLabel lblK_8 = new JLabel("K9");
		lblK_8.setBounds(250, 111, 20, 20);
		contentPane.add(lblK_8);
		
		JLabel lblK_9 = new JLabel("K10");
		lblK_9.setBounds(280, 111, 20, 20);
		contentPane.add(lblK_9);
		
		JLabel lblK_10 = new JLabel("K11");
		lblK_10.setBounds(310, 111, 20, 20);
		contentPane.add(lblK_10);
		
		JLabel lblK_111 = new JLabel("K12");
		lblK_111.setBounds(340, 111, 20, 20);
		contentPane.add(lblK_111);
		
		JLabel lblK_12 = new JLabel("K13");
		lblK_12.setBounds(370, 111, 20, 20);
		contentPane.add(lblK_12);
		
		JLabel lblK_13 = new JLabel("K14");
		lblK_13.setBounds(400, 111, 20, 20);
		contentPane.add(lblK_13);
		
		JLabel lblK_14 = new JLabel("K15");
		lblK_14.setBounds(430, 111, 20, 20);
		contentPane.add(lblK_14);
		
		JLabel lblK_15 = new JLabel("K16");
		lblK_15.setBounds(460, 111, 20, 20);
		contentPane.add(lblK_15);
		
		JLabel lblK_16 = new JLabel("K17");
		lblK_16.setBounds(490, 111, 20, 20);
		contentPane.add(lblK_16);
		
		JLabel lblK_17 = new JLabel("K18");
		lblK_17.setBounds(520, 111, 20, 20);
		contentPane.add(lblK_17);
		
		JLabel lblK_18 = new JLabel("K19");
		lblK_18.setBounds(550, 111, 20, 20);
		contentPane.add(lblK_18);
		
		JLabel lblK_19 = new JLabel("K20");
		lblK_19.setBounds(580, 111, 20, 20);
		contentPane.add(lblK_19);
		
		JLabel lblL = new JLabel("L1");
		lblL.setBounds(10, 121, 20, 20);
		contentPane.add(lblL);
		
		JLabel lblL_1 = new JLabel("L2");
		lblL_1.setBounds(40, 121, 20, 20);
		contentPane.add(lblL_1);
		
		JLabel lblL_2 = new JLabel("L3");
		lblL_2.setBounds(70, 121, 20, 20);
		contentPane.add(lblL_2);
		
		JLabel lblL_3 = new JLabel("L4");
		lblL_3.setBounds(100, 121, 20, 20);
		contentPane.add(lblL_3);
		
		JLabel lblL_4 = new JLabel("L5");
		lblL_4.setBounds(130, 121, 20, 20);
		contentPane.add(lblL_4);
		
		JLabel lblL_5 = new JLabel("L6");
		lblL_5.setBounds(160, 121, 20, 20);
		contentPane.add(lblL_5);
		
		JLabel lblL_6 = new JLabel("L7");
		lblL_6.setBounds(190, 121, 20, 20);
		contentPane.add(lblL_6);
		
		JLabel lblL_7 = new JLabel("L8");
		lblL_7.setBounds(220, 121, 20, 20);
		contentPane.add(lblL_7);
		
		JLabel lblL_8 = new JLabel("L9");
		lblL_8.setBounds(250, 121, 20, 20);
		contentPane.add(lblL_8);
		
		JLabel lblL_9 = new JLabel("L10");
		lblL_9.setBounds(280, 121, 20, 20);
		contentPane.add(lblL_9);
		
		JLabel lblL_10 = new JLabel("L11");
		lblL_10.setBounds(310, 121, 20, 20);
		contentPane.add(lblL_10);
		
		JLabel lblL_111 = new JLabel("L12");
		lblL_111.setBounds(340, 121, 20, 20);
		contentPane.add(lblL_111);
		
		JLabel lblL_12 = new JLabel("L13");
		lblL_12.setBounds(370, 121, 20, 20);
		contentPane.add(lblL_12);
		
		JLabel lblL_13 = new JLabel("L14");
		lblL_13.setBounds(400, 121, 20, 20);
		contentPane.add(lblL_13);
		
		JLabel lblL_14 = new JLabel("L15");
		lblL_14.setBounds(430, 121, 20, 20);
		contentPane.add(lblL_14);
		
		JLabel lblL_15 = new JLabel("L16");
		lblL_15.setBounds(460, 121, 20, 20);
		contentPane.add(lblL_15);
		
		JLabel lblL_16 = new JLabel("L17");
		lblL_16.setBounds(490, 121, 20, 20);
		contentPane.add(lblL_16);
		
		JLabel lblL_17 = new JLabel("L18");
		lblL_17.setBounds(520, 121, 20, 20);
		contentPane.add(lblL_17);
		
		JLabel lblL_18 = new JLabel("L19");
		lblL_18.setBounds(550, 121, 20, 20);
		contentPane.add(lblL_18);
		
		JLabel lblL_19 = new JLabel("L20");
		lblL_19.setBounds(580, 121, 20, 20);
		contentPane.add(lblL_19);
		
		JLabel lblL = new JLabel("L1");
		lblL.setBounds(10, 71, 20, 20);
		contentPane.add(lblL);
		
		JLabel lblL_1 = new JLabel("L2");
		lblL_1.setBounds(40, 71, 20, 20);
		contentPane.add(lblL_1);
		
		JLabel lblL_2 = new JLabel("L3");
		lblL_2.setBounds(70, 71, 20, 20);
		contentPane.add(lblL_2);
		
		JLabel lblL_3 = new JLabel("L4");
		lblL_3.setBounds(100, 71, 20, 20);
		contentPane.add(lblL_3);
		
		JLabel lblL_4 = new JLabel("L5");
		lblL_4.setBounds(130, 71, 20, 20);
		contentPane.add(lblL_4);
		
		JLabel lblL_5 = new JLabel("L6");
		lblL_5.setBounds(160, 71, 20, 20);
		contentPane.add(lblL_5);
		
		JLabel lblL_6 = new JLabel("L7");
		lblL_6.setBounds(190, 71, 20, 20);
		contentPane.add(lblL_6);
		
		JLabel lblL_7 = new JLabel("L8");
		lblL_7.setBounds(220, 71, 20, 20);
		contentPane.add(lblL_7);
		
		JLabel lblL_8 = new JLabel("L9");
		lblL_8.setBounds(250, 71, 20, 20);
		contentPane.add(lblL_8);
		
		JLabel lblL_9 = new JLabel("L10");
		lblL_9.setBounds(280, 71, 20, 20);
		contentPane.add(lblL_9);
		
		JLabel lblL_10 = new JLabel("L11");
		lblL_10.setBounds(310, 71, 20, 20);
		contentPane.add(lblL_10);
		
		JLabel lblL_11 = new JLabel("L12");
		lblL_11.setBounds(340, 71, 20, 20);
		contentPane.add(lblL_11);
		
		JLabel lblL_12 = new JLabel("L13");
		lblL_12.setBounds(370, 71, 20, 20);
		contentPane.add(lblL_12);
		
		JLabel lblL_13 = new JLabel("L14");
		lblL_13.setBounds(400, 71, 20, 20);
		contentPane.add(lblL_13);
		
		JLabel lblL_14 = new JLabel("L15");
		lblL_14.setBounds(430, 71, 20, 20);
		contentPane.add(lblL_14);
		
		JLabel lblL_15 = new JLabel("L16");
		lblL_15.setBounds(460, 71, 20, 20);
		contentPane.add(lblL_15);
		
		JLabel lblL_16 = new JLabel("L17");
		lblL_16.setBounds(490, 71, 20, 20);
		contentPane.add(lblL_16);
		
		JLabel lblL_17 = new JLabel("L18");
		lblL_17.setBounds(520, 71, 20, 20);
		contentPane.add(lblL_17);
		
		JLabel lblL_18 = new JLabel("L19");
		lblL_18.setBounds(550, 71, 20, 20);
		contentPane.add(lblL_18);
		
		JLabel lblL_19 = new JLabel("L20");
		lblL_19.setBounds(580, 71, 20, 20);
		contentPane.add(lblL_19);
		
		JLabel lblM = new JLabel("M1");
		lblM.setBounds(10, 81, 20, 20);
		contentPane.add(lblM);
		
		JLabel lblM_1 = new JLabel("M2");
		lblM_1.setBounds(40, 81, 20, 20);
		contentPane.add(lblM_1);
		
		JLabel lblM_2 = new JLabel("M3");
		lblM_2.setBounds(70, 81, 20, 20);
		contentPane.add(lblM_2);
		
		JLabel lblM_3 = new JLabel("M4");
		lblM_3.setBounds(100, 81, 20, 20);
		contentPane.add(lblM_3);
		
		JLabel lblM_4 = new JLabel("M5");
		lblM_4.setBounds(130, 81, 20, 20);
		contentPane.add(lblM_4);
		
		JLabel lblM_5 = new JLabel("M6");
		lblM_5.setBounds(160, 81, 20, 20);
		contentPane.add(lblM_5);
		
		JLabel lblM_6 = new JLabel("M7");
		lblM_6.setBounds(190, 81, 20, 20);
		contentPane.add(lblM_6);
		
		JLabel lblM_7 = new JLabel("M8");
		lblM_7.setBounds(220, 81, 20, 20);
		contentPane.add(lblM_7);
		
		JLabel lblM_8 = new JLabel("M9");
		lblM_8.setBounds(250, 81, 20, 20);
		contentPane.add(lblM_8);
		
		JLabel lblM_9 = new JLabel("M10");
		lblM_9.setBounds(280, 81, 20, 20);
		contentPane.add(lblM_9);
		
		JLabel lblM_10 = new JLabel("M11");
		lblM_10.setBounds(310, 81, 20, 20);
		contentPane.add(lblM_10);
		
		JLabel lblM_21 = new JLabel("M12");
		lblM_21.setBounds(340, 81, 20, 20);
		contentPane.add(lblM_21);
		
		JLabel lblM_12 = new JLabel("M13");
		lblM_12.setBounds(370, 81, 20, 20);
		contentPane.add(lblM_12);
		
		JLabel lblM_13 = new JLabel("M14");
		lblM_13.setBounds(400, 81, 20, 20);
		contentPane.add(lblM_13);
		
		JLabel lblM_14 = new JLabel("M15");
		lblM_14.setBounds(430, 81, 20, 20);
		contentPane.add(lblM_14);
		
		JLabel lblM_15 = new JLabel("M16");
		lblM_15.setBounds(460, 81, 20, 20);
		contentPane.add(lblM_15);
		
		JLabel lblM_16 = new JLabel("M17");
		lblM_16.setBounds(490, 81, 20, 20);
		contentPane.add(lblM_16);
		
		JLabel lblM_17 = new JLabel("M18");
		lblM_17.setBounds(520, 81, 20, 20);
		contentPane.add(lblM_17);
		
		JLabel lblM_18 = new JLabel("M19");
		lblM_18.setBounds(550, 81, 20, 20);
		contentPane.add(lblM_18);
		
		JLabel lblM_19 = new JLabel("M20");
		lblM_19.setBounds(580, 81, 20, 20);
		contentPane.add(lblM_19);
		
		JLabel lblN = new JLabel("N1");
		lblN.setBounds(10, 91, 20, 20);
		contentPane.add(lblN);
		
		JLabel lblN_1 = new JLabel("N2");
		lblN_1.setBounds(40, 91, 20, 20);
		contentPane.add(lblN_1);
		
		JLabel lblN_2 = new JLabel("N3");
		lblN_2.setBounds(70, 91, 20, 20);
		contentPane.add(lblN_2);
		
		JLabel lblN_3 = new JLabel("N4");
		lblN_3.setBounds(100, 91, 20, 20);
		contentPane.add(lblN_3);
		
		JLabel lblN_4 = new JLabel("N5");
		lblN_4.setBounds(130, 91, 20, 20);
		contentPane.add(lblN_4);
		
		JLabel lblN_5 = new JLabel("N6");
		lblN_5.setBounds(160, 91, 20, 20);
		contentPane.add(lblN_5);
		
		JLabel lblN_6 = new JLabel("N7");
		lblN_6.setBounds(190, 91, 20, 20);
		contentPane.add(lblN_6);
		
		JLabel lblN_7 = new JLabel("N8");
		lblN_7.setBounds(220, 91, 20, 20);
		contentPane.add(lblN_7);
		
		JLabel lblN_8 = new JLabel("N9");
		lblN_8.setBounds(250, 91, 20, 20);
		contentPane.add(lblN_8);
		
		JLabel lblN_9 = new JLabel("N10");
		lblN_9.setBounds(280, 91, 20, 20);
		contentPane.add(lblN_9);
		
		JLabel lblN_10 = new JLabel("N11");
		lblN_10.setBounds(310, 91, 20, 20);
		contentPane.add(lblN_10);
		
		JLabel lblN_31 = new JLabel("N12");
		lblN_31.setBounds(340, 91, 20, 20);
		contentPane.add(lblN_31);
		
		JLabel lblN_12 = new JLabel("N13");
		lblN_12.setBounds(370, 91, 20, 20);
		contentPane.add(lblN_12);
		
		JLabel lblN_13 = new JLabel("N14");
		lblN_13.setBounds(400, 91, 20, 20);
		contentPane.add(lblN_13);
		
		JLabel lblN_14 = new JLabel("N15");
		lblN_14.setBounds(430, 91, 20, 20);
		contentPane.add(lblN_14);
		
		JLabel lblN_15 = new JLabel("N16");
		lblN_15.setBounds(460, 91, 20, 20);
		contentPane.add(lblN_15);
		
		JLabel lblN_16 = new JLabel("N17");
		lblN_16.setBounds(490, 91, 20, 20);
		contentPane.add(lblN_16);
		
		JLabel lblN_17 = new JLabel("N18");
		lblN_17.setBounds(520, 91, 20, 20);
		contentPane.add(lblN_17);
		
		JLabel lblN_18 = new JLabel("N19");
		lblN_18.setBounds(550, 91, 20, 20);
		contentPane.add(lblN_18);
		
		JLabel lblN_19 = new JLabel("N20");
		lblN_19.setBounds(580, 91, 20, 20);
		contentPane.add(lblN_19);
		
		OQabel lblO = new OQabel("O1");
		lblO.setBounds(10, 101, 20, 20);
		contentPane.add(lblO);
		
		OQabel lblO_1 = new OQabel("O2");
		lblO_1.setBounds(40, 101, 20, 20);
		contentPane.add(lblO_1);
		
		OQabel lblO_2 = new OQabel("O3");
		lblO_2.setBounds(70, 101, 20, 20);
		contentPane.add(lblO_2);
		
		OQabel lblO_3 = new OQabel("O4");
		lblO_3.setBounds(100, 101, 20, 20);
		contentPane.add(lblO_3);
		
		OQabel lblO_4 = new OQabel("O5");
		lblO_4.setBounds(130, 101, 20, 20);
		contentPane.add(lblO_4);
		
		OQabel lblO_5 = new OQabel("O6");
		lblO_5.setBounds(160, 101, 20, 20);
		contentPane.add(lblO_5);
		
		OQabel lblO_6 = new OQabel("O7");
		lblO_6.setBounds(190, 101, 20, 20);
		contentPane.add(lblO_6);
		
		OQabel lblO_7 = new OQabel("O8");
		lblO_7.setBounds(220, 101, 20, 20);
		contentPane.add(lblO_7);
		
		OQabel lblO_8 = new OQabel("O9");
		lblO_8.setBounds(250, 101, 20, 20);
		contentPane.add(lblO_8);
		
		OQabel lblO_9 = new OQabel("O10");
		lblO_9.setBounds(280, 101, 20, 20);
		contentPane.add(lblO_9);
		
		OQabel lblO_10 = new OQabel("O11");
		lblO_10.setBounds(310, 101, 20, 20);
		contentPane.add(lblO_10);
		
		OQabel lblO_101 = new OQabel("O12");
		lblO_101.setBounds(340, 101, 20, 20);
		contentPane.add(lblO_101);
		
		OQabel lblO_12 = new OQabel("O13");
		lblO_12.setBounds(370, 101, 20, 20);
		contentPane.add(lblO_12);
		
		OQabel lblO_13 = new OQabel("O14");
		lblO_13.setBounds(400, 101, 20, 20);
		contentPane.add(lblO_13);
		
		OQabel lblO_14 = new OQabel("O15");
		lblO_14.setBounds(430, 101, 20, 20);
		contentPane.add(lblO_14);
		
		OQabel lblO_15 = new OQabel("O16");
		lblO_15.setBounds(460, 101, 20, 20);
		contentPane.add(lblO_15);
		
		OQabel lblO_16 = new OQabel("O17");
		lblO_16.setBounds(490, 101, 20, 20);
		contentPane.add(lblO_16);
		
		OQabel lblO_17 = new OQabel("O18");
		lblO_17.setBounds(520, 101, 20, 20);
		contentPane.add(lblO_17);
		
		OQabel lblO_18 = new OQabel("O19");
		lblO_18.setBounds(550, 101, 20, 20);
		contentPane.add(lblO_18);
		
		OQabel lblO_19 = new OQabel("O20");
		lblO_19.setBounds(580, 101, 20, 20);
		contentPane.add(lblO_19);
		
		JLabel lblP = new JLabel("P1");
		lblP.setBounds(10, 111, 20, 20);
		contentPane.add(lblP);
		
		JLabel lblP_1 = new JLabel("P2");
		lblP_1.setBounds(40, 111, 20, 20);
		contentPane.add(lblP_1);
		
		JLabel lblP_2 = new JLabel("P3");
		lblP_2.setBounds(70, 111, 20, 20);
		contentPane.add(lblP_2);
		
		JLabel lblP_3 = new JLabel("P4");
		lblP_3.setBounds(100, 111, 20, 20);
		contentPane.add(lblP_3);
		
		JLabel lblP_4 = new JLabel("P5");
		lblP_4.setBounds(130, 111, 20, 20);
		contentPane.add(lblP_4);
		
		JLabel lblP_5 = new JLabel("P6");
		lblP_5.setBounds(160, 111, 20, 20);
		contentPane.add(lblP_5);
		
		JLabel lblP_6 = new JLabel("P7");
		lblP_6.setBounds(190, 111, 20, 20);
		contentPane.add(lblP_6);
		
		JLabel lblP_7 = new JLabel("P8");
		lblP_7.setBounds(220, 111, 20, 20);
		contentPane.add(lblP_7);
		
		JLabel lblP_8 = new JLabel("P9");
		lblP_8.setBounds(250, 111, 20, 20);
		contentPane.add(lblP_8);
		
		JLabel lblP_9 = new JLabel("P10");
		lblP_9.setBounds(280, 111, 20, 20);
		contentPane.add(lblP_9);
		
		JLabel lblP_10 = new JLabel("P11");
		lblP_10.setBounds(310, 111, 20, 20);
		contentPane.add(lblP_10);
		
		JLabel lblP_111 = new JLabel("P12");
		lblP_111.setBounds(340, 111, 20, 20);
		contentPane.add(lblP_111);
		
		JLabel lblP_12 = new JLabel("P13");
		lblP_12.setBounds(370, 111, 20, 20);
		contentPane.add(lblP_12);
		
		JLabel lblP_13 = new JLabel("P14");
		lblP_13.setBounds(400, 111, 20, 20);
		contentPane.add(lblP_13);
		
		JLabel lblP_14 = new JLabel("P15");
		lblP_14.setBounds(430, 111, 20, 20);
		contentPane.add(lblP_14);
		
		JLabel lblP_15 = new JLabel("P16");
		lblP_15.setBounds(460, 111, 20, 20);
		contentPane.add(lblP_15);
		
		JLabel lblP_16 = new JLabel("P17");
		lblP_16.setBounds(490, 111, 20, 20);
		contentPane.add(lblP_16);
		
		JLabel lblP_17 = new JLabel("P18");
		lblP_17.setBounds(520, 111, 20, 20);
		contentPane.add(lblP_17);
		
		JLabel lblP_18 = new JLabel("P19");
		lblP_18.setBounds(550, 111, 20, 20);
		contentPane.add(lblP_18);
		
		JLabel lblP_19 = new JLabel("P20");
		lblP_19.setBounds(580, 111, 20, 20);
		contentPane.add(lblP_19);
		
		JLabel lblQ = new JLabel("Q1");
		lblQ.setBounds(10, 121, 20, 20);
		contentPane.add(lblQ);
		
		JLabel lblQ_1 = new JLabel("Q2");
		lblQ_1.setBounds(40, 121, 20, 20);
		contentPane.add(lblQ_1);
		
		JLabel lblQ_2 = new JLabel("Q3");
		lblQ_2.setBounds(70, 121, 20, 20);
		contentPane.add(lblQ_2);
		
		JLabel lblQ_3 = new JLabel("Q4");
		lblQ_3.setBounds(100, 121, 20, 20);
		contentPane.add(lblQ_3);
		
		JLabel lblQ_4 = new JLabel("Q5");
		lblQ_4.setBounds(130, 121, 20, 20);
		contentPane.add(lblQ_4);
		
		JLabel lblQ_5 = new JLabel("Q6");
		lblQ_5.setBounds(160, 121, 20, 20);
		contentPane.add(lblQ_5);
		
		JLabel lblQ_6 = new JLabel("Q7");
		lblQ_6.setBounds(190, 121, 20, 20);
		contentPane.add(lblQ_6);
		
		JLabel lblQ_7 = new JLabel("Q8");
		lblQ_7.setBounds(220, 121, 20, 20);
		contentPane.add(lblQ_7);
		
		JLabel lblQ_8 = new JLabel("Q9");
		lblQ_8.setBounds(250, 121, 20, 20);
		contentPane.add(lblQ_8);
		
		JLabel lblQ_9 = new JLabel("Q10");
		lblQ_9.setBounds(280, 121, 20, 20);
		contentPane.add(lblQ_9);
		
		JLabel lblQ_10 = new JLabel("Q11");
		lblQ_10.setBounds(310, 121, 20, 20);
		contentPane.add(lblQ_10);
		
		JLabel lblQ_111 = new JLabel("Q12");
		lblQ_111.setBounds(340, 111, 20, 20);
		contentPane.add(lblQ_111);
		
		JLabel lblQ_12 = new JLabel("Q13");
		lblQ_12.setBounds(370, 121, 20, 20);
		contentPane.add(lblQ_12);
		
		JLabel lblQ_13 = new JLabel("Q14");
		lblQ_13.setBounds(400, 121, 20, 20);
		contentPane.add(lblQ_13);
		
		JLabel lblQ_14 = new JLabel("Q15");
		lblQ_14.setBounds(430, 121, 20, 20);
		contentPane.add(lblQ_14);
		
		JLabel lblQ_15 = new JLabel("Q16");
		lblQ_15.setBounds(460, 121, 20, 20);
		contentPane.add(lblQ_15);
		
		JLabel lblQ_16 = new JLabel("Q17");
		lblQ_16.setBounds(490, 121, 20, 20);
		contentPane.add(lblQ_16);
		
		JLabel lblQ_17 = new JLabel("Q18");
		lblQ_17.setBounds(520, 121, 20, 20);
		contentPane.add(lblQ_17);
		
		JLabel lblQ_18 = new JLabel("Q19");
		lblQ_18.setBounds(550, 121, 20, 20);
		contentPane.add(lblQ_18);
		
		JLabel lblQ_19 = new JLabel("Q20");
		lblQ_19.setBounds(580, 121, 20, 20);
		contentPane.add(lblQ_19);
	}
}
