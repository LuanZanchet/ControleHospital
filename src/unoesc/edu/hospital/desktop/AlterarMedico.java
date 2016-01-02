package unoesc.edu.hospital.desktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import unoesc.edu.hospital.dao.EnderecoDAO;
import unoesc.edu.hospital.dao.MedicoDAO;
import unoesc.edu.hospital.model.Endereco;
import unoesc.edu.hospital.model.Medico;

public class AlterarMedico extends JFrame {

	private static final long serialVersionUID = 5270960960567764310L;
	private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel10;
	    private javax.swing.JLabel jLabel11;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private JTextField jtfGuardaValor;
	    private javax.swing.JLabel jLabel6;
	    private javax.swing.JLabel jLabel7;
	    private javax.swing.JLabel jLabel8;
	    private javax.swing.JLabel jLabel9;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JButton jbtCadastrar;
	    private javax.swing.JButton jbtFechar;
	    private javax.swing.JTextField jtfBairro;
	    private javax.swing.JTextField jtfCidade;
	    private javax.swing.JTextField jtfCrm;
	    private javax.swing.JTextField jtfNome;
	    private javax.swing.JTextField jtfRua;
	    private javax.swing.JTextField jtfTelefone;
	    private javax.swing.JTextField jtfEstado;
	    
	    MedicoDAO medicoDao = new MedicoDAO();
	    EnderecoDAO enderecoDao = new EnderecoDAO();	
	    public void setValor1(Integer a) {

			jtfNome.setText(medicoDao.listarTodos().get(a).getNome().toString());
			jtfCidade.setText(medicoDao.listarTodos().get(a).getEndereco().getCidade().toString());
			jtfBairro.setText(medicoDao.listarTodos().get(a).getEndereco().getBairro().toString());
			jtfEstado.setText(medicoDao.listarTodos().get(a).getEndereco().getUf().toString());
			jtfRua.setText(medicoDao.listarTodos().get(a).getEndereco().getRua().toString());
			jtfTelefone.setText(medicoDao.listarTodos().get(a).getTelefone().toString());
			jtfCrm.setText(medicoDao.listarTodos().get(a).getCrm().toString());
			jtfGuardaValor.setText(a.toString());
	
}
	AlterarMedico(){        
        setVisible(true);
        setLayout(null);
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfCrm = new javax.swing.JTextField();
        jtfTelefone = new javax.swing.JTextField();
        jtfBairro = new javax.swing.JTextField();
        jtfRua = new javax.swing.JTextField();
        jtfCidade = new javax.swing.JTextField();
        jtfEstado = new javax.swing.JTextField();
        jtfGuardaValor = new JTextField();
        jbtCadastrar = new javax.swing.JButton();
        jbtFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("img/Paciente.jpg")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("CRM");

        jLabel6.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Telefone:");

        jLabel7.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Alteração de Medicos");

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

        jtfCrm.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N

        jtfTelefone.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N

        jtfBairro.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N

        jtfRua.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N

        jtfCidade.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N

        jtfEstado.setFont(new java.awt.Font("Leelawadee", 0, 11)); // NOI18N

        jbtCadastrar.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jbtCadastrar.setText("Alterar");
        jbtCadastrar.setContentAreaFilled(false);
        jbtCadastrar.setDefaultCapable(false);

        jbtFechar.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jbtFechar.setText("X");
        jbtFechar.setContentAreaFilled(false);
        jbtFechar.setDefaultCapable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtFechar)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtCadastrar)
                        .addGap(42, 42, 42))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtFechar)
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtCadastrar)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(jLabel1))))
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
				Endereco endereco = new Endereco();
				Medico medico = new Medico();
				medico =medicoDao.listarTodos().get(Integer.valueOf(jtfGuardaValor.getText()));
				endereco = enderecoDao.listarTodos().get(Integer.valueOf(jtfGuardaValor.getText()));
				if (jtfNome.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nome é obrigatório");
				} else {
					medico.setNome(jtfNome.getText());
					if (!jtfBairro.getText().isEmpty()) {
						endereco.setBairro(jtfBairro.getText());
					}
					if (!jtfRua.getText().isEmpty()) {
						endereco.setRua(jtfRua.getText());
					}

					if (!jtfTelefone.getText().isEmpty()) {
						medico.setTelefone(Long.parseLong(jtfTelefone
								.getText()));
					}

					if (!jtfCidade.getText().isEmpty()) {
						endereco.setCidade(jtfCidade.getText());
					}
					if (!jtfCrm.getText().isEmpty()) {
						medico.setCrm(jtfCrm.getText());
					}
					endereco.setUf(jtfEstado.getText());
					enderecoDao.alter(endereco);
					medico.setEndereco(endereco);
					
					medicoDao.alter(medico);
					JOptionPane.showMessageDialog(null,
							"Medico Alterado Com Sucesso!");

					dispose();
					new MedicoControle();

				}

			}
		});
 jbtFechar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int resposta = JOptionPane.showConfirmDialog(getContentPane(), "Deseja mesmo cancelar e sair?", "Confirmar", JOptionPane.OK_CANCEL_OPTION);
				if (resposta==0){
					dispose();	
					new MedicoControle();
				}				
			}
		});
        pack();
        setSize(842, 535);
        setLayout(null);
    	setTitle("Tela Inicial");
		setLocationRelativeTo(null);
		setResizable(false);
		dispose();
		setUndecorated(true);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
	}
	
	
}