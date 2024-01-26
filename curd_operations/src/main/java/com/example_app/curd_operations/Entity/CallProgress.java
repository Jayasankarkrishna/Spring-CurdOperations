package com.example_app.curd_operations.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "call_progress")
public class CallProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "call_progress_id")
    private Long callProgressId;

    @Column(name = "status_id")
    private Long statusId;

    @Column(name = "comments")
    private String comments;

    // Constructors, getters, setters
}
