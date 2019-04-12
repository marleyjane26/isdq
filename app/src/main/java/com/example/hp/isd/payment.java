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






}
