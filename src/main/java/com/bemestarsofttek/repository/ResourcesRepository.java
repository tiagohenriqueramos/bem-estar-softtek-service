package com.bemestarsofttek.repository;


import com.bemestarsofttek.domain.Resources;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResourcesRepository extends MongoRepository<Resources, ObjectId> {
}
