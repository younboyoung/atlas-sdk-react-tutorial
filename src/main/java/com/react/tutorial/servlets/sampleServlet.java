package com.react.tutorial.servlets;

import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.atlassian.templaterenderer.TemplateRenderer;
import com.atlassian.sal.api.websudo.WebSudoManager;
import com.atlassian.sal.api.websudo.WebSudoSessionException;

import javax.inject.Inject;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class sampleServlet extends HttpServlet {

    @ComponentImport
    private final TemplateRenderer renderer;

    @ComponentImport
    private final WebSudoManager webSudo;

    @Inject
    public sampleServlet(TemplateRenderer renderer, WebSudoManager webSudo) {
        this.renderer = renderer;
        this.webSudo = webSudo;
    }

    @com.atlassian.templaterenderer.annotations.HtmlSafe
    @com.atlassian.velocity.htmlsafe.HtmlSafe
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter w = resp.getWriter();
        try {
            webSudo.willExecuteWebSudoRequest(req);
            renderer.render("pages/tutorial-atlaskit-screen.vm", resp.getWriter());
            return;

        } catch (WebSudoSessionException wes) {
            webSudo.enforceWebSudoProtection(req, resp);
        }

    }
}
