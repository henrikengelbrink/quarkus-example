package com.hengel2810.quarkus.models

import io.quarkus.hibernate.orm.panache.PanacheEntityBase
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "items")
class Item : PanacheEntityBase() {
    @Id
    val id: UUID = UUID.randomUUID()
    var name: String = UUID.randomUUID().toString()
}
