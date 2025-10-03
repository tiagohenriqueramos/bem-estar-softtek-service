package com.bemestarsofttek.repository;

import com.bemestarsofttek.domain.Notifications;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationsRepository extends MongoRepository<Notifications, ObjectId> {
}
