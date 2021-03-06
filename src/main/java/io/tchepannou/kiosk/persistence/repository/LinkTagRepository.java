package io.tchepannou.kiosk.persistence.repository;

import io.tchepannou.kiosk.persistence.domain.Link;
import io.tchepannou.kiosk.persistence.domain.LinkTag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LinkTagRepository extends CrudRepository<LinkTag, Long> {
    List<LinkTag> findByLink(Link link);
}
