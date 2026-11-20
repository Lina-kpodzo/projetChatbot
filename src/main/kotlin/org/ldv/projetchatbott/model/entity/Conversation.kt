package org.ldv.chatbot.model.entity

import jakarta.persistence.*

@Entity
class ModeleIA(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,

    @Column(nullable = false)
    var nom: String,

    @Column(columnDefinition = "TEXT", nullable = true)
    var description: String? = null,

    @Column(nullable = false)
    var actif: Boolean = true,

    @Column(nullable = true)
    var cheminLogo: String? = null,



// Association avec FournisseurIA (ModeleIA est le maître de l'association)
    @ManyToOne
    @JoinColumn(name = "fournisseur_ia_id")
    var fournisseurIA: FournisseurIA? = null,

// Association avec Conversation
    @OneToMany(mappedBy = "modeleIA", cascade = [CascadeType.REMOVE], orphanRemoval = true)
    var conversations: MutableList<Conversation> = mutableListOf()
){

}

