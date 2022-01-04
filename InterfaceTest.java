package com.lti;

public class InterfaceTest {
	public static void main(String[] args) {
		MyPayment myPay = new MyPayment();
		myPay.pay();
	
	}
}
//have u done the payment ?
//yes done the gpay
// yes done via UPI
//yes done via paytm
//yes done via card payment

interface Payment
{
	void pay(); //declared
}

interface GooglePayment extends Payment { // pure abstract class
	void gPay(); //public abstract 
}
interface UPIPayment  extends Payment  {
	void upiPayment();
}
interface PayTM  extends Payment  {
	void payTMPayment();
}
interface CardPayment  extends Payment  {
	void cardPay();
}
interface CashPayment  extends Payment {
	void cashPay();
}
interface ChequePayment  extends Payment {
	void chequePay();
}
interface NetBankingPayment  extends Payment  {
	void netPay();
}

class MyPayment implements CardPayment
{

	@Override
	public void pay() {
		System.out.println("Yes my payment is done...");
		cardPay();
	}

	@Override
	public void cardPay() {
		System.out.println("Done via the Card payment....");
	}
}

/*
 * 
 * 										Payment
 * 										|
 * 				-----------------------------------------------------------------------
 * 				|			|			|		|		|				|			|				
 * 		 GooglePayment, UPIPayment, PayTM, CardPayment, CashPayment, ChequePayment, NetBankingPayment
 *		
 * 
 * 
 */
//isA


