package jododavelha2020;

public class GUI_Jogo extends javax.swing.JFrame {

    public GUI_Jogo() {
        initComponents();
    }

    //Desabilita todos os botões do jogo
    private void stop() {
        this.btnJogo00.disable();
        this.btnJogo01.disable();
        this.btnJogo02.disable();
        this.btnJogo10.disable();
        this.btnJogo11.disable();
        this.btnJogo12.disable();
        this.btnJogo20.disable();
        this.btnJogo21.disable();
        this.btnJogo22.disable();
    }
    
    //Reabilita os botões do jogo
    private void reborn(){
        this.btnJogo00.enable(true);
        this.btnJogo01.enable(true);
        this.btnJogo02.enable(true);
        this.btnJogo10.enable(true);
        this.btnJogo11.enable(true);
        this.btnJogo12.enable(true);
        this.btnJogo20.enable(true);
        this.btnJogo21.enable(true);
        this.btnJogo22.enable(true);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnJogo02 = new java.awt.Button();
        btnJogo00 = new java.awt.Button();
        btnJogo01 = new java.awt.Button();
        btnJogo10 = new java.awt.Button();
        btnJogo11 = new java.awt.Button();
        btnJogo12 = new java.awt.Button();
        btnJogo20 = new java.awt.Button();
        btnJogo21 = new java.awt.Button();
        btnJogo22 = new java.awt.Button();
        jPanel3 = new javax.swing.JPanel();
        btnLimpar = new java.awt.Button();
        btnReset = new java.awt.Button();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jl_JogadorDaVez = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jl_JogadorGanhador = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabelX = new javax.swing.JLabel();
        txtWinX = new javax.swing.JLabel();
        txtWinO = new javax.swing.JLabel();
        jLabelY = new javax.swing.JLabel();
        jLabelL2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Jogo da Velha 2020");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnJogo02.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnJogo02.setName("btnJogo02"); // NOI18N
        btnJogo02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogo02ActionPerformed(evt);
            }
        });

        btnJogo00.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnJogo00.setName("btnJogo00"); // NOI18N
        btnJogo00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogo00ActionPerformed(evt);
            }
        });

        btnJogo01.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnJogo01.setName("btnJogo01"); // NOI18N
        btnJogo01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogo01ActionPerformed(evt);
            }
        });

        btnJogo10.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnJogo10.setName("btnJogo10"); // NOI18N
        btnJogo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogo10ActionPerformed(evt);
            }
        });

        btnJogo11.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnJogo11.setName("11"); // NOI18N
        btnJogo11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogo11ActionPerformed(evt);
            }
        });

        btnJogo12.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnJogo12.setName("btnJogo12"); // NOI18N
        btnJogo12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogo12ActionPerformed(evt);
            }
        });

        btnJogo20.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnJogo20.setName("btnJogo20"); // NOI18N
        btnJogo20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogo20ActionPerformed(evt);
            }
        });

        btnJogo21.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnJogo21.setName("btnJogo21"); // NOI18N
        btnJogo21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogo21ActionPerformed(evt);
            }
        });

        btnJogo22.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnJogo22.setName("btnJogo22"); // NOI18N
        btnJogo22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogo22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnJogo10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnJogo11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnJogo12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnJogo00, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnJogo01, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnJogo02, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnJogo20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnJogo21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnJogo22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnJogo01, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJogo02, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJogo00, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnJogo11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJogo12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJogo10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnJogo21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJogo22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJogo20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnLimpar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLimpar.setLabel("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnReset.setLabel("Reset Placar");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Jogador da vez:");

        jl_JogadorDaVez.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jl_JogadorDaVez.setText("X");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jl_JogadorDaVez)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_JogadorDaVez))
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Jogador ganhador:");

        jl_JogadorGanhador.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jl_JogadorGanhador.setText("---");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jl_JogadorGanhador)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jl_JogadorGanhador))
        );

        jPanel7.setBackground(new java.awt.Color(102, 102, 255));

        jLabelX.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelX.setText("Player X");

        txtWinX.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtWinX.setText("0");

        txtWinO.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtWinO.setText("0");

        jLabelY.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelY.setText("Player Y");

        jLabelL2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelL2.setText("Placar");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(txtWinX, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelX)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(txtWinO)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabelY)
                        .addGap(26, 26, 26))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabelL2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelL2)
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelX)
                    .addComponent(jLabelY))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWinX, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWinO))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogo02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogo02ActionPerformed
        
        this.btnJogo02.disable();
        System.out.println("Jogdador da vez " + jogo.getPlayer());

        if (jogo.getPlayer() == 1) {
            btnJogo02.setLabel("X");
            jogo.setPlayer(2);
            jl_JogadorDaVez.setText("O");
            jogo.MarcaX02();
        } else {
            btnJogo02.setLabel("O");
            jogo.setPlayer(1);
            jl_JogadorDaVez.setText("X");
            jogo.MarcaO02();
        }
        jogo.Champion();

        if (jogo.getWinner() == 1) {
            jl_JogadorGanhador.setText("X");
            stop();
        } else {
            if (jogo.getWinner() == 2) {
                jl_JogadorGanhador.setText("O");
                stop();
            }
        }
        jogo.placar();
        txtWinX.setText(String.valueOf(jogo.getCountX()));
        txtWinO.setText(String.valueOf(jogo.getCountO()));
    }//GEN-LAST:event_btnJogo02ActionPerformed

    private void btnJogo00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogo00ActionPerformed
        
        this.btnJogo00.disable();
        System.out.println("Jogdador da vez " + jogo.getPlayer());
        if (jogo.getJogo00() == 0) {
            if (jogo.getPlayer() == 1) {
                btnJogo00.setLabel("X");
                jogo.setPlayer(2);
                jl_JogadorDaVez.setText("O");
                jogo.MarcaX00();

            } else {
                btnJogo00.setLabel("O");
                jogo.setPlayer(1);
                jl_JogadorDaVez.setText("X");
                jogo.MarcaO00();
            }
            jogo.Champion();

            if (jogo.getWinner() == 1) {
                jl_JogadorGanhador.setText("X");
                stop();

            } else {
                if (jogo.getWinner() == 2) {
                    jl_JogadorGanhador.setText("O");
                    stop();
                }
            }

            jogo.placar();
            txtWinX.setText(String.valueOf(jogo.getCountX()));
            txtWinO.setText(String.valueOf(jogo.getCountO()));

        }
    }//GEN-LAST:event_btnJogo00ActionPerformed

    private void btnJogo01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogo01ActionPerformed
        
        this.btnJogo01.disable();
        System.out.println("Jogdador da vez " + jogo.getPlayer());

        if (jogo.getPlayer() == 1) {
            btnJogo01.setLabel("X");
            jogo.setPlayer(2);
            jl_JogadorDaVez.setText("O");
            jogo.MarcaX01();
        } else {
            btnJogo01.setLabel("O");
            jogo.setPlayer(1);
            jl_JogadorDaVez.setText("X");
            jogo.MarcaO01();
        }
        jogo.Champion();

        if (jogo.getWinner() == 1) {
            jl_JogadorGanhador.setText("X");
            stop();
        } else {
            if (jogo.getWinner() == 2) {
                jl_JogadorGanhador.setText("O");
                stop();
            }

        }
        jogo.placar();
        txtWinX.setText(String.valueOf(jogo.getCountX()));
        txtWinO.setText(String.valueOf(jogo.getCountO()));
    }//GEN-LAST:event_btnJogo01ActionPerformed

    private void btnJogo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogo10ActionPerformed
       this.btnJogo10.disable(); 
        
        if (jogo.getJogo10() == 0) {
            if (jogo.getPlayer() == 1) {
                btnJogo10.setLabel("X");
                jogo.setPlayer(2);
                jl_JogadorDaVez.setText("O");
                jogo.MarcaX10();
            } else {
                btnJogo10.setLabel("O");
                jogo.setPlayer(1);
                jl_JogadorDaVez.setText("X");
                jogo.MarcaO10();
            }
            jogo.Champion();

            if (jogo.getWinner() == 1) {
                jl_JogadorGanhador.setText("X");
                stop();
            } else {
                if (jogo.getWinner() == 2) {
                    jl_JogadorGanhador.setText("O");
                    stop();
                }
            }
        }
        jogo.placar();
        txtWinX.setText(String.valueOf(jogo.getCountX()));
        txtWinO.setText(String.valueOf(jogo.getCountO()));
    }//GEN-LAST:event_btnJogo10ActionPerformed

    private void btnJogo11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogo11ActionPerformed
        this.btnJogo11.disable();
        if (jogo.getJogo11() == 0) {
            if (jogo.getPlayer() == 1) {
                btnJogo11.setLabel("X");
                jogo.setPlayer(2);
                jl_JogadorDaVez.setText("O");
                jogo.MarcaX11();
            } else {
                btnJogo11.setLabel("O");
                jogo.setPlayer(1);
                jl_JogadorDaVez.setText("X");
                jogo.MarcaO11();
            }
            jogo.Champion();

            if (jogo.getWinner() == 1) {
                jl_JogadorGanhador.setText("X");
                stop();
            } else {
                if (jogo.getWinner() == 2) {
                    jl_JogadorGanhador.setText("O");
                    stop();
                }
            }
        }
        jogo.placar();
        txtWinX.setText(String.valueOf(jogo.getCountX()));
        txtWinO.setText(String.valueOf(jogo.getCountO()));
    }//GEN-LAST:event_btnJogo11ActionPerformed

    private void btnJogo12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogo12ActionPerformed
        this.btnJogo12.disable();
        if (jogo.getJogo12() == 0) {
            if (jogo.getPlayer() == 1) {
                btnJogo12.setLabel("X");
                jogo.setPlayer(2);
                jl_JogadorDaVez.setText("O");
                jogo.MarcaX12();
            } else {
                btnJogo12.setLabel("O");
                jogo.setPlayer(1);
                jl_JogadorDaVez.setText("X");
                jogo.MarcaO12();
            }
            jogo.Champion();

            if (jogo.getWinner() == 1) {
                jl_JogadorGanhador.setText("X");
                stop();
            } else {
                if (jogo.getWinner() == 2) {
                    jl_JogadorGanhador.setText("O");
                    stop();
                }
            }
        }
        jogo.placar();
        txtWinX.setText(String.valueOf(jogo.getCountX()));
        txtWinO.setText(String.valueOf(jogo.getCountO()));
    }//GEN-LAST:event_btnJogo12ActionPerformed

    private void btnJogo20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogo20ActionPerformed
        this.btnJogo20.disable();
        if (jogo.getJogo20() == 0) {
            if (jogo.getPlayer() == 1) {
                btnJogo20.setLabel("X");
                jogo.setPlayer(2);
                jl_JogadorDaVez.setText("O");
                jogo.MarcaX20();
            } else {
                btnJogo20.setLabel("O");
                jogo.setPlayer(1);
                jl_JogadorDaVez.setText("X");
                jogo.MarcaO20();
            }
            jogo.Champion();

            if (jogo.getWinner() == 1) {
                jl_JogadorGanhador.setText("X");
                stop();
            } else {
                if (jogo.getWinner() == 2) {
                    jl_JogadorGanhador.setText("O");
                    stop();
                }
            }
        }
        jogo.placar();
        txtWinX.setText(String.valueOf(jogo.getCountX()));
        txtWinO.setText(String.valueOf(jogo.getCountO()));
    }//GEN-LAST:event_btnJogo20ActionPerformed

    private void btnJogo21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogo21ActionPerformed
        this.btnJogo21.disable();
        if (jogo.getJogo21() == 0) {
            if (jogo.getPlayer() == 1) {
                btnJogo21.setLabel("X");
                jogo.setPlayer(2);
                jl_JogadorDaVez.setText("O");
                jogo.MarcaX21();
            } else {
                btnJogo21.setLabel("O");
                jogo.setPlayer(1);
                jl_JogadorDaVez.setText("X");
                jogo.MarcaO21();
            }
            jogo.Champion();

            if (jogo.getWinner() == 1) {
                jl_JogadorGanhador.setText("X");
                stop();
            } else {
                if (jogo.getWinner() == 2) {
                    jl_JogadorGanhador.setText("O");
                    stop();
                }
            }
        }
        jogo.placar();
        txtWinX.setText(String.valueOf(jogo.getCountX()));
        txtWinO.setText(String.valueOf(jogo.getCountO()));
    }//GEN-LAST:event_btnJogo21ActionPerformed

    private void btnJogo22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogo22ActionPerformed
        this.btnJogo22.disable();
        if (jogo.getJogo22() == 0) {
            if (jogo.getPlayer() == 1) {
                btnJogo22.setLabel("X");
                jogo.setPlayer(2);
                jl_JogadorDaVez.setText("O");
                jogo.MarcaX22();
            } else {
                btnJogo22.setLabel("O");
                jogo.setPlayer(1);
                jl_JogadorDaVez.setText("X");
                jogo.MarcaO22();
            }
            jogo.Champion();

            if (jogo.getWinner() == 1) {
                jl_JogadorGanhador.setText("X");
                stop();
            } else {
                if (jogo.getWinner() == 2) {
                    jl_JogadorGanhador.setText("O");
                    stop();
                }
            }
        }
        jogo.placar();
        txtWinX.setText(String.valueOf(jogo.getCountX()));
        txtWinO.setText(String.valueOf(jogo.getCountO()));
    }//GEN-LAST:event_btnJogo22ActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        //Reabilita os botões
        reborn();
        // limpar o modelo matematico
        jogo.limpar();
        // limpar a interfacer grafica
        btnJogo00.setLabel("");
        btnJogo01.setLabel("");
        btnJogo02.setLabel("");

        btnJogo10.setLabel("");
        btnJogo11.setLabel("");
        btnJogo12.setLabel("");

        btnJogo20.setLabel("");
        btnJogo21.setLabel("");
        btnJogo22.setLabel("");

        jl_JogadorDaVez.setText("X");
        jl_JogadorGanhador.setText("---");
        System.out.println("RESET Jogdador da vez " + jogo.getPlayer());


    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        jogo.reset();
        txtWinX.setText(String.valueOf(jogo.getCountX()));
        txtWinO.setText(String.valueOf(jogo.getCountO()));
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnJogo00;
    private java.awt.Button btnJogo01;
    private java.awt.Button btnJogo02;
    private java.awt.Button btnJogo10;
    private java.awt.Button btnJogo11;
    private java.awt.Button btnJogo12;
    private java.awt.Button btnJogo20;
    private java.awt.Button btnJogo21;
    private java.awt.Button btnJogo22;
    private java.awt.Button btnLimpar;
    private java.awt.Button btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelL2;
    private javax.swing.JLabel jLabelX;
    private javax.swing.JLabel jLabelY;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel jl_JogadorDaVez;
    private javax.swing.JLabel jl_JogadorGanhador;
    private javax.swing.JLabel txtWinO;
    private javax.swing.JLabel txtWinX;
    // End of variables declaration//GEN-END:variables
    // variaveis de negocio
    Jogo_Logica jogo = new Jogo_Logica();

}
