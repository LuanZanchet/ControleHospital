package unoesc.edu.hospital.desktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaInicial extends JFrame {
	
	private static final long serialVersionUID = -4533887330617702150L;
	private javax.swing.JButton jbtFechar;
	private javax.swing.JButton jbtInternacao;
	private javax.swing.JButton jbtPaciente;
	private javax.swing.JButton jbtMedico;
	private javax.swing.JButton jbtHospital;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel jLabel2;

	TelaInicial() {
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jbtFechar = new javax.swing.JButton();
		jbtInternacao = new javax.swing.JButton();
		jbtPaciente = new javax.swing.JButton();
		jbtMedico = new javax.swing.JButton();
		jbtHospital = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();

		setVisible(true);
		setLayout(null);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jLabel1.setIcon(new javax.swing.ImageIcon("img/Principal.jpg")); // NOI18N

		jbtFechar.setBackground(new java.awt.Color(255, 255, 255));
		jbtFechar.setText("X");
		jbtFechar.setBorderPainted(false);
		jbtFechar.setContentAreaFilled(false);
		jbtInternacao.setBackground(new java.awt.Color(102, 102, 102));
		jbtInternacao.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
		jbtInternacao.setForeground(new java.awt.Color(102, 102, 102));
		jbtInternacao.setText("Internações");
		jbtInternacao.setBorderPainted(false);
		jbtInternacao.setContentAreaFilled(false);

		jbtPaciente.setBackground(new java.awt.Color(102, 102, 102));
		jbtPaciente.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
		jbtPaciente.setForeground(new java.awt.Color(102, 102, 102));
		jbtPaciente.setText("Pacientes");
		jbtPaciente.setBorderPainted(false);
		jbtPaciente.setContentAreaFilled(false);

		jbtMedico.setBackground(new java.awt.Color(102, 102, 102));
		jbtMedico.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
		jbtMedico.setForeground(new java.awt.Color(102, 102, 102));
		jbtMedico.setText("Médicos");
		jbtMedico.setBorderPainted(false);
		jbtMedico.setContentAreaFilled(false);

		jbtHospital.setBackground(new java.awt.Color(102, 102, 102));
		jbtHospital.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
		jbtHospital.setForeground(new java.awt.Color(102, 102, 102));
		jbtHospital.setText("Hospital");
		jbtHospital.setBorderPainted(false);
		jbtHospital.setContentAreaFilled(false);

		jLabel3.setBackground(new java.awt.Color(204, 204, 204));
		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(204, 204, 204));
		jLabel3.setText("_____________________________________________________________");

		jLabel4.setBackground(new java.awt.Color(204, 204, 204));
		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(204, 204, 204));
		jLabel4.setText("_____________________________________________________________");

		jLabel5.setBackground(new java.awt.Color(204, 204, 204));
		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(204, 204, 204));
		jLabel5.setText("_____________________________________________________________");

		jLabel2.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(204, 204, 204));
		jLabel2.setText("HS Plus 2.0");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.CENTER)
														.addComponent(jLabel2)
														.addComponent(
																jbtInternacao)
														.addComponent(
																jbtPaciente)
														.addComponent(jbtHospital)
														.addComponent(jbtMedico)
														.addComponent(jLabel3)
														.addComponent(jLabel4)
														.addComponent(jLabel5))
										.addGap(122, 122, 122))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(
												jbtFechar,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												66,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabel1)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jbtFechar,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												32,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(50, 50, 50)
										.addComponent(jLabel2)
										.addGap(60, 60, 60)
										.addComponent(jbtInternacao)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel3)
										.addGap(3, 3, 3)
										.addComponent(jbtPaciente)
										.addGap(8, 8, 8)
										.addComponent(jLabel4)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jbtHospital)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel5).addGap(2, 2, 2)
										.addComponent(jbtMedico)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		jbtInternacao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new InternacaoControle();
			}
		});
		jbtPaciente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new PacienteControle();
			}
		});
		jbtHospital.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new HospitalControle();
			}
		});
		jbtMedico.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new MedicoControle();
			}
		});
		jbtFechar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int resposta = JOptionPane.showConfirmDialog(getContentPane(),
						"Deseja mesmo cancelar e sair?", "Confirmar",
						JOptionPane.OK_CANCEL_OPTION);
				if (resposta == 0) {
					System.exit(EXIT_ON_CLOSE);
				}
			}
		});
		pack();
		setLayout(null);
		setTitle("Tela Inicial");
		setLocationRelativeTo(null);
		setSize(1276, 623);
		setResizable(false);
		dispose();
		setUndecorated(true);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TelaInicial();

	}

}
