package gui;

import dados.Prof;
import dao.Prof_DAO;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Edit_Prof extends javax.swing.JFrame {

    //static int id = 0;
    private final Prof_DAO prof_DAO = new Prof_DAO();

    private Prof professor = null;
    private final Prof_DAO professorDAO = new Prof_DAO();

    int codigo = 0;
    // variavel código, controlar o próximo código a ser apresentado na tela

    /**
     * Creates new form Cad_Prod
     *
     * @throws java.lang.ClassNotFoundException
     */
    public Edit_Prof() throws ClassNotFoundException, Exception {
        initComponents();
        setLocationRelativeTo(null);
        txt_id.setDocument(new Nums_JTextField());
        txt_nome.setDocument(new Letras_JTextField());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        CB_Disciplinas = new javax.swing.JComboBox<>();
        CB_Turmas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setPreferredSize(new java.awt.Dimension(630, 250));
        setResizable(false);
        setSize(new java.awt.Dimension(630, 240));

        jLabel2.setText("Número da turma:");

        jLabel3.setText("Nome do professor(a):");

        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Disciplina:");

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CB_Disciplinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arte","Biologia","Filosofia","Física","Geografia","História","Inglês","Matemática","Português" }));
        CB_Disciplinas.setSelectedIndex(0);
        CB_Disciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_DisciplinasActionPerformed(evt);
            }
        });

        CB_Turmas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "200", "300", "400", "500" }));
        CB_Turmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_TurmasActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfil2.png"))); // NOI18N

        jLabel8.setText("ID:");

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        jButton2.setText("Procurar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CB_Disciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CB_Turmas, 0, 245, Short.MAX_VALUE)
                            .addComponent(txt_nome)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txt_id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CB_Turmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(CB_Disciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (validarForm()) {
            String nome = txt_nome.getText().trim();
            String turma = (String) CB_Turmas.getSelectedItem();
            String disciplina = (String) CB_Disciplinas.getSelectedItem();
            String id = (String) txt_id.getText();
            //   String  sql = "UPDATE professor SET nome = " + "'" + nome + "'" + ", turma = " + turma + ", disciplina = " + "'" + disciplina + "'" + "WHERE idprofessor = " + id;
            // JOptionPane.showMessageDialog(this, sql);

            try {
                prof_DAO.editarID(id, nome, turma, disciplina);
                this.dispose();
                // new Professores().setVisible(true);
                JOptionPane.showMessageDialog(this, "Professor editado com sucesso");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao editar informação.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

            /*professor = new Prof();
            professor.setNome(txt_nome.getText().trim());
            
            String value = (String)CB_Disciplinas.getSelectedItem();
            professor.setDisciplina(value);
            value = (String)CB_Turmas.getSelectedItem();
            professor.setTurma(Integer.parseInt(value));
             */
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeActionPerformed

    private void CB_DisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DisciplinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_DisciplinasActionPerformed

    private void CB_TurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_TurmasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_TurmasActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       // prof_DAO.listarID();
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private boolean validarForm() {

        // verificando se os campos estão preenchidos
        if (txt_nome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Nome.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_nome.requestFocus();
            return false;

        }
        if (txt_id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o campo ID.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_id.requestFocus();
            return false;
        }

        /* if (txt_disciplina.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe a disciplina.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_disciplina.requestFocus();
            return false;
        }
        
        if (txt_turma.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe a turma.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_disciplina.requestFocus();
            return false;
        }*/
        // campo quantidade não precisa verificar pois por padrão já inicia com 1
        // validadndo os dados preenchidos pelos usúarios
        // campo JTextField 
        if (txt_nome.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "Nome do professor inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_nome.requestFocus();
            return false;
        }

        // campo JFormattedTextField
        /* if (txt_nome.getText().trim().length() < 3) {
         
             
            JOptionPane.showMessageDialog(this, "Disciplina inválida.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_disciplina.requestFocus();
            return false;
        }
          // campo JSpinner
        if (Integer.parseInt(txt_turma.getText())  <= 0) {
            JOptionPane.showMessageDialog(this, "Turma inválida", "Alerta", JOptionPane.WARNING_MESSAGE);
            txt_turma.requestFocus();
            return false;
        }*/
        return true;
    }

    class Letras_JTextField extends PlainDocument {

        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            super.insertString(offs, str.replaceAll("[^aA-zZ]", ""), a);
        }
    }

    class Nums_JTextField extends PlainDocument {

        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            super.insertString(offs, str.replaceAll("[^0-9]", ""), a);
        }
    }

    public static void main(String[] args) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_Disciplinas;
    private javax.swing.JComboBox<String> CB_Turmas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables
}
