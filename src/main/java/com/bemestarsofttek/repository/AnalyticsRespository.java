package com.bemestarsofttek.repository;

import com.bemestarsofttek.domain.Analytics;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnalyticsRespository extends MongoRepository<Analytics, ObjectId> {

}
