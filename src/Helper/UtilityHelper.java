/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;


import DAO.NguoiHocDAO;
import DAO.NhanVienDAO;
import Model.NhanVien;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ntva1
 */
public class UtilityHelper {

    //check duplicate MaNV
    public static boolean checkDuplicateNV_JTextField(JTextField c, String mss) {
        NhanVienDAO dao = new NhanVienDAO();
        if (dao.findById(c.getText()) != null) {
            DialogHelper.alert(c, mss + " Không được trùng!");
            c.requestFocus();
            return false;
        } else {
            return true;
        }
    }
    
    //check not delete if user duplicate MaNV
    public static boolean checkDuplicateUser_MaNV_JTextField(JTextField c,String mss){
        NhanVien nv = new NhanVien();
        if(c.getText().equals(ShareHelper.USER.getMaNV())){
            DialogHelper.alert(c, mss +"Không thể xóa chính mình!");
            c.requestFocus();
            return false;
        }
        else{
            return true;
        }
    }
    
    //check duplicate MaNH
    public static boolean checkDuplicateNH_JTextField(JTextField c, String mss) {
        NguoiHocDAO dao = new NguoiHocDAO();
        if (dao.findById(c.getText()) != null) {
            DialogHelper.alert(c, mss + " Không được trùng!");
            c.requestFocus();
            return false;
        } else {
            return true;
        }
    }

    //check null
    public static boolean checkNull_JTextField(JTextField c, String mss) {
        if (c.getText().length() == 0) {
            DialogHelper.alert(c, mss + " Không được trống!");
            c.requestFocus();
            return false;
        } else {
            return true;
        }
    }

    //check length jpasswordfield
    public static boolean checkLength_JPasswordField(JPasswordField c,int i, String mss) {
        if (c.getPassword().length < i) {
            DialogHelper.alert(c, mss + " Phải có ít nhất "+i+ " kí tự");
            c.requestFocus();
            return false;
        } else {
            return true;
        }
    }
    
    //check length jtextfield
    public static boolean checkLength_JTextField(JTextField c,int i, String mss) {
        if (c.getText().length() != i) {
            DialogHelper.alert(c, mss + " Phải có đúng "+i+ " kí tự");
            c.requestFocus();
            return false;
        } else {
            return true;
        }
    }

    // check name unicode and space
    public static boolean checkName_JTextField(JTextField c, String mss) {
        if (!c.getText().matches("[a-zA-Z\\sAÁÀẢÃẠÂẤẦẨẪẬĂẮẰẲẴẶEÉÈẺẼẸÊẾỀỂỄỆIÍÌỈĨỊOÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢUÚÙỦŨỤƯỨỪỬỮỰYÝỲỶỸỴĐaáàảãạâấầẩẫậăắằẳẵặeéèẻẽẹêếềểễệiíìỉĩịoóòỏõọôốồổỗộơớờởỡợuúùủũụưứừửữựyýỳỷỹỵđ]+")) 
        {
           DialogHelper.alert(c, mss+" Chỉ chứa alphabet và ký tự trắng!");
           c.requestFocus();
           return false;
        }
        else{
            return true;
        }
    }
    
    //check mail
    public static boolean checkMail_JTextField(JTextField c,String mss){
        if(!c.getText().matches("\\w+@\\w+(\\.\\w+){1,2}")){
            DialogHelper.alert(c, mss +" không đúng định dạng!");
            c.requestFocus();
            return false;
        }
        else{
            return true;
        }
    }
    
    //check phone number
    public static boolean checkPhoneNumber_JTextField(JTextField c,String mss){
        if(!c.getText().matches("0[0-9]{9}")){
            DialogHelper.alert(c, mss +" phải bắt đầu là số 0 và có tổng 10 kí tự!");
            c.requestFocus();
            return false;
        }
        else{
            return true;
        }
    }
    //check birthday
    public static boolean checkBirthDay_JTextField(JTextField c, String mss){
        SimpleDateFormat sdf = DateHelper.DATE_FORMATER;
        Date today = DateHelper.now();
        try {
            Date birthday = sdf.parse(""+c.getText());
        if((today.getYear() - birthday.getYear())<16){
            DialogHelper.alert(c, mss +"phải lớn hơn 16 tuổi!");
            c.requestFocus();
            return false;
        }
        } catch (ParseException ex) {
            Logger.getLogger(UtilityHelper.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return true;
    }
    //check date formatter
    public static boolean checkDateFormatter(JTextField c,String mss){
        
        if(!c.getText().matches("\\d{1,2}/\\d{1,2}/\\d{4}")){
            DialogHelper.alert(c, mss+" Sai định dạng.(dd/MM/yyyy)");
            c.requestFocus();
            return false;
        }
        else{
            return true;
        }
    }
    //check date
    public static boolean checkDateBefore_JTextField(JTextField c,String mss){
        Date date = DateHelper.toDate(c.getText(), "dd/MM/yyyy");
        if(date.before(DateHelper.now())){
            DialogHelper.alert(c, mss+" Phải sau ngày hiện tại!");
            c.requestFocus();
            return false;
        }
        else{
            return true;
        }
    }
    
    //check is number jtextfield
    public static boolean checkIsNumber_JTextField(JTextField c,String mss){ 
        
        if(!c.getText().matches("-?\\d+")){
            DialogHelper.alert(c, mss +" phải là số dương lớn hơn 0");
            c.requestFocus();
            return false;
        }
        else{
            return true;
        }
    }
    
    //check number >0
    public static boolean checkDouble_JTextField(JTextField c,String mss){
        double so;
        try {
            so = Double.parseDouble(c.getText());
            if(so<0){
                DialogHelper.alert(c, mss+" Phải lớn hơn 0!");
                c.requestFocus();
                return false;
            }
        } catch (Exception e) { 
        }
        return true;
    }
    //
    public static boolean checkInteger_JTextField(JTextField c,String mss){
        int so;
        try {
            so = Integer.parseInt(c.getText());
            if(so<0){
                DialogHelper.alert(c, mss+" Phải lớn hơn 0!");
                c.requestFocus();
                return false;
            }
        } catch (Exception e) {
        }
        return true;
    }
    ///check point
    public static boolean checkPoint_JTextField(JTextField c,String mss){
        double so;
        try {
            so = Double.parseDouble(c.getText());
            if(so==-1){
                return true;
            }
            else{
                if(so>=0 && so<=10){
                    return true;
                }
                else{
                    DialogHelper.alert(c,mss+ " điểm lớn hơn 0 và nhỏ hơn bằng 10 hoặc điểm bằng -1");
                    return false;
                }
            }
        } catch (Exception e) {           
            return false;   
        }       
    }
    
    //check null image
    public static boolean checkNullImage_JLabel(JLabel c,String mss){
        if(c.getToolTipText()==null){
            DialogHelper.alert(c, mss+" không được trống!");
            c.requestFocus();
            return false;
        }
        else{
            return true;
        }
    }
    
}
