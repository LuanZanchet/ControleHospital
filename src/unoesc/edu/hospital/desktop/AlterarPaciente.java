package unoesc.edu.hospital.desktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import unoesc.edu.hospital.dao.EnderecoDAO;
import unoesc.edu.hospital.dao.PacienteDAO;
import unoesc.edu.hospital.model.Endereco;
import unoesc.edu.hospital.model.Internacao;
import unoesc.edu.hospital.model.Paciente;

public class AlterarPaciente extends JFrame {
	private static final long serialVersionUID = 1473301601169465380L;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
    private JTextField jtfGuardaValor;
	private javax.swing.JButton jbtCadastrar;
	private javax.swing.JButton jbtFechar;
	private javax.swing.JTextField jtfBairro;
	private javax.swing.JTextField jtfCidade;
	private javax.swing.JTextField jtfCpf;
	private javax.swing.JTextField jtfIdade;
	private javax.swing.JTextField jtfNome;
	private javax.swing.JTextField jtfRg;
	private javax.swing.JTextField jtfRua;
	private javax.swing.JTextField jtfTelefone;
	private javax.swing.JTextField jtfUf;

	EnderecoDAO enderecoDao = new EnderecoDAO();
	PacienteDAO pacienteDao = new PacienteDAO();
	 public void setValor1(Integer a) {

		 jtfNome.setText(pacienteDao.listarTodos().get(a).getNome().toString());
			jtfCidade.setText(pacienteDao.listarTodos().get(a).getEndereco().getCidade().toString());
			jtfBairro.setText(pacienteDao.listarTodos().get(a).getEndereco().getBairro().toString());
			jtfUf.setText(pacienteDao.listarTodos().get(a).getEndereco().getUf().toString());
			jtfRua.setText(pacienteDao.listarTodos().get(a).getEndereco().getRua().toString());
			jtfTelefone.setText(pacienteDao.listarTodos().get(a).getTelefone().toString());
			jtfCpf.setText(pacienteDao.listarTodos().get(a).getCpf().toString());
			jtfIdade.setText(pacienteDao.listarTodos().get(a).getIdade().toString());
			jtfRg.setText(pacienteDao.listarTodos().get(a).getRg().toString());
	
}

	AlterarPaciente() {
		setVisible(true);
		setLayout(null);
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		 jtfGuardaValor = new JTextField();
		jtfNome = new javax.swing.JTextField();
		jtfCpf = new javax.swing.JTextField();
		jtfRg = new javax.swing.JTextField();
		jtfTelefone = new javax.swing.JTextField();
		jtfIdade = new javax.swing.JTextField();
		jtfBairro = new javax.swing.JTextField();
		jtfRua = new javax.swing.JTextField();
		jtfCidade = new javax.swing.JTextField();
		jtfUf = new javax.swing.JTextField();
		jbtCadastrar = new javax.swing.JButton();
		jbtFechar = new javax.swing.JButton();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jLabel1.setIcon(new javax.swing.ImageIcon("Img/Paciente.jpg")); // NOI18N

		jLabel2.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(102, 102, 102));
		jLabel2.setText("Nome:");

