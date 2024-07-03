/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;
import DAO.*;
import DTO.*;
import DTO.Especialidade;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import java.util.List;
/**
 *
 * @author silvi_5cnyxi8
 */
public class CadastroFuncionario extends javax.swing.JFrame {
        private int codigo;
        FuncionarioDTO f = new FuncionarioDTO();
        FuncionarioDAO fDAO = new FuncionarioDAO();
        MedicoDTO medico = new MedicoDTO();
        MedicoDAO mDAO = new MedicoDAO();
    /**
     * Creates new form CadastroFuncionario
     */
    public CadastroFuncionario() {
        initComponents();
    JLabelNumeroMedico.setVisible(false);
    jTextNumeroMedico.setVisible(false);
    jLabelEspecialidade.setVisible(false);
    jComboBoxEspecialidade.setVisible(false);
    BotaoAtualizar.setVisible(false);
    }
    
    
     public void ativarBotao(){
        BotaoAtualizar.setVisible(true);
        BotaoSalvar.setVisible(false);
        jTextSenha.setEditable(false);
    }
    
        //Métodos Setters
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void setNome(String nome) {
    jTextNome.setText(nome);
    }
    
    public void setCargo(String cargo) {
        jComboCargo.setSelectedItem(cargo);
    }

    public void setSalario(String salario) {
        jTextSalario.setText(salario);
    }

    public void setDataContratacao(String dataContratacao) {
        jFDataContratacao.setText(dataContratacao);
    }
    
