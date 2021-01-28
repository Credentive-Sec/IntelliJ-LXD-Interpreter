package com.github.credentivesec.intellijlxdinterpreter.services

import com.github.credentivesec.intellijlxdinterpreter.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
