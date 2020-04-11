package controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.stream.events.Characters;

import dominio.Golpe;
import dominio.Magia;
import dominio.Personagem;

@WebServlet("/CadastrarPersonagem")
public class CadastrarPersonagem extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Obetencao de dados do personagem
		String nomePer = request.getParameter("nome");
		char sexo = request.getParameter("sexo").charAt(0);
		String pais = request.getParameter("pais");
		
		//Obtencao de dados do golpe
		int socoForte = Integer.parseInt(request.getParameter("socoForte"));
		int socoFraco = Integer.parseInt(request.getParameter("socoFraco"));
		int chuteForte = Integer.parseInt(request.getParameter("chuteForte"));
		int chuteFraco = Integer.parseInt(request.getParameter("chuteFraco"));
		
		//Obtencao de dados da magia
		String nomeMagia = request.getParameter("nomeMagia");
		String descricao = request.getParameter("descricaoMagia");
		int potencia = Integer.parseInt(request.getParameter("potencia"));
		
		//Instanciando objetos
		Personagem personagem = new Personagem(nomePer, pais, sexo);
		Golpe golpe = new Golpe(chuteFraco, chuteForte, socoFraco, socoForte);
		Magia magia = new Magia(nomeMagia, descricao, potencia);
		
		//Relacionando os objetos
		personagem.setGolpe(golpe);
		personagem.setMagia(magia);
		golpe.setPersonagem(personagem);
		magia.setPersonagem(personagem);
		
		//Confirmação de cadastro do personagem
		response.sendRedirect("resposta.jsp?nome="+nomePer+"&sexo="+sexo+"&pais="+pais+"&socoForte="+socoForte+"&socoFraco="+socoFraco+"&chuteForte="+chuteForte+"&chuteFraco="+chuteFraco+"&nomeMagia="+nomeMagia+"&descricao="+descricao+"&potencia="+potencia);
	}
}