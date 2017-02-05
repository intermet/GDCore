/*
 * This file is generated by jOOQ.
*/
package org.graviton.database.jooq.login;


import org.graviton.database.jooq.login.tables.Accounts;
import org.graviton.database.jooq.login.tables.Players;
import org.graviton.database.jooq.login.tables.Servers;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.0"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Login extends SchemaImpl {

    /**
     * The reference instance of <code>login</code>
     */
    public static final Login LOGIN = new Login();
    private static final long serialVersionUID = 1450762595;
    /**
     * The table <code>login.accounts</code>.
     */
    public final Accounts ACCOUNTS = org.graviton.database.jooq.login.tables.Accounts.ACCOUNTS;

    /**
     * The table <code>login.players</code>.
     */
    public final Players PLAYERS = org.graviton.database.jooq.login.tables.Players.PLAYERS;

    /**
     * The table <code>login.servers</code>.
     */
    public final Servers SERVERS = org.graviton.database.jooq.login.tables.Servers.SERVERS;

    /**
     * No further instances allowed
     */
    private Login() {
        super("login", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
                Accounts.ACCOUNTS,
                Players.PLAYERS,
                Servers.SERVERS);
    }
}