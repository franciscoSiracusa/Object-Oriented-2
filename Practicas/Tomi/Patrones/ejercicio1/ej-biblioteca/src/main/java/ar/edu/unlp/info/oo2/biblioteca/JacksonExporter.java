package ar.edu.unlp.info.oo2.biblioteca;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.List;

public class JacksonExporter extends VoorheesExporter {
    private ObjectMapper mapper;

    public JacksonExporter() {
        this.mapper = new ObjectMapper();
    }

    @Override
    public String exportar(List<Socio> socios) {
        ArrayNode jsonArray = mapper.createArrayNode();

        socios.stream().forEach(socio -> jsonArray.add(this.socioToJsonNode(socio)));

        return jsonArray.toString();
    }

    private ObjectNode socioToJsonNode(Socio socio) {
        ObjectNode jsonObject = mapper.createObjectNode();

        jsonObject.put("nombre", socio.getNombre());
        jsonObject.put("email", socio.getEmail());
        jsonObject.put("legajo", socio.getLegajo());

        return jsonObject;
    }
}
