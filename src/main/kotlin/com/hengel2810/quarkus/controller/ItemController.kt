package com.hengel2810.quarkus.controller

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/items")
class ItemController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun hello(): List<Map<String, String>> {
        return listOf(
                mapOf(
                        "a" to "b"
                ),
                mapOf(
                        "c" to "d"
                )
        )
    }
}