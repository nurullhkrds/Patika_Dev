package com.example.payment.entities.concretes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fatura {
    @Id
    private int faturaId;
    private int amount;
    private String process_date;
    private String bill_type;

}



