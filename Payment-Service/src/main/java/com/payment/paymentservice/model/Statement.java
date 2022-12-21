package com.payment.paymentservice.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
@Document(collection = "statement")
public class Statement {
  @Id
  private int statementId;
  private TransactionType transactionType;
  private double amount;
  private String orderId;
 // private Payment payment;
  private LocalDateTime localDateTime;

    public Statement(int statementId, TransactionType transactionType, double amount, LocalDateTime localDateTime) {
	super();
	this.statementId = statementId;
	this.transactionType = transactionType;
	this.amount = amount;
	//this.payment = payment;
	this.localDateTime = localDateTime;
}
    public Statement() {

    }

	public int getStatementId() {
		return statementId;
	}

	public void setStatementId(int statementId) {
		this.statementId = statementId;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

}
