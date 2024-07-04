/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import DAO.*;
import DTO.*;
import DAO.HorarioDAO;
import Pesquisas.*;
import java.util.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import java.util.Calendar;
import javax.swing.JOptionPane;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.TextStyle;
import java.util.Locale;




/**
 *
 * @author silvi_5cnyxi8
 */
public class AgendarConsulta extends javax.swing.JFrame {
        ConsultaDTO c = new ConsultaDTO();
        MedicoDTO m = new MedicoDTO();
        PacienteDTO p = new PacienteDTO();
        HorarioDTO h = new HorarioDTO();
 
    public AgendarConsulta() {
        initComponents();
        preencherComboBoxMedico();
        
        // Adicionar o listener para mudança de propriedade do jDateChooser
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
    }
    
    
    
    public void atualizarComboBoxMedicos() {
    Especialidade especialidadeSelecionada = (Especialidade) jComboBoxEspecialidade.getSelectedItem();
    if (especialidadeSelecionada != null) {
        MedicoDAO medicoDAO = new MedicoDAO();
        List<MedicoDTO> medicos = medicoDAO.listarNome(especialidadeSelecionada.getCodigo());
       
        DefaultComboBoxModel<MedicoDTO> model = new DefaultComboBoxModel<>();
        for (MedicoDTO medico : medicos) {
            model.addElement(medico);
        }
        jComboBoxMedico.setModel(model);
    } 
}
    
    private void preencherComboBoxMedico() {
    MedicoDAO medicoDAO = new MedicoDAO();
    List<MedicoDTO> medicos = medicoDAO.listarMedicos(); // Assumindo que listarMedicos() retorna uma lista de MedicoDTO
    
    DefaultComboBoxModel<MedicoDTO> model = new DefaultComboBoxModel<>();
    for (MedicoDTO medico : medicos) {
        model.addElement(medico);
    }
    jComboBoxMedico.setModel(model);
}
    
    public static String converterParaAbreviado(String nomeCompleto) {
        switch (nomeCompleto.toLowerCase()) {
            case "segunda-feira":
                return "Segunda";
            case "terça-feira":
                return "Terca";
            case "quarta-feira":
                return "Quarta";
            case "quinta-feira":
                return "Quinta";
            case "sexta-feira":
                return "Sexta";
            case "sábado":
                return "Sabado";
            case "domingo":
                return "Domingo";
            default:
                return nomeCompleto; // Retorna o nome completo se não houver correspondência
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jText_idPaciente = new javax.swing.JTextField();
        jTextPaciente = new javax.swing.JTextField();
        BotaoPesquisarPaciente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Salvar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxEspecialidade = new javax.swing.JComboBox();
        jComboBoxMedico = new javax.swing.JComboBox();
        comboBoxHoras = new javax.swing.JComboBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jTextValor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 138, 157));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\silvi_5cnyxi8\\OneDrive\\Documents\\NetBeansProjects\\ClinicaGirassol\\src\\main\\java\\Telas\\GIRASSOL2.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Agendar Consultas");

        jLabel3.setText("Data.:");

        jLabel4.setText("Hora.:");

        jLabel5.setText("Paciente.:");

        jText_idPaciente.setEditable(false);

        jTextPaciente.setEditable(false);

