package com.tw.banking;


import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class AccountTest {
    @Test
    public void should_execute_addDeposit_of_transactionRepository_when_account_deposit() {
        //given
        TransactionRepository transactionRepository = mock(TransactionRepository.class);
        Printer printer = mock(Printer.class);

        //when
        Account mandy = new Account(transactionRepository, printer);
        int amount = 999;
        mandy.deposit(amount);

        //then
        verify(transactionRepository, times(1)).addDeposit(amount);
    }

    @Test
    public void should_execute_addWithdraw_of_transactionRepository_when_account_withdraw() {
        //given
        TransactionRepository transactionRepository = mock(TransactionRepository.class);
        Printer printer = mock(Printer.class);

        //when
        Account mandy = new Account(transactionRepository, printer);
        int amount = 999;
        mandy.withdraw(amount);

        //then
        verify(transactionRepository, times(1)).addWithdraw(amount);
    }

}
