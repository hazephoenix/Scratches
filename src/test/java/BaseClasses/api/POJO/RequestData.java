package BaseClasses.api.POJO;

public class RequestData {
    public static void main(String[] args) {
        System.out.println(GET_SEVERITY_BODY);
    }

    public static final String CREATE_PATIENT_BODY ="{" +
            "  \"resourceType\": \"Bundle\"," +
            "  \"type\": \"batch\"," +
            "  \"entry\": [" +
            "    {" +
            "      \"resource\": {" +
            "      }," +
            "      ...." +
            "      \"resource\": {" +
            "      }" +
            "    }" +
            "  ]" +
            "}";



    public static final String GET_SEVERITY_BODY = "{\n" +
            "  \"resourceType\": \"Bundle\",\n" +
            "  \"type\": \"batch\",\n" +
            "  \"entry\": [\n" +
            "    {\n" +
            "      \"resource\": {\n" +
            "        \"id\": \"3a82aa9f-b7fa-43cf-b00b-d9876d5ae74e\",\n" +
            "        \"resourceType\": \"Observation\",\n" +
            "        \"status\": \"registered\",\n" +
            "        \"issued\": \"1970-01-01T00:57:04.242+0000\",\n" +
            "        \"code\": {\n" +
            "          \"coding\": [\n" +
            "            {\n" +
            "              \"code\": \"Heart_rate\",\n" +
            "              \"system\": \"ValueSet/Observation_types\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        \"performer\": [\n" +
            "          {\n" +
            "            \"reference\": \"Practitioner/80a3c463-3d68-4aa6-8020-de2a90c92962\",\n" +
            "            \"type\": \"Practitioner\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"subject\": {\n" +
            "          \"reference\": \"Patient/63c404e5-56b5-41d0-8701-d71cb75a4e54\",\n" +
            "          \"type\": \"Patient\"\n" +
            "        },\n" +
            "        \"valueInteger\": 110\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"resource\": {\n" +
            "        \"id\": \"ad501881-e445-4316-821f-f7d09a327afd\",\n" +
            "        \"resourceType\": \"Observation\",\n" +
            "        \"status\": \"registered\",\n" +
            "        \"issued\": \"1970-01-01T00:57:04.242+0000\",\n" +
            "        \"code\": {\n" +
            "          \"coding\": [\n" +
            "            {\n" +
            "              \"code\": \"Blood_pressure_upper_level\",\n" +
            "              \"system\": \"ValueSet/Observation_types\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        \"performer\": [\n" +
            "          {\n" +
            "            \"reference\": \"Practitioner/80a3c463-3d68-4aa6-8020-de2a90c92962\",\n" +
            "            \"type\": \"Practitioner\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"subject\": {\n" +
            "          \"reference\": \"Patient/63c404e5-56b5-41d0-8701-d71cb75a4e54\",\n" +
            "          \"type\": \"Patient\"\n" +
            "        },\n" +
            "        \"valueInteger\": 95\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"resource\": {\n" +
            "        \"id\": \"702dd780-3330-4fe1-88c7-19c46a20a207\",\n" +
            "        \"resourceType\": \"Observation\",\n" +
            "        \"status\": \"registered\",\n" +
            "        \"issued\": \"1970-01-01T00:57:04.242+0000\",\n" +
            "        \"code\": {\n" +
            "          \"coding\": [\n" +
            "            {\n" +
            "              \"code\": \"Degree_of_saturation_of_blood_with_oxygen\",\n" +
            "              \"system\": \"ValueSet/Observation_types\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        \"performer\": [\n" +
            "          {\n" +
            "            \"reference\": \"Practitioner/80a3c463-3d68-4aa6-8020-de2a90c92962\",\n" +
            "            \"type\": \"Practitioner\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"subject\": {\n" +
            "          \"reference\": \"Patient/63c404e5-56b5-41d0-8701-d71cb75a4e54\",\n" +
            "          \"type\": \"Patient\"\n" +
            "        },\n" +
            "        \"valueInteger\": 90\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"resource\": {\n" +
            "        \"id\": \"d80684b9-d4e2-4b10-b40a-020b8938367d\",\n" +
            "        \"resourceType\": \"Observation\",\n" +
            "        \"status\": \"registered\",\n" +
            "        \"issued\": \"1970-01-01T00:57:04.242+0000\",\n" +
            "        \"code\": {\n" +
            "          \"coding\": [\n" +
            "            {\n" +
            "              \"code\": \"Breathing_rate\",\n" +
            "              \"system\": \"ValueSet/Observation_types\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        \"performer\": [\n" +
            "          {\n" +
            "            \"reference\": \"Practitioner/80a3c463-3d68-4aa6-8020-de2a90c92962\",\n" +
            "            \"type\": \"Practitioner\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"subject\": {\n" +
            "          \"reference\": \"Patient/63c404e5-56b5-41d0-8701-d71cb75a4e54\",\n" +
            "          \"type\": \"Patient\"\n" +
            "        },\n" +
            "        \"valueInteger\": 27\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"resource\": {\n" +
            "        \"id\": \"37030497-7d8b-48ec-a5cf-5f3097c813ac\",\n" +
            "        \"resourceType\": \"Observation\",\n" +
            "        \"status\": \"registered\",\n" +
            "        \"issued\": \"1970-01-01T00:57:04.242+0000\",\n" +
            "        \"code\": {\n" +
            "          \"coding\": [\n" +
            "            {\n" +
            "              \"code\": \"Body_temperature\",\n" +
            "              \"system\": \"ValueSet/Observation_types\"\n" +
            "            }\n" +
            "          ]\n" +
            "        },\n" +
            "        \"performer\": [\n" +
            "          {\n" +
            "            \"reference\": \"Practitioner/80a3c463-3d68-4aa6-8020-de2a90c92962\",\n" +
            "            \"type\": \"Practitioner\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"subject\": {\n" +
            "          \"reference\": \"Patient/63c404e5-56b5-41d0-8701-d71cb75a4e54\",\n" +
            "          \"type\": \"Patient\"\n" +
            "        },\n" +
            "        \"valueQuantity\": {\n" +
            "          \"value\": 36.5\n" +
            "        }\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"resource\": {\n" +
            "        \"id\": \"3a7147f2-be6b-43e7-93ea-cb9da7cc549f\",\n" +
            "        \"resourceType\": \"QuestionnaireResponse\",\n" +
            "        \"status\": \"completed\",\n" +
            "        \"author\": {\n" +
            "          \"reference\": \"Practitioner/80a3c463-3d68-4aa6-8020-de2a90c92962\",\n" +
            "          \"type\": \"Practitioner\"\n" +
            "        },\n" +
            "        \"source\": {\n" +
            "          \"reference\": \"Patient/63c404e5-56b5-41d0-8701-d71cb75a4e54\",\n" +
            "          \"type\": \"Patient\"\n" +
            "        },\n" +
            "        \"questionnaire\": \"Questionnaire/Severity_criteria\",\n" +
            "        \"item\": [\n" +
            "          {\n" +
            "            \"linkId\": \"Upper_respiratory_airway\",\n" +
            "            \"text\": \"Результат осмотра верхних дыхательных путей\",\n" +
            "            \"answer\": [\n" +
            "              {\n" +
            "                \"valueCoding\": {\n" +
            "                  \"code\": \"Airways_passable\",\n" +
            "                  \"display\": \"Дыхательные пути проходимы\"\n" +
            "                }\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"linkId\": \"Consciousness_assessment\",\n" +
            "            \"text\": \"Сознание\",\n" +
            "            \"answer\": [\n" +
            "              {\n" +
            "                \"valueCoding\": {\n" +
            "                  \"code\": \"Clear_mind\",\n" +
            "                  \"display\": \"Ясное сознание\"\n" +
            "                }\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"linkId\": \"Pain_intensity_assessment\",\n" +
            "            \"text\": \"Оценка интенсивности боли (0-10)\",\n" +
            "            \"answer\": [\n" +
            "              {\n" +
            "                \"valueCoding\": {\n" +
            "                  \"code\": \"From_0_to_3\",\n" +
            "                  \"display\": \"0-3\"\n" +
            "                }\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"linkId\": \"Patient_can_stand\",\n" +
            "            \"text\": \"Опорная функция\",\n" +
            "            \"answer\": [\n" +
            "              {\n" +
            "                \"valueCoding\": {\n" +
            "                  \"code\": \"Can_stand\",\n" +
            "                  \"display\": \"Может стоять\"\n" +
            "                }\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"linkId\": \"Questionnaire/paramedic-qa-form/complaints\",\n" +
            "            \"text\": \"Жалобы пациента\",\n" +
            "            \"answer\": [\n" +
            "              {\n" +
            "                \"valueString\": \"Озноб\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"valueString\": \"Слабость\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"valueString\": \"Недомогание\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"linkId\": \"Questionnaire/paramedic-qa-form/base-syndrom\",\n" +
            "            \"text\": \"Ведущий синдром\",\n" +
            "            \"answer\": [\n" +
            "              {\n" +
            "                \"valueString\": \"Высокая температура\"\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        ]\n" +
            "      }\n" +
            "    }\n" +
            "  ],\n" +
            "  \"id\": \"7dc06391-0761-45de-ad64-2c8a814c09a2\"\n" +
            "}";
}
