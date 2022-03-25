package com.example.grupo_6_semana_9.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    private static final  int DATA_BASE = 1;
    private static final  String DATA_NOMBRE = "agenda.db";
    public static final String TABLE_CONTACTOS = "t_contactos";
    public DbHelper(@Nullable Context context) {
        super(context, DATA_NOMBRE, null,DATA_BASE );
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE "+ TABLE_CONTACTOS+"(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre TEXT NOT NULL ," +
                "telefono TEXT NOT NULL," +
                "correo_electronico TEXT )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE "+ TABLE_CONTACTOS);
        onCreate(sqLiteDatabase);

    }
}
