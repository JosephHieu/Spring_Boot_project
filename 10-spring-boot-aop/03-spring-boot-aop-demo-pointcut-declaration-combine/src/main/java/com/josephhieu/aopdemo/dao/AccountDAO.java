package com.josephhieu.aopdemo.dao;

import com.josephhieu.aopdemo.Account;

import java.util.List;

public interface AccountDAO {

    void addAccount(Account theAccount, boolean vipFlag);

    boolean doWork();

    String getName();

    void setName(String name);

    String getServiceCode();

    void setServiceCode(String serviceCode);

    // add a new method: findAccounts()
    List<Account> findAccounts();

    List<Account> findAccounts(boolean tripWire);
}
