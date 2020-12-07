package com.trevorramsey.models;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="licenses")
public class License {    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String number;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date expirationDate;
	    private String state;
	    @Column(updatable=false)
	    private Date createdAt;
	    private Date updatedAt;
	    @OneToOne(fetch=FetchType.LAZY)
	    @JoinColumn(name="driver_id")
	    private Driver driver;
	    public License() {
	    }
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public String numberToString() {
			int numZeros = 7 - String.valueOf(this.number).length();
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < numZeros; i++)
				sb.append('0');
			return String.format("%s%d", sb, this.id);
		}
		public Date getExpirationDate() {
			return expirationDate;
		}
		public void setExpirationDate(Date expiration_date) {
			this.expirationDate = expiration_date;
		}
		public String getExpirationDateFormatted() {
			SimpleDateFormat fm = new SimpleDateFormat("MM/dd/yyyy");
			return fm.format(this.expirationDate);
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public Date getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
		public Driver getDriver() {
			return driver;
		}
		public void setDriver(Driver driver) {
			this.driver = driver;
		}
	    
}
