package com.payment.paymentservice.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Document(collection = "payment")
public class Payment{
@Id
private int paymentId;
private int profileId;
private double currentBalance;
private List<Statement> statements;

public Payment(int profileId, double currentBalance, List<Statement> statements) {
	super();
	this.profileId = profileId;
	this.currentBalance = currentBalance;
	this.statements = statements;
  }

public int getPaymentId() {
	return paymentId;
}

public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}

public int getProfileId() {
	return profileId;
}

public void setProfileId(int profileId) {
	this.profileId = profileId;
}

public double getCurrentBalance() {
	return currentBalance;
}

public void setCurrentBalance(double currentBalance) {
	this.currentBalance = currentBalance;
}

public List<Statement> getStatements() {
	return statements;
}

public void setStatements(List<Statement> statements) {
	this.statements = statements;
}



}