package com.bemestarsofttek.domain;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
public class MoodEntry {

    @Id
    private ObjectId id;

        private LocalDate date;
        private String emoji;
        private String mood;
        private String feeling;
        private String workload;
        private String symptoms;
        private int bossRelationship;
        private int colleaguesRelationship;
        private String observations = "";

    public MoodEntry(ObjectId id, LocalDate date, String emoji, String mood, String feeling, String workload, String symptoms, int bossRelationship, int colleaguesRelationship, String observations) {
        this.id = id;
        this.date = date;
        this.emoji = emoji;
        this.mood = mood;
        this.feeling = feeling;
        this.workload = workload;
        this.symptoms = symptoms;
        this.bossRelationship = bossRelationship;
        this.colleaguesRelationship = colleaguesRelationship;
        this.observations = observations;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
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


    public class WeeklyMoodData {
        private String day;
        private int anxious;
        private int stressed;
        private int happy;

        public WeeklyMoodData(String day, int anxious, int stressed, int happy) {
            this.day = day;
            this.anxious = anxious;
            this.stressed = stressed;
            this.happy = happy;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public int getAnxious() {
            return anxious;
        }

        public void setAnxious(int anxious) {
            this.anxious = anxious;
        }

        public int getStressed() {
            return stressed;
        }

        public void setStressed(int stressed) {
            this.stressed = stressed;
        }

        public int getHappy() {
            return happy;
        }

        public void setHappy(int happy) {
            this.happy = happy;
        }

        // Getters, setters e construtores
    }


    public class DailyAssessment {
        private EmojiChoice emojiChoice;
        private FeelingChoice feelingChoice;
        private WorkloadLevel workloadLevel;
        private FrequencyLevel workloadAffectsLife;
        private FrequencyLevel worksOvertime;
        private FrequencyLevel hasSymptoms;
        private FrequencyLevel mentalHealthAffectsWork;
        private int relationshipWithBoss;
        private int relationshipWithColleagues;
        private int respectFromColleagues;
        private int teamCollaboration;
        private int freedomToExpress;
        private int teamWelcoming;
        private int teamCooperation;
        private int clearInstructions;
        private int openCommunicationWithLeadership;
        private int efficientInformation;
        private int clearGoals;
        private int leadershipCares;
        private int leadershipAvailable;
        private int comfortableReporting;
        private int recognizedByLeadership;
        private int trustInLeadership;
        private String observations = "";

        public DailyAssessment(EmojiChoice emojiChoice, FeelingChoice feelingChoice, WorkloadLevel workloadLevel, FrequencyLevel workloadAffectsLife, FrequencyLevel worksOvertime, FrequencyLevel hasSymptoms, FrequencyLevel mentalHealthAffectsWork, int relationshipWithBoss, int relationshipWithColleagues, int respectFromColleagues, int teamCollaboration, int freedomToExpress, int teamWelcoming, int teamCooperation, int clearInstructions, int openCommunicationWithLeadership, int efficientInformation, int clearGoals, int leadershipCares, int leadershipAvailable, int comfortableReporting, int recognizedByLeadership, int trustInLeadership, String observations) {
            this.emojiChoice = emojiChoice;
            this.feelingChoice = feelingChoice;
            this.workloadLevel = workloadLevel;
            this.workloadAffectsLife = workloadAffectsLife;
            this.worksOvertime = worksOvertime;
            this.hasSymptoms = hasSymptoms;
            this.mentalHealthAffectsWork = mentalHealthAffectsWork;
            this.relationshipWithBoss = relationshipWithBoss;
            this.relationshipWithColleagues = relationshipWithColleagues;
            this.respectFromColleagues = respectFromColleagues;
            this.teamCollaboration = teamCollaboration;
            this.freedomToExpress = freedomToExpress;
            this.teamWelcoming = teamWelcoming;
            this.teamCooperation = teamCooperation;
            this.clearInstructions = clearInstructions;
            this.openCommunicationWithLeadership = openCommunicationWithLeadership;
            this.efficientInformation = efficientInformation;
            this.clearGoals = clearGoals;
            this.leadershipCares = leadershipCares;
            this.leadershipAvailable = leadershipAvailable;
            this.comfortableReporting = comfortableReporting;
            this.recognizedByLeadership = recognizedByLeadership;
            this.trustInLeadership = trustInLeadership;
            this.observations = observations;
        }

        public EmojiChoice getEmojiChoice() {
            return emojiChoice;
        }

        public void setEmojiChoice(EmojiChoice emojiChoice) {
            this.emojiChoice = emojiChoice;
        }

        public FeelingChoice getFeelingChoice() {
            return feelingChoice;
        }

        public void setFeelingChoice(FeelingChoice feelingChoice) {
            this.feelingChoice = feelingChoice;
        }

        public WorkloadLevel getWorkloadLevel() {
            return workloadLevel;
        }

        public void setWorkloadLevel(WorkloadLevel workloadLevel) {
            this.workloadLevel = workloadLevel;
        }

        public FrequencyLevel getWorkloadAffectsLife() {
            return workloadAffectsLife;
        }

        public void setWorkloadAffectsLife(FrequencyLevel workloadAffectsLife) {
            this.workloadAffectsLife = workloadAffectsLife;
        }

        public FrequencyLevel getWorksOvertime() {
            return worksOvertime;
        }

        public void setWorksOvertime(FrequencyLevel worksOvertime) {
            this.worksOvertime = worksOvertime;
        }

        public FrequencyLevel getHasSymptoms() {
            return hasSymptoms;
        }

        public void setHasSymptoms(FrequencyLevel hasSymptoms) {
            this.hasSymptoms = hasSymptoms;
        }

        public FrequencyLevel getMentalHealthAffectsWork() {
            return mentalHealthAffectsWork;
        }

        public void setMentalHealthAffectsWork(FrequencyLevel mentalHealthAffectsWork) {
            this.mentalHealthAffectsWork = mentalHealthAffectsWork;
        }

        public int getRelationshipWithBoss() {
            return relationshipWithBoss;
        }

        public void setRelationshipWithBoss(int relationshipWithBoss) {
            this.relationshipWithBoss = relationshipWithBoss;
        }

        public int getRelationshipWithColleagues() {
            return relationshipWithColleagues;
        }

        public void setRelationshipWithColleagues(int relationshipWithColleagues) {
            this.relationshipWithColleagues = relationshipWithColleagues;
        }

        public int getRespectFromColleagues() {
            return respectFromColleagues;
        }

        public void setRespectFromColleagues(int respectFromColleagues) {
            this.respectFromColleagues = respectFromColleagues;
        }

        public int getTeamCollaboration() {
            return teamCollaboration;
        }

        public void setTeamCollaboration(int teamCollaboration) {
            this.teamCollaboration = teamCollaboration;
        }

        public int getFreedomToExpress() {
            return freedomToExpress;
        }

        public void setFreedomToExpress(int freedomToExpress) {
            this.freedomToExpress = freedomToExpress;
        }

        public int getTeamWelcoming() {
            return teamWelcoming;
        }

        public void setTeamWelcoming(int teamWelcoming) {
            this.teamWelcoming = teamWelcoming;
        }

        public int getTeamCooperation() {
            return teamCooperation;
        }

        public void setTeamCooperation(int teamCooperation) {
            this.teamCooperation = teamCooperation;
        }

        public int getClearInstructions() {
            return clearInstructions;
        }

        public void setClearInstructions(int clearInstructions) {
            this.clearInstructions = clearInstructions;
        }

        public int getOpenCommunicationWithLeadership() {
            return openCommunicationWithLeadership;
        }

        public void setOpenCommunicationWithLeadership(int openCommunicationWithLeadership) {
            this.openCommunicationWithLeadership = openCommunicationWithLeadership;
        }

        public int getEfficientInformation() {
            return efficientInformation;
        }

        public void setEfficientInformation(int efficientInformation) {
            this.efficientInformation = efficientInformation;
        }

        public int getClearGoals() {
            return clearGoals;
        }

        public void setClearGoals(int clearGoals) {
            this.clearGoals = clearGoals;
        }

        public int getLeadershipCares() {
            return leadershipCares;
        }

        public void setLeadershipCares(int leadershipCares) {
            this.leadershipCares = leadershipCares;
        }

        public int getLeadershipAvailable() {
            return leadershipAvailable;
        }

        public void setLeadershipAvailable(int leadershipAvailable) {
            this.leadershipAvailable = leadershipAvailable;
        }

        public int getComfortableReporting() {
            return comfortableReporting;
        }

        public void setComfortableReporting(int comfortableReporting) {
            this.comfortableReporting = comfortableReporting;
        }

        public int getRecognizedByLeadership() {
            return recognizedByLeadership;
        }

        public void setRecognizedByLeadership(int recognizedByLeadership) {
            this.recognizedByLeadership = recognizedByLeadership;
        }

        public int getTrustInLeadership() {
            return trustInLeadership;
        }

        public void setTrustInLeadership(int trustInLeadership) {
            this.trustInLeadership = trustInLeadership;
        }

        public String getObservations() {
            return observations;
        }

        public void setObservations(String observations) {
            this.observations = observations;
        }

    }


    public enum EmojiChoice {
        SAD("Triste", "😢"),
        HAPPY("Alegre", "😄"),
        TIRED("Cansado", "😴"),
        ANXIOUS("Ansioso", "😰"),
        FEAR("Medo", "😨"),
        ANGRY("Raiva", "😡");

        private final String displayName;
        private final String emoji;

        EmojiChoice(String displayName, String emoji) {
            this.displayName = displayName;
            this.emoji = emoji;
        }

        public String getDisplayName() { return displayName; }
        public String getEmoji() { return emoji; }
    }


    public enum FeelingChoice {
        MOTIVATED("Motivado"),
        TIRED("Cansado"),
        WORRIED("Preocupado"),
        STRESSED("Estressado"),
        EXCITED("Animado"),
        SATISFIED("Satisfeito");

        private final String displayName;

        FeelingChoice(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() { return displayName; }
    }


    public enum WorkloadLevel {
        VERY_LIGHT("Muito Leve"),
        LIGHT("Leve"),
        MEDIUM("Média"),
        HIGH("Alta"),
        VERY_HIGH("Muito Alta");

        private final String displayName;

        WorkloadLevel(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() { return displayName; }
    }


    public enum FrequencyLevel {
        NEVER("Não"),
        RARELY("Raramente"),
        SOMETIMES("Algumas vezes"),
        FREQUENTLY("Frequentemente"),
        ALWAYS("Sempre");

        private final String displayName;

        FrequencyLevel(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() { return displayName; }
    }


    public class MoodOption {
        private String displayName;
        private String emoji;

        public MoodOption(String displayName, String emoji) {
            this.displayName = displayName;
            this.emoji = emoji;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getEmoji() {
            return emoji;
        }

        public void setEmoji(String emoji) {
            this.emoji = emoji;
        }

    }


    public class FeelingOption {
        private String displayName;

        public FeelingOption(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }
    }

}