/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UL;

import DAO.ChuyenDeDAO;
import Helper.DialogHelper;
import Helper.ShareHelper;
import Helper.UtilityHelper;
import Model.ChuyenDe;
import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ntva1
 */
public class ChuyenDeJInternalFrame extends javax.swing.JInternalFrame {

    ChuyenDeDAO dao = new ChuyenDeDAO();
    int index = 0;
    JFileChooser fileChooser = new JFileChooser();
    /**
     * Creates new form QLChuyenDe
     */
    public ChuyenDeJInternalFrame() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        pnlEdit = new javax.swing.JPanel();
        lblMaCD = new javax.swing.JLabel();
        txtMaCD = new javax.swing.JTextField();
        lblTenCD = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        txtTenCD = new javax.swing.JTextField();
        lblThoiLuong = new javax.swing.JLabel();
        txtThoiLuong = new javax.swing.JTextField();
        lblHocPhi = new javax.swing.JLabel();
        txtHocPhi = new javax.swing.JTextField();
        lblMoTa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        lblHinh = new javax.swing.JLabel();
        pnlList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGridView = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("QUẢN LÝ CHUYÊN ĐỀ");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        lblMaCD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMaCD.setText("Mã chuyên đề");

        txtMaCD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtMaCD.setMinimumSize(new java.awt.Dimension(4, 27));
        txtMaCD.setPreferredSize(new java.awt.Dimension(4, 27));

        lblTenCD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblTenCD.setText("Tên chuyên đề");

