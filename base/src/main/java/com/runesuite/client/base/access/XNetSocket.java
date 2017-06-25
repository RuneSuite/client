package com.runesuite.client.base.access;

import com.runesuite.client.base.Accessor;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Runnable;
import java.net.Socket;

/**
 * public final class
 */
public interface XNetSocket extends Accessor, Runnable {
    /**
     *  field
     */
    InputStream getInputStream();

    /**
     *  field
     */
    void setInputStream(InputStream value);

    /**
     *  field
     */
    OutputStream getOutputStream();

    /**
     *  field
     */
    void setOutputStream(OutputStream value);

    /**
     *  field
     */
    Socket getSocket();

    /**
     *  field
     */
    void setSocket(Socket value);
}
