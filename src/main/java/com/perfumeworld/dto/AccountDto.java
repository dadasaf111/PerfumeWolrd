package com.perfumeworld.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



public class AccountDto {
    @NotBlank(message = "Tên tài khoản không được b�? trống")
    private String account;
    @Size(min = 8, message = "Mật khẩu phải nhi�?u hơn 8 kí tự")
    private String password;

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

}
