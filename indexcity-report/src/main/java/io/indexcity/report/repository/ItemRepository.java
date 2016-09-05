package io.indexcity.report.repository;

import io.indexcity.report.domain.Item;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Item entity.
 */
@SuppressWarnings("unused")
public interface ItemRepository extends MongoRepository<Item,String> {

}
