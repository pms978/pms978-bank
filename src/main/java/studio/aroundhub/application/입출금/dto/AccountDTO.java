package studio.aroundhub.application.입출금.dto;

public class AccountDTO {
    private String name;
    private int accountNumber;
    private int amount;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "AccountDTO{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", amount=" + amount +
                '}';
    }

}
