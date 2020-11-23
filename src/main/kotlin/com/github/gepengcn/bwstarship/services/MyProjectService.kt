package com.github.gepengcn.bwstarship.services

import com.intellij.openapi.project.Project
import com.github.gepengcn.bwstarship.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
