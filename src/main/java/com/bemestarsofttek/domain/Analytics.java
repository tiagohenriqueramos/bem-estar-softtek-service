package com.bemestarsofttek.domain;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Document
public class Analytics {

        @Id
        private ObjectId id; // ObjectId como String
        private String employeeId;
        private Date reportDate;
        private String reportType; // daily, weekly, monthly, quarterly, yearly, custom

        private Period period;
        private MoodAnalytics moodAnalytics;
        private WorkloadAnalytics workloadAnalytics;
        private RelationshipAnalytics relationshipAnalytics;
        private SymptomsAnalytics symptomsAnalytics;
        private WellnessScore wellnessScore;
        private RiskAssessment riskAssessment;
        private Recommendations recommendations;
        private ComparativeData comparativeData;

        private Date generatedAt;
        private Map<String, Object> metadata;

        // --------- Subclasses ---------

        public static class Period {
            private Date startDate;
            private Date endDate;
            private String type;

            public Date getStartDate() { return startDate; }
            public void setStartDate(Date startDate) { this.startDate = startDate; }

            public Date getEndDate() { return endDate; }
            public void setEndDate(Date endDate) { this.endDate = endDate; }

            public String getType() { return type; }
            public void setType(String type) { this.type = type; }
        }

        public static class MoodAnalytics {
            private Double averageMoodScore;
            private String moodTrend; // melhorando, piorando, estável, volátil
            private String mostCommonMood;
            private Double moodConsistency;
            private Double moodVolatility;

            public Double getAverageMoodScore() { return averageMoodScore; }
            public void setAverageMoodScore(Double averageMoodScore) { this.averageMoodScore = averageMoodScore; }

            public String getMoodTrend() { return moodTrend; }
            public void setMoodTrend(String moodTrend) { this.moodTrend = moodTrend; }

            public String getMostCommonMood() { return mostCommonMood; }
            public void setMostCommonMood(String mostCommonMood) { this.mostCommonMood = mostCommonMood; }

            public Double getMoodConsistency() { return moodConsistency; }
            public void setMoodConsistency(Double moodConsistency) { this.moodConsistency = moodConsistency; }

            public Double getMoodVolatility() { return moodVolatility; }
            public void setMoodVolatility(Double moodVolatility) { this.moodVolatility = moodVolatility; }
        }

        public static class WorkloadAnalytics {
            private String averageWorkload;
            private String workloadTrend; // aumentando, diminuindo, estável, irregular
            private String overtimeFrequency;
            private Double workloadImpactScore;

            public String getAverageWorkload() { return averageWorkload; }
            public void setAverageWorkload(String averageWorkload) { this.averageWorkload = averageWorkload; }

            public String getWorkloadTrend() { return workloadTrend; }
            public void setWorkloadTrend(String workloadTrend) { this.workloadTrend = workloadTrend; }

            public String getOvertimeFrequency() { return overtimeFrequency; }
            public void setOvertimeFrequency(String overtimeFrequency) { this.overtimeFrequency = overtimeFrequency; }

            public Double getWorkloadImpactScore() { return workloadImpactScore; }
            public void setWorkloadImpactScore(Double workloadImpactScore) { this.workloadImpactScore = workloadImpactScore; }
        }

        public static class RelationshipAnalytics {
            private Double bossRelationshipAvg;
            private Double colleaguesRelationshipAvg;
            private Double teamCollaborationAvg;
            private Double leadershipSatisfactionAvg;

            public Double getBossRelationshipAvg() { return bossRelationshipAvg; }
            public void setBossRelationshipAvg(Double bossRelationshipAvg) { this.bossRelationshipAvg = bossRelationshipAvg; }

            public Double getColleaguesRelationshipAvg() { return colleaguesRelationshipAvg; }
            public void setColleaguesRelationshipAvg(Double colleaguesRelationshipAvg) { this.colleaguesRelationshipAvg = colleaguesRelationshipAvg; }

            public Double getTeamCollaborationAvg() { return teamCollaborationAvg; }
            public void setTeamCollaborationAvg(Double teamCollaborationAvg) { this.teamCollaborationAvg = teamCollaborationAvg; }

            public Double getLeadershipSatisfactionAvg() { return leadershipSatisfactionAvg; }
            public void setLeadershipSatisfactionAvg(Double leadershipSatisfactionAvg) { this.leadershipSatisfactionAvg = leadershipSatisfactionAvg; }
        }

        public static class SymptomsAnalytics {
            private String symptomsFrequency;
            private String symptomsTrend; // aumentando, diminuindo, estável, irregular
            private String mentalHealthImpact;
            private Double symptomsSeverity;

            public String getSymptomsFrequency() { return symptomsFrequency; }
            public void setSymptomsFrequency(String symptomsFrequency) { this.symptomsFrequency = symptomsFrequency; }

            public String getSymptomsTrend() { return symptomsTrend; }
            public void setSymptomsTrend(String symptomsTrend) { this.symptomsTrend = symptomsTrend; }

            public String getMentalHealthImpact() { return mentalHealthImpact; }
            public void setMentalHealthImpact(String mentalHealthImpact) { this.mentalHealthImpact = mentalHealthImpact; }

            public Double getSymptomsSeverity() { return symptomsSeverity; }
            public void setSymptomsSeverity(Double symptomsSeverity) { this.symptomsSeverity = symptomsSeverity; }
        }

        public static class WellnessScore {
            private Double overallScore;
            private Double previousScore;
            private Double scoreChange;
            private String scoreTrend; // melhorando, piorando, estável

