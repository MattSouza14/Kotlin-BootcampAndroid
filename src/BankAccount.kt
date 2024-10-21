class BankAccount(val accountHolder: String) {
    private var balance: Double = 0.0

    fun getBalance(): Double {
        return balance
    }
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Depositado: $$amount. Novo saldo: $$balance")
        } else {
            println("Valor de depósito inválido")
        }
    }
    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            println("Saque: $$amount. Saldo restante: $$balance")
        } else {
            println("Sem saldo na conta")
        }
    }
}
fun main() {
    val account = BankAccount("Mateus Souza")
    account.deposit(500.0)
    account.withdraw(200.0)
    println("Saldo Atual: $${account.getBalance()}")
    account.withdraw(400.0) // Tentativa de saque sem fundos suficientes
}
