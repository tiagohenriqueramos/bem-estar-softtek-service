package com.bemestarsofttek.repository;

import com.bemestarsofttek.domain.EmployeeProfiles;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeProfilesRepository extends MongoRepository<EmployeeProfiles, ObjectId> {

}
