package com.example.payment.entities.concretes;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data

@Getter
@Setter
public class MemberAccount  {

    @Id
    private int memberId;
    private String memberName;
    private String memberSurname;
    private String memberCode;
    private int balance;

    public MemberAccount(int memberId, String memberName, String memberSurname, String memberCode, int balance) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberSurname = memberSurname;
        this.memberCode = getMemberId()+ getMemberName().substring(0,2);
        this.balance = balance;
    }

    public MemberAccount() {

    }
}
