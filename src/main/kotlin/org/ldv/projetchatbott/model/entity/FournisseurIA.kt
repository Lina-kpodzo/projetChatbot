package org.ldv.projetchatbott.model.entity

import jakarta.persistence.*

@Entity
class FourniseurIA(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,

    var nom: String,

    var cheminLogo: String,

    @Column(columnDefinition = "TEXT")
    var description: String
)