package Transactions;

public class Transactions {
    private int transactionId;
    private String UserName;
    private String SendersName;
    private int SenderAccNo;

    public Transactions(int transactionId, String userName, String sendersName, int senderAccNo) {
        this.transactionId = transactionId;
        UserName = userName;
        SendersName = sendersName;
        SenderAccNo = senderAccNo;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getSendersName() {
        return SendersName;
    }

    public void setSendersName(String sendersName) {
        SendersName = sendersName;
    }

    public int getSenderAccNo() {
        return SenderAccNo;
    }

    public void setSenderAccNo(int senderAccNo) {
        SenderAccNo = senderAccNo;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "transactionId=" + transactionId +
                ", UserName='" + UserName + '\'' +
                ", SendersName='" + SendersName + '\'' +
                ", SenderAccNo=" + SenderAccNo +
                '}';
    }
}
