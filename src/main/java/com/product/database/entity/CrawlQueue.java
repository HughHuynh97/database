package com.product.database.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "crawl_queue")
public class CrawlQueue {
    @Id
    @Column(name = "queue_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long crawlQueueId;

    @Column(name = "request", nullable = false, columnDefinition = "text")
    private String request;

    @Column(name = "cause", columnDefinition = "text")
    private String cause;

    @Column(name = "status", columnDefinition = "enum ('NEW','IN_PROGRESS','FAILED','DONE')")
    private String status;

    @Column(name = "created_date", columnDefinition = "timestamp default now()")
    @CreationTimestamp
    private LocalDateTime createdDate;

    @Column(name = "last_updated_date", columnDefinition = "timestamp default now() on update now()")
    @UpdateTimestamp
    private LocalDateTime lastUpdatedDate;
}
