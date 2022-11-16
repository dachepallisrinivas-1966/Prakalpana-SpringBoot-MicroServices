package com.prak.service;

import org.springframework.stereotype.Service;

import com.prak.model.Loan;

@Service
public class LoanServiceImpl implements LoanService {

	@Override
	public void computeInterest(Loan loan) {
		if (loan != null) {
			loan.setInterest((loan.getPrinciple() * loan.getTime() * loan.getRate()) / 100.0);
		}

	}

}
