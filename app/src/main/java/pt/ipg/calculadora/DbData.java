package pt.ipg.calculadora;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

/**
 * Created by Aureo Paquete on 15/06/2018.
 */
public class DbData implements BaseColumns {
    public static final String TABLE_NAME = "Data";

    public static final String[] ALL_COLUMNS = new String[]{};

    private SQLiteDatabase db;
    private String DbData_ID;


    public DbData(SQLiteDatabase db) {
    }

    public void create() {
        db.execSQL(
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +

                        DbData.TABLE_NAME +
                        "(" + DbData_ID + ")" +
                        ")"
        );
    }
}



