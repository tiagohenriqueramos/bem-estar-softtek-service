package com.bemestarsofttek.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Document
public class Resources {
    @Id
    private ObjectId id; // ObjectId como String
    private String title;              // Título do recurso
    private String description;        // Descrição breve
    private String category;           // Respiração, Exercícios, Mindfulness, etc.
    private String content;            // Conteúdo detalhado
    private String icon;               // SelfImprovement, FitnessCenter, etc.
    private String color;              // Código hexadecimal (#2563eb)
    private List<String> tags;         // Array de tags
    private String difficultyLevel;    // Iniciante, Intermediário, Avançado
    private Integer estimatedTimeMinutes; // Tempo estimado em minutos
    private Boolean isActive;          // Se o recurso está ativo
    private Integer priority;          // 1-10
    private List<String> targetAudience; // Audiências
    private String createdBy;          // Quem criou
    private Date createdAt;
    private Date updatedAt;
    private Date lastAccessed;
    private Integer accessCount;       // Contador de acessos
    private Rating rating;
    private Map<String, Object> metadata;

    // -------- Subclasse --------
    public static class Rating {
        private Double average;  // 0-5
        private Integer count;   // Número de avaliações

        public Double getAverage() { return average; }
        public void setAverage(Double average) { this.average = average; }

        public Integer getCount() { return count; }
        public void setCount(Integer count) { this.count = count; }
    }

    // -------- Getters & Setters --------
    public ObjectId getId() { return id; }
    public void setId(ObjectId id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getIcon() { return icon; }
    public void setIcon(String icon) { this.icon = icon; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public List<String> getTags() { return tags; }
    public void setTags(List<String> tags) { this.tags = tags; }

    public String getDifficultyLevel() { return difficultyLevel; }
    public void setDifficultyLevel(String difficultyLevel) { this.difficultyLevel = difficultyLevel; }

    public Integer getEstimatedTimeMinutes() { return estimatedTimeMinutes; }
    public void setEstimatedTimeMinutes(Integer estimatedTimeMinutes) { this.estimatedTimeMinutes = estimatedTimeMinutes; }

    public Boolean getIsActive() { return isActive; }
    public void setIsActive(Boolean isActive) { this.isActive = isActive; }

    public Integer getPriority() { return priority; }
    public void setPriority(Integer priority) { this.priority = priority; }

    public List<String> getTargetAudience() { return targetAudience; }
    public void setTargetAudience(List<String> targetAudience) { this.targetAudience = targetAudience; }

    public String getCreatedBy() { return createdBy; }
    public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }

    public Date getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Date updatedAt) { this.updatedAt = updatedAt; }

    public Date getLastAccessed() { return lastAccessed; }
    public void setLastAccessed(Date lastAccessed) { this.lastAccessed = lastAccessed; }

    public Integer getAccessCount() { return accessCount; }
    public void setAccessCount(Integer accessCount) { this.accessCount = accessCount; }

    public Rating getRating() { return rating; }
    public void setRating(Rating rating) { this.rating = rating; }

    public Map<String, Object> getMetadata() { return metadata; }
    public void setMetadata(Map<String, Object> metadata) { this.metadata = metadata; }
}
