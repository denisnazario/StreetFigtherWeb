<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<title>Cadastro de Personagens</title>
	</head>
	<body>
		<h1>Cadastro de Personagens</h1>
		
		<p>Realize abaixo o cadastro dos personagens e seus atributos</p>
		
		<form action="CadastrarPersonagem" method="post">
		
			<!-- PREENCHIMENTO DE PERSONAGEM -->
			<fieldset>
				<legend>Personagem</legend>
				
				<p>
					<label for="nome">Nome:</label>
					<input type="text" id="nome" name="nome" size="35" maxlength="30">
				</p>
				
				<p>
					<label>Sexo:</label>				
					<input type="radio" id="op2" name="sexo" value="F" checked>
					<label for="op2">Feminino</label>
					
					<input type="radio" id="op1" name="sexo" value="M">
					<label for="op1">Masculino</label>
				</p>
				
				<p>
					<label for="pais">País:</label>
					<select id="pais" name="pais">				
					<%					
					// Países que intregam à ONU
					String[] paises = {
						"Afeganistão",
						"África do Sul",
						"Albânia",
						"Alemanha",
						"Andorra",
						"Angola",
						"Antiga e Barbuda",
						"Arábia Saudita",
						"Argélia",
						"Argentina",
						"Arménia",
						"Austrália",
						"Áustria",
						"Azerbaijão",
						"Bahamas",
						"Bangladexe",
						"Barbados",
						"Barém",
						"Bélgica",
						"Belize",
						"Benim",
						"Bielorrússia",
						"Bolívia",
						"Bósnia e Herzegovina",
						"Botsuana",
						"Brasil",
						"Brunei",
						"Bulgária",
						"Burquina Faso",
						"Burúndi",
						"Butão",
						"Cabo Verde",
						"Camarões",
						"Camboja",
						"Canadá",
						"Catar",
						"Cazaquistão",
						"Chade",
						"Chile",
						"China",
						"Chipre",
						"Colômbia",
						"Comores",
						"Congo-Brazzaville",
						"Coreia do Norte",
						"Coreia do Sul",
						"Cosovo",
						"Costa do Marfim",
						"Costa Rica",
						"Croácia",
						"Cuaite",
						"Cuba",
						"Dinamarca",
						"Dominica",
						"Egito",
						"Emirados Árabes Unidos",
						"Equador",
						"Eritreia",
						"Eslováquia",
						"Eslovénia",
						"Espanha",
						"Estado da Palestina",
						"Estados Unidos",
						"Estónia",
						"Etiópia",
						"Fiji",
						"Filipinas",
						"Finlândia",
						"França",
						"Gabão",
						"Gâmbia",
						"Gana",
						"Geórgia",
						"Granada",
						"Grécia",
						"Guatemala",
						"Guiana",
						"Guiné",
						"Guiné Equatorial",
						"Guiné-Bissau",
						"Haiti",
						"Honduras",
						"Hungria",
						"Iémen",
						"Ilhas Marechal",
						"Índia",
						"Indonésia",
						"Irão",
						"Iraque",
						"Irlanda",
						"Islândia",
						"Israel",
						"Itália",
						"Jamaica",
						"Japão",
						"Jibuti",
						"Jordânia",
						"Laus",
						"Lesoto",
						"Letónia",
						"Líbano",
						"Libéria",
						"Líbia",
						"Listenstaine",
						"Lituânia",
						"Luxemburgo",
						"Macedónia",
						"Madagáscar",
						"Malásia",
						"Maláui",
						"Maldivas",
						"Mali",
						"Malta",
						"Marrocos",
						"Maurícia",
						"Mauritânia",
						"México",
						"Mianmar",
						"Micronésia",
						"Moçambique",
						"Moldávia",
						"Mónaco",
						"Mongólia",
						"Montenegro",
						"Namíbia",
						"Nauru",
						"Nepal",
						"Nicarágua",
						"Níger",
						"Nigéria",
						"Noruega",
						"Nova Zelândia",
						"Omã",
						"Países Baixos",
						"Palau",
						"Panamá",
						"Papua Nova Guiné",
						"Paquistão",
						"Paraguai",
						"Peru",
						"Polónia",
						"Portugal",
						"Quénia",
						"Quirguistão",
						"Quiribáti",
						"Reino Unido",
						"República Centro-Africana",
						"República Checa",
						"República Democrática do Congo",
						"República Dominicana",
						"Roménia",
						"Ruanda",
						"Rússia",
						"Salomão",
						"Salvador",
						"Samoa",
						"Santa Lúcia",
						"São Cristóvão e Neves",
						"São Marinho",
						"São Tomé e Príncipe",
						"São Vicente e Granadinas",
						"Seicheles",
						"Senegal",
						"Serra Leoa",
						"Sérvia",
						"Singapura",
						"Síria",
						"Somália",
						"Sri Lanca",
						"Suazilândia",
						"Sudão",
						"Sudão do Sul",
						"Suécia",
						"Suíça",
						"Suriname",
						"Tailândia",
						"Taiuã",
						"Tajiquistão",
						"Tanzânia",
						"Timor-Leste",
						"Togo",
						"Tonga",
						"Trindade e Tobago",
						"Tunísia",
						"Turcomenistão",
						"Turquia",
						"Tuvalu",
						"Ucrânia",
						"Uganda",
						"Uruguai",
						"Usbequistão",
						"Vanuatu",
						"Vaticano",
						"Venezuela",
						"Vietname",
						"Zâmbia",
						"Zimbábue"
					};
					%>
					
					<%
					for(String pais : paises) {
					%>					
						<option value="<%=pais %>"><%=pais %></option>
					<%
					}
					%>	
					</select>
				</p>
			</fieldset>
			
			<!-- PREENCHIMENTO DE GOLPE -->
			<fieldset>
				<legend>Golpe</legend>
				
				<p>
					<label for="socoForte">Soco Forte:</label>
					8 <input type="range" id="socoForte" name="socoForte" min="8" max="15"> 15
				</p>
				
				<p>
					<label for="socoFraco">Soco Fraco:</label>
					1 <input type="range" id="socoFraco" name="socoFraco" min="1" max="7"> 7
				</p>
				
				<p>
					<label for="chuteForte">Chute Forte:</label>
					8 <input type="range" id="chuteForte" name="chuteForte" min="8" max="15"> 15
				</p>
				
				<p>
					<label for="chuteFraco">Chute Fraco:</label>
					1 <input type="range" id="chuteFraco" name="chuteFraco" min="1" max="7"> 7
				</p>
			</fieldset>
			
			<!-- PREENCHIMENTO DE MAGIA -->
			<fieldset>
				<legend>Magia</legend>
				
				<p>
					<label for="nomeMagia">Nome:</label>
					<input type="text" id="nomeMagia" name="nomeMagia" size="35" maxlength="30">
				</p>
				
				<p>
					<label for="descricaoMagia">Descrição:</label><br>
					<textarea id="descricaoMagia" name="descricaoMagia" rows="6" cols="35"></textarea>
				</p>
				
				<p>
					<label for="potencia">Potência:</label>
					<%
					int[] potencias = {1000, 2000, 3000, 4000, 5000};
					%>
					<select id="potencia" name="potencia">
						<%
						for(int potencia: potencias) {
						%>
						<option value="<%=potencia %>"><%=potencia %></option>
						<%
						}
						%>
					</select>
				</p>
			</fieldset>
			
			<p>
				<input type="submit" value="Cadastrar Personagem">
			</p>
		</form>
	</body>
</html>