package com.raymond.oop.encapsulation;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * @author raymondmuzzi
 * @since 2023-10-07 18:35:16
 */
public class Wallet {

    /**
     * id was specified when the wallet object created
     */
    private final String id = UUID.randomUUID().toString();

    /**
     * only specified once
     */
    private final long createTime = System.currentTimeMillis();

    /**
     * new wallet has 0$, but it can be modified during the biz flow
     */
    private BigDecimal balance = BigDecimal.ZERO;

    /**
     * balance modified time
     */
    private long balanceLastModifiedTime = System.currentTimeMillis();

    public String getId() {
        return id;
    }

    public long getCreateTime() {
        return createTime;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public long getBalanceLastModifiedTime() {
        return balanceLastModifiedTime;
    }

    public void increaseBalance(BigDecimal increaseAmount) {
        if (increaseAmount == null || increaseAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("Increase balance failed, invalid amount");
        }
        balance = balance.add(increaseAmount);
        balanceLastModifiedTime = System.currentTimeMillis();
    }

    public void decreaseBalance(BigDecimal decreaseAmount) {
        if (decreaseAmount == null || decreaseAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("Decrease balance failed, invalid amount");
        }
        if (decreaseAmount.compareTo(balance) > 0) {
            throw new RuntimeException("Insufficient balance!");
        }
        balance = balance.subtract(decreaseAmount);
        balanceLastModifiedTime = System.currentTimeMillis();
    }
}
