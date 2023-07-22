package com.example.payment.bussines.abstractt;

public interface FaturaService {
    String payment(int faturaId);
    String questioning(int faturaId);

    String cancelPayment(int faturaId);


}
