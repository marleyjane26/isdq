package com.example.hp.isd;

import android.annotation.SuppressLint;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class payment  {
    private int client_id;
    private double balance;
    private int payment_state;
    String issued_date;
    String payed_date;

    public   payment(int client_id,double balance, int payment_state){

        this.client_id=client_id;
        this.balance=balance;
        this.payment_state=payment_state;

        }


    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPayment_state(int payment_state) {
        this.payment_state = payment_state;
    }

    public void setIssued_date(String issued_date) {
        this.issued_date = issued_date;
    }

    public void setPayed_date(String payed_date) {
        this.payed_date = payed_date;
    }
}
