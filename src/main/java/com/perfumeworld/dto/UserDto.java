package com.perfumeworld.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.perfumeworld.model.Role;
import com.perfumeworld.model.User;


public class UserDto extends AbtractDto<UserDto> {

    @NotBlank(message = "H�? tên không được để trống")
    private String fullName;

    @Pattern(regexp = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b",
            message = "Email không hợp lệ ! (abc@gmail.com)")
    private String email;

    @Pattern(regexp = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$",
            message = "Số điện thoại không hợp lệ! (Số điện thoại có 10 hoặc 11 chữ số)")
    private String phone;

    @NotBlank(message = "Tên tài khoản không được b�? trống")
    private String account;

    @Size(min = 8, message = "Mật khẩu phải nhi�?u hơn 8 kí tự")
    private String password;

//    @NotBlank(message = "Mã OTP không được để trống")
//    @Size(min = 6, max = 6, message = "Mã OTP bao gồm 6 số")
    private String otpCode;
    private boolean verify;
    private int roleId;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getOtpCode() {
        return otpCode;
    }

    public void setOtpCode(String otpCode) {
        this.otpCode = otpCode;
    }

    public boolean isVerify() {
        return verify;
    }

    public void setVerify(boolean verify) {
        this.verify = verify;
    }

    public User convertToEntities() {
        User entity = new User();
        entity.setId(getId());
        entity.setFullName(getFullName());
        entity.setEmail(getEmail());
        entity.setPhone(getPhone());
        entity.setAccount(getAccount());
        entity.setPassword(getPassword());
        entity.setOtpCode(getOtpCode());
        entity.setVerify(false);
        Role role = new Role();
        role.setId(getRoleId());
        entity.setRole(role);
        return entity;
    }

}
