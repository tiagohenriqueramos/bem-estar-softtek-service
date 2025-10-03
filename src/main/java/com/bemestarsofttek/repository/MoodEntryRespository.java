package com.bemestarsofttek.repository;

import com.bemestarsofttek.domain.MoodEntries;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface MoodEntryRespository extends MongoRepository<MoodEntries, ObjectId> {

    List<MoodEntries> findByDateBetween(LocalDate dataInicial, LocalDate dataFinal);

}
