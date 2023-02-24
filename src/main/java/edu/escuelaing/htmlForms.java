package edu.escuelaing;

import java.io.IOException;

public class htmlForms {
    public static String getInstance() throws IOException {
        return "HTTP/1.1 200 OK\r\n"
                + "Content-Type: text/html\r\n"
                + "\r\n"
                + "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "<meta charset=\"UTF-8\">\n"
                + "<title>Reflective ChatGPT</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<h1> Juan< parcial/h1>"
                + "<h2>Ingrese el nombre de la clase</h2>"
                + "<input class='box' type='Text' id='consulta' placeholder='Nombre de clase'>"
                + "<button  class='box' onclick='consultar()' class='btn'>Consultar</button>"
                + "<script>"
                + "function consultar(){"
                + "var consulta = document.getElementById('consulta').value;"
                + "</body>\n"
                + "</html>\n";
    }

    public static String consultarClase(String url) throws IOException {
        String resultado = "HTTP/1.1 200 OK\r\n"
                + "Content-Type: text/html\r\n"
                + "\r\n"
                + "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "<meta charset=\"UTF-8\">\n"
                + "<title>Reflective ChatGPT</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "</html>";
        return resultado;
    }
}