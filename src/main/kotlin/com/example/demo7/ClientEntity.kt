package com.example.demo7


import java.util.*
import javax.persistence.*

@Entity
class ClientEntity (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(updatable = false, nullable = false)
        val clientId: UUID? = null,
        val clientName: String = "DefaultName",
        val clientSurname: String = "DefaultSurname",
        val clientAge: Int? = null,
        val clientEmail: String? = null
)