package com.desafiodevpicpay.repositories;

import com.desafiodevpicpay.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
