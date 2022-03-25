package com.example.tbot_client_v2.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "offers")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "offer_info")
    private String offerInfo;

    @Column(name = "price")
    private int priceForSell;

    @Column(name = "state_id")
    private int offerStateId;

    @Column(name = "user_id")
    private long userId;

    public Offer() {
    }

    @Column(name = "date")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private Date date;

    public Offer(String offerInfo, int priceForSell, int offerStateId,long userId,Date date) {
        this.offerInfo = offerInfo;
        this.priceForSell = priceForSell;
        this.offerStateId = offerStateId;
        this.userId = userId;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOfferInfo() {
        return offerInfo;
    }

    public void setOfferInfo(String engineCode) {
        this.offerInfo = engineCode;
    }

    public int getPriceForSell() {
        return priceForSell;
    }

    public void setPriceForSell(int priceForSell) {
        this.priceForSell = priceForSell;
    }

    public int getOfferStateId() {
        return offerStateId;
    }

    public void setOfferStateId(int offerStateId) {
        this.offerStateId = offerStateId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", offerInfo='" + offerInfo + '\'' +
                ", priceForSell=" + priceForSell +
                ", offerStateId=" + offerStateId +
                ", userId=" + userId +
                ", date=" + date +
                '}';
    }
}
