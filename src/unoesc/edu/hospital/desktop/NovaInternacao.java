package unoesc.edu.hospital.desktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import unoesc.edu.hospital.dao.HospitalDAO;
import unoesc.edu.hospital.dao.InternacaoDAO;
import unoesc.edu.hospital.dao.MedicoDAO;
import unoesc.edu.hospital.dao.PacienteDAO;
import unoesc.edu.hospital.dao.PagamentoDAO;
import unoesc.edu.hospital.model.Hospital;
import unoesc.edu.hospital.model.Internacao;
import unoesc.edu.hospital.model.Medico;
import unoesc.edu.hospital.model.Paciente;
import unoesc.edu.hospital.model.Pagamento;

public class NovaInternacao extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtCadastrar;
    private javax.swing.JButton jbtFechar;
    private javax.swing.JComboBox<String> jcbCodigoCID;
    private javax.swing.JComboBox<String> jcbHospital;
    private javax.swing.JComboBox<String> jcbMedico;
    private javax.swing.JComboBox<String> jcbPaciente;
    private javax.swing.JLabel jlbNomeTela;
    private javax.swing.JTextField jtfCOdigoAIH;
    private javax.swing.JTextField jtfDataAlta;
    private javax.swing.JTextField jtfDataInternacao;
    private javax.swing.JTextField jtfDataPagamento;
    private javax.swing.JTextField jtfNumeroQuarto;
    private javax.swing.JTextField jtfValorDiaria;
    private javax.swing.JTextField jtfValorPago;
    
    MedicoDAO medicoDao = new MedicoDAO();
    PacienteDAO pacienteDao = new PacienteDAO();
    HospitalDAO hospitalDao = new HospitalDAO();
    InternacaoDAO internacaoDao = new InternacaoDAO();
    PagamentoDAO pagamentoDao = new PagamentoDAO();
    Medico medico = new Medico();
    Paciente paciente = new Paciente();
    Hospital hospital = new Hospital();
    
	NovaInternacao(){
		jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlbNomeTela = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfCOdigoAIH = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfNumeroQuarto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfValorDiaria = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfDataInternacao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfDataAlta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfValorPago = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfDataPagamento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcbCodigoCID = new javax.swing.JComboBox<String>();
        jcbPaciente = new javax.swing.JComboBox<String>();
        jLabel5 = new javax.swing.JLabel();
        jcbHospital = new javax.swing.JComboBox<String>();
        jLabel7 = new javax.swing.JLabel();
        jcbMedico = new javax.swing.JComboBox<String>();
        jLabel12 = new javax.swing.JLabel();
        jbtFechar = new javax.swing.JButton();
        jbtCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("img/Internacao2.jpg")); // NOI18N

        jlbNomeTela.setFont(new java.awt.Font("Leelawadee", 0, 60)); // NOI18N
        jlbNomeTela.setForeground(new java.awt.Color(153, 153, 153));
        jlbNomeTela.setText("Internações");

        jLabel2.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Codigo AIH");

        jtfCOdigoAIH.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Numero Quarto");

        jtfNumeroQuarto.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N
        jLabel6.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Valor diária");

        jtfValorDiaria.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N
        jLabel8.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Data Internação");

        jtfDataInternacao.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N
        jLabel9.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Data Alta");

        jtfDataAlta.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N
        jLabel10.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Valor Pago");

        jtfValorPago.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N
        jLabel11.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Data Pagamento");

        jtfDataPagamento.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N
        jLabel4.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Codigo CID");

        jcbCodigoCID.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N
        jcbPaciente.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Paciente");

        jcbHospital.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Hospital");

        jcbMedico.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Medico");

        jbtFechar.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jbtFechar.setText("X");
        jbtFechar.setContentAreaFilled(false);
        jbtFechar.setDefaultCapable(false);
        jbtCadastrar.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jbtCadastrar.setText("Cadastrar");
        jbtCadastrar.setContentAreaFilled(false);
        jbtCadastrar.setDefaultCapable(false);
        jcbCodigoCID.addItem("345542");
        jcbCodigoCID.addItem("345541");
        jcbCodigoCID.addItem("345540");
        jcbCodigoCID.addItem("345539");
        jcbCodigoCID.addItem("345543");
        jcbCodigoCID.addItem("345544");
        jcbCodigoCID.addItem("345545");
        for(Medico medico : medicoDao.listarTodos()){
        jcbMedico.addItem(medico.getNome());
        }
        for(Paciente paciente: pacienteDao.listarTodos()){
        jcbPaciente.addItem(paciente.getNome());
        }
        for(Hospital hospital: hospitalDao.listarTodos()){
        	jcbHospital.addItem(hospital.getNome());
        	}
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbNomeTela)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfCOdigoAIH)
                                .addComponent(jtfNumeroQuarto)
                                .addComponent(jtfValorDiaria)
                                .addComponent(jtfDataInternacao)
                                .addComponent(jtfDataAlta)
                                .addComponent(jtfValorPago)
                                .addComponent(jtfDataPagamento)
                                .addComponent(jcbCodigoCID, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jcbHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jcbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jcbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jbtFechar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtCadastrar)
                        .addGap(32, 32, 32)))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtFechar)
                        .addGap(422, 422, 422)
                        .addComponent(jbtCadastrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbNomeTela)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jcbCodigoCID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCOdigoAIH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfNumeroQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtfValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtfDataInternacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jtfDataAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jtfValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jtfDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jcbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jcbHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jcbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jbtCadastrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				Internacao internacao = new Internacao();
				Pagamento pagamento = new Pagamento();
				if (jtfCOdigoAIH.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"Codigo AIH obrigatorio");
				} else {
					internacao.setCodigoAIH(Long.parseLong(jtfCOdigoAIH.getText()));
					if (!jtfNumeroQuarto.getText().isEmpty()) {
						internacao.setNumeroQuarto(Integer.parseInt(jtfNumeroQuarto.getText()));
					}
					if (!jtfValorDiaria.getText().isEmpty()) {
						internacao.setValorDiaria(Double.parseDouble(jtfValorDiaria.getText()));
					}
					if (!jtfValorPago.getText().isEmpty()) {
						pagamento.setValor(Double.parseDouble(jtfValorPago.getText()));
					}
					if(!jtfDataAlta.getText().isEmpty()){
						String dataRecebida = jtfDataAlta.getText();
						DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
						try {
							Date dt1 = df1.parse(dataRecebida);
							internacao.setDataAlta(dt1);
						} catch (ParseException e) {
							e.printStackTrace();
						}
						}
					if(!jtfDataInternacao.getText().isEmpty()){
						String dataRecebida1 = jtfDataInternacao.getText();
						DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
						try {
							Date dt1 = df1.parse(dataRecebida1);
							internacao.setDataInternacao(dt1);
						} catch (ParseException e) {
							e.printStackTrace();
						}
						}
					if(!jtfDataPagamento.getText().isEmpty()){
						String dataRecebida1 = jtfDataPagamento.getText();
						DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
						try {
							Date dt1 = df1.parse(dataRecebida1);
							pagamento.setData(dt1);
						} catch (ParseException e) {
							e.printStackTrace();
						}
						}
					internacao.setCodigoCID((long) jcbCodigoCID.getSelectedIndex());
					internacao.setMedico(medicoDao.listarTodos().get(jcbMedico.getSelectedIndex()));
					internacao.setHospital(hospitalDao.listarTodos().get(jcbHospital.getSelectedIndex()));
					internacao.setPaciente(pacienteDao.listarTodos().get(jcbPaciente.getSelectedIndex()));
					pagamentoDao.store(pagamento);
					internacaoDao.store(internacao);

					

					JOptionPane.showMessageDialog(null,
							"Internação Cadastrada Com Sucesso!");

					dispose();
					new InternacaoControle();

				}

			}
		});
        jbtFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new InternacaoControle();
			}
		});
        
        
        pack();
        setSize(798, 506);
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
		new NovaInternacao();
		
	}
	
}
