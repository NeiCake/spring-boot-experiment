//package com.cake.app.model;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
//
//@Entity
//@Table(name="Status")
//public class Status {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private Long id;
//	
//	@Column(name="status_text")
//	private String statusText;
//	
//	@Column(name="date_added")
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date added;
//
//	
//	public Status(){
//		
//	}
//	
//	public Status (String statusText){
//		this.statusText=statusText;
//	}
//	
//	public Status(String statusText,Date added){
//		this.statusText=statusText;
//		this.added=added;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long pId) {
//		id = pId;
//	}
//
//	public String getStatusText() {
//		return statusText;
//	}
//
//	public void setStatusText(String pStatusText) {
//		statusText = pStatusText;
//	}
//
//	public Date getAdded() {
//		return added;
//	}
//
//	public void setAdded(Date pAdded) {
//		added = pAdded;
//	}
//
//	@Override
//	public String toString() {
//		return "Status [id=" + id + ", statusText=" + statusText + ", added=" + added + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((added == null) ? 0 : added.hashCode());
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		result = prime * result + ((statusText == null) ? 0 : statusText.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Status other = (Status) obj;
//		if (added == null) {
//			if (other.added != null)
//				return false;
//		} else if (!added.equals(other.added))
//			return false;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		if (statusText == null) {
//			if (other.statusText != null)
//				return false;
//		} else if (!statusText.equals(other.statusText))
//			return false;
//		return true;
//	}
//	
//	
//}
