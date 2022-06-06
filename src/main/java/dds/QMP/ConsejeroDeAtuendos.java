package dds.QMP;

import dds.API.AccuWeatherAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsejeroDeAtuendos {
  AccuWeatherAPI apiClima = new AccuWeatherAPI();


  Atuendo posibleAtuendo(Guardarropas guardarropas, String ubicacion) {
    List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(ubicacion);
    int temperatura = (int) condicionesClimaticas.get(0).get("Temperature");
    Guardarropas atuendosAdecuados = new Guardarropas();
    atuendosAdecuados.agregarAtuendos( guardarropas.obtenerAtuendos().stream().
        filter(atuendo -> atuendo.esCorrectoPara(temperatura)).collect(Collectors.toList()) );
    return atuendosAdecuados.obtenerAtuendos().get(0);
  }
}



