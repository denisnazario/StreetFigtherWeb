<%@page import="dominio.Personagem"%>
<%@page import="dominio.Magia"%>
<%@page import="dominio.Golpe"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<title>Personagem Cadastrado</title>
	</head>
	<body>
		<%
		Golpe golpe = (Golpe)request.getAttribute("Golpe");
		Magia magia = (Magia)request.getAttribute("Magia");
		Personagem personagem = (Personagem)request.getAttribute("Personagem");
		%>
	
		<h1>Personagem Cadastrado</h1>
		
		<p>Foi cadastrado com sucesso o seguinte personagem</p>
		
		<!-- DADOS DO PERSONAGEM -->
		<fieldset>
			<legend>Personagem</legend>
			
			<p>
				Nome: <%=personagem.getNome() %><br>
				Sexo: <%=personagem.getSexo() %><br>
				Pais: <%=personagem.getPais() %><br>
			</p>
		</fieldset>
		
		<!-- DADOS DE GOLPE -->
		<fieldset>
			<legend>Golpe</legend>
			
			<p>
				Soco Forte: <%=golpe.getSocoForte() %><br>
				Soco Fraco: <%=golpe.getSocoFraco() %><br>
				Chute Forte: <%=golpe.getChuteForte() %><br>
				Chute Fraco: <%=golpe.getChuteFraco() %><br>
			</p>
		</fieldset>
		
		<!-- PREENCHIMENTO DE MAGIA -->
		<fieldset>
			<legend>Magia</legend>
			
			<p>
				Nome: <%=magia.getNome() %><br>
				Descrição: <%=magia.getDescricao() %><br>
				Potência: <%=magia.getPotencia() %><br>
			</p>
		</fieldset>
	</body>
</html>