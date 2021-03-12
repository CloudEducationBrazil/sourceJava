package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class p_map_eleicao {

	public static void main(String[] args) {
		// https://github.com/acenelio/map1-java

		System.out.println("******** System Contagem de Votos Urna ********");
		System.out.println();

		// Base de Dados da Eleição X para contagem de votos
		String path = "c:\\temp\\votos_urna.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			Map<String, Integer> contagemVotos = new HashMap<String, Integer>();

			while (line != null) {
				String[] fields = line.split(",");

				String nameCandidate = fields[0];
				int votes = Integer.parseInt(fields[1]);

				// Pesquisa o Candidato
				if (contagemVotos.containsKey(nameCandidate)) {
					// Busca o valor do atributo com base na chave(key)
					int votesCandidateAcum = contagemVotos.get(nameCandidate);
					
					contagemVotos.put(nameCandidate, votes + votesCandidateAcum);
				} else {
					contagemVotos.put(nameCandidate, votes);
				}

				line = br.readLine();
			}

			for (String key : contagemVotos.keySet()) {
				System.out.println(key + ":" + contagemVotos.get(key));
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}