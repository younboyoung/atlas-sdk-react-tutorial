package com.react.tutorial.panel;

import com.atlassian.jira.web.action.JiraWebActionSupport;

public class TutorialWebActionSupport extends JiraWebActionSupport {

    @Override
    protected String doExecute() throws Exception {
        return super.doExecute();
    }

    @Override
    public String doDefault() throws Exception {
        return SUCCESS;
    }
}
