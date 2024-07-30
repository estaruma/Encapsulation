import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("123456", 500);
    }

    @Test
    public void getAccountNumber() {
        assertEquals("123456", bankAccount.getAccountNumber());
    }

    @Test
    public void getBalance() {
        assertEquals((500), bankAccount.getBalance());
    }

    @Test
    public void setAccountNumber() {
        bankAccount.setAccountNumber("101010");
        assertEquals("101010", bankAccount.getAccountNumber());
    }

    @Test
    public void setBalance() {
        bankAccount.setBalance(1000);
        assertEquals(1000, bankAccount.getBalance());
    }





}