            public Double getOverallScore() { return overallScore; }
            public void setOverallScore(Double overallScore) { this.overallScore = overallScore; }

            public Double getPreviousScore() { return previousScore; }
            public void setPreviousScore(Double previousScore) { this.previousScore = previousScore; }

            public Double getScoreChange() { return scoreChange; }
            public void setScoreChange(Double scoreChange) { this.scoreChange = scoreChange; }

            public String getScoreTrend() { return scoreTrend; }
            public void setScoreTrend(String scoreTrend) { this.scoreTrend = scoreTrend; }
        }

        public static class RiskAssessment {
            private String riskLevel; // Baixo, Médio, Alto, Crítico
            private List<String> riskFactors;
            private List<String> recommendations;
            private Boolean interventionNeeded;

            public String getRiskLevel() { return riskLevel; }
            public void setRiskLevel(String riskLevel) { this.riskLevel = riskLevel; }

            public List<String> getRiskFactors() { return riskFactors; }
            public void setRiskFactors(List<String> riskFactors) { this.riskFactors = riskFactors; }

            public List<String> getRecommendations() { return recommendations; }
            public void setRecommendations(List<String> recommendations) { this.recommendations = recommendations; }

            public Boolean getInterventionNeeded() { return interventionNeeded; }
            public void setInterventionNeeded(Boolean interventionNeeded) { this.interventionNeeded = interventionNeeded; }
        }

        public static class Recommendations {
            private List<String> immediateActions;
            private List<String> longTermGoals;
            private List<String> resourcesSuggested; // ObjectId como String
            private Boolean professionalHelp;

            public List<String> getImmediateActions() { return immediateActions; }
            public void setImmediateActions(List<String> immediateActions) { this.immediateActions = immediateActions; }

            public List<String> getLongTermGoals() { return longTermGoals; }
            public void setLongTermGoals(List<String> longTermGoals) { this.longTermGoals = longTermGoals; }

            public List<String> getResourcesSuggested() { return resourcesSuggested; }
            public void setResourcesSuggested(List<String> resourcesSuggested) { this.resourcesSuggested = resourcesSuggested; }

            public Boolean getProfessionalHelp() { return professionalHelp; }
            public void setProfessionalHelp(Boolean professionalHelp) { this.professionalHelp = professionalHelp; }
        }

        public static class ComparativeData {
            private Double departmentAverage;
            private Double companyAverage;
            private Double personalBaseline;
            private Double improvementPercentage;

            public Double getDepartmentAverage() { return departmentAverage; }
            public void setDepartmentAverage(Double departmentAverage) { this.departmentAverage = departmentAverage; }

            public Double getCompanyAverage() { return companyAverage; }
            public void setCompanyAverage(Double companyAverage) { this.companyAverage = companyAverage; }

            public Double getPersonalBaseline() { return personalBaseline; }
            public void setPersonalBaseline(Double personalBaseline) { this.personalBaseline = personalBaseline; }

            public Double getImprovementPercentage() { return improvementPercentage; }
            public void setImprovementPercentage(Double improvementPercentage) { this.improvementPercentage = improvementPercentage; }
        }

        // --------- Getters & Setters principais ---------

        public ObjectId getId() { return id; }
        public void setId(ObjectId id) { this.id = id; }

        public String getEmployeeId() { return employeeId; }
        public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

        public Date getReportDate() { return reportDate; }
        public void setReportDate(Date reportDate) { this.reportDate = reportDate; }

        public String getReportType() { return reportType; }
        public void setReportType(String reportType) { this.reportType = reportType; }

        public Period getPeriod() { return period; }
        public void setPeriod(Period period) { this.period = period; }

        public MoodAnalytics getMoodAnalytics() { return moodAnalytics; }
        public void setMoodAnalytics(MoodAnalytics moodAnalytics) { this.moodAnalytics = moodAnalytics; }

        public WorkloadAnalytics getWorkloadAnalytics() { return workloadAnalytics; }
        public void setWorkloadAnalytics(WorkloadAnalytics workloadAnalytics) { this.workloadAnalytics = workloadAnalytics; }

        public RelationshipAnalytics getRelationshipAnalytics() { return relationshipAnalytics; }
        public void setRelationshipAnalytics(RelationshipAnalytics relationshipAnalytics) { this.relationshipAnalytics = relationshipAnalytics; }

        public SymptomsAnalytics getSymptomsAnalytics() { return symptomsAnalytics; }
        public void setSymptomsAnalytics(SymptomsAnalytics symptomsAnalytics) { this.symptomsAnalytics = symptomsAnalytics; }

        public WellnessScore getWellnessScore() { return wellnessScore; }
        public void setWellnessScore(WellnessScore wellnessScore) { this.wellnessScore = wellnessScore; }

        public RiskAssessment getRiskAssessment() { return riskAssessment; }
        public void setRiskAssessment(RiskAssessment riskAssessment) { this.riskAssessment = riskAssessment; }

        public Recommendations getRecommendations() { return recommendations; }
        public void setRecommendations(Recommendations recommendations) { this.recommendations = recommendations; }

        public ComparativeData getComparativeData() { return comparativeData; }
        public void setComparativeData(ComparativeData comparativeData) { this.comparativeData = comparativeData; }

        public Date getGeneratedAt() { return generatedAt; }
        public void setGeneratedAt(Date generatedAt) { this.generatedAt = generatedAt; }

        public Map<String, Object> getMetadata() { return metadata; }
        public void setMetadata(Map<String, Object> metadata) { this.metadata = metadata; }
    }

