package com.hengel2810.quarkus.repositories

import com.hengel2810.quarkus.models.Item
import io.quarkus.hibernate.orm.panache.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class ItemRepository : PanacheRepository<Item?> {

    fun all(): List<Item> {
        return findAll().list<Item>()
    }
}