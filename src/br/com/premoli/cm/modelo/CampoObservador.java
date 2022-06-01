package br.com.premoli.cm.modelo;

@FunctionalInterface
public interface CampoObservador {

	public void EventoOcorreu(Campo campo, CampoEvento evento);
}
