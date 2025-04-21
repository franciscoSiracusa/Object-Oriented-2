package ar.edu.unlp.info.oo2.biblioteca;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.List;

public class JSONSimpleExporter extends VoorheesExporter {

    @Override
    public String exportar(List<Socio> socios) {
        JSONArray jsonArray = new JSONArray();

        socios.stream().forEach(socio -> {
            JSONObject jsonObject = new JSONObject();

            jsonObject.put("nombre", socio.getNombre());
            jsonObject.put("email", socio.getEmail());
            jsonObject.put("legajo", socio.getLegajo());

            jsonArray.add(jsonObject);
        });

        return jsonArray.toJSONString();
    }
}
