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
					<label for="pais">Pa�s:</label>
					<select id="pais" name="pais">				
					<%					
					// Pa�ses que intregam � ONU
					String[] paises = {
						"Afeganist�o",
						"�frica do Sul",
						"Alb�nia",
						"Alemanha",
						"Andorra",
						"Angola",
						"Antiga e Barbuda",
						"Ar�bia Saudita",
						"Arg�lia",
						"Argentina",
						"Arm�nia",
						"Austr�lia",
						"�ustria",
						"Azerbaij�o",
						"Bahamas",
						"Bangladexe",
						"Barbados",
						"Bar�m",
						"B�lgica",
						"Belize",
						"Benim",
						"Bielorr�ssia",
						"Bol�via",
						"B�snia e Herzegovina",
						"Botsuana",
						"Brasil",
						"Brunei",
						"Bulg�ria",
						"Burquina Faso",
						"Bur�ndi",
						"But�o",
						"Cabo Verde",
						"Camar�es",
						"Camboja",
						"Canad�",
						"Catar",
						"Cazaquist�o",
						"Chade",
						"Chile",
						"China",
						"Chipre",
						"Col�mbia",
						"Comores",
						"Congo-Brazzaville",
						"Coreia do Norte",
						"Coreia do Sul",
						"Cosovo",
						"Costa do Marfim",
						"Costa Rica",
						"Cro�cia",
						"Cuaite",
						"Cuba",
						"Dinamarca",
						"Dominica",
						"Egito",
						"Emirados �rabes Unidos",
						"Equador",
						"Eritreia",
						"Eslov�quia",
						"Eslov�nia",
						"Espanha",
						"Estado da Palestina",
						"Estados Unidos",
						"Est�nia",
						"Eti�pia",
						"Fiji",
						"Filipinas",
						"Finl�ndia",
						"Fran�a",
						"Gab�o",
						"G�mbia",
						"Gana",
						"Ge�rgia",
						"Granada",
						"Gr�cia",
						"Guatemala",
						"Guiana",
						"Guin�",
						"Guin� Equatorial",
						"Guin�-Bissau",
						"Haiti",
						"Honduras",
						"Hungria",
						"I�men",
						"Ilhas Marechal",
						"�ndia",
						"Indon�sia",
						"Ir�o",
						"Iraque",
						"Irlanda",
						"Isl�ndia",
						"Israel",
						"It�lia",
						"Jamaica",
						"Jap�o",
						"Jibuti",
						"Jord�nia",
						"Laus",
						"Lesoto",
						"Let�nia",
						"L�bano",
						"Lib�ria",
						"L�bia",
						"Listenstaine",
						"Litu�nia",
						"Luxemburgo",
						"Maced�nia",
						"Madag�scar",
						"Mal�sia",
						"Mal�ui",
						"Maldivas",
						"Mali",
						"Malta",
						"Marrocos",
						"Maur�cia",
						"Maurit�nia",
						"M�xico",
						"Mianmar",
						"Micron�sia",
						"Mo�ambique",
						"Mold�via",
						"M�naco",
						"Mong�lia",
						"Montenegro",
						"Nam�bia",
						"Nauru",
						"Nepal",
						"Nicar�gua",
						"N�ger",
						"Nig�ria",
						"Noruega",
						"Nova Zel�ndia",
						"Om�",
						"Pa�ses Baixos",
						"Palau",
						"Panam�",
						"Papua Nova Guin�",
						"Paquist�o",
						"Paraguai",
						"Peru",
						"Pol�nia",
						"Portugal",
						"Qu�nia",
						"Quirguist�o",
						"Quirib�ti",
						"Reino Unido",
						"Rep�blica Centro-Africana",
						"Rep�blica Checa",
						"Rep�blica Democr�tica do Congo",
						"Rep�blica Dominicana",
						"Rom�nia",
						"Ruanda",
						"R�ssia",
						"Salom�o",
						"Salvador",
						"Samoa",
						"Santa L�cia",
						"S�o Crist�v�o e Neves",
						"S�o Marinho",
						"S�o Tom� e Pr�ncipe",
						"S�o Vicente e Granadinas",
						"Seicheles",
						"Senegal",
						"Serra Leoa",
						"S�rvia",
						"Singapura",
						"S�ria",
						"Som�lia",
						"Sri Lanca",
						"Suazil�ndia",
						"Sud�o",
						"Sud�o do Sul",
						"Su�cia",
						"Su��a",
						"Suriname",
						"Tail�ndia",
						"Taiu�",
						"Tajiquist�o",
						"Tanz�nia",
						"Timor-Leste",
						"Togo",
						"Tonga",
						"Trindade e Tobago",
						"Tun�sia",
						"Turcomenist�o",
						"Turquia",
						"Tuvalu",
						"Ucr�nia",
						"Uganda",
						"Uruguai",
						"Usbequist�o",
						"Vanuatu",
						"Vaticano",
						"Venezuela",
						"Vietname",
						"Z�mbia",
						"Zimb�bue"
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
					<label for="descricaoMagia">Descri��o:</label><br>
					<textarea id="descricaoMagia" name="descricaoMagia" rows="6" cols="35"></textarea>
				</p>
				
				<p>
					<label for="potencia">Pot�ncia:</label>
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