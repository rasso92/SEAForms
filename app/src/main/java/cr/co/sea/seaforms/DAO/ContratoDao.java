package cr.co.sea.seaforms.DAO;

import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;

import cr.co.sea.seaforms.Model.Contrato;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CONTRATO".
*/
public class ContratoDao extends AbstractDao<Contrato, Long> {

    public static final String TABLENAME = "CONTRATO";

    /**
     * Properties of entity Contrato.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property ConFecha = new Property(1, java.util.Date.class, "ConFecha", false, "CON_FECHA");
        public final static Property ConGenerico1 = new Property(2, String.class, "ConGenerico1", false, "CON_GENERICO1");
        public final static Property ConGenerico2 = new Property(3, String.class, "ConGenerico2", false, "CON_GENERICO2");
        public final static Property ConGenerico3 = new Property(4, String.class, "ConGenerico3", false, "CON_GENERICO3");
        public final static Property ConGenerico4 = new Property(5, String.class, "ConGenerico4", false, "CON_GENERICO4");
        public final static Property ConGenerico5 = new Property(6, String.class, "ConGenerico5", false, "CON_GENERICO5");
        public final static Property ConGenerico6 = new Property(7, String.class, "ConGenerico6", false, "CON_GENERICO6");
        public final static Property ConGenerico7 = new Property(8, String.class, "ConGenerico7", false, "CON_GENERICO7");
        public final static Property ConGenerico8 = new Property(9, String.class, "ConGenerico8", false, "CON_GENERICO8");
        public final static Property ConGenerico9 = new Property(10, String.class, "ConGenerico9", false, "CON_GENERICO9");
        public final static Property ConGenerico10 = new Property(11, String.class, "ConGenerico10", false, "CON_GENERICO10");
        public final static Property ConGenerico11 = new Property(12, String.class, "ConGenerico11", false, "CON_GENERICO11");
        public final static Property ConGenerico12 = new Property(13, String.class, "ConGenerico12", false, "CON_GENERICO12");
        public final static Property ConGenerico13 = new Property(14, String.class, "ConGenerico13", false, "CON_GENERICO13");
        public final static Property ConGenerico14 = new Property(15, String.class, "ConGenerico14", false, "CON_GENERICO14");
        public final static Property ConGenerico15 = new Property(16, String.class, "ConGenerico15", false, "CON_GENERICO15");
        public final static Property ConGenerico16 = new Property(17, String.class, "ConGenerico16", false, "CON_GENERICO16");
        public final static Property ConGenerico17 = new Property(18, String.class, "ConGenerico17", false, "CON_GENERICO17");
        public final static Property ConGenerico18 = new Property(19, String.class, "ConGenerico18", false, "CON_GENERICO18");
        public final static Property ConGenerico19 = new Property(20, String.class, "ConGenerico19", false, "CON_GENERICO19");
        public final static Property ConGenerico20 = new Property(21, String.class, "ConGenerico20", false, "CON_GENERICO20");
        public final static Property ConGenerico21 = new Property(22, String.class, "ConGenerico21", false, "CON_GENERICO21");
        public final static Property ConGenerico22 = new Property(23, String.class, "ConGenerico22", false, "CON_GENERICO22");
        public final static Property ConGenerico23 = new Property(24, String.class, "ConGenerico23", false, "CON_GENERICO23");
        public final static Property ConGenerico24 = new Property(25, String.class, "ConGenerico24", false, "CON_GENERICO24");
        public final static Property ConGenerico25 = new Property(26, String.class, "ConGenerico25", false, "CON_GENERICO25");
        public final static Property ConGenerico26 = new Property(27, String.class, "ConGenerico26", false, "CON_GENERICO26");
        public final static Property ConGenerico27 = new Property(28, String.class, "ConGenerico27", false, "CON_GENERICO27");
        public final static Property ConGenerico28 = new Property(29, String.class, "ConGenerico28", false, "CON_GENERICO28");
        public final static Property ConGenerico29 = new Property(30, String.class, "ConGenerico29", false, "CON_GENERICO29");
        public final static Property ConGenerico30 = new Property(31, String.class, "ConGenerico30", false, "CON_GENERICO30");
        public final static Property CliId = new Property(32, long.class, "CliId", false, "CLI_ID");
    };

    private Query<Contrato> cliente_CliContratosQuery;

    public ContratoDao(DaoConfig config) {
        super(config);
    }
    
    public ContratoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CONTRATO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"CON_FECHA\" INTEGER," + // 1: ConFecha
                "\"CON_GENERICO1\" TEXT," + // 2: ConGenerico1
                "\"CON_GENERICO2\" TEXT," + // 3: ConGenerico2
                "\"CON_GENERICO3\" TEXT," + // 4: ConGenerico3
                "\"CON_GENERICO4\" TEXT," + // 5: ConGenerico4
                "\"CON_GENERICO5\" TEXT," + // 6: ConGenerico5
                "\"CON_GENERICO6\" TEXT," + // 7: ConGenerico6
                "\"CON_GENERICO7\" TEXT," + // 8: ConGenerico7
                "\"CON_GENERICO8\" TEXT," + // 9: ConGenerico8
                "\"CON_GENERICO9\" TEXT," + // 10: ConGenerico9
                "\"CON_GENERICO10\" TEXT," + // 11: ConGenerico10
                "\"CON_GENERICO11\" TEXT," + // 12: ConGenerico11
                "\"CON_GENERICO12\" TEXT," + // 13: ConGenerico12
                "\"CON_GENERICO13\" TEXT," + // 14: ConGenerico13
                "\"CON_GENERICO14\" TEXT," + // 15: ConGenerico14
                "\"CON_GENERICO15\" TEXT," + // 16: ConGenerico15
                "\"CON_GENERICO16\" TEXT," + // 17: ConGenerico16
                "\"CON_GENERICO17\" TEXT," + // 18: ConGenerico17
                "\"CON_GENERICO18\" TEXT," + // 19: ConGenerico18
                "\"CON_GENERICO19\" TEXT," + // 20: ConGenerico19
                "\"CON_GENERICO20\" TEXT," + // 21: ConGenerico20
                "\"CON_GENERICO21\" TEXT," + // 22: ConGenerico21
                "\"CON_GENERICO22\" TEXT," + // 23: ConGenerico22
                "\"CON_GENERICO23\" TEXT," + // 24: ConGenerico23
                "\"CON_GENERICO24\" TEXT," + // 25: ConGenerico24
                "\"CON_GENERICO25\" TEXT," + // 26: ConGenerico25
                "\"CON_GENERICO26\" TEXT," + // 27: ConGenerico26
                "\"CON_GENERICO27\" TEXT," + // 28: ConGenerico27
                "\"CON_GENERICO28\" TEXT," + // 29: ConGenerico28
                "\"CON_GENERICO29\" TEXT," + // 30: ConGenerico29
                "\"CON_GENERICO30\" TEXT," + // 31: ConGenerico30
                "\"CLI_ID\" INTEGER NOT NULL );"); // 32: CliId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CONTRATO\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Contrato entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        java.util.Date ConFecha = entity.getConFecha();
        if (ConFecha != null) {
            stmt.bindLong(2, ConFecha.getTime());
        }
 
        String ConGenerico1 = entity.getConGenerico1();
        if (ConGenerico1 != null) {
            stmt.bindString(3, ConGenerico1);
        }
 
        String ConGenerico2 = entity.getConGenerico2();
        if (ConGenerico2 != null) {
            stmt.bindString(4, ConGenerico2);
        }
 
        String ConGenerico3 = entity.getConGenerico3();
        if (ConGenerico3 != null) {
            stmt.bindString(5, ConGenerico3);
        }
 
        String ConGenerico4 = entity.getConGenerico4();
        if (ConGenerico4 != null) {
            stmt.bindString(6, ConGenerico4);
        }
 
        String ConGenerico5 = entity.getConGenerico5();
        if (ConGenerico5 != null) {
            stmt.bindString(7, ConGenerico5);
        }
 
        String ConGenerico6 = entity.getConGenerico6();
        if (ConGenerico6 != null) {
            stmt.bindString(8, ConGenerico6);
        }
 
        String ConGenerico7 = entity.getConGenerico7();
        if (ConGenerico7 != null) {
            stmt.bindString(9, ConGenerico7);
        }
 
        String ConGenerico8 = entity.getConGenerico8();
        if (ConGenerico8 != null) {
            stmt.bindString(10, ConGenerico8);
        }
 
        String ConGenerico9 = entity.getConGenerico9();
        if (ConGenerico9 != null) {
            stmt.bindString(11, ConGenerico9);
        }
 
        String ConGenerico10 = entity.getConGenerico10();
        if (ConGenerico10 != null) {
            stmt.bindString(12, ConGenerico10);
        }
 
        String ConGenerico11 = entity.getConGenerico11();
        if (ConGenerico11 != null) {
            stmt.bindString(13, ConGenerico11);
        }
 
        String ConGenerico12 = entity.getConGenerico12();
        if (ConGenerico12 != null) {
            stmt.bindString(14, ConGenerico12);
        }
 
        String ConGenerico13 = entity.getConGenerico13();
        if (ConGenerico13 != null) {
            stmt.bindString(15, ConGenerico13);
        }
 
        String ConGenerico14 = entity.getConGenerico14();
        if (ConGenerico14 != null) {
            stmt.bindString(16, ConGenerico14);
        }
 
        String ConGenerico15 = entity.getConGenerico15();
        if (ConGenerico15 != null) {
            stmt.bindString(17, ConGenerico15);
        }
 
        String ConGenerico16 = entity.getConGenerico16();
        if (ConGenerico16 != null) {
            stmt.bindString(18, ConGenerico16);
        }
 
        String ConGenerico17 = entity.getConGenerico17();
        if (ConGenerico17 != null) {
            stmt.bindString(19, ConGenerico17);
        }
 
        String ConGenerico18 = entity.getConGenerico18();
        if (ConGenerico18 != null) {
            stmt.bindString(20, ConGenerico18);
        }
 
        String ConGenerico19 = entity.getConGenerico19();
        if (ConGenerico19 != null) {
            stmt.bindString(21, ConGenerico19);
        }
 
        String ConGenerico20 = entity.getConGenerico20();
        if (ConGenerico20 != null) {
            stmt.bindString(22, ConGenerico20);
        }
 
        String ConGenerico21 = entity.getConGenerico21();
        if (ConGenerico21 != null) {
            stmt.bindString(23, ConGenerico21);
        }
 
        String ConGenerico22 = entity.getConGenerico22();
        if (ConGenerico22 != null) {
            stmt.bindString(24, ConGenerico22);
        }
 
        String ConGenerico23 = entity.getConGenerico23();
        if (ConGenerico23 != null) {
            stmt.bindString(25, ConGenerico23);
        }
 
        String ConGenerico24 = entity.getConGenerico24();
        if (ConGenerico24 != null) {
            stmt.bindString(26, ConGenerico24);
        }
 
        String ConGenerico25 = entity.getConGenerico25();
        if (ConGenerico25 != null) {
            stmt.bindString(27, ConGenerico25);
        }
 
        String ConGenerico26 = entity.getConGenerico26();
        if (ConGenerico26 != null) {
            stmt.bindString(28, ConGenerico26);
        }
 
        String ConGenerico27 = entity.getConGenerico27();
        if (ConGenerico27 != null) {
            stmt.bindString(29, ConGenerico27);
        }
 
        String ConGenerico28 = entity.getConGenerico28();
        if (ConGenerico28 != null) {
            stmt.bindString(30, ConGenerico28);
        }
 
        String ConGenerico29 = entity.getConGenerico29();
        if (ConGenerico29 != null) {
            stmt.bindString(31, ConGenerico29);
        }
 
        String ConGenerico30 = entity.getConGenerico30();
        if (ConGenerico30 != null) {
            stmt.bindString(32, ConGenerico30);
        }
        stmt.bindLong(33, entity.getCliId());
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Contrato readEntity(Cursor cursor, int offset) {
        Contrato entity = new Contrato( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : new java.util.Date(cursor.getLong(offset + 1)), // ConFecha
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // ConGenerico1
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // ConGenerico2
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // ConGenerico3
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // ConGenerico4
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // ConGenerico5
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // ConGenerico6
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // ConGenerico7
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // ConGenerico8
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // ConGenerico9
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // ConGenerico10
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // ConGenerico11
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // ConGenerico12
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // ConGenerico13
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // ConGenerico14
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // ConGenerico15
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // ConGenerico16
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // ConGenerico17
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // ConGenerico18
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // ConGenerico19
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // ConGenerico20
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // ConGenerico21
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // ConGenerico22
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // ConGenerico23
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // ConGenerico24
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // ConGenerico25
            cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27), // ConGenerico26
            cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28), // ConGenerico27
            cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29), // ConGenerico28
            cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30), // ConGenerico29
            cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31), // ConGenerico30
            cursor.getLong(offset + 32) // CliId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Contrato entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setConFecha(cursor.isNull(offset + 1) ? null : new java.util.Date(cursor.getLong(offset + 1)));
        entity.setConGenerico1(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setConGenerico2(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setConGenerico3(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setConGenerico4(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setConGenerico5(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setConGenerico6(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setConGenerico7(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setConGenerico8(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setConGenerico9(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setConGenerico10(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setConGenerico11(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setConGenerico12(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setConGenerico13(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setConGenerico14(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setConGenerico15(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setConGenerico16(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setConGenerico17(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setConGenerico18(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setConGenerico19(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setConGenerico20(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setConGenerico21(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setConGenerico22(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setConGenerico23(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setConGenerico24(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setConGenerico25(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setConGenerico26(cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27));
        entity.setConGenerico27(cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28));
        entity.setConGenerico28(cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29));
        entity.setConGenerico29(cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30));
        entity.setConGenerico30(cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31));
        entity.setCliId(cursor.getLong(offset + 32));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Contrato entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Contrato entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "cliContratos" to-many relationship of Cliente. */
    public List<Contrato> _queryCliente_CliContratos(long CliId) {
        synchronized (this) {
            if (cliente_CliContratosQuery == null) {
                QueryBuilder<Contrato> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.CliId.eq(null));
                cliente_CliContratosQuery = queryBuilder.build();
            }
        }
        Query<Contrato> query = cliente_CliContratosQuery.forCurrentThread();
        query.setParameter(0, CliId);
        return query.list();
    }

}