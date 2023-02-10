package com.example.quranapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class DBHandler extends SQLiteOpenHelper {
    private final static String DB_PATH = "/data/data/[YOUR PACKAGE HERE]/databases/";

    public String DB_NAME="QuranDb.db";
    public String T_SURAH = "tsurah";
    public String T_AYAH = "tayah";
    public Context mycontext;

    public File dbFile;

    public DBHandler(Context context) {
        super(context, "QuranDb.db", null, 2);
        this.mycontext = context;

        dbFile= new File(DB_PATH + DB_NAME);
    }

    @Override
    public synchronized SQLiteDatabase getWritableDatabase() {
        if(!dbFile.exists()){
            SQLiteDatabase db = super.getWritableDatabase();
            copyDataBase(db.getPath());
        }
        return super.getWritableDatabase();
    }

    @Override
    public synchronized SQLiteDatabase getReadableDatabase() {
        if(!dbFile.exists()){
            SQLiteDatabase db = super.getReadableDatabase();
            copyDataBase(db.getPath());
        }
        return super.getReadableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {}

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {}

    private void copyDataBase(String dbPath){
        Log.d("TAG", "copyDataBase: ");
        try{
            InputStream assestDB = mycontext.getAssets().open(DB_NAME);

            OutputStream appDB = new FileOutputStream(dbPath,false);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = assestDB.read(buffer)) > 0) {
                appDB.write(buffer, 0, length);
            }
            Log.d("TAG", "copyDataBase: ");
            appDB.flush();
            appDB.close();
            assestDB.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Surah> getAllSurah() {
        ArrayList<Surah> surah = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "Select * from " + T_SURAH;

        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(0);
                String into = cursor.getString(1);
                String eng_name = cursor.getString(2);
                String nazool = cursor.getString(3);
                String urdu_name = cursor.getString(4);

                Surah surahObj = new Surah(id, into, eng_name, nazool, urdu_name);
                surah.add(surahObj);
            } while (cursor.moveToNext());
        }

        return surah;
    }
}
