/**
 * This class is generated by jOOQ
 */
package org.graviton.database.jooq;


import javax.annotation.Generated;

import org.graviton.database.jooq.tables.Accounts;
import org.graviton.database.jooq.tables.Players;


/**
 * Convenience access to all tables in login
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table login.accounts
	 */
	public static final Accounts ACCOUNTS = org.graviton.database.jooq.tables.Accounts.ACCOUNTS;

	/**
	 * The table login.players
	 */
	public static final Players PLAYERS = org.graviton.database.jooq.tables.Players.PLAYERS;
}