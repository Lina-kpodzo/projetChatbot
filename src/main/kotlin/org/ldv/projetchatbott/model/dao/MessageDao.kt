package org.ldv.projetchatbott.model.dao

import org.ldv.projetchatbott.model.entity.Message
import org.springframework.data.jpa.repository.JpaRepository

interface MessageDAO : JpaRepository<Message, Long> {
}