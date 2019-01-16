package com.example.lolaabudu.cat_sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;

public class CatSQLiteOpenHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "cat.db";
    private static final int DATABSAE_VERSION = 1;

    private static final String TABLE_NAME = "cats";

    public CatSQLiteOpenHelper(@NonNull Context context){
        super(context, DATABASE_NAME, null, DATABSAE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
