package com.runesuite.client.base.access;

import com.runesuite.client.base.Accessor;
import java.lang.String;

/**
 * public class
 */
public interface XItemDefinition extends Accessor, XCacheNode {
    /**
     * public field
     */
    String[] getGroundActions();

    /**
     * public field
     */
    void setGroundActions(String[] value);

    /**
     * public field
     */
    String[] getInventoryActions();

    /**
     * public field
     */
    void setInventoryActions(String[] value);

    /**
     * public field
     */
    String getName();

    /**
     * public field
     */
    void setName(String value);
}
