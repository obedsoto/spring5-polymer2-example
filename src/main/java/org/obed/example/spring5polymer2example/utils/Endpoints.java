package org.obed.example.spring5polymer2example.utils;

/**
 * Created by obed on 3/27/18.
 */
public class Endpoints {

    private static final String API_ROOT = "/api/v1";

    public static final String NOTES = API_ROOT + "/notes";

    public static final String POST_NOTE = "";

    public static final String GET_NOTE = "/{" + Constants.NOTE_ID + "}";

    public static final String GET_ALL_NOTES = "";

    public static final String API_INFO = API_ROOT + "/info";

    private Endpoints() {
        // unnecessary
    }
}
