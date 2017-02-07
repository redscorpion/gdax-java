package com.coinbase.exchange.api.accounts;

import com.coinbase.exchange.api.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.InvalidKeyException;

import static org.junit.Assert.*;

/**
 * Created by robevansuk on 03/02/2017.
 */
public class AccountsTest extends BaseTest {

    @Autowired
    AccountService accountService;

    @Test
    public void canGetAccounts() throws InvalidKeyException, CloneNotSupportedException {
        Account[] accounts  = accountService.getAccounts();
        assertTrue(accounts.length >= 1);
    }


}