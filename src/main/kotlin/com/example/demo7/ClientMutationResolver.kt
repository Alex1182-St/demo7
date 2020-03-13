package com.example.demo7

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import java.util.*

class ClientMutationResolver (val clientRepo : ClientRepository) : GraphQLMutationResolver {

    fun createClient (clientName: String, clientSurname: String, clientAge: Int, clientEmail: String) : ClientEntity{
        val newClient = ClientEntity (clientName = clientName,
                                        clientSurname = clientSurname,
                                        clientAge = clientAge,
                                        clientEmail = clientEmail)
        return clientRepo.save(newClient)
            }

    fun deleteClient (clientId : UUID): Boolean {
        clientRepo.deleteById(clientId)
        return true
    }

}