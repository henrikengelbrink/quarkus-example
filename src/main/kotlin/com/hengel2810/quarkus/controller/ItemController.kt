package com.hengel2810.quarkus.controller

import com.hengel2810.quarkus.models.Item
import com.hengel2810.quarkus.services.ItemService
import javax.enterprise.inject.Default
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/items")
class ItemController {

    @Inject
    @field: Default
    lateinit var itemService: ItemService

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    fun createItem(): Item {
        return itemService.createItem()
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getItems(): List<Item> {
        return itemService.getItems()
    }

}