package com.company;

public class Main2
{
    public static void main(String[] args)
    {
        Bank1 bank1 = new Bank1();
        bank1.getBalance();
        bank1.AccountState(1);

        Bank2 bank2 = new Bank2();
        bank2.getBalance();
        bank2.AccountState(2);

        Bank3 bank3 = new Bank3();
        bank3.getBalance();
        bank3.AccountState(3);
    }
}
