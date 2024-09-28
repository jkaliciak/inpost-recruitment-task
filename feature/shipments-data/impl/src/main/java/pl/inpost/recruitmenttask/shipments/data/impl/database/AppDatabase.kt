package pl.inpost.recruitmenttask.shipments.data.impl.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import pl.inpost.recruitmenttask.shipments.data.impl.database.converters.ZonedDateTimeConverter
import pl.inpost.recruitmenttask.shipments.data.impl.database.dao.ShipmentDao
import pl.inpost.recruitmenttask.shipments.data.api.database.model.EventLogEntity
import pl.inpost.recruitmenttask.shipments.data.api.database.model.ShipmentEntity

@Database(entities = [ShipmentEntity::class, EventLogEntity::class], version = 1)
@TypeConverters(ZonedDateTimeConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun shipmentDao(): ShipmentDao
}