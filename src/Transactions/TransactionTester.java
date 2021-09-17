package Transactions;
import java.util.*;
public class TransactionTester {
    public static void main(String[] args) {
        List<Transactions> list = new ArrayList<>();
        list.add(new Transactions(9923456, "BaBuRao", "Champakrao", 123458));
        list.add(new Transactions(423456, "BaBuRao", "Champakrao", 543219));
       // TransactionServiceLayer.printTransactionID(list);
        Map<Integer, Transactions> map = new HashMap<>();
        list.forEach(k->{
            int TransactionID = k.getTransactionId();
            map.put(TransactionID, k);
           // System.out.println(k);
        });
      TransactionServiceLayer.getTrans(map,123458 );
    }
}
