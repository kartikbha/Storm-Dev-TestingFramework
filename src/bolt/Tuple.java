package bolt;

import java.io.Serializable;

public class Tuple implements Serializable {

	/**
	 * 
	 *  Define your tuples in this class
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String reqID;
	private String subQueryID;
	
	private String queryXML;
	private Integer totalNoOfSubQuery;
	private Integer noOfChunkInSubQuery;
	private Integer noOfDecorationInChunk;
	private Integer noOfReceivingChunk;
	private Integer notEligibleDecoration;
	private Boolean isException;
	private String exceptionMsg;	
	private Boolean status;
	
	

	public Integer getTotalNoOfSubQuery() {
		return totalNoOfSubQuery;
	}
	public void setTotalNoOfSubQuery(Integer totalNoOfSubQuery) {
		this.totalNoOfSubQuery = totalNoOfSubQuery;
	}

	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Integer getNoOfChunkInSubQuery() {
		return noOfChunkInSubQuery;
	}
	public void setNoOfChunkInSubQuery(Integer noOfChunkInSubQuery) {
		this.noOfChunkInSubQuery = noOfChunkInSubQuery;
	}
	public Integer getNoOfDecorationInChunk() {
		return noOfDecorationInChunk;
	}
	public void setNoOfDecorationInChunk(Integer noOfDecorationInChunk) {
		this.noOfDecorationInChunk = noOfDecorationInChunk;
	}
	public Integer getNoOfReceivingChunk() {
		return noOfReceivingChunk;
	}
	public void setNoOfReceivingChunk(Integer noOfReceivingChunk) {
		this.noOfReceivingChunk = noOfReceivingChunk;
	}
	public Integer getNotEligibleDecoration() {
		return notEligibleDecoration;
	}
	public void setNotEligibleDecoration(Integer notEligibleDecoration) {
		this.notEligibleDecoration = notEligibleDecoration;
	}
	public Boolean getIsException() {
		return isException;
	}
	public void setIsException(Boolean isException) {
		this.isException = isException;
	}
	public String getExceptionMsg() {
		return exceptionMsg;
	}
	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
	public String getReqID() {
		return reqID;
	}
	public void setReqID(String reqID) {
		this.reqID = reqID;
	}
	public String getSubQueryID() {
		return subQueryID;
	}
	public void setSubQueryID(String subQueryID) {
		this.subQueryID = subQueryID;
	}
	public String getQueryXML() {
		return queryXML;
	}
	public void setQueryXML(String queryXML) {
		this.queryXML = queryXML;
	}
	
}
