package Transactions;

import java.util.*;

public class TransactionServiceLayer {

    public static void printTransactionID(List<Transactions> trans){
        trans.sort(Comparator.comparing(Transactions::getTransactionId));
        trans.forEach(System.out::println);
    }
    public static void getTrans(Map<Integer, Transactions> tran, int accountNumber){
        tran.forEach((k,v)->{
            if(v.getSenderAccNo() == accountNumber){
                System.out.println(v);
            }
        });

    }

}
