package pt.ipg.calculadora;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Aureo Paquete on 01/06/2018.
 */

public class BDCalculadora extends SQLiteOpenHelper {
    public BDCalculadora(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    // Aqui serve para criar as tabaleas da base de dados
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    //Aqui serve para atualizar as tabelas da base de dados
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
