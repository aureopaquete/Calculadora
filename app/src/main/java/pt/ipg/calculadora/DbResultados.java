package pt.ipg.calculadora;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

/**
 * Created by Aureo Paquete on 15/06/2018.
 */
public class DbResultados implements BaseColumns {
    public static final String TABLE_NAME = "Resultados";

    public static final String[] ALL_COLUMNS = new String[]{};

    private SQLiteDatabase db;
    private String DbResultados_ID;


    public DbResultados(SQLiteDatabase db) {
    }

    public void create() {
        db.execSQL(
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +

                        DbResultados.TABLE_NAME +
                        "(" + DbResultados_ID + ")" +
                        ")"
        );
    }
}



