package BaseClasses.api.apiTestBase.data;

public class Cabinet {

    public static final String CABINET_URI = "/queue/survey/started";

    public final static String READY ="";

    public final static String FINISHED = "{\"mode\": \"working\", \"status\": \"current\", \"resourceType\": \"ListResource\", \"id\":\"12121\",\"entry\": [{\"item\" :{\"reference\": \"Location/iii\", \"type\": \"Location\"}}]}";

    public final static String STARTED = "\n" +
            "{\"resourceType\": \"List\", \"entry\": [\n" +
            "{\"reference\": \"Location/iii\", \"type\": \"Location\"},\n" +
            "{\"reference\": \"Patient/ppp\", \"type\": \"Patient\"}\n" +
            "]}";

}
