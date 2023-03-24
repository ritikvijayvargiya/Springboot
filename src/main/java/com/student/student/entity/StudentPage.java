package com.student.student.entity;

import jakarta.persistence.Id;
import org.springframework.data.domain.Sort;

public class StudentPage {
    private @Id int pageNo;
    private int pageSize=5;
    private Sort.Direction sortDirection= Sort.Direction.ASC;

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getSortByy() {
        return sortByy;
    }

    public void setSortByy(String sortByy) {
        this.sortByy = sortByy;
    }

    private String sortBy="name";
    private String sortByy="age";

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Sort.Direction getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(Sort.Direction sortDirection) {
        this.sortDirection = sortDirection;
    }
}
