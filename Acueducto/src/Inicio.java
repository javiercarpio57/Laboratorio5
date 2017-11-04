
import BaseDatos.BasedeDatos;
import BaseDatos.Tanque;
import BaseDatos.TanqueCilindrico;
import BaseDatos.TanqueCubico;
import BaseDatos.TanqueOrtogonal;
import BaseDatos.Valvula;
import java.util.ArrayList;
import javax.persistence.Query;

/**
 *
 * @author Revilo
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    private ArrayList<Valvula> valvula;
    private ArrayList<Tanque> tanques;
    
    public Inicio() {
        initComponents();
        valvula = new ArrayList<>();
        tanques = new ArrayList<>();
        
        BasedeDatos db = new BasedeDatos();
        for(Valvula x : db.recuperarValvulas()){
            valvula.add(x);
        }
        
        int cont = 0;
        for(Valvula y: valvula){
            cont++;
            txtInfo.setText(txtInfo.getText() + cont + "." + y.toString() + "\n") ;
        }
        
        for(Tanque y: db.recuperarTanques()){
            tanques.add(y);
        }
        
        
        
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cmbID = new javax.swing.JComboBox<String>();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        jButton24 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnA6 = new javax.swing.JButton();
        btnA7 = new javax.swing.JButton();
        btnA8 = new javax.swing.JButton();
        btnA9 = new javax.swing.JButton();
        btnA10 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        btnC6 = new javax.swing.JButton();
        btnC7 = new javax.swing.JButton();
        btnC8 = new javax.swing.JButton();
        btnC9 = new javax.swing.JButton();
        btnC10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Control de valvulas");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        jLabel2.setText("Valvula 1");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        jLabel3.setText("Valvula 2");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        jLabel4.setText("Valvula 4");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        jLabel5.setText("Valvula 3");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        jLabel6.setText("Valvula 7");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        jLabel7.setText("Valvula 5");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        jLabel8.setText("Valvula 6");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        jLabel9.setText("Valvula 8");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        jLabel10.setText("Valvula 10");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        jLabel11.setText("Valvula 9");

        btnA1.setBackground(new java.awt.Color(0, 204, 51));
        btnA1.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        btnA1.setText("Abrir");
        btnA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA1ActionPerformed(evt);
            }
        });

        btnC1.setBackground(new java.awt.Color(255, 0, 51));
        btnC1.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        btnC1.setText("Cerrar");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        jLabel12.setText("ID de Tanque:");

        cmbID.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        cmbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIDActionPerformed(evt);
            }
        });

        jButton21.setText("Mostrar Tanque");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("Tanques Cilindricos");

        jButton23.setText("Agua Disponible");

        txtInfo.setColumns(20);
        txtInfo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtInfo.setRows(5);
        txtInfo.setPreferredSize(new java.awt.Dimension(428, 370));
        jScrollPane1.setViewportView(txtInfo);

        jButton24.setText("Agregar tanque");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        lbl1.setText("ACTIVO");

        lbl2.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        lbl2.setText("ACTIVO");

        lbl3.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        lbl3.setText("ACTIVO");

        lbl4.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        lbl4.setText("ACTIVO");

        lbl5.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        lbl5.setText("ACTIVO");

        lbl6.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        lbl6.setText("ACTIVO");

        lbl7.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        lbl7.setText("ACTIVO");

        lbl8.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        lbl8.setText("ACTIVO");

        lbl9.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        lbl9.setText("ACTIVO");

        lbl10.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        lbl10.setText("ACTIVO");

        btnA2.setBackground(new java.awt.Color(0, 204, 51));
        btnA2.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        btnA2.setText("Abrir");

        btnA3.setBackground(new java.awt.Color(0, 204, 51));
        btnA3.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        btnA3.setText("Abrir");

        btnA4.setBackground(new java.awt.Color(0, 204, 51));
        btnA4.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        btnA4.setText("Abrir");

        btnA5.setBackground(new java.awt.Color(0, 204, 51));
        btnA5.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        btnA5.setText("Abrir");

        btnA6.setBackground(new java.awt.Color(0, 204, 51));
        btnA6.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        btnA6.setText("Abrir");

        btnA7.setBackground(new java.awt.Color(0, 204, 51));
        btnA7.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        btnA7.setText("Abrir");

        btnA8.setBackground(new java.awt.Color(0, 204, 51));
        btnA8.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        btnA8.setText("Abrir");

        btnA9.setBackground(new java.awt.Color(0, 204, 51));
        btnA9.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        btnA9.setText("Abrir");

        btnA10.setBackground(new java.awt.Color(0, 204, 51));
        btnA10.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        btnA10.setText("Abrir");

        btnC2.setBackground(new java.awt.Color(255, 0, 51));
        btnC2.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        btnC2.setText("Cerrar");

        btnC3.setBackground(new java.awt.Color(255, 0, 51));
        btnC3.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        btnC3.setText("Cerrar");

        btnC4.setBackground(new java.awt.Color(255, 0, 51));
        btnC4.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        btnC4.setText("Cerrar");

        btnC5.setBackground(new java.awt.Color(255, 0, 51));
        btnC5.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        btnC5.setText("Cerrar");

        btnC6.setBackground(new java.awt.Color(255, 0, 51));
        btnC6.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        btnC6.setText("Cerrar");

        btnC7.setBackground(new java.awt.Color(255, 0, 51));
        btnC7.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        btnC7.setText("Cerrar");

        btnC8.setBackground(new java.awt.Color(255, 0, 51));
        btnC8.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        btnC8.setText("Cerrar");

        btnC9.setBackground(new java.awt.Color(255, 0, 51));
        btnC9.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        btnC9.setText("Cerrar");

        btnC10.setBackground(new java.awt.Color(255, 0, 51));
        btnC10.setFont(new java.awt.Font("Century Gothic", 0, 21)); // NOI18N
        btnC10.setText("Cerrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel12)
                                .addGap(42, 42, 42)
                                .addComponent(cmbID, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(122, 122, 122)
                        .addComponent(jButton21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnA8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnC8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl8))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnA7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnC7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnA6)
                                                .addGap(21, 21, 21)
                                                .addComponent(btnC6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnA5)
                                                .addGap(21, 21, 21)
                                                .addComponent(btnC5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl5))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnA4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnC4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnA3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnC3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnA2)
                                                .addGap(21, 21, 21)
                                                .addComponent(btnC2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnA1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnC1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnA9)
                                            .addComponent(btnA10))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(btnC10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl10))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnC9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl9)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton24)
                                        .addGap(38, 38, 38))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton23)
                                        .addGap(215, 215, 215)))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton21)
                            .addComponent(jButton22))
                        .addGap(20, 20, 20)
                        .addComponent(jButton23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cmbID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnA1)
                            .addComponent(btnC1)
                            .addComponent(lbl1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbl2)
                            .addComponent(btnA2)
                            .addComponent(btnC2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lbl3)
                            .addComponent(btnA3)
                            .addComponent(btnC3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lbl4)
                            .addComponent(btnA4)
                            .addComponent(btnC4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lbl5)
                            .addComponent(btnA5)
                            .addComponent(btnC5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lbl6)
                            .addComponent(btnA6)
                            .addComponent(btnC6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lbl7)
                            .addComponent(btnA7)
                            .addComponent(btnC7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lbl8)
                            .addComponent(btnA8)
                            .addComponent(btnC8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(lbl9)
                            .addComponent(btnA9)
                            .addComponent(btnC9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(btnA10)
                            .addComponent(btnC10)
                            .addComponent(lbl10))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIDActionPerformed
        String op1 = (String)cmbID.getSelectedItem();
        int op = Integer.parseInt(op1);
        String cadena = "", tipo = "";
        for(Tanque t: tanques){
            if(t.getNum() == op){
                cadena = t.toString();
                if(t instanceof TanqueCilindrico){
                    tipo = "Tanque cilindrico:";
                }else if(t instanceof TanqueOrtogonal){
                    tipo = "Tanque ortogonal:";
                }else if(t instanceof TanqueCubico){
                    tipo = "Tanque cubico:";
                }
            }
            
        }
        
        txtInfo.setText(tipo + "\n" + cadena);
    }//GEN-LAST:event_cmbIDActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        NuevoTanques nt = new NuevoTanques();
        nt.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        int a = 0;
        String cadena = "";
        for(Tanque x : tanques){
            a++;
            cadena += a + ". " + x.toString() + "\n";
        }
        txtInfo.setText(cadena);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void btnA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA1ActionPerformed
        lbl1.setText("ACTIVO");
    }//GEN-LAST:event_btnA1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        for(Tanque tq: tanques){
            String a = String.valueOf(tq.getNum());
            cmbID.addItem(a);
        }
    }//GEN-LAST:event_formWindowOpened

    public void getListas(ArrayList<Valvula>a , ArrayList<Tanque> t){
        tanques = t;
        valvula = a;
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA1;
    private javax.swing.JButton btnA10;
    private javax.swing.JButton btnA2;
    private javax.swing.JButton btnA3;
    private javax.swing.JButton btnA4;
    private javax.swing.JButton btnA5;
    private javax.swing.JButton btnA6;
    private javax.swing.JButton btnA7;
    private javax.swing.JButton btnA8;
    private javax.swing.JButton btnA9;
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnC10;
    private javax.swing.JButton btnC2;
    private javax.swing.JButton btnC3;
    private javax.swing.JButton btnC4;
    private javax.swing.JButton btnC5;
    private javax.swing.JButton btnC6;
    private javax.swing.JButton btnC7;
    private javax.swing.JButton btnC8;
    private javax.swing.JButton btnC9;
    private javax.swing.JComboBox<String> cmbID;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JTextArea txtInfo;
    // End of variables declaration//GEN-END:variables
}
