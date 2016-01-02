package unoesc.edu.hospital.desktop;

import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import unoesc.edu.hospital.dao.InternacaoDAO;
import unoesc.edu.hospital.dao.PacienteDAO;
import unoesc.edu.hospital.model.Internacao;
import unoesc.edu.hospital.model.Paciente;

public class PacienteControle extends JFrame {

	private static final long serialVersionUID = -7286008447945928627L;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane9;
	private javax.swing.JButton jbtAlterar;
	private javax.swing.JButton jbtBuscar;
	private javax.swing.JButton jbtConsultar;
	private javax.swing.JButton jbtExcluir;
	private javax.swing.JButton jbtFechar;
	private javax.swing.JButton jbtMostrarTodos;
	private javax.swing.JButton jbtNovo;
	private javax.swing.JLabel jlbNomeTela;
	private javax.swing.JRadioButton jrbCodigo;
	private javax.swing.JRadioButton jrbNome;
	private javax.swing.JTable jtbTabela;
	private javax.swing.JTextField jtfPesquisa;
	private DefaultTableModel dtmTodos = new DefaultTableModel();
	private ScrollPane scpRolagem = new ScrollPane();
	private DefaultTableModel dtmTabela = new DefaultTableModel();
	private int n = 1,selecionado,procurar = 0, aux = 0;
	Paciente paciente = new Paciente();
	PacienteDAO pacienteDao = new PacienteDAO();
	InternacaoDAO internacaoDao = new InternacaoDAO();
	

