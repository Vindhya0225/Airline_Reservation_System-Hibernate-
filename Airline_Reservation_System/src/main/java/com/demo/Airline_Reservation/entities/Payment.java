package com.demo.Airline_Reservation.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Payment {
    @Id
    @Column(name = "PaymentId", length = 20)
    private int paymentId;
    
    @Column(name = "Amount", length = 50)
    private int amount;
    
    @Column(name = "PaymentDate", length = 8)
    private String paymentDate;
    
    @Column(name = "PaymentMethod", length = 30)
    private String paymentMethod;
    
    @Column(name = "Status", length = 25)
    private String status;
    
 // One-to-One relationship with Booking
    @OneToOne(mappedBy = "payment")
    private Booking booking;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(int paymentId, int amount, String string, String paymentMethod, String status) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.paymentDate = string;
		this.paymentMethod = paymentMethod;
		this.status = status;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", amount=" + amount + ", paymentDate=" + paymentDate
				+ ", paymentMethod=" + paymentMethod + ", status=" + status + "]";
	}
    
    

}