    public void setUsername(String username){
        jTextUsername.setText(username);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextSalario = new javax.swing.JTextField();
        jFDataContratacao = new javax.swing.JFormattedTextField();
        JLabelNumeroMedico = new javax.swing.JLabel();
        jTextNumeroMedico = new javax.swing.JTextField();
        jLabelEspecialidade = new javax.swing.JLabel();
        BotaoCadastroFun = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        BotaoMenu1 = new javax.swing.JButton();
        BotaoSalvar = new javax.swing.JButton();
        BotaoAtualizar = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();
        jComboBoxEspecialidade = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jTextSenha = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboCargo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextUsername = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        jMenu1.setText("Pacientes");

        jMenuItem1.setText("Cadastrar Pacientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Lista de Pacientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Funcionários");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Cadastrar Funcionários");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Listar Funcionários");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 138, 157));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\silvi_5cnyxi8\\OneDrive\\Documents\\NetBeansProjects\\ClinicaGirassol\\src\\main\\java\\Telas\\GIRASSOL2.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Cadastro de Funcionário");

        jLabel2.setText("Nome");

        jLabel4.setText("Salário");

        jLabel5.setText("Data de Contratação");

        try {
            jFDataContratacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        JLabelNumeroMedico.setText("Número de Médico");

        jLabelEspecialidade.setText("Especialidade");

        BotaoCadastroFun.setBackground(new java.awt.Color(242, 242, 242));
        BotaoCadastroFun.setText("Cadastrar Funcionários");
        BotaoCadastroFun.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoCadastroFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastroFunActionPerformed(evt);
            }
        });

        jLabel6.setText(">>");

        BotaoMenu1.setBackground(new java.awt.Color(242, 242, 242));
        BotaoMenu1.setText("Menu");
        BotaoMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMenu1ActionPerformed(evt);
            }
        });

        BotaoSalvar.setText("Salvar");
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });

        BotaoAtualizar.setText("Atualizar");
        BotaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAtualizarActionPerformed(evt);
            }
        });

        BotaoCancelar.setText("Cancelar");
        BotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarActionPerformed(evt);
            }
        });

        jComboBoxEspecialidade.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBoxEspecialidadeAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jComboBoxEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEspecialidadeActionPerformed(evt);
            }
        });

        jLabel8.setText("Senha");

        jLabel3.setText("Cargo");

        jComboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secretário", "Médico" }));
        jComboCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCargoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel9.setText("Username");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(BotaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(BotaoAtualizar)
                                .addGap(38, 38, 38)
                                .addComponent(BotaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BotaoMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoCadastroFun))
                            .addComponent(jFDataContratacao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextSalario, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JLabelNumeroMedico)
                                    .addComponent(jTextNumeroMedico)
                                    .addComponent(jLabelEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxEspecialidade, 0, 251, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jTextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(120, 120, 120))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(116, 116, 116))))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCadastroFun)
                    .addComponent(jLabel6)
                    .addComponent(BotaoMenu1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5)
                        .addGap(5, 5, 5)
                        .addComponent(jFDataContratacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLabelNumeroMedico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextNumeroMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelEspecialidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(132, 132, 132)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoSalvar)
                    .addComponent(BotaoAtualizar)
                    .addComponent(BotaoCancelar))
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        JLabelNumeroMedico.getAccessibleContext().setAccessibleParent(JLabelNumeroMedico);

        jMenu3.setText("Pacientes");

        jMenuItem5.setText("Cadastrar Pacientes");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Listar Pacientes");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Funcionários");

        jMenuItem7.setText("Cadastrar Funcionários");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Listar Funcionários");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new CadastrarPaciente().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new ListarPacientes().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        new CadastroFuncionario().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new CadastrarPaciente().setVisible(true);    
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new ListarPacientes().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        new CadastroFuncionario().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
    new ListarFuncionario().setVisible(true);
        dispose();            // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jComboBoxEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEspecialidadeActionPerformed

    }//GEN-LAST:event_jComboBoxEspecialidadeActionPerformed

    private void jComboBoxEspecialidadeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBoxEspecialidadeAncestorAdded
        EspecialidadeDAO esp = new EspecialidadeDAO();

        List<Especialidade>listaEspecialidade = esp.listarEspecialidade();

        // remove todos os itens do combo box.
        jComboBoxEspecialidade.removeAllItems();

        for(Especialidade espc : listaEspecialidade){
            jComboBoxEspecialidade.addItem(espc);
        }
    }//GEN-LAST:event_jComboBoxEspecialidadeAncestorAdded

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed

        String cargoSelecionado = (String) jComboCargo.getSelectedItem();

        if ("Médico".equals(cargoSelecionado)) {
            medico.setNome(jTextNome.getText());
            medico.setCargo(cargoSelecionado);
            medico.setNumeroMed(Integer.parseInt(jTextNumeroMedico.getText()));
            medico.setSalario(Double.parseDouble(jTextSalario.getText()));

            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dataContract = LocalDate.parse(jFDataContratacao.getText(), formatter);
                medico.setDataContratacao(dataContract);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(null, "Data de contratação inválida. Por favor, insira no formato dd/MM/yyyy.");
                return;
            }

            // Obter a especialidade selecionada na JComboBox
            Especialidade especialidadeSelecionada = (Especialidade) jComboBoxEspecialidade.getSelectedItem();

            // Verificar se foi selecionada alguma especialidade
            if (especialidadeSelecionada != null) {
                // Definir o código da especialidade no médico
                medico.setEspecialidade(especialidadeSelecionada.getCodigo()); // Supondo que o método correto seja utilizado
            } else {
                JOptionPane.showMessageDialog(null, "Selecione uma especialidade.");
                return;
            }
            medico.setUsername(jTextUsername.getText());
            medico.setSenha(jTextSenha.getText());
            mDAO.cadastrar(medico);

        } else {
            FuncionarioDTO funcionario = new FuncionarioDTO();
            funcionario.setNome(jTextNome.getText());
            funcionario.setCargo(cargoSelecionado);

            try {
                funcionario.setSalario(Double.parseDouble(jTextSalario.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Salário inválido. Por favor, insira um número válido.");
                return;
            }

            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dataContract = LocalDate.parse(jFDataContratacao.getText(), formatter);
                funcionario.setDataContratacao(dataContract);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(null, "Data de contratação inválida. Por favor, insira no formato dd/MM/yyyy.");
                return;
            }
            funcionario.setUsername(jTextUsername.getText());
            funcionario.setSenha(jTextSenha.getText());
            fDAO.cadastrar(funcionario);
        }

    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private void BotaoMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMenu1ActionPerformed
        new MenuPage().setVisible(true);
        dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_BotaoMenu1ActionPerformed

    private void BotaoCadastroFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastroFunActionPerformed
        new CadastroFuncionario().setVisible(true);
        dispose();
    }//GEN-LAST:event_BotaoCadastroFunActionPerformed

    private void jComboCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCargoActionPerformed
        String cargoSelecionado = (String) jComboCargo.getSelectedItem();

        if ("Médico".equals(cargoSelecionado)) {
            // Modificar o formulário para incluir campos específicos de médico, se necessário
            // Por exemplo, adicionar campos para número do médico e especialidade
            JLabelNumeroMedico.setVisible(true);
            jTextNumeroMedico.setVisible(true);
            jLabelEspecialidade.setVisible(true);
            jComboBoxEspecialidade.setVisible(true);
        } else {
            // Esconder campos específicos de médico, se estiverem visíveis
            JLabelNumeroMedico.setVisible(false);
            jTextNumeroMedico.setVisible(false);
            jLabelEspecialidade.setVisible(false);
            jComboBoxEspecialidade.setVisible(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jComboCargoActionPerformed

    private void BotaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAtualizarActionPerformed
        f.setCodigo(this.codigo);
        f.setNome(jTextNome.getText());
        f.setCargo(jComboCargo.getSelectedItem().toString());
        
        //Conversão do campo Salário de Double para String
        try {
                f.setSalario(Double.parseDouble(jTextSalario.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Salário inválido. Por favor, insira um número válido.");
                return;
            }
        
         try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataContratacao = LocalDate.parse(jFDataContratacao.getText(), formatter);
            f.setDataContratacao(dataContratacao);
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Data de contratação inválida. Por favor, insira no formato dd/MM/yyyy.");
            return;
        }
        f.setUsername(jTextUsername.getText());
        fDAO.atualizar(f);
        
    }//GEN-LAST:event_BotaoAtualizarActionPerformed

    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
        jTextNome.setText("");
        jComboCargo.setSelectedIndex(-1);
        jTextSalario.setText("");
        jTextNumeroMedico.setText("");
        jFDataContratacao.setText("");
        jTextUsername.setText("");
        jComboBoxEspecialidade.setSelectedIndex(-1);
        BotaoAtualizar.setVisible(false);
        BotaoSalvar.setVisible(true);
        jTextSenha.setEditable(true);
    }//GEN-LAST:event_BotaoCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAtualizar;
    private javax.swing.JButton BotaoCadastroFun;
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoMenu1;
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JLabel JLabelNumeroMedico;
    private javax.swing.JComboBox jComboBoxEspecialidade;
    private javax.swing.JComboBox<String> jComboCargo;
    private javax.swing.JFormattedTextField jFDataContratacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEspecialidade;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextNumeroMedico;
    private javax.swing.JTextField jTextSalario;
    private javax.swing.JTextField jTextSenha;
    private javax.swing.JTextField jTextUsername;
    // End of variables declaration//GEN-END:variables
}
