package foo;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Enumeration;

@WebServlet("/json")
public class Json extends HttpServlet
{
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException
  {
    resp.setContentType("application/json");
    PrintWriter out = resp.getWriter();

    out.println("{");
    out.println("    \"firstName\": \"John\",");
    out.println("    \"lastName\": \"Smith\",");
    out.println("    \"age\": 25,");
    out.println("    \"address\": {");
    out.println("        \"streetAddress\": \"21 2nd Street\",");
    out.println("        \"city\": \"New York\",");
    out.println("        \"state\": \"NY\",");
    out.println("        \"postalCode\": 10021");
    out.println("    },");
    out.println("    \"phoneNumbers\": [");
    out.println("        {");
    out.println("            \"type\": \"home\",");
    out.println("            \"number\": \"212 555-1234\"");
    out.println("        },");
    out.println("        {");
    out.println("            \"type\": \"fax\",");
    out.println("            \"number\": \"646 555-4567\"");
    out.println("        }");
    out.println("    ]");
    out.println("}");

    out.close();
  }
}
