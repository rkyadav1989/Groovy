import java.lang.Exception
class Account {

    BigDecimal balance = 0.0

    def deposit (BigDecimal amount) {

        if (amount < 0 ){
            throw new Exception("We can not deposit negative numbers")
        }else {
            balance += amount
        }

    }

    def deposit (List amounts) {
        for (i in amounts) {
            deposit(i)
        }
    }
}

Account acc = new Account()
acc.deposit(5.5)
println acc.balance

/*
acc.deposit(-2)
println e.message
this will fail until we catch the exception
*/

try {
    acc.deposit(-2)
} catch (Exception e ) {
    println e.message
}

acc.deposit([10,20,30,40])
println acc.balance

try {
    acc.deposit([10,10,-5.5])
} catch (Exception e ) {
    println e.message
}

println acc.balance
