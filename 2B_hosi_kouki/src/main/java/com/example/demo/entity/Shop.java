package com.example.demo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "shop")
public class Shop {
    @Id
    private Integer no;
    
    @Column
    private String name;
    
    @Column
    private Integer price;
    
    @Column
    private Integer rank;
    public Integer getId() {
        return no;
    }
    public void setId(Integer id) {
        this.no = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getRank() {
        return rank;
    }
    public void setRank(Integer rank) {
        this.rank = rank;
    }
}