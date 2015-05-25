package dev.dacc.zslicker.dacc.App.Model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Class for work with database
 */
public class DCDBHelper extends SQLiteOpenHelper {

    String LOG_TAG = "db";

    String ACCOUNT_TABLE = "mainTable";
    String ID_COLUMN = "id";
    String DATE_COLUMN = "date";
    String DESCRIPTION_COLUMN = "description";
    String MONEY_COUNT_COLUMN = "moneyCount";
    String CATEGORY_ID = "categoryId";
    String OPERATION_ID = "operationId";

    String CATEGORY_TABLE = "categoryTable";
    String NAME_COLUMN = "name";

    String OPERATION_TABLE = "operationTable";

    public static final String DATABASE_NAME = "FeedReader.db";

    public static final int DATABASE_VERSION = 1;

    Context mContext;

    public DCDBHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //SQL Script for creation main Table
        String tableAccountCreation = "CREATE TABLE " + ACCOUNT_TABLE +
                " (" + ID_COLUMN + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                DATE_COLUMN + " INTEGER, " +
                DESCRIPTION_COLUMN + " TEXT, " +
                MONEY_COUNT_COLUMN + " NUMERIC, " +
                CATEGORY_ID + " INTEGER, " +
                OPERATION_ID + " INTEGER)";
        //SQL Script for creation Table category
        String tableCategoryCreation = "CREATE TABLE " + CATEGORY_TABLE + " (" +
                ID_COLUMN + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                NAME_COLUMN + " TEXT NOT NULL" +
                ")";
        //SQL Script for creation Table operation
        String tableTypeCreation = "CREATE TABLE " + OPERATION_TABLE + " (" +
                ID_COLUMN + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                NAME_COLUMN + " TEXT NOT NULL" +
                ")";
        db.execSQL(tableAccountCreation);
        db.execSQL(tableCategoryCreation);
        db.execSQL(tableTypeCreation);

        Log.d(LOG_TAG, "Tables created");
    }

    private String SQL_DELETE_ACCOUNT =
            "DROP TABLE IF EXISTS " + ACCOUNT_TABLE;
    private String SQL_DELETE_CATEGORY =
            "DROP TABLE IF EXISTS " + CATEGORY_TABLE;
    private String SQL_DELETE_OPERATION =
            "DROP TABLE IF EXISTS " + OPERATION_TABLE;

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL(SQL_DELETE_ACCOUNT);
        db.execSQL(SQL_DELETE_CATEGORY);
        db.execSQL(SQL_DELETE_OPERATION);

        onCreate(db);
    }
}
