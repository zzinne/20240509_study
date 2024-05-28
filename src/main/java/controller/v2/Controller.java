package controller.v2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface Controller {

    MyView process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
}
