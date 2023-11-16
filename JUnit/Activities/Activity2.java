package JUnit;

import org.junit.jupiter.api.Test;
import JavaSelenium.activityPrograms.BankAccount;
import JavaSelenium.activityPrograms.NotEnoughFundsException;
import static org.junit.jupiter.api.Assertions.*;

public class Activity2 {

        @Test
        void notEnoughFunds() {

            BankAccount account = new BankAccount(9);
            assertThrows(NotEnoughFundsException.class, () -> account.withdraw(10),
                    "Balance must be greater than amount of withdrawal");
        }

        @Test
        void enoughFunds() {

            BankAccount account = new BankAccount(100);
            assertDoesNotThrow(() -> account.withdraw(100));
        }
    }

