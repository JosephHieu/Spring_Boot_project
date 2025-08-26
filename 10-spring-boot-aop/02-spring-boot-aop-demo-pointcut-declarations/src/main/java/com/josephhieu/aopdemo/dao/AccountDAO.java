package com.josephhieu.aopdemo.dao;

import com.josephhieu.aopdemo.Account;

public interface AccountDAO {

    void addAccount(Account theAccount, boolean vipFlag);

    boolean doWork();
}
