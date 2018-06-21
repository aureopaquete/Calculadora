package pt.ipg.calculadora;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Aureo Paquete on 01/06/2018.
 */




    


public class BDCalculadoraOpenHelper extends SQLiteOpenHelper {
    private static final boolean PRODUCTION = false;


    public static final String DATABASE_NAME = "Calculadora.db";
    private static final int DATABASE_VERSION = 1;


    public BDCalculadoraOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    // Aqui serve para criar as tabelas da base de dados
    public void onCreate(SQLiteDatabase db) {

        DbResultados dbResultados = new DbResultados(db);
        dbResultados.create();

        DbData dbData = new DbData(db);
        dbData.create();

        if (!PRODUCTION) {
            seed(db);
        }
    }

    private void seed(SQLiteDatabase db) {

        DbResultados dbResultados = new DbResultados(db);
    }


    @Override
    //Aqui serve para atualizar as tabelas da base de dados
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {



    }
}
