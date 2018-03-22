package com.subra.model;

import java.io.Serializable;

public class Article implements Serializable, Comparable<Article> {

	private static final long serialVersionUID = 1L;

	private long nid;
	private String title;
	private String content;
	private Long arrivalId;
	
	public long getNid() {
		return nid;
	}



	public void setNid(long nid) {
		this.nid = nid;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public Long getArrivalId() {
		return arrivalId;
	}



	public void setArrivalId(Long arrivalId) {
		this.arrivalId = arrivalId;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((arrivalId == null) ? 0 : arrivalId.hashCode());
		result = prime * result + (int) (nid ^ (nid >>> 32));
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		if (arrivalId == null) {
			if (other.arrivalId != null)
				return false;
		} else if (!arrivalId.equals(other.arrivalId))
			return false;
		if (nid != other.nid)
			return false;
		return true;
	}



	public int compareTo(Article o) { return this.arrivalId.compareTo(o.arrivalId); }
	
	

}
