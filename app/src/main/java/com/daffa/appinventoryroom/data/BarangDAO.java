package com.daffa.appinventoryroom.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.daffa.appinventoryroom.model.Barang;

@Dao
public interface BarangDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insertBarang(Barang barang);

    @Update
    int updateBarang(Barang barang);

    @Query("SELECT * FROM tbarang")
    Barang[] selectAllBarangs();

    @Delete
    int deleteBarang(Barang barang);
}
