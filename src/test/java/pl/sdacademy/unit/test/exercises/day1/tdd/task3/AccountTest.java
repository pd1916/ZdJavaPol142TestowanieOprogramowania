package pl.sdacademy.unit.test.exercises.day1.tdd.task3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {
    public static final Customer CUSTOMER = new Customer("Jan", "Kowalski");

    /*
    Account credit, poprawny numer konta, kwota:1000
    Account debit, poprawny numer konta, kwota:1500
     */
    @Test
    void shouldTransferMoney() {
        //given
        //Account credit = initCorrectCreditAccount()
        Account credit = new Account(2000, "11111111111111111111111111", CUSTOMER);
        Account debit = new Account(1500, "22222222222222222222222222", CUSTOMER);
        //when
        debit.transferMoney(credit, 500);
        //then
        assertThat(credit.getBalance()).isEqualTo(2500);
        assertThat(debit.getBalance()).isEqualTo(1000);
    }

    /*
    Account credit, błędny numer konta, kwota:1000
    Account debit, poprawny numer konta, kwota:1500
     */
    @Test
    void shouldNotTransferMoneyWhenCreditAccountIsWrong_LessDigits() {
        //given
        Account credit = new Account(2000, "1111111111111111111111111", CUSTOMER);
        Account debit = new Account(1500, "22222222222222222222222222", CUSTOMER);
        //when
        debit.transferMoney(credit, 500);
        //then
        assertThat(credit.getBalance()).isEqualTo(2000);
        assertThat(debit.getBalance()).isEqualTo(1500);
    }

    /*
    Account credit, błędny numer konta, kwota:1000
    Account debit, poprawny numer konta, kwota:1500
     */
    @Test
    void shouldNotTransferMoneyWhenCreditAccountIsWrong_NotDigits() {
        //given
        Account credit = new Account(2000, "aaaaaaaaaaaaaaaaaaaaaaaaaa", CUSTOMER);
        Account debit = new Account(1500, "22222222222222222222222222", CUSTOMER);
        //when
        debit.transferMoney(credit, 500);
        //then
        assertThat(credit.getBalance()).isEqualTo(2000);
        assertThat(debit.getBalance()).isEqualTo(1500);
    }

    /*
Account credit, poprawny numer konta, kwota:1000
Account debit, błędny numer konta, kwota:1500
 */
    @Test
    void shouldNotTransferMoneyWhenDebitAccountIsWrong_LessDigits() {
        //given
        Account credit = new Account(2000, "11111111111111111111111111", CUSTOMER);
        Account debit = new Account(1500, "2222222222222222222222222", CUSTOMER);
        //when
        debit.transferMoney(credit, 500);
        //then
        assertThat(credit.getBalance()).isEqualTo(2000);
        assertThat(debit.getBalance()).isEqualTo(1500);
    }

    /*
    Account credit, poprawny numer konta, kwota:1000
    Account debit, błędny numer konta, kwota:1500
     */
    @Test
    void shouldNotTransferMoneyWhenDebitAccountIsWrong_NotDigits() {
        //given
        Account credit = new Account(2000, "11111111111111111111111111", CUSTOMER);
        Account debit = new Account(1500, "bbbbbbbbbbbbbbbbbbbbbbbbbb", CUSTOMER);
        //when
        debit.transferMoney(credit, 500);
        //then
        assertThat(credit.getBalance()).isEqualTo(2000);
        assertThat(debit.getBalance()).isEqualTo(1500);
    }

    /*
    Account credit, poprawny numer konta, kwota:1000
    Account debit, poprawny numer konta, kwota:1500
    amount: 2000
     */
    @Test
    void shouldNotTransferMoneyIfAmountIsWrong() {
        //given
        Account credit = new Account(2000, "11111111111111111111111111", CUSTOMER);
        Account debit = new Account(1500, "22222222222222222222222222", CUSTOMER);
        //when
        debit.transferMoney(credit, 2000);
        //then
        assertThat(credit.getBalance()).isEqualTo(2000);
        assertThat(debit.getBalance()).isEqualTo(1500);
    }

    /*
    Account credit, poprawny numer konta, kwota:1000
    Account debit, poprawny numer konta, kwota:1500
    amount: 0 -1
     */
    @Test
    void shouldNotTransferMoneyIfAmountIsWrong_2() {
        //given
        Account credit = new Account(2000, "11111111111111111111111111", CUSTOMER);
        Account debit = new Account(1500, "22222222222222222222222222", CUSTOMER);
        //when
        debit.transferMoney(credit, -1);
        //then
        assertThat(credit.getBalance()).isEqualTo(2000);
        assertThat(debit.getBalance()).isEqualTo(1500);
    }
}