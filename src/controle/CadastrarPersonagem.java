package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoGolpe;
import dao.DaoMagia;
import dao.DaoPersonagem;
import dominio.Golpe;
import dominio.Magia;
import dominio.Personagem;

@WebServlet("/CadastrarPersonagem")
public class CadastrarPersonagem extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		//Obtencao de dados do golpe
		int socoForte = Integer.parseInt(request.getParameter("socoForte"));
		int socoFraco = Integer.parseInt(request.getParameter("socoFraco"));
		int chuteForte = Integer.parseInt(request.getParameter("chuteForte"));
		int chuteFraco = Integer.parseInt(request.getParameter("chuteFraco"));
		
		//Instanciando e persistindo Golpe
		Golpe golpe = new Golpe(chuteFraco, chuteForte, socoFraco, socoForte);
		DaoGolpe daoGolpe = new DaoGolpe();
		daoGolpe.cadastrar(golpe);
		
		//Obtencao de dados da magia
		String nomeMagia = request.getParameter("nomeMagia");
		String descricao = request.getParameter("descricaoMagia");
		int potencia = Integer.parseInt(request.getParameter("potencia"));
		
		//Instanciando e persistindo Magia
		Magia magia = new Magia(nomeMagia, descricao, potencia);
		DaoMagia daoMagia = new DaoMagia();
		daoMagia.cadastrar(magia);
		
		//Obetencao de dados do personagem
		String nomePer = request.getParameter("nome");
		char sexo = request.getParameter("sexo").charAt(0);
		String pais = request.getParameter("pais");
		
		//Instanciando e persistindo personagem
		Personagem personagem = new Personagem(nomePer, pais, sexo);
		DaoPersonagem daoPersonagem = new DaoPersonagem();
		daoPersonagem.cadastrar(personagem, daoGolpe.getId(), daoMagia.getId());
		
		//Relacionando os objetos
		personagem.setGolpe(golpe);
		personagem.setMagia(magia);
		golpe.setPersonagem(personagem);
		magia.setPersonagem(personagem);
		
		//Confirmação de cadastro do personagem
		request.setAttribute("Golpe", golpe);
		request.setAttribute("Magia", magia);		
		request.setAttribute("Personagem", personagem);
		RequestDispatcher rd = request.getRequestDispatcher("resposta.jsp");
		rd.forward(request, response);
	}
}