package com.bemestarsofttek.domain;


import com.bemestarsofttek.exception.ValidationException;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Document
public class MoodEntries {

    @Id
    private ObjectId id;

    private String employeeId;
    private LocalDate date;
    private String emoji; // 😢, 😄, 😴, 😰, 😨, 😡
    private String mood; // Triste, Alegre, Cansado, Ansioso, Medo, Raiva
    private String feeling; // Motivado, Cansado, Preocupado, Estressado, Animado, Satisfeito
    private String workload; // Muito Leve, Leve, Média, Alta, Muito Alta
    private String symptoms; // Não, Raramente, Algumas vezes, Frequentemente, Sempre
    private int bossRelationship; // 1-5
    private int colleaguesRelationship; // 1-5
    private String observations = "";
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private Object metadata;

    public MoodEntries() {
    }

    public MoodEntries(ObjectId id, String employeeId, LocalDate date, String emoji, String mood, String feeling,
                       String workload, String symptoms, int bossRelationship, int colleaguesRelationship,
                       String observations, LocalDate createdAt, LocalDate updatedAt, Object metadata) {
        if (employeeId == null || employeeId.isEmpty()) throw new ValidationException("employeeId não pode ser nulo ou vazio");
        if (date == null) throw new ValidationException("date não pode ser nulo");
        if (emoji == null || emoji.isEmpty()) throw new ValidationException("emoji não pode ser nulo ou vazio");
        if (mood == null || mood.isEmpty()) throw new ValidationException("mood não pode ser nulo ou vazio");
        if (feeling == null || feeling.isEmpty()) throw new ValidationException("feeling não pode ser nulo ou vazio");
        if (workload == null || workload.isEmpty()) throw new ValidationException("workload não pode ser nulo ou vazio");
        if (symptoms == null) throw new ValidationException("symptoms não pode ser nulo");
        if (observations == null) throw new ValidationException("observations não pode ser nulo");

        this.id = id;
        this.employeeId = employeeId;
        this.date = date;
        this.emoji = emoji;
        this.mood = mood;
        this.feeling = feeling;
        this.workload = workload;
        this.symptoms = symptoms;
        this.bossRelationship = bossRelationship;
        this.colleaguesRelationship = colleaguesRelationship;
        this.observations = observations;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getFeeling() {
        return feeling;
    }

    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }

    public String getWorkload() {
        return workload;
    }

    public void setWorkload(String workload) {
        this.workload = workload;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public int getBossRelationship() {
        return bossRelationship;
    }

    public void setBossRelationship(int bossRelationship) {
        this.bossRelationship = bossRelationship;
    }

    public int getColleaguesRelationship() {
        return colleaguesRelationship;
    }

    public void setColleaguesRelationship(int colleaguesRelationship) {
        this.colleaguesRelationship = colleaguesRelationship;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }
}