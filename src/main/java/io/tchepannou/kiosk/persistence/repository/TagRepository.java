package io.tchepannou.kiosk.persistence.repository;

import io.tchepannou.kiosk.persistence.domain.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {
    Tag findByName(String name);
    List<Tag> findByNameIn(List<String> name);
}
