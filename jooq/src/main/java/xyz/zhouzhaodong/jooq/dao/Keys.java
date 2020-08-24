/*
 * This file is generated by jOOQ.
 */
package xyz.zhouzhaodong.jooq.dao;


import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import xyz.zhouzhaodong.jooq.dao.tables.Jooq;
import xyz.zhouzhaodong.jooq.dao.tables.records.JooqRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>jooq</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<JooqRecord> KEY_JOOQ_PRIMARY = UniqueKeys0.KEY_JOOQ_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<JooqRecord> KEY_JOOQ_PRIMARY = Internal.createUniqueKey(Jooq.JOOQ_, "KEY_jooq_PRIMARY", new TableField[] { Jooq.JOOQ_.ID }, true);
    }
}
