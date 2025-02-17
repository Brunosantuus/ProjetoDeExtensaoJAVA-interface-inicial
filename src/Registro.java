import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;




public class Registro extends javax.swing.JFrame {
    
   
    public Registro() {
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

        botao_confirmar = new javax.swing.JButton();
        botao_voltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        conf_senha = new javax.swing.JPasswordField();
        senha = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nome_completo = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        celular = new javax.swing.JTextField();
        cidade = new javax.swing.JTextField();
        uf = new javax.swing.JTextField();
        endereço = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setMaximumSize(new java.awt.Dimension(960, 551));
        getContentPane().setLayout(null);

        botao_confirmar.setBackground(new java.awt.Color(255, 204, 102));
        botao_confirmar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botao_confirmar.setForeground(new java.awt.Color(255, 255, 255));
        botao_confirmar.setText("Confirmar");
        botao_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_confirmarActionPerformed(evt);
            }
        });
        getContentPane().add(botao_confirmar);
        botao_confirmar.setBounds(330, 450, 143, 41);

        botao_voltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botao_voltar.setText("Voltar");
        botao_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(botao_voltar);
        botao_voltar.setBounds(510, 450, 140, 40);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados de Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setFocusable(false);
        jPanel1.setOpaque(false);

        jLabel1.setText("Login:");

        jLabel2.setText("Senha:");

        jLabel3.setText("Confirmar Senha:");

        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        conf_senha.setText("jPassword");
        conf_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conf_senhaActionPerformed(evt);
            }
        });

        senha.setText("jPassword");
        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(conf_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(senha, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(login))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(conf_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(300, 100, 400, 111);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insira seus dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel4.setText("Nome Completo:");

        jLabel5.setText("CPF/CNPJ:");

        jLabel7.setText("Celular:");

        jLabel8.setText("Cidade:");

        jLabel9.setText("UF:");

        jLabel10.setText("Endereço:");

        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfActionPerformed(evt);
            }
        });

        jLabel11.setText("E-mail:");

        jLabel12.setText("Nº:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome_completo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpf))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(celular))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endereço))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nome_completo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(endereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(300, 230, 400, 201);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel6.setText("Cadastro");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(300, 50, 180, 48);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/folder/newpackage/Img fundo tela de registro.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 960, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conf_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conf_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conf_senhaActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed

    private void botao_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_confirmarActionPerformed
        this.dispose();
        PaginaInicial formulario = new PaginaInicial();
        formulario.setVisible(true);
        //System.out.println("Botao clicado");
        String loginvar, senhavar, conf_senhavar, nomefullvar, cpfvar, celularvar, cidadevar, ufvar, numvar, enderecovar, emailvar, query;
        String SUrl, SUser, Spass;
        SUrl = "jdbc:mysql://localhost:3306/bibliotecamero";
        SUser = "root";
        Spass = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, Spass);
            Statement st = con.createStatement();
            if("".equals(login.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Digite seu Login", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(senha.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Digite sua senha", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(conf_senha.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Confirme Sua Senha", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(nome_completo.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Digite seu Nome completo", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(cpf.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Digite seu CPF/CNPJ", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(celular.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Digite seu Celular", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(cidade.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Digite sua cidade", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(uf.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Digite sua UF ", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(num.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Digite seu Número", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(endereço.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Digite seu Endereço", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(email.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Digite seu E-mail", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                loginvar = login.getText();
                senhavar = senha.getText();
                conf_senhavar = conf_senha.getText();
                nomefullvar = nome_completo.getText();
                cpfvar = cpf.getText();
                celularvar = celular.getText();
                cidadevar = cidade.getText();
                ufvar = uf.getText();
                numvar = num.getText();
                enderecovar = endereço.getText();
                emailvar = email.getText();
                System.out.println(senhavar);
                
                query = "INSERT INTO user(login, senha, confirmar_senha, nome_completo, cpf, celular, cidade, uf, num, endereço, email)"+
                        "VALUES('"+loginvar+"', '"+senhavar+"', '"+conf_senhavar+"', '"+nomefullvar+"', '"+cpfvar+"', '"+celularvar+"', '"+cidadevar+"', '"+ufvar+"', '"+numvar+"', '"+enderecovar+"', '"+emailvar+"' )";
                st.execute(query);
                
                login.setText("");
                senha.setText("");
                conf_senha.setText("");
                nome_completo.setText("");
                cpf.setText("");
                celular.setText("");
                cidade.setText("");
                uf.setText("");
                num.setText("");
                endereço.setText("");
                email.setText("");
                showMessageDialog(null, "Conta Criada Com Sucesso!! ");
            }
            
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }//GEN-LAST:event_botao_confirmarActionPerformed

    private void botao_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_voltarActionPerformed
        this.dispose();
        TelaDeLogin login = new TelaDeLogin();
        login.setVisible(true);
    }//GEN-LAST:event_botao_voltarActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_confirmar;
    private javax.swing.JButton botao_voltar;
    private javax.swing.JTextField celular;
    private javax.swing.JTextField cidade;
    private javax.swing.JPasswordField conf_senha;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField email;
    private javax.swing.JTextField endereço;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField login;
    private javax.swing.JTextField nome_completo;
    private javax.swing.JTextField num;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField uf;
    // End of variables declaration//GEN-END:variables
}
