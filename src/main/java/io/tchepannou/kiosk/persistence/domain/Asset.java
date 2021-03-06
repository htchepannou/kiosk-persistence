package io.tchepannou.kiosk.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "link_fk")
    private Link link;

    @ManyToOne
    @JoinColumn(name = "target_fk")
    private Link target;

    @Column(length = 20)
    private AssetTypeEnum type;

    public Asset() {
    }

    public Asset(final Link link, final Link target, final AssetTypeEnum type) {
        this.link = link;
        this.target = target;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(final Link link) {
        this.link = link;
    }

    public Link getTarget() {
        return target;
    }

    public void setTarget(final Link target) {
        this.target = target;
    }

    public AssetTypeEnum getType() {
        return type;
    }

    public void setType(final AssetTypeEnum type) {
        this.type = type;
    }
}
