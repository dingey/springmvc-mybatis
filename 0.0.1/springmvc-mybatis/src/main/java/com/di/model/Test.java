package com.di.model;

import java.util.Date;

public class Test {
    private Long id;

    private String payingId;

    private Long refundId;

    private Boolean status;

    private Integer oppType;

    private String oppCode;

    private Integer oppFee;

    private String oppCommit;

    private String oppReturn;

    private String oppNotify;

    private Date createdAt;

    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayingId() {
        return payingId;
    }

    public void setPayingId(String payingId) {
        this.payingId = payingId == null ? null : payingId.trim();
    }

    public Long getRefundId() {
        return refundId;
    }

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getOppType() {
        return oppType;
    }

    public void setOppType(Integer oppType) {
        this.oppType = oppType;
    }

    public String getOppCode() {
        return oppCode;
    }

    public void setOppCode(String oppCode) {
        this.oppCode = oppCode == null ? null : oppCode.trim();
    }

    public Integer getOppFee() {
        return oppFee;
    }

    public void setOppFee(Integer oppFee) {
        this.oppFee = oppFee;
    }

    public String getOppCommit() {
        return oppCommit;
    }

    public void setOppCommit(String oppCommit) {
        this.oppCommit = oppCommit == null ? null : oppCommit.trim();
    }

    public String getOppReturn() {
        return oppReturn;
    }

    public void setOppReturn(String oppReturn) {
        this.oppReturn = oppReturn == null ? null : oppReturn.trim();
    }

    public String getOppNotify() {
        return oppNotify;
    }

    public void setOppNotify(String oppNotify) {
        this.oppNotify = oppNotify == null ? null : oppNotify.trim();
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
}