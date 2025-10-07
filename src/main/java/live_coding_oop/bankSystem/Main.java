package live_coding_oop.bankSystem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    //bank sys, that supports diff types of transactions:
    //swift
    //sepa
    //wise
    //implements transaction between two accounts

    /*
    entities:
    bank account:
    balance
    id

    type of transaction
    wise


    user/manager/bank
    transfer

    User -> acc A to acc B want to transfer $1000 by wise
    bank.transfer(from: a, to: b, wise) {

    }
     */
    public static void main(String[] args) {
        Client client1 = new Client(1);
        Client client2 = new Client(2);
        Bank bank = new Bank();
        bank.addClients(List.of(client1, client2));
    }
}