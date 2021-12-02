
@groovy.transform.ToString
class Account {
    BigDecimal balance = 0.0
    String type //checking or saving

    BigDecimal deposit(BigDecimal amount){
        balance += amount
    }

    BigDecimal withdraw(BigDecimal amount){
        balance -= amount
    }

    BigDecimal plus(Account account){
        println this.balance
        println account.balance
        this.balance + account.balance
    }
}

Account checking = new Account(type:"Checking")
checking.deposit(100.00)

Account saving= new Account(type:"Saving")
saving.deposit(500.00)


BigDecimal total = checking + saving
println total

