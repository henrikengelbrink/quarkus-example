package com.hengel2810.quarkus.services

import com.google.inject.Inject
import com.hengel2810.quarkus.models.Item
import com.hengel2810.quarkus.repositories.ItemRepository
import javax.enterprise.context.ApplicationScoped
import javax.enterprise.inject.Default
import javax.transaction.Transactional

@ApplicationScoped
class ItemService {

    @Inject
    @field: Default
    lateinit var itemRepository: ItemRepository

    @Transactional
    fun createItem(): Item {
        val item = Item()
        itemRepository.persist(item)
        println(item.name)
        return item
    }

    fun getItems(): List<Item> {
        return itemRepository.all() ?: emptyList()
    }

}
