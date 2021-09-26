package August5;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

public class TypingTutorClass extends JFrame implements ActionListener {
	private JLabel lbltimer;
	private JLabel lblscore;
	private JLabel lblword;
	private JTextField lbltext;
	private JButton btnStart;
	private JButton btnStop;

	Timer timer = null;
	private boolean running = false;
	private int timeremaining = 0;
	private int score = 0;
	private String[] words = null;

	public TypingTutorClass(String[] samplewords) {
		GridLayout layout = new GridLayout(3, 2);
		super.setLayout(layout);

		Font font = new Font("Comic Sans MS", 1, 100);
		words = samplewords;

		lbltimer = new JLabel("Timer:");
		lbltimer.setFont(font);
		super.add(lbltimer);

		lblscore = new JLabel("Score:");
		lblscore.setFont(font);
		super.add(lblscore);

		lblword = new JLabel("Word:");
		lblword.setFont(font);
		super.add(lblword);

		lbltext = new JTextField();
		lbltext.setFont(font);
		super.add(lbltext);

		btnStart = new JButton("Start");
		btnStart.setFont(font);
		btnStart.addActionListener(this);
		super.add(btnStart);

		btnStop = new JButton("Stop");
		btnStop.setFont(font);
		// stop.setForeground("RED");
		btnStop.addActionListener(this);
		super.add(btnStop);

		super.setTitle("TypingTutor");
		super.setVisible(true);
		super.setExtendedState(MAXIMIZED_BOTH);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		setupthegame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnStart) {
			handleStart();
		} else if (e.getSource() == btnStop) {
			handleStop();
		} else if (e.getSource() == timer) {
			handleTimer();
		}

	}

	private void handleTimer() {
		timeremaining--;
		String actual, expected;
		actual = lbltext.getText();
		expected = lblword.getText();
		if (actual.equals(expected) && expected.length() > 0)
			score++;
		if (timeremaining < 0) {
			handleStop();
		} else {
			lbltimer.setText("Timer:" + timeremaining);
			lblscore.setText("Score:" + score);
			lbltext.setText("");
			btnStop.setEnabled(true);

			int ridx = (int) (Math.random() * words.length);
			lblword.setText(words[ridx]);
		}
	}

	private void handleStop() {
		timer.stop();
		int choice = JOptionPane.showConfirmDialog(this, "Score: " + score + ". Replay?");
		if (choice == JOptionPane.YES_OPTION) {
			setupthegame();
		} else if (choice == JOptionPane.NO_OPTION) {
			super.dispose();
		} else {
			if (timeremaining == -1)
				setupthegame();
			else
				timer.start();
		}

	}

	private void handleStart() {
		// JOptionPane.showMessageDialog(this,"Start was Clicked");
		if (running == true) {
			timer.stop();
			btnStop.setEnabled(false);
			lbltext.setEnabled(false);
			btnStart.setText("Resume");
			running = false;
		} else {
			timer.start();
			btnStart.setEnabled(true);
			lbltext.setEnabled(true);
			btnStart.setText("Pause");
			running = true;
		}

	}

	public void setupthegame() {
		timer = new Timer(3000, this);
		running = false;
		timeremaining = 50;
		score = 0;

		lbltimer.setText("Timer:" + timeremaining);
		lblscore.setText("Score:" + score);
		lblword.setText("");
		lbltext.setText("");

		btnStart.setText("Start");
		btnStop.setText("Stop");

		btnStop.setEnabled(false);
		lbltext.setEnabled(false);
	}

}