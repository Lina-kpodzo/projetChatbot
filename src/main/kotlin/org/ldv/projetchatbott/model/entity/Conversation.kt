package org.ldv.projetchatbott.model.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class Conversation(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,

    @Column(nullable = false)
    var titre: String,

    @Column(nullable = false)
    var dateCreation: LocalDateTime,

    var dateDerniereModification: LocalDateTime? = null,

    @OneToMany(mappedBy = "conversation", cascade = [CascadeType.REMOVE], orphanRemoval = true)
    var messages: MutableList<Message> = mutableListOf(),

    // Association ManyToOne vers le modèle d'IA
    @ManyToOne
    @JoinColumn(name = "modele_ia_id")
    var modeleIA: ModeleIA? = null
) {
}