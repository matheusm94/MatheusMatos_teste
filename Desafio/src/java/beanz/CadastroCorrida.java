/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanz;

import classes.Corrida;
import classes.Passageiro;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Matheus
 */
public class CadastroCorrida extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        try {

            Corrida c = new Corrida(request.getParameter("nomeMotorista"), request.getParameter("nomePassageiro"), (Float.parseFloat(request.getParameter("valor"))));

            Connection con;
            Statement stm;
            String sql;
            //variável para armazenar o endereço do banco
            String url = "jdbc:mysql://localhost/desafio";
            try {
                //carregar o drive do mysql
                Class.forName("com.mysql.jdbc.Driver");
                //conexão com a base de dados aula4
                con = DriverManager.getConnection(url, "root", "root");
                //cria o objeto para executar comandos
                stm = con.createStatement();
                //instrução SQL
                sql = "INSERT INTO corrida VALUES ('"
                        + c.getNomeMotorista() + "' ,'"
                        + c.getNomePassageiro() + "', "
                        + c.getValor()+")";
                      
                //chamamos o método para gravar dados no banco
                int retorno = stm.executeUpdate(sql);
                if (retorno > 0) {
                    response.sendRedirect("CadastroCorrida.jsp?status=1a");
                } else {
                    response.sendRedirect("CadastroCorrida.jsp?status=1b");
                }
            } catch (SQLException ex) {
                response.sendRedirect("CadastroCorrida.jsp?status=1b");
            }
        } catch (Exception e) {
            response.sendRedirect("CadastroCorrida.jsp?status=1b");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastroCorrida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastroCorrida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
