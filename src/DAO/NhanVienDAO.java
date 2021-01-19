/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Helper.JdbcHelper;
import Model.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ntva1
 */
public class NhanVienDAO {
    /**  * Thêm mới thực thể vào CSDL 
     * @param entity là thực thể chứa thông tin bản ghi mới  
     */ 
    public void insert(NhanVien model){
        String sql = "INSERT INTO NhanVien VALUES(?,?,?,?)";
        JdbcHelper.executeUpdate(sql,
                model.getMaNV(),
                model.getMatKhau(),
                model.getHoTen(),
                model.isVaiTro());
    }
    /**  * Cập nhật thực thể vào CSDL  
     * @param entity là thực thể chứa thông tin bản ghi cần cập nhật  
     */ 
    public void update(NhanVien model){
        String sql = "UPDATE NhanVien SET MatKhau=?, HoTen=?,VaiTro=? WHERE MaNV=?";
        JdbcHelper.executeUpdate(sql,
                model.getMatKhau(),
                model.getHoTen(),
                model.isVaiTro(),
                model.getMaNV());
    }
    /**  * Xóa bản ghi khỏi CSDL  
     * @param id  là mã của bản ghi cần xóa  
     */ 
    public void delete(String MaNV){
        String sql = "DELETE FROM NhanVien WHERE MaNV=?";
        JdbcHelper.executeUpdate(sql, MaNV);
    }
    /**  * Truy vấn tất cả các các thực thể  
     * @return danh sách các thực thể  
     */ 
    public List<NhanVien> select(){
        String sql = "SELECT * FROM NhanVien";
        return select(sql);    
    } 
     /**  * Truy vấn thực thể theo mã  
      * @param id là mã của bản ghi được truy vấn  
      * @return thực thể chứa thông tin của bản ghi  
      */ 
    public NhanVien findById(String manv){
        String sql  = "SELECT * FROM NhanVien WHERE MaNV=?";
        List<NhanVien> list = select(sql,manv);
        return list.size()>0 ? list.get(0) : null;
    } 
    
    
    private List<NhanVien> select(String sql,Object...args){
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while(rs.next()){
                    NhanVien model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally{
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
    
    private NhanVien readFromResultSet(ResultSet rs) throws SQLException{
        NhanVien model = new NhanVien();
        model.setMaNV(rs.getString("MaNV"));
        model.setMatKhau(rs.getString("MatKhau"));
        model.setHoTen(rs.getString("HoTen"));
        model.setVaiTro(rs.getBoolean("VaiTro"));
        
        return model;
    }
}
