package BaseClasses.api.endpoints;

import helpers.PropUtil;

public final class DigitalHostpitalApi {


    public static final String GET_SEVERITY = PropUtil.getProperty(
            "BASE_URI", "localhost:8080") + "/reception/severity";

    public static final String GET_DIAGNOSTIC = PropUtil.getProperty(
            "BASE_URI", "localhost:8080") +  "/reception/diagnostic";

    public static final String GET_SERVICE_LIST = PropUtil.getProperty(
            "BASE_URI", "localhost:8080") +  "/reception/serviceRequests";

    public static final String POST_PATIENT_DATA  = PropUtil.getProperty(
            "BASE_URI", "localhost:8080") +  "/reception/patient";

    public static final String POST_SURVEY_STARTED = PropUtil.getProperty(
            "BASE_URI", "localhost:8080") + "/queue/survey/started";

    public static final String POST_SURVEY_FINISHED = PropUtil.getProperty(
            "BASE_URI", "localhost:8080") + "/queue/survey/finished";

    public static final String POST_OFFICE_READY = PropUtil.getProperty(
            "BASE_URI", "localhost:8080") + "/queue/survey/finished";

}
