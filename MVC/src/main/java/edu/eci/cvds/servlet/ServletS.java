package edu.eci.cvds.servlet;
import edu.eci.cvds.servlet.model.Todo.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;
import java.net.MalformedURLException;
import java.util.Optional;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@WebServlet(
urlPatterns = "/getServlets"
)
public class ServletS extends HttpServlet{
    ArrayList<Todo> list_cosas= new ArrayList();
    static final long serialVersionUID = 35L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        Writer responseWriter = resp.getWriter();
        try {
            Optional <Integer> optId = Optional.ofNullable(Integer.parseInt(req.getParameter("id")));
            Integer id = optId.isPresent() ? optId.get():1;
            Todo thing = Service.getTodo(id);
            list_cosas.add(thing);
            resp.setStatus(HttpServletResponse.SC_OK);
            responseWriter.write(Service.todosToHTMLTable(list_cosas));
            responseWriter.flush();
        }catch ( NumberFormatException e){
            responseWriter.write("Requerimiento Inválido");
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }catch (FileNotFoundException e){
            responseWriter.write("No encontrado.");
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }catch (MalformedURLException e){
            responseWriter.write("error interno en el Servidor ");
        }catch (Exception e){
        responseWriter.write("requerimiento inválido");
        }
    }
} 

