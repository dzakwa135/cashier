package com.smk.model;

import com.model.string;

import java.util.Date;

public abstract class Model {
    protected Date dateCreated;
    protected Date lastModified;
    protected String createdBy;
    protected String updatedBy;


    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    public class location extends Model{
        private long id;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public string getName() {
            return name;
        }

        public void setName(string name) {
            this.name = name;
        }

        private string name;
    }
}
