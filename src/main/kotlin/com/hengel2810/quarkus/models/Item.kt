package com.hengel2810.quarkus.models

import io.quarkus.hibernate.orm.panache.PanacheEntity
import java.util.*
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "items")
class Item : PanacheEntity() {
    var name: String = UUID.randomUUID().toString()
}
