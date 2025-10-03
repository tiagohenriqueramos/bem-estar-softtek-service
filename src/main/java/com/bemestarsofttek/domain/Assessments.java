package com.bemestarsofttek.domain;

import org.bson.types.ObjectId;

import java.util.Date;

public class Assessments {

        private ObjectId id;               // ObjectId como String
        private String employeeId;
        private Date assessmentDate;

        private Choice emojiChoice;
        private Choice feelingChoice;
        private Choice workloadLevel;
        private Choice workloadAffectsLife;
        private Choice worksOvertime;
        private Choice hasSymptoms;
        private Choice mentalHealthAffectsWork;

        private RelationshipScores relationshipScores;
        private LeadershipScores leadershipScores;

        private String observations;
        private Integer assessmentScore; // 0-100
        private String riskLevel;        // Baixo, Médio, Alto, Crítico

        private Date createdAt;
        private Date updatedAt;

        // -------- Subclasses --------

        // Estrutura genérica para escolhas com display_name (ex: emoji, sentimentos, etc.)
        public static class Choice {
            private String displayName;
            private String emoji; // usado apenas em emojiChoice

            public String getDisplayName() { return displayName; }
            public void setDisplayName(String displayName) { this.displayName = displayName; }

            public String getEmoji() { return emoji; }
            public void setEmoji(String emoji) { this.emoji = emoji; }
        }

        public static class RelationshipScores {
            private Integer boss;
            private Integer colleagues;
            private Integer respectFromColleagues;
            private Integer teamCollaboration;
            private Integer freedomToExpress;
            private Integer teamWelcoming;
            private Integer teamCooperation;

            public Integer getBoss() { return boss; }
            public void setBoss(Integer boss) { this.boss = boss; }

            public Integer getColleagues() { return colleagues; }
            public void setColleagues(Integer colleagues) { this.colleagues = colleagues; }

            public Integer getRespectFromColleagues() { return respectFromColleagues; }
            public void setRespectFromColleagues(Integer respectFromColleagues) { this.respectFromColleagues = respectFromColleagues; }

            public Integer getTeamCollaboration() { return teamCollaboration; }
            public void setTeamCollaboration(Integer teamCollaboration) { this.teamCollaboration = teamCollaboration; }

            public Integer getFreedomToExpress() { return freedomToExpress; }
            public void setFreedomToExpress(Integer freedomToExpress) { this.freedomToExpress = freedomToExpress; }

            public Integer getTeamWelcoming() { return teamWelcoming; }
            public void setTeamWelcoming(Integer teamWelcoming) { this.teamWelcoming = teamWelcoming; }

            public Integer getTeamCooperation() { return teamCooperation; }
            public void setTeamCooperation(Integer teamCooperation) { this.teamCooperation = teamCooperation; }
        }

        public static class LeadershipScores {
            private Integer clearInstructions;
            private Integer openCommunication;
            private Integer efficientInformation;
            private Integer clearGoals;
            private Integer leadershipCares;
            private Integer leadershipAvailable;
            private Integer comfortableReporting;
            private Integer recognizedByLeadership;
            private Integer trustInLeadership;

            public Integer getClearInstructions() { return clearInstructions; }
            public void setClearInstructions(Integer clearInstructions) { this.clearInstructions = clearInstructions; }

            public Integer getOpenCommunication() { return openCommunication; }
            public void setOpenCommunication(Integer openCommunication) { this.openCommunication = openCommunication; }

            public Integer getEfficientInformation() { return efficientInformation; }
            public void setEfficientInformation(Integer efficientInformation) { this.efficientInformation = efficientInformation; }

            public Integer getClearGoals() { return clearGoals; }
            public void setClearGoals(Integer clearGoals) { this.clearGoals = clearGoals; }

            public Integer getLeadershipCares() { return leadershipCares; }
            public void setLeadershipCares(Integer leadershipCares) { this.leadershipCares = leadershipCares; }

            public Integer getLeadershipAvailable() { return leadershipAvailable; }
            public void setLeadershipAvailable(Integer leadershipAvailable) { this.leadershipAvailable = leadershipAvailable; }

            public Integer getComfortableReporting() { return comfortableReporting; }
            public void setComfortableReporting(Integer comfortableReporting) { this.comfortableReporting = comfortableReporting; }

            public Integer getRecognizedByLeadership() { return recognizedByLeadership; }
            public void setRecognizedByLeadership(Integer recognizedByLeadership) { this.recognizedByLeadership = recognizedByLeadership; }

            public Integer getTrustInLeadership() { return trustInLeadership; }
            public void setTrustInLeadership(Integer trustInLeadership) { this.trustInLeadership = trustInLeadership; }
        }

        // -------- Getters & Setters --------

        public ObjectId getId() { return id; }
        public void setId(ObjectId id) { this.id = id; }

        public String getEmployeeId() { return employeeId; }
        public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

        public Date getAssessmentDate() { return assessmentDate; }
        public void setAssessmentDate(Date assessmentDate) { this.assessmentDate = assessmentDate; }

        public Choice getEmojiChoice() { return emojiChoice; }
        public void setEmojiChoice(Choice emojiChoice) { this.emojiChoice = emojiChoice; }

        public Choice getFeelingChoice() { return feelingChoice; }
        public void setFeelingChoice(Choice feelingChoice) { this.feelingChoice = feelingChoice; }

        public Choice getWorkloadLevel() { return workloadLevel; }
        public void setWorkloadLevel(Choice workloadLevel) { this.workloadLevel = workloadLevel; }

        public Choice getWorkloadAffectsLife() { return workloadAffectsLife; }
        public void setWorkloadAffectsLife(Choice workloadAffectsLife) { this.workloadAffectsLife = workloadAffectsLife; }

        public Choice getWorksOvertime() { return worksOvertime; }
        public void setWorksOvertime(Choice worksOvertime) { this.worksOvertime = worksOvertime; }

        public Choice getHasSymptoms() { return hasSymptoms; }
        public void setHasSymptoms(Choice hasSymptoms) { this.hasSymptoms = hasSymptoms; }

        public Choice getMentalHealthAffectsWork() { return mentalHealthAffectsWork; }
        public void setMentalHealthAffectsWork(Choice mentalHealthAffectsWork) { this.mentalHealthAffectsWork = mentalHealthAffectsWork; }

        public RelationshipScores getRelationshipScores() { return relationshipScores; }
        public void setRelationshipScores(RelationshipScores relationshipScores) { this.relationshipScores = relationshipScores; }

        public LeadershipScores getLeadershipScores() { return leadershipScores; }
        public void setLeadershipScores(LeadershipScores leadershipScores) { this.leadershipScores = leadershipScores; }

        public String getObservations() { return observations; }
        public void setObservations(String observations) { this.observations = observations; }

        public Integer getAssessmentScore() { return assessmentScore; }
        public void setAssessmentScore(Integer assessmentScore) { this.assessmentScore = assessmentScore; }

        public String getRiskLevel() { return riskLevel; }
        public void setRiskLevel(String riskLevel) { this.riskLevel = riskLevel; }

        public Date getCreatedAt() { return createdAt; }
        public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }

        public Date getUpdatedAt() { return updatedAt; }
        public void setUpdatedAt(Date updatedAt) { this.updatedAt = updatedAt; }
 }