		jLabel3.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(102, 102, 102));
		jLabel3.setText("CPF:");

		jLabel4.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(102, 102, 102));
		jLabel4.setText("Idade:");

		jLabel5.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(102, 102, 102));
		jLabel5.setText("RG:");

		jLabel6.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(102, 102, 102));
		jLabel6.setText("Telefone:");

		jLabel7.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
		jLabel7.setForeground(new java.awt.Color(153, 153, 153));
		jLabel7.setText("Alterar pacientes");

		jLabel8.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
		jLabel8.setForeground(new java.awt.Color(102, 102, 102));
		jLabel8.setText("Bairro:");

		jLabel9.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
		jLabel9.setForeground(new java.awt.Color(102, 102, 102));
		jLabel9.setText("Rua:");

		jLabel10.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
		jLabel10.setForeground(new java.awt.Color(102, 102, 102));
		jLabel10.setText("Cidade:");

		jLabel11.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
		jLabel11.setForeground(new java.awt.Color(102, 102, 102));
		jLabel11.setText("UF:");

		jtfNome.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N
		jtfCpf.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N
		jtfRg.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N
		jtfTelefone.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N
		jtfIdade.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N
		jtfBairro.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N
		jtfRua.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N
		jtfCidade.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N
		jtfUf.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N
		jbtCadastrar.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
		jbtCadastrar.setText("Modificar");
		jbtCadastrar.setContentAreaFilled(false);
		jbtCadastrar.setDefaultCapable(false);
		jbtCadastrar.setBorderPainted(false);
		jbtFechar.setBorderPainted(false);
		jbtFechar.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
		jbtFechar.setText("X");
		jbtFechar.setContentAreaFilled(false);
		jbtFechar.setDefaultCapable(false);
		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addGap(115, 115, 115)
										.addComponent(jLabel7)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(jbtFechar)
										.addContainerGap())
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addComponent(jLabel1)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(46,
																				46,
																				46)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel2,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel3,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel5,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel4,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel6,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel8,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel9,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel10,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel11,
																								javax.swing.GroupLayout.Alignment.TRAILING))
																		.addGap(18,
																				18,
																				18)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jtfNome,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								173,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jtfCpf,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								173,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jtfRg,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								173,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jtfTelefone,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								173,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jtfIdade,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								173,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jtfBairro,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								173,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jtfRua,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								173,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jtfCidade,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								173,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jtfUf,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								173,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addContainerGap(
																				20,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jbtCadastrar)
																		.addGap(42,
																				42,
																				42)))));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jbtFechar)
																		.addGap(107,
																				107,
																				107)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel2)
																						.addComponent(
																								jtfNome,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel3)
																						.addComponent(
																								jtfCpf,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel5)
																						.addComponent(
																								jtfRg,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel4)
																						.addComponent(
																								jtfIdade,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel6)
																						.addComponent(
																								jtfTelefone,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel8)
																						.addComponent(
																								jtfBairro,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel9)
																						.addComponent(
																								jtfRua,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel10)
																						.addComponent(
																								jtfCidade,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel11)
																						.addComponent(
																								jtfUf,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				51,
																				Short.MAX_VALUE)
																		.addComponent(
																				jbtCadastrar)
																		.addGap(40,
																				40,
																				40))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel7)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jLabel1)))));

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
		jbtCadastrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				Endereco endereco = new Endereco();
				Paciente paciente = new Paciente();
				paciente = pacienteDao.listarTodos().get(Integer.valueOf(jtfGuardaValor.getText()));
				endereco = enderecoDao.listarTodos().get(Integer.valueOf(jtfGuardaValor.getText()));
				if (jtfNome.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"Nome é obrigatorio!");
				} else {
					paciente.setNome(jtfNome.getText());
					if (!jtfCpf.getText().isEmpty()) {
						paciente.setCpf(Long.parseLong(jtfCpf.getText()));
					}
					if (!jtfRg.getText().isEmpty()) {
						paciente.setRg(Long.parseLong(jtfRg.getText()));
					}
					if (!jtfIdade.getText().isEmpty()) {
						paciente.setIdade(Integer.parseInt(jtfIdade.getText()));
					}
					if (!jtfTelefone.getText().isEmpty()) {
						paciente.setTelefone(Long.parseLong(jtfTelefone
								.getText()));
					}
					if (!jtfBairro.getText().isEmpty()) {
						endereco.setBairro(jtfBairro.getText());
					}
					if (!jtfRua.getText().isEmpty()) {
						endereco.setRua(jtfRua.getText());
					}

					if (!jtfCidade.getText().isEmpty()) {
						endereco.setCidade(jtfCidade.getText());
					}
					if (!jtfUf.getText().isEmpty()) {
						endereco.setUf(jtfUf.getText());
					}
					

					
					enderecoDao.alter(endereco);
					paciente.setEndereco(endereco);
					pacienteDao.alter(paciente);

					JOptionPane.showMessageDialog(null,
							"Paciente modificado Com Sucesso!");

					dispose();
					new PacienteControle();

				}

			}
		});
		jbtFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new PacienteControle();
			}
		});

		pack();
		setSize(842, 535);
		setLayout(null);
		setTitle("NovoPaciente");
		setLocationRelativeTo(null);
		setResizable(false);
		dispose();
		setUndecorated(true);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

	public static void main(String[] args) {
		new AlterarPaciente();
	}

}
