package com.perfumeworld.dto;

import javax.validation.constraints.NotBlank;

import com.perfumeworld.model.Order;
import com.perfumeworld.model.User;


public class OrderDto extends AbtractDto<OrderDto> {
    private String content;
    @NotBlank(message = "�?ịa chỉ không được trống")
    private String deliveryAddress;
    @NotBlank(message = "Số điện thoại ngư�?i nhận không được trống")
    private String phone;
    @NotBlank(message = "Tên ngư�?i nhận không được trống")
    private String receiver;
    private Boolean status;
    private Long totalMoney;
    private UserDto userDto;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Long totalMoney) {
        this.totalMoney = totalMoney;
    }


    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public Order convertToEntities() {
        Order entity = new Order();
        entity.setContent(content);
        entity.setDeliveryAddress(deliveryAddress);
        entity.setTotalMoney(totalMoney);
        entity.setPhone(phone);
        entity.setReceiver(receiver);
        entity.setStatus(status);
        User user = new User();
        user.setId(userDto.getId());
        entity.setCustomer(user);
        return entity;
    }

}
