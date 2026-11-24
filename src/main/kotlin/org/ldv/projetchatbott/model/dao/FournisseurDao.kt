package org.ldv.projetchatbott.model.dao

import org.ldv.projetchatbott.model.entity.FourniseurIA
import org.springframework.data.jpa.repository.JpaRepository

interface FourniseurIADAO : JpaRepository <FourniseurIA, Long> {
}