        BotaoPesquisarPaciente.setText("...");
        BotaoPesquisarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPesquisarPacienteActionPerformed(evt);
            }
        });

        jLabel6.setText("Médico.:");

        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Menu");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setText("Especialidade.:");

        jComboBoxEspecialidade.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBoxEspecialidadeAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jComboBoxMedico.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBoxMedicoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        jLabel8.setText("Valor.:");

        jButton1.setText("Atualizar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jText_idPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(25, 25, 25))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                            .addComponent(jTextValor, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(37, 37, 37)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(comboBoxHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(BotaoPesquisarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jButton1)
                        .addGap(57, 57, 57)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jText_idPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoPesquisarPaciente))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBoxEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jTextValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(comboBoxHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salvar)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addGap(43, 43, 43))
        );

        jMenu1.setText("Pacientes");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Funcionários");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultas");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

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

    private void BotaoPesquisarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPesquisarPacienteActionPerformed
        PesquisaPaciente tabela = new PesquisaPaciente(this, true);
        tabela.setVisible(true);
        
        PacienteDTO p = tabela.getP();
        jText_idPaciente.setText(""+p.getId_paciente());
        jTextPaciente.setText(p.getNome());
    }//GEN-LAST:event_BotaoPesquisarPacienteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBoxEspecialidadeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBoxEspecialidadeAncestorAdded
    EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();
    List<Especialidade> especialidades = especialidadeDAO.listarEspecialidade();

    DefaultComboBoxModel<Especialidade> model = new DefaultComboBoxModel<>();
    for (Especialidade especialidade : especialidades) {
        model.addElement(especialidade);
       
    }
    jComboBoxEspecialidade.setModel(model);
    

    jComboBoxEspecialidade.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        atualizarComboBoxMedicos();

            // Atualiza o campo de texto com o valor da especialidade selecionada
            Especialidade especialidadeSelecionada = (Especialidade) jComboBoxEspecialidade.getSelectedItem();
            if (especialidadeSelecionada != null) {
                jTextValor.setText(String.valueOf(especialidadeSelecionada.getValor()));
            }
        }
    });

    // Se houver especialidades, seleciona a primeira e atualiza os médicos correspondentes
    if (!especialidades.isEmpty()) {
        jComboBoxEspecialidade.setSelectedIndex(0);
        atualizarComboBoxMedicos();
    }

    }//GEN-LAST:event_jComboBoxEspecialidadeAncestorAdded
 
    private void jComboBoxMedicoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBoxMedicoAncestorAdded
        atualizarComboBoxMedicos(); 
        MedicoDTO medicoSelecionado = (MedicoDTO) jComboBoxMedico.getSelectedItem();
        System.out.println("IdMedico: "+medicoSelecionado.getIdMedico());
    }//GEN-LAST:event_jComboBoxMedicoAncestorAdded

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new MenuPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
         if ("date".equals(evt.getPropertyName())) {
            // Obter a data selecionada do jDateChooser
            Date dataSelecionadaUtilDate = jDateChooser1.getDate();
            LocalDate dataSelecionada = dataSelecionadaUtilDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            // Obter o dia da semana no formato desejado ('Segunda', 'Terca', etc.)
           String diaSemana = dataSelecionada.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
           String dia = converterParaAbreviado(diaSemana);
           MedicoDTO medicoSelecionado = (MedicoDTO) jComboBoxMedico.getSelectedItem();
                
            // Chamar o método do DAO passando o ID do médico e o dia da semana
            HorarioDAO horarioDAO = new HorarioDAO();
           List<HorarioDTO> horariosDisponiveis = horarioDAO.listarHorarioMedicoPorDia(medicoSelecionado.getIdMedico(), dia);
            
            // Limpar a ComboBox de horas
        comboBoxHoras.removeAllItems();
        
     
        // Adicionar os horários disponíveis à ComboBox
        for (HorarioDTO horario : horariosDisponiveis) {
            // Formatando a hora para exibição na ComboBox
            String hora = horario.getHora().toString();
            comboBoxHoras.addItem(hora);
        }
        
        }
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        // Obter os valores dos campos da interface gráfica
    String idPacienteStr = jText_idPaciente.getText();
    int idMedicoStr = ((MedicoDTO) jComboBoxMedico.getSelectedItem()).getIdMedico();
    LocalDate dataConsulta = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    String horaConsulta = (String) comboBoxHoras.getSelectedItem();
    //String valorConsultaStr = jTextValor.getText();
    
    System.out.println("Id Paciente Salvo: "+ idPacienteStr);
    System.out.println("Id Medico Salvo: "+ idMedicoStr);
    System.out.println("Data Consulta Salvo: "+ dataConsulta);
    System.out.println("Hora Consulta Salvo: "+ horaConsulta);
    
    

    // Criar um objeto ConsultaDTO com os dados obtidos
    ConsultaDTO consulta = new ConsultaDTO();
    consulta.setIdPaciente(Integer.parseInt(idPacienteStr));
    consulta.setIdMedico(idMedicoStr);
    consulta.setDataConsulta(dataConsulta);
    consulta.setHoraConsulta(LocalTime.parse(horaConsulta));
   // consulta.setValorConsulta(Double.parseDouble(valorConsultaStr));

    // Chamar o ConsultaDAO para salvar a consulta
    ConsultaDAO consultaDAO = new ConsultaDAO();
    
    try {
        consultaDAO.agendar(consulta);
        JOptionPane.showMessageDialog(this, "Consulta agendada com sucesso!", "Consulta Agendada", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao agendar consulta: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace(); // Aqui você pode imprimir o stack trace para debug
    }
        
    }//GEN-LAST:event_SalvarActionPerformed

  

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
            java.util.logging.Logger.getLogger(AgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoPesquisarPaciente;
    private javax.swing.JButton Salvar;
    private javax.swing.JComboBox comboBoxHoras;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBoxEspecialidade;
    private javax.swing.JComboBox jComboBoxMedico;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextPaciente;
    private javax.swing.JTextField jTextValor;
    private javax.swing.JTextField jText_idPaciente;
    // End of variables declaration//GEN-END:variables
}