	PacienteControle() {
		jPanel1 = new javax.swing.JPanel();
		jlbNomeTela = new javax.swing.JLabel();
		jScrollPane9 = new javax.swing.JScrollPane();
		jtbTabela = new javax.swing.JTable();
		jLabel8 = new javax.swing.JLabel();
		jrbCodigo = new javax.swing.JRadioButton();
		jrbNome = new javax.swing.JRadioButton();
		jtfPesquisa = new javax.swing.JTextField();
		jbtBuscar = new javax.swing.JButton();
		jbtMostrarTodos = new javax.swing.JButton();
		jbtFechar = new javax.swing.JButton();
		jbtNovo = new javax.swing.JButton();
		jbtConsultar = new javax.swing.JButton();
		jbtAlterar = new javax.swing.JButton();
		jbtExcluir = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jlbNomeTela.setFont(new java.awt.Font("Leelawadee", 0, 60)); // NOI18N
		jlbNomeTela.setForeground(new java.awt.Color(153, 153, 153));
		jlbNomeTela.setText("Pacientes");

		jtbTabela.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N
		jtbTabela.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null } }, new String[] {
						"Codigo", "Paciente", "Telefone" }) {
			private static final long serialVersionUID = 1L;
			boolean[] canEdit = new boolean[] { false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jtbTabela.setSelectionBackground(new java.awt.Color(153, 153, 0));
		jtbTabela.getTableHeader().setReorderingAllowed(false);
		jScrollPane9.setViewportView(jtbTabela);
		if (jtbTabela.getColumnModel().getColumnCount() > 0) {
			jtbTabela.getColumnModel().getColumn(0).setResizable(false);
			jtbTabela.getColumnModel().getColumn(1).setResizable(false);
			jtbTabela.getColumnModel().getColumn(2).setResizable(false);
		}
		jtbTabela.setModel(dtmTabela);

		dtmTabela.setColumnCount(3);
		dtmTabela.setRowCount(n);
		dtmTabela.setValueAt("Código", 0, 0);
		dtmTabela.setValueAt("Paciente", 0, 1);
		dtmTabela.setValueAt("Telefone", 0, 2);
		int linha = 1;
		dtmTodos.setColumnCount(3);
		for (Paciente paciente : pacienteDao.listarTodos()) {
			dtmTabela.setRowCount(dtmTabela.getRowCount() + 1);
			dtmTabela.setValueAt(paciente.getCodigo(), linha, 0);
			dtmTabela.setValueAt(paciente.getNome(), linha, 1);
			dtmTabela.setValueAt(paciente.getTelefone(), linha, 2);
			linha++;

		}

		jLabel8.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
		jLabel8.setForeground(new java.awt.Color(102, 102, 102));
		jLabel8.setText("Buscar por:");

		jrbCodigo.setBackground(new java.awt.Color(255, 255, 255));
		jrbCodigo.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
		jrbCodigo.setForeground(new java.awt.Color(102, 102, 102));
		jrbCodigo.setText("Codigo");

		jrbNome.setBackground(new java.awt.Color(255, 255, 255));
		jrbNome.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
		jrbNome.setForeground(new java.awt.Color(102, 102, 102));
		jrbNome.setText("Nome");

		jtfPesquisa.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N

		jbtBuscar.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
		jbtBuscar.setForeground(new java.awt.Color(102, 102, 102));
		jbtBuscar.setText("Buscar");
		jbtBuscar.setContentAreaFilled(false);
		jbtBuscar.setDefaultCapable(false);

		jbtMostrarTodos.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
		jbtMostrarTodos.setForeground(new java.awt.Color(102, 102, 102));
		jbtMostrarTodos.setText("Mostrar todos");
		jbtMostrarTodos.setContentAreaFilled(false);
		jbtMostrarTodos.setDefaultCapable(false);

		jbtFechar.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
		jbtFechar.setText("X");
		jbtFechar.setContentAreaFilled(false);
		jbtFechar.setDefaultCapable(false);

		jbtNovo.setBackground(new java.awt.Color(102, 102, 102));
		jbtNovo.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
		jbtNovo.setForeground(new java.awt.Color(102, 102, 102));
		jbtNovo.setText("Novo");
		jbtNovo.setBorderPainted(false);
		jbtNovo.setContentAreaFilled(false);

		jbtConsultar.setBackground(new java.awt.Color(102, 102, 102));
		jbtConsultar.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
		jbtConsultar.setForeground(new java.awt.Color(102, 102, 102));
		jbtConsultar.setText("Consultar");
		jbtConsultar.setBorderPainted(false);
		jbtConsultar.setContentAreaFilled(false);

		jbtAlterar.setBackground(new java.awt.Color(102, 102, 102));
		jbtAlterar.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
		jbtAlterar.setForeground(new java.awt.Color(102, 102, 102));
		jbtAlterar.setText("Alterar");
		jbtAlterar.setBorderPainted(false);
		jbtAlterar.setContentAreaFilled(false);

		jbtExcluir.setBackground(new java.awt.Color(102, 102, 102));
		jbtExcluir.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
		jbtExcluir.setForeground(new java.awt.Color(102, 102, 102));
		jbtExcluir.setText("Excluir");
		jbtExcluir.setBorderPainted(false);
		jbtExcluir.setContentAreaFilled(false);

		jLabel5.setBackground(new java.awt.Color(204, 204, 204));
		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(204, 204, 204));
		jLabel5.setText("_____________________________________________________________");

		jLabel4.setBackground(new java.awt.Color(204, 204, 204));
		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(204, 204, 204));
		jLabel4.setText("_____________________________________________________________");

		jLabel3.setBackground(new java.awt.Color(204, 204, 204));
		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(204, 204, 204));
		jLabel3.setText("_____________________________________________________________");

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
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(14,
																												14,
																												14)
																										.addComponent(
																												jScrollPane9,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												384,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(58,
																												58,
																												58)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.CENTER)
																														.addComponent(
																																jbtNovo)
																														.addComponent(
																																jbtConsultar)
																														.addComponent(
																																jbtAlterar)
																														.addComponent(
																																jbtExcluir)
																														.addComponent(
																																jLabel3)
																														.addComponent(
																																jLabel4)
																														.addComponent(
																																jLabel5)))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jlbNomeTela)
																										.addGap(372,
																												372,
																												372))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jLabel8)
																														.addGroup(
																																jPanel1Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addComponent(
																																				jrbNome)
																																		.addComponent(
																																				jrbCodigo)))
																										.addGap(18,
																												18,
																												18)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jtfPesquisa,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				239,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																		.addComponent(
																																				jbtBuscar))
																														.addComponent(
																																jbtMostrarTodos))))
																		.addGap(216,
																				216,
																				216))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jbtFechar)
																		.addGap(191,
																				191,
																				191)))));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jlbNomeTela))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(23,
																				23,
																				23)
																		.addComponent(
																				jbtFechar)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel8)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												11, Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jrbCodigo)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jrbNome)
																										.addGap(40,
																												40,
																												40))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jbtBuscar)
																														.addComponent(
																																jtfPesquisa,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																25,
																																javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jbtMostrarTodos)
																										.addGap(18,
																												18,
																												18)))
																		.addComponent(
																				jScrollPane9,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				301,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jbtNovo)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel3)
																		.addGap(3,
																				3,
																				3)
																		.addComponent(
																				jbtConsultar)
																		.addGap(8,
																				8,
																				8)
																		.addComponent(
																				jLabel4)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jbtAlterar)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel5)
																		.addGap(2,
																				2,
																				2)
																		.addComponent(
																				jbtExcluir)
																		.addGap(75,
																				75,
																				75)))
										.addGap(16, 16, 16)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 777,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		jbtBuscar.setBorderPainted(false);
		jbtMostrarTodos.setBorderPainted(false);
		jbtFechar.setBorderPainted(false);

		jbtFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int resposta = JOptionPane.showConfirmDialog(getContentPane(),
						"Deseja mesmo cancelar e sair?", "Confirmar",
						JOptionPane.OK_CANCEL_OPTION);
				if (resposta == 0) {
					dispose();
				}
			}
		});
		jbtNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Novo_Paciente();
			}
		});
		jbtConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionado = jtbTabela.getSelectedRow();
				if (selecionado == 0) {
					JOptionPane.showMessageDialog(null, "Não pode alterar essa linha");
				} else if (selecionado == -1) {
					JOptionPane.showMessageDialog(null, "Selecione o Paciente que deseja Visualizar");
				} else {
					if (aux == 1)
						selecionado = procurar;
					VisualizarPaciente tela = new VisualizarPaciente();
					tela.setValor1(selecionado - 1);
					dispose();
				}
			}
		});
		jbtAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionado = jtbTabela.getSelectedRow();
				if (selecionado == 0) {
					JOptionPane.showMessageDialog(null, "Não pode alterar essa linha");
				} else if (selecionado == -1) {
					JOptionPane.showMessageDialog(null, "Selecione o paciente que deseja alterar");
				} else {
					if (aux == 1)
						selecionado = procurar;
					AlterarPaciente tela = new AlterarPaciente();
					tela.setValor1(selecionado - 1);
					dispose();
				}
			}
		});

		jbtExcluir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				selecionado = jtbTabela.getSelectedRow() ;
				if (selecionado == 0) {
					JOptionPane.showMessageDialog(null,
							"Não pode excluir essa linha");
				} else if (selecionado == -1) {
					JOptionPane.showMessageDialog(null,
							"Selecione o Paciente que deseja excluir");
				} else {
	
				int auxx =0 ;
				for (Internacao internacao : internacaoDao.listarTodos()) {
					if (internacao.getPaciente().getCodigo().equals(pacienteDao.listarTodos().get(selecionado - 1).getCodigo())) {
							auxx = 1;
						
					}
				}
				if (auxx == 0) {
					pacienteDao.delete(pacienteDao.listarTodos().get(
							selecionado-1));
					JOptionPane.showMessageDialog(null, "Excluido Com Sucesso");
					dispose();
					new PacienteControle();
				}
				if (auxx == 1) {
					JOptionPane.showMessageDialog(null, "Não pode excluir esse Paciente");
					JOptionPane.showMessageDialog(null, "Existe Internações cadastradas no mesmo");
				}
				}

			}
		});

		pack();
		setSize(770, 527);
		setLayout(null);
		setTitle("Tela Inicial");
		setLocationRelativeTo(null);
		setResizable(false);
		dispose();
		setUndecorated(true);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		new PacienteControle();

	}

}
