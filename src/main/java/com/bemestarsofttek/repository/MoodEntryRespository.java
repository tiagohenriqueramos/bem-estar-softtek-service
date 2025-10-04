package com.bemestarsofttek.repository;

import com.bemestarsofttek.domain.MoodEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface MoodEntryRespository extends MongoRepository<MoodEntry, ObjectId> {

    List<MoodEntry> findByDateBetween(LocalDate dataInicial, LocalDate dataFinal);

}
