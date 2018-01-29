package org.didd.version;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "VERSION_BEAN".
*/
public class VersionBeanDao extends AbstractDao<VersionBean, Void> {

    public static final String TABLENAME = "VERSION_BEAN";

    /**
     * Properties of entity VersionBean.
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property AlertInterval = new Property(0, int.class, "alertInterval", false, "ALERT_INTERVAL");
        public final static Property AlertTimes = new Property(1, int.class, "alertTimes", false, "ALERT_TIMES");
        public final static Property CreateTime = new Property(2, String.class, "createTime", false, "CREATE_TIME");
        public final static Property DataState = new Property(3, int.class, "dataState", false, "DATA_STATE");
        public final static Property DownloadUrl = new Property(4, String.class, "downloadUrl", false, "DOWNLOAD_URL");
        public final static Property Id = new Property(5, String.class, "id", false, "ID");
        public final static Property LowerVersion = new Property(6, String.class, "lowerVersion", false, "LOWER_VERSION");
        public final static Property NetType = new Property(7, int.class, "netType", false, "NET_TYPE");
        public final static Property PackageName = new Property(8, String.class, "packageName", false, "PACKAGE_NAME");
        public final static Property PublishVersion = new Property(9, String.class, "publishVersion", false, "PUBLISH_VERSION");
        public final static Property StartFlag = new Property(10, int.class, "startFlag", false, "START_FLAG");
        public final static Property StartTime = new Property(11, String.class, "startTime", false, "START_TIME");
        public final static Property StopTime = new Property(12, String.class, "stopTime", false, "STOP_TIME");
        public final static Property StrategyName = new Property(13, String.class, "strategyName", false, "STRATEGY_NAME");
        public final static Property UpdateDesc = new Property(14, String.class, "updateDesc", false, "UPDATE_DESC");
        public final static Property UpgradeChennel = new Property(15, int.class, "upgradeChennel", false, "UPGRADE_CHENNEL");
        public final static Property UpgradeStrategy = new Property(16, String.class, "upgradeStrategy", false, "UPGRADE_STRATEGY");
    };


    public VersionBeanDao(DaoConfig config) {
        super(config);
    }
    
    public VersionBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"VERSION_BEAN\" (" + //
                "\"ALERT_INTERVAL\" INTEGER NOT NULL ," + // 0: alertInterval
                "\"ALERT_TIMES\" INTEGER NOT NULL ," + // 1: alertTimes
                "\"CREATE_TIME\" TEXT," + // 2: createTime
                "\"DATA_STATE\" INTEGER NOT NULL ," + // 3: dataState
                "\"DOWNLOAD_URL\" TEXT," + // 4: downloadUrl
                "\"ID\" TEXT," + // 5: id
                "\"LOWER_VERSION\" TEXT," + // 6: lowerVersion
                "\"NET_TYPE\" INTEGER NOT NULL ," + // 7: netType
                "\"PACKAGE_NAME\" TEXT," + // 8: packageName
                "\"PUBLISH_VERSION\" TEXT," + // 9: publishVersion
                "\"START_FLAG\" INTEGER NOT NULL ," + // 10: startFlag
                "\"START_TIME\" TEXT," + // 11: startTime
                "\"STOP_TIME\" TEXT," + // 12: stopTime
                "\"STRATEGY_NAME\" TEXT," + // 13: strategyName
                "\"UPDATE_DESC\" TEXT," + // 14: updateDesc
                "\"UPGRADE_CHENNEL\" INTEGER NOT NULL ," + // 15: upgradeChennel
                "\"UPGRADE_STRATEGY\" TEXT);"); // 16: upgradeStrategy
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"VERSION_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, VersionBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getAlertInterval());
        stmt.bindLong(2, entity.getAlertTimes());
 
        String createTime = entity.getCreateTime();
        if (createTime != null) {
            stmt.bindString(3, createTime);
        }
        stmt.bindLong(4, entity.getDataState());
 
        String downloadUrl = entity.getDownloadUrl();
        if (downloadUrl != null) {
            stmt.bindString(5, downloadUrl);
        }
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(6, id);
        }
 
        String lowerVersion = entity.getLowerVersion();
        if (lowerVersion != null) {
            stmt.bindString(7, lowerVersion);
        }
        stmt.bindLong(8, entity.getNetType());
 
        String packageName = entity.getPackageName();
        if (packageName != null) {
            stmt.bindString(9, packageName);
        }
 
        String publishVersion = entity.getPublishVersion();
        if (publishVersion != null) {
            stmt.bindString(10, publishVersion);
        }
        stmt.bindLong(11, entity.getStartFlag());
 
        String startTime = entity.getStartTime();
        if (startTime != null) {
            stmt.bindString(12, startTime);
        }
 
        String stopTime = entity.getStopTime();
        if (stopTime != null) {
            stmt.bindString(13, stopTime);
        }
 
        String strategyName = entity.getStrategyName();
        if (strategyName != null) {
            stmt.bindString(14, strategyName);
        }
 
        String updateDesc = entity.getUpdateDesc();
        if (updateDesc != null) {
            stmt.bindString(15, updateDesc);
        }
        stmt.bindLong(16, entity.getUpgradeChennel());
 
        String upgradeStrategy = entity.getUpgradeStrategy();
        if (upgradeStrategy != null) {
            stmt.bindString(17, upgradeStrategy);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, VersionBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getAlertInterval());
        stmt.bindLong(2, entity.getAlertTimes());
 
        String createTime = entity.getCreateTime();
        if (createTime != null) {
            stmt.bindString(3, createTime);
        }
        stmt.bindLong(4, entity.getDataState());
 
        String downloadUrl = entity.getDownloadUrl();
        if (downloadUrl != null) {
            stmt.bindString(5, downloadUrl);
        }
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(6, id);
        }
 
        String lowerVersion = entity.getLowerVersion();
        if (lowerVersion != null) {
            stmt.bindString(7, lowerVersion);
        }
        stmt.bindLong(8, entity.getNetType());
 
        String packageName = entity.getPackageName();
        if (packageName != null) {
            stmt.bindString(9, packageName);
        }
 
        String publishVersion = entity.getPublishVersion();
        if (publishVersion != null) {
            stmt.bindString(10, publishVersion);
        }
        stmt.bindLong(11, entity.getStartFlag());
 
        String startTime = entity.getStartTime();
        if (startTime != null) {
            stmt.bindString(12, startTime);
        }
 
        String stopTime = entity.getStopTime();
        if (stopTime != null) {
            stmt.bindString(13, stopTime);
        }
 
        String strategyName = entity.getStrategyName();
        if (strategyName != null) {
            stmt.bindString(14, strategyName);
        }
 
        String updateDesc = entity.getUpdateDesc();
        if (updateDesc != null) {
            stmt.bindString(15, updateDesc);
        }
        stmt.bindLong(16, entity.getUpgradeChennel());
 
        String upgradeStrategy = entity.getUpgradeStrategy();
        if (upgradeStrategy != null) {
            stmt.bindString(17, upgradeStrategy);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public VersionBean readEntity(Cursor cursor, int offset) {
        VersionBean entity = new VersionBean( //
            cursor.getInt(offset + 0), // alertInterval
            cursor.getInt(offset + 1), // alertTimes
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // createTime
            cursor.getInt(offset + 3), // dataState
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // downloadUrl
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // id
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // lowerVersion
            cursor.getInt(offset + 7), // netType
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // packageName
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // publishVersion
            cursor.getInt(offset + 10), // startFlag
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // startTime
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // stopTime
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // strategyName
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // updateDesc
            cursor.getInt(offset + 15), // upgradeChennel
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16) // upgradeStrategy
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, VersionBean entity, int offset) {
        entity.setAlertInterval(cursor.getInt(offset + 0));
        entity.setAlertTimes(cursor.getInt(offset + 1));
        entity.setCreateTime(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDataState(cursor.getInt(offset + 3));
        entity.setDownloadUrl(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setId(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setLowerVersion(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setNetType(cursor.getInt(offset + 7));
        entity.setPackageName(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setPublishVersion(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setStartFlag(cursor.getInt(offset + 10));
        entity.setStartTime(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setStopTime(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setStrategyName(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setUpdateDesc(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setUpgradeChennel(cursor.getInt(offset + 15));
        entity.setUpgradeStrategy(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(VersionBean entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(VersionBean entity) {
        return null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
