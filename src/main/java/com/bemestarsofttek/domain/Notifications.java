package com.bemestarsofttek.domain;


import org.bson.types.ObjectId;

import java.util.Date;
import java.util.Map;

public class Notifications {
    private ObjectId id;
    private String employeeId;
    private String notificationId;
    private String type;
    private String title;
    private String message;
    private String priority;
    private String category;
    private String status;
    private Date scheduledFor;
    private Date sentAt;
    private Date readAt;
    private boolean actionRequired;
    private String actionUrl;
    private String actionButtonText;
    private Date expiresAt;
    private Date createdAt;
    private Date updatedAt;
    private Map<String, Object> metadata;

    public Notifications(ObjectId id, String employeeId, String notificationId, String type, String title, String message, String priority, String category, String status, Date scheduledFor, Date sentAt, Date readAt, boolean actionRequired, String actionUrl, String actionButtonText, Date expiresAt, Date createdAt, Date updatedAt, Map<String, Object> metadata) {
        this.id = id;
        this.employeeId = employeeId;
        this.notificationId = notificationId;
        this.type = type;
        this.title = title;
        this.message = message;
        this.priority = priority;
        this.category = category;
        this.status = status;
        this.scheduledFor = scheduledFor;
        this.sentAt = sentAt;
        this.readAt = readAt;
        this.actionRequired = actionRequired;
        this.actionUrl = actionUrl;
        this.actionButtonText = actionButtonText;
        this.expiresAt = expiresAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.metadata = metadata;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getScheduledFor() {
        return scheduledFor;
    }

    public void setScheduledFor(Date scheduledFor) {
        this.scheduledFor = scheduledFor;
    }

    public Date getSentAt() {
        return sentAt;
    }

    public void setSentAt(Date sentAt) {
        this.sentAt = sentAt;
    }

    public Date getReadAt() {
        return readAt;
    }

    public void setReadAt(Date readAt) {
        this.readAt = readAt;
    }

    public boolean isActionRequired() {
        return actionRequired;
    }

    public void setActionRequired(boolean actionRequired) {
        this.actionRequired = actionRequired;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public String getActionButtonText() {
        return actionButtonText;
    }

    public void setActionButtonText(String actionButtonText) {
        this.actionButtonText = actionButtonText;
    }

    public Date getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
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

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }
}
