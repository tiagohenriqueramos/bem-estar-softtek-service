package com.bemestarsofttek.repository;

import com.bemestarsofttek.domain.Assessments;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AssessmentsRespository extends MongoRepository<Assessments, ObjectId> {

}
