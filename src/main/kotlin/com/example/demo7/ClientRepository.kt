package com.example.demo7

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*


@Repository
interface ClientRepository : JpaRepository<ClientEntity, UUID>