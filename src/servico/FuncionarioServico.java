/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import dao.FuncionarioDAO;
import entidades.Funcionario;
import factory.CriadorDeSessao;
import java.util.List;

/**
 *
 * @author Paulo
 */
public class FuncionarioServico {

    private FuncionarioDAO dao;

    public FuncionarioServico() {
        dao = new FuncionarioDAO(CriadorDeSessao.getSession());
    }

    public void salvar(Funcionario funcionario) {
        // Aqui  onde se deve fazer coisa relativas a regra de negocio como
        // validar CPF ou outras checagens
        dao.saveOrUpdate(funcionario);
    }

    public Funcionario login(String login, String senha) {
        return dao.login(login, senha);
    }

    public List<Funcionario> buscar(String nome) {
        return dao.listar(nome);
    }

}
