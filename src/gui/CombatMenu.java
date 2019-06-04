package src.gui;

/* Zac 5/27/19
 * added button color and font
 * Carson 2019-06-02
 * I added all sorts of functionality including progressbars, and updating functions.
 */

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import src.character.Human;
import src.character.NonPlayer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JList;
//import Human.java;

public class CombatMenu extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8116636656495531817L;
	private JList<String> dialog;
	private static JProgressBar enemyHealth= new JProgressBar();
	private static JProgressBar enemyDefense= new JProgressBar();
	private static JProgressBar playerHealth= new JProgressBar();
	private static JProgressBar playerDefense= new JProgressBar();
	private static boolean mode = false;
	//private JprogressBar


	/**
	 * Create the panel.
	 */
	public CombatMenu() {
		
		
		setBackground(Color.GRAY);
		setLayout(null);
		
		// ------- CombatPanel -------
		JPanel CombatPanel = new JPanel();
		setBounds(800, 0, 200, 800);
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		add(CombatPanel);
		
		
		// labels
		
		JLabel lblNewLabel = new JLabel("COMBAT MENU");
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblNewLabel.setBounds(33, 13, 135, 29);
		add(lblNewLabel);
		
		
		// health
		JLabel lblHealth = new JLabel("HEALTH");
		lblHealth.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		lblHealth.setBounds(12, 80, 56, 16);
		add(lblHealth);
		
		
		playerHealth.setBounds(90, 80, 100, 16);
		add(playerHealth);
		
		
		// defense
		JLabel lblDefense = new JLabel("DEFENSE");
		lblDefense.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		lblDefense.setBounds(12, 118, 80, 16);
		add(lblDefense);
		
		playerDefense.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		playerDefense.setBounds(90, 118, 100, 16);
		add(playerDefense);
		
		
		// movement
		JLabel lblMovement = new JLabel("MOVEMENT:");
		lblMovement.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		lblMovement.setBounds(12, 163, 88, 16);
		add(lblMovement);
		
		JLabel lblMovementInt = new JLabel(Integer.toString(Human.MOVEMENT));
		lblMovementInt.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		lblMovementInt.setBounds(112, 163, 56, 16);
		add(lblMovementInt);
		
		
		
		// ------- btnAttack -------
		JButton btnMode = new JButton("ATTACK");
		btnMode.setBounds(33, 271, 122, 46);
		btnMode.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		btnMode.setForeground(new Color(247, 221, 0));
		btnMode.setBackground(new Color(14, 1, 141));
		add(btnMode);
		
		btnMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(mode) 
				{
					btnMode.setText("MOVE");
				}
				else 
				{
					btnMode.setText("ATTACK");
				}
				modeMethod(!(mode));
				mode = !(mode);
				
			}
		});
		
		
		
		// ------- btnBackpack -------
		JButton btnBackpack = new JButton("BACKPACK");
		btnBackpack.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		btnBackpack.setForeground(new Color(247, 221, 0));
		btnBackpack.setBackground(new Color(14, 1, 141));
		btnBackpack.setBounds(33, 352, 122, 46);
		add(btnBackpack);
		
		JButton btnEndTurn = new JButton("END TURN");
		btnEndTurn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				BattlePanel.getRoom().skipTurn();
			}});
		btnEndTurn.setForeground(new Color(247, 221, 0));
		btnEndTurn.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnEndTurn.setBackground(new Color(14, 1, 141));
		btnEndTurn.setBounds(33, 431, 122, 46);
		add(btnEndTurn);
		
		JLabel enemyHealthlbl = new JLabel("HEALTH");
		enemyHealthlbl.setFont(new Font("Dialog", Font.PLAIN, 12));
		enemyHealthlbl.setBounds(12, 545, 80, 16);
		add(enemyHealthlbl);
		
		JLabel lblEnemy = new JLabel("ENEMY");
		lblEnemy.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnemy.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblEnemy.setBounds(12, 497, 178, 16);
		add(lblEnemy);
		
		JLabel lblenemyDefense = new JLabel("DEFENSE");
		lblenemyDefense.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblenemyDefense.setBounds(12, 572, 80, 16);
		add(lblenemyDefense);
		
		enemyHealth.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		enemyHealth.setBounds(90, 545, 100, 16);
		add(enemyHealth);
		
		enemyDefense.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		enemyDefense.setBounds(90, 572, 100, 16);
		add(enemyDefense);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 599, 180, 190);
		add(scrollPane);
		
		dialog = new JList<String>();
		scrollPane.setViewportView(dialog);
		
		JLabel list = new JLabel("DIALOG");
		scrollPane.setColumnHeaderView(dialog);
		list.setHorizontalAlignment(SwingConstants.CENTER);
		list.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		
		btnBackpack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//-------------------------- go to Backpack Panel ---------------------
			
				
				GUIExtension1.switchPane (Backpack.getPane());

			
			}
		});
		
		
	} // CombatMenu constructor
	
	
	public static void update(NonPlayer enemy) 
	{
		enemyHealth.setMinimum(0);
		enemyHealth.setMaximum(enemy.getMaxHealth());
		enemyHealth.setValue(enemy.getHealth());
		enemyHealth.setToolTipText("Enemy Health is " + enemy.getHealth());
		
		
		enemyDefense.setMinimum(0);
		enemyDefense.setMaximum(enemy.getMaxDefense());
		enemyDefense.setValue(enemy.getDefense());
		enemyDefense.setToolTipText("Enemy Defense is" + enemy.getDefense());
		
		playerHealth.setMinimum(0);
		playerHealth.setMaximum(MainExecutable.getPlayer().getMaxHealth());
		playerHealth.setValue(MainExecutable.getPlayer().getHealth());
		playerHealth.setToolTipText("Your Health is " + MainExecutable.getPlayer().getHealth());
		
		playerDefense.setMinimum(0);
		playerDefense.setMaximum(MainExecutable.getPlayer().getMaxDefense());
		playerDefense.setValue(MainExecutable.getPlayer().getDefense());
		playerDefense.setToolTipText("Your Defense is " + MainExecutable.getPlayer().getDefense());
	}
	
	public static void modeMethod(boolean mode ) {
		BattlePanel.getRoom().setShowingMovement(mode);
		
		
	} // AttackMethod method


	/**
	 * @return the enemyHealth
	 */
	public JProgressBar getEnemyHealth() {
		return enemyHealth;
	}



	/**
	 * @param enemyHealth the enemyHealth to set
	 */
	public void setEnemyHealth(JProgressBar enemyHealth) {
		CombatMenu.enemyHealth = enemyHealth;
	}



	/**
	 * @return the enemyDefense
	 */
	public JProgressBar getEnemyDefense() {
		return enemyDefense;
	}



	/**
	 * @param enemyDefense the enemyDefense to set
	 */
	public void setEnemyDefense(JProgressBar enemyDefense) {
		CombatMenu.enemyDefense = enemyDefense;
	}

	/**
	 * @return the playerHealth
	 */
	public JProgressBar getPlayerHealth() {
		return playerHealth;
	}



	/**
	 * @param playerHealth the playerHealth to set
	 */
	public void setPlayerHealth(JProgressBar playerHealth) {
		CombatMenu.playerHealth = playerHealth;
	}



	/**
	 * @return the playerDefense
	 */
	public JProgressBar getPlayerDefense() {
		return playerDefense;
	}



	/**
	 * @param playerDefense the playerDefense to set
	 */
	public void setPlayerDefense(JProgressBar playerDefense) {
		CombatMenu.playerDefense = playerDefense;
	}


	/**
	 * @return the dialog
	 */
	public JList<String> getDialog() {
		return dialog;
	}


	/**
	 * @param dialog the dialog to set
	 */
	public void setDialog(JList<String> dialog) {
		this.dialog = dialog;
	}
} // CombatMenu class
