package com.example.expensemanager.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class CreateExpenseAllocationRequest {
    private UUID expenseId;
    private String friendId;
    private String initatorUser;
    private BigDecimal amount;
}