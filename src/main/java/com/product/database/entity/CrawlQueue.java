package com.product.database.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "crawl_queue")
public class CrawlQueue {
    @Id
    @Column(name = "queue_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long crawlQueueId;

    @Column(name = "start_date", columnDefinition = "DATETIME NOT NULL")
    private Date startDate;

    @Column(name = "end_date", columnDefinition = "DATETIME NOT NULL")
    private Date endDate;

    @Column(name = "cause", columnDefinition = "text NOT NULL")
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
