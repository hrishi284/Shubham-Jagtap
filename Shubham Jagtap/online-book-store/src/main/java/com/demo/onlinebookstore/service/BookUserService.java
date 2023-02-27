package com.demo.onlinebookstore.service;

import java.util.Set;

import com.demo.onlinebookstore.entity.Book;
import com.demo.onlinebookstore.entity.Customer;

public interface BookUserService {

	Set<Book> getBooksPurchasedBy(Customer customer);

}
