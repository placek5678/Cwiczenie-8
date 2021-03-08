package com.company;

abstract class Bank
{
    abstract String getBalance();

    public void AccountState(int Banknr)
    {
        System.out.println(Banknr + " Bank New Balance: " + getBalance());
    }
}