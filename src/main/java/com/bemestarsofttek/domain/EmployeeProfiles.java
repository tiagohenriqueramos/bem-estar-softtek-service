package com.bemestarsofttek.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Document
public class EmployeeProfiles {
    @Id
    private ObjectId id; // ObjectId como String
    private String employeeId; // emp_001, emp_002, etc.
    private PersonalInfo personalInfo;
    private WellnessPreferences wellnessPreferences;
    private AppUsage appUsage;
    private WellnessHistory wellnessHistory;
    private RiskProfile riskProfile;
    private PrivacySettings privacySettings;
    private Date createdAt;
    private Date updatedAt;
    private Boolean isActive;
    private Map<String, Object> metadata;

    // ----------- Subclasses -----------

    public static class PersonalInfo {
        private String name;
        private String email;
        private String department; // TI, RH, Financeiro
        private String position;
        private Date hireDate;
        private String managerId;
        private String teamId;

        // Getters e Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public Date getHireDate() {
            return hireDate;
        }

        public void setHireDate(Date hireDate) {
            this.hireDate = hireDate;
        }

        public String getManagerId() {
            return managerId;
        }

        public void setManagerId(String managerId) {
            this.managerId = managerId;
        }

        public String getTeamId() {
            return teamId;
        }

        public void setTeamId(String teamId) {
            this.teamId = teamId;
        }
    }

    public static class WellnessPreferences {
        private String notificationFrequency;
        private List<String> preferredCategories;
        private String difficultyPreference;
        private Integer timeAvailability;
        private List<String> goals;
        private List<String> interests;

        // Getters e Setters
        public String getNotificationFrequency() {
            return notificationFrequency;
        }

        public void setNotificationFrequency(String notificationFrequency) {
            this.notificationFrequency = notificationFrequency;
        }

        public List<String> getPreferredCategories() {
            return preferredCategories;
        }

        public void setPreferredCategories(List<String> preferredCategories) {
            this.preferredCategories = preferredCategories;
        }

        public String getDifficultyPreference() {
            return difficultyPreference;
        }

        public void setDifficultyPreference(String difficultyPreference) {
            this.difficultyPreference = difficultyPreference;
        }

        public Integer getTimeAvailability() {
            return timeAvailability;
        }

        public void setTimeAvailability(Integer timeAvailability) {
            this.timeAvailability = timeAvailability;
        }

        public List<String> getGoals() {
            return goals;
        }

        public void setGoals(List<String> goals) {
            this.goals = goals;
        }

        public List<String> getInterests() {
            return interests;
        }

        public void setInterests(List<String> interests) {
            this.interests = interests;
        }
    }

    public static class AppUsage {
        private Date firstLogin;
        private Date lastLogin;
        private Integer totalSessions;
        private Integer totalTimeMinutes;
        private List<String> favoriteResources; // ObjectId como String
        private Integer completedAssessments;
        private Integer moodEntriesCount;

        // Getters e Setters
        public Date getFirstLogin() {
            return firstLogin;
        }

        public void setFirstLogin(Date firstLogin) {
            this.firstLogin = firstLogin;
        }

        public Date getLastLogin() {
            return lastLogin;
        }

        public void setLastLogin(Date lastLogin) {
            this.lastLogin = lastLogin;
        }

        public Integer getTotalSessions() {
            return totalSessions;
        }

        public void setTotalSessions(Integer totalSessions) {
            this.totalSessions = totalSessions;
        }

        public Integer getTotalTimeMinutes() {
            return totalTimeMinutes;
        }

        public void setTotalTimeMinutes(Integer totalTimeMinutes) {
            this.totalTimeMinutes = totalTimeMinutes;
        }

        public List<String> getFavoriteResources() {
            return favoriteResources;
        }

        public void setFavoriteResources(List<String> favoriteResources) {
            this.favoriteResources = favoriteResources;
        }

        public Integer getCompletedAssessments() {
            return completedAssessments;
        }

        public void setCompletedAssessments(Integer completedAssessments) {
            this.completedAssessments = completedAssessments;
        }

        public Integer getMoodEntriesCount() {
            return moodEntriesCount;
        }

        public void setMoodEntriesCount(Integer moodEntriesCount) {
            this.moodEntriesCount = moodEntriesCount;
        }
    }

    public static class WellnessHistory {
        private Integer baselineScore;
        private Integer highestScore;
        private Integer lowestScore;
        private Integer averageScore;
        private String improvementTrend; // melhorando, piorando, estável, volátil
        private Date lastAssessmentDate;
        private Integer streakDays;
        private Integer longestStreak;

        // Getters e Setters
        public Integer getBaselineScore() {
            return baselineScore;
        }

        public void setBaselineScore(Integer baselineScore) {
            this.baselineScore = baselineScore;
        }

        public Integer getHighestScore() {
            return highestScore;
        }

        public void setHighestScore(Integer highestScore) {
            this.highestScore = highestScore;
        }

        public Integer getLowestScore() {
            return lowestScore;
        }

        public void setLowestScore(Integer lowestScore) {
            this.lowestScore = lowestScore;
        }

        public Integer getAverageScore() {
            return averageScore;
        }

        public void setAverageScore(Integer averageScore) {
            this.averageScore = averageScore;
        }

        public String getImprovementTrend() {
            return improvementTrend;
        }

        public void setImprovementTrend(String improvementTrend) {
            this.improvementTrend = improvementTrend;
        }

        public Date getLastAssessmentDate() {
            return lastAssessmentDate;
        }

        public void setLastAssessmentDate(Date lastAssessmentDate) {
            this.lastAssessmentDate = lastAssessmentDate;
        }

        public Integer getStreakDays() {
            return streakDays;
        }

        public void setStreakDays(Integer streakDays) {
            this.streakDays = streakDays;
        }

        public Integer getLongestStreak() {
            return longestStreak;
        }

        public void setLongestStreak(Integer longestStreak) {
            this.longestStreak = longestStreak;
        }
    }

    public static class RiskProfile {
        private String currentRiskLevel; // Baixo, Médio, Alto, Crítico
        private List<String> riskFactors;
        private List<Map<String, Object>> interventionHistory;
        private Date lastIntervention;
        private Boolean interventionSuccess;

        // Getters e Setters
        public String getCurrentRiskLevel() {
            return currentRiskLevel;
        }

        public void setCurrentRiskLevel(String currentRiskLevel) {
            this.currentRiskLevel = currentRiskLevel;
        }

        public List<String> getRiskFactors() {
            return riskFactors;
        }

        public void setRiskFactors(List<String> riskFactors) {
            this.riskFactors = riskFactors;
        }

        public List<Map<String, Object>> getInterventionHistory() {
            return interventionHistory;
        }

        public void setInterventionHistory(List<Map<String, Object>> interventionHistory) {
            this.interventionHistory = interventionHistory;
        }

        public Date getLastIntervention() {
            return lastIntervention;
        }

        public void setLastIntervention(Date lastIntervention) {
            this.lastIntervention = lastIntervention;
        }

        public Boolean getInterventionSuccess() {
            return interventionSuccess;
        }

        public void setInterventionSuccess(Boolean interventionSuccess) {
            this.interventionSuccess = interventionSuccess;
        }
    }

    public static class PrivacySettings {
        private Boolean dataSharing;
        private Boolean anonymousAnalytics;
        private Boolean managerVisibility;
        private Boolean hrVisibility;

        // Getters e Setters
        public Boolean getDataSharing() {
            return dataSharing;
        }

        public void setDataSharing(Boolean dataSharing) {
            this.dataSharing = dataSharing;
        }

        public Boolean getAnonymousAnalytics() {
            return anonymousAnalytics;
        }

        public void setAnonymousAnalytics(Boolean anonymousAnalytics) {
            this.anonymousAnalytics = anonymousAnalytics;
        }

        public Boolean getManagerVisibility() {
            return managerVisibility;
        }

        public void setManagerVisibility(Boolean managerVisibility) {
            this.managerVisibility = managerVisibility;
        }

        public Boolean getHrVisibility() {
            return hrVisibility;
        }

        public void setHrVisibility(Boolean hrVisibility) {
            this.hrVisibility = hrVisibility;
        }
    }

    // ----------- Getters e Setters Principais -----------

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

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public WellnessPreferences getWellnessPreferences() {
        return wellnessPreferences;
    }

    public void setWellnessPreferences(WellnessPreferences wellnessPreferences) {
        this.wellnessPreferences = wellnessPreferences;
    }

    public AppUsage getAppUsage() {
        return appUsage;
    }

    public void setAppUsage(AppUsage appUsage) {
        this.appUsage = appUsage;
    }

    public WellnessHistory getWellnessHistory() {
        return wellnessHistory;
    }

    public void setWellnessHistory(WellnessHistory wellnessHistory) {
        this.wellnessHistory = wellnessHistory;
    }

    public RiskProfile getRiskProfile() {
        return riskProfile;
    }

    public void setRiskProfile(RiskProfile riskProfile) {
        this.riskProfile = riskProfile;
    }

    public PrivacySettings getPrivacySettings() {
        return privacySettings;
    }

    public void setPrivacySettings(PrivacySettings privacySettings) {
        this.privacySettings = privacySettings;
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

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }
}
