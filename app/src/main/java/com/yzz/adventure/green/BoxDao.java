package com.yzz.adventure.green;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.yzz.adventure.model.Box;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOX".
*/
public class BoxDao extends AbstractDao<Box, Long> {

    public static final String TABLENAME = "BOX";

    /**
     * Properties of entity Box.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property _Id = new Property(0, Long.class, "_Id", true, "_id");
        public final static Property ItemId = new Property(1, int.class, "itemId", false, "ITEM_ID");
    }


    public BoxDao(DaoConfig config) {
        super(config);
    }
    
    public BoxDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOX\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: _Id
                "\"ITEM_ID\" INTEGER NOT NULL );"); // 1: itemId
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOX\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Box entity) {
        stmt.clearBindings();
 
        Long _Id = entity.get_Id();
        if (_Id != null) {
            stmt.bindLong(1, _Id);
        }
        stmt.bindLong(2, entity.getItemId());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Box entity) {
        stmt.clearBindings();
 
        Long _Id = entity.get_Id();
        if (_Id != null) {
            stmt.bindLong(1, _Id);
        }
        stmt.bindLong(2, entity.getItemId());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Box readEntity(Cursor cursor, int offset) {
        Box entity = new Box( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // _Id
            cursor.getInt(offset + 1) // itemId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Box entity, int offset) {
        entity.set_Id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setItemId(cursor.getInt(offset + 1));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Box entity, long rowId) {
        entity.set_Id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Box entity) {
        if(entity != null) {
            return entity.get_Id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Box entity) {
        return entity.get_Id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
