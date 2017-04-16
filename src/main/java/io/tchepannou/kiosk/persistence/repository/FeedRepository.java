package io.tchepannou.kiosk.persistence.repository;

import io.tchepannou.kiosk.persistence.domain.Feed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedRepository extends CrudRepository<Feed, Long> {
}
