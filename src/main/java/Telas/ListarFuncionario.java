/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;
import DAO.FuncionarioDAO;
import DTO.FuncionarioDTO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author silvi_5cnyxi8
 */
public class ListarFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form ListarFuncionario
     */
    public ListarFuncionario() {
        initComponents();
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionario = new javax.swing.JTable();
        BotaoNovo = new javax.swing.JButton();
        BotãoEditar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuPacientes = new javax.swing.JMenu();
        MenuItemCadastrarPacientes = new javax.swing.JMenuItem();
        MenuItemListarPacientes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemCadastrarFunc = new javax.swing.JMenuItem();
        MenuItemListarFunc = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 138, 157));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\silvi_5cnyxi8\\OneDrive\\Documents\\NetBeansProjects\\ClinicaGirassol\\src\\main\\java\\Telas\\GIRASSOL2.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Listar Funcionários");

        jButton1.setBackground(new java.awt.Color(242, 242, 242));
        jButton1.setText("Menu");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(242, 242, 242));
        jButton2.setText("Listar Funcionários");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText(">>");

        jTableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Cargo", "Salário", "Data Contratação", "Username"
            }
        ));
        jScrollPane1.setViewportView(jTableFuncionario);

        BotaoNovo.setText("Novo");
        BotaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoActionPerformed(evt);
            }
        });

        BotãoEditar.setText("Editar");
        BotãoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoEditarActionPerformed(evt);
            }
        });

        BotaoExcluir.setText("Excluir");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotãoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoNovo)
                    .addComponent(BotãoEditar)
                    .addComponent(BotaoExcluir))
                .addGap(20, 20, 20))
        );

        MenuPacientes.setText("Pacientes");

        MenuItemCadastrarPacientes.setText("Cadastrar Pacientes");
        MenuItemCadastrarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCadastrarPacientesActionPerformed(evt);
            }
        });
        MenuPacientes.add(MenuItemCadastrarPacientes);

        MenuItemListarPacientes.setText("Listar Pacientes");
        MenuItemListarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemListarPacientesActionPerformed(evt);
            }
        });
        MenuPacientes.add(MenuItemListarPacientes);

        jMenuBar1.add(MenuPacientes);

        jMenu2.setText("Funcionários");

        jMenuItemCadastrarFunc.setText("Cadastrar Funcionários");
        jMenuItemCadastrarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarFuncActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemCadastrarFunc);

        MenuItemListarFunc.setText("Listar Funcionários");
        MenuItemListarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemListarFuncActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemListarFunc);

        jMenuBar1.add(jMenu2);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MenuPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new ListarFuncionario().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BotãoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoEditarActionPerformed
        int opcao = jTableFuncionario.getSelectedRow();
        
        if(opcao>=0){
        CadastroFuncionario cadastro = new CadastroFuncionario();
        cadastro.setCodigo((int) jTableFuncionario.getValueAt(opcao,0));
        cadastro.setNome(jTableFuncionario.getValueAt(opcao, 1).toString());
        cadastro.setCargo(jTableFuncionario.getValueAt(opcao,2).toString());
        cadastro.setSalario(jTableFuncionario.getValueAt(opcao,3).toString());
        
        // Conversão da data do formato yyyy/MM/dd para dd/MM/yyyy
        String dataContratacaoBD = jTableFuncionario.getValueAt(opcao, 4).toString();
        DateTimeFormatter formatterBD = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatterSistema = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNasc = LocalDate.parse(dataContratacaoBD, formatterBD);
        String dataNascFormatada = dataNasc.format(formatterSistema);

        cadastro.setDataContratacao(dataNascFormatada);
        cadastro.setUsername(jTableFuncionario.getValueAt(opcao,5).toString());
        cadastro.setVisible(true);
        cadastro.ativarBotao();
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha.");
            new ListarFuncionario().setVisible(true);
            dispose();
        }
        
        dispose();
        
        
    }//GEN-LAST:event_BotãoEditarActionPerformed

    private void MenuItemListarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemListarFuncActionPerformed
        new ListarFuncionario().setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuItemListarFuncActionPerformed

    private void MenuItemCadastrarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCadastrarPacientesActionPerformed
        new CadastrarPaciente().setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuItemCadastrarPacientesActionPerformed

    private void MenuItemListarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemListarPacientesActionPerformed
        new ListarPacientes().setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuItemListarPacientesActionPerformed

    private void jMenuItemCadastrarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarFuncActionPerformed
        new CadastroFuncionario().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemCadastrarFuncActionPerformed

    private void BotaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoActionPerformed
        new CadastroFuncionario().setVisible(true);
        dispose();
    }//GEN-LAST:event_BotaoNovoActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        int opcao = jTableFuncionario.getSelectedRow();
        
        if(opcao>=0){
        // Obter os dados do paciente selecionado na tabela
        FuncionarioDTO f = new FuncionarioDTO();
        f.setCodigo((int) jTableFuncionario.getValueAt(opcao, 0));
        f.setNome((String) jTableFuncionario.getValueAt(opcao, 1));
        f.setCargo((String) jTableFuncionario.getValueAt(opcao, 2));
        f.setSalario((Double) jTableFuncionario.getValueAt(opcao, 3));
        // Conversão da data do formato yyyy/MM/dd para dd/MM/yyyy
        String dataC = jTableFuncionario.getValueAt(opcao, 4).toString();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatterSis = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataContr = LocalDate.parse(dataC, formatter);
        //String dataNascForm = dataNas.format(formatterSis);

        f.setDataContratacao(dataContr);
        f.setUsername(jTableFuncionario.getValueAt(opcao,5).toString());
       // f.setSenha(jTableFuncionario.getValueAt(opcao,6).toString());
        FuncionarioDAO fDAO = new FuncionarioDAO();
        fDAO.excluir(f);
        preencherTabela();
        new ListarFuncionario().setVisible(true);
        dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha");
            new ListarPacientes().setVisible(true);
            dispose();
        }  
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    public void preencherTabela(){
    FuncionarioDAO fDAO = new FuncionarioDAO();
    List<FuncionarioDTO> lista = fDAO.listar();
    DefaultTableModel modeloTabela = (DefaultTableModel) jTableFuncionario.getModel();
    modeloTabela.setRowCount(0);
    
    for(FuncionarioDTO f : lista){
        modeloTabela.addRow(new Object[]{f.getCodigo(),f.getNome(),f.getCargo(),f.getSalario(),f.getDataContratacao(),f.getUsername()});
   }
}
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
            java.util.logging.Logger.getLogger(ListarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoNovo;
    private javax.swing.JButton BotãoEditar;
    private javax.swing.JMenuItem MenuItemCadastrarPacientes;
    private javax.swing.JMenuItem MenuItemListarFunc;
    private javax.swing.JMenuItem MenuItemListarPacientes;
    private javax.swing.JMenu MenuPacientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCadastrarFunc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFuncionario;
    // End of variables declaration//GEN-END:variables
}