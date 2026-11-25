package org.ldv.projetchatbott.model.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class Conversation(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,

    var titre: String,
    @OneToMany(mappedBy = "conversation", cascade = [CascadeType.REMOVE], orphanRemoval = true)
    var messages: MutableList<Message> = mutableListOf(),
    var dateCreation: LocalDateTime
)