        btnInsert.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit.png"))); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Notes.png"))); // NOI18N
        btnClear.setText("Mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnFirst.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/prev.png"))); // NOI18N
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/2.png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        txtTenCD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblThoiLuong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblThoiLuong.setText("Thời lượng (giờ)");
        lblThoiLuong.setMaximumSize(new java.awt.Dimension(63, 19));
        lblThoiLuong.setMinimumSize(new java.awt.Dimension(63, 19));

        txtThoiLuong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtThoiLuong.setMinimumSize(new java.awt.Dimension(4, 27));
        txtThoiLuong.setPreferredSize(new java.awt.Dimension(4, 27));

        lblHocPhi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblHocPhi.setText("Học phí");
        lblHocPhi.setMaximumSize(new java.awt.Dimension(64, 19));
        lblHocPhi.setMinimumSize(new java.awt.Dimension(64, 19));

        txtHocPhi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtHocPhi.setMinimumSize(new java.awt.Dimension(4, 27));
        txtHocPhi.setPreferredSize(new java.awt.Dimension(4, 27));

        lblMoTa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMoTa.setText("Mô tả chuyên đề");

        txtMoTa.setColumns(20);
        txtMoTa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtMoTa.setRows(5);
        jScrollPane2.setViewportView(txtMoTa);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Hình logo");

        lblHinh.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 255), null));
        lblHinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEditLayout.createSequentialGroup()
                        .addComponent(btnInsert)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEditLayout.createSequentialGroup()
                        .addComponent(lblMoTa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEditLayout.createSequentialGroup()
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTenCD)
                            .addComponent(lblHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaCD)
                            .addComponent(txtMaCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenCD)
                            .addComponent(txtThoiLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHocPhi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaCD)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(txtMaCD, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTenCD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenCD, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblMoTa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear)
                    .addComponent(btnFirst)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addContainerGap())
        );

        tabs.addTab("CẬP NHẬT", pnlEdit);

        tblGridView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MÃ CD", "TÊN CD", "HỌC PHÍ", "THỜI LƯỢNG", "HÌNH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGridView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGridViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGridView);

        javax.swing.GroupLayout pnlListLayout = new javax.swing.GroupLayout(pnlList);
        pnlList.setLayout(pnlListLayout);
        pnlListLayout.setHorizontalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );
        pnlListLayout.setVerticalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        tabs.addTab("DANH SÁCH", pnlList);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("QUẢN LÝ CHUYÊN ĐỀ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        this.load();
        this.setStatus(true);
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        this.index =0;
        this.edit();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        this.index--;
        this.edit();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        this.index++;
        this.edit();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        this.index = tblGridView.getRowCount()-1;
        this.edit();
    }//GEN-LAST:event_btnLastActionPerformed

    private void lblHinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhMouseClicked
        // TODO add your handling code here:
        this.selectImage();
    }//GEN-LAST:event_lblHinhMouseClicked

    private void tblGridViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGridViewMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            this.index = tblGridView.rowAtPoint(evt.getPoint());
            if(this.index>=0){
                this.edit();
                tabs.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_tblGridViewMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lblHocPhi;
    private javax.swing.JLabel lblMaCD;
    private javax.swing.JLabel lblMoTa;
    private javax.swing.JLabel lblTenCD;
    private javax.swing.JLabel lblThoiLuong;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JPanel pnlList;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblGridView;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtMaCD;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtTenCD;
    private javax.swing.JTextField txtThoiLuong;
    // End of variables declaration//GEN-END:variables

    void init() {
        setFrameIcon(ShareHelper.APP_ICON_1);
        tabs.setSelectedIndex(1);
        fileChooser.setDialogTitle("Chọn logo chuyên đề");
    }

    void load() {
        DefaultTableModel model = (DefaultTableModel) tblGridView.getModel();
        model.setRowCount(0);
        try {
            List<ChuyenDe> list = dao.select();
            for (ChuyenDe cd : list) {
                Object[] row = {
                    cd.getMaCD(), cd.getTenCD(), cd.getHocPhi(), cd.getThoiLuong(), cd.getHinh()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }
    
    void insert(){
        if(!UtilityHelper.checkLength_JTextField(txtMaCD, 5, "Mã chuyên đề")){return;}
        if(!UtilityHelper.checkName_JTextField(txtTenCD, "Tên chuyên đề")){return;}
        if(!UtilityHelper.checkIsNumber_JTextField(txtThoiLuong, "Thời lượng")){return;}
        if(!UtilityHelper.checkInteger_JTextField(txtThoiLuong, "Thời lượng")){return;}    
        if(!UtilityHelper.checkIsNumber_JTextField(txtHocPhi, "Học phí")){return;}
        if(!UtilityHelper.checkDouble_JTextField(txtHocPhi, "Học phí")){return;}
        if(!UtilityHelper.checkNullImage_JLabel(lblHinh, "Hình")){return;}
        ChuyenDe model = getModel();
        try {
            dao.insert(model);
            this.load();
            this.clear();
            DialogHelper.alert(this, "Thêm mới thành công");
        } catch (Exception e) {
            DialogHelper.alert(this, "Thêm mới thất bại");
        }
    }
    
    void update(){
        if(!UtilityHelper.checkName_JTextField(txtTenCD, "Tên chuyên đề")){return;}
        if(!UtilityHelper.checkIsNumber_JTextField(txtThoiLuong, "Thời lượng")){return;}
        if(!UtilityHelper.checkInteger_JTextField(txtThoiLuong, "Thời lượng")){return;}    
        if(!UtilityHelper.checkIsNumber_JTextField(txtHocPhi, "Học phí")){return;}
        if(!UtilityHelper.checkDouble_JTextField(txtHocPhi, "Học phí")){return;}
        if(!UtilityHelper.checkNullImage_JLabel(lblHinh, "Hình")){return;}
        ChuyenDe model = getModel();
        try {
            dao.update(model);
            this.load();
            DialogHelper.alert(this, "Cập nhật thành công");
        } catch (Exception e) {
            DialogHelper.alert(this, "Cập nhật thất bại");
        }
    }
    
    void delete(){
        if(DialogHelper.confirm(this, "Bạn có muốn xóa không")){
            String macd = txtMaCD.getText();
            try {
                dao.delete(macd);
                this.load();
                this.clear();
                DialogHelper.alert(this, "Xóa thành công");
            } catch (Exception e) {
                DialogHelper.alert(this, "Xóa thất bại");
            }
        }
    }
    
    void clear(){
        this.setModel(new ChuyenDe());
        this.setStatus(true);
    }
    
    void edit(){
        try {
            String macd = (String)tblGridView.getValueAt(this.index,0);
            ChuyenDe model = dao.findById(macd);
            if(model!=null){
                this.setModel(model);
                this.setStatus(false);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

    void setModel(ChuyenDe model) {
        txtMaCD.setText(model.getMaCD());
        txtTenCD.setText(model.getTenCD());
        txtThoiLuong.setText(String.valueOf(model.getThoiLuong()));
        txtHocPhi.setText(String.valueOf(model.getHocPhi()));
        txtMoTa.setText(model.getMoTa());
        lblHinh.setToolTipText(model.getHinh());
        if(model.getHinh()!=null){
            lblHinh.setIcon(ShareHelper.readLogo(model.getHinh()));
        }
    }
    
    ChuyenDe getModel(){
        ChuyenDe model = new ChuyenDe();
        model.setMaCD(txtMaCD.getText());
        model.setTenCD(txtTenCD.getText());
        model.setThoiLuong(Integer.valueOf(txtThoiLuong.getText()));
        model.setHocPhi(Double.valueOf(txtHocPhi.getText()));
        model.setHinh(lblHinh.getToolTipText());
        model.setMoTa(txtMoTa.getText());
        return model;
    }
    
    void setStatus(boolean insertable){
        txtMaCD.setEditable(insertable);
        btnInsert.setEnabled(insertable);
        btnUpdate.setEnabled(!insertable);
        btnDelete.setEnabled(!insertable);
        
        boolean first = this.index >0;
        boolean last = this.index<tblGridView.getRowCount()-1;
        
        btnFirst.setEnabled(!insertable && first);
        btnPrev.setEnabled(!insertable && first);
        btnLast.setEnabled(!insertable && last);
        btnNext.setEnabled(!insertable && last);
    }

    void selectImage() {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
           
            File file = fileChooser.getSelectedFile();
            if (ShareHelper.saveLogo(file)) {
                // Hiển thị hình lên form 
                lblHinh.setIcon(ShareHelper.readLogo(file.getName()));
                lblHinh.setToolTipText(file.getName());
            }
        }
    }
}