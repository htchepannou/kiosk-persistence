package io.tchepannou.kiosk.persistence.repository;

import io.tchepannou.kiosk.persistence.domain.Feed;
import io.tchepannou.kiosk.persistence.domain.Link;
import io.tchepannou.kiosk.persistence.domain.LinkStatusEnum;
import io.tchepannou.kiosk.persistence.domain.LinkTypeEnum;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LinkRepository extends CrudRepository<Link, Long> {
    Link findByUrlHash(String urlHash);

    List<Link> findByFeedAndType(Feed feed, LinkTypeEnum type, Pageable pageable);

    List<Link> findByStatus(LinkStatusEnum status, Pageable pageable);

    List<Link> findByTypeAndStatus(LinkTypeEnum  type, LinkStatusEnum status, Pageable pagination);
}
