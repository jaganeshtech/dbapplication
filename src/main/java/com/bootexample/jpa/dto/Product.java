package com.bootexample.jpa.dto;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="PRODUCT")
public class Product {
    @Id
    private Integer id;
    @Column private String name;
    @Column private String description;





}
