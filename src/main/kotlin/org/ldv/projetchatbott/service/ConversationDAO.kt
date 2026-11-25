package org.ldv.projetchatbott.service

import org.ldv.projetchatbott.model.entity.Conversation
import org.springframework.data.jpa.repository.JpaRepository

interface ConversationDAO : JpaRepository<Conversation, Long> {
    fun findAllByOrderByDateCreationDesc(): List<Conversation>
}
