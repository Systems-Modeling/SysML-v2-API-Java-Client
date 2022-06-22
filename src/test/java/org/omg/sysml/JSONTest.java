package org.omg.sysml;

import org.junit.Test;
import org.omg.sysml.model.Commit;

import java.lang.reflect.Type;

import static org.junit.Assert.*;

public class JSONTest {
    private final JSON json = new JSON();

    /**
     * Tests JSON deserialization with a Commit provided in a string in JSON format.
     */
    @Test
    public void testJsonDeserialization() {
        String elementId = "13ca289c-b7fe-4f41-a639-1e8f9b3199d5";
        String jsonString =
                "{" +
                    "\"@id\":\"36391e9a-8ab2-4a1a-bd6f-93edd0361c5f\"," +
                    "\"@type\":\"Commit\"," +
                    "\"change\":[" +
                        "{" +
                            "\"identity\":{" +
                                "\"@id\":\"" + elementId + "\"," +
                                "\"@type\":\"DataIdentity\"" +
                            "}," +
                            "\"payload\":{" +
                                "\"@type\":\"ActionDefinition\"," +
                                "\"@id\":\"" + elementId + "\"," +
                                "\"elementId\":\"" + elementId + "\"" +
                            "}" +
                        "}" +
                    "]" +
                "}";
        Type type = Commit.class;
        Commit commit = json.deserialize(jsonString, type);
        assertEquals(elementId, commit.getChange().get(0).getPayload().get("elementId"));
    }
}
