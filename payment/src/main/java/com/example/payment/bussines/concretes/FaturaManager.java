package com.example.payment.bussines.concretes;

import com.example.payment.bussines.abstractt.FaturaService;
import com.example.payment.entities.concretes.Fatura;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class FaturaManager implements FaturaService {


    @Override
    public String payment(int faturaId) {
        return null;
    }

    @Override
    public String questioning(int faturaId) {
        return null;
    }

    @Override
    public String cancelPayment(int faturaId) {
        return null;
    }
}
