package com.example.demo7

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import java.util.*

class ClientQueryResolver (val clientRepo : ClientRepository) : GraphQLQueryResolver {


    fun clientById (clientId: UUID) {
        clientRepo.findById(clientId)
            }

    fun allClients () {
        clientRepo.findAll()
    }


}