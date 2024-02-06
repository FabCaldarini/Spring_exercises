package it.epicode.w5d1.model;


import it.epicode.w5d1.enums.OrderStatus;

import java.awt.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Order {
    private int orderNumber;
    private OrderStatus status;
    private int numberOfSeats;
    private LocalDateTime acquisitionTime;
    private List<MenuItem> items;
    private BigDecimal coverCharge;

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setAcquisitionTime(LocalDateTime acquisitionTime) {
        this.acquisitionTime = acquisitionTime;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public void setCoverCharge(BigDecimal coverCharge) {
        this.coverCharge = coverCharge;
    }

    public Order(int orderNumber, OrderStatus status, int numberOfSeats, LocalDateTime acquisitionTime, List<MenuItem> items, BigDecimal coverCharge, OrderStatus status1) {
        this.orderNumber = orderNumber;
        this.status = status;
        this.numberOfSeats = numberOfSeats;
        this.acquisitionTime = acquisitionTime;
        this.items = items;
        this.coverCharge = coverCharge;
        this.status = status1;
    }
}
