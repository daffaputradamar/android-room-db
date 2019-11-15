package com.daffa.appinventoryroom.data.factory;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.daffa.appinventoryroom.data.BarangDAO;
import com.daffa.appinventoryroom.model.Barang;

@Database(entities = {Barang.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BarangDAO barangDAO();
}
