package org.ldv.projetchatbott.model.entity

@Entity
class Message (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,
    @Column(columnDefinition = "TEXT", nullable = false)
    var contenu: String,
    var dateCreation: LocalDateTime,
    var typeMessage: TypeMessage,
){
}

interface ModeleIADAO : JpaRepository<ModeleIA, Long> {
}