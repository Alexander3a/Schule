package de.alex.Studium;

import java.io.InputStream;

public interface UrlInterface {
    void connect();

    void setRequestProperty(String s, String s1);

    void setAllowUserInteraction(boolean b);

    void setDoInput(boolean b);

    void setDoOutput(boolean b);

    int getResponseCode();

    InputStream getInputStream();

    InputStream getErrorStream();

    void disconnect();
}
