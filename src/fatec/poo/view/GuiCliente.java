/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//valores para o txtUF: AC,AL,AP,AM,BA,CE,DF,ES,GO,MA,MT,MS,MG,PA,PB,PR,PE,PI,RJ,RN,RS,RO,RR,SC,SP,SE,TO
package fatec.poo.view;

import fatec.poo.model.Cliente;
import fatec.poo.model.Pessoa;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author gusta
 */
public class GuiCliente extends javax.swing.JFrame {

    /**
     * Creates new form GuiCliente
     */
    public GuiCliente(ArrayList<Pessoa> p) {

        //atribui o parametro recebido no ponteiro auxiliar criado abaixo
        pes = p;

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbxUF = new javax.swing.JComboBox<>();
        txtDDD = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        txtLimiteCredito = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblLimiteDisponivel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");

        jLabel1.setText("CPF");

        jLabel2.setText("Nome");

        jLabel3.setText("Endereço");

        jLabel4.setText("Cidade");

        jLabel5.setText("Telefone");

        jLabel6.setText("Limite de Credito");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setToolTipText("CPF");

        txtNome.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtCidade.setEnabled(false);

        jLabel7.setText("UF");

        cbxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbxUF.setSelectedIndex(-1);
        cbxUF.setEnabled(false);

        txtDDD.setEnabled(false);

        txtTelefone.setEnabled(false);

        jLabel8.setText("CEP");

        txtCEP.setEnabled(false);

        txtLimiteCredito.setEnabled(false);

        jLabel9.setText("Limite disponível");

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblLimiteDisponivel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel10.setText("Tipo");

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comum", "Especial" }));
        cbxTipo.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCEP))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEndereco))))
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLimiteCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblLimiteDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLimiteDisponivel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtLimiteCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        //fecha a janela Cadastro de Clientes
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        //consultar cpf
        //variavel cpf = texto do objeto txtCpf
        String cpf = txtCpf.getText();
        //variavel cpfFound -> Usada na hora da consulta
        boolean cpfFound = false;

        //percorre todo o vetor pes
        for (int i = 0; i < pes.size(); i++) {
            //se o conteudo do vetor pes no indice correspondente a i for igual ao conteudo de cpf  
            if (cpf.equals(pes.get(i).getCpf())) {
                //encontrou CPF
                cpfFound = true;
                //atribui valor de i ao index
                index = i;
                //não é mais necessário executar o FOR
                break;

            }

        }
        //fazer as alterações na UI
        //Se CPF foi encontrado, faça o seguinte:
        if (cpfFound) {

            //usando o typecast PESSOA -> CLIENTE
            //assim é possivel acessar os métodos da classe cliente
            Cliente cli = (Cliente) pes.get(index);

            txtNome.setText(cli.getNome());
            txtEndereco.setText(cli.getEndereco());
            txtCidade.setText(cli.getCidade());
            txtDDD.setText(cli.getDdd());
            txtCEP.setText(cli.getCep());
            txtTelefone.setText(cli.getTelefone());

            //isso aqui vai ser um pouquinho mais chatinho de mexer
            //mas vou usar uma função pra me ajudar com isso
            cbxUF.setSelectedIndex(ufArray.indexOf(cli.getUf()));
            
            

            //métodos de Cliente
            txtLimiteCredito.setText(String.valueOf(cli.getLimiteCred()));
            lblLimiteDisponivel.setText(String.valueOf(cli.getLimiteDisp()));
            
            //OBTEM VALOR DE TIPO
            cbxTipo.setSelectedIndex(cli.getTipo());

            //desativa botão de consulta
            btnConsultar.setEnabled(false);

            //ativa o botão de alterar
            btnAlterar.setEnabled(true);

            //ativa o botão de excluir
            btnExcluir.setEnabled(true);

            //desativa o txtCPF
            txtCpf.setEnabled(false);
            //ativa o campo de nome
            txtNome.setEnabled(true);
            //ativa o campo de endereço
            txtEndereco.setEnabled(true);
            //ativa o campo de cidade
            txtCidade.setEnabled(true);
            //ativa o campo de CEP
            txtCEP.setEnabled(true);
            //ativa o campo de DDD
            txtDDD.setEnabled(true);
            //ativa o campo de Telefone
            txtTelefone.setEnabled(true);
            //ativa o campo de Limite de Credito
            txtLimiteCredito.setEnabled(true);

            //lblLimiteDisponivel.setEnabled(true);
            cbxUF.setEnabled(true);
            cbxTipo.setEnabled(true);

        } else {
            //desativa botão de consulta
            btnConsultar.setEnabled(false);

            //ativa o botão de inserção
            btnIncluir.setEnabled(true);

            //desativa o txtCPF
            txtCpf.setEnabled(false);

            txtNome.setEnabled(true);

            txtEndereco.setEnabled(true);

            txtCidade.setEnabled(true);

            txtCEP.setEnabled(true);

            txtDDD.setEnabled(true);

            txtTelefone.setEnabled(true);

            txtLimiteCredito.setEnabled(true);

            cbxUF.setEnabled(true);
            
            cbxTipo.setEnabled(true);
        }


    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed

        String cpf = txtCpf.getText();

        Double limiteCredito = Double.parseDouble(txtLimiteCredito.getText());
        String nome = txtNome.getText();

        //criação de um objeto da classe cliente
        //limite credito, cpf, nome
        Cliente cli = new Cliente(limiteCredito, cpf, nome);

        cli.setCep(txtCEP.getText());
        cli.setCidade(txtCidade.getText());
        cli.setDdd(txtDDD.getText());
        cli.setEndereco(txtEndereco.getText());
        cli.setTelefone(txtTelefone.getText());

        cli.setUf(ufArray.get(cbxUF.getSelectedIndex()));
        
        //obtem valor de cbx tipo
        cli.setTipo(cbxTipo.getSelectedIndex());

        //adionamos o objeto cli no vetor pes
        //lembrando que pes está apontando para cadCliVend
        //ou seja
        //o comando abaixo é a mesma coisa que: cadCliVend.add(cli)
        pes.add(cli);

        returnFormToSearchState();
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:

        String cpf = txtCpf.getText();
        Double limiteCredito = Double.parseDouble(txtLimiteCredito.getText());
        String nome = txtNome.getText();

        //limite credito, cpf, nome
        Cliente cli = new Cliente(limiteCredito, cpf, nome);

        cli.setCep(txtCEP.getText());
        cli.setCidade(txtCidade.getText());
        cli.setDdd(txtDDD.getText());
        cli.setEndereco(txtEndereco.getText());
        cli.setTelefone(txtTelefone.getText());

        //compara a string e pega seu index no arraylist ufArray para passar com parametro
        cli.setUf(ufArray.get(cbxUF.getSelectedIndex()));

        //obtem valor de cbx tipo
        cli.setTipo(cbxTipo.getSelectedIndex());
        
        //pra finalizar utilizamos o arraylist.set(index, valor)
        pes.set(index, cli);

        returnFormToSearchState();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        pes.remove(index);

        returnFormToSearchState();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void returnFormToSearchState() //Função criada exclusivamente para retornar o form ao estado inicial
    {
        //desativa botão alterar
        btnAlterar.setEnabled(false);
        //desativa botão excluir
        btnExcluir.setEnabled(false);

        //ativa botão de consulta
        btnConsultar.setEnabled(true);

        //desativa o botão de inserção
        btnIncluir.setEnabled(false);

        //Deixa o povo todo null
        txtCpf.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtCidade.setText(null);
        txtDDD.setText(null);
        txtLimiteCredito.setText(null);
        lblLimiteDisponivel.setText(null);
        txtCEP.setText(null);
        txtTelefone.setText(null);
        //muda o index do cbxUF para -1 -> Não aparece nada no lugar
        cbxUF.setSelectedIndex(-1);

        //desativa o txtCPF
        txtCpf.setEnabled(true);

        txtNome.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtCidade.setEnabled(false);

        txtCEP.setEnabled(false);

        txtDDD.setEnabled(false);

        txtTelefone.setEnabled(false);

        txtLimiteCredito.setEnabled(false);

        cbxUF.setEnabled(false);
        
        cbxTipo.setEnabled(false);
        cbxTipo.setSelectedIndex(0);
    }

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
            java.util.logging.Logger.getLogger(GuiCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new GuiCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JComboBox<String> cbxUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblLimiteDisponivel;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtDDD;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtLimiteCredito;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    //criação do ponteiro auxiliar
    private ArrayList<Pessoa> pes;

    //essa variavel guarda o index 
    private int index = 0;

    //necessário para UF 
    ArrayList<String> ufArray = new ArrayList<>(Arrays.asList(
            "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG",
            "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"));
}
