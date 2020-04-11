<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<title>Personagem Cadastrado</title>
	</head>
	<body>
		<h1>Personagem Cadastrado</h1>
		
		<p>Foi cadastrado com sucesso o seguinte personagem</p>
		
		<!-- DADOS DO PERSONAGEM -->
		<fieldset>
			<legend>Personagem</legend>
			
			<p>
				Nome: <%=request.getParameter("nome") %><br>
				Sexo: <%=request.getParameter("sexo") %><br>
				Pais: <%=request.getParameter("pais") %><br>
			</p>
		</fieldset>
		
		<!-- DADOS DE GOLPE -->
		<fieldset>
			<legend>Golpe</legend>
			
			<p>
				Soco Forte: <%=request.getParameter("socoForte") %><br>
				Soco Fraco: <%=request.getParameter("socoFraco") %><br>
				Chute Forte: <%=request.getParameter("chuteForte") %><br>
				Chute Fraco: <%=request.getParameter("chuteFraco") %><br>
			</p>
		</fieldset>
		
		<!-- PREENCHIMENTO DE MAGIA -->
		<fieldset>
			<legend>Magia</legend>
			
			<p>
				Nome: <%=request.getParameter("nomeMagia") %><br>
				Descrição: <%=request.getParameter("descricao") %><br>
				Potência: <%=request.getParameter("potencia") %><br>
			</p>
		</fieldset>
	</body>
</html>