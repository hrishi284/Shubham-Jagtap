package com.demo.onlinebookstore.service;

import java.util.Set;

import com.demo.onlinebookstore.entity.Customer;
import com.demo.onlinebookstore.entity.PurchaseDetail;
import com.demo.onlinebookstore.entity.PurchaseHistory;

public interface PaymentService {

	String createTransaction(Customer customer);
	
	Set<PurchaseHistory> getPurchaseHistories(Customer customer);
	
	Set<PurchaseDetail> getPurchaseDetails(PurchaseHistory purchaseHistory);

	PurchaseHistory getPurchaseHistory(Customer customer, String transId);